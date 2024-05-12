package X;

import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.EcMessageApi;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.RegisterTaskRequestBody;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.audience.api.EcMessageApi$Companion$registerTask$1", f = "EcMessageApi.kt", l = {73, 78}, m = "invokeSuspend")
/* renamed from: X.2vB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73892vB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73892vB(long j, String str, String str2, String str3, InterfaceC67352kd<? super C73892vB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = j;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C73892vB(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            long j = this.LJLILLLLZI;
            this.LJLIL = 1;
            if (C1JD.LIZJ(j, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        EcMessageApi ecMessageApi = (EcMessageApi) C74662wQ.LIZ(EcMessageApi.class);
        RegisterTaskRequestBody registerTaskRequestBody = new RegisterTaskRequestBody(this.LJLJI, this.LJLJJI, this.LJLJJL);
        this.LJLIL = 2;
        if (ecMessageApi.registerTask(registerTaskRequestBody, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
