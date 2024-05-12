package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.NPk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59308NPk {
    public Integer LIZ = null;
    public Bundle LIZIZ = null;
    public String LIZJ = null;
    public boolean LIZLLL = false;
    public String LJ = null;
    public String LJFF = null;
    public boolean LJI = false;
    public final boolean LJII = false;
    public boolean LJIIIIZZ = false;
    public String LJIIIZ = null;
    public boolean LJIIJ = false;
    public boolean LJIIJJI = false;
    public String LJIIL = "";
    public boolean LJIILIIL = false;
    public String LJIILJJIL = null;
    public int LJIILL = 0;
    public boolean LJIILLIIL = false;
    public boolean LJIIZILJ = true;
    public String LJIJ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59308NPk)) {
            return false;
        }
        C59308NPk c59308NPk = (C59308NPk) obj;
        return o.LJ(this.LIZ, c59308NPk.LIZ) && o.LJ(this.LIZIZ, c59308NPk.LIZIZ) && o.LJ(this.LIZJ, c59308NPk.LIZJ) && this.LIZLLL == c59308NPk.LIZLLL && o.LJ(this.LJ, c59308NPk.LJ) && o.LJ(this.LJFF, c59308NPk.LJFF) && this.LJI == c59308NPk.LJI && this.LJII == c59308NPk.LJII && this.LJIIIIZZ == c59308NPk.LJIIIIZZ && o.LJ(this.LJIIIZ, c59308NPk.LJIIIZ) && this.LJIIJ == c59308NPk.LJIIJ && this.LJIIJJI == c59308NPk.LJIIJJI && o.LJ(this.LJIIL, c59308NPk.LJIIL) && this.LJIILIIL == c59308NPk.LJIILIIL && o.LJ(this.LJIILJJIL, c59308NPk.LJIILJJIL) && this.LJIILL == c59308NPk.LJIILL && this.LJIILLIIL == c59308NPk.LJIILLIIL && this.LJIIZILJ == c59308NPk.LJIIZILJ && o.LJ(this.LJIJ, c59308NPk.LJIJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        Integer num = this.LIZ;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        Bundle bundle = this.LIZIZ;
        if (bundle == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bundle.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str = this.LIZJ;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        boolean z = this.LIZLLL;
        int i5 = 1;
        int i6 = z;
        if (z != 0) {
            i6 = 1;
        }
        int i7 = (i4 + i6) * 31;
        String str2 = this.LJ;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i8 = (i7 + hashCode4) * 31;
        String str3 = this.LJFF;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i9 = (i8 + hashCode5) * 31;
        boolean z2 = this.LJI;
        int i10 = z2;
        if (z2 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        boolean z3 = this.LJII;
        int i12 = z3;
        if (z3 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z4 = this.LJIIIIZZ;
        int i14 = z4;
        if (z4 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        String str4 = this.LJIIIZ;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        boolean z5 = this.LJIIJ;
        int i17 = z5;
        if (z5 != 0) {
            i17 = 1;
        }
        int i18 = (i16 + i17) * 31;
        boolean z6 = this.LJIIJJI;
        int i19 = z6;
        if (z6 != 0) {
            i19 = 1;
        }
        int LJ = C79062V1e.LJ(this.LJIIL, (i18 + i19) * 31, 31);
        boolean z7 = this.LJIILIIL;
        int i20 = z7;
        if (z7 != 0) {
            i20 = 1;
        }
        int i21 = (LJ + i20) * 31;
        String str5 = this.LJIILJJIL;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i22 = (((i21 + hashCode7) * 31) + this.LJIILL) * 31;
        boolean z8 = this.LJIILLIIL;
        int i23 = z8;
        if (z8 != 0) {
            i23 = 1;
        }
        int i24 = (i22 + i23) * 31;
        if (!this.LJIIZILJ) {
            i5 = 0;
        }
        int i25 = (i24 + i5) * 31;
        String str6 = this.LJIJ;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return i25 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseInfo(platform=");
        sb.append(this.LIZ);
        sb.append(", rawBundle=");
        sb.append(this.LIZIZ);
        sb.append(", url=");
        sb.append(this.LIZJ);
        sb.append(", safeTemplate=");
        sb.append(this.LIZLLL);
        sb.append(", groupId=");
        sb.append(this.LJ);
        sb.append(", enterFrom=");
        sb.append(this.LJFF);
        sb.append(", autoPlayAudio=");
        sb.append(this.LJI);
        sb.append(", forbidJump=");
        sb.append(this.LJII);
        sb.append(", fromNotification=");
        sb.append(this.LJIIIIZZ);
        sb.append(", awemeId=");
        sb.append(this.LJIIIZ);
        sb.append(", controlRequestUrl=");
        sb.append(this.LJIIJ);
        sb.append(", noHardware=");
        sb.append(this.LJIIJJI);
        sb.append(", ownerId=");
        sb.append(this.LJIIL);
        sb.append(", hideSystemVideoPoster=");
        sb.append(this.LJIILIIL);
        sb.append(", reportType=");
        sb.append(this.LJIILJJIL);
        sb.append(", pageDepthOfReportShow=");
        sb.append(this.LJIILL);
        sb.append(", useSpark=");
        sb.append(this.LJIILLIIL);
        sb.append(", isFirstCheckWebView=");
        sb.append(this.LJIIZILJ);
        sb.append(", reportObjectId=");
        return C07670Rv.LIZIZ(sb, this.LJIJ, ')');
    }
}
