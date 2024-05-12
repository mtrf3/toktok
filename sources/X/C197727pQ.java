package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.o;

/* renamed from: X.7pQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197727pQ {
    public static final /* synthetic */ int LJIIL = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final UrlModel LJI;
    public final UrlModel LJII;
    public final UrlModel LJIIIIZZ;
    public final long LJIIIZ;
    public final long LJIIJ;
    public final long LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C197727pQ)) {
            return false;
        }
        C197727pQ c197727pQ = (C197727pQ) obj;
        return o.LJ(this.LIZ, c197727pQ.LIZ) && o.LJ(this.LIZIZ, c197727pQ.LIZIZ) && this.LIZJ == c197727pQ.LIZJ && o.LJ(this.LIZLLL, c197727pQ.LIZLLL) && this.LJ == c197727pQ.LJ && this.LJFF == c197727pQ.LJFF && o.LJ(this.LJI, c197727pQ.LJI) && o.LJ(this.LJII, c197727pQ.LJII) && o.LJ(this.LJIIIIZZ, c197727pQ.LJIIIIZZ) && this.LJIIIZ == c197727pQ.LJIIIZ && this.LJIIJ == c197727pQ.LJIIJ && this.LJIIJJI == c197727pQ.LJIIJJI;
    }

    public final String toString() {
        return "NowSelfAwemeEntity(aid=" + this.LIZ + ", uid=" + this.LIZIZ + ", awemeType=" + this.LIZJ + ", authorName=" + this.LIZLLL + ", likeCount=" + this.LJ + ", commentCount=" + this.LJFF + ", frontImageThumbnail=" + this.LJI + ", backImage=" + this.LJII + ", videoCover=" + this.LJIIIIZZ + ", createTimeAtSec=" + this.LJIIIZ + ", lastPushedAtSec=" + this.LJIIJ + ", expiredTimeAtSec=" + this.LJIIJJI + ')';
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LIZJ = JBR.LIZJ(this.LJFF, JBR.LIZJ(this.LJ, C79062V1e.LJ(this.LIZLLL, (C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31) + this.LIZJ) * 31, 31), 31), 31);
        UrlModel urlModel = this.LJI;
        int i = 0;
        if (urlModel == null) {
            hashCode = 0;
        } else {
            hashCode = urlModel.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        UrlModel urlModel2 = this.LJII;
        if (urlModel2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = urlModel2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        UrlModel urlModel3 = this.LJIIIIZZ;
        if (urlModel3 != null) {
            i = urlModel3.hashCode();
        }
        return C16880lQ.LLJIJIL(this.LJIIJJI) + JBR.LIZJ(this.LJIIJ, JBR.LIZJ(this.LJIIIZ, (i3 + i) * 31, 31), 31);
    }

    public C197727pQ(String str, String str2, int i, String str3, long j, long j2, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, long j3, long j4, long j5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = str3;
        this.LJ = j;
        this.LJFF = j2;
        this.LJI = urlModel;
        this.LJII = urlModel2;
        this.LJIIIIZZ = urlModel3;
        this.LJIIIZ = j3;
        this.LJIIJ = j4;
        this.LJIIJJI = j5;
    }
}
