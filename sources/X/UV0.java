package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.gift.model.GiftSendResponse;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;

/* loaded from: classes14.dex */
public final class UV0 implements InterfaceC64672gJ<BaseResponse<SendGiftResult, GiftSendResponse.GiftExtra>> {
    public final /* synthetic */ C68322mC LJLIL;
    public final /* synthetic */ C76732zl LJLILLLLZI;
    public final /* synthetic */ UV2 LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ C68322mC LJLJJLL;
    public final /* synthetic */ UVC LJLJL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC64672gJ
    public final Object emit(BaseResponse<SendGiftResult, GiftSendResponse.GiftExtra> baseResponse, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        this.LJLIL.element = baseResponse;
        if (this.LJLILLLLZI.element > 0) {
            C32795Ctz.LIZLLL(new Long(this.LJLJI.LIZ), new Long(this.LJLJI.LIZJ), new Integer(this.LJLJJI), this.LJLJJL, (String) this.LJLJJLL.element, this.LJLILLLLZI.element - 1, true);
        }
        String str = this.LJLJL.LJIIJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("retryTime: ");
        C1DD.LJFF(LIZ, this.LJLILLLLZI.element, LIZ, str);
        return C76800UCe.LIZ;
    }

    public UV0(C68322mC c68322mC, C76732zl c76732zl, UV2 uv2, int i, String str, C68322mC c68322mC2, UVC uvc) {
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = c76732zl;
        this.LJLJI = uv2;
        this.LJLJJI = i;
        this.LJLJJL = str;
        this.LJLJJLL = c68322mC2;
        this.LJLJL = uvc;
    }
}
