package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.model.ActionBarButtonConf;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.nudge.TTDmNudgeConfigNudgeSticker;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.nudge.TtDmNudgeConfigModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.nudge.TtProfileViewerNudgeConfigModel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.4FU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4FU implements InterfaceC112624bS {
    public static final C4FU LIZ = new C4FU();
    public static final java.util.Map<String, Long> LIZIZ = new LinkedHashMap();
    public static final Emoji LIZJ;
    public static ActionBarButtonConf LIZLLL;
    public static ActionBarButtonConf LJ;

    static {
        String str;
        String uri;
        Emoji emoji = new Emoji();
        SettingsManager LIZLLL2 = SettingsManager.LIZLLL();
        TtDmNudgeConfigModel ttDmNudgeConfigModel = C106294Fd.LIZ;
        TtDmNudgeConfigModel ttDmNudgeConfigModel2 = (TtDmNudgeConfigModel) LIZLLL2.LJIIIIZZ("tt_dm_nudge_config", TtDmNudgeConfigModel.class, ttDmNudgeConfigModel);
        if (ttDmNudgeConfigModel2 != null) {
            ttDmNudgeConfigModel = ttDmNudgeConfigModel2;
        }
        TTDmNudgeConfigNudgeSticker tTDmNudgeConfigNudgeSticker = ttDmNudgeConfigModel.nudge_sticker;
        emoji.setAnimateType(tTDmNudgeConfigNudgeSticker.animate_type);
        emoji.setStaticType(tTDmNudgeConfigNudgeSticker.static_type);
        emoji.setDisplayName(tTDmNudgeConfigNudgeSticker.display_name);
        emoji.setId(tTDmNudgeConfigNudgeSticker.id);
        emoji.setWidth(tTDmNudgeConfigNudgeSticker.width);
        emoji.setHeight(tTDmNudgeConfigNudgeSticker.height);
        emoji.setStaticUrl(C77357UXp.LJII(emoji.getWidth(), emoji.getHeight(), tTDmNudgeConfigNudgeSticker.static_url));
        emoji.setAnimateUrl(C77357UXp.LJII(emoji.getWidth(), emoji.getHeight(), tTDmNudgeConfigNudgeSticker.animate_url));
        java.util.Map<String, String> map = tTDmNudgeConfigNudgeSticker.display_name_lang;
        HashMap<String, String> hashMap = new HashMap<>();
        o.LJIIIZ(map, "<this>");
        hashMap.putAll(map);
        emoji.setDisplayNameLangs(hashMap);
        LIZJ = emoji;
        UrlModel staticUrl = emoji.getStaticUrl();
        if (staticUrl != null) {
            str = staticUrl.getUri();
        } else {
            str = null;
        }
        String str2 = "https://p16-tiktokcdn-com.akamaized.net/obj/im-resource-tiktok/6867821798952443009.png";
        if (str == null) {
            str = "https://p16-tiktokcdn-com.akamaized.net/obj/im-resource-tiktok/6867821798952443009.png";
        }
        LIZLLL = new ActionBarButtonConf(Integer.valueOf(EnumC106114El.NUDGE.getValue()), C61845OOz.LIZ("aweme://im/send_sticker?conversation_id=CONVERSATION_ID&sticker_id=", emoji.getId()), EF7.LIZIZ().getString(R.string.eqs), str, str, null, null, null, null, null, null, null, null, null, null, null, false, false, null, 524256, null);
        UrlModel staticUrl2 = emoji.getStaticUrl();
        if (staticUrl2 != null && (uri = staticUrl2.getUri()) != null) {
            str2 = uri;
        }
        LJ = new ActionBarButtonConf(Integer.valueOf(EnumC106114El.NUDGE_BACK.getValue()), C61845OOz.LIZ("aweme://im/send_sticker?conversation_id=CONVERSATION_ID&sticker_id=", emoji.getId()), EF7.LIZIZ().getString(R.string.eqz), str2, str2, null, null, null, null, null, null, null, null, null, null, null, false, false, null, 524256, null);
    }

    @Override // X.InterfaceC112624bS
    public final Integer LIZJ() {
        if (C00F.LIZ(31744, 0, "tt_im_button_nudge_icon", false) != 1 || !C7ZI.LIZJ()) {
            return null;
        }
        if (LJ()) {
            return Integer.valueOf(R.drawable.biz);
        }
        return Integer.valueOf(R.drawable.bj0);
    }

    public static boolean LJ() {
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC112624bS
    public final String LIZIZ() {
        return C1DD.LIZLLL(R.string.eqs, "AppContextManager.getApp…ontext().getString(resId)");
    }

    public static boolean LJFF(C109544Rq c109544Rq) {
        if (c109544Rq != null && c109544Rq.getMsgType() == 5 && o.LJ(c109544Rq.getExt().get("a:src"), "action_bar:nudge") && C7ZI.LIZJ()) {
            return true;
        }
        return false;
    }

    public static boolean LJI(C109544Rq c109544Rq) {
        if (c109544Rq != null && c109544Rq.getMsgType() == 5 && o.LJ(c109544Rq.getExt().get("a:src"), "action_bar:nudge_back") && C7ZI.LIZJ()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC112624bS
    public final void LIZLLL(View view) {
        view.performHapticFeedback(0);
    }

    public static void LJIIIZ(C4FW c4fw, boolean z) {
        int i;
        String LJJJJZ;
        int LIZIZ2;
        View decorView;
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        if (validTopActivity == null) {
            return;
        }
        Window window = validTopActivity.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            Rect LIZJ2 = C73098SmU.LIZJ(decorView);
            int i2 = LIZJ2.bottom;
            View findViewById = decorView.findViewById(android.R.id.content);
            if (findViewById != null) {
                findViewById.getGlobalVisibleRect(LIZJ2);
            }
            i = i2 - LIZJ2.bottom;
        } else {
            i = 0;
        }
        if (z) {
            LJJJJZ = ujb.o.LJJJJZ(C1DD.LIZLLL(R.string.eqr, "AppContextManager.getApp…ontext().getString(resId)"), "%s", c4fw.LIZ, false);
        } else {
            LJJJJZ = ujb.o.LJJJJZ(C1DD.LIZLLL(R.string.evf, "AppContextManager.getApp…ontext().getString(resId)"), "%s", c4fw.LIZ, false);
        }
        int i3 = C4GY.LIZ[c4fw.LIZIZ.ordinal()];
        if (i3 != 1) {
            if (i3 != 3) {
                LIZIZ2 = C7MY.LIZIZ(61);
            } else {
                LIZIZ2 = C7MY.LIZIZ(46);
            }
        } else {
            LIZIZ2 = C7MY.LIZIZ(61);
        }
        AKT akt = new AKT(validTopActivity);
        akt.LJ(R.style.ux);
        C208158Ex c208158Ex = akt.LIZ;
        c208158Ex.LJLJJI = 0;
        c208158Ex.LJLILLLLZI = 0;
        akt.LJI(LJJJJZ);
        akt.LIZJ(3000L);
        C208158Ex c208158Ex2 = akt.LIZ;
        c208158Ex2.LJLJL = LIZIZ2 + i;
        c208158Ex2.LJLJLJ = c4fw.LIZJ;
        akt.LJII();
    }

    public static void LJII(C4GZ scenario, String str, C4FW c4fw, C4FX c4fx) {
        o.LJIIIZ(scenario, "scenario");
        if (LJIIIIZZ(scenario, true, str, c4fx)) {
            LJIIIZ(c4fw, true);
        }
    }

    public static boolean LJIIIIZZ(C4GZ scenario, boolean z, String str, C4FX c4fx) {
        String LJJJJZ;
        String str2;
        String value;
        String str3;
        String str4;
        Integer LJJIL;
        long j;
        o.LJIIIZ(scenario, "scenario");
        java.util.Map<String, Long> map = LIZIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(scenario);
        LIZ2.append('_');
        LIZ2.append(str);
        Long l = (Long) ((LinkedHashMap) map).get(X1D.LIZIZ(LIZ2));
        if (l != null) {
            long currentTimeMillis = System.currentTimeMillis() - l.longValue();
            int i = C4GY.LIZ[scenario.ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        SettingsManager LIZLLL2 = SettingsManager.LIZLLL();
                        TtProfileViewerNudgeConfigModel ttProfileViewerNudgeConfigModel = C106304Fe.LIZ;
                        TtProfileViewerNudgeConfigModel ttProfileViewerNudgeConfigModel2 = (TtProfileViewerNudgeConfigModel) LIZLLL2.LJIIIIZZ("tt_profile_viewer_nudge_config", TtProfileViewerNudgeConfigModel.class, ttProfileViewerNudgeConfigModel);
                        if (ttProfileViewerNudgeConfigModel2 != null) {
                            ttProfileViewerNudgeConfigModel = ttProfileViewerNudgeConfigModel2;
                        }
                        j = timeUnit.toMillis(ttProfileViewerNudgeConfigModel.frequency);
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    TimeUnit timeUnit2 = TimeUnit.SECONDS;
                    SettingsManager LIZLLL3 = SettingsManager.LIZLLL();
                    TtDmNudgeConfigModel ttDmNudgeConfigModel = C106294Fd.LIZ;
                    TtDmNudgeConfigModel ttDmNudgeConfigModel2 = (TtDmNudgeConfigModel) LIZLLL3.LJIIIIZZ("tt_dm_nudge_config", TtDmNudgeConfigModel.class, ttDmNudgeConfigModel);
                    if (ttDmNudgeConfigModel2 != null) {
                        ttDmNudgeConfigModel = ttDmNudgeConfigModel2;
                    }
                    j = timeUnit2.toMillis(ttDmNudgeConfigModel.frequency);
                }
            } else {
                j = 0;
            }
            if (currentTimeMillis <= j) {
                return false;
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(scenario);
        LIZ3.append('_');
        LIZ3.append(str);
        map.put(X1D.LIZIZ(LIZ3), Long.valueOf(System.currentTimeMillis()));
        if (C107454Jp.LIZ() && o.LJ(c4fx.LIZIZ, EnumC112374b3.PROFILE_VISITOR_LIST.getValue()) && (str4 = c4fx.LIZLLL) != null && (LJJIL = C38350F3i.LJJIL(str4)) != null) {
            int intValue = LJJIL.intValue();
            InterfaceC107424Jm activityStatusAnalytics = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAnalytics();
            C4FY.Companion.getClass();
            activityStatusAnalytics.LIZLLL(str, C106274Fb.LIZ(intValue));
        }
        Context applicationContext = GlobalContext.getApplicationContext();
        if (z) {
            String actionSchema = LJ.getActionSchema();
            if (actionSchema != null) {
                LJJJJZ = ujb.o.LJJJJZ(actionSchema, "CONVERSATION_ID", str, false);
            }
            LJJJJZ = "";
        } else {
            String actionSchema2 = LIZLLL.getActionSchema();
            if (actionSchema2 != null) {
                LJJJJZ = ujb.o.LJJJJZ(actionSchema2, "CONVERSATION_ID", str, false);
            }
            LJJJJZ = "";
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(applicationContext, LJJJJZ);
        if (z) {
            str2 = "action_bar:nudge_back";
        } else {
            str2 = "action_bar:nudge";
        }
        buildRoute.withParam("a:src", str2);
        if (z) {
            value = EnumC106144Eo.NUDGE_BACK.getValue();
        } else {
            value = EnumC106144Eo.NUDGE.getValue();
        }
        buildRoute.withParam("message_type", value);
        buildRoute.withParam("enter_from", c4fx.LIZ);
        buildRoute.withParam("enter_method", c4fx.LIZIZ);
        C4FZ c4fz = c4fx.LIZJ;
        String str5 = null;
        if (c4fz != null) {
            str3 = c4fz.LIZ;
        } else {
            str3 = null;
        }
        buildRoute.withParam("interaction_type", str3);
        C4FZ c4fz2 = c4fx.LIZJ;
        if (c4fz2 != null) {
            str5 = c4fz2.LIZIZ;
        }
        buildRoute.withParam("interaction_name", str5);
        buildRoute.open();
        if (!z) {
            return true;
        }
        C2U8.LIZ(new C1042247e(str));
        return true;
    }

    @Override // X.InterfaceC112624bS
    public final boolean LIZ(C4GZ scenario, String str, C4FW c4fw, C4FX c4fx) {
        o.LJIIIZ(scenario, "scenario");
        if (!LJIIIIZZ(scenario, false, C81273Gx.LIZJ(str), c4fx)) {
            return false;
        }
        LJIIIZ(c4fw, false);
        return true;
    }
}
