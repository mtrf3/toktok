package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V0O {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final String LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public final long LJIIL;
    public final long LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final boolean LJIILLIIL;
    public final String LJIIZILJ;
    public final String LJIJ;
    public final MusicModel LJIJI;
    public final String LJIJJ;
    public final String LJIJJLI;
    public final UrlModel LJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V0O)) {
            return false;
        }
        V0O v0o = (V0O) obj;
        return o.LJ(this.LIZ, v0o.LIZ) && o.LJ(this.LIZIZ, v0o.LIZIZ) && o.LJ(this.LIZJ, v0o.LIZJ) && this.LIZLLL == v0o.LIZLLL && this.LJ == v0o.LJ && this.LJFF == v0o.LJFF && o.LJ(this.LJI, v0o.LJI) && o.LJ(this.LJII, v0o.LJII) && this.LJIIIIZZ == v0o.LJIIIIZZ && this.LJIIIZ == v0o.LJIIIZ && this.LJIIJ == v0o.LJIIJ && this.LJIIJJI == v0o.LJIIJJI && this.LJIIL == v0o.LJIIL && this.LJIILIIL == v0o.LJIILIIL && o.LJ(this.LJIILJJIL, v0o.LJIILJJIL) && o.LJ(this.LJIILL, v0o.LJIILL) && this.LJIILLIIL == v0o.LJIILLIIL && o.LJ(this.LJIIZILJ, v0o.LJIIZILJ) && o.LJ(this.LJIJ, v0o.LJIJ) && o.LJ(this.LJIJI, v0o.LJIJI) && o.LJ(this.LJIJJ, v0o.LJIJJ) && o.LJ(this.LJIJJLI, v0o.LJIJJLI) && o.LJ(this.LJIL, v0o.LJIL);
    }

    public final String toString() {
        return "ChooseMusicParam(stickerMusicIdsJsonString=" + this.LIZ + ", firstStickerId=" + this.LIZIZ + ", firstStickerChallengeId=" + this.LIZJ + ", allowClear=" + this.LIZLLL + ", isPhotoMvMode=" + this.LJ + ", isMVThemeMusic=" + this.LJFF + ", shootWay=" + this.LJI + ", creationId=" + this.LJII + ", longVideo=" + this.LJIIIIZZ + ", isBusinessSticker=" + this.LJIIIZ + ", hideCancelMusic=" + this.LJIIJ + ", hideLocalMusic=" + this.LJIIJJI + ", maxDuration=" + this.LJIIL + ", videoLength=" + this.LJIILIIL + ", missionId=" + this.LJIILJJIL + ", missionMusicId=" + this.LJIILL + ", allowCut=" + this.LJIILLIIL + ", fromLocation=" + this.LJIIZILJ + ", type=" + this.LJIJ + ", currentUsedMusic=" + this.LJIJI + ", currentUsedMusicSelectFrom=" + this.LJIJJ + ", currentUsedMusicSelectMethod=" + this.LJIJJLI + ", effectIconUrl=" + this.LJIL + ')';
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
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        String str = this.LIZ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.LIZIZ;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.LIZJ;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        boolean z = this.LIZLLL;
        int i5 = 1;
        int i6 = z;
        if (z != 0) {
            i6 = 1;
        }
        int i7 = (i4 + i6) * 31;
        boolean z2 = this.LJ;
        int i8 = z2;
        if (z2 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        boolean z3 = this.LJFF;
        int i10 = z3;
        if (z3 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        String str4 = this.LJI;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str5 = this.LJII;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        boolean z4 = this.LJIIIIZZ;
        int i14 = z4;
        if (z4 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z5 = this.LJIIIZ;
        int i16 = z5;
        if (z5 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        boolean z6 = this.LJIIJ;
        int i18 = z6;
        if (z6 != 0) {
            i18 = 1;
        }
        int i19 = (i17 + i18) * 31;
        boolean z7 = this.LJIIJJI;
        int i20 = z7;
        if (z7 != 0) {
            i20 = 1;
        }
        int LIZJ = JBR.LIZJ(this.LJIILIIL, JBR.LIZJ(this.LJIIL, (i19 + i20) * 31, 31), 31);
        String str6 = this.LJIILJJIL;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i21 = (LIZJ + hashCode6) * 31;
        String str7 = this.LJIILL;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i22 = (i21 + hashCode7) * 31;
        if (!this.LJIILLIIL) {
            i5 = 0;
        }
        int i23 = (i22 + i5) * 31;
        String str8 = this.LJIIZILJ;
        if (str8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str8.hashCode();
        }
        int i24 = (i23 + hashCode8) * 31;
        String str9 = this.LJIJ;
        if (str9 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str9.hashCode();
        }
        int i25 = (i24 + hashCode9) * 31;
        MusicModel musicModel = this.LJIJI;
        if (musicModel == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = musicModel.hashCode();
        }
        int i26 = (i25 + hashCode10) * 31;
        String str10 = this.LJIJJ;
        if (str10 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str10.hashCode();
        }
        int i27 = (i26 + hashCode11) * 31;
        String str11 = this.LJIJJLI;
        if (str11 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str11.hashCode();
        }
        int i28 = (i27 + hashCode12) * 31;
        UrlModel urlModel = this.LJIL;
        if (urlModel != null) {
            i = urlModel.hashCode();
        }
        return i28 + i;
    }

    public V0O(String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, String str5, boolean z4, boolean z5, boolean z6, boolean z7, long j, long j2, String str6, String str7, boolean z8, String str8, String str9, MusicModel musicModel, String str10, String str11, UrlModel urlModel) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = z3;
        this.LJI = str4;
        this.LJII = str5;
        this.LJIIIIZZ = z4;
        this.LJIIIZ = z5;
        this.LJIIJ = z6;
        this.LJIIJJI = z7;
        this.LJIIL = j;
        this.LJIILIIL = j2;
        this.LJIILJJIL = str6;
        this.LJIILL = str7;
        this.LJIILLIIL = z8;
        this.LJIIZILJ = str8;
        this.LJIJ = str9;
        this.LJIJI = musicModel;
        this.LJIJJ = str10;
        this.LJIJJLI = str11;
        this.LJIL = urlModel;
    }
}
