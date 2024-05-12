package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.Jr0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50446Jr0 implements KK7 {
    public final Aweme LJLIL;

    public C50446Jr0() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C50446Jr0) && o.LJ(this.LJLIL, ((C50446Jr0) obj).LJLIL);
    }

    public final int hashCode() {
        Aweme aweme = this.LJLIL;
        if (aweme == null) {
            return 0;
        }
        return aweme.hashCode();
    }

    @Override // X.KK7
    public final boolean isLog() {
        return true;
    }

    static {
        C17N.LJJJJLI().If().LIZIZ(C65352Pkq.LIZ(C50446Jr0.class), C50445Jqz.LJLIL);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecordInnerFlowConsumeVideoAction(aweme=");
        return C770830u.LIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public C50446Jr0(Aweme aweme) {
        this.LJLIL = aweme;
    }
}
