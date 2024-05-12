package X;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.element.component.basic.BottomSheetKt$BottomSheetWrapper$3", f = "BottomSheet.kt", l = {111}, m = "invokeSuspend")
/* renamed from: X.aKU, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93042aKU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C1ZD LJLILLLLZI;
    public final /* synthetic */ ViewGroup LJLJI;
    public final /* synthetic */ ComposeView LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJLL;
    public final /* synthetic */ InterfaceC35811ar<Boolean> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93042aKU(C1ZD c1zd, ViewGroup viewGroup, ComposeView composeView, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC35811ar<Boolean> interfaceC35811ar, InterfaceC67352kd<? super C93042aKU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c1zd;
        this.LJLJI = viewGroup;
        this.LJLJJI = composeView;
        this.LJLJJL = interfaceC65784Pro;
        this.LJLJJLL = interfaceC65784Pro2;
        this.LJLJL = interfaceC35811ar;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93042aKU(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            if (C91662ZyE.LIZ[this.LJLILLLLZI.LIZLLL().ordinal()] == 1) {
                if (this.LJLJL.getValue().booleanValue()) {
                    C16880lQ.LJLLL(this.LJLJJI, this.LJLJI);
                    this.LJLJJL.invoke();
                } else {
                    this.LJLJJLL.invoke();
                    this.LJLJL.setValue(Boolean.TRUE);
                    C1ZD c1zd = this.LJLILLLLZI;
                    this.LJLIL = 1;
                    if (c1zd.LJIIJ(this) == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
