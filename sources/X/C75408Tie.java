package X;

import kotlin.jvm.internal.o;
import tikcast.linkmic.common.LayoutState;

/* renamed from: X.Tie, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75408Tie extends AbstractC65781Prl implements InterfaceC88471Ynr<C213178Yf<LayoutState>, C213178Yf<LayoutState>, Boolean> {
    public static final C75408Tie LJLIL = new C75408Tie();

    public C75408Tie() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(C213178Yf<LayoutState> c213178Yf, C213178Yf<LayoutState> c213178Yf2) {
        String str;
        C213178Yf<LayoutState> state1 = c213178Yf;
        C213178Yf<LayoutState> state2 = c213178Yf2;
        o.LJIIIZ(state1, "state1");
        o.LJIIIZ(state2, "state2");
        LayoutState layoutState = state1.LIZ;
        String str2 = null;
        if (layoutState != null) {
            str = layoutState.layoutId;
        } else {
            str = null;
        }
        LayoutState layoutState2 = state2.LIZ;
        if (layoutState2 != null) {
            str2 = layoutState2.layoutId;
        }
        return Boolean.valueOf(o.LJ(str, str2));
    }
}
