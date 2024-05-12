package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS32S0100100_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LAS extends AbstractC65781Prl implements InterfaceC88472Yns<ARI, C76800UCe> {
    public final /* synthetic */ ActivityC45651qj LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LAS(ActivityC45651qj activityC45651qj, InterfaceC65784Pro interfaceC65784Pro, long j, C85307Xdv c85307Xdv) {
        super(1);
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = interfaceC65784Pro;
        this.LJLJI = j;
        this.LJLJJI = c85307Xdv;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARI ari) {
        String string;
        String string2;
        ARI actionGroup = ari;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        if (C52190Ke2.LIZ() == 3) {
            string = this.LJLIL.getString(R.string.gsn);
        } else {
            string = this.LJLIL.getString(R.string.gso);
        }
        o.LJIIIIZZ(string, "if (FypLocationPermissio…a6)\n                    }");
        actionGroup.LJII(string, new AqS32S0100100_9(this.LJLILLLLZI, (InterfaceC65784Pro<C76800UCe>) this.LJLJI, 0));
        if (C52190Ke2.LIZ() == 3) {
            string2 = this.LJLIL.getString(R.string.gsl);
        } else {
            string2 = this.LJLIL.getString(R.string.gsm);
        }
        o.LJIIIIZZ(string2, "if (FypLocationPermissio…a4)\n                    }");
        actionGroup.LJII(string2, new AqS32S0100100_9(this.LJLJJI, (InterfaceC65784Pro<C76800UCe>) this.LJLJI, 1));
        return C76800UCe.LIZ;
    }
}
