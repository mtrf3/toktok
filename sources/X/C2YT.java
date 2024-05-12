package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2YT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2YT {
    public final List<Aweme> LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2YT)) {
            return false;
        }
        C2YT c2yt = (C2YT) obj;
        return o.LJ(this.LIZ, c2yt.LIZ) && this.LIZIZ == c2yt.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        List<Aweme> list = this.LIZ;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PrivateAwemeResult(list=");
        LIZ.append(this.LIZ);
        LIZ.append(", hasMore=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2YT(List<? extends Aweme> list, boolean z) {
        this.LIZ = list;
        this.LIZIZ = z;
    }
}
