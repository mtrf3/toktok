package X;

import android.graphics.drawable.Drawable;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.3qb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96533qb {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public final int LJIIL;
    public final int LJIILIIL;
    public final Drawable LJIILJJIL;

    public C96533qb() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 32767);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C96533qb)) {
            return false;
        }
        C96533qb c96533qb = (C96533qb) obj;
        return this.LIZ == c96533qb.LIZ && this.LIZIZ == c96533qb.LIZIZ && this.LIZJ == c96533qb.LIZJ && this.LIZLLL == c96533qb.LIZLLL && this.LJ == c96533qb.LJ && this.LJFF == c96533qb.LJFF && this.LJI == c96533qb.LJI && this.LJII == c96533qb.LJII && this.LJIIIIZZ == c96533qb.LJIIIIZZ && this.LJIIIZ == c96533qb.LJIIIZ && this.LJIIJ == c96533qb.LJIIJ && this.LJIIJJI == c96533qb.LJIIJJI && this.LJIIL == c96533qb.LJIIL && this.LJIILIIL == c96533qb.LJIILIIL && o.LJ(this.LJIILJJIL, c96533qb.LJIILJJIL);
    }

    public final int hashCode() {
        int i = ((((((((((((((((((((((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJII) * 31) + this.LJIIIIZZ) * 31) + this.LJIIIZ) * 31) + this.LJIIJ) * 31) + this.LJIIJJI) * 31) + this.LJIIL) * 31) + this.LJIILIIL) * 31;
        Drawable drawable = this.LJIILJJIL;
        return i + (drawable == null ? 0 : drawable.hashCode());
    }

    public final String toString() {
        return "UIStyleConfig(height=" + this.LIZ + ", avatarSingleSize=" + this.LIZIZ + ", avatarDoubleLeftSize=" + this.LIZJ + ", avatarDoubleRightSize=" + this.LIZLLL + ", titleTuxFont=" + this.LJ + ", titleForceTextSize=" + this.LJFF + ", contentTuxFont=" + this.LJI + ", contentForceTextSize=" + this.LJII + ", contentColor=" + this.LJIIIIZZ + ", contentColorAttr=" + this.LJIIIZ + ", titleContentGap=" + this.LJIIJ + ", timeTuxFont=" + this.LJIIJJI + ", timeForceTextSize=" + this.LJIIL + ", contentEndGap=" + this.LJIILIIL + ", tuxArrowIcon=" + this.LJIILJJIL + ')';
    }

    public C96533qb(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, SY9 sy9, int i13) {
        int i14;
        int i15 = i2;
        int i16 = i4;
        int i17 = i3;
        int i18 = i6;
        int i19 = i5;
        int i20 = i8;
        int i21 = i7;
        int i22 = i10;
        int i23 = i9;
        int i24 = i12;
        int i25 = i11;
        SY9 sy92 = sy9;
        int i26 = (i13 & 1) != 0 ? -1 : i;
        i15 = (i13 & 2) != 0 ? -1 : i15;
        i17 = (i13 & 4) != 0 ? -1 : i17;
        i16 = (i13 & 8) != 0 ? -1 : i16;
        i19 = (i13 & 16) != 0 ? -1 : i19;
        i18 = (i13 & 32) != 0 ? -1 : i18;
        i21 = (i13 & 64) != 0 ? -1 : i21;
        if ((i13 & 128) != 0) {
            i14 = -1;
        } else {
            i14 = 0;
        }
        i20 = (i13 & 256) != 0 ? -1 : i20;
        i23 = (i13 & 512) != 0 ? -1 : i23;
        i22 = (i13 & 1024) != 0 ? -1 : i22;
        i25 = (i13 & 2048) != 0 ? -1 : i25;
        int i27 = (i13 & 4096) != 0 ? -1 : 0;
        i24 = (i13 & FileUtils.BUFFER_SIZE) != 0 ? -1 : i24;
        sy92 = (i13 & 16384) != 0 ? null : sy92;
        this.LIZ = i26;
        this.LIZIZ = i15;
        this.LIZJ = i17;
        this.LIZLLL = i16;
        this.LJ = i19;
        this.LJFF = i18;
        this.LJI = i21;
        this.LJII = i14;
        this.LJIIIIZZ = i20;
        this.LJIIIZ = i23;
        this.LJIIJ = i22;
        this.LJIIJJI = i25;
        this.LJIIL = i27;
        this.LJIILIIL = i24;
        this.LJIILJJIL = sy92;
    }
}
