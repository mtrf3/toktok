package X;

import Y.IDAListenerS236S0100000_12;
import android.app.Activity;
import android.content.Context;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommercelive.common.popcard.vo.PopupCardVO;
import com.ss.android.ugc.aweme.influencer.ecommercelive.CreatorProductListLynxConfigSettings;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Rvl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71125Rvl extends AbstractC71189Rwn {
    public final Context LJLLI;

    @Override // X.AbstractC71189Rwn
    public final boolean LJIJ() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC71446S2g
    public final void LJI() {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        int i;
        PopupCardVO popupCardVO = this.LJLIL;
        if (popupCardVO != null) {
            str = Long.valueOf(popupCardVO.getProductId()).toString();
        } else {
            str = null;
        }
        C48502J1u c48502J1u = this.LJLJJLL;
        if (c48502J1u != null) {
            str2 = c48502J1u.LIZJ("room_id");
        } else {
            str2 = null;
        }
        C48502J1u c48502J1u2 = this.LJLJJLL;
        if (c48502J1u2 != null) {
            str3 = c48502J1u2.LIZJ("live_role");
        } else {
            str3 = null;
        }
        C48502J1u c48502J1u3 = this.LJLJJLL;
        if (c48502J1u3 != null) {
            str4 = c48502J1u3.LIZJ("author_id");
        } else {
            str4 = null;
        }
        PopupCardVO popupCardVO2 = this.LJLIL;
        if (popupCardVO2 != null) {
            z = popupCardVO2.isFromMessage();
        } else {
            z = false;
        }
        C48502J1u c48502J1u4 = this.LJLJJLL;
        if (c48502J1u4 != null) {
            z2 = c48502J1u4.LIZLLL("is_page_visible");
        } else {
            z2 = false;
        }
        C48502J1u c48502J1u5 = this.LJLJJLL;
        if (c48502J1u5 != null) {
            z3 = c48502J1u5.LIZLLL("has_permission");
        } else {
            z3 = false;
        }
        C48502J1u c48502J1u6 = this.LJLJJLL;
        if (c48502J1u6 != null) {
            z4 = c48502J1u6.LIZLLL("is_keyboard_showing");
        } else {
            z4 = false;
        }
        PopupCardVO popupCardVO3 = this.LJLIL;
        if (popupCardVO3 != null) {
            str5 = popupCardVO3.getFromMessageId();
        } else {
            str5 = null;
        }
        C71162RwM.LJI(str, str2, str5, str4, str3);
        EnumC71173RwX enumC71173RwX = EnumC71173RwX.SHOW_TO_USER;
        if (str3 == null) {
            str3 = "";
        }
        C71161RwL.LIZ(enumC71173RwX, str3, str2, str, z2, z4, z3, z);
        C48502J1u c48502J1u7 = this.LJLJJLL;
        if (c48502J1u7 != null) {
            str6 = c48502J1u7.LIZJ("product_id");
        } else {
            str6 = null;
        }
        C48502J1u c48502J1u8 = this.LJLJJLL;
        if (c48502J1u8 != null) {
            str7 = c48502J1u8.LIZJ("product_source");
        } else {
            str7 = null;
        }
        C48502J1u c48502J1u9 = this.LJLJJLL;
        if (c48502J1u9 != null) {
            str8 = c48502J1u9.LIZJ("source_from");
        } else {
            str8 = null;
        }
        C48502J1u c48502J1u10 = this.LJLJJLL;
        if (c48502J1u10 != null) {
            str9 = c48502J1u10.LIZJ("source");
        } else {
            str9 = null;
        }
        C48502J1u c48502J1u11 = this.LJLJJLL;
        if (c48502J1u11 != null) {
            str10 = c48502J1u11.LIZJ("is_fans_price");
        } else {
            str10 = null;
        }
        PopupCardVO popupCardVO4 = this.LJLIL;
        if (popupCardVO4 != null) {
            i = o.LJ(popupCardVO4.getAssistantSwitch(), Boolean.TRUE);
        } else {
            i = 0;
        }
        Integer valueOf = Integer.valueOf(i);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            jSONObject.put("author_id", str4);
            jSONObject.put("room_id", str2);
            jSONObject.put("live_status", "during_live");
            jSONObject.put("product_id", str6);
            jSONObject.put("product_source", str7);
            jSONObject.put("source_from", str8);
            jSONObject.put("source", str9);
            jSONObject.put("is_fans_price", str10);
            jSONObject.put("has_live_helper", valueOf);
            C48658J7u.LIZIZ("livesdk_tiktokec_pin_product_show", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // X.AbstractC71170RwU
    public final Animation LJIIJ() {
        ScaleAnimation scaleAnimation;
        LiveOuterService.LJJJLL().LJJJJJL();
        if (C31749Cd7.LIZ(this.LJLLI, EnumC30736C4m.SLOT_LIVE_ANCHOR_TOOLBAR) == null) {
            scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 1.0f);
        } else {
            scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 0, (r0.right + r0.left) / 2, 1, 1.0f);
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(300L);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setAnimationListener(new IDAListenerS236S0100000_12(this, 4));
        return animationSet;
    }

    @Override // X.AbstractC71170RwU
    public final Animation LJIIJJI() {
        ScaleAnimation scaleAnimation;
        LiveOuterService.LJJJLL().LJJJJJL();
        if (C31749Cd7.LIZ(this.LJLLI, EnumC30736C4m.SLOT_LIVE_ANCHOR_TOOLBAR) == null) {
            scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 1.0f);
        } else {
            scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 0, (r0.right + r0.left) / 2, 1, 1.0f);
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(300L);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    public final String LJIJJLI() {
        String str;
        String LIZ = CreatorProductListLynxConfigSettings.LIZ();
        C48502J1u c48502J1u = this.LJLJJLL;
        if (c48502J1u == null || (str = c48502J1u.LIZJ("room_id")) == null) {
            str = "";
        }
        return ujb.o.LJJJJZ(ujb.o.LJJJJZ(ujb.o.LJJJJZ(LIZ, "_roomId_", str, false), "_isLiving_", "true", false), "_liveStatus_", "during_live", false);
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

    /* JADX WARN: Type inference failed for: r0v19, types: [X.Yns, X.Prl] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.Yns, X.Prl] */
    @Override // X.InterfaceC71446S2g
    public final void onClick(String str) {
        Context context;
        List<Object> assistantModules;
        Context context2;
        switch (str.hashCode()) {
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
                ?? r0 = this.LJLJL;
                if (r0 != 0) {
                    r0.invoke(str);
                }
                T t = this.LJLJI;
                if (t == 0 || (context = t.getContext()) == null) {
                    return;
                }
                PopupCardVO popupCardVO = this.LJLIL;
                if (popupCardVO != null && (assistantModules = popupCardVO.getAssistantModules()) != null && (!assistantModules.isEmpty())) {
                    LJIL(context, "success");
                    if (C76800UCe.LIZ != null) {
                        return;
                    }
                }
                PopupCardVO popupCardVO2 = this.LJLIL;
                if (popupCardVO2 != null && popupCardVO2.getPlatform() == 5) {
                    LJIL(context, "no_sellingpoint");
                    return;
                } else {
                    LJIL(context, "noncl_product");
                    return;
                }
            default:
                return;
        }
        ?? r02 = this.LJLJL;
        if (r02 != 0) {
            r02.invoke(str);
        }
        T t2 = this.LJLJI;
        if (t2 == 0 || (context2 = t2.getContext()) == null) {
            return;
        }
        SmartRouter.buildRoute(context2, LJIJJLI()).open();
    }

    public final void LJIL(Context context, String str) {
        Object obj;
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
                C71162RwM.LIZIZ("author", this.LJLJJLL, "noncl_product", "assistant modules less than two");
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
            C71162RwM.LIZIZ("author", this.LJLJJLL, "no_sellingpoint", "assistant modules less than two");
            return;
        }
        if (!str.equals("success")) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJIJJLI());
        LIZ.append("&explain_product_id=");
        PopupCardVO popupCardVO = this.LJLIL;
        if (popupCardVO != null) {
            obj = Long.valueOf(popupCardVO.getProductId());
        } else {
            obj = "";
        }
        LIZ.append(obj);
        SmartRouter.buildRoute(context, X1D.LIZIZ(LIZ)).open();
        C71162RwM.LIZIZ("author", this.LJLJJLL, "success", null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71125Rvl(Context context, java.util.Map<String, String> showParams, C71195Rwt explainCardLoggerHelper) {
        super(showParams, explainCardLoggerHelper);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(showParams, "showParams");
        o.LJIIIZ(explainCardLoggerHelper, "explainCardLoggerHelper");
        this.LJLLI = context;
    }
}
