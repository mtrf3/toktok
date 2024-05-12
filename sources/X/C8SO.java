package X;

import com.ss.android.ugc.aweme.music.model.CollectMusicResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.8SO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8SO implements C33Q {
    public final AbstractC72932td<Integer> LJLIL;
    public CollectMusicResponse LJLILLLLZI;

    public C8SO() {
        this((C72912tb) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8SO)) {
            return false;
        }
        C8SO c8so = (C8SO) obj;
        return o.LJ(this.LJLIL, c8so.LJLIL) && o.LJ(this.LJLILLLLZI, c8so.LJLILLLLZI);
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        CollectMusicResponse collectMusicResponse = this.LJLILLLLZI;
        return hashCode + (collectMusicResponse == null ? 0 : collectMusicResponse.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicCollectState(collectState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", response=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C8SO(C72912tb c72912tb, int i) {
        this((i & 1) != 0 ? new C72912tb(0) : c72912tb, (CollectMusicResponse) null);
    }

    public static C8SO LIZ(C8SO c8so, AbstractC72932td abstractC72932td) {
        CollectMusicResponse collectMusicResponse = c8so.LJLILLLLZI;
        c8so.getClass();
        return new C8SO((AbstractC72932td<Integer>) abstractC72932td, collectMusicResponse);
    }

    public C8SO(AbstractC72932td<Integer> collectState, CollectMusicResponse collectMusicResponse) {
        o.LJIIIZ(collectState, "collectState");
        this.LJLIL = collectState;
        this.LJLILLLLZI = collectMusicResponse;
    }
}
