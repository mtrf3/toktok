package X;

import defpackage.q;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.2xr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75552xr {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Class<Object>[] LJ;
    public final Class<Object>[] LJFF;
    public final String[] LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75552xr)) {
            return false;
        }
        C75552xr c75552xr = (C75552xr) obj;
        return o.LJ(this.LIZ, c75552xr.LIZ) && o.LJ(this.LIZIZ, c75552xr.LIZIZ) && o.LJ(this.LIZJ, c75552xr.LIZJ) && o.LJ(this.LIZLLL, c75552xr.LIZLLL) && o.LJ(this.LJ, c75552xr.LJ) && o.LJ(this.LJFF, c75552xr.LJFF) && o.LJ(this.LJI, c75552xr.LJI);
    }

    public final int hashCode() {
        return ((((C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31), 31) + Arrays.hashCode(this.LJ)) * 31) + Arrays.hashCode(this.LJFF)) * 31) + Arrays.hashCode(this.LJI);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AppLinkParseParams(patternUrl=");
        LIZ.append(this.LIZ);
        LIZ.append(", scene=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", urlSample=");
        LIZ.append(this.LIZJ);
        LIZ.append(", owner=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", businesses=");
        LIZ.append(Arrays.toString(this.LJ));
        LIZ.append(", modules=");
        LIZ.append(Arrays.toString(this.LJFF));
        LIZ.append(", routeUri=");
        return q.LIZIZ(LIZ, Arrays.toString(this.LJI), ')', LIZ);
    }

    public C75552xr(String str, String str2, String str3, String str4, Class<Object>[] clsArr, Class<Object>[] clsArr2, String[] strArr) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = clsArr;
        this.LJFF = clsArr2;
        this.LJI = strArr;
    }
}
