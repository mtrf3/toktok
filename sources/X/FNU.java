package X;

import Y.AObjectS47S0101000_2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FNU extends AbstractC65781Prl implements InterfaceC88472Yns<ARI, C76800UCe> {
    public final /* synthetic */ boolean LJLIL = false;
    public final /* synthetic */ int LJLILLLLZI = R.string.ez0;
    public final /* synthetic */ int LJLJI = R.string.eyz;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FNU(AObjectS47S0101000_2 aObjectS47S0101000_2, AObjectS47S0101000_2 aObjectS47S0101000_22) {
        super(1);
        this.LJLJJI = aObjectS47S0101000_2;
        this.LJLJJL = aObjectS47S0101000_22;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARI ari) {
        ARI actionGroup = ari;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        if (this.LJLIL) {
            actionGroup.LJ(this.LJLILLLLZI, new AqS172S0100000_6(this.LJLJJI, (InterfaceC65784Pro<C76800UCe>) 40));
        } else {
            actionGroup.LJI(this.LJLILLLLZI, new AqS172S0100000_6(this.LJLJJI, (InterfaceC65784Pro<C76800UCe>) 41));
        }
        actionGroup.LJIIIIZZ(this.LJLJI, new AqS172S0100000_6(this.LJLJJL, (InterfaceC65784Pro<C76800UCe>) 42));
        return C76800UCe.LIZ;
    }
}
