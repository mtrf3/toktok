package X;

import android.view.View;
import androidx.navigation.NavBackStackEntry;
import com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.aG3, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92767aG3 extends AbstractC65781Prl implements InterfaceC88474Ynu<InterfaceC06520Nk, NavBackStackEntry, InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ PIViewModel LJLIL;
    public final /* synthetic */ Boolean LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;
    public final /* synthetic */ C92145a61 LJLJJI;
    public final /* synthetic */ C92330a90 LJLJJL;
    public final /* synthetic */ C08370Un LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ InterfaceC35811ar<Boolean> LJLJLJ;
    public final /* synthetic */ C05P LJLJLLL;
    public final /* synthetic */ View LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92767aG3(PIViewModel pIViewModel, Boolean bool, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, C92145a61 c92145a61, C92330a90 c92330a90, C08370Un c08370Un, int i, InterfaceC35811ar<Boolean> interfaceC35811ar, C05P c05p, View view) {
        super(4);
        this.LJLIL = pIViewModel;
        this.LJLILLLLZI = bool;
        this.LJLJI = interfaceC65784Pro;
        this.LJLJJI = c92145a61;
        this.LJLJJL = c92330a90;
        this.LJLJJLL = c08370Un;
        this.LJLJL = i;
        this.LJLJLJ = interfaceC35811ar;
        this.LJLJLLL = c05p;
        this.LJLL = view;
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(InterfaceC06520Nk defaultComposable, NavBackStackEntry it, InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        num.intValue();
        o.LJIIIZ(defaultComposable, "$this$defaultComposable");
        o.LJIIIZ(it, "it");
        C91875a1f.LIZ(0.0f, 0.0f, C1DJ.LJ(interfaceC24520xk2, -819902703, new C92765aG1(this.LJLIL.getUiState().isLoading(), this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLIL.getUiState().isContentError(), this.LJLJJL, this.LJLIL, this.LJLJJLL, this.LJLJL, this.LJLIL.getUiState().getErrorCode(), this.LJLJLJ, this.LJLJLLL, this.LJLL)), interfaceC24520xk2, 384, 3);
        return C76800UCe.LIZ;
    }
}
