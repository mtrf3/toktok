package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.KDv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51363KDv {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final KBA LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final Integer LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C51363KDv() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16383);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51363KDv)) {
            return false;
        }
        C51363KDv c51363KDv = (C51363KDv) obj;
        return o.LJ(this.LIZ, c51363KDv.LIZ) && o.LJ(this.LIZIZ, c51363KDv.LIZIZ) && o.LJ(this.LIZJ, c51363KDv.LIZJ) && o.LJ(this.LIZLLL, c51363KDv.LIZLLL) && o.LJ(this.LJ, c51363KDv.LJ) && o.LJ(this.LJFF, c51363KDv.LJFF) && o.LJ(this.LJI, c51363KDv.LJI) && o.LJ(this.LJII, c51363KDv.LJII) && o.LJ(this.LJIIIIZZ, c51363KDv.LJIIIIZZ) && o.LJ(this.LJIIIZ, c51363KDv.LJIIIZ) && o.LJ(this.LJIIJ, c51363KDv.LJIIJ) && o.LJ(this.LJIIJJI, c51363KDv.LJIIJJI) && o.LJ(this.LJIIL, c51363KDv.LJIIL) && o.LJ(this.LJIILIIL, c51363KDv.LJIILIIL);
    }

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
        KBA kba = this.LJII;
        int hashCode8 = (hashCode7 + (kba == null ? 0 : kba.hashCode())) * 31;
        String str8 = this.LJIIIIZZ;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LJIIIZ;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num = this.LJIIJ;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str10 = this.LJIIJJI;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.LJIIL;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.LJIILIIL;
        return hashCode13 + (str12 != null ? str12.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ECSearchResultImmutableData(isFromComment=");
        sb.append(this.LIZ);
        sb.append(", isFromVideo=");
        sb.append(this.LIZIZ);
        sb.append(", enterProductId=");
        sb.append(this.LIZJ);
        sb.append(", sourceProductId=");
        sb.append(this.LIZLLL);
        sb.append(", clickRecomSearchEntrance=");
        sb.append(this.LJ);
        sb.append(", blankPageEnterFrom=");
        sb.append(this.LJFF);
        sb.append(", blankPageEnterMethod=");
        sb.append(this.LJI);
        sb.append(", deepLinkEcParams=");
        sb.append(this.LJII);
        sb.append(", pageType=");
        sb.append(this.LJIIIIZZ);
        sb.append(", currentTab=");
        sb.append(this.LJIIIZ);
        sb.append(", pageIndex=");
        sb.append(this.LJIIJ);
        sb.append(", enterGroupId=");
        sb.append(this.LJIIJJI);
        sb.append(", productPanelType=");
        sb.append(this.LJIIL);
        sb.append(", lastSearchQueryData=");
        return C07670Rv.LIZIZ(sb, this.LJIILIIL, ')');
    }

    public /* synthetic */ C51363KDv(String str, String str2, String str3, String str4, String str5, String str6, String str7, KBA kba, String str8, String str9, String str10, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? new KBA(null, null, null, null, null, 31, null) : kba, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, null, null, null, (i & FileUtils.BUFFER_SIZE) != 0 ? null : str10);
    }

    public C51363KDv(String str, String str2, String str3, String str4, String str5, String str6, String str7, KBA kba, String str8, String str9, Integer num, String str10, String str11, String str12) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = kba;
        this.LJIIIIZZ = str8;
        this.LJIIIZ = str9;
        this.LJIIJ = num;
        this.LJIIJJI = str10;
        this.LJIIL = str11;
        this.LJIILIIL = str12;
    }
}
