package X;

import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationDetailFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.XbJ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85145XbJ extends AbstractC65781Prl implements InterfaceC88472Yns<ARN, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ TwoStepVerificationDetailFragment LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85145XbJ(String str, TwoStepVerificationDetailFragment twoStepVerificationDetailFragment, String str2, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = twoStepVerificationDetailFragment;
        this.LJLJI = str2;
        this.LJLJJI = z;
        this.LJLJJL = interfaceC65784Pro;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARN it) {
        o.LJIIIZ(it, "it");
        String str = this.LJLIL;
        String enterFrom = this.LJLILLLLZI.getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        C85144XbI.LIZJ("update", str, enterFrom);
        String str2 = this.LJLJI;
        String enterFrom2 = this.LJLILLLLZI.getEnterFrom();
        o.LJIIIIZZ(enterFrom2, "enterFrom");
        C85144XbI.LJJIIZ(str2, enterFrom2);
        if (this.LJLJJI) {
            String enterFrom3 = this.LJLILLLLZI.getEnterFrom();
            o.LJIIIIZZ(enterFrom3, "enterFrom");
            String popupType = this.LJLIL;
            o.LJIIIZ(popupType, "popupType");
            C188727au LJFF = C85144XbI.LJFF();
            LJFF.LJIIIZ("enter_from", enterFrom3);
            LJFF.LJIIIZ("popup_type", popupType);
            LJFF.LJIIIZ("flow_type", "update");
            FMX.LJIIL("twosv_setup_update_confirmation_show", LJFF.LIZ);
        }
        this.LJLJJL.invoke();
        return C76800UCe.LIZ;
    }
}
