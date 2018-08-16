package com.quantongfu.adapter.online;

import com.quantongfu.adapter.entity.CommonEntity;
import com.quantongfu.adapter.utils.HttpSendCenter;
import okhttp3.Callback;
import org.json.JSONObject;

/**
 * Created by zhaofang on 2018/8/14.
 */
public class DeleteDeviceOpe extends BasicOpe{

    public DeleteDeviceOpe(String apiKey) {
        super(apiKey);
    }


    @Override
    public JSONObject operation(CommonEntity commonEntity, JSONObject body) {
        return HttpSendCenter.delete(this.apiKey, commonEntity.toUrl());

    }

    @Override
    public void operation(CommonEntity commonEntity, JSONObject body, Callback callback) {
        HttpSendCenter.deleteAsync(this.apiKey, commonEntity.toUrl(),callback);

    }
}
