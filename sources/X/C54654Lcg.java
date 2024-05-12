package X;

import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import com.ss.android.ugc.aweme.placediscovery2.model.MapCenter;
import kotlin.jvm.internal.o;

/* renamed from: X.Lcg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54654Lcg {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final MapBounds LJFF;
    public final String LJI;
    public final MapCenter LJII;
    public final boolean LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C54654Lcg() {
        /*
            r8 = this;
            r1 = 0
            r3 = 0
            r7 = 2047(0x7ff, float:2.868E-42)
            r0 = r8
            r2 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54654Lcg.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54654Lcg)) {
            return false;
        }
        C54654Lcg c54654Lcg = (C54654Lcg) obj;
        return o.LJ(this.LIZ, c54654Lcg.LIZ) && o.LJ(this.LIZIZ, c54654Lcg.LIZIZ) && this.LIZJ == c54654Lcg.LIZJ && this.LIZLLL == c54654Lcg.LIZLLL && this.LJ == c54654Lcg.LJ && o.LJ(this.LJFF, c54654Lcg.LJFF) && o.LJ(this.LJI, c54654Lcg.LJI) && o.LJ(this.LJII, c54654Lcg.LJII) && this.LJIIIIZZ == c54654Lcg.LJIIIIZZ && o.LJ(this.LJIIIZ, c54654Lcg.LJIIIZ) && o.LJ(this.LJIIJ, c54654Lcg.LJIIJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int LJ = (((((C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31;
        MapBounds mapBounds = this.LJFF;
        int i = 0;
        if (mapBounds == null) {
            hashCode = 0;
        } else {
            hashCode = mapBounds.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str = this.LJI;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        MapCenter mapCenter = this.LJII;
        if (mapCenter == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = mapCenter.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        boolean z = this.LJIIIIZZ;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        String str2 = this.LJIIIZ;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i7 = (i6 + hashCode4) * 31;
        String str3 = this.LJIIJ;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i7 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MapRequestData(targetRegion=");
        sb.append(this.LIZ);
        sb.append(", tabCode=");
        sb.append(this.LIZIZ);
        sb.append(", page=");
        sb.append(this.LIZJ);
        sb.append(", limit=");
        sb.append(this.LIZLLL);
        sb.append(", scene=");
        sb.append(this.LJ);
        sb.append(", mapBounds=");
        sb.append(this.LJFF);
        sb.append(", nearbyTabName=");
        sb.append(this.LJI);
        sb.append(", mapCenter=");
        sb.append(this.LJII);
        sb.append(", gpsIsEncrypted=");
        sb.append(this.LJIIIIZZ);
        sb.append(", regionName=");
        sb.append(this.LJIIIZ);
        sb.append(", poiID=");
        return C07670Rv.LIZIZ(sb, this.LJIIJ, ')');
    }

    public static C54654Lcg LIZ(C54654Lcg c54654Lcg, String str, MapBounds mapBounds, String str2, MapCenter mapCenter, int i) {
        String tabCode;
        int i2;
        int i3;
        int i4;
        boolean z;
        String str3;
        MapCenter mapCenter2 = mapCenter;
        String str4 = str2;
        String targetRegion = str;
        MapBounds mapBounds2 = mapBounds;
        if ((i & 1) != 0) {
            targetRegion = c54654Lcg.LIZ;
        }
        String str5 = null;
        if ((i & 2) != 0) {
            tabCode = c54654Lcg.LIZIZ;
        } else {
            tabCode = null;
        }
        if ((i & 4) != 0) {
            i2 = c54654Lcg.LIZJ;
        } else {
            i2 = 0;
        }
        if ((i & 8) != 0) {
            i3 = c54654Lcg.LIZLLL;
        } else {
            i3 = 0;
        }
        if ((i & 16) != 0) {
            i4 = c54654Lcg.LJ;
        } else {
            i4 = 0;
        }
        if ((i & 32) != 0) {
            mapBounds2 = c54654Lcg.LJFF;
        }
        if ((i & 64) != 0) {
            str4 = c54654Lcg.LJI;
        }
        if ((i & 128) != 0) {
            mapCenter2 = c54654Lcg.LJII;
        }
        if ((i & 256) != 0) {
            z = c54654Lcg.LJIIIIZZ;
        } else {
            z = false;
        }
        if ((i & 512) != 0) {
            str3 = c54654Lcg.LJIIIZ;
        } else {
            str3 = null;
        }
        if ((i & 1024) != 0) {
            str5 = c54654Lcg.LJIIJ;
        }
        c54654Lcg.getClass();
        o.LJIIIZ(targetRegion, "targetRegion");
        o.LJIIIZ(tabCode, "tabCode");
        return new C54654Lcg(targetRegion, tabCode, i2, i3, i4, mapBounds2, str4, mapCenter2, z, str3, str5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C54654Lcg(java.lang.String r14, java.lang.String r15, int r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, int r20) {
        /*
            r13 = this;
            r6 = r16
            r2 = r14
            r8 = r17
            r11 = r18
            r12 = r19
            r1 = r20
            r0 = r1 & 1
            java.lang.String r3 = ""
            if (r0 == 0) goto L12
            r2 = r3
        L12:
            r0 = r1 & 2
            if (r0 == 0) goto L41
        L16:
            r0 = r1 & 4
            if (r0 == 0) goto L3f
            r4 = 1
        L1b:
            r0 = r1 & 8
            if (r0 == 0) goto L3d
            r5 = 40
        L21:
            r0 = r1 & 16
            if (r0 == 0) goto L26
            r6 = 0
        L26:
            r7 = 0
            r0 = r1 & 64
            if (r0 == 0) goto L2c
            r8 = r7
        L2c:
            r10 = 0
            r0 = r1 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L32
            r11 = r7
        L32:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L37
            r12 = r7
        L37:
            r1 = r13
            r9 = r7
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L3d:
            r5 = 0
            goto L21
        L3f:
            r4 = 0
            goto L1b
        L41:
            r3 = r15
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54654Lcg.<init>(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    public C54654Lcg(String targetRegion, String tabCode, int i, int i2, int i3, MapBounds mapBounds, String str, MapCenter mapCenter, boolean z, String str2, String str3) {
        o.LJIIIZ(targetRegion, "targetRegion");
        o.LJIIIZ(tabCode, "tabCode");
        this.LIZ = targetRegion;
        this.LIZIZ = tabCode;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = mapBounds;
        this.LJI = str;
        this.LJII = mapCenter;
        this.LJIIIIZZ = z;
        this.LJIIIZ = str2;
        this.LJIIJ = str3;
    }
}
