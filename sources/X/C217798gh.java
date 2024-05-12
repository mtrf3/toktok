package X;

import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8gh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217798gh {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final EnumC217778gf LJ;
    public final List<String> LJFF;
    public final List<Integer> LJI;
    public final int LJII;
    public final LogPbBean LJIIIIZZ;

    public C217798gh() {
        this(null, false, null, null, null, null, 0, null, 511);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C217798gh)) {
            return false;
        }
        C217798gh c217798gh = (C217798gh) obj;
        return o.LJ(this.LIZ, c217798gh.LIZ) && o.LJ(this.LIZIZ, c217798gh.LIZIZ) && this.LIZJ == c217798gh.LIZJ && o.LJ(this.LIZLLL, c217798gh.LIZLLL) && this.LJ == c217798gh.LJ && o.LJ(this.LJFF, c217798gh.LJFF) && o.LJ(this.LJI, c217798gh.LJI) && this.LJII == c217798gh.LJII && o.LJ(this.LJIIIIZZ, c217798gh.LJIIIIZZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EntityExtraInfo(searchId=");
        LIZ.append(this.LIZ);
        LIZ.append(", requestId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", hasMore=");
        LIZ.append(this.LIZJ);
        LIZ.append(", keyword=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", requestType=");
        LIZ.append(this.LJ);
        LIZ.append(", indexLabels=");
        LIZ.append(this.LJFF);
        LIZ.append(", indexLabelCount=");
        LIZ.append(this.LJI);
        LIZ.append(", loadMoreCursor=");
        LIZ.append(this.LJII);
        LIZ.append(", logPbBean=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int LIZIZ = (AnonymousClass391.LIZIZ(this.LJI, AnonymousClass391.LIZIZ(this.LJFF, (this.LJ.hashCode() + C79062V1e.LJ(this.LIZLLL, (LJ + i) * 31, 31)) * 31, 31), 31) + this.LJII) * 31;
        LogPbBean logPbBean = this.LJIIIIZZ;
        if (logPbBean == null) {
            hashCode = 0;
        } else {
            hashCode = logPbBean.hashCode();
        }
        return LIZIZ + hashCode;
    }

    public C217798gh(String requestId, boolean z, String keyword, EnumC217778gf requestType, List indexLabels, List indexLabelCount, int i, LogPbBean logPbBean, int i2) {
        String searchId;
        if ((i2 & 1) != 0) {
            searchId = "";
        } else {
            searchId = null;
        }
        requestId = (i2 & 2) != 0 ? "" : requestId;
        z = (i2 & 4) != 0 ? false : z;
        keyword = (i2 & 8) != 0 ? "" : keyword;
        requestType = (i2 & 16) != 0 ? EnumC217778gf.UNDEFINED : requestType;
        indexLabels = (i2 & 32) != 0 ? C61878OQg.INSTANCE : indexLabels;
        indexLabelCount = (i2 & 64) != 0 ? C61878OQg.INSTANCE : indexLabelCount;
        i = (i2 & 128) != 0 ? 0 : i;
        logPbBean = (i2 & 256) != 0 ? null : logPbBean;
        o.LJIIIZ(searchId, "searchId");
        o.LJIIIZ(requestId, "requestId");
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(requestType, "requestType");
        o.LJIIIZ(indexLabels, "indexLabels");
        o.LJIIIZ(indexLabelCount, "indexLabelCount");
        this.LIZ = searchId;
        this.LIZIZ = requestId;
        this.LIZJ = z;
        this.LIZLLL = keyword;
        this.LJ = requestType;
        this.LJFF = indexLabels;
        this.LJI = indexLabelCount;
        this.LJII = i;
        this.LJIIIIZZ = logPbBean;
    }
}
