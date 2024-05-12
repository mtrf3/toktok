package com.bytedance.ugc.glue;

/* loaded from: classes2.dex */
public class UGCLog {
    public static UGCLog instance = new UGCLog();

    public void dImpl(String str, String str2) {
    }

    public void eImpl(String str, String str2) {
    }

    public void eImpl(String str, String str2, Throwable th) {
    }

    public void iImpl(String str, String str2) {
    }

    public static UGCLog getInstance() {
        return instance;
    }

    public final void register() {
        instance = this;
    }

    public static void d(String str, String str2) {
        getInstance().dImpl(str, str2);
    }

    public static void e(String str, String str2) {
        getInstance().eImpl(str, str2);
    }

    public static void i(String str, String str2) {
        getInstance().iImpl(str, str2);
    }

    public static void e(String str, String str2, Throwable th) {
        getInstance().eImpl(str, str2, th);
    }
}
