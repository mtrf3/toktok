package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.gift.model.DynamicGiftListResponse;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.service.assets.giftlist.GiftListManager$startFetchData$2$2", f = "GiftListManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class UWN extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC88473Ynt<GiftListResult, DynamicGiftListResponse.Extra, String, C76800UCe> LJLIL;
    public final /* synthetic */ GiftListResult LJLILLLLZI;
    public final /* synthetic */ BaseResponse<DynamicGiftListResponse.Data, DynamicGiftListResponse.Extra> LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UWN(InterfaceC88473Ynt<? super GiftListResult, ? super DynamicGiftListResponse.Extra, ? super String, C76800UCe> interfaceC88473Ynt, GiftListResult giftListResult, BaseResponse<DynamicGiftListResponse.Data, DynamicGiftListResponse.Extra> baseResponse, String str, InterfaceC67352kd<? super UWN> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC88473Ynt;
        this.LJLILLLLZI = giftListResult;
        this.LJLJI = baseResponse;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new UWN(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C0NB.LJIIIZ("GiftListManager", "onSuccess");
        InterfaceC88473Ynt<GiftListResult, DynamicGiftListResponse.Extra, String, C76800UCe> interfaceC88473Ynt = this.LJLIL;
        GiftListResult giftListResult = this.LJLILLLLZI;
        DynamicGiftListResponse.Extra extra = this.LJLJI.extra;
        o.LJIIIIZZ(extra, "hotData.extra");
        interfaceC88473Ynt.invoke(giftListResult, extra, this.LJLJJI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
