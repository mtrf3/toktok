package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.story.StoryWidgetMgr$checkFeatureEnv$2", f = "StoryWidgetMgr.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.EOk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36350EOk extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;

    public C36350EOk(InterfaceC67352kd<? super C36350EOk> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C36350EOk c36350EOk = new C36350EOk(interfaceC67352kd);
        c36350EOk.LJLIL = obj;
        return c36350EOk;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLIL;
        if (AV1.LJIILLIIL()) {
            C48841JEv.LIZJ(interfaceC70422pa, C62848OlY.LIZ("kids mode open", new C36351EOl("kids mode open", null, 2, null)));
        }
        if (((Number) C53108Ksq.LIZ.getValue()).intValue() == 0 || !C55723Ltv.LIZIZ.LJIIJ()) {
            C48841JEv.LIZJ(interfaceC70422pa, C62848OlY.LIZ("feature close", new C36352EOm("feature close", null, 2, null)));
        }
        HG3.LJIIL();
        if (!HG3.LJLJL.LJFF().isLogin()) {
            C48841JEv.LIZJ(interfaceC70422pa, C62848OlY.LIZ("not login", new C36352EOm("not login", null, 2, null)));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
