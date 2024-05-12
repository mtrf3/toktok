package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XXW {
    public final MusicModel LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final XVG LJIIJ;
    public final int LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public final int LJIILL;
    public boolean LJIILLIIL;
    public final boolean LJIIZILJ;
    public final boolean LJFF = false;
    public final int LJIIJJI = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XXW)) {
            return false;
        }
        XXW xxw = (XXW) obj;
        return o.LJ(this.LIZ, xxw.LIZ) && o.LJ(this.LIZIZ, xxw.LIZIZ) && this.LIZJ == xxw.LIZJ && this.LIZLLL == xxw.LIZLLL && this.LJ == xxw.LJ && this.LJFF == xxw.LJFF && this.LJI == xxw.LJI && this.LJII == xxw.LJII && this.LJIIIIZZ == xxw.LJIIIIZZ && this.LJIIIZ == xxw.LJIIIZ && o.LJ(this.LJIIJ, xxw.LJIIJ) && this.LJIIJJI == xxw.LJIIJJI && this.LJIIL == xxw.LJIIL && this.LJIILIIL == xxw.LJIILIIL && this.LJIILJJIL == xxw.LJIILJJIL && this.LJIILL == xxw.LJIILL && this.LJIILLIIL == xxw.LJIILLIIL && this.LJIIZILJ == xxw.LJIIZILJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        MusicModel musicModel = this.LIZ;
        int hashCode = (musicModel == null ? 0 : musicModel.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.LIZLLL;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.LJ;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.LJFF;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z5 = this.LJI;
        int i9 = z5;
        if (z5 != 0) {
            i9 = 1;
        }
        int i10 = (((((((i8 + i9) * 31) + this.LJII) * 31) + this.LJIIIIZZ) * 31) + this.LJIIIZ) * 31;
        XVG xvg = this.LJIIJ;
        int hashCode3 = (((((i10 + (xvg != null ? xvg.hashCode() : 0)) * 31) + this.LJIIJJI) * 31) + this.LJIIL) * 31;
        boolean z6 = this.LJIILIIL;
        int i11 = z6;
        if (z6 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode3 + i11) * 31;
        boolean z7 = this.LJIILJJIL;
        int i13 = z7;
        if (z7 != 0) {
            i13 = 1;
        }
        int i14 = (((i12 + i13) * 31) + this.LJIILL) * 31;
        boolean z8 = this.LJIILLIIL;
        int i15 = z8;
        if (z8 != 0) {
            i15 = 1;
        }
        return ((i14 + i15) * 31) + (this.LJIIZILJ ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicItemStatus(item=");
        sb.append(this.LIZ);
        sb.append(", query=");
        sb.append(this.LIZIZ);
        sb.append(", isHot=");
        sb.append(this.LIZJ);
        sb.append(", isExternal=");
        sb.append(this.LIZLLL);
        sb.append(", isPlaying=");
        sb.append(this.LJ);
        sb.append(", isLoading=");
        sb.append(this.LJFF);
        sb.append(", isShowCutFun=");
        sb.append(this.LJI);
        sb.append(", pageType=");
        sb.append(this.LJII);
        sb.append(", pageIndex=");
        sb.append(this.LJIIIIZZ);
        sb.append(", position=");
        sb.append(this.LJIIIZ);
        sb.append(", musicMobBean=");
        sb.append(this.LJIIJ);
        sb.append(", playTime=");
        sb.append(this.LJIIJJI);
        sb.append(", progress=");
        sb.append(this.LJIIL);
        sb.append(", showUserCount=");
        sb.append(this.LJIILIIL);
        sb.append(", showMusicTag=");
        sb.append(this.LJIILJJIL);
        sb.append(", editStatus=");
        sb.append(this.LJIILL);
        sb.append(", isDeviceSoundChecked=");
        sb.append(this.LJIILLIIL);
        sb.append(", disableMusicItemClick=");
        return C08880Wm.LIZJ(sb, this.LJIIZILJ, ')');
    }

    public XXW(MusicModel musicModel, String str, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, int i3, XVG xvg, int i4, boolean z5, boolean z6, int i5, boolean z7, boolean z8) {
        this.LIZ = musicModel;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJI = z4;
        this.LJII = i;
        this.LJIIIIZZ = i2;
        this.LJIIIZ = i3;
        this.LJIIJ = xvg;
        this.LJIIL = i4;
        this.LJIILIIL = z5;
        this.LJIILJJIL = z6;
        this.LJIILL = i5;
        this.LJIILLIIL = z7;
        this.LJIIZILJ = z8;
    }
}
