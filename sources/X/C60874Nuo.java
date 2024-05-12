package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.ECAudienceWidget$onSlotCreated$4$3", f = "ECAudienceWidget.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Nuo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60874Nuo extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C71188Rwm LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60874Nuo(C71188Rwm c71188Rwm, InterfaceC67352kd<? super C60874Nuo> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c71188Rwm;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C60874Nuo(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LLIIII = System.currentTimeMillis();
        C71188Rwm c71188Rwm = this.LJLIL;
        C71188Rwm.LJIJJLI(c71188Rwm, null, "ec_open_live_bag", C27739Aud.LJII(c71188Rwm.LLF), 8);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
