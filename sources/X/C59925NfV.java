package X;

import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackButtonAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.NfV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59925NfV extends AbstractC65781Prl implements InterfaceC88471Ynr<EarlyFeedbackButtonAssem, C43I<? extends C76800UCe>, C76800UCe> {
    public static final C59925NfV LJLIL = new C59925NfV();

    public C59925NfV() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(EarlyFeedbackButtonAssem earlyFeedbackButtonAssem, C43I<? extends C76800UCe> c43i) {
        EarlyFeedbackButtonAssem selectSubscribe = earlyFeedbackButtonAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && selectSubscribe.getContainerView().isShown()) {
            selectSubscribe.q4().hv0();
        }
        return C76800UCe.LIZ;
    }
}
