package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.search.data.searchcontent.GroupSearchContentUpdateEngine$_coldStartUpdateFlow$1", f = "GroupSearchContentUpdateEngine.kt", l = {97}, m = "invokeSuspend")
/* renamed from: X.3Py, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83623Py extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC64672gJ<? super C3Q5>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;

    public C83623Py(InterfaceC67352kd<? super C83623Py> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C83623Py c83623Py = new C83623Py(interfaceC67352kd);
        c83623Py.LJLILLLLZI = obj;
        return c83623Py;
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
            InterfaceC64672gJ interfaceC64672gJ = (InterfaceC64672gJ) this.LJLILLLLZI;
            C3Q6 c3q6 = C3Q6.REPLACE_ALL;
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            C3Q5 c3q5 = new C3Q5(c3q6, C4WC.LJIILL());
            this.LJLIL = 1;
            if (interfaceC64672gJ.emit(c3q5, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC64672gJ<? super C3Q5> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC64672gJ, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
