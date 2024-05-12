package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.gift.model.GiftSendResponse;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import com.bytedance.android.livesdk.livesetting.gift.SendGiftRetrySetting;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.business.send.sending.excutor.RetrofitSendGiftExecutor$doSend$3", f = "RetrofitSendGiftExecutor.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.UUz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77289UUz extends AbstractC65782Prm implements InterfaceC88474Ynu<InterfaceC64672gJ<? super BaseResponse<SendGiftResult, GiftSendResponse.GiftExtra>>, Throwable, Long, InterfaceC67352kd<? super Boolean>, Object> {
    public /* synthetic */ Object LJLIL;
    public /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ C76732zl LJLJI;
    public final /* synthetic */ C68322mC<String> LJLJJI;
    public final /* synthetic */ UVC LJLJJL;
    public final /* synthetic */ UV2 LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ String LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77289UUz(C76732zl c76732zl, C68322mC<String> c68322mC, UVC uvc, UV2 uv2, int i, String str, InterfaceC67352kd<? super C77289UUz> interfaceC67352kd) {
        super(4, interfaceC67352kd);
        this.LJLJI = c76732zl;
        this.LJLJJI = c68322mC;
        this.LJLJJL = uvc;
        this.LJLJJLL = uv2;
        this.LJLJL = i;
        this.LJLJLJ = str;
    }

    /* JADX WARN: Type inference failed for: r2v28, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.String] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Throwable th = (Throwable) this.LJLIL;
        long j = this.LJLILLLLZI;
        boolean z = true;
        this.LJLJI.element = ((int) j) + 1;
        boolean z2 = th instanceof C0TL;
        if (z2) {
            this.LJLJJI.element = String.valueOf(((C0TL) th).statusCode);
        } else if (th instanceof C64799Pbv) {
            this.LJLJJI.element = String.valueOf(((C64799Pbv) th).getCronetInternalErrorCode());
        }
        String str = this.LJLJJL.LJIIJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("retry: ");
        C1DD.LJFF(LIZ, this.LJLJI.element, LIZ, str);
        if (this.LJLJI.element == SendGiftRetrySetting.INSTANCE.getRetryCount() - 1) {
            C32795Ctz.LIZLLL(new Long(this.LJLJJLL.LIZ), new Long(this.LJLJJLL.LIZJ), new Integer(this.LJLJL), this.LJLJLJ, this.LJLJJI.element, this.LJLJI.element, false);
        }
        if ((!z2 && !(th instanceof C64799Pbv)) || j >= r6.getRetryCount() - 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC88474Ynu
    public final Object invoke(InterfaceC64672gJ<? super BaseResponse<SendGiftResult, GiftSendResponse.GiftExtra>> interfaceC64672gJ, Throwable th, Long l, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        long longValue = l.longValue();
        C77289UUz c77289UUz = new C77289UUz(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
        c77289UUz.LJLIL = th;
        c77289UUz.LJLILLLLZI = longValue;
        return c77289UUz.invokeSuspend(C76800UCe.LIZ);
    }
}
