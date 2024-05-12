package X;

import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackButtonAssem;
import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackVM;
import kotlin.jvm.internal.o;

/* renamed from: X.NfU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59924NfU extends AbstractC65781Prl implements InterfaceC88471Ynr<EarlyFeedbackButtonAssem, C43I<? extends C76800UCe>, C76800UCe> {
    public static final C59924NfU LJLIL = new C59924NfU();

    public C59924NfU() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(EarlyFeedbackButtonAssem earlyFeedbackButtonAssem, C43I<? extends C76800UCe> c43i) {
        EarlyFeedbackButtonAssem selectSubscribe = earlyFeedbackButtonAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && selectSubscribe.getContainerView().isShown()) {
            EarlyFeedbackVM q4 = selectSubscribe.q4();
            q4.getClass();
            q4.LJLJI = System.currentTimeMillis();
        }
        return C76800UCe.LIZ;
    }
}
