package X;

import androidx.navigation.NavBackStackEntry;
import kotlin.jvm.internal.IDqS174S0200000_31;
import kotlin.jvm.internal.IDqS190S0200000_31;

/* renamed from: X.aIk, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92934aIk extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ NavBackStackEntry LJLIL;
    public final /* synthetic */ C0MC LJLILLLLZI;
    public final /* synthetic */ C92269a81 LJLJI;
    public final /* synthetic */ C92270a82 LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92934aIk(NavBackStackEntry navBackStackEntry, C1HU c1hu, C92269a81 c92269a81, C92270a82 c92270a82) {
        super(2);
        this.LJLIL = navBackStackEntry;
        this.LJLILLLLZI = c1hu;
        this.LJLJI = c92269a81;
        this.LJLJJI = c92270a82;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            NavBackStackEntry navBackStackEntry = this.LJLIL;
            C92019a3z.LIZ(navBackStackEntry, this.LJLILLLLZI, C1DJ.LJ(interfaceC24520xk2, -819895998, new IDqS190S0200000_31(this.LJLJI, navBackStackEntry, 4)), interfaceC24520xk2, 456);
            NavBackStackEntry navBackStackEntry2 = this.LJLIL;
            C24610xt.LIZIZ(navBackStackEntry2, new IDqS174S0200000_31(this.LJLJJI, navBackStackEntry2, 23), interfaceC24520xk2);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
