package X;

import com.ss.android.ugc.aweme.model.library.LibraryVideosResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.MHn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56555MHn {
    public final LibraryVideosResponse LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56555MHn)) {
            return false;
        }
        C56555MHn c56555MHn = (C56555MHn) obj;
        return o.LJ(this.LIZ, c56555MHn.LIZ) && this.LIZIZ == c56555MHn.LIZIZ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZIZ) + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LibraryVideosNode(libraryVideos=");
        LIZ.append(this.LIZ);
        LIZ.append(", timestamp=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C56555MHn(LibraryVideosResponse libraryVideos, long j) {
        o.LJIIIZ(libraryVideos, "libraryVideos");
        this.LIZ = libraryVideos;
        this.LIZIZ = j;
    }
}
