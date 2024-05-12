package X;

import com.ss.android.ugc.aweme.compliance.business.contentpreferences.personalizedfeed.ManageFeedsPanelFragment;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;

/* loaded from: classes5.dex */
public final class A7N extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ ManageFeedsPanelFragment LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A7N(boolean z, ManageFeedsPanelFragment manageFeedsPanelFragment) {
        super(2);
        this.LJLIL = z;
        this.LJLILLLLZI = manageFeedsPanelFragment;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if ((num.intValue() & 11) != 2 || !interfaceC24520xk2.LIZ()) {
            V5N.LIZ(this.LJLIL, new AqS170S0100000_4(this.LJLILLLLZI, 155), new AqS170S0100000_4(this.LJLILLLLZI, 156), new AqS170S0100000_4(this.LJLILLLLZI, 157), new AqS154S0100000_4(this.LJLILLLLZI, 73), new AqS170S0100000_4(this.LJLILLLLZI, 158), interfaceC24520xk2, 0);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
