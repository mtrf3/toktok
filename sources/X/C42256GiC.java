package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.GiC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42256GiC extends F9E {
    public final int LJLIL;
    public final Aweme LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI};
    }

    public C42256GiC(int i, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        this.LJLIL = i;
        this.LJLILLLLZI = aweme;
    }
}
