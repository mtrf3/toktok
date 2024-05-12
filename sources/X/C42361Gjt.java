package X;

import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.Gjt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42361Gjt extends QXX {
    public final String LJLIL;

    public final int hashCode() {
        return Objects.hash(this.LJLIL);
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("StreamEditFrameTaskParam:%s", this.LJLIL);
    }

    public C42361Gjt(String url) {
        o.LJIIIZ(url, "url");
        this.LJLIL = url;
    }

    @Override // X.QXX
    public final boolean LLJJJJLIIL(QXX last) {
        o.LJIIIZ(last, "last");
        if (o.LJ(last, this)) {
            return true;
        }
        if (!(last instanceof C42361Gjt)) {
            return false;
        }
        return o.LJ(((C42361Gjt) last).LJLIL, this.LJLIL);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42361Gjt)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((C42361Gjt) obj).LJLIL}, new Object[]{this.LJLIL});
    }
}
