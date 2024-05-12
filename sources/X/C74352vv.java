package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.contact.helper.IMContactManager$fetchContactList$1", f = "IMContactManager.kt", l = {170}, m = "invokeSuspend")
/* renamed from: X.2vv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74352vv extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;

    public C74352vv(InterfaceC67352kd<? super C74352vv> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C74352vv c74352vv = new C74352vv(interfaceC67352kd);
        c74352vv.LJLILLLLZI = obj;
        return c74352vv;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
                C85913Yt c85913Yt = C85913Yt.LIZ;
                this.LJLIL = 1;
                if (c85913Yt.LJI(interfaceC70422pa, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        } catch (Exception e) {
            C85913Yt c85913Yt2 = C85913Yt.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("fetchContactAsync: error=");
            LIZ.append(e.getMessage());
            String LIZIZ = X1D.LIZIZ(LIZ);
            c85913Yt2.getClass();
            C85913Yt.LJIIIIZZ(LIZIZ);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
