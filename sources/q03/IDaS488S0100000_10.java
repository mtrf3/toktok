package q03;

import X.C212428Vi;
import X.C26045AKb;
import X.C51029K0z;
import X.C55096Ljo;
import X.C59929NfZ;
import X.C59930Nfa;
import X.C98T;
import X.EnumC36001EAz;
import X.EnumC59921NfR;
import X.InterfaceC55235Lm3;
import X.KR8;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackButtonAssem;
import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public class IDaS488S0100000_10 extends C98T {
    public final int $t;
    public Object l0;

    @Override // X.C98T
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS488S0100000_10(EarlyFeedbackButtonAssem earlyFeedbackButtonAssem, int i) {
        super(300L);
        this.$t = i;
        this.l0 = earlyFeedbackButtonAssem;
    }

    public static final void LIZ$0(IDaS488S0100000_10 iDaS488S0100000_10, View view) {
        if (view != null) {
            EarlyFeedbackVM q4 = ((EarlyFeedbackButtonAssem) iDaS488S0100000_10.l0).q4();
            String aid = ((VideoItemParams) C51029K0z.LJIILLIIL((EarlyFeedbackButtonAssem) iDaS488S0100000_10.l0)).getAweme().getAid();
            String groupId = ((VideoItemParams) C51029K0z.LJIILLIIL((EarlyFeedbackButtonAssem) iDaS488S0100000_10.l0)).getAweme().getGroupId();
            q4.setStateImmediate(C59929NfZ.LJLIL);
            q4.hv0();
            q4.gv0().LJFF(aid, groupId, EnumC59921NfR.BUTTON, EnumC36001EAz.LIKE, q4.LJLILLLLZI);
            Fragment LJIIIZ = C55096Ljo.LJIIIZ((EarlyFeedbackButtonAssem) iDaS488S0100000_10.l0);
            if (LJIIIZ != null) {
                ((EarlyFeedbackButtonAssem) iDaS488S0100000_10.l0).getClass();
                C26045AKb c26045AKb = new C26045AKb(LJIIIZ);
                c26045AKb.LJIIIIZZ(R.string.a1v);
                c26045AKb.LIZ.LJLILLLLZI = 0;
                c26045AKb.LIZ(true);
                c26045AKb.LIZLLL(3000L);
                c26045AKb.LJIIJ();
            }
            ((EarlyFeedbackButtonAssem) iDaS488S0100000_10.l0).getContainerView().setVisibility(8);
        }
    }

    public static final void LIZ$1(IDaS488S0100000_10 iDaS488S0100000_10, View view) {
        InterfaceC55235Lm3 LJFF;
        IViewPagerComponentAbility iViewPagerComponentAbility;
        if (view != null) {
            EarlyFeedbackVM q4 = ((EarlyFeedbackButtonAssem) iDaS488S0100000_10.l0).q4();
            String aid = ((VideoItemParams) C51029K0z.LJIILLIIL((EarlyFeedbackButtonAssem) iDaS488S0100000_10.l0)).getAweme().getAid();
            String groupId = ((VideoItemParams) C51029K0z.LJIILLIIL((EarlyFeedbackButtonAssem) iDaS488S0100000_10.l0)).getAweme().getGroupId();
            q4.setStateImmediate(C59930Nfa.LJLIL);
            q4.hv0();
            q4.gv0().LJFF(aid, groupId, EnumC59921NfR.BUTTON, EnumC36001EAz.DISLIKE, q4.LJLILLLLZI);
            Fragment LJIIIZ = C55096Ljo.LJIIIZ((EarlyFeedbackButtonAssem) iDaS488S0100000_10.l0);
            if (LJIIIZ != null) {
                ((EarlyFeedbackButtonAssem) iDaS488S0100000_10.l0).getClass();
                C26045AKb c26045AKb = new C26045AKb(LJIIIZ);
                c26045AKb.LJIIIIZZ(R.string.a1u);
                c26045AKb.LIZ.LJLILLLLZI = 0;
                c26045AKb.LIZ(true);
                c26045AKb.LIZLLL(3000L);
                c26045AKb.LJIIJ();
            }
            EarlyFeedbackButtonAssem earlyFeedbackButtonAssem = (EarlyFeedbackButtonAssem) iDaS488S0100000_10.l0;
            earlyFeedbackButtonAssem.getClass();
            Fragment LIZLLL = C212428Vi.LIZLLL(earlyFeedbackButtonAssem);
            if (LIZLLL != null && (LJFF = KR8.LJFF(LIZLLL)) != null && (iViewPagerComponentAbility = (IViewPagerComponentAbility) C55096Ljo.LIZ(LJFF, IViewPagerComponentAbility.class, null)) != null) {
                iViewPagerComponentAbility.scrollToNext();
            }
        }
    }
}
