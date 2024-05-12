package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.o;

/* renamed from: X.7fi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191707fi implements InterfaceC191727fk {
    public final String LIZ;
    public final Bitmap LIZIZ;
    public String LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public C191717fj LJFF;
    public String LJI;

    public C191707fi() {
        this(null, 127);
    }

    @Override // X.InterfaceC191727fk
    public final OSZ<Integer, Integer> LIZ() {
        return new OSZ<>(0, 0);
    }

    @Override // X.InterfaceC191727fk
    public final void LIZIZ() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C191707fi)) {
            return false;
        }
        C191707fi c191707fi = (C191707fi) obj;
        return o.LJ(this.LIZ, c191707fi.LIZ) && o.LJ(this.LIZIZ, c191707fi.LIZIZ) && o.LJ(this.LIZJ, c191707fi.LIZJ) && this.LIZLLL == c191707fi.LIZLLL && this.LJ == c191707fi.LJ && o.LJ(this.LJFF, c191707fi.LJFF) && o.LJ(this.LJI, c191707fi.LJI);
    }

    @Override // X.InterfaceC191727fk
    public final Float LIZJ() {
        float f;
        if (this.LIZLLL) {
            f = Float.MAX_VALUE;
        } else {
            f = this.LJ;
        }
        return Float.valueOf(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LIZ.hashCode() * 31;
        Bitmap bitmap = this.LIZIZ;
        int i = 0;
        if (bitmap == null) {
            hashCode = 0;
        } else {
            hashCode = bitmap.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LIZJ, (hashCode2 + hashCode) * 31, 31);
        boolean z = this.LIZLLL;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int hashCode3 = (this.LJFF.hashCode() + ((((LJ + i2) * 31) + this.LJ) * 31)) * 31;
        String str = this.LJI;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[DiscoveryMapMarker] poiId=");
        LIZ.append(this.LIZ);
        LIZ.append(",title=");
        LIZ.append(this.LIZJ);
        LIZ.append(",isHighLight=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", imgBitmap=");
        LIZ.append(this.LIZIZ);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC191727fk
    public final C191717fj getPosition() {
        return this.LJFF;
    }

    @Override // X.InterfaceC191727fk
    public final String getTitle() {
        return this.LIZJ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C191707fi(java.lang.String r14, int r15) {
        /*
            r13 = this;
            r1 = r14
            r0 = r15 & 1
            java.lang.String r3 = ""
            if (r0 == 0) goto L8
            r1 = r3
        L8:
            r2 = 0
            r0 = r15 & 4
            if (r0 == 0) goto L25
        Ld:
            r4 = 0
            r0 = r15 & 32
            if (r0 == 0) goto L23
            X.7fj r6 = new X.7fj
            r7 = 0
            r11 = 3
            r9 = r7
            r12 = r2
            r6.<init>(r7, r9, r11, r12)
        L1c:
            r0 = r13
            r5 = r4
            r7 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        L23:
            r6 = r2
            goto L1c
        L25:
            r3 = r2
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191707fi.<init>(java.lang.String, int):void");
    }

    public static C191707fi LIZLLL(C191707fi c191707fi, Bitmap bitmap, boolean z, int i) {
        String poiId;
        String titleStr;
        int i2;
        C191717fj latLng;
        boolean z2 = z;
        Bitmap bitmap2 = bitmap;
        String str = null;
        if ((i & 1) != 0) {
            poiId = c191707fi.LIZ;
        } else {
            poiId = null;
        }
        if ((i & 2) != 0) {
            bitmap2 = c191707fi.LIZIZ;
        }
        if ((i & 4) != 0) {
            titleStr = c191707fi.LIZJ;
        } else {
            titleStr = null;
        }
        if ((i & 8) != 0) {
            z2 = c191707fi.LIZLLL;
        }
        if ((i & 16) != 0) {
            i2 = c191707fi.LJ;
        } else {
            i2 = 0;
        }
        if ((i & 32) != 0) {
            latLng = c191707fi.LJFF;
        } else {
            latLng = null;
        }
        if ((i & 64) != 0) {
            str = c191707fi.LJI;
        }
        o.LJIIIZ(poiId, "poiId");
        o.LJIIIZ(titleStr, "titleStr");
        o.LJIIIZ(latLng, "latLng");
        return new C191707fi(poiId, bitmap2, titleStr, z2, i2, latLng, str);
    }

    public C191707fi(String poiId, Bitmap bitmap, String titleStr, boolean z, int i, C191717fj latLng, String str) {
        o.LJIIIZ(poiId, "poiId");
        o.LJIIIZ(titleStr, "titleStr");
        o.LJIIIZ(latLng, "latLng");
        this.LIZ = poiId;
        this.LIZIZ = bitmap;
        this.LIZJ = titleStr;
        this.LIZLLL = z;
        this.LJ = i;
        this.LJFF = latLng;
        this.LJI = str;
    }
}
