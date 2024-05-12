package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.anchor.maker.ShopWindowAnchorMaker$onVideoSelect$4", f = "ShopWindowAnchorMaker.kt", l = {327}, m = "invokeSuspend")
/* renamed from: X.2sd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72312sd extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C72242sW LJLILLLLZI;
    public final /* synthetic */ C71362Rza LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72312sd(C72242sW c72242sW, C71362Rza c71362Rza, InterfaceC67352kd<? super C72312sd> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c72242sW;
        this.LJLJI = c71362Rza;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C72312sd(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            long j = this.LJLILLLLZI.element;
            this.LJLIL = 1;
            if (C1JD.LIZJ(j, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        RunnableC71356RzU runnableC71356RzU = this.LJLJI.LJFF;
        if (runnableC71356RzU != null) {
            runnableC71356RzU.run();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
