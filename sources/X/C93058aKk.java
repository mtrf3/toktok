package X;

import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model.ExchangeTokenResult;
import com.ss.android.ugc.aweme.bnpl.network.BNPLApi;
import com.ss.android.ugc.aweme.bnpl.network.model.BaseResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.network.NetworkManager$exchangeTokenToSession$1", f = "NetworkManager.kt", l = {58, BaseNotice.CREATOR}, m = "invokeSuspend")
/* renamed from: X.aKk, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93058aKk extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93058aKk(String str, InterfaceC67352kd<? super C93058aKk> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93058aKk(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
        } catch (Exception e) {
            EnumC91923a2R enumC91923a2R = EnumC91923a2R.AUTHENTIC;
            String message = e.getMessage();
            if (message == null) {
                message = "exception error";
            }
            C91924a2S.LIZ.LIZLLL("unknown", enumC91923a2R, message, "");
        }
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
            String str = this.LJLILLLLZI;
            this.LJLIL = 1;
            BNPLApi.LIZ();
            BNPLApi.IBNPLApi iBNPLApi = BNPLApi.LIZ;
            if (iBNPLApi != null) {
                obj = iBNPLApi.exchangeToken(str, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                o.LJIJI("api");
                throw null;
            }
        }
        C64797Pbt c64797Pbt = (C64797Pbt) obj;
        if (c64797Pbt.LIZIZ()) {
            if (((BaseResponse) c64797Pbt.LIZIZ).LIZ()) {
                String str2 = ((ExchangeTokenResult) ((BaseResponse) c64797Pbt.LIZIZ).data).session;
                o.LJIIIZ(str2, "<set-?>");
                C91826a0s.LIZLLL = str2;
                C92059a4d c92059a4d = C92059a4d.LIZ;
                this.LJLIL = 2;
                if (c92059a4d.LIZJ(this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                C91924a2S.LIZ.LIZLLL("unknown", EnumC91923a2R.AUTHENTIC, ((BaseResponse) c64797Pbt.LIZIZ).errorMsg, "");
            }
        } else {
            C91924a2S.LIZ.LIZLLL("unknown", EnumC91923a2R.AUTHENTIC, ((BaseResponse) c64797Pbt.LIZIZ).errorMsg, "");
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
