package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.gift.base.platform.core.sendv2.sending.SendGiftRetrofitApi;
import com.bytedance.android.livesdk.gift.model.GiftSendResponse;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import fjb.a;
import java.util.HashMap;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.business.send.sending.excutor.RetrofitSendGiftExecutor$doSend$2", f = "RetrofitSendGiftExecutor.kt", l = {82, 80}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class UV1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC64672gJ<? super BaseResponse<SendGiftResult, GiftSendResponse.GiftExtra>>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ UV2 LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ C32816CuK LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ C76732zl LJLJLJ;
    public final /* synthetic */ C68322mC<String> LJLJLLL;
    public final /* synthetic */ UVC LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UV1(UV2 uv2, int i, int i2, C32816CuK c32816CuK, String str, C76732zl c76732zl, C68322mC<String> c68322mC, UVC uvc, InterfaceC67352kd<? super UV1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = uv2;
        this.LJLJJI = i;
        this.LJLJJL = i2;
        this.LJLJJLL = c32816CuK;
        this.LJLJL = str;
        this.LJLJLJ = c76732zl;
        this.LJLJLLL = c68322mC;
        this.LJLL = uvc;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        UV1 uv1 = new UV1(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, interfaceC67352kd);
        uv1.LJLILLLLZI = obj;
        return uv1;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC64672gJ<? super BaseResponse<SendGiftResult, GiftSendResponse.GiftExtra>> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC64672gJ, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC64672gJ interfaceC64672gJ;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj2);
                    String str = this.LJLL.LJIIJ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("doExecute thread(");
                    LIZ.append(C16880lQ.LLLLIIIILLL().getId());
                    LIZ.append(") request success: ");
                    LIZ.append(this.LJLJJLL.LIZ());
                    LIZ.append(", retryCount = ");
                    LIZ.append(this.LJLJLJ.element);
                    LIZ.append(", clientOnlyPreviousErrorCode = ");
                    C31811Ce7.LJ(LIZ, this.LJLJLLL.element, LIZ, str);
                    this.LJLJJLL.LJIILIIL = C30725C4b.LIZ();
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC64672gJ = (InterfaceC64672gJ) this.LJLILLLLZI;
            C141335gf.LIZJ(obj2);
        } else {
            C141335gf.LIZJ(obj2);
            interfaceC64672gJ = (InterfaceC64672gJ) this.LJLILLLLZI;
            SendGiftRetrofitApi sendGiftRetrofitApi = (SendGiftRetrofitApi) Q7L.LIZIZ(SendGiftRetrofitApi.class);
            UV2 uv2 = this.LJLJI;
            long j = uv2.LIZ;
            long j2 = uv2.LIZIZ;
            long j3 = uv2.LIZJ;
            int i2 = this.LJLJJI;
            int i3 = this.LJLJJL;
            String str2 = uv2.LJ;
            long j4 = uv2.LJFF;
            int i4 = uv2.LJI;
            String str3 = uv2.LJII;
            int i5 = this.LJLJJLL.LIZJ;
            long LIZ2 = C30725C4b.LIZ();
            UV2 uv22 = this.LJLJI;
            long j5 = uv22.LJIIIIZZ;
            HashMap<String, String> hashMap = uv22.LJIIIZ;
            long j6 = uv22.LJIIJ;
            String str4 = uv22.LJIIJJI;
            long currentTimeMillis = System.currentTimeMillis();
            C32816CuK c32816CuK = this.LJLJJLL;
            int i6 = c32816CuK.LJII;
            long j7 = c32816CuK.LJIIIIZZ;
            UV2 uv23 = this.LJLJI;
            String str5 = uv23.LJIIL;
            String str6 = uv23.LJIILIIL;
            String str7 = uv23.LJIILJJIL;
            long currentTimeMillis2 = System.currentTimeMillis();
            int i7 = this.LJLJJLL.LJIIJ;
            String str8 = this.LJLJL;
            int i8 = this.LJLJLJ.element;
            String str9 = this.LJLJLLL.element;
            this.LJLILLLLZI = interfaceC64672gJ;
            this.LJLIL = 1;
            obj2 = sendGiftRetrofitApi.sendGiftWithParams(j, j2, j3, i2, i3, str2, j4, i4, str3, i5, LIZ2, j5, hashMap, j6, str4, currentTimeMillis, i6, j7, str5, str6, str7, currentTimeMillis2, i7, str8, i8, str9, this);
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLILLLLZI = null;
        this.LJLIL = 2;
        if (interfaceC64672gJ.emit(obj2, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        String str10 = this.LJLL.LJIIJ;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("doExecute thread(");
        LIZ3.append(C16880lQ.LLLLIIIILLL().getId());
        LIZ3.append(") request success: ");
        LIZ3.append(this.LJLJJLL.LIZ());
        LIZ3.append(", retryCount = ");
        LIZ3.append(this.LJLJLJ.element);
        LIZ3.append(", clientOnlyPreviousErrorCode = ");
        C31811Ce7.LJ(LIZ3, this.LJLJLLL.element, LIZ3, str10);
        this.LJLJJLL.LJIILIIL = C30725C4b.LIZ();
        return C76800UCe.LIZ;
    }
}
