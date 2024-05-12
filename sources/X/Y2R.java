package X;

import com.ss.android.ugc.aweme.ui.DubbingStatusAssem;
import com.ss.android.ugc.aweme.ui.DubbingStatusViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y2R extends AbstractC65781Prl implements InterfaceC88471Ynr<DubbingStatusAssem, C43I<? extends String>, C76800UCe> {
    public static final Y2R LJLIL = new Y2R();

    public Y2R() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(DubbingStatusAssem dubbingStatusAssem, C43I<? extends String> c43i) {
        DubbingStatusAssem selectSubscribe = dubbingStatusAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            DubbingStatusViewModel q4 = selectSubscribe.q4();
            q4.LJZI = true;
            if (q4.LJLLLLLL != Y2X.NO_STATE_CHANGE) {
                q4.LJLLILLLL.removeCallbacksAndMessages(null);
                q4.LJLLILLLL.postDelayed(q4.LJLLJ, q4.LJLLI);
            }
        }
        return C76800UCe.LIZ;
    }
}
