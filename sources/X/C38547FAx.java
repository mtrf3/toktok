package X;

import kotlin.jvm.internal.o;

/* renamed from: X.FAx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38547FAx {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final boolean LJII;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnyDoorAppInfo{appId='");
        LIZ.append(this.LIZ);
        LIZ.append("', userId='");
        LIZ.append((Object) this.LIZIZ);
        LIZ.append("', deviceId='");
        LIZ.append((Object) this.LIZJ);
        LIZ.append("', deviceVersion='");
        LIZ.append(this.LIZLLL);
        LIZ.append("', deviceName='");
        LIZ.append(this.LJ);
        LIZ.append("', osVersion='");
        LIZ.append((Object) this.LJFF);
        LIZ.append("', ssoEmail='");
        LIZ.append((Object) this.LJI);
        LIZ.append("', isBoe='");
        return C19U.LIZ(LIZ, this.LJII, "'}", LIZ);
    }

    public C38547FAx(String appId, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        o.LJIIIZ(appId, "appId");
        this.LIZ = appId;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = str6;
        this.LJII = z;
    }
}
