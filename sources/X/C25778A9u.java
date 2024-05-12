package X;

import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS16S1400000_13;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("main_social_user_recommend")
/* renamed from: X.A9u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25778A9u extends AbstractC55363Lo7 {
    public final ActivityC45651qj LJLIL;
    public final InterfaceC25781A9x LJLILLLLZI;
    public final String LJLJI;
    public final Aweme LJLJJI;
    public final InterfaceC65784Pro<C76800UCe> LJLJJL;
    public final InterfaceC88472Yns<AA5, C76800UCe> LJLJJLL;
    public final int LJLJL;

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJL;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        String str;
        String authorUid;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        this.LJLJJL.invoke();
        C57738MlK.LIZIZ.LJIIIIZZ(this.LJLJI);
        FeedCommonService LJJIJLIJ = CommonFeedServiceImpl.LJJIJLIJ();
        String str2 = this.LJLJI;
        Aweme aweme = this.LJLJJI;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        Aweme aweme2 = this.LJLJJI;
        if (aweme2 != null && (authorUid = aweme2.getAuthorUid()) != null) {
            str3 = authorUid;
        }
        LJJIJLIJ.LJIILJJIL(str2, str, str3, "4");
        InterfaceC25781A9x interfaceC25781A9x = this.LJLILLLLZI;
        FragmentManager supportFragmentManager = this.LJLIL.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
        StringBuilder LIZ = X1D.LIZ();
        interfaceC25781A9x.LJIIZILJ(supportFragmentManager, JBR.LJFF(LIZ, this.LJLJI, "_RecUserPopup", LIZ), new AqS135S0200000_4(this, wrapper, 295));
    }

    @Override // X.M74
    public final void showPopupFailed(int i, String errMsg) {
        o.LJIIIZ(errMsg, "errMsg");
        super.showPopupFailed(i, errMsg);
        C188727au LIZJ = C78920UyC.LIZJ(i, "errorcode");
        LIZJ.LJIIIZ("errorMsg", errMsg);
        FMX.LJIIL("social_pop_fail_reason", LIZJ.LIZ);
    }

    public C25778A9u(ActivityC45651qj activity, InterfaceC25781A9x recUserPopup, String enterFrom, Aweme aweme, AqS163S0100000_13 aqS163S0100000_13, AqS16S1400000_13 aqS16S1400000_13) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(recUserPopup, "recUserPopup");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLIL = activity;
        this.LJLILLLLZI = recUserPopup;
        this.LJLJI = enterFrom;
        this.LJLJJI = aweme;
        this.LJLJJL = aqS163S0100000_13;
        this.LJLJJLL = aqS16S1400000_13;
        this.LJLJL = 230;
    }
}
