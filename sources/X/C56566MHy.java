package X;

import com.ss.android.ugc.aweme.question.model.QuestionVideosResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.MHy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56566MHy {
    public final QuestionVideosResponse LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56566MHy)) {
            return false;
        }
        C56566MHy c56566MHy = (C56566MHy) obj;
        return o.LJ(this.LIZ, c56566MHy.LIZ) && this.LIZIZ == c56566MHy.LIZIZ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZIZ) + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QuestionVideosNode(questionVideos=");
        LIZ.append(this.LIZ);
        LIZ.append(", timestamp=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C56566MHy(QuestionVideosResponse questionVideos, long j) {
        o.LJIIIZ(questionVideos, "questionVideos");
        this.LIZ = questionVideos;
        this.LIZIZ = j;
    }
}
