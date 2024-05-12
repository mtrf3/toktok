package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.contact.helper.IMContactManager$fetchContactAsyncInternal$2", f = "IMContactManager.kt", l = {183}, m = "invokeSuspend")
/* renamed from: X.2vw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74362vw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;

    public C74362vw(InterfaceC67352kd<? super C74362vw> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C74362vw(interfaceC67352kd);
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
            C85913Yt c85913Yt = C85913Yt.LIZ;
            this.LJLIL = 1;
            obj = c85913Yt.LIZJ(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C85913Yt c85913Yt2 = C85913Yt.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetchContactAsyncInternal: result=");
        LIZ.append(booleanValue);
        String LIZIZ = X1D.LIZIZ(LIZ);
        c85913Yt2.getClass();
        C85913Yt.LJIIIIZZ(LIZIZ);
        if (booleanValue) {
            C3ZG.LIZ.LIZ().storeLong("key_contact_list_fetch_timestamp", System.currentTimeMillis());
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C74362vw(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
