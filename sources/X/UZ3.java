package X;

import com.ss.android.ugc.aweme.account.experiment.prompt.ShowPromptToConfirmDynamicDataExperiment;
import kotlin.jvm.internal.AqS13S1201000_13;
import kotlin.jvm.internal.AqS17S1101000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UZ3 extends AbstractC65781Prl implements InterfaceC88472Yns<ARI, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ ShowPromptToConfirmDynamicDataExperiment.MetaData LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ UZ8 LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ ActivityC45651qj LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UZ3(String str, ShowPromptToConfirmDynamicDataExperiment.MetaData metaData, String str2, UZ8 uz8, int i, ActivityC45651qj activityC45651qj) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = metaData;
        this.LJLJI = str2;
        this.LJLJJI = uz8;
        this.LJLJJL = i;
        this.LJLJJLL = activityC45651qj;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARI ari) {
        ARI actionGroup = ari;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        String region = this.LJLIL;
        o.LJIIIIZZ(region, "region");
        if (UZ1.LIZIZ(region)) {
            actionGroup.LJII(this.LJLILLLLZI.verifyEmailPhonePopupStrings.autoConfirmPopupConfirmPhone, new AqS17S1101000_13(this.LJLJI, this.LJLJJI, this.LJLJJL, 2));
            actionGroup.LJIIIZ(this.LJLILLLLZI.verifyEmailPhonePopupStrings.nonAutoConfirmPopupNotnowPhone, new AqS17S1101000_13(this.LJLJI, this.LJLJJI, this.LJLJJL, 3));
        } else {
            actionGroup.LJII(this.LJLILLLLZI.verifyEmailPhonePopupStrings.nonAutoConfirmPopupConfirmPhone, new AqS17S1101000_13(this.LJLJI, this.LJLJJI, this.LJLJJL, 4));
            actionGroup.LJIIIZ(this.LJLILLLLZI.verifyEmailPhonePopupStrings.autoConfirmPopupUpdateEmail, new AqS13S1201000_13(this.LJLJJL, this.LJLJJLL, this.LJLJJI, this.LJLJI, 0));
        }
        return C76800UCe.LIZ;
    }
}
