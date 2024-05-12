package X;

import fjb.a;
import java.util.LinkedHashMap;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.templatedownload.ResizeMediasManager$waitJobResult$1", f = "ResizeMediasManager.kt", l = {93}, m = "invokeSuspend")
/* renamed from: X.2kD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67092kD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67092kD(String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super C67092kD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C67092kD(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C67102kE c67102kE;
        InterfaceC68342mE<C76800UCe> interfaceC68342mE;
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
            String str = this.LJLILLLLZI;
            if (str == null || str.length() == 0) {
                c67102kE = null;
            } else {
                c67102kE = (C67102kE) ((LinkedHashMap) C5KN.LIZ).get(str);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("waitJobResult: resizeJob = ");
            LIZ.append(c67102kE);
            C5KN.LIZJ(X1D.LIZIZ(LIZ));
            if (c67102kE != null && (interfaceC68342mE = c67102kE.LIZ) != null) {
                this.LJLIL = 1;
                if (interfaceC68342mE.LJI(this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        this.LJLJI.invoke();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
