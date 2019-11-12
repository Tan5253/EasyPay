package com.tan.payutils.base;

import android.app.Activity;

import com.tan.payutils.callback.IPayCallback;

public interface IPayStrategy <T extends IPayInfo> {
    void pay(Activity activity, T payInfo, IPayCallback payCallback);
}
