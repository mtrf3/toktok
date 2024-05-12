package X;

import defpackage.i0;

/* loaded from: classes9.dex */
public final class J81 extends Exception {
    public final String url;

    public J81(String str, Throwable th) {
        super(i0.LJFF("fetch failed ", str), th);
        this.url = str;
    }
}
