package X;

import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackBannerAssem;
import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackVM;
import kotlin.jvm.internal.o;

/* renamed from: X.NfE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59908NfE extends AbstractC65781Prl implements InterfaceC88471Ynr<EarlyFeedbackBannerAssem, C43I<? extends C76800UCe>, C76800UCe> {
    public static final C59908NfE LJLIL = new C59908NfE();

    public C59908NfE() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(EarlyFeedbackBannerAssem earlyFeedbackBannerAssem, C43I<? extends C76800UCe> c43i) {
        EarlyFeedbackBannerAssem selectSubscribe = earlyFeedbackBannerAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && selectSubscribe.getContainerView().isShown()) {
            EarlyFeedbackVM I4 = selectSubscribe.I4();
            I4.getClass();
            I4.LJLJI = System.currentTimeMillis();
        }
        return C76800UCe.LIZ;
    }
}
