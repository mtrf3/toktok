package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.ug.popup.manager.EcUgSparkManager$addSparkClientListener$1$invoke$2$onPageFinished$1", f = "EcUgSparkManager.kt", l = {199, 200}, m = "invokeSuspend")
/* renamed from: X.Foe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40108Foe extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40108Foe(int i, InterfaceC67352kd<? super C40108Foe> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C40108Foe(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    IK8.LIZIZ(this.LJLILLLLZI);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            this.LJLIL = 1;
            if (C1JD.LIZJ(5000L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLIL = 2;
        if (XJ9.LIZ(this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        IK8.LIZIZ(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
