package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.M1p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56141M1p {
    public final String LIZ;
    public final String LIZIZ;
    public final Boolean LIZJ;
    public final String LIZLLL = "ecom_video";
    public final String LJ;
    public final String LJFF;
    public final List<String> LJI;
    public final List<String> LJII;
    public final UrlModel LJIIIIZZ;
    public final Object LJIIIZ;
    public final java.util.Map<String, Object> LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56141M1p)) {
            return false;
        }
        C56141M1p c56141M1p = (C56141M1p) obj;
        return o.LJ(this.LIZ, c56141M1p.LIZ) && o.LJ(this.LIZIZ, c56141M1p.LIZIZ) && o.LJ(this.LIZJ, c56141M1p.LIZJ) && o.LJ(this.LIZLLL, c56141M1p.LIZLLL) && o.LJ(this.LJ, c56141M1p.LJ) && o.LJ(this.LJFF, c56141M1p.LJFF) && o.LJ(this.LJI, c56141M1p.LJI) && o.LJ(this.LJII, c56141M1p.LJII) && o.LJ(this.LJIIIIZZ, c56141M1p.LJIIIIZZ) && o.LJ(this.LJIIIZ, c56141M1p.LJIIIZ) && o.LJ(this.LJIIJ, c56141M1p.LJIIJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.LIZJ;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJ;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJFF;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list = this.LJI;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.LJII;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        UrlModel urlModel = this.LJIIIIZZ;
        int hashCode9 = (hashCode8 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        Object obj = this.LJIIIZ;
        return this.LJIIJ.hashCode() + ((hashCode9 + (obj != null ? obj.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AnchorParams(awemeId=" + this.LIZ + ", authorUid=" + this.LIZIZ + ", isAd=" + this.LIZJ + ", listEntrance=" + this.LIZLLL + ", firstShowPid=" + this.LJ + ", lastClickPid=" + this.LJFF + ", videoPids=" + this.LJI + ", clickPids=" + this.LJII + ", userAvatar=" + this.LJIIIIZZ + ", sessionImpressionInfo=" + this.LJIIIZ + ", extraParams=" + this.LJIIJ + ')';
    }

    public C56141M1p(String str, String str2, Boolean bool, String str3, String str4, List list, List list2, UrlModel urlModel, Object obj, java.util.Map map) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = bool;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = list;
        this.LJII = list2;
        this.LJIIIIZZ = urlModel;
        this.LJIIIZ = obj;
        this.LJIIJ = map;
    }
}
