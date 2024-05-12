package X;

import com.ss.android.ugc.aweme.nows.feed.ui.NowMyPostLoadingViewAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7n0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196227n0 extends AbstractC65781Prl implements InterfaceC88471Ynr<NowMyPostLoadingViewAssem, AbstractC194637kR, C76800UCe> {
    public static final C196227n0 LJLIL = new C196227n0();

    public C196227n0() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(NowMyPostLoadingViewAssem nowMyPostLoadingViewAssem, AbstractC194637kR abstractC194637kR) {
        NowMyPostLoadingViewAssem subscribePostState = nowMyPostLoadingViewAssem;
        AbstractC194637kR state = abstractC194637kR;
        o.LJIIIZ(subscribePostState, "$this$subscribePostState");
        o.LJIIIZ(state, "state");
        if (state instanceof C194617kP) {
            subscribePostState.m4(((C194617kP) state).LIZJ, true);
        }
        return C76800UCe.LIZ;
    }
}
