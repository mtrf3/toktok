package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.friends.utils.ContactUploadUtil$uploadContactWhenFetchABConfig$1$isSyncSuccess$1", f = "ContactUploadUtil.kt", l = {93}, m = "invokeSuspend")
/* renamed from: X.9Tq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237469Tq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;

    public C237469Tq(InterfaceC67352kd<? super C237469Tq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C237469Tq(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                InterfaceC237529Tw LIZJ = UTK.LIZIZ.LIZJ();
                EnumC58085Mqv enumC58085Mqv = EnumC58085Mqv.COLD_START;
                this.LJLIL = 1;
                obj = LIZJ.LIZ(enumC58085Mqv, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            z = ((Boolean) obj).booleanValue();
        } catch (Exception unused) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return new C237469Tq(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
