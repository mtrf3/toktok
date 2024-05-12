package X;

import android.content.Context;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.base.BaToastKt$showBaToast$1", f = "BaToast.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2de, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63022de extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63022de(Context context, String str, int i, InterfaceC67352kd<? super C63022de> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = context;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63022de(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C16880lQ.LLZILL(new C135095Rx(this.LJLIL, this.LJLJI, this.LJLILLLLZI).LIZ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
