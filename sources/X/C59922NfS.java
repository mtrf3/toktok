package X;

import Y.ARunnableS39S0100000_3;
import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackButtonAssem;
import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;
import q03.IDaS488S0100000_10;

/* renamed from: X.NfS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59922NfS extends AbstractC65781Prl implements InterfaceC88471Ynr<EarlyFeedbackButtonAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C59922NfS LJLIL = new C59922NfS();

    public C59922NfS() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(EarlyFeedbackButtonAssem earlyFeedbackButtonAssem, C43I<? extends Integer> c43i) {
        EarlyFeedbackButtonAssem selectSubscribe = earlyFeedbackButtonAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && selectSubscribe.getContainerView().isShown()) {
            SY4 sy4 = selectSubscribe.LLFZ;
            if (sy4 != null) {
                C16880lQ.LJIIJ(new IDaS488S0100000_10(selectSubscribe, 0), sy4);
            }
            SY4 sy42 = selectSubscribe.LLI;
            if (sy42 != null) {
                C16880lQ.LJIIJ(new IDaS488S0100000_10(selectSubscribe, 1), sy42);
            }
            selectSubscribe.getContainerView().post(new ARunnableS39S0100000_3(selectSubscribe, 128));
            EarlyFeedbackVM q4 = selectSubscribe.q4();
            String aid = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid();
            String groupId = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getGroupId();
            q4.getClass();
            q4.LJLJI = System.currentTimeMillis();
            q4.LJLILLLLZI = 0L;
            q4.gv0().LIZ(aid, groupId, EnumC59921NfR.BUTTON);
        }
        return C76800UCe.LIZ;
    }
}
