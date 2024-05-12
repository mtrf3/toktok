package X;

import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.DynamicGiftListResponse;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UWU extends AbstractC65781Prl implements InterfaceC88473Ynt<GiftListResult, DynamicGiftListResponse.Extra, String, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ AbstractC32474Coo LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UWU(int i, long j, long j2, AbstractC32474Coo abstractC32474Coo, boolean z) {
        super(3);
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
        this.LJLJI = z;
        this.LJLJJI = i;
        this.LJLJJL = abstractC32474Coo;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(GiftListResult giftListResult, DynamicGiftListResponse.Extra extra, String json) {
        DynamicGiftListResponse.Extra extra2 = extra;
        o.LJIIIZ(giftListResult, "giftListResult");
        o.LJIIIZ(json, "json");
        if (extra2 != null) {
            C77283UUt.LIZIZ = extra2.logId;
        }
        GiftManager.inst().onGiftListSuccess(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, new C15070iV<>(giftListResult, json), this.LJLJJL, C77283UUt.LIZIZ);
        return C76800UCe.LIZ;
    }
}
