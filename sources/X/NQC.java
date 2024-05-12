package X;

import android.content.Context;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NQC implements InterfaceC59326NQc {
    public final NQ2 LIZ;
    public final Aweme LIZIZ;
    public final DataCenter LIZJ;
    public final Context LIZLLL;

    @Override // X.InterfaceC59326NQc
    public final NQ2 LJFF() {
        return this.LIZ;
    }

    @Override // X.InterfaceC59326NQc
    public final DataCenter LLI() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC59326NQc
    public final Aweme getAweme() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC44391HbX
    public final Context getContext() {
        return this.LIZLLL;
    }

    public NQC(C59316NPs c59316NPs) {
        NQ2 nq2 = c59316NPs.LLD;
        if (nq2 != null) {
            this.LIZ = nq2;
            this.LIZIZ = c59316NPs.LJLJLJ;
            this.LIZJ = c59316NPs.LJLLJ;
            this.LIZLLL = c59316NPs.LJLLI;
            return;
        }
        o.LJIJI("nativeAdBottomLabelView");
        throw null;
    }
}
