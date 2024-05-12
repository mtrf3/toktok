package X;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.pages.BindContainerKt$showBottomContainer$1$1$1", f = "BindContainer.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aLV, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93105aLV extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C1ZD LJLIL;
    public final /* synthetic */ ViewGroup LJLILLLLZI;
    public final /* synthetic */ ComposeView LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final /* synthetic */ InterfaceC35811ar<Boolean> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93105aLV(C1ZD c1zd, ViewGroup viewGroup, ComposeView composeView, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC35811ar<Boolean> interfaceC35811ar, InterfaceC67352kd<? super C93105aLV> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c1zd;
        this.LJLILLLLZI = viewGroup;
        this.LJLJI = composeView;
        this.LJLJJI = interfaceC65784Pro;
        this.LJLJJL = interfaceC35811ar;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93105aLV(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        int i = C91902a26.LIZ[this.LJLIL.LIZLLL().ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.LJLJJL.setValue(Boolean.TRUE);
            }
        } else if (this.LJLJJL.getValue().booleanValue()) {
            C16880lQ.LJLLL(this.LJLJI, this.LJLILLLLZI);
            this.LJLJJI.invoke();
        }
        return C76800UCe.LIZ;
    }
}
