package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ufr.UFRCache$Facebook$uploadForAuthorizedUsers$1", f = "UFRCache.kt", l = {248, 235}, m = "invokeSuspend")
/* renamed from: X.9Xr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238519Xr extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public InterfaceC75422xe LJLIL;
    public int LJLILLLLZI;

    public C238519Xr(InterfaceC67352kd<? super C238519Xr> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C238519Xr(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC75422xe interfaceC75422xe;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        interfaceC75422xe = this.LJLIL;
                        try {
                            C141335gf.LIZJ(obj);
                            interfaceC75422xe.LIZIZ(null);
                            return C76800UCe.LIZ;
                        } catch (Throwable th) {
                            th = th;
                            interfaceC75422xe.LIZIZ(null);
                            throw th;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC75422xe = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                interfaceC75422xe = C77134UPa.LIZIZ;
                this.LJLIL = interfaceC75422xe;
                this.LJLILLLLZI = 1;
                if (interfaceC75422xe.LIZ(null, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            InterfaceC237509Tu LJI = UTK.LIZIZ.LJI();
            EnumC58085Mqv enumC58085Mqv = EnumC58085Mqv.UNKNOWN;
            this.LJLIL = interfaceC75422xe;
            this.LJLILLLLZI = 2;
            if (LJI.LIZ(enumC58085Mqv, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
            interfaceC75422xe.LIZIZ(null);
            return C76800UCe.LIZ;
        } catch (Throwable th2) {
            th = th2;
            interfaceC75422xe.LIZIZ(null);
            throw th;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C238519Xr(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
