package X;

import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackBannerAssem;
import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.NfL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59915NfL extends AbstractC65781Prl implements InterfaceC88471Ynr<EarlyFeedbackBannerAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C59915NfL LJLIL = new C59915NfL();

    public C59915NfL() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(EarlyFeedbackBannerAssem earlyFeedbackBannerAssem, C43I<? extends Integer> c43i) {
        EarlyFeedbackBannerAssem selectSubscribe = earlyFeedbackBannerAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && selectSubscribe.getContainerView().isShown()) {
            EarlyFeedbackVM I4 = selectSubscribe.I4();
            String aid = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid();
            String groupId = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getGroupId();
            I4.getClass();
            I4.LJLJI = System.currentTimeMillis();
            I4.LJLILLLLZI = 0L;
            I4.gv0().LIZ(aid, groupId, EnumC59921NfR.BANNER);
        }
        return C76800UCe.LIZ;
    }
}
