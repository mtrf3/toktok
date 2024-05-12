package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.Jqz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50445Jqz extends AbstractC65781Prl implements InterfaceC88471Ynr<C50322Jp0, C50446Jr0, C50322Jp0> {
    public static final C50445Jqz LJLIL = new C50445Jqz();

    public C50445Jqz() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C50322Jp0 invoke(C50322Jp0 c50322Jp0, C50446Jr0 c50446Jr0) {
        C50322Jp0 lastState = c50322Jp0;
        C50446Jr0 action = c50446Jr0;
        o.LJIIIZ(lastState, "lastState");
        o.LJIIIZ(action, "action");
        Aweme aweme = action.LJLIL;
        if (aweme != null && aweme.getAid() != null && !action.LJLIL.getIsSubAweme() && !action.LJLIL.isAd() && !action.LJLIL.isLive()) {
            java.util.Set<String> set = lastState.LJLLLLLL;
            String aid = action.LJLIL.getAid();
            o.LJIIIIZZ(aid, "action.aweme.aid");
            set.add(aid);
        }
        return C50322Jp0.LIZ(lastState, 0, null, null, null, null, 0, 0, null, null, null, null, false, false, null, lastState.LJLLLLLL, false, null, null, 1015807);
    }
}
