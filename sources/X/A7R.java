package X;

import com.ss.android.ugc.aweme.compliance.business.contentpreferences.personalizedsearch.SearchPersonalizedPanelFragment;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS47S0110000_4;
import kotlin.jvm.internal.AqS61S0110000_4;

/* loaded from: classes5.dex */
public final class A7R extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ SearchPersonalizedPanelFragment LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A7R(boolean z, boolean z2, SearchPersonalizedPanelFragment searchPersonalizedPanelFragment) {
        super(2);
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = searchPersonalizedPanelFragment;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if ((num.intValue() & 11) != 2 || !interfaceC24520xk2.LIZ()) {
            C79165V5d.LIZ(this.LJLIL, this.LJLILLLLZI, new AqS170S0100000_4(this.LJLJI, 159), new AqS47S0110000_4(this.LJLJI, this.LJLILLLLZI, 0), new AqS47S0110000_4(this.LJLJI, this.LJLILLLLZI, 1), new AqS61S0110000_4(this.LJLJI, this.LJLILLLLZI, 0), new AqS170S0100000_4(this.LJLJI, 160), interfaceC24520xk2, 0);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
