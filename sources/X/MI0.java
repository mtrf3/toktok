package X;

import com.ss.android.ugc.aweme.question.model.QuestionDetailResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MI0 {
    public final QuestionDetailResponse LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MI0)) {
            return false;
        }
        MI0 mi0 = (MI0) obj;
        return o.LJ(this.LIZ, mi0.LIZ) && this.LIZIZ == mi0.LIZIZ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZIZ) + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QuestionDetailNode(questionDetail=");
        LIZ.append(this.LIZ);
        LIZ.append(", timestamp=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public MI0(long j, QuestionDetailResponse questionDetailResponse) {
        this.LIZ = questionDetailResponse;
        this.LIZIZ = j;
    }
}
