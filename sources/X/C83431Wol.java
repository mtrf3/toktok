package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.action.microaction.text.AddTextOneAction$selectionUIMicroAction$1$onChange$2", f = "AddTextOneAction.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Wol, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83431Wol extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C83435Wop LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83431Wol(C83435Wop c83435Wop, InterfaceC67352kd<? super C83431Wol> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c83435Wop;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C83431Wol(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC83402WoI LIZIZ;
        C141335gf.LIZJ(obj);
        AbstractC82626Wbm<InterfaceC83402WoI> abstractC82626Wbm = this.LJLIL.LIZIZ;
        if (abstractC82626Wbm != null && (LIZIZ = abstractC82626Wbm.LIZIZ()) != null) {
            LIZIZ.Qk();
            return C76800UCe.LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
