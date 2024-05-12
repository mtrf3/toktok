package X;

import android.content.Context;
import com.ss.android.ugc.aweme.account.login.twostep.AddVerificationResponse;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationDetailFragment;
import kotlin.jvm.internal.AqS2S2110000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XbK, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85146XbK extends AbstractC65781Prl implements InterfaceC88472Yns<ARN, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ TwoStepVerificationDetailFragment LJLILLLLZI;
    public final /* synthetic */ Boolean LJLJI;
    public final /* synthetic */ AddVerificationResponse LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ Context LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ boolean LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85146XbK(String str, TwoStepVerificationDetailFragment twoStepVerificationDetailFragment, Boolean bool, AddVerificationResponse addVerificationResponse, String str2, Context context, String str3, String str4, boolean z) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = twoStepVerificationDetailFragment;
        this.LJLJI = bool;
        this.LJLJJI = addVerificationResponse;
        this.LJLJJL = str2;
        this.LJLJJLL = context;
        this.LJLJL = str3;
        this.LJLJLJ = str4;
        this.LJLJLLL = z;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARN it) {
        o.LJIIIZ(it, "it");
        String str = this.LJLIL;
        String enterFrom = this.LJLILLLLZI.getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        C85144XbI.LIZJ("confirm", str, enterFrom);
        if (o.LJ(this.LJLJI, Boolean.FALSE)) {
            String enterFrom2 = this.LJLILLLLZI.getEnterFrom();
            o.LJIIIIZZ(enterFrom2, "enterFrom");
            String popupType = this.LJLIL;
            o.LJIIIZ(popupType, "popupType");
            C188727au LJFF = C85144XbI.LJFF();
            LJFF.LJIIIZ("enter_from", enterFrom2);
            LJFF.LJIIIZ("popup_type", popupType);
            FMX.LJIIL("twosv_setup_update_turnoff_show", LJFF.LIZ);
            TwoStepVerificationDetailFragment twoStepVerificationDetailFragment = this.LJLILLLLZI;
            twoStepVerificationDetailFragment.LJLL = this.LJLIL;
            twoStepVerificationDetailFragment.Il(this.LJLJJI, this.LJLJJL);
        } else {
            String enterFrom3 = this.LJLILLLLZI.getEnterFrom();
            o.LJIIIIZZ(enterFrom3, "enterFrom");
            String popupType2 = this.LJLIL;
            o.LJIIIZ(popupType2, "popupType");
            C188727au LJFF2 = C85144XbI.LJFF();
            LJFF2.LJIIIZ("enter_from", enterFrom3);
            LJFF2.LJIIIZ("popup_type", popupType2);
            FMX.LJIIL("twosv_setup_update_remove_show", LJFF2.LIZ);
            String str2 = this.LJLJJL;
            String enterFrom4 = this.LJLILLLLZI.getEnterFrom();
            o.LJIIIIZZ(enterFrom4, "enterFrom");
            C85144XbI.LJJIIJZLJL(str2, enterFrom4);
            C26227ARb c26227ARb = new C26227ARb(this.LJLJJLL);
            c26227ARb.LJFF(this.LJLJL);
            c26227ARb.LIZIZ(this.LJLJLJ);
            UC0.LIZJ(c26227ARb, new AqS2S2110000_15(this.LJLJJL, this.LJLILLLLZI, this.LJLIL, this.LJLJLLL, 1));
            c26227ARb.LJI().LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
