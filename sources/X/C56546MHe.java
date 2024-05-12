package X;

import com.ss.android.ugc.aweme.music.model.MusicDetail;
import kotlin.jvm.internal.o;

/* renamed from: X.MHe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56546MHe {
    public final MusicDetail LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56546MHe)) {
            return false;
        }
        C56546MHe c56546MHe = (C56546MHe) obj;
        return o.LJ(this.LIZ, c56546MHe.LIZ) && this.LIZIZ == c56546MHe.LIZIZ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZIZ) + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicDetailNode(musicDetail=");
        LIZ.append(this.LIZ);
        LIZ.append(", timeStamp=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C56546MHe(MusicDetail musicDetail, long j) {
        this.LIZ = musicDetail;
        this.LIZIZ = j;
    }
}
