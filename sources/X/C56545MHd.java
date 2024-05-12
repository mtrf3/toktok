package X;

import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import kotlin.jvm.internal.o;

/* renamed from: X.MHd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56545MHd {
    public final MusicAwemeList LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56545MHd)) {
            return false;
        }
        C56545MHd c56545MHd = (C56545MHd) obj;
        return o.LJ(this.LIZ, c56545MHd.LIZ) && this.LIZIZ == c56545MHd.LIZIZ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZIZ) + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicAwemeListNode(musicAwemeList=");
        LIZ.append(this.LIZ);
        LIZ.append(", timeStamp=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C56545MHd(MusicAwemeList musicAwemeList, long j) {
        o.LJIIIZ(musicAwemeList, "musicAwemeList");
        this.LIZ = musicAwemeList;
        this.LIZIZ = j;
    }
}
