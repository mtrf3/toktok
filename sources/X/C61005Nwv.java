package X;

import com.lynx.tasm.LynxError;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS157S0200000_10;

/* renamed from: X.Nwv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61005Nwv extends AbstractC60815Ntr {
    public final int LJLILLLLZI;
    public final InterfaceC65784Pro<C76800UCe> LJLJI;
    public final InterfaceC88472Yns<LynxError, C76800UCe> LJLJJI;

    @Override // X.AbstractC60815Ntr, X.InterfaceC60819Ntv
    public final void LJIL(InterfaceC60710NsA interfaceC60710NsA) {
        if (C61004Nwu.LIZ[interfaceC60710NsA.getType().ordinal()] == 1) {
            C60606NqU c60606NqU = (C60606NqU) interfaceC60710NsA;
            c60606NqU.LJ = Integer.valueOf(this.LJLILLLLZI);
            c60606NqU.LJI(new C61006Nww(this));
        }
    }

    public C61005Nwv(int i, AqS157S0200000_10 aqS157S0200000_10, AqS141S0200000_10 aqS141S0200000_10) {
        this.LJLILLLLZI = i;
        this.LJLJI = aqS157S0200000_10;
        this.LJLJJI = aqS141S0200000_10;
    }
}
