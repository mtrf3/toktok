package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import kotlin.jvm.internal.o;

/* renamed from: X.5n0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145265n0 {
    public final AVMusic LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public C145265n0() {
        this(null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C145265n0)) {
            return false;
        }
        C145265n0 c145265n0 = (C145265n0) obj;
        return o.LJ(this.LIZ, c145265n0.LIZ) && o.LJ(this.LIZIZ, c145265n0.LIZIZ) && this.LIZJ == c145265n0.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        AVMusic aVMusic = this.LIZ;
        if (aVMusic == null) {
            hashCode = 0;
        } else {
            hashCode = aVMusic.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LIZIZ, hashCode * 31, 31);
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return LJ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicSelectedStateUpdate(music=");
        LIZ.append(this.LIZ);
        LIZ.append(", updateSource=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", changedVideoDuration=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C145265n0(AVMusic aVMusic, String updateSource, int i) {
        aVMusic = (i & 1) != 0 ? null : aVMusic;
        updateSource = (i & 2) != 0 ? "" : updateSource;
        o.LJIIIZ(updateSource, "updateSource");
        this.LIZ = aVMusic;
        this.LIZIZ = updateSource;
        this.LIZJ = false;
    }
}
