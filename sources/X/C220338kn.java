package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.tiktok.addyours.ui.provider.AddYoursDetailAwemeListProvider$vm$2$1$1$onFailed$1", f = "AddYoursDetailAwemeListProvider.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.8kn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220338kn extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C220378kr LJLIL;
    public final /* synthetic */ C219778jt LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C220338kn(C220378kr c220378kr, C219778jt c219778jt, InterfaceC67352kd<? super C220338kn> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c220378kr;
        this.LJLILLLLZI = c219778jt;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C220338kn(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C2U8.LIZ(new C220318kl(false, this.LJLIL.getPresenter$addyours_release(), this.LJLILLLLZI.LJLJLLL.getTopicId()));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
