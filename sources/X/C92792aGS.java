package X;

import androidx.navigation.NavBackStackEntry;
import com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.aGS, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92792aGS extends AbstractC65781Prl implements InterfaceC88474Ynu<InterfaceC06520Nk, NavBackStackEntry, InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ PIViewModel LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92792aGS(PIViewModel pIViewModel, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, int i) {
        super(4);
        this.LJLIL = pIViewModel;
        this.LJLILLLLZI = interfaceC65784Pro;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(InterfaceC06520Nk defaultComposable, NavBackStackEntry it, InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        o.LJIIIZ(defaultComposable, "$this$defaultComposable");
        o.LJIIIZ(it, "it");
        C91857a1N.LIZ(this.LJLIL.getUiState().getErrorCode(), this.LJLILLLLZI, interfaceC24520xk, (this.LJLJI >> 9) & 112);
        return C76800UCe.LIZ;
    }
}
