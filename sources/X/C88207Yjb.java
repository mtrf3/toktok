package X;

import Y.ARunnableS41S0100000_5;
import Y.ARunnableS49S0100000_13;
import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMultiGuestFluencyRefactorTechSwitchSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveFluencyEnterDurationSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS51S1000000_16;
import kotlin.jvm.internal.o;

/* renamed from: X.Yjb, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88207Yjb {
    public static final ArrayList<String> LIZ;
    public static final ArrayList<String> LIZIZ;
    public static final C5H3 LIZJ;
    public static final long LIZLLL;
    public static final java.util.Map<String, C5H3<CHK>> LJ;
    public static final java.util.Map<String, C5H3<CHL>> LJFF;
    public static String LJI;
    public static boolean LJII;
    public static InterfaceC31062CHa LJIIIIZZ;
    public static CGV LJIIIZ;

    public static void LJIIIZ() {
        CHK chk;
        LJII = true;
        C5H3 c5h3 = (C5H3) ((LinkedHashMap) LJ).get("broadcast_enter");
        if (c5h3 != null && (chk = (CHK) c5h3.getValue()) != null) {
            chk.LJII = true;
            chk.start();
            LIZIZ().postDelayed(new ARunnableS41S0100000_5(chk, 323), LIZLLL);
        }
    }

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("multi_guest_apply_page");
        arrayList.add("multi_guest_be_invite_page");
        arrayList.add("multi_guest_guest_preview_page");
        arrayList.add("multi_guest_guest_media_manage_page");
        arrayList.add("multi_guest_anchor_manage_page");
        arrayList.add("multi_guest_anchor_manage_page_scroll");
        arrayList.add("multi_guest_anchor_setting_page");
        LIZ = arrayList;
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("linkmic_anchor_period");
        arrayList2.add("linkmic_guest_period");
        arrayList2.add("linkmic_audience_period");
        LIZIZ = arrayList2;
        LIZJ = C78996UzQ.LJJIJIIJI(BGD.INSTANCE);
        LIZLLL = LiveFluencyEnterDurationSetting.INSTANCE.getValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJ = linkedHashMap;
        LJFF = new LinkedHashMap();
        LJI = "";
        linkedHashMap.put("watch_click_enter", C78996UzQ.LJJIJIIJI(C88208Yjc.LJLIL));
        linkedHashMap.put("watch_slide_enter", C78996UzQ.LJJIJIIJI(C88209Yjd.LJLIL));
        linkedHashMap.put("watch_slide", C78996UzQ.LJJIJIIJI(C88219Yjn.LJLIL));
        linkedHashMap.put("watch_period", C78996UzQ.LJJIJIIJI(C88228Yjw.LJLIL));
        linkedHashMap.put("broadcast_enter", C78996UzQ.LJJIJIIJI(C88230Yjy.LJLIL));
        linkedHashMap.put("broadcast_period", C78996UzQ.LJJIJIIJI(C88232Yk0.LJLIL));
        linkedHashMap.put("preview_enter", C78996UzQ.LJJIJIIJI(C88234Yk2.LJLIL));
        linkedHashMap.put("preview_period", C78996UzQ.LJJIJIIJI(C88236Yk4.LJLIL));
        linkedHashMap.put("broadcast_link_period", C78996UzQ.LJJIJIIJI(C88237Yk5.LJLIL));
        linkedHashMap.put("audience_link_period", C78996UzQ.LJJIJIIJI(C88210Yje.LJLIL));
        Iterator<String> it = arrayList2.iterator();
        while (it.hasNext()) {
            String next = it.next();
            LJ.put(next, C78996UzQ.LJJIJIIJI(new AqS51S1000000_16(next, 0)));
        }
        java.util.Map<String, C5H3<CHK>> map = LJ;
        map.put("pk_period", C78996UzQ.LJJIJIIJI(C88211Yjf.LJLIL));
        map.put("match_prepare", C78996UzQ.LJJIJIIJI(C88212Yjg.LJLIL));
        map.put("match_in_progress", C78996UzQ.LJJIJIIJI(C88213Yjh.LJLIL));
        map.put("match_color_eggs_task_start", C78996UzQ.LJJIJIIJI(C88214Yji.LJLIL));
        map.put("match_color_eggs_reward_start", C78996UzQ.LJJIJIIJI(C88215Yjj.LJLIL));
        map.put("match_color_eggs_guide", C78996UzQ.LJJIJIIJI(C88216Yjk.LJLIL));
        map.put("match_punish_prepare", C78996UzQ.LJJIJIIJI(C88217Yjl.LJLIL));
        map.put("match_punish", C78996UzQ.LJJIJIIJI(C88218Yjm.LJLIL));
        map.put("gift_play", C78996UzQ.LJJIJIIJI(C88220Yjo.LJLIL));
        map.put("panel_gift_slide", C78996UzQ.LJJIJIIJI(C88221Yjp.LJLIL));
        map.put("panel_broadcast_link_slide", C78996UzQ.LJJIJIIJI(C88222Yjq.LJLIL));
        map.put("panel_public_screen_slide", C78996UzQ.LJJIJIIJI(C88223Yjr.LJLIL));
        map.put("panel_public_screen_auto_slide", C78996UzQ.LJJIJIIJI(C88226Yju.LJLIL));
        map.put("panel_extended_public_screen_slide", C78996UzQ.LJJIJIIJI(C88227Yjv.LJLIL));
        map.put("panel_extended_public_screen_auto_slide", C78996UzQ.LJJIJIIJI(C88229Yjx.LJLIL));
        map.put("panel_beauty_slide", C78996UzQ.LJJIJIIJI(C88231Yjz.LJLIL));
        map.put("panel_filter_slide", C78996UzQ.LJJIJIIJI(C88233Yk1.LJLIL));
        map.put("panel_sticker_slide", C78996UzQ.LJJIJIIJI(C88235Yk3.LJLIL));
        map.put("panel_sound_slide", C78996UzQ.LJJIJIIJI(C88238Yk6.LJLIL));
        map.put("panel_effect_slide", C78996UzQ.LJJIJIIJI(C88239Yk7.LJLIL));
        Iterator<String> it2 = LIZ.iterator();
        while (it2.hasNext()) {
            String next2 = it2.next();
            LJ.put(next2, C78996UzQ.LJJIJIIJI(new AqS51S1000000_16(next2, 2)));
        }
        java.util.Map<String, C5H3<CHL>> map2 = LJFF;
        map2.put("watch_period", C78996UzQ.LJJIJIIJI(C88206Yja.LJLIL));
        map2.put("broadcast_period", C78996UzQ.LJJIJIIJI(C88203YjX.LJLIL));
        map2.put("preview_period", C78996UzQ.LJJIJIIJI(C88200YjU.LJLIL));
        map2.put("broadcast_link_period", C78996UzQ.LJJIJIIJI(C88201YjV.LJLIL));
        map2.put("audience_link_period", C78996UzQ.LJJIJIIJI(C88202YjW.LJLIL));
        Iterator<String> it3 = LIZIZ.iterator();
        while (it3.hasNext()) {
            String next3 = it3.next();
            LJFF.put(next3, C78996UzQ.LJJIJIIJI(new AqS51S1000000_16(next3, 1)));
        }
        java.util.Map<String, C5H3<CHL>> map3 = LJFF;
        map3.put("pk_period", C78996UzQ.LJJIJIIJI(C88205YjZ.LJLIL));
        map3.put("match_prepare", C78996UzQ.LJJIJIIJI(C88193YjN.LJLIL));
        map3.put("match_in_progress", C78996UzQ.LJJIJIIJI(C88194YjO.LJLIL));
        map3.put("match_color_eggs_guide", C78996UzQ.LJJIJIIJI(C88195YjP.LJLIL));
        map3.put("match_color_eggs_reward_start", C78996UzQ.LJJIJIIJI(C88196YjQ.LJLIL));
        map3.put("match_color_eggs_task_start", C78996UzQ.LJJIJIIJI(C88197YjR.LJLIL));
        map3.put("match_punish_prepare", C78996UzQ.LJJIJIIJI(C88198YjS.LJLIL));
        map3.put("match_punish", C78996UzQ.LJJIJIIJI(C88199YjT.LJLIL));
        map3.put("broadcast_period", C78996UzQ.LJJIJIIJI(C88204YjY.LJLIL));
        java.util.Map<String, C5H3<CHK>> map4 = LJ;
        map4.put("rank_anim", C78996UzQ.LJJIJIIJI(C88224Yjs.LJLIL));
        map4.put("rank_list_show", C78996UzQ.LJJIJIIJI(C88225Yjt.LJLIL));
    }

    public static Handler LIZIZ() {
        return (Handler) LIZJ.getValue();
    }

    public static void LJIIJ() {
        CHL chl;
        CHK chk;
        C5H3 c5h3 = (C5H3) ((LinkedHashMap) LJ).get(LJI);
        if (c5h3 != null && (chk = (CHK) c5h3.getValue()) != null) {
            chk.LJII = LJII;
        }
        C5H3 c5h32 = (C5H3) ((LinkedHashMap) LJFF).get(LJI);
        if (c5h32 != null && (chl = (CHL) c5h32.getValue()) != null) {
            LIZIZ().removeCallbacks(chl);
            LIZIZ().post(chl);
        }
    }

    public static void LJIILJJIL() {
        if (!o.LJ(LJI, "linkmic_anchor_period") || !LinkMicMultiGuestFluencyRefactorTechSwitchSetting.INSTANCE.getValue()) {
            return;
        }
        LJIILLIIL();
        LJI = "broadcast_period";
        LJIIJ();
    }

    public static void LJIILL() {
        if (!o.LJ(LJI, "linkmic_audience_period") || !LinkMicMultiGuestFluencyRefactorTechSwitchSetting.INSTANCE.getValue()) {
            return;
        }
        LJIILLIIL();
        LJI = "watch_period";
        LJIIJ();
    }

    public static void LJIILLIIL() {
        CHK chk;
        CHK chk2;
        CHL chl;
        C5H3 c5h3 = (C5H3) ((LinkedHashMap) LJFF).get(LJI);
        if (c5h3 != null && (chl = (CHL) c5h3.getValue()) != null) {
            LIZIZ().removeCallbacks(chl);
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) LJ;
        C5H3 c5h32 = (C5H3) linkedHashMap.get(LJI);
        if (c5h32 != null && (chk2 = (CHK) c5h32.getValue()) != null) {
            chk2.LJIIZILJ = null;
        }
        C5H3 c5h33 = (C5H3) linkedHashMap.get(LJI);
        if (c5h33 != null && (chk = (CHK) c5h33.getValue()) != null) {
            chk.stop();
        }
    }

    public static void LJIIZILJ() {
        CHK chk;
        C5H3 c5h3 = (C5H3) ((LinkedHashMap) LJ).get("gift_play");
        if (c5h3 != null && (chk = (CHK) c5h3.getValue()) != null) {
            chk.stop();
        }
    }

    public static void LJIJ() {
        if (!o.LJ(LJI, "linkmic_guest_period") || !LinkMicMultiGuestFluencyRefactorTechSwitchSetting.INSTANCE.getValue()) {
            return;
        }
        LJIILLIIL();
        LJI = "watch_period";
        LJIIJ();
    }

    public static void LJFF() {
        LIZIZ().removeCallbacksAndMessages(null);
        for (Map.Entry entry : ((LinkedHashMap) LJ).entrySet()) {
            if (((C5H3) entry.getValue()).isInitialized() && ((CHK) ((C5H3) entry.getValue()).getValue()).LJIIIIZZ) {
                ((CHK) ((C5H3) entry.getValue()).getValue()).stop();
            }
        }
        LJI = "";
    }

    public static void LIZ(String str) {
        CHK chk;
        C5H3 c5h3 = (C5H3) ((LinkedHashMap) LJ).get(str);
        if (c5h3 != null && (chk = (CHK) c5h3.getValue()) != null) {
            chk.stop();
        }
    }

    public static void LIZJ(RunnableC31065CHd recyclerView) {
        CHK chk;
        o.LJIIIZ(recyclerView, "recyclerView");
        C5H3 c5h3 = (C5H3) ((LinkedHashMap) LJ).get("panel_beauty_slide");
        if (c5h3 != null) {
            chk = (CHK) c5h3.getValue();
        } else {
            chk = null;
        }
        recyclerView.LJIIJJI(new CHM(chk));
    }

    public static void LIZLLL(RunnableC31065CHd recyclerView) {
        CHK chk;
        o.LJIIIZ(recyclerView, "recyclerView");
        C5H3 c5h3 = (C5H3) ((LinkedHashMap) LJ).get("panel_filter_slide");
        if (c5h3 != null) {
            chk = (CHK) c5h3.getValue();
        } else {
            chk = null;
        }
        recyclerView.LJIIJJI(new CHM(chk));
    }

    public static void LJ(RecyclerView recyclerView) {
        CHK chk;
        o.LJIIIZ(recyclerView, "recyclerView");
        C5H3 c5h3 = (C5H3) ((LinkedHashMap) LJ).get("panel_gift_slide");
        if (c5h3 != null) {
            chk = (CHK) c5h3.getValue();
        } else {
            chk = null;
        }
        recyclerView.LJIIJJI(new CHM(chk));
    }

    public static void LJI(TSK extraParamsCallback) {
        CHK chk;
        o.LJIIIZ(extraParamsCallback, "extraParamsCallback");
        C5H3 c5h3 = (C5H3) ((LinkedHashMap) LJ).get(LJI);
        if (c5h3 != null && (chk = (CHK) c5h3.getValue()) != null) {
            chk.LJIIZILJ = extraParamsCallback;
        }
    }

    public static void LJII(TSK extraParamsCallback) {
        o.LJIIIZ(extraParamsCallback, "extraParamsCallback");
        if (o.LJ(LJI, "linkmic_anchor_period") || !LinkMicMultiGuestFluencyRefactorTechSwitchSetting.INSTANCE.getValue()) {
            return;
        }
        LJIILLIIL();
        LJI = "linkmic_anchor_period";
        LJI(extraParamsCallback);
        LJIIJ();
    }

    public static void LJIIIIZZ(TSK extraParamsCallback) {
        o.LJIIIZ(extraParamsCallback, "extraParamsCallback");
        if (o.LJ(LJI, "linkmic_audience_period") || !LinkMicMultiGuestFluencyRefactorTechSwitchSetting.INSTANCE.getValue()) {
            return;
        }
        LJIILLIIL();
        LJI = "linkmic_audience_period";
        LJI(extraParamsCallback);
        LJIIJ();
    }

    public static void LJIIJJI(TSK extraParamsCallback) {
        o.LJIIIZ(extraParamsCallback, "extraParamsCallback");
        if (o.LJ(LJI, "linkmic_guest_period") || !LinkMicMultiGuestFluencyRefactorTechSwitchSetting.INSTANCE.getValue()) {
            return;
        }
        LJIILLIIL();
        LJI = "linkmic_guest_period";
        LJI(extraParamsCallback);
        LJIIJ();
    }

    public static void LJIILIIL(String str) {
        CHK chk;
        C5H3 c5h3 = (C5H3) ((LinkedHashMap) LJ).get(str);
        if (c5h3 != null && (chk = (CHK) c5h3.getValue()) != null) {
            chk.start();
            LIZIZ().postDelayed(new ARunnableS49S0100000_13(chk, 242), 5000L);
        }
    }

    public static void LJIJI(String str) {
        CHK chk;
        C5H3 c5h3 = (C5H3) ((LinkedHashMap) LJ).get(str);
        if (c5h3 != null && (chk = (CHK) c5h3.getValue()) != null) {
            chk.stop();
        }
    }

    public static void LJIIL(String str, CHO cho) {
        CHK chk;
        CHK chk2;
        LinkedHashMap linkedHashMap = (LinkedHashMap) LJ;
        C5H3 c5h3 = (C5H3) linkedHashMap.get(str);
        if (c5h3 != null && (chk2 = (CHK) c5h3.getValue()) != null) {
            chk2.LJIIJ = cho;
        }
        C5H3 c5h32 = (C5H3) linkedHashMap.get(str);
        if (c5h32 != null && (chk = (CHK) c5h32.getValue()) != null) {
            chk.start();
        }
    }
}
