package com.diabin.fastec.example;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.diabin.latte.app.delegates.LatteDelegate;
import com.diabin.latte.app.net.RestClient;
import com.diabin.latte.app.net.callback.IError;
import com.diabin.latte.app.net.callback.IFailure;
import com.diabin.latte.app.net.callback.ISuccess;

/**
 * Created by tan on 2017/10/10.
 */

public class ExampleDelegate extends LatteDelegate{
    @Override
    public Object setLayout() {
        return R.layout.delegate_example;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {
        testRestClient();
    }
    private void testRestClient(){
        RestClient.builder().url("http://news.baidu.com/")
                .loader(getContext())
                .success(new ISuccess() {
                    @Override
                    public void onSuccess(String response) {
                        Toast.makeText(getContext(),response,Toast.LENGTH_SHORT).show();
                    }
                })
                .failure(new IFailure() {
                    @Override
                    public void onFailure() {

                    }
                }).error(new IError() {
                    @Override
                    public void onError(int code, String msg) {

                    }
                }).build()
                .get();
    }
}
