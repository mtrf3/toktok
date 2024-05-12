package X;

import android.util.Pair;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommercelive.business.common.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.data.PopProductResp;
import com.ss.android.ugc.aweme.ecommercelive.common.popcard.vo.PopupCardVO;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.settings.AnchorPinCardConfig;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Rwj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71185Rwj extends AbstractC71186Rwk {
    public boolean LIZLLL;
    public final java.util.Map<String, String> LJ;

    @Override // X.AbstractC71186Rwk
    public final void LJ() {
    }

    @Override // X.AbstractC71186Rwk
    public final void LJFF(String str) {
    }

    @Override // X.AbstractC71186Rwk
    public final void LJI() {
    }

    @Override // X.AbstractC71186Rwk
    public final void LJII() {
    }

    public final void LJIIIZ() {
        if (this.LIZLLL) {
            return;
        }
        this.LIZ.LJIIZILJ().LJLJLJ = new AqS162S0100000_12(this, 1223);
        this.LIZ.LJIIZILJ().LJLJL = new AqS178S0100000_12(this, 698);
        this.LIZ.LJIIZILJ().LJLJJL = C71248Rxk.LJLIL;
        this.LIZLLL = true;
    }

    @Override // X.AbstractC71186Rwk
    public final void LIZIZ() {
        C42625Go9.LIZJ(this);
    }

    @Override // X.AbstractC71186Rwk
    public final void LIZ(String str) {
        String str2;
        String str3;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        IFrameSlot.SlotViewModel slotViewModel = this.LIZ.LJLJLJ;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LJLIL) != null && (value = mutableLiveData.getValue()) != null && o.LJ(value.first, Boolean.TRUE)) {
            IFrameSlot.SlotViewModel slotViewModel2 = this.LIZ.LJLJLJ;
            if (slotViewModel2 != null) {
                C78897Uxp.LJJJJZI(slotViewModel2, false);
            }
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
            String roleStr = EnumC71217RxF.ROOM_OWNER.getRoleStr();
            PopupCardVO popupCardVO = this.LIZ.LJIIZILJ().LJLIL;
            if (popupCardVO == null || (str3 = Long.valueOf(popupCardVO.getProductId()).toString()) == null) {
                str3 = "";
            }
            C71162RwM.LIZJ(str2, LJIILLIIL, roleStr, str3);
        }
        if (o.LJ("unpin", str)) {
            C2U8.LIZ(new C233899Fx(2));
        } else {
            if (o.LJ("repin", str)) {
                return;
            }
            C2U8.LIZ(new C233899Fx(1));
        }
    }

    @Override // X.AbstractC71186Rwk
    public final void LIZJ(OecInitData oecInitData) {
        PopupCardVO popupCardVO;
        C42625Go9.LIZIZ(this);
        LJIIIZ();
        if (oecInitData.product != null && (popupCardVO = this.LIZ.LJIIZILJ().LJLIL) != null) {
            LJIIJ(popupCardVO);
        }
    }

    public final void LJIIJ(PopupCardVO popupCardVO) {
        int i;
        String str;
        String str2;
        String str3;
        C86393XvR LJJIJIL;
        Integer bizType;
        String LIZ;
        String LIZIZ;
        String LIZIZ2;
        String LIZIZ3;
        String LIZIZ4;
        List<AtmosphereTag> atmosphereTags;
        IFrameSlot.SlotViewModel slotViewModel = this.LIZ.LJLJLJ;
        if (slotViewModel != null) {
            C78897Uxp.LJJJJZI(slotViewModel, true);
        }
        C71234RxW.LIZ.getClass();
        long j = ((AnchorPinCardConfig) C71234RxW.LIZJ.getValue()).duration;
        if (j <= 0) {
            j = 30000;
        }
        this.LIZ.LLII.sendEmptyMessageDelayed(0, j);
        this.LIZ.LJLL.LJII("product_id", String.valueOf(popupCardVO.getProductId()), false);
        C48502J1u c48502J1u = this.LIZ.LJLL;
        Integer bizType2 = popupCardVO.getBizType();
        int i2 = -1;
        if (bizType2 != null) {
            i = bizType2.intValue();
        } else {
            i = -1;
        }
        c48502J1u.LJFF(i, "biz_type");
        this.LIZ.LJLL.LJFF(popupCardVO.getPlatform(), "product_source");
        PopupCardVO popupCardVO2 = this.LIZ.LJIIZILJ().LJLIL;
        if (popupCardVO2 != null) {
            this.LIZ.LJLL.LJFF(popupCardVO2.getBagIndex(), "item_order");
        }
        if (this.LIZ.LJLL.LJ("label_type")) {
            this.LIZ.LJLL.LJIIJ("label_type");
        }
        if (this.LIZ.LJLL.LJ("label_number")) {
            this.LIZ.LJLL.LJIIJ("label_number");
        }
        PopupCardVO popupCardVO3 = this.LIZ.LJIIZILJ().LJLIL;
        if (popupCardVO3 != null && (atmosphereTags = popupCardVO3.getAtmosphereTags()) != null) {
            ArrayList arrayList = new ArrayList();
            for (AtmosphereTag atmosphereTag : atmosphereTags) {
                if (atmosphereTag.tagType == 1) {
                    arrayList.add(atmosphereTag);
                }
            }
            if (!arrayList.isEmpty()) {
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
        PromotionView promotionView = popupCardVO.getPromotionView();
        Long l = null;
        if (promotionView != null && (LIZIZ4 = C69889Rbp.LIZIZ(promotionView, "campaign_id")) != null && LIZIZ4.length() > 0) {
            this.LIZ.LJLL.LJII("campaign_id", LIZIZ4, false);
        }
        PromotionView promotionView2 = popupCardVO.getPromotionView();
        if (promotionView2 != null && (LIZIZ3 = C69889Rbp.LIZIZ(promotionView2, "campaign_channel")) != null && LIZIZ3.length() > 0) {
            this.LIZ.LJLL.LJII("campaign_channel", LIZIZ3, false);
        }
        PromotionView promotionView3 = popupCardVO.getPromotionView();
        if (promotionView3 != null && (LIZIZ2 = C69889Rbp.LIZIZ(promotionView3, "campaign_user_tag")) != null && LIZIZ2.length() > 0) {
            this.LIZ.LJLL.LJII("campaign_user_tag", LIZIZ2, false);
        }
        PromotionView promotionView4 = popupCardVO.getPromotionView();
        if (promotionView4 != null && (LIZIZ = C69889Rbp.LIZIZ(promotionView4, "campaign_type")) != null && LIZIZ.length() > 0) {
            this.LIZ.LJLL.LJII("campaign_type", LIZIZ, false);
        }
        this.LIZ.LJLL.LJII("source", popupCardVO.getSource(), true);
        this.LIZ.LJLL.LJII("source_from", String.valueOf(popupCardVO.getSourceFrom()), true);
        PopupCardVO popupCardVO4 = this.LIZ.LJIIZILJ().LJLIL;
        if (popupCardVO4 != null) {
            this.LIZ.LJLL.LJII("is_fans_price", popupCardVO4.hasFansPrice(), false);
        }
        this.LIZ.LJLL.LJI(System.currentTimeMillis(), "start_time");
        C48502J1u c48502J1u2 = this.LIZ.LJLL;
        java.util.Map<String, String> extra = popupCardVO.getExtra();
        if (extra != null) {
            str = extra.get("mix_product_type");
        } else {
            str = null;
        }
        String str4 = "";
        if (str == null) {
            str2 = "";
        } else {
            java.util.Map<String, String> extra2 = popupCardVO.getExtra();
            if (extra2 != null) {
                str2 = extra2.get("mix_product_type");
            } else {
                str2 = null;
            }
        }
        c48502J1u2.LJII("is_mix_product", str2, false);
        HashMap hashMap = (HashMap) this.LIZ.LJLL.LIZIZ();
        if (hashMap == null || (str3 = (String) hashMap.get("request_id")) == null) {
            str3 = "";
        }
        Room room = this.LIZ.LJLLI;
        if (room != null && (LIZ = C17280m4.LIZ(room)) != null) {
            str4 = LIZ;
        }
        String valueOf = String.valueOf(popupCardVO.getProductId());
        this.LIZ.LJLL.LJII("track_id", C70570Rmo.LIZ(str3, str4, valueOf), false);
        this.LIZ.LJLL.LJII("room_id", str4, false);
        if (!C38354F3m.LJ(str3)) {
            this.LIZ.LJLL.LJII("request_id", str3, false);
        }
        this.LIZ.LJLL.LJII("product_id", valueOf, false);
        java.util.Map<String, String> LJIIL = this.LIZ.LJIIZILJ().LJIIL();
        java.util.Map<String, String> map = this.LJ;
        PopupCardVO popupCardVO5 = this.LIZ.LJIIZILJ().LJLIL;
        if (popupCardVO5 != null && (bizType = popupCardVO5.getBizType()) != null) {
            i2 = bizType.intValue();
        }
        map.put("biz_type", String.valueOf(i2));
        this.LJ.putAll(LJIIL);
        if (this.LIZ.LJIILL()) {
            HashMap hashMap2 = new HashMap();
            java.util.Map<String, String> map2 = this.LIZ.LJLLLL;
            if (map2 != null) {
                hashMap2.putAll(map2);
            }
            hashMap2.put("refer", "product_detail");
            HashMap hashMap3 = new HashMap();
            Room room2 = this.LIZ.LJLLI;
            if (room2 != null) {
                l = Long.valueOf(room2.getId());
            }
            hashMap3.put("room_id", String.valueOf(l));
            ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
            if (LJJJLL != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null && LJJIJIL.LIZIZ() != null) {
                C28835BTj.LIZ("live_ad", "othershow", hashMap2, hashMap3);
            }
        }
        C2U8.LIZ(new C233899Fx(0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71185Rwj(AbstractC71187Rwl widget, C71195Rwt explainCardLoggerHelper) {
        super(widget, null, explainCardLoggerHelper);
        o.LJIIIZ(widget, "widget");
        o.LJIIIZ(explainCardLoggerHelper, "explainCardLoggerHelper");
        this.LJ = new LinkedHashMap();
    }

    @Override // X.AbstractC71186Rwk
    public final void LIZLLL(PopProductResp popProductResp, boolean z, boolean z2, boolean z3) {
        LJIIIZ();
        PopupCardVO popupCardVO = this.LIZ.LJIIZILJ().LJLIL;
        if (popupCardVO != null) {
            LJIIJ(popupCardVO);
        }
    }
}
