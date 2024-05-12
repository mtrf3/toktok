package X;

import android.util.Pair;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.ecommercelive.business.common.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.data.PopProductResp;
import com.ss.android.ugc.aweme.ecommercelive.common.popcard.vo.PopupCardVO;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Rwi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71184Rwi extends AbstractC71186Rwk {
    public XKQ LIZLLL;
    public boolean LJ;
    public final C62822Ol8 LJFF;
    public final java.util.Map<String, String> LJI;

    @Override // X.AbstractC71186Rwk
    public final void LIZIZ() {
        this.LIZIZ = null;
        XKQ xkq = this.LIZLLL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
    }

    @Override // X.AbstractC71186Rwk
    public final void LJ() {
        java.util.Map<String, String> LJIIL = this.LIZ.LJIIZILJ().LJIIL();
        AbstractC71187Rwl abstractC71187Rwl = this.LIZ;
        C48502J1u eventParamHelper = abstractC71187Rwl.LJLL;
        java.util.Map<String, String> map = abstractC71187Rwl.LJLLLL;
        HashMap hashMap = new HashMap();
        java.util.Map<String, String> map2 = this.LIZ.LJLLLLLL;
        if (map2 != null) {
            hashMap.putAll(map2);
            hashMap.put("refer", "image");
            hashMap.put("label", "user_othershow");
        }
        String str = LJIIL.get("flashsale_status");
        String str2 = LJIIL.get("countdown_type");
        o.LJIIIZ(eventParamHelper, "eventParamHelper");
        C188727au LIZLLL = C71183Rwh.LIZLLL(eventParamHelper);
        LIZLLL.LJIIIZ("item_order", eventParamHelper.LIZJ("item_order"));
        if (eventParamHelper.LJ("campaign_id")) {
            LIZLLL.LJI("campaign_id", eventParamHelper.LIZJ("campaign_id"));
        }
        if (eventParamHelper.LJ("campaign_type")) {
            LIZLLL.LJI("campaign_type", eventParamHelper.LIZJ("campaign_type"));
        }
        if (eventParamHelper.LJ("campaign_channel")) {
            LIZLLL.LJI("campaign_channel", eventParamHelper.LIZJ("campaign_channel"));
        }
        if (eventParamHelper.LJ("campaign_user_tag")) {
            LIZLLL.LJI("campaign_user_tag", eventParamHelper.LIZJ("campaign_user_tag"));
        }
        if (str != null) {
            LIZLLL.LJI("flashsale_status", str);
        }
        if (str2 != null) {
            LIZLLL.LJI("countdown_type", str2);
        }
        C71183Rwh.LIZ(LIZLLL);
        LIZLLL.LJIIIIZZ(map);
        LIZLLL.LJIIIIZZ(hashMap);
        C48658J7u.LIZ("livesdk_tiktokec_popupcard_show", LIZLLL.LIZ);
    }

    @Override // X.AbstractC71186Rwk
    public final void LJI() {
        java.util.Map<String, String> LJIIL = this.LIZ.LJIIZILJ().LJIIL();
        AbstractC71187Rwl abstractC71187Rwl = this.LIZ;
        java.util.Map<String, String> map = abstractC71187Rwl.LJLLLL;
        C48502J1u eventParamHelper = abstractC71187Rwl.LJLL;
        String str = LJIIL.get("flashsale_status");
        String str2 = LJIIL.get("countdown_type");
        o.LJIIIZ(eventParamHelper, "eventParamHelper");
        C188727au LIZLLL = C71183Rwh.LIZLLL(eventParamHelper);
        LIZLLL.LJIIIZ("stay_time", eventParamHelper.LIZJ("stay_time"));
        LIZLLL.LJIIIZ("quit_type", eventParamHelper.LIZJ("quit_type"));
        if (str != null) {
            LIZLLL.LJI("flashsale_status", str);
        }
        if (str2 != null) {
            LIZLLL.LJI("countdown_type", str2);
        }
        if (map != null) {
            LIZLLL.LJIIIIZZ(map);
        }
        C71183Rwh.LIZ(LIZLLL);
        C48658J7u.LIZ("livesdk_tiktokec_popupcard_staytime", LIZLLL.LIZ);
    }

    @Override // X.AbstractC71186Rwk
    public final void LJII() {
        ActivityC45651qj activityC45651qj;
        LifecycleCoroutineScope lifecycleScope;
        ActivityC45651qj activityC45651qj2;
        LifecycleCoroutineScope lifecycleScope2;
        XKQ xkq = this.LIZLLL;
        XKQ xkq2 = null;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        OecInitData LIZ = C71154RwE.LIZ(this.LIZ.LJLLI);
        if (LIZ != null) {
            String str = LIZ.bagAnimation;
            boolean z = false;
            if (str != null && str.length() > 0) {
                z = true;
            }
            if (z) {
                A72 a72 = this.LIZ.LJLJLLL;
                if (a72 != null) {
                    activityC45651qj2 = a72.getContext();
                } else {
                    activityC45651qj2 = null;
                }
                if ((activityC45651qj2 instanceof LifecycleOwner) && activityC45651qj2 != null && (lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(activityC45651qj2)) != null) {
                    xkq2 = XKX.LIZLLL(lifecycleScope2, null, null, new C68082lo(null), 3);
                }
                this.LIZLLL = xkq2;
                return;
            }
            if (((Number) this.LJFF.getValue()).intValue() <= 0) {
                return;
            }
            A72 a722 = this.LIZ.LJLJLLL;
            if (a722 != null) {
                activityC45651qj = a722.getContext();
            } else {
                activityC45651qj = null;
            }
            if ((activityC45651qj instanceof LifecycleOwner) && activityC45651qj != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(activityC45651qj)) != null) {
                xkq2 = XKX.LIZLLL(lifecycleScope, null, null, new C68072ln(this, null), 3);
            }
            this.LIZLLL = xkq2;
        }
    }

    public final void LJIIIZ() {
        if (this.LIZ.LJLL.LJ("label_type")) {
            this.LIZ.LJLL.LJIIJ("label_type");
        }
        if (this.LIZ.LJLL.LJ("label_number")) {
            this.LIZ.LJLL.LJIIJ("label_number");
        }
    }

    public final void LJIIJ() {
        if (this.LJ) {
            return;
        }
        this.LIZ.LJIIZILJ().LJLJLJ = new AqS162S0100000_12(this, 1161);
        this.LIZ.LJIIZILJ().LJLJL = new AqS178S0100000_12(this, 592);
        this.LJ = true;
    }

    @Override // X.AbstractC71186Rwk
    public final void LIZ(String str) {
        String str2;
        String str3;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        IFrameSlot.SlotViewModel slotViewModel = this.LIZ.LJLJLJ;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LJLIL) != null && (value = mutableLiveData.getValue()) != null && o.LJ(value.first, Boolean.TRUE)) {
            InterfaceC71246Rxi interfaceC71246Rxi = this.LIZIZ;
            if (interfaceC71246Rxi != null) {
                interfaceC71246Rxi.LJIIIIZZ();
            }
            LJII();
            this.LIZ.LJJII(str);
        }
        this.LIZ.LLII.removeMessages(0);
        this.LIZ.LJIIZILJ().LJIIIIZZ();
        if (o.LJ(str, "unpin")) {
            Room room = this.LIZ.LJLLI;
            if (room == null || (str2 = C17280m4.LIZ(room)) == null) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            String LJIILLIIL = AbstractC71187Rwl.LJIILLIIL();
            String roleStr = EnumC71217RxF.AUDIENCE.getRoleStr();
            PopupCardVO popupCardVO = this.LIZ.LJIIZILJ().LJLIL;
            if (popupCardVO == null || (str3 = Long.valueOf(popupCardVO.getProductId()).toString()) == null) {
                str3 = "";
            }
            C71162RwM.LIZJ(str2, LJIILLIIL, roleStr, str3);
        }
    }

    @Override // X.AbstractC71186Rwk
    public final void LIZJ(OecInitData oecInitData) {
        LJIIJ();
        if (oecInitData.product != null && this.LIZ.LJIIZILJ().LJLIL != null) {
            LJIIJJI(true);
            this.LIZ.LJJIFFI(false);
        }
    }

    @Override // X.AbstractC71186Rwk
    public final void LJFF(String str) {
        java.util.Map<String, String> LJIIL = this.LIZ.LJIIZILJ().LJIIL();
        AbstractC71187Rwl abstractC71187Rwl = this.LIZ;
        java.util.Map<String, String> map = abstractC71187Rwl.LJLLLL;
        C48502J1u eventParamHelper = abstractC71187Rwl.LJLL;
        String str2 = LJIIL.get("flashsale_status");
        String str3 = LJIIL.get("countdown_type");
        o.LJIIIZ(eventParamHelper, "eventParamHelper");
        C188727au LIZLLL = C71183Rwh.LIZLLL(eventParamHelper);
        LIZLLL.LJIIIZ("stay_time", eventParamHelper.LIZJ("stay_time"));
        LIZLLL.LJIIIZ("quit_type", eventParamHelper.LIZJ("quit_type"));
        if (str2 != null) {
            LIZLLL.LJI("flashsale_status", str2);
        }
        if (str3 != null) {
            LIZLLL.LJI("countdown_type", str3);
        }
        if (eventParamHelper.LJ("source_module")) {
            LIZLLL.LJI("source_module", eventParamHelper.LIZJ("source_module"));
        }
        if (map != null) {
            LIZLLL.LJIIIIZZ(map);
        }
        C71183Rwh.LIZ(LIZLLL);
        LIZLLL.LJIIIIZZ(C71183Rwh.LIZIZ());
        C48658J7u.LIZ("livesdk_tiktokec_product_entrance_stay_time", LIZLLL.LIZ);
    }

    public final void LJIIJJI(boolean z) {
        int i;
        int i2;
        int i3;
        String str;
        String str2;
        String str3;
        java.util.Map<String, String> extra;
        String str4;
        String str5;
        String str6;
        boolean z2;
        Long l;
        String str7;
        C86393XvR LJJIJIL;
        Long l2;
        C86393XvR LJJIJIL2;
        long j;
        java.util.Map<String, String> extra2;
        PromotionView promotionView;
        String LIZIZ;
        PromotionView promotionView2;
        String LIZIZ2;
        PromotionView promotionView3;
        String LIZIZ3;
        PromotionView promotionView4;
        String LIZIZ4;
        List<AtmosphereTag> atmosphereTags;
        List<String> skuIds;
        String daInfo;
        HashMap<String, Object> LJII;
        Integer bizType;
        XKQ xkq = this.LIZLLL;
        Long l3 = null;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        InterfaceC71246Rxi interfaceC71246Rxi = this.LIZIZ;
        if (interfaceC71246Rxi != null) {
            interfaceC71246Rxi.LJFF(z);
        }
        C2U8.LIZ(new C68092lp(1, 300L, false));
        C2U8.LIZ(new C68092lp(2, false));
        AbstractC71187Rwl abstractC71187Rwl = this.LIZ;
        C48502J1u c48502J1u = abstractC71187Rwl.LJLL;
        PopupCardVO popupCardVO = abstractC71187Rwl.LJIIZILJ().LJLIL;
        if (popupCardVO != null) {
            l3 = Long.valueOf(popupCardVO.getProductId());
        }
        c48502J1u.LJII("product_id", String.valueOf(l3), false);
        AbstractC71187Rwl abstractC71187Rwl2 = this.LIZ;
        C48502J1u c48502J1u2 = abstractC71187Rwl2.LJLL;
        PopupCardVO popupCardVO2 = abstractC71187Rwl2.LJIIZILJ().LJLIL;
        int i4 = -1;
        if (popupCardVO2 != null && (bizType = popupCardVO2.getBizType()) != null) {
            i = bizType.intValue();
        } else {
            i = -1;
        }
        c48502J1u2.LJFF(i, "biz_type");
        AbstractC71187Rwl abstractC71187Rwl3 = this.LIZ;
        C48502J1u c48502J1u3 = abstractC71187Rwl3.LJLL;
        PopupCardVO popupCardVO3 = abstractC71187Rwl3.LJIIZILJ().LJLIL;
        if (popupCardVO3 != null) {
            i2 = popupCardVO3.getPlatform();
        } else {
            i2 = -1;
        }
        c48502J1u3.LJFF(i2, "product_source");
        AbstractC71187Rwl abstractC71187Rwl4 = this.LIZ;
        C48502J1u c48502J1u4 = abstractC71187Rwl4.LJLL;
        PopupCardVO popupCardVO4 = abstractC71187Rwl4.LJIIZILJ().LJLIL;
        if (popupCardVO4 != null) {
            i4 = popupCardVO4.getSourceFrom();
        }
        c48502J1u4.LJFF(i4, "source_from");
        PopupCardVO popupCardVO5 = this.LIZ.LJIIZILJ().LJLIL;
        if (popupCardVO5 != null) {
            this.LIZ.LJLL.LJII("is_fans_price", popupCardVO5.hasFansPrice(), false);
        }
        PopupCardVO popupCardVO6 = this.LIZ.LJIIZILJ().LJLIL;
        if (popupCardVO6 != null) {
            this.LIZ.LJLL.LJFF(popupCardVO6.getBagIndex(), "item_order");
        }
        PopupCardVO popupCardVO7 = this.LIZ.LJIIZILJ().LJLIL;
        if (popupCardVO7 != null && (daInfo = popupCardVO7.getDaInfo()) != null && (LJII = C27739Aud.LJII(daInfo)) != null) {
            Object obj = LJII.get("currency");
            if (obj != null) {
                this.LIZ.LJLL.LJII("currency", obj.toString(), false);
            }
            Object obj2 = LJII.get("sale_price_value");
            if (obj2 != null) {
                this.LIZ.LJLL.LJII("sale_price_value", obj2.toString(), false);
            }
            Object obj3 = LJII.get("origin_price_value");
            if (obj3 != null) {
                this.LIZ.LJLL.LJII("origin_price_value", obj3.toString(), false);
            }
            Object obj4 = LJII.get("discount_percentage");
            if (obj4 != null) {
                this.LIZ.LJLL.LJII("discount_percentage", obj4.toString(), false);
            }
        }
        AbstractC71187Rwl abstractC71187Rwl5 = this.LIZ;
        C48502J1u c48502J1u5 = abstractC71187Rwl5.LJLL;
        PopupCardVO popupCardVO8 = abstractC71187Rwl5.LJIIZILJ().LJLIL;
        if (popupCardVO8 != null && (skuIds = popupCardVO8.getSkuIds()) != null) {
            i3 = skuIds.size();
        } else {
            i3 = 0;
        }
        c48502J1u5.LJFF(i3, "saleable_sku_num");
        LJIIIZ();
        PopupCardVO popupCardVO9 = this.LIZ.LJIIZILJ().LJLIL;
        if (popupCardVO9 != null && (atmosphereTags = popupCardVO9.getAtmosphereTags()) != null) {
            ArrayList arrayList = new ArrayList();
            for (AtmosphereTag atmosphereTag : atmosphereTags) {
                if (atmosphereTag.tagType == 1) {
                    arrayList.add(atmosphereTag);
                }
            }
            if (true ^ arrayList.isEmpty()) {
                this.LIZ.LJLL.LJII("label_type", "hot", false);
                this.LIZ.LJLL.LJI(((AtmosphereTag) ListProtector.get(arrayList, 0)).count, "label_number");
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (AtmosphereTag atmosphereTag2 : atmosphereTags) {
                    if (atmosphereTag2.tagType == 2) {
                        arrayList2.add(atmosphereTag2);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    this.LIZ.LJLL.LJII("label_type", "onlyleft", false);
                    this.LIZ.LJLL.LJI(((AtmosphereTag) ListProtector.get(arrayList2, 0)).count, "label_number");
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    for (AtmosphereTag atmosphereTag3 : atmosphereTags) {
                        if (atmosphereTag3.tagType == 3) {
                            arrayList3.add(atmosphereTag3);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        this.LIZ.LJLL.LJII("label_type", "top_sales", false);
                        this.LIZ.LJLL.LJI(((AtmosphereTag) ListProtector.get(arrayList3, 0)).count, "label_number");
                    }
                }
            }
        }
        PopupCardVO popupCardVO10 = this.LIZ.LJIIZILJ().LJLIL;
        if (popupCardVO10 != null && (promotionView4 = popupCardVO10.getPromotionView()) != null && (LIZIZ4 = C69889Rbp.LIZIZ(promotionView4, "campaign_id")) != null && LIZIZ4.length() > 0) {
            this.LIZ.LJLL.LJII("campaign_id", LIZIZ4, false);
        }
        PopupCardVO popupCardVO11 = this.LIZ.LJIIZILJ().LJLIL;
        if (popupCardVO11 != null && (promotionView3 = popupCardVO11.getPromotionView()) != null && (LIZIZ3 = C69889Rbp.LIZIZ(promotionView3, "campaign_channel")) != null && LIZIZ3.length() > 0) {
            this.LIZ.LJLL.LJII("campaign_channel", LIZIZ3, false);
        }
        PopupCardVO popupCardVO12 = this.LIZ.LJIIZILJ().LJLIL;
        if (popupCardVO12 != null && (promotionView2 = popupCardVO12.getPromotionView()) != null && (LIZIZ2 = C69889Rbp.LIZIZ(promotionView2, "campaign_user_tag")) != null && LIZIZ2.length() > 0) {
            this.LIZ.LJLL.LJII("campaign_user_tag", LIZIZ2, false);
        }
        PopupCardVO popupCardVO13 = this.LIZ.LJIIZILJ().LJLIL;
        if (popupCardVO13 != null && (promotionView = popupCardVO13.getPromotionView()) != null && (LIZIZ = C69889Rbp.LIZIZ(promotionView, "campaign_type")) != null && LIZIZ.length() > 0) {
            this.LIZ.LJLL.LJII("campaign_type", LIZIZ, false);
        }
        AbstractC71187Rwl abstractC71187Rwl6 = this.LIZ;
        C48502J1u c48502J1u6 = abstractC71187Rwl6.LJLL;
        PopupCardVO popupCardVO14 = abstractC71187Rwl6.LJIIZILJ().LJLIL;
        if (popupCardVO14 != null) {
            str = popupCardVO14.getSource();
        } else {
            str = null;
        }
        c48502J1u6.LJII("source", str, true);
        this.LIZ.LJLL.LJI(System.currentTimeMillis(), "start_time");
        AbstractC71187Rwl abstractC71187Rwl7 = this.LIZ;
        C48502J1u c48502J1u7 = abstractC71187Rwl7.LJLL;
        PopupCardVO popupCardVO15 = abstractC71187Rwl7.LJIIZILJ().LJLIL;
        if (popupCardVO15 != null && (extra2 = popupCardVO15.getExtra()) != null) {
            str2 = extra2.get("mix_product_type");
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str3 = "";
        } else {
            PopupCardVO popupCardVO16 = this.LIZ.LJIIZILJ().LJLIL;
            if (popupCardVO16 != null && (extra = popupCardVO16.getExtra()) != null) {
                str3 = extra.get("mix_product_type");
            } else {
                str3 = null;
            }
        }
        c48502J1u7.LJII("is_mix_product", str3, false);
        HashMap hashMap = (HashMap) this.LIZ.LJLL.LIZIZ();
        if (hashMap == null || (str4 = (String) hashMap.get("request_id")) == null) {
            str4 = "";
        }
        Room room = this.LIZ.LJLLI;
        if (room == null || (str5 = C17280m4.LIZ(room)) == null) {
            str5 = "";
        }
        PopupCardVO popupCardVO17 = this.LIZ.LJIIZILJ().LJLIL;
        if (popupCardVO17 == null || (str6 = Long.valueOf(popupCardVO17.getProductId()).toString()) == null) {
            str6 = "";
        }
        this.LIZ.LJLL.LJII("track_id", C70570Rmo.LIZ(str4, str5, str6), false);
        this.LIZ.LJLL.LJII("room_id", str5, false);
        if (!C38354F3m.LJ(str4)) {
            this.LIZ.LJLL.LJII("request_id", str4, false);
        }
        this.LIZ.LJLL.LJII("product_id", str6, false);
        ((LinkedHashMap) this.LJI).clear();
        java.util.Map<String, String> LJIIL = this.LIZ.LJIIZILJ().LJIIL();
        java.util.Map<String, String> map = this.LJI;
        AbstractC71187Rwl abstractC71187Rwl8 = this.LIZ;
        C48502J1u eventParamHelper = abstractC71187Rwl8.LJLL;
        java.util.Map<String, String> map2 = abstractC71187Rwl8.LJLLLL;
        HashMap hashMap2 = new HashMap();
        java.util.Map<String, String> map3 = this.LIZ.LJLLLLLL;
        if (map3 != null) {
            hashMap2.putAll(map3);
            hashMap2.put("refer", "image");
            hashMap2.put("label", "user_othershow");
        }
        PopupCardVO popupCardVO18 = this.LIZ.LJIIZILJ().LJLIL;
        if (popupCardVO18 != null) {
            hashMap2.put("card_title", popupCardVO18.getTitle());
            hashMap2.put("card_title_length", String.valueOf(popupCardVO18.getTitle().length()));
        }
        Boolean bool = this.LIZ.LLIIJI;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = false;
        }
        Boolean valueOf = Boolean.valueOf(z2);
        o.LJIIIZ(eventParamHelper, "eventParamHelper");
        C188727au LIZLLL = C71183Rwh.LIZLLL(eventParamHelper);
        LIZLLL.LJIIIZ("item_order", eventParamHelper.LIZJ("item_order"));
        if (eventParamHelper.LJ("campaign_id")) {
            LIZLLL.LJI("campaign_id", eventParamHelper.LIZJ("campaign_id"));
        }
        if (eventParamHelper.LJ("campaign_type")) {
            LIZLLL.LJI("campaign_type", eventParamHelper.LIZJ("campaign_type"));
        }
        if (eventParamHelper.LJ("campaign_channel")) {
            LIZLLL.LJI("campaign_channel", eventParamHelper.LIZJ("campaign_channel"));
        }
        if (eventParamHelper.LJ("campaign_user_tag")) {
            LIZLLL.LJI("campaign_user_tag", eventParamHelper.LIZJ("campaign_user_tag"));
        }
        if (eventParamHelper.LJ("shopping_status")) {
            LIZLLL.LJI("shopping_status", eventParamHelper.LIZJ("shopping_status"));
        }
        if (eventParamHelper.LJ("isFirst")) {
            LIZLLL.LJI("is_first", eventParamHelper.LIZJ("isFirst"));
        }
        if (eventParamHelper.LJ("source_page_type")) {
            LIZLLL.LJI("source_page_type", eventParamHelper.LIZJ("source_page_type"));
        }
        if (eventParamHelper.LJ("api_end_time")) {
            String LIZJ = eventParamHelper.LIZJ("api_end_time");
            if (LIZJ != null) {
                j = CastLongProtector.parseLong(LIZJ);
            } else {
                j = 0;
            }
            LIZLLL.LJ(System.currentTimeMillis() - j, "duration");
        }
        Boolean bool2 = Boolean.TRUE;
        if (o.LJ(valueOf, bool2)) {
            LIZLLL.LJI("user_type", "moderator");
            String LIZJ2 = eventParamHelper.LIZJ("author_id");
            if (LIZJ2 == null) {
                LIZJ2 = "";
            }
            LIZLLL.LJI("moderator_id", LIZJ2);
        }
        String LIZJ3 = eventParamHelper.LIZJ("is_hot");
        if (LIZJ3 != null) {
            LIZLLL.LJI("is_hot", LIZJ3);
        }
        String LIZJ4 = eventParamHelper.LIZJ("hot_sell_number");
        if (LIZJ4 != null) {
            LIZLLL.LJI("hot_sell_number", LIZJ4);
        }
        String LIZJ5 = eventParamHelper.LIZJ("label_type");
        if (LIZJ5 != null) {
            LIZLLL.LJI("label_type", LIZJ5);
        }
        String LIZJ6 = eventParamHelper.LIZJ("label_number");
        if (LIZJ6 != null) {
            LIZLLL.LJI("label_number", LIZJ6);
        }
        String LIZJ7 = eventParamHelper.LIZJ("biz_type");
        if (LIZJ7 != null) {
            LIZLLL.LJI("biz_type", LIZJ7);
        }
        C71183Rwh.LIZ(LIZLLL);
        LIZLLL.LJIIIIZZ(map2);
        LIZLLL.LJIIIIZZ(hashMap2);
        LIZLLL.LJIIIIZZ(C71183Rwh.LIZIZ());
        LIZLLL.LJIIIIZZ(LJIIL);
        java.util.Map<String, String> map4 = LIZLLL.LIZ;
        o.LJII(map4, "null cannot be cast to non-null type kotlin.collections.MutableMap<@[FlexibleNullability] kotlin.String?, @[FlexibleNullability] kotlin.String?>");
        map.putAll(C65777Prh.LIZJ(map4));
        if (this.LIZ.LJIILL()) {
            HashMap hashMap3 = new HashMap();
            java.util.Map<String, String> map5 = this.LIZ.LJLLLL;
            if (map5 != null) {
                hashMap3.putAll(map5);
            }
            hashMap3.put("refer", "product_detail");
            HashMap hashMap4 = new HashMap();
            Room room2 = this.LIZ.LJLLI;
            if (room2 != null) {
                l2 = Long.valueOf(room2.getId());
            } else {
                l2 = null;
            }
            hashMap4.put("room_id", String.valueOf(l2));
            ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
            if (LJJJLL != null && (LJJIJIL2 = LJJJLL.LJJIJIL()) != null && LJJIJIL2.LIZIZ() != null) {
                C28835BTj.LIZ("live_ad", "othershow", hashMap3, hashMap4);
            }
        }
        AbstractC71187Rwl abstractC71187Rwl9 = this.LIZ;
        C48502J1u eventParamHelper2 = abstractC71187Rwl9.LJLL;
        Room room3 = abstractC71187Rwl9.LJLLI;
        if (room3 != null) {
            l = Long.valueOf(room3.getId());
        } else {
            l = null;
        }
        String valueOf2 = String.valueOf(l);
        AbstractC71187Rwl abstractC71187Rwl10 = this.LIZ;
        Boolean bool3 = abstractC71187Rwl10.LJLLL;
        java.util.Map<String, String> map6 = abstractC71187Rwl10.LJLLLL;
        HashMap hashMap5 = new HashMap();
        java.util.Map<String, String> map7 = this.LIZ.LJLLLLLL;
        if (map7 != null) {
            hashMap5.putAll(map7);
            hashMap5.put("refer", "product_detail");
            hashMap5.put("label", "user_othershow");
        }
        PopupCardVO popupCardVO19 = this.LIZ.LJIIZILJ().LJLIL;
        if (popupCardVO19 != null) {
            if (popupCardVO19.isSoldOut()) {
                str7 = "1";
            } else {
                str7 = CardStruct.IStatusCode.DEFAULT;
            }
        } else {
            str7 = null;
        }
        o.LJIIIZ(eventParamHelper2, "eventParamHelper");
        C188727au LIZLLL2 = C71183Rwh.LIZLLL(eventParamHelper2);
        LIZLLL2.LJIIIZ("item_order", eventParamHelper2.LIZJ("item_order"));
        if (eventParamHelper2.LJ("campaign_id")) {
            LIZLLL2.LJI("campaign_id", eventParamHelper2.LIZJ("campaign_id"));
        }
        if (eventParamHelper2.LJ("campaign_type")) {
            LIZLLL2.LJI("campaign_type", eventParamHelper2.LIZJ("campaign_type"));
        }
        if (eventParamHelper2.LJ("campaign_channel")) {
            LIZLLL2.LJI("campaign_channel", eventParamHelper2.LIZJ("campaign_channel"));
        }
        if (eventParamHelper2.LJ("campaign_user_tag")) {
            LIZLLL2.LJI("campaign_user_tag", eventParamHelper2.LIZJ("campaign_user_tag"));
        }
        if (eventParamHelper2.LJ("source_module")) {
            LIZLLL2.LJI("source_module", eventParamHelper2.LIZJ("source_module"));
        }
        if (str7 != null) {
            LIZLLL2.LJI("is_sold_out", str7);
        }
        String LIZJ8 = eventParamHelper2.LIZJ("is_hot");
        if (LIZJ8 != null) {
            LIZLLL2.LJI("is_hot", LIZJ8);
        }
        String LIZJ9 = eventParamHelper2.LIZJ("hot_sell_number");
        if (LIZJ9 != null) {
            LIZLLL2.LJI("hot_sell_number", LIZJ9);
        }
        String LIZJ10 = eventParamHelper2.LIZJ("label_type");
        if (LIZJ10 != null) {
            LIZLLL2.LJI("label_type", LIZJ10);
        }
        String LIZJ11 = eventParamHelper2.LIZJ("label_number");
        if (LIZJ11 != null) {
            LIZLLL2.LJI("label_number", LIZJ11);
        }
        String LIZJ12 = eventParamHelper2.LIZJ("source_page_type");
        if (LIZJ12 != null) {
            LIZLLL2.LJI("source_page_type", LIZJ12);
        }
        String LIZJ13 = eventParamHelper2.LIZJ("biz_type");
        if (LIZJ13 != null) {
            LIZLLL2.LJI("biz_type", LIZJ13);
        }
        String LIZJ14 = eventParamHelper2.LIZJ("currency");
        if (LIZJ14 != null) {
            LIZLLL2.LJI("currency", LIZJ14);
        }
        String LIZJ15 = eventParamHelper2.LIZJ("origin_price_value");
        if (LIZJ15 != null) {
            LIZLLL2.LJI("origin_price_value", LIZJ15);
        }
        String LIZJ16 = eventParamHelper2.LIZJ("sale_price_value");
        if (LIZJ16 != null) {
            LIZLLL2.LJI("sale_price_value", LIZJ16);
        }
        String LIZJ17 = eventParamHelper2.LIZJ("discount_percentage");
        if (LIZJ17 != null) {
            LIZLLL2.LJI("discount_percentage", LIZJ17);
        }
        C71183Rwh.LIZ(LIZLLL2);
        LIZLLL2.LJIIIIZZ(map6);
        LIZLLL2.LJIIIIZZ(hashMap5);
        LIZLLL2.LJIIIIZZ(C71183Rwh.LIZIZ());
        LIZLLL2.LJIIIIZZ(LJIIL);
        C48658J7u.LIZ("livesdk_tiktokec_product_show", LIZLLL2.LIZ);
        if (o.LJ(bool3, bool2) || C71183Rwh.LIZJ(map6)) {
            HashMap hashMap6 = new HashMap();
            if (map6 != null) {
                hashMap6.putAll(map6);
            }
            hashMap6.put("refer", "image");
            HashMap hashMap7 = new HashMap();
            hashMap7.put("room_id", valueOf2);
            ILiveOuterService LJJJLL2 = LiveOuterService.LJJJLL();
            if (LJJJLL2 != null && (LJJIJIL = LJJJLL2.LJJIJIL()) != null && LJJIJIL.LIZIZ() != null) {
                C28835BTj.LIZ("live_ad", "othershow", hashMap6, hashMap7);
            }
        }
    }

    @Override // X.AbstractC71186Rwk
    public final void LJIIIIZZ(String str, String str2) {
        C71284RyK.LIZIZ("pin_product", str, str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71184Rwi(AbstractC71187Rwl widget, InterfaceC71246Rxi interfaceC71246Rxi, C71195Rwt explainCardLoggerHelper) {
        super(widget, interfaceC71246Rxi, explainCardLoggerHelper);
        o.LJIIIZ(widget, "widget");
        o.LJIIIZ(explainCardLoggerHelper, "explainCardLoggerHelper");
        this.LJFF = C221108m2.LIZIZ(C39M.LJLIL);
        this.LJI = new LinkedHashMap();
    }

    @Override // X.AbstractC71186Rwk
    public final void LIZLLL(PopProductResp popProductResp, boolean z, boolean z2, boolean z3) {
        LJIIJ();
        if (this.LIZ.LJIIZILJ().LJLIL != null) {
            if (z) {
                this.LIZ.LJJIFFI(z2);
            }
            LJIIJJI(z3);
        }
    }
}
