package X;

import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackBannerAssem;
import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.NfM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59916NfM extends AbstractC65781Prl implements InterfaceC88471Ynr<EarlyFeedbackBannerAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final C59916NfM LJLIL = new C59916NfM();

    public C59916NfM() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(EarlyFeedbackBannerAssem earlyFeedbackBannerAssem, C43I<? extends C195357lb> c43i) {
        EarlyFeedbackBannerAssem selectSubscribe = earlyFeedbackBannerAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && selectSubscribe.getContainerView().isShown()) {
            EarlyFeedbackVM I4 = selectSubscribe.I4();
            String aid = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid();
            String groupId = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getGroupId();
            C43I<Boolean> c43i2 = I4.getState().LJLIL;
            if (c43i2 == null || !c43i2.LIZ.booleanValue()) {
                I4.setStateImmediate(C59917NfN.LJLIL);
                I4.hv0();
                I4.gv0().LJFF(aid, groupId, EnumC59921NfR.BANNER, EnumC36001EAz.SWIPE, I4.LJLILLLLZI);
            }
        }
        return C76800UCe.LIZ;
    }
}
