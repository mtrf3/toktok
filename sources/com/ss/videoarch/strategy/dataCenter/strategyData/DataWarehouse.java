package com.ss.videoarch.strategy.dataCenter.strategyData;

import X.C63891P5r;
import X.F9J;
import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes12.dex */
public class DataWarehouse {
    public static SharedPreferences sharedPreferences;
    public Context mContext;

    public static DataWarehouse getInstance() {
        return C63891P5r.LIZ;
    }

    public static void init(Context context) {
        getInstance().mContext = context;
    }

    public String ReadFromDB(String str, String str2) {
        Context context = this.mContext;
        if (context == null) {
            return "";
        }
        if (sharedPreferences == null) {
            sharedPreferences = F9J.LIZIZ(context, 0, str);
        }
        return sharedPreferences.getString(str2, "");
    }

    public void WriteToDB(String str, String str2, String str3) {
        Context context = this.mContext;
        if (context == null) {
            return;
        }
        if (sharedPreferences == null) {
            sharedPreferences = F9J.LIZIZ(context, 0, str);
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(str2, str3);
        edit.apply();
    }
}
