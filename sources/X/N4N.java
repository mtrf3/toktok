package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N4N extends F9E {
    public final Aweme LJLIL;
    public final N4L LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public N4N(Aweme aweme, N4L playState) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(playState, "playState");
        this.LJLIL = aweme;
        this.LJLILLLLZI = playState;
    }

    public static N4N L(N4N n4n, N4L playState) {
        Aweme aweme = n4n.LJLIL;
        n4n.getClass();
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(playState, "playState");
        return new N4N(aweme, playState);
    }
}
