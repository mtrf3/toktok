package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommercelive.business.cache.LiveExposedProductsCache;
import com.ss.android.ugc.aweme.ecommercelive.common.popcard.vo.PopupCardVO;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.CreatorProductListLynxConfigSettings;
import com.ss.android.ugc.aweme.influencer.ecommercelive.IEcommerceInfluencerService;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.serviceimpl.EcommerceInfluencerServiceImpl;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Rvk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71124Rvk extends AbstractC71189Rwn {
    public final InterfaceC31752CdA LJLLI;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    @Override // X.AbstractC71170RwU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.animation.Animation LJIIJ() {
        /*
            r20 = this;
            r3 = r20
            T extends android.view.View r0 = r3.LJLJI
            r5 = 0
            if (r0 == 0) goto L8c
            android.content.Context r2 = r0.getContext()
        Lc:
            X.CdA r1 = r3.LJLLI
            java.lang.String r0 = "liveSlotService"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            android.graphics.Rect r4 = X.C71126Rvm.LIZ(r2, r1)
            X.Rvo r0 = X.InterfaceC71129Rvp.LJFF
            int r2 = r3.LJLILLLLZI
            r0.getClass()
            r0 = 2
            r10 = 1
            if (r2 != r0) goto L86
            r1 = 1
        L23:
            r0 = 0
        L24:
            r1 = r1 | r0
            r6 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L53
            android.view.animation.ScaleAnimation r5 = new android.view.animation.ScaleAnimation
            r8 = r6
            r9 = r7
            r11 = r6
            r12 = r10
            r13 = r7
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
        L34:
            android.view.animation.AlphaAnimation r4 = new android.view.animation.AlphaAnimation
            r4.<init>(r6, r7)
            android.view.animation.AnimationSet r2 = new android.view.animation.AnimationSet
            r2.<init>(r10)
            r0 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r0)
            r2.addAnimation(r5)
            r2.addAnimation(r4)
            Y.IDAListenerS236S0100000_12 r1 = new Y.IDAListenerS236S0100000_12
            r0 = 3
            r1.<init>(r3, r0)
            r2.setAnimationListener(r1)
            return r2
        L53:
            if (r4 == 0) goto L6a
            float r17 = r4.exactCenterX()
            r16 = 0
        L5b:
            android.view.animation.ScaleAnimation r5 = new android.view.animation.ScaleAnimation
            r11 = r5
            r12 = r6
            r13 = r7
            r14 = r6
            r15 = r7
            r18 = r10
            r19 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            goto L34
        L6a:
            T extends android.view.View r0 = r3.LJLJI
            if (r0 == 0) goto L72
            android.content.Context r5 = r0.getContext()
        L72:
            boolean r0 = X.C90193gN.LIZIZ(r5)
            if (r0 == 0) goto L83
            int r0 = com.bytedance.android.livesdk.livesetting.other.LiveAudienceBottomToolsRtlSetting.getValue()
            if (r0 != r10) goto L83
            r17 = 1065353216(0x3f800000, float:1.0)
        L80:
            r16 = 1
            goto L5b
        L83:
            r17 = 0
            goto L80
        L86:
            r1 = 0
            r0 = 3
            if (r2 != r0) goto L23
            r0 = 1
            goto L24
        L8c:
            r2 = r5
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71124Rvk.LJIIJ():android.view.animation.Animation");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    @Override // X.AbstractC71170RwU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.animation.Animation LJIIJJI() {
        /*
            r20 = this;
            r5 = r20
            T extends android.view.View r0 = r5.LJLJI
            r4 = 0
            if (r0 == 0) goto L83
            android.content.Context r2 = r0.getContext()
        Lc:
            X.CdA r1 = r5.LJLLI
            java.lang.String r0 = "liveSlotService"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            android.graphics.Rect r3 = X.C71126Rvm.LIZ(r2, r1)
            X.Rvo r0 = X.InterfaceC71129Rvp.LJFF
            int r2 = r5.LJLILLLLZI
            r0.getClass()
            r0 = 2
            r10 = 1
            if (r2 != r0) goto L7d
            r1 = 1
        L23:
            r0 = 0
        L24:
            r1 = r1 | r0
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            if (r1 == 0) goto L4a
            android.view.animation.ScaleAnimation r5 = new android.view.animation.ScaleAnimation
            r8 = r6
            r9 = r7
            r11 = r7
            r12 = r10
            r13 = r6
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
        L34:
            android.view.animation.AlphaAnimation r3 = new android.view.animation.AlphaAnimation
            r3.<init>(r6, r7)
            android.view.animation.AnimationSet r2 = new android.view.animation.AnimationSet
            r2.<init>(r10)
            r0 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r0)
            r2.addAnimation(r5)
            r2.addAnimation(r3)
            return r2
        L4a:
            if (r3 == 0) goto L61
            float r17 = r3.exactCenterX()
            r16 = 0
        L52:
            android.view.animation.ScaleAnimation r5 = new android.view.animation.ScaleAnimation
            r11 = r5
            r12 = r6
            r13 = r7
            r14 = r6
            r15 = r7
            r18 = r10
            r19 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            goto L34
        L61:
            T extends android.view.View r0 = r5.LJLJI
            if (r0 == 0) goto L69
            android.content.Context r4 = r0.getContext()
        L69:
            boolean r0 = X.C90193gN.LIZIZ(r4)
            if (r0 == 0) goto L7a
            int r0 = com.bytedance.android.livesdk.livesetting.other.LiveAudienceBottomToolsRtlSetting.getValue()
            if (r0 != r10) goto L7a
            r17 = 1065353216(0x3f800000, float:1.0)
        L77:
            r16 = 1
            goto L52
        L7a:
            r17 = 0
            goto L77
        L7d:
            r1 = 0
            r0 = 3
            if (r2 != r0) goto L23
            r0 = 1
            goto L24
        L83:
            r2 = r4
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71124Rvk.LJIIJJI():android.view.animation.Animation");
    }

    @Override // X.AbstractC71189Rwn
    public final boolean LJIJ() {
        return false;
    }

    @Override // X.InterfaceC71446S2g
    public final void LJI() {
        String str;
        String str2;
        String str3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String str4;
        HashMap hashMap;
        boolean z5;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        java.util.Map<String, String> map;
        String str15;
        Long l;
        String str16;
        C48502J1u c48502J1u;
        C48502J1u c48502J1u2;
        PopupCardVO popupCardVO = this.LJLIL;
        if (popupCardVO != null) {
            str = Long.valueOf(popupCardVO.getProductId()).toString();
        } else {
            str = null;
        }
        C48502J1u c48502J1u3 = this.LJLJJLL;
        if (c48502J1u3 != null) {
            str2 = c48502J1u3.LIZJ("room_id");
        } else {
            str2 = null;
        }
        C48502J1u c48502J1u4 = this.LJLJJLL;
        if (c48502J1u4 != null) {
            str3 = c48502J1u4.LIZJ("live_role");
        } else {
            str3 = null;
        }
        PopupCardVO popupCardVO2 = this.LJLIL;
        if (popupCardVO2 != null) {
            z = popupCardVO2.isFromMessage();
        } else {
            z = false;
        }
        C48502J1u c48502J1u5 = this.LJLJJLL;
        if (c48502J1u5 != null) {
            z2 = c48502J1u5.LIZLLL("is_page_visible");
        } else {
            z2 = false;
        }
        C48502J1u c48502J1u6 = this.LJLJJLL;
        if (c48502J1u6 != null) {
            z3 = c48502J1u6.LIZLLL("has_permission");
        } else {
            z3 = false;
        }
        C48502J1u c48502J1u7 = this.LJLJJLL;
        if (c48502J1u7 != null) {
            z4 = c48502J1u7.LIZLLL("is_keyboard_showing");
        } else {
            z4 = false;
        }
        C48502J1u c48502J1u8 = this.LJLJJLL;
        if (c48502J1u8 != null) {
            str4 = c48502J1u8.LIZJ("author_id");
        } else {
            str4 = null;
        }
        java.util.Map<String, String> LJIIL = LJIIL();
        String str17 = LJIIL.get("pos_selling_point");
        boolean LJJJIL = C78857UxB.LJJJIL(str17);
        try {
            hashMap = (HashMap) C75792yF.LIZIZ().LJII(LJIIL.get("selling_point_da_info"), new C71127Rvn().getType());
        } catch (Exception unused) {
            hashMap = null;
        }
        String str18 = LJIIL.get("rights_content");
        if (str18 != null && (c48502J1u2 = this.LJLJJLL) != null) {
            z5 = false;
            c48502J1u2.LJII("rights_content", str18, false);
        } else {
            z5 = false;
        }
        String str19 = LJIIL.get("rights_cnt");
        if (str19 != null && (c48502J1u = this.LJLJJLL) != null) {
            c48502J1u.LJII("rights_cnt", str19, z5);
        }
        C48502J1u c48502J1u9 = this.LJLJJLL;
        if (c48502J1u9 != null) {
            str5 = c48502J1u9.LIZJ("enter_from_merge");
        } else {
            str5 = null;
        }
        C48502J1u c48502J1u10 = this.LJLJJLL;
        if (c48502J1u10 != null) {
            str6 = c48502J1u10.LIZJ("enter_method");
        } else {
            str6 = null;
        }
        C48502J1u c48502J1u11 = this.LJLJJLL;
        if (c48502J1u11 != null) {
            str7 = c48502J1u11.LIZJ("action_type");
        } else {
            str7 = null;
        }
        C48502J1u c48502J1u12 = this.LJLJJLL;
        if (c48502J1u12 != null) {
            str8 = c48502J1u12.LIZJ("product_source");
        } else {
            str8 = null;
        }
        C48502J1u c48502J1u13 = this.LJLJJLL;
        if (c48502J1u13 != null) {
            str9 = c48502J1u13.LIZJ("track_id");
        } else {
            str9 = null;
        }
        C48502J1u c48502J1u14 = this.LJLJJLL;
        if (c48502J1u14 != null) {
            str10 = c48502J1u14.LIZJ("item_order");
        } else {
            str10 = null;
        }
        C48502J1u c48502J1u15 = this.LJLJJLL;
        if (c48502J1u15 != null) {
            str11 = c48502J1u15.LIZJ("follow_status");
        } else {
            str11 = null;
        }
        C48502J1u c48502J1u16 = this.LJLJJLL;
        if (c48502J1u16 != null) {
            str12 = c48502J1u16.LIZJ("is_ad");
        } else {
            str12 = null;
        }
        C48502J1u c48502J1u17 = this.LJLJJLL;
        if (c48502J1u17 != null) {
            str13 = c48502J1u17.LIZJ("request_id");
        } else {
            str13 = null;
        }
        C48502J1u c48502J1u18 = this.LJLJJLL;
        if (c48502J1u18 != null) {
            str14 = c48502J1u18.LIZJ("page_name");
        } else {
            str14 = null;
        }
        String str20 = LJIIL.get("sellingpoint_cnt");
        AbstractC71212RxA abstractC71212RxA = (AbstractC71212RxA) this.LJLJI;
        if (abstractC71212RxA != null) {
            map = abstractC71212RxA.getPromotionLogoDaInfo();
        } else {
            map = null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            jSONObject.put("author_id", str4);
            jSONObject.put("product_id", str);
            jSONObject.put("room_id", str2);
            if (str5 == null) {
                str5 = "";
            }
            jSONObject.put("enter_from_merge", str5);
            if (str6 == null) {
                str6 = "";
            }
            jSONObject.put("enter_method", str6);
            if (str7 == null) {
                str7 = "";
            }
            jSONObject.put("action_type", str7);
            if (str8 == null) {
                str8 = "";
            }
            jSONObject.put("product_source", str8);
            if (str9 == null) {
                str9 = "";
            }
            jSONObject.put("track_id", str9);
            jSONObject.put("source_page_type", "live");
            if (str10 == null) {
                str10 = "";
            }
            jSONObject.put("item_order", str10);
            jSONObject.put("entrance_form", "live_popup_card");
            if (str11 == null) {
                str11 = "";
            }
            jSONObject.put("follow_status", str11);
            if (str12 == null) {
                str12 = "";
            }
            jSONObject.put("is_ad", str12);
            C71162RwM.LIZ(jSONObject, "request_id", str13);
            jSONObject.put("page_name", str14);
            if (LJJJIL) {
                str16 = "1";
            } else {
                str16 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("has_sellingpoint", str16);
            C71162RwM.LIZ(jSONObject, "pos_selling_point", str17);
            if (hashMap != null) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
            C71162RwM.LIZ(jSONObject, "sellingpoint_cnt", str20);
            C71162RwM.LIZ(jSONObject, "live_role", str3);
            if (map != null) {
                for (Map.Entry<String, String> entry2 : map.entrySet()) {
                    jSONObject.put(entry2.getKey(), entry2.getValue());
                }
            }
            C48658J7u.LIZIZ("livesdk_tiktokec_product_sellingpoint_show", jSONObject);
        } catch (Exception unused2) {
        }
        PopupCardVO popupCardVO3 = this.LJLIL;
        if (popupCardVO3 != null) {
            str15 = popupCardVO3.getFromMessageId();
        } else {
            str15 = null;
        }
        C71162RwM.LJI(str, str2, str15, str4, str3);
        C48658J7u.LIZ("livesdk_tiktokec_product_entrance_show", C113554cx.LJJLIIIJILLIZJL(this.LJLJLLL, LJIIL));
        C71161RwL.LIZ(EnumC71173RwX.SHOW_TO_USER, str3 != null ? str3 : "", str2, str, z2, z4, z3, z);
        LiveExposedProductsCache liveExposedProductsCache = LiveExposedProductsCache.LIZ;
        PopupCardVO popupCardVO4 = this.LJLIL;
        if (popupCardVO4 != null) {
            l = Long.valueOf(popupCardVO4.getProductId());
        } else {
            l = null;
        }
        liveExposedProductsCache.getClass();
        if (str2 == null || l == null) {
            return;
        }
        LiveExposedProductsCache.LIZ(str2, str4, new AqS178S0100000_12(l, 195));
    }

    @Override // X.InterfaceC71446S2g
    public final void LIZIZ(java.util.Map<String, String> map) {
        String LIZJ;
        C48502J1u c48502J1u = this.LJLJJLL;
        if (c48502J1u != null && (LIZJ = c48502J1u.LIZJ("live_role")) != null) {
            map = C113554cx.LJJLIIIJJI(map, new OSZ("live_role", LIZJ));
        }
        C48658J7u.LIZ("livesdk_tiktokec_label_show", C113554cx.LJJLIIIJILLIZJL(this.LJLJLLL, map));
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [X.Yns, X.Prl] */
    /* JADX WARN: Type inference failed for: r0v29, types: [X.Yns, X.Prl] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.Yns, X.Prl] */
    @Override // X.InterfaceC71446S2g
    public final void onClick(String str) {
        Context context;
        List<Object> assistantModules;
        String str2;
        PopupCardVO popupCardVO;
        switch (str.hashCode()) {
            case -1377687758:
                if (!str.equals("button") || (popupCardVO = this.LJLIL) == null) {
                    return;
                }
                LJIJJLI(str, popupCardVO, this.LJLJJLL);
                ?? r0 = this.LJLJL;
                if (r0 != 0) {
                    r0.invoke(str);
                }
                XKX.LIZLLL(C48841JEv.LIZ(C36576EXc.LIZJ), C78613UtF.LIZJ, null, new C71015Rtz(this, popupCardVO, null), 2);
                return;
            case 110986:
                if (!str.equals("pic")) {
                    return;
                }
                break;
            case 106069776:
                if (!str.equals("other")) {
                    return;
                }
                break;
            case 110371416:
                if (!str.equals("title")) {
                    return;
                }
                break;
            case 1429828318:
                if (!str.equals("assistant")) {
                    return;
                }
                ?? r02 = this.LJLJL;
                if (r02 != 0) {
                    r02.invoke(str);
                }
                T t = this.LJLJI;
                if (t == 0 || (context = t.getContext()) == null) {
                    return;
                }
                PopupCardVO popupCardVO2 = this.LJLIL;
                if (popupCardVO2 != null && (assistantModules = popupCardVO2.getAssistantModules()) != null && (!assistantModules.isEmpty())) {
                    LJJ(context, "success");
                    if (C76800UCe.LIZ != null) {
                        return;
                    }
                }
                PopupCardVO popupCardVO3 = this.LJLIL;
                if (popupCardVO3 != null && popupCardVO3.getPlatform() == 5) {
                    LJJ(context, "no_sellingpoint");
                    return;
                } else {
                    LJJ(context, "noncl_product");
                    return;
                }
            default:
                return;
        }
        PopupCardVO popupCardVO4 = this.LJLIL;
        if (popupCardVO4 == null) {
            return;
        }
        IEcommerceInfluencerService LJ = EcommerceInfluencerServiceImpl.LJ();
        C48502J1u c48502J1u = this.LJLJJLL;
        if (c48502J1u == null || (str2 = c48502J1u.LIZJ("room_id")) == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LJ.LIZIZ(str2, String.valueOf(popupCardVO4.getProductId()));
        LJIJJLI(str, popupCardVO4, this.LJLJJLL);
        ?? r03 = this.LJLJL;
        if (r03 == 0) {
            return;
        }
        r03.invoke(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71124Rvk(java.util.Map<String, String> showParams, C71195Rwt explainCardLoggerHelper) {
        super(showParams, explainCardLoggerHelper);
        o.LJIIIZ(showParams, "showParams");
        o.LJIIIZ(explainCardLoggerHelper, "explainCardLoggerHelper");
        LiveOuterService.LJJJLL().LJJJJJL();
        this.LJLLI = C31750Cd8.LIZ;
    }

    public final void LJJ(Context context, String str) {
        String str2;
        Object obj;
        String LIZJ;
        int hashCode = str.hashCode();
        if (hashCode != -1867169789) {
            if (hashCode != -379701762) {
                if (hashCode != 1274762662 || !str.equals("noncl_product")) {
                    return;
                }
                Activity LJIJJ = C45804HyK.LJIJJ(context);
                if (LJIJJ != null) {
                    C26045AKb c26045AKb = new C26045AKb(LJIJJ);
                    c26045AKb.LJIIIZ(C86V.LJFF(R.string.tcs));
                    c26045AKb.LIZLLL(3000L);
                    c26045AKb.LJIIJ();
                }
                C71162RwM.LIZIZ("moderator", this.LJLJJLL, "noncl_product", "assistant modules less than two");
                return;
            }
            if (!str.equals("no_sellingpoint")) {
                return;
            }
            Activity LJIJJ2 = C45804HyK.LJIJJ(context);
            if (LJIJJ2 != null) {
                C26045AKb c26045AKb2 = new C26045AKb(LJIJJ2);
                c26045AKb2.LJIIIZ(C86V.LJFF(R.string.hoz));
                c26045AKb2.LIZLLL(3000L);
                c26045AKb2.LJIIJ();
            }
            C71162RwM.LIZIZ("moderator", this.LJLJJLL, "no_sellingpoint", "assistant modules less than two");
            return;
        }
        if (!str.equals("success")) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        String LIZ2 = CreatorProductListLynxConfigSettings.LIZ();
        C48502J1u c48502J1u = this.LJLJJLL;
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (c48502J1u == null || (str2 = c48502J1u.LIZJ("room_id")) == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.append(ujb.o.LJJJJZ(ujb.o.LJJJJZ(ujb.o.LJJJJZ(LIZ2, "_roomId_", str2, false), "_isLiving_", "true", false), "_liveStatus_", "during_live", false));
        LIZ.append("&explain_product_id=");
        PopupCardVO popupCardVO = this.LJLIL;
        if (popupCardVO != null) {
            obj = Long.valueOf(popupCardVO.getProductId());
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.append(obj);
        LIZ.append("&moderate_author_id=");
        C48502J1u c48502J1u2 = this.LJLJJLL;
        if (c48502J1u2 != null && (LIZJ = c48502J1u2.LIZJ("author_id")) != null) {
            str3 = LIZJ;
        }
        LIZ.append(str3);
        LIZ.append("&user_type=moderato");
        SmartRouter.buildRoute(context, X1D.LIZIZ(LIZ)).open();
        C71162RwM.LIZIZ("moderator", this.LJLJJLL, "success", null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f1, code lost:
    
        if (r45 != null) goto L13;
     */
    @Override // X.AbstractC71189Rwn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(com.ss.android.ugc.aweme.ecommercelive.common.popcard.vo.PopupCardVO r44, X.C48502J1u r45, android.content.Context r46) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71124Rvk.LJIJI(com.ss.android.ugc.aweme.ecommercelive.common.popcard.vo.PopupCardVO, X.J1u, android.content.Context):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(java.lang.String r11, com.ss.android.ugc.aweme.ecommercelive.common.popcard.vo.PopupCardVO r12, X.C48502J1u r13) {
        /*
            r10 = this;
            r4 = r13
            if (r4 == 0) goto Lc
            java.lang.String r2 = "start_click_time"
            long r0 = java.lang.System.currentTimeMillis()
            r4.LJI(r0, r2)
        Lc:
            r7 = r12
            int r1 = r7.getPlatform()
            r0 = 5
            java.lang.String r2 = "skip_pdp"
            if (r1 != r0) goto L47
            java.lang.String r0 = "button"
            boolean r0 = kotlin.jvm.internal.o.LJ(r11, r0)
            if (r0 == 0) goto L47
            X.Klm r0 = X.C52670Klm.LIZ
            r0.getClass()
            X.Ol8 r0 = X.C52670Klm.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L47
            r8 = r2
        L32:
            r1 = 0
            if (r4 == 0) goto L3a
            java.lang.String r0 = "purchase_path"
            r4.LJII(r0, r8, r1)
        L3a:
            boolean r0 = kotlin.jvm.internal.o.LJ(r8, r2)
            if (r0 == 0) goto L4a
            boolean r0 = r7.isSoldOut()
            if (r0 == 0) goto L4a
            return
        L47:
            java.lang.String r8 = "normal"
            goto L32
        L4a:
            r5 = r10
            T extends android.view.View r0 = r5.LJLJI
            r9 = 0
            if (r0 == 0) goto L56
            android.content.Context r6 = r0.getContext()
            if (r6 != 0) goto L57
        L56:
            return
        L57:
            com.bytedance.android.livesdk.model.message.ext.PromotionView r0 = r7.getPromotionView()
            if (r0 == 0) goto Lac
            java.util.List<com.bytedance.android.livesdk.model.message.ext.PromotionItem> r0 = r0.promotion_items
            if (r0 == 0) goto Lac
            java.lang.Object r0 = X.ORZ.LJLLLL(r0)
            com.bytedance.android.livesdk.model.message.ext.PromotionItem r0 = (com.bytedance.android.livesdk.model.message.ext.PromotionItem) r0
            if (r0 == 0) goto Lac
            java.lang.Integer r0 = r0.getType()
            if (r0 == 0) goto Lac
            int r3 = r0.intValue()
        L73:
            com.bytedance.android.livesdk.model.message.ext.PromotionView r0 = r7.getPromotionView()
            if (r0 == 0) goto Laa
            java.util.List<com.bytedance.android.livesdk.model.message.ext.PromotionItem> r0 = r0.promotion_items
            if (r0 == 0) goto Laa
            java.lang.Object r0 = X.ORZ.LJLLLL(r0)
            com.bytedance.android.livesdk.model.message.ext.PromotionItem r0 = (com.bytedance.android.livesdk.model.message.ext.PromotionItem) r0
            if (r0 == 0) goto Laa
            java.lang.Integer r0 = r0.getStyle()
            if (r0 == 0) goto Laa
            int r2 = r0.intValue()
        L8f:
            r1 = 3
            if (r3 != r1) goto La6
            r0 = 1
            if (r2 == r0) goto L97
            if (r2 != r1) goto La6
        L97:
            X.XIF r0 = X.C36576EXc.LIZJ
            X.2gm r0 = X.C48841JEv.LIZ(r0)
            X.Rty r3 = new X.Rty
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.XKX.LIZLLL(r0, r9, r9, r3, r1)
        La5:
            return
        La6:
            r5.LJIL(r7, r4, r6, r8)
            goto La5
        Laa:
            r2 = -1
            goto L8f
        Lac:
            r3 = 0
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71124Rvk.LJIJJLI(java.lang.String, com.ss.android.ugc.aweme.ecommercelive.common.popcard.vo.PopupCardVO, X.J1u):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(com.ss.android.ugc.aweme.ecommercelive.common.popcard.vo.PopupCardVO r62, X.C48502J1u r63, android.content.Context r64, java.lang.String r65) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71124Rvk.LJIL(com.ss.android.ugc.aweme.ecommercelive.common.popcard.vo.PopupCardVO, X.J1u, android.content.Context, java.lang.String):void");
    }
}
