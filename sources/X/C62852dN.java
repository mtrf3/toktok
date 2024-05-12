package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.HandleShareProcessModel$showGreenScreenEffectFailDialog$1", f = "HandleShareProcessModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2dN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62852dN extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C26227ARb LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62852dN(C26227ARb c26227ARb, InterfaceC67352kd<? super C62852dN> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c26227ARb;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C62852dN(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJI().LIZLLL();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
