package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7il, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193597il {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final List<Aweme> LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final int LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final Bundle LJIIJJI;
    public final Boolean LJIIL;
    public final Boolean LJIILIIL;
    public final Boolean LJIILJJIL;
    public final ShareInfo LJIILL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C193597il)) {
            return false;
        }
        C193597il c193597il = (C193597il) obj;
        return o.LJ(this.LIZ, c193597il.LIZ) && o.LJ(this.LIZIZ, c193597il.LIZIZ) && o.LJ(this.LIZJ, c193597il.LIZJ) && this.LIZLLL == c193597il.LIZLLL && o.LJ(this.LJ, c193597il.LJ) && o.LJ(this.LJFF, c193597il.LJFF) && o.LJ(this.LJI, c193597il.LJI) && o.LJ(this.LJII, c193597il.LJII) && this.LJIIIIZZ == c193597il.LJIIIIZZ && o.LJ(this.LJIIIZ, c193597il.LJIIIZ) && o.LJ(this.LJIIJ, c193597il.LJIIJ) && o.LJ(this.LJIIJJI, c193597il.LJIIJJI) && o.LJ(this.LJIIL, c193597il.LJIIL) && o.LJ(this.LJIILIIL, c193597il.LJIILIIL) && o.LJ(this.LJIILJJIL, c193597il.LJIILJJIL) && o.LJ(this.LJIILL, c193597il.LJIILL);
    }

    public final String toString() {
        return "PoiShareParams(enterFrom=" + this.LIZ + ", poiId=" + this.LIZIZ + ", poiName=" + this.LIZJ + ", videoCount=" + this.LIZLLL + ", awemeList=" + this.LJ + ", poiCity=" + this.LJFF + ", poiRegionCode=" + this.LJI + ", poiInfoSource=" + this.LJII + ", enableLocation=" + this.LJIIIIZZ + ", previousPage=" + this.LJIIIZ + ", poiClientInfo=" + this.LJIIJ + ", poiExtras=" + this.LJIIJJI + ", editPoiStatus=" + this.LJIIL + ", isBaAccount=" + this.LJIILIIL + ", claimStoreStatus=" + this.LJIILJJIL + ", shareInfo=" + this.LJIILL + ')';
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (this.LJIIJJI.hashCode() + C79062V1e.LJ(this.LJIIJ, C79062V1e.LJ(this.LJIIIZ, (C79062V1e.LJ(this.LJII, C79062V1e.LJ(this.LJI, C79062V1e.LJ(this.LJFF, AnonymousClass391.LIZIZ(this.LJ, JBR.LIZJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31) + this.LJIIIIZZ) * 31, 31), 31)) * 31;
        Boolean bool = this.LJIIL;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        Boolean bool2 = this.LJIILIIL;
        if (bool2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Boolean bool3 = this.LJIILJJIL;
        if (bool3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        ShareInfo shareInfo = this.LJIILL;
        if (shareInfo != null) {
            i = shareInfo.hashCode();
        }
        return i4 + i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C193597il(String enterFrom, String poiId, String poiName, long j, List<? extends Aweme> awemeList, String poiCity, String poiRegionCode, String poiInfoSource, int i, String previousPage, String str, Bundle bundle, Boolean bool, Boolean bool2, Boolean bool3, ShareInfo shareInfo) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(poiId, "poiId");
        o.LJIIIZ(poiName, "poiName");
        o.LJIIIZ(awemeList, "awemeList");
        o.LJIIIZ(poiCity, "poiCity");
        o.LJIIIZ(poiRegionCode, "poiRegionCode");
        o.LJIIIZ(poiInfoSource, "poiInfoSource");
        o.LJIIIZ(previousPage, "previousPage");
        this.LIZ = enterFrom;
        this.LIZIZ = poiId;
        this.LIZJ = poiName;
        this.LIZLLL = j;
        this.LJ = awemeList;
        this.LJFF = poiCity;
        this.LJI = poiRegionCode;
        this.LJII = poiInfoSource;
        this.LJIIIIZZ = i;
        this.LJIIIZ = previousPage;
        this.LJIIJ = str;
        this.LJIIJJI = bundle;
        this.LJIIL = bool;
        this.LJIILIIL = bool2;
        this.LJIILJJIL = bool3;
        this.LJIILL = shareInfo;
    }
}
