package X;

import com.ss.android.ugc.aweme.ui.DubbingStatusAssem;
import com.ss.android.ugc.aweme.ui.DubbingStatusViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y2T extends AbstractC65781Prl implements InterfaceC88471Ynr<DubbingStatusAssem, C43I<? extends String>, C76800UCe> {
    public static final Y2T LJLIL = new Y2T();

    public Y2T() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(DubbingStatusAssem dubbingStatusAssem, C43I<? extends String> c43i) {
        DubbingStatusAssem selectSubscribe = dubbingStatusAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            DubbingStatusViewModel q4 = selectSubscribe.q4();
            q4.LJZI = false;
            q4.LJLLILLLL.removeCallbacksAndMessages(null);
        }
        return C76800UCe.LIZ;
    }
}
