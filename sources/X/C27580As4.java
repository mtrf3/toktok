package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.preloader.ImageLogReporter$onComplete$3$2", f = "ImageLogReporter.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.As4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27580As4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C27583As7 LJLIL;
    public final /* synthetic */ C72242sW LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27580As4(C27583As7 c27583As7, C72242sW c72242sW, InterfaceC67352kd<? super C27580As4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c27583As7;
        this.LJLILLLLZI = c72242sW;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27580As4(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C27583As7 c27583As7 = this.LJLIL;
        c27583As7.LJII = this.LJLILLLLZI.element;
        c27583As7.LJIIJ++;
        c27583As7.LJ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
