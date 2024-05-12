package X;

import com.ss.android.ugc.aweme.model.library.LibraryDetailResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.MHr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56559MHr {
    public final LibraryDetailResponse LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56559MHr)) {
            return false;
        }
        C56559MHr c56559MHr = (C56559MHr) obj;
        return o.LJ(this.LIZ, c56559MHr.LIZ) && this.LIZIZ == c56559MHr.LIZIZ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZIZ) + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LibraryDetailNode(libraryDetail=");
        LIZ.append(this.LIZ);
        LIZ.append(", timestamp=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C56559MHr(LibraryDetailResponse libraryDetailResponse, long j) {
        this.LIZ = libraryDetailResponse;
        this.LIZIZ = j;
    }
}
