package X;

import android.content.Context;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.TakoInfo;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Jdk */
/* loaded from: classes9.dex */
public final class C49624Jdk {
    public static String LIZIZ;
    public static boolean LJ;
    public static final java.util.Set<String> LIZ = new LinkedHashSet();
    public static final java.util.Map<String, TakoInfo> LIZJ = new LinkedHashMap();
    public static final java.util.Map<String, Boolean> LIZLLL = new LinkedHashMap();
    public static final java.util.Map<String, Long> LJFF = new LinkedHashMap();
    public static final java.util.Set<String> LJI = new LinkedHashSet();
    public static final C49626Jdm LJII = C49626Jdm.LJLIL;
    public static final C49625Jdl LJIIIIZZ = C49625Jdl.LJLIL;
    public static final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(C8SD.LJLIL);

    public static boolean LIZLLL() {
        if (C49628Jdo.LIZ() && ((C49627Jdn.LIZIZ() || o.LJ(C49543JcR.LIZLLL().getEnableFeedEntranceForTrafficControl(), Boolean.TRUE)) && t1.LJI() && !((RBY) HG3.LJIILL()).isChildrenMode() && C78685UuP.LJJJZ(C49543JcR.LIZJ()))) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(Aweme aweme, M89 m89) {
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("shouldShowFeedBotButton: \nbotId = ");
        LIZ2.append(C49543JcR.LIZJ());
        LIZ2.append(" \nSearchTakoExperiment canshow = ");
        LIZ2.append(C34160Dau.LJFF());
        LIZ2.append("\nSingleColumnReverseExperiment canshow = ");
        LIZ2.append(C46442IKo.LIZ());
        LIZ2.append("\nPureFeedExp = ");
        LIZ2.append(C53326KwM.LIZ());
        LIZ2.append("\nisLogin = ");
        LIZ2.append(AccountService.LJIJ().LJFF().isLogin());
        LIZ2.append("\nisChildrenMode = ");
        LIZ2.append(((RBY) HG3.LJIILL()).isChildrenMode());
        LIZ2.append("\nisAd = ");
        LIZ2.append(aweme.isAd());
        LIZ2.append("  isLive = ");
        LIZ2.append(aweme.isLive());
        LIZ2.append("\nhasAnyProductAnchors = ");
        LIZ2.append(ECommerceAnchorService.LJJJJI().LJJJ(aweme));
        LIZ2.append("\nfeedParam.eventType = ");
        String str5 = null;
        if (m89 != null) {
            str = m89.getEventType();
        } else {
            str = null;
        }
        LIZ2.append(str);
        LIZ2.append("\nfeedParam.playlistPreviousPage = ");
        if (m89 != null) {
            str2 = m89.getPlaylistPreviousPage();
        } else {
            str2 = null;
        }
        LIZ2.append(str2);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("TakoHelper", X1D.LIZIZ(LIZ2));
        if (C49543JcR.LIZ() && LIZLLL() && DYB.LIZ() && !C53326KwM.LIZ() && C46442IKo.LIZ() && !aweme.isAd() && !aweme.isLive() && !ECommerceAnchorService.LJJJJI().LJJJ(aweme)) {
            if (m89 != null) {
                str3 = m89.getEventType();
            } else {
                str3 = null;
            }
            if (o.LJ(str3, "homepage_hot")) {
                return true;
            }
            if (m89 != null) {
                str4 = m89.getEventType();
            } else {
                str4 = null;
            }
            if (o.LJ(str4, "general_search")) {
                return true;
            }
            if (m89 != null) {
                str5 = m89.getEventType();
            }
            if (o.LJ(str5, "playlist") && o.LJ(m89.getPlaylistPreviousPage(), "general_search")) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void LIZIZ(Context context, String str, String str2, String str3, String str4) {
        LIZ(context, "general_search_tikbot", str, str2, str3, str4, null, null, "search_chat_sug", null);
    }

    public static void LIZ(Context context, String enterFrom, String enterMethod, String str, String str2, String str3, String str4, String str5, String str6, Long l) {
        String str7;
        List list;
        List list2;
        String str8;
        String str9;
        String str10;
        String str11;
        TakoInfo takoInfo;
        boolean z;
        String str12 = str6;
        String str13 = str5;
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        String valueOf = String.valueOf(System.currentTimeMillis() / 1000);
        if (str != null && ((str3 == null || str3.length() == 0) && C78685UuP.LJJJZ(str) && !LIZ.contains(str) && o.LJ(((LinkedHashMap) LIZLLL).get(str), Boolean.TRUE) && str2 != null && C78685UuP.LJJJZ(str2))) {
            TakoInfo takoInfo2 = (TakoInfo) ((LinkedHashMap) LIZJ).get(str);
            if (takoInfo2 != null) {
                str7 = takoInfo2.getMessageKey();
            } else {
                str7 = null;
            }
            list = C47261Igj.LJJIJ(str2);
        } else {
            str7 = null;
            list = null;
        }
        if (C78685UuP.LJJJZ(str3)) {
            list = C47261Igj.LJJIJ(str3);
            str7 = null;
        }
        String str14 = "";
        if (str7 == null) {
            str7 = "";
        }
        java.util.Map LIZJ2 = E2C.LIZJ("message_key", str7);
        if (context != null) {
            String botName = C49543JcR.LIZLLL().getBotName();
            if (botName == null || !C78685UuP.LJJJZ(botName)) {
                botName = context.getString(R.string.cnr);
                o.LJIIIIZZ(botName, "ctx.getString(R.string.chatGPT_name)");
            }
            C62822Ol8 c62822Ol8 = C49631Jdr.LIZ;
            if (((Number) c62822Ol8.getValue()).intValue() == 1 || ((Number) c62822Ol8.getValue()).intValue() == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String string = context.getString(R.string.s33);
                o.LJIIIIZZ(string, "ctx.getString(R.string.t…troductionDialogue_body1)");
                String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{botName}, 1));
                o.LJIIIIZZ(LLLZ, "format(format, *args)");
                list2 = C47261Igj.LJJIJ(LLLZ);
            } else {
                String string2 = context.getString(R.string.co2);
                o.LJIIIIZZ(string2, "ctx.getString(R.string.c…rst_sentence_placeholder)");
                String string3 = context.getString(R.string.co3);
                o.LJIIIIZZ(string3, "ctx.getString(R.string.c…_message_second_sentence)");
                list2 = C47261Igj.LJJIJIIJI(Q8U.LIZIZ(new Object[]{botName}, 1, string2, "format(format, *args)"), string3);
            }
        } else {
            list2 = null;
        }
        if (str != null && (takoInfo = (TakoInfo) ((LinkedHashMap) LIZJ).get(str)) != null) {
            str8 = takoInfo.getChatSugKey();
        } else {
            str8 = null;
        }
        OSZ[] oszArr = new OSZ[6];
        if (str4 == null) {
            str9 = "";
        } else {
            str9 = str4;
        }
        oszArr[0] = new OSZ("gid", str9);
        if (str13 == null) {
            str13 = "";
        }
        oszArr[1] = new OSZ("feed_bar", str13);
        if (str12 == null) {
            str12 = "";
        }
        oszArr[2] = new OSZ("source", str12);
        oszArr[3] = new OSZ("entry_time", valueOf);
        if (str8 == null) {
            str8 = "";
        }
        oszArr[4] = new OSZ("chat_sug_key", str8);
        oszArr[5] = new OSZ("view_duration", String.valueOf(l));
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        OSZ[] oszArr2 = new OSZ[2];
        if (str4 == null) {
            str10 = "";
        } else {
            str10 = str4;
        }
        oszArr2[0] = new OSZ("entry_gid", str10);
        oszArr2[1] = new OSZ("entry_time", valueOf);
        java.util.Map LJJL = C113554cx.LJJL(oszArr2);
        String LIZJ3 = C49543JcR.LIZJ();
        if (LIZJ3 == null) {
            LIZJ3 = "";
        }
        String botAvatar = C49543JcR.LIZLLL().getBotAvatar();
        if (botAvatar == null) {
            botAvatar = "";
        }
        if (str != null) {
            str14 = str;
        }
        Long l2 = (Long) ((LinkedHashMap) LJFF).get(str4);
        if (l2 != null) {
            str11 = l2.toString();
        } else {
            str11 = null;
        }
        C99003ua c99003ua = new C99003ua(enterFrom, enterMethod, LIZJ3, botAvatar, str14, list, LIZJ2, list2, LJJLIIIIJ, LJJL, 0, null, null, null, str11, false, 0, 113664, null);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("enterBotParams: ");
        LIZ2.append(C75792yF.LIZJ(c99003ua));
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("TakoHelper", X1D.LIZIZ(LIZ2));
        if (context != null && C78685UuP.LJJJZ(C49543JcR.LIZJ()) && C78685UuP.LJJJZ(C49543JcR.LIZLLL().getBotName())) {
            LIZIZ = str;
            if (!LJ) {
                LJ = true;
                C8SE imTakoService = IMService.createIIMServicebyMonsterPlugin(false).getImTakoService();
                imTakoService.LIZ().observeForever(LJIIIIZZ);
                imTakoService.LIZJ().observeForever(LJII);
            }
            IMService.createIIMServicebyMonsterPlugin(false).getImTakoService().LJ(context, c99003ua);
        }
    }
}
