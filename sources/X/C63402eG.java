package X;

import com.ss.android.ugc.aweme.account.interfaces.GetNonceResponse;
import com.ss.android.ugc.aweme.account.interfaces.IAccountNonceUtil;
import fjb.a;
import ujb.o;

@InterfaceC65848Psq(c = "com.bytedance.awemelobby.LobbyNonceGenerator$getNonce$1", f = "LobbyNonceGenerator.kt", l = {30, 41}, m = "invokeSuspend")
/* renamed from: X.2eG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63402eG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ IAccountNonceUtil LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C63402eG(IAccountNonceUtil iAccountNonceUtil, String str, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C63402eG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = iAccountNonceUtil;
        this.LJLJI = str;
        this.LJLJJI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63402eG(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
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
            FMX.onEventV3("nonce_request");
            IAccountNonceUtil iAccountNonceUtil = this.LJLILLLLZI;
            String str2 = this.LJLJI;
            this.LJLIL = 1;
            obj = iAccountNonceUtil.LIZ(str2, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        GetNonceResponse getNonceResponse = (GetNonceResponse) obj;
        String str3 = getNonceResponse.message;
        GetNonceResponse.Data data = getNonceResponse.data;
        if (!o.LJJJJIZL("success", str3, true) || data == null) {
            C188727au c188727au = new C188727au();
            if (data != null && (str = data.description) != null) {
                str3 = str;
            }
            c188727au.LJIIIZ("error_message", str3);
            FMX.LJIIL("nonce_fail", c188727au.LIZ);
            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
            C63322e8 c63322e8 = new C63322e8(this.LJLJJI, null);
            this.LJLIL = 2;
            if (XKX.LJI(abstractC78621UtN, c63322e8, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        } else {
            String str4 = data.nonce;
            FMX.onEventV3("nonce_success");
            this.LJLJJI.invoke(str4);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
