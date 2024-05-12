package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.GetShopHomepageData;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShopLiveInfo;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment$appTrackParams$6$1", f = "StoreFragment.kt", l = {633}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class M4Y extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ GetShopHomepageData LJLILLLLZI;
    public final /* synthetic */ StoreFragment LJLJI;
    public final /* synthetic */ StreamUrlStruct LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ java.util.Map<String, Object> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M4Y(GetShopHomepageData getShopHomepageData, StoreFragment storeFragment, StreamUrlStruct streamUrlStruct, String str, java.util.Map<String, Object> map, InterfaceC67352kd<? super M4Y> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = getShopHomepageData;
        this.LJLJI = storeFragment;
        this.LJLJJI = streamUrlStruct;
        this.LJLJJL = str;
        this.LJLJJLL = map;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new M4Y(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Long LJJIZ;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            ShopLiveInfo shopLiveInfo = this.LJLILLLLZI.liveInfo;
            EnterRoomConfig enterRoomConfig = null;
            if (shopLiveInfo != null && (str = shopLiveInfo.roomId) != null && (LJJIZ = C38350F3i.LJJIZ(str)) != null) {
                enterRoomConfig = new EnterRoomConfig();
                enterRoomConfig.mRoomsData.roomId = LJJIZ.longValue();
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                roomsData.enterFromMerge = "shop";
                roomsData.enterMethod = "live_cover";
                roomsData.actionType = "click";
                enterRoomConfig.mECData.ecCommonExtraParam.put("source_previous_page", "shop_mini_window");
            }
            ActivityC45651qj requireActivity = this.LJLJI.requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            StreamUrlStruct streamUrlStruct = this.LJLJJI;
            String str2 = this.LJLJJL;
            java.util.Map<String, Object> map = this.LJLJJLL;
            this.LJLIL = 1;
            XKS xks = new XKS(1, C78555UsJ.LJJII(this));
            xks.LJIIL();
            new ViewOnTouchListenerC71861SIf(requireActivity, streamUrlStruct, enterRoomConfig, str2, map, xks);
            Object LJIIJJI = xks.LJIIJJI();
            if (LJIIJJI != enumC58928NAu) {
                LJIIJJI = C76800UCe.LIZ;
            }
            if (LJIIJJI == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLJI.LJLIL.put("mini_window_on", new Integer(0));
        StoreFragment storeFragment = this.LJLJI;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = storeFragment.LJLJJLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            C79081V1x.LJJJI(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, "trackParams", C27739Aud.LJI(storeFragment.LJLIL));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
