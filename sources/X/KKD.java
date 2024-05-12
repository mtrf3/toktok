package X;

import com.ss.android.ugc.aweme.qnasearch.api.QnaSearchSuggestionHighlightPositions;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KKD {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final List<QnaSearchSuggestionHighlightPositions> LIZLLL;
    public final KKF LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KKD)) {
            return false;
        }
        KKD kkd = (KKD) obj;
        return o.LJ(this.LIZ, kkd.LIZ) && this.LIZIZ == kkd.LIZIZ && o.LJ(this.LIZJ, kkd.LIZJ) && o.LJ(this.LIZLLL, kkd.LIZLLL) && o.LJ(this.LJ, kkd.LJ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QnaSearchResultModel(topString=");
        LIZ.append(this.LIZ);
        LIZ.append(", bottomInt=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", questionId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", highlightPos=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", qnaSearchResultMobData=");
        LIZ.append(this.LJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZJ, ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31, 31);
        List<QnaSearchSuggestionHighlightPositions> list = this.LIZLLL;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        KKF kkf = this.LJ;
        if (kkf != null) {
            i = kkf.hashCode();
        }
        return i2 + i;
    }

    public KKD(String topString, int i, String questionId, List<QnaSearchSuggestionHighlightPositions> list, KKF kkf) {
        o.LJIIIZ(topString, "topString");
        o.LJIIIZ(questionId, "questionId");
        this.LIZ = topString;
        this.LIZIZ = i;
        this.LIZJ = questionId;
        this.LIZLLL = list;
        this.LJ = kkf;
    }
}
