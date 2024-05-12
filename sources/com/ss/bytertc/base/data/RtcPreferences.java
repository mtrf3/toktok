package com.ss.bytertc.base.data;

import X.F9J;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.realx.base.ContextUtils;
import com.ss.bytertc.engine.utils.LogUtil;
import java.io.UnsupportedEncodingException;

/* loaded from: classes33.dex */
public class RtcPreferences {
    public static volatile RtcPreferences sInstance;
    public final SharedPreferences mSharedPreferences;

    private void clearCache() {
        this.mSharedPreferences.edit().clear().commit();
    }

    public static RtcPreferences getInstance() {
        return instance(ContextUtils.getApplicationContext());
    }

    public RtcPreferences(Context context) {
        this.mSharedPreferences = F9J.LIZIZ(context, 0, "rtc_preference");
    }

    public static RtcPreferences instance(Context context) {
        if (sInstance == null) {
            synchronized (RtcPreferences.class) {
                if (context != null) {
                    if (sInstance == null) {
                        sInstance = new RtcPreferences(context);
                    }
                } else {
                    throw new RuntimeException("unable to init RtcPreferences without context");
                }
            }
        }
        return sInstance;
    }

    public void remove(String str) {
        if (str == null) {
            return;
        }
        SharedPreferences.Editor edit = this.mSharedPreferences.edit();
        edit.remove(str);
        edit.apply();
    }

    public int getInt(String str, int i) {
        return this.mSharedPreferences.getInt(str, i);
    }

    public String getString(String str, String str2) {
        String string = this.mSharedPreferences.getString(str, str2);
        try {
            string.getBytes("utf-8");
            return string;
        } catch (UnsupportedEncodingException e) {
            LogUtil.e("RtcPreferences", "Unable to get bytes use utf-8", e);
            return "";
        }
    }

    public void putInt(String str, int i) {
        SharedPreferences.Editor edit = this.mSharedPreferences.edit();
        edit.putInt(str, i);
        edit.apply();
    }

    public void putString(String str, String str2) {
        SharedPreferences.Editor edit = this.mSharedPreferences.edit();
        edit.putString(str, str2);
        edit.apply();
    }
}
