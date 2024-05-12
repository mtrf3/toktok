package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S1X implements S1Y {
    public final S1U LIZ;
    public final InterfaceC44105HSr LIZIZ;
    public final C51556KLg LIZJ;

    public S1X(S1U s1u, InterfaceC44105HSr interfaceC44105HSr, C51556KLg c51556KLg) {
        this.LIZ = s1u;
        this.LIZIZ = interfaceC44105HSr;
        this.LIZJ = c51556KLg;
    }

    @Override // X.S1Y
    public final void LIZ(C188727au eventMapBuilder, Aweme aweme, String enterMethod, String enterFrom) {
        S1U s1u;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        if (this.LIZJ != null && (s1u = this.LIZ) != null) {
            S1V.LIZ(s1u, this.LIZIZ.LIZ(), aweme, enterMethod, enterFrom, eventMapBuilder, null, 96);
        }
    }

    @Override // X.S1Y
    public final void LIZIZ(C188727au c188727au, Aweme aweme, String enterMethod, String enterFrom) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(enterFrom, "enterFrom");
        S1U s1u = this.LIZ;
        if (s1u != null) {
            S1V.LIZIZ(s1u, aweme, enterMethod, enterFrom, false, false, null, c188727au, 56);
        }
    }

    @Override // X.S1Y
    public final void LIZJ(C188727au eventMapBuilder, Aweme aweme, String enterMethod, String enterFrom) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        LIZ(eventMapBuilder, aweme, enterMethod, enterFrom);
    }

    @Override // X.S1Y
    public final void LIZLLL(C188727au eventMapBuilder, Aweme aweme, String enterMethod, String enterFrom) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        S1U s1u = this.LIZ;
        if (s1u != null) {
            S1V.LIZJ(s1u, aweme, enterMethod, enterFrom, false, null, eventMapBuilder, 24);
        }
    }
}
