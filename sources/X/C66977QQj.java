package X;

import defpackage.b0;

/* renamed from: X.QQj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66977QQj {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{updateTime=");
        LIZ.append(this.LIZ);
        LIZ.append(", deviceId='");
        Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", versionCode='");
        Q89.LIZIZ(LIZ, this.LIZJ, '\'', ", token='");
        Q89.LIZIZ(LIZ, this.LIZLLL, '\'', ", type=");
        return b0.LIZJ(LIZ, this.LJ, '}', LIZ);
    }

    public C66977QQj(int i, String str, String str2, long j, String str3) {
        this.LJ = i;
        this.LIZLLL = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZ = j;
    }
}
