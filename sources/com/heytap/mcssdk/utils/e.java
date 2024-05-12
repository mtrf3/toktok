package com.heytap.mcssdk.utils;

import X.C16880lQ;
import X.F9J;
import X.X1D;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.heytap.mcssdk.PushService;

/* loaded from: classes28.dex */
public class e {
    public Context f;
    public SharedPreferences g;
    public Object h;

    /* loaded from: classes28.dex */
    public static class a {
        public static e a = new e();
    }

    private Context a(Context context) {
        boolean a2 = com.heytap.mcssdk.utils.a.a();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fbeVersion is ");
        LIZ.append(a2);
        d.b(X1D.LIZIZ(LIZ));
        return (!a2 || Build.VERSION.SDK_INT < 24) ? C16880lQ.LLLLL(context) : context.createDeviceProtectedStorageContext();
    }

    public static e f() {
        return a.a;
    }

    private SharedPreferences g() {
        Context context;
        SharedPreferences sharedPreferences = this.g;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        synchronized (this.h) {
            SharedPreferences sharedPreferences2 = this.g;
            if (sharedPreferences2 != null || (context = this.f) == null) {
                return sharedPreferences2;
            }
            SharedPreferences LIZIZ = F9J.LIZIZ(context, 0, "shared_msg_sdk");
            this.g = LIZIZ;
            return LIZIZ;
        }
    }

    public int a(String str, int i) {
        SharedPreferences g = g();
        return g != null ? g.getInt(str, i) : i;
    }

    public long a(String str, long j) {
        SharedPreferences g = g();
        return g != null ? g.getLong(str, j) : j;
    }

    public void a(String str) {
        SharedPreferences g = g();
        if (g != null) {
            g.edit().putString("lastUploadInfoUniqueID", str).commit();
        }
    }

    public void a(boolean z) {
        SharedPreferences g = g();
        if (g != null) {
            g.edit().putBoolean("hasDefaultChannelCreated", z).commit();
        }
    }

    public boolean a() {
        SharedPreferences g = g();
        if (g != null) {
            return g.getBoolean("hasDefaultChannelCreated", false);
        }
        return false;
    }

    public void b() {
        SharedPreferences g = g();
        if (g != null) {
            g.edit().putString("lastUpLoadInfoSDKVersionName", "3.0.0").commit();
        }
    }

    public void b(String str) {
        SharedPreferences g = g();
        if (g != null) {
            g.edit().putString("decryptTag", str).commit();
        }
    }

    public int c(String str) {
        SharedPreferences g = g();
        if (g != null) {
            return g.getInt(str, 0);
        }
        return 0;
    }

    public String c() {
        SharedPreferences g = g();
        return g != null ? g.getString("lastUploadInfoUniqueID", "") : "";
    }

    public long d(String str) {
        SharedPreferences g = g();
        return g != null ? g.getLong(str, com.heytap.mcssdk.constant.a.b.longValue()) : com.heytap.mcssdk.constant.a.b.longValue();
    }

    public String d() {
        SharedPreferences g = g();
        return g != null ? g.getString("lastUpLoadInfoSDKVersionName", "") : "";
    }

    public String e() {
        SharedPreferences g = g();
        return g != null ? g.getString("decryptTag", "DES") : "DES";
    }

    public e() {
        this.h = new Object();
        Context context = PushService.a.a.getContext();
        if (context != null) {
            this.f = a(context);
        }
        Context context2 = this.f;
        if (context2 != null) {
            this.g = F9J.LIZIZ(context2, 0, "shared_msg_sdk");
        }
    }

    public void b(String str, int i) {
        SharedPreferences g = g();
        if (g != null) {
            SharedPreferences.Editor edit = g.edit();
            edit.putInt(str, i);
            edit.apply();
        }
    }

    public void b(String str, long j) {
        SharedPreferences g = g();
        if (g != null) {
            SharedPreferences.Editor edit = g.edit();
            edit.putLong(str, j);
            edit.apply();
        }
    }
}
