package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.RSk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69578RSk {
    public final boolean LIZ;
    public final LiveRoomStruct LIZIZ;
    public final FrameLayout LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69578RSk)) {
            return false;
        }
        C69578RSk c69578RSk = (C69578RSk) obj;
        return this.LIZ == c69578RSk.LIZ && o.LJ(this.LIZIZ, c69578RSk.LIZIZ) && o.LJ(this.LIZJ, c69578RSk.LIZJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (r0 * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ECLivePlayConfig(isMute=");
        LIZ.append(this.LIZ);
        LIZ.append(", room=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", liveStreamContainer=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C69578RSk(boolean z, LiveRoomStruct room, FrameLayout frameLayout) {
        o.LJIIIZ(room, "room");
        this.LIZ = z;
        this.LIZIZ = room;
        this.LIZJ = frameLayout;
    }
}
