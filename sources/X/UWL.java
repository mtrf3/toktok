package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.gift.model.DynamicGiftListResponse;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.service.assets.giftlist.GiftListManager$startFetchData$2", f = "GiftListManager.kt", l = {92, 113, LiveTryModeCountDownThresholdSetting.DEFAULT}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class UWL extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public BaseResponse LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ UWM LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ InterfaceC88473Ynt<GiftListResult, DynamicGiftListResponse.Extra, String, C76800UCe> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UWL(UWM uwm, long j, int i, InterfaceC88473Ynt<? super GiftListResult, ? super DynamicGiftListResponse.Extra, ? super String, C76800UCe> interfaceC88473Ynt, InterfaceC67352kd<? super UWL> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = uwm;
        this.LJLJJI = j;
        this.LJLJJL = i;
        this.LJLJJLL = interfaceC88473Ynt;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new UWL(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0276 A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UWL.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
