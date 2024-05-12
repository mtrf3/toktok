package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBottomNavBarWidget;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBottomNavBarWidget$setAddCartClickAction$1$4$1", f = "PdpBottomNavBarWidget.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Arl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27561Arl extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ PdpBottomNavBarWidget LJLJJI;
    public final /* synthetic */ View LJLJJL;
    public final /* synthetic */ Object LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27561Arl(boolean z, View view, String str, PdpBottomNavBarWidget pdpBottomNavBarWidget, View view2, Object obj, InterfaceC67352kd<? super C27561Arl> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = z;
        this.LJLILLLLZI = view;
        this.LJLJI = str;
        this.LJLJJI = pdpBottomNavBarWidget;
        this.LJLJJL = view2;
        this.LJLJJLL = obj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27561Arl(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (!this.LJLIL) {
            C26049AKf.LIZ(this.LJLILLLLZI, this.LJLJI);
            return C76800UCe.LIZ;
        }
        PdpViewModel viewModel = this.LJLJJI.getViewModel();
        Context context = this.LJLILLLLZI.getContext();
        o.LJIIIIZZ(context, "it.context");
        viewModel.Pv0(context, this.LJLJJL, this.LJLJI, this.LJLJJLL, LifecycleOwnerKt.getLifecycleScope(this.LJLJJI));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
