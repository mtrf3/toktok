package X;

import com.ss.android.ugc.aweme.experiment.EditEffectPanelSettings;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6dc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164926dc {
    public final C125974wz LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final float LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final InterfaceC65784Pro<Boolean> LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public final int LJIILL;
    public final boolean LJIILLIIL;
    public final boolean LJIIZILJ;
    public final boolean LJIJ;
    public final int LJIJI;
    public final int LJIJJ;
    public final int LJIJJLI;
    public final int LJIL;
    public final float LJJ;
    public final int LJJI;
    public final int LJJIFFI;
    public final int LJJII;
    public final boolean LJJIII;
    public final boolean LJJIIJ;

    public C164926dc() {
        this(null, false, false, false, 0.0f, false, false, null, false, false, false, false, false, false, 0, false, false, 536870911);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C164926dc)) {
            return false;
        }
        C164926dc c164926dc = (C164926dc) obj;
        return o.LJ(this.LIZ, c164926dc.LIZ) && this.LIZIZ == c164926dc.LIZIZ && this.LIZJ == c164926dc.LIZJ && this.LIZLLL == c164926dc.LIZLLL && this.LJ == c164926dc.LJ && Float.compare(this.LJFF, c164926dc.LJFF) == 0 && this.LJI == c164926dc.LJI && this.LJII == c164926dc.LJII && this.LJIIIIZZ == c164926dc.LJIIIIZZ && this.LJIIIZ == c164926dc.LJIIIZ && this.LJIIJ == c164926dc.LJIIJ && o.LJ(this.LJIIJJI, c164926dc.LJIIJJI) && this.LJIIL == c164926dc.LJIIL && this.LJIILIIL == c164926dc.LJIILIIL && this.LJIILJJIL == c164926dc.LJIILJJIL && this.LJIILL == c164926dc.LJIILL && this.LJIILLIIL == c164926dc.LJIILLIIL && this.LJIIZILJ == c164926dc.LJIIZILJ && this.LJIJ == c164926dc.LJIJ && this.LJIJI == c164926dc.LJIJI && this.LJIJJ == c164926dc.LJIJJ && this.LJIJJLI == c164926dc.LJIJJLI && this.LJIL == c164926dc.LJIL && Float.compare(this.LJJ, c164926dc.LJJ) == 0 && this.LJJI == c164926dc.LJJI && this.LJJIFFI == c164926dc.LJJIFFI && this.LJJII == c164926dc.LJJII && this.LJJIII == c164926dc.LJJIII && this.LJJIIJ == c164926dc.LJJIIJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        C125974wz c125974wz = this.LIZ;
        if (c125974wz == null) {
            hashCode = 0;
        } else {
            hashCode = c125974wz.hashCode();
        }
        int i = hashCode * 31;
        boolean z = this.LIZIZ;
        int i2 = 1;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (i + i3) * 31;
        boolean z2 = this.LIZJ;
        int i5 = z2;
        if (z2 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z3 = this.LIZLLL;
        int i7 = z3;
        if (z3 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z4 = this.LJ;
        int i9 = z4;
        if (z4 != 0) {
            i9 = 1;
        }
        int LIZIZ = C47959Irz.LIZIZ(this.LJFF, (i8 + i9) * 31, 31);
        boolean z5 = this.LJI;
        int i10 = z5;
        if (z5 != 0) {
            i10 = 1;
        }
        int i11 = (LIZIZ + i10) * 31;
        boolean z6 = this.LJII;
        int i12 = z6;
        if (z6 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z7 = this.LJIIIIZZ;
        int i14 = z7;
        if (z7 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z8 = this.LJIIIZ;
        int i16 = z8;
        if (z8 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        boolean z9 = this.LJIIJ;
        int i18 = z9;
        if (z9 != 0) {
            i18 = 1;
        }
        int LIZLLL = C1JX.LIZLLL(this.LJIIJJI, (i17 + i18) * 31, 31);
        boolean z10 = this.LJIIL;
        int i19 = z10;
        if (z10 != 0) {
            i19 = 1;
        }
        int i20 = (LIZLLL + i19) * 31;
        boolean z11 = this.LJIILIIL;
        int i21 = z11;
        if (z11 != 0) {
            i21 = 1;
        }
        int i22 = (i20 + i21) * 31;
        boolean z12 = this.LJIILJJIL;
        int i23 = z12;
        if (z12 != 0) {
            i23 = 1;
        }
        int i24 = (((i22 + i23) * 31) + this.LJIILL) * 31;
        boolean z13 = this.LJIILLIIL;
        int i25 = z13;
        if (z13 != 0) {
            i25 = 1;
        }
        int i26 = (i24 + i25) * 31;
        boolean z14 = this.LJIIZILJ;
        int i27 = z14;
        if (z14 != 0) {
            i27 = 1;
        }
        int i28 = (i26 + i27) * 31;
        boolean z15 = this.LJIJ;
        int i29 = z15;
        if (z15 != 0) {
            i29 = 1;
        }
        int LIZIZ2 = (((((C47959Irz.LIZIZ(this.LJJ, (((((((((i28 + i29) * 31) + this.LJIJI) * 31) + this.LJIJJ) * 31) + this.LJIJJLI) * 31) + this.LJIL) * 31, 31) + this.LJJI) * 31) + this.LJJIFFI) * 31) + this.LJJII) * 31;
        boolean z16 = this.LJJIII;
        int i30 = z16;
        if (z16 != 0) {
            i30 = 1;
        }
        int i31 = (LIZIZ2 + i30) * 31;
        if (!this.LJJIIJ) {
            i2 = 0;
        }
        return i31 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditEffectPanelConfig(editorProEffectState=");
        sb.append(this.LIZ);
        sb.append(", enableMultiSelect=");
        sb.append(this.LIZIZ);
        sb.append(", enableLongPress=");
        sb.append(this.LIZJ);
        sb.append(", enableShowLoading=");
        sb.append(this.LIZLLL);
        sb.append(", enableSingleImageEffect=");
        sb.append(this.LJ);
        sb.append(", tabHeight=");
        sb.append(this.LJFF);
        sb.append(", showRemoveBtn=");
        sb.append(this.LJI);
        sb.append(", showCloseBtn=");
        sb.append(this.LJII);
        sb.append(", showTip=");
        sb.append(this.LJIIIIZZ);
        sb.append(", forceDisableTip=");
        sb.append(this.LJIIIZ);
        sb.append(", showNoneTimeEffect=");
        sb.append(this.LJIIJ);
        sb.append(", showTimeTab=");
        sb.append(this.LJIIJJI);
        sb.append(", showMotionTab=");
        sb.append(this.LJIIL);
        sb.append(", showStickerTab=");
        sb.append(this.LJIILIIL);
        sb.append(", showGotoCapCutEffect=");
        sb.append(this.LJIILJJIL);
        sb.append(", columnNum=");
        sb.append(this.LJIILL);
        sb.append(", imageShapeRect=");
        sb.append(this.LJIILLIIL);
        sb.append(", clickWithScale=");
        sb.append(this.LJIIZILJ);
        sb.append(", enableSelectBorder=");
        sb.append(this.LJIJ);
        sb.append(", borderColor=");
        sb.append(this.LJIJI);
        sb.append(", offscreenPageLimit=");
        sb.append(this.LJIJJ);
        sb.append(", autoDownLoadSize=");
        sb.append(this.LJIJJLI);
        sb.append(", preDownloadSize=");
        sb.append(this.LJIL);
        sb.append(", panelHeightRate=");
        sb.append(this.LJJ);
        sb.append(", itemSpacingHorizon=");
        sb.append(this.LJJI);
        sb.append(", itemWidth=");
        sb.append(this.LJJIFFI);
        sb.append(", maxRecycledViews=");
        sb.append(this.LJJII);
        sb.append(", hideTrickTab=");
        sb.append(this.LJJIII);
        sb.append(", enableLongPressIntercept=");
        return C08880Wm.LIZJ(sb, this.LJJIIJ, ')');
    }

    public C164926dc(C125974wz c125974wz, boolean z, boolean z2, boolean z3, float f, boolean z4, boolean z5, InterfaceC65784Pro interfaceC65784Pro, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i, boolean z12, boolean z13, int i2) {
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        boolean z18 = z;
        boolean z19 = z13;
        boolean z20 = z12;
        boolean z21 = z11;
        boolean z22 = z10;
        int i10 = i;
        boolean z23 = z8;
        boolean z24 = z9;
        boolean z25 = z7;
        boolean z26 = z6;
        boolean z27 = z2;
        boolean z28 = z3;
        boolean z29 = z5;
        float f3 = f;
        boolean z30 = z4;
        InterfaceC65784Pro showTimeTab = interfaceC65784Pro;
        C125974wz c125974wz2 = (i2 & 1) != 0 ? null : c125974wz;
        if ((i2 & 2) != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        z18 = (i2 & 4) != 0 ? true : z18;
        z27 = (i2 & 8) != 0 ? true : z27;
        z28 = (i2 & 16) != 0 ? true : z28;
        f3 = (i2 & 32) != 0 ? 52.0f : f3;
        if ((i2 & 64) != 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        if ((i2 & 128) != 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        z30 = (i2 & 256) != 0 ? false : z30;
        z29 = (i2 & 512) != 0 ? false : z29;
        if ((i2 & 1024) != 0) {
            z17 = true;
        } else {
            z17 = false;
        }
        showTimeTab = (i2 & 2048) != 0 ? C164976dh.LJLIL : showTimeTab;
        z26 = (i2 & 4096) != 0 ? true : z26;
        z25 = (i2 & FileUtils.BUFFER_SIZE) != 0 ? true : z25;
        z23 = (i2 & 16384) != 0 ? true : z23;
        if ((32768 & i2) != 0) {
            i3 = EditEffectPanelSettings.LIZ().panelColumn;
        } else {
            i3 = 0;
        }
        z24 = (65536 & i2) != 0 ? true : z24;
        z22 = (131072 & i2) != 0 ? true : z22;
        z21 = (262144 & i2) != 0 ? false : z21;
        if ((524288 & i2) != 0) {
            i4 = R.attr.dj;
        } else {
            i4 = 0;
        }
        i10 = (1048576 & i2) != 0 ? 1 : i10;
        if ((2097152 & i2) != 0) {
            i5 = EditEffectPanelSettings.LIZ().panelColumn * EditEffectPanelSettings.LIZ().autoDownloadLine;
        } else {
            i5 = 0;
        }
        if ((4194304 & i2) != 0) {
            i6 = EditEffectPanelSettings.LIZ().preDownloadSize;
        } else {
            i6 = 0;
        }
        if ((8388608 & i2) != 0) {
            f2 = 0.35f;
        } else {
            f2 = 0.0f;
        }
        if ((16777216 & i2) != 0) {
            i7 = SFS.LJI(4.0d);
        } else {
            i7 = 0;
        }
        if ((33554432 & i2) != 0) {
            i8 = Math.min(SFS.LJI(96.0d), (int) (((C143205jg.LJ() * 0.92f) - ((i3 - 1) * i7)) / i3));
        } else {
            i8 = 0;
        }
        if ((67108864 & i2) != 0) {
            i9 = 12;
        } else {
            i9 = 0;
        }
        z20 = (134217728 & i2) != 0 ? false : z20;
        z19 = (i2 & 268435456) != 0 ? false : z19;
        o.LJIIIZ(showTimeTab, "showTimeTab");
        this.LIZ = c125974wz2;
        this.LIZIZ = z14;
        this.LIZJ = z18;
        this.LIZLLL = z27;
        this.LJ = z28;
        this.LJFF = f3;
        this.LJI = z15;
        this.LJII = z16;
        this.LJIIIIZZ = z30;
        this.LJIIIZ = z29;
        this.LJIIJ = z17;
        this.LJIIJJI = showTimeTab;
        this.LJIIL = z26;
        this.LJIILIIL = z25;
        this.LJIILJJIL = z23;
        this.LJIILL = i3;
        this.LJIILLIIL = z24;
        this.LJIIZILJ = z22;
        this.LJIJ = z21;
        this.LJIJI = i4;
        this.LJIJJ = i10;
        this.LJIJJLI = i5;
        this.LJIL = i6;
        this.LJJ = f2;
        this.LJJI = i7;
        this.LJJIFFI = i8;
        this.LJJII = i9;
        this.LJJIII = z20;
        this.LJJIIJ = z19;
    }
}
