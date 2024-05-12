package X;

import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackBannerAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.NfF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59909NfF extends AbstractC65781Prl implements InterfaceC88471Ynr<EarlyFeedbackBannerAssem, C43I<? extends C76800UCe>, C76800UCe> {
    public static final C59909NfF LJLIL = new C59909NfF();

    public C59909NfF() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(EarlyFeedbackBannerAssem earlyFeedbackBannerAssem, C43I<? extends C76800UCe> c43i) {
        EarlyFeedbackBannerAssem selectSubscribe = earlyFeedbackBannerAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && selectSubscribe.getContainerView().isShown()) {
            selectSubscribe.I4().hv0();
        }
        return C76800UCe.LIZ;
    }
}
