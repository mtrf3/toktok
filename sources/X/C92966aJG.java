package X;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.internal.IDqS178S0200000_31;

/* renamed from: X.aJG, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92966aJG extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ InterfaceC35811ar<Boolean> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ ViewGroup LJLJJL;
    public final /* synthetic */ ComposeView LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92966aJG(InterfaceC35811ar<Boolean> interfaceC35811ar, String str, long j, boolean z, ViewGroup viewGroup, ComposeView composeView) {
        super(2);
        this.LJLIL = interfaceC35811ar;
        this.LJLILLLLZI = str;
        this.LJLJI = j;
        this.LJLJJI = z;
        this.LJLJJL = viewGroup;
        this.LJLJJLL = composeView;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            C92030a4A.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, new IDqS178S0200000_31(this.LJLJJL, this.LJLJJLL, 34), interfaceC24520xk2, 0, 0);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
