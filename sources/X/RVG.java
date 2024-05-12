package X;

import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RVG {
    public final Image LIZ;
    public final Image LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Integer LJFF;
    public final Long LJI;

    /* JADX WARN: Multi-variable type inference failed */
    public RVG() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RVG)) {
            return false;
        }
        RVG rvg = (RVG) obj;
        return o.LJ(this.LIZ, rvg.LIZ) && o.LJ(this.LIZIZ, rvg.LIZIZ) && o.LJ(this.LIZJ, rvg.LIZJ) && o.LJ(this.LIZLLL, rvg.LIZLLL) && o.LJ(this.LJ, rvg.LJ) && o.LJ(this.LJFF, rvg.LJFF) && o.LJ(this.LJI, rvg.LJI);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        Image image = this.LIZ;
        int i = 0;
        if (image == null) {
            hashCode = 0;
        } else {
            hashCode = image.hashCode();
        }
        int i2 = hashCode * 31;
        Image image2 = this.LIZIZ;
        if (image2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = image2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str = this.LIZJ;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str2 = this.LIZLLL;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LJ, (i4 + hashCode4) * 31, 31);
        Integer num = this.LJFF;
        if (num == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num.hashCode();
        }
        int i5 = (LJ + hashCode5) * 31;
        Long l = this.LJI;
        if (l != null) {
            i = l.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PromotionActivityInfoModel(bgImage=");
        LIZ.append(this.LIZ);
        LIZ.append(", darkModeImage=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", title=");
        LIZ.append(this.LIZJ);
        LIZ.append(", desc=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", daInfo=");
        LIZ.append(this.LJ);
        LIZ.append(", type=");
        LIZ.append(this.LJFF);
        LIZ.append(", startCountDownTime=");
        return JBR.LJ(LIZ, this.LJI, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ RVG(java.lang.Integer r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            r9 = this;
            r3 = r11
            r2 = r10
            r5 = 0
            r0 = r13 & 4
            java.lang.String r4 = ""
            if (r0 == 0) goto La
            r3 = r4
        La:
            r0 = r13 & 8
            if (r0 == 0) goto L31
        Le:
            r0 = r13 & 16
            if (r0 == 0) goto L2f
            java.lang.String r8 = "{}"
        L14:
            r0 = r13 & 32
            if (r0 == 0) goto L1d
            r0 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L1d:
            r0 = r13 & 64
            if (r0 == 0) goto L2d
            r0 = 0
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
        L27:
            r1 = r9
            r6 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        L2d:
            r7 = r5
            goto L27
        L2f:
            r8 = r5
            goto L14
        L31:
            r4 = r12
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RVG.<init>(java.lang.Integer, java.lang.String, java.lang.String, int):void");
    }

    public RVG(Integer num, String str, String str2, Image image, Image image2, Long l, String daInfo) {
        o.LJIIIZ(daInfo, "daInfo");
        this.LIZ = image;
        this.LIZIZ = image2;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = daInfo;
        this.LJFF = num;
        this.LJI = l;
    }
}
