package com.amazon.device.iap.internal.b;

/* loaded from: classes.dex */
public class a extends RuntimeException {
    public final String a;
    public final String b;

    public String a() {
        return this.a;
    }

    public a(String str, String str2, Throwable th) {
        super(th);
        this.a = str;
        this.b = str2;
    }
}
