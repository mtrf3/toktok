package X;

import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackButtonAssem;
import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.NfT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59923NfT extends AbstractC65781Prl implements InterfaceC88471Ynr<EarlyFeedbackButtonAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final C59923NfT LJLIL = new C59923NfT();

    public C59923NfT() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(EarlyFeedbackButtonAssem earlyFeedbackButtonAssem, C43I<? extends C195357lb> c43i) {
        EarlyFeedbackButtonAssem selectSubscribe = earlyFeedbackButtonAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && selectSubscribe.getContainerView().isShown()) {
            EarlyFeedbackVM q4 = selectSubscribe.q4();
            String aid = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid();
            String groupId = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getGroupId();
            C43I<Boolean> c43i2 = q4.getState().LJLIL;
            if (c43i2 == null || !c43i2.LIZ.booleanValue()) {
                q4.setStateImmediate(C59928NfY.LJLIL);
                q4.hv0();
                q4.gv0().LJFF(aid, groupId, EnumC59921NfR.BUTTON, EnumC36001EAz.SWIPE, q4.LJLILLLLZI);
            }
        }
        return C76800UCe.LIZ;
    }
}
