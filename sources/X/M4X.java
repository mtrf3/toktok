package X;

import android.app.Activity;
import android.view.View;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.GetShopHomepageData;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShopLiveInfo;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment$refreshLiveInfoView$3", f = "StoreFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class M4X extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, View, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ GetShopHomepageData LJLILLLLZI;
    public final /* synthetic */ StoreFragment LJLJI;
    public final /* synthetic */ Long LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M4X(GetShopHomepageData getShopHomepageData, StoreFragment storeFragment, Long l, InterfaceC67352kd<? super M4X> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLILLLLZI = getShopHomepageData;
        this.LJLJI = storeFragment;
        this.LJLJJI = l;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C141335gf.LIZJ(obj);
        View view = (View) this.LJLIL;
        ShopLiveInfo shopLiveInfo = this.LJLILLLLZI.liveInfo;
        String str2 = null;
        if (shopLiveInfo != null) {
            str = shopLiveInfo.roomId;
        } else {
            str = null;
        }
        if (o.LJ(str, this.LJLJI.LJLIL.get("list_source_content_id"))) {
            Activity previousActivity = ActivityStack.getPreviousActivity();
            if (previousActivity != null) {
                str2 = previousActivity.getLocalClassName();
            }
            if (o.LJ(str2, "com.ss.android.ugc.aweme.live.LivePlayActivity")) {
                this.LJLJI.requireActivity().onBackPressed();
                this.LJLJI.LJLJI.put("click_area", "head");
                b.LJJIJIIJI("tiktokec_module_click", this.LJLJI.LJLJI);
                return C76800UCe.LIZ;
            }
        }
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.mRoomsData.roomId = this.LJLJJI.longValue();
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        roomsData.enterFromMerge = "shop";
        roomsData.enterMethod = "live_cover";
        roomsData.actionType = "click";
        enterRoomConfig.mECData.ecCommonExtraParam.put("source_previous_page", "shop");
        LiveOuterService.LJJJLL().LJIILL().LJIILJJIL(view.getContext(), enterRoomConfig);
        this.LJLJI.LJLJI.put("click_area", "head");
        b.LJJIJIIJI("tiktokec_module_click", this.LJLJI.LJLJI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, View view, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        M4X m4x = new M4X(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
        m4x.LJLIL = view;
        return m4x.invokeSuspend(C76800UCe.LIZ);
    }
}
