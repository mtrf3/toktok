package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XVD {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final boolean LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final MusicModel.MusicType LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;

    /* JADX WARN: Multi-variable type inference failed */
    public XVD() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 131071);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XVD)) {
            return false;
        }
        XVD xvd = (XVD) obj;
        return o.LJ(this.LIZ, xvd.LIZ) && o.LJ(this.LIZIZ, xvd.LIZIZ) && o.LJ(this.LIZJ, xvd.LIZJ) && o.LJ(this.LIZLLL, xvd.LIZLLL) && o.LJ(this.LJ, xvd.LJ) && o.LJ(this.LJFF, xvd.LJFF) && o.LJ(this.LJI, xvd.LJI) && this.LJII == xvd.LJII && o.LJ(this.LJIIIIZZ, xvd.LJIIIIZZ) && o.LJ(this.LJIIIZ, xvd.LJIIIZ) && o.LJ(this.LJIIJ, xvd.LJIIJ) && o.LJ(this.LJIIJJI, xvd.LJIIJJI) && o.LJ(this.LJIIL, xvd.LJIIL) && o.LJ(this.LJIILIIL, xvd.LJIILIIL) && this.LJIILJJIL == xvd.LJIILJJIL && o.LJ(this.LJIILL, xvd.LJIILL) && o.LJ(this.LJIILLIIL, xvd.LJIILLIIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJ;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJFF;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LJI;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        boolean z = this.LJII;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode7 + i) * 31;
        String str8 = this.LJIIIIZZ;
        int hashCode8 = (i2 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LJIIIZ;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.LJIIJ;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.LJIIJJI;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.LJIIL;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.LJIILIIL;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        MusicModel.MusicType musicType = this.LJIILJJIL;
        int hashCode14 = (hashCode13 + (musicType == null ? 0 : musicType.hashCode())) * 31;
        String str14 = this.LJIILL;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.LJIILLIIL;
        return hashCode15 + (str15 != null ? str15.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CutMusicMobData(enterFrom=");
        sb.append(this.LIZ);
        sb.append(", shootWay=");
        sb.append(this.LIZIZ);
        sb.append(", creationId=");
        sb.append(this.LIZJ);
        sb.append(", contentSource=");
        sb.append(this.LIZLLL);
        sb.append(", contentType=");
        sb.append(this.LJ);
        sb.append(", musicId=");
        sb.append(this.LJFF);
        sb.append(", musicEditFrom=");
        sb.append(this.LJI);
        sb.append(", isLocalMusic=");
        sb.append(this.LJII);
        sb.append(", searchId=");
        sb.append(this.LJIIIIZZ);
        sb.append(", searchResultId=");
        sb.append(this.LJIIIZ);
        sb.append(", listItemId=");
        sb.append(this.LJIIJ);
        sb.append(", searchRank=");
        sb.append(this.LJIIJJI);
        sb.append(", tokenType=");
        sb.append(this.LJIIL);
        sb.append(", enterMethod=");
        sb.append(this.LJIILIIL);
        sb.append(", musicType=");
        sb.append(this.LJIILJJIL);
        sb.append(", tabName=");
        sb.append(this.LJIILL);
        sb.append(", musicRecType=");
        return C07670Rv.LIZIZ(sb, this.LJIILLIIL, ')');
    }

    public static XVD LIZ(XVD xvd, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        String str8;
        String str9;
        String str10;
        boolean z;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16 = str2;
        String str17 = str3;
        String str18 = str7;
        String str19 = str;
        String str20 = str5;
        String str21 = str4;
        String str22 = str6;
        if ((i & 1) != 0) {
            str19 = xvd.LIZ;
        }
        if ((i & 2) != 0) {
            str16 = xvd.LIZIZ;
        }
        MusicModel.MusicType musicType = null;
        if ((i & 4) != 0) {
            str8 = xvd.LIZJ;
        } else {
            str8 = null;
        }
        if ((i & 8) != 0) {
            str17 = xvd.LIZLLL;
        }
        if ((i & 16) != 0) {
            str21 = xvd.LJ;
        }
        if ((i & 32) != 0) {
            str9 = xvd.LJFF;
        } else {
            str9 = null;
        }
        if ((i & 64) != 0) {
            str10 = xvd.LJI;
        } else {
            str10 = null;
        }
        if ((i & 128) != 0) {
            z = xvd.LJII;
        } else {
            z = false;
        }
        if ((i & 256) != 0) {
            str11 = xvd.LJIIIIZZ;
        } else {
            str11 = null;
        }
        if ((i & 512) != 0) {
            str12 = xvd.LJIIIZ;
        } else {
            str12 = null;
        }
        if ((i & 1024) != 0) {
            str13 = xvd.LJIIJ;
        } else {
            str13 = null;
        }
        if ((i & 2048) != 0) {
            str14 = xvd.LJIIJJI;
        } else {
            str14 = null;
        }
        if ((i & 4096) != 0) {
            str15 = xvd.LJIIL;
        } else {
            str15 = null;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            str20 = xvd.LJIILIIL;
        }
        if ((i & 16384) != 0) {
            musicType = xvd.LJIILJJIL;
        }
        if ((32768 & i) != 0) {
            str22 = xvd.LJIILL;
        }
        if ((i & 65536) != 0) {
            str18 = xvd.LJIILLIIL;
        }
        xvd.getClass();
        return new XVD(str19, str16, str8, str17, str21, str9, str10, z, str11, str12, str13, str14, str15, str20, musicType, str22, str18);
    }

    public XVD(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, String str10, String str11, String str12, String str13, MusicModel.MusicType musicType, String str14, String str15) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = z;
        this.LJIIIIZZ = str8;
        this.LJIIIZ = str9;
        this.LJIIJ = str10;
        this.LJIIJJI = str11;
        this.LJIIL = str12;
        this.LJIILIIL = str13;
        this.LJIILJJIL = musicType;
        this.LJIILL = str14;
        this.LJIILLIIL = str15;
    }

    public /* synthetic */ XVD(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, String str10, String str11, String str12, String str13, MusicModel.MusicType musicType, String str14, String str15, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & FileUtils.BUFFER_SIZE) != 0 ? null : str13, (i & 16384) != 0 ? null : musicType, (32768 & i) != 0 ? null : str14, (i & 65536) != 0 ? null : str15);
    }
}
