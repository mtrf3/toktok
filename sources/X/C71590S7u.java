package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.assem.TemplateEditBottomAreaAssem$onViewCreated$2$1$templatePreviewImageFilepath$1", f = "TemplateEditBottomAreaAssem.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.S7u, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71590S7u extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public final /* synthetic */ S87 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71590S7u(S87 s87, InterfaceC67352kd<? super C71590S7u> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = s87;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71590S7u(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return this.LJLIL.f3();
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
