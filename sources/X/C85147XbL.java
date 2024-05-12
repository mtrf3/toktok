package X;

import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityAssem;
import kotlin.jvm.internal.AqS119S0300000_15;
import kotlin.jvm.internal.AqS33S0210000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XbL, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85147XbL extends AbstractC65781Prl implements InterfaceC88472Yns<ARI, C76800UCe> {
    public final /* synthetic */ C85136XbA LJLIL;
    public final /* synthetic */ C68322mC<String> LJLILLLLZI;
    public final /* synthetic */ C68322mC<String> LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ TwoStepVerificationActivityAssem LJLJJL;
    public final /* synthetic */ C85149XbN LJLJJLL;
    public final /* synthetic */ boolean LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85147XbL(C85136XbA c85136XbA, C68322mC<String> c68322mC, C68322mC<String> c68322mC2, String str, TwoStepVerificationActivityAssem twoStepVerificationActivityAssem, C85149XbN c85149XbN, boolean z) {
        super(1);
        this.LJLIL = c85136XbA;
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = c68322mC2;
        this.LJLJJI = str;
        this.LJLJJL = twoStepVerificationActivityAssem;
        this.LJLJJLL = c85149XbN;
        this.LJLJL = z;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARI ari) {
        ARI actionGroup = ari;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        if (this.LJLIL.LIZJ != EnumC85151XbP.TOTP || GJ0.LIZ()) {
            actionGroup.LJII(this.LJLILLLLZI.element, new AqS119S0300000_15(this.LJLJJL, this.LJLIL, this.LJLJJLL, 12));
        }
        actionGroup.LJII(this.LJLJI.element, new AqS33S0210000_15(this.LJLJL, this.LJLJJL, this.LJLIL, 0));
        actionGroup.LJIIIZ(this.LJLJJI, null);
        actionGroup.LJI = true;
        return C76800UCe.LIZ;
    }
}
