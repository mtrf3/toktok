package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.ies.im.core.client.ConversationModelImpl$updateLocalExtNoInfoCallback$1", f = "ConversationModelImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Hp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81453Hp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C120184ne LJLIL;
    public final /* synthetic */ java.util.Map<String, String> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81453Hp(C120184ne c120184ne, java.util.Map<String, String> map, InterfaceC67352kd<? super C81453Hp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c120184ne;
        this.LJLILLLLZI = map;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C81453Hp(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C63133Oq9.LJJII(this.LJLIL.LIZIZ, this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
