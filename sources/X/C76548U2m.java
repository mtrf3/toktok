package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowContent;

/* renamed from: X.U2m, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76548U2m {
    public static long LIZ;
    public static boolean LIZIZ;
    public static long LIZJ;
    public static boolean LIZLLL;
    public static HashMap<String, Integer> LJ;
    public static Long LJFF;
    public static List<Long> LJI;
    public static int LJII;
    public static long LJIIIIZZ;
    public static long LJIIIZ;
    public static long LJIIJ;
    public static volatile long LJIIJJI;
    public static volatile long LJIIL;
    public static volatile long LJIILIIL;
    public static final C62822Ol8 LJIILJJIL;

    public static void LJIIL() {
        Long l;
        ShowContent content;
        ShowConfig showConfig;
        LIZLLL = false;
        java.util.Map LIZLLL2 = LIZLLL();
        U35 LIZ2 = TQA.LIZ();
        if (LIZ2 != null && (content = LIZ2.getContent()) != null && (showConfig = content.showConfig) != null) {
            l = Long.valueOf(showConfig.durationPerGuest);
        } else {
            l = null;
        }
        long currentTimeMillis = (System.currentTimeMillis() - LIZJ) / 1000;
        if (l != null) {
            currentTimeMillis = Math.min(l.longValue(), currentTimeMillis);
        }
        LIZLLL2.put("liveshow_guest_duration", String.valueOf(currentTimeMillis));
        LJIIZILJ("livesdk_guest_liveshow_onstage_over", LIZLLL2);
    }

    public static java.util.Map LIZJ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Room room = (Room) LJIILJJIL.getValue();
        if (room != null) {
            linkedHashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "idStr");
            linkedHashMap.put("room_id", idStr);
        }
        EnumC74778TWk LIZJ2 = C59994Ngc.LIZJ();
        linkedHashMap.put("window_setting", C74824TYe.LJI(LIZJ2).getSecond());
        linkedHashMap.put("layout_setting", C74824TYe.LJI(LIZJ2).getFirst());
        return linkedHashMap;
    }

    public static void LJII() {
        if (LJIIJ != 0) {
            LJI();
        }
        LJIIJ = System.currentTimeMillis();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r1 == true) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJJI() {
        /*
            long r1 = X.C76548U2m.LJIIJJI
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L9
            return
        L9:
            long r1 = X.C76548U2m.LJIIL
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L14
            long r0 = X.C76548U2m.LJIIL
            LJIIIIZZ(r0)
        L14:
            java.util.Map r2 = LIZJ()
            int r0 = LJ()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "guest_cnt"
            r2.put(r0, r1)
            X.U35 r0 = X.TQA.LIZ()
            java.lang.String r3 = ""
            if (r0 == 0) goto L43
            webcast.data.multi_guest_play.ShowContent r0 = r0.getContent()
            if (r0 == 0) goto L43
            webcast.data.multi_guest_play.ShowConfig r0 = r0.showConfig
            if (r0 == 0) goto L43
            long r0 = r0.durationPerGuest
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = r0.toString()
            if (r1 != 0) goto L44
        L43:
            r1 = r3
        L44:
            java.lang.String r0 = "show_duration_per_guest"
            r2.put(r0, r1)
            X.U35 r0 = X.TQA.LIZ()
            if (r0 == 0) goto L9b
            webcast.data.multi_guest_play.ShowContent r0 = r0.getContent()
            if (r0 == 0) goto L9b
            webcast.data.multi_guest_play.ShowConfig r0 = r0.showConfig
            if (r0 == 0) goto L9b
            boolean r1 = r0.allowOpenMicFreely
            r0 = 1
            if (r1 != r0) goto L9b
        L5e:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_guest_mic_open"
            r2.put(r0, r1)
            X.U35 r0 = X.TQA.LIZ()
            if (r0 == 0) goto L7f
            webcast.data.multi_guest_play.ShowContent r0 = r0.getContent()
            if (r0 == 0) goto L7f
            long r0 = r0.showId
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L99
        L7f:
            java.lang.String r0 = "multiguest_liveshow_id"
            r2.put(r0, r3)
            long r0 = X.C76548U2m.LJIIIIZZ
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "multiguest_liveshow_duration"
            r2.put(r0, r1)
            X.C76548U2m.LJIIIIZZ = r4
            java.lang.String r0 = "livesdk_anchor_multiguest_liveshow_over"
            LJIIZILJ(r0, r2)
            X.C76548U2m.LJIIJJI = r4
            return
        L99:
            r3 = r0
            goto L7f
        L9b:
            r0 = 0
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76548U2m.LJIIJJI():void");
    }

    public static void LJIILJJIL() {
        if (LJII != 2) {
            return;
        }
        LJI();
        java.util.Map LIZLLL2 = LIZLLL();
        LIZLLL2.put("duration", String.valueOf(LJIIIZ));
        LJIIJ = 0L;
        LJIIIZ = 0L;
        LJIIZILJ("livesdk_multiguest_liveshow_view_duration", LIZLLL2);
    }

    static {
        System.currentTimeMillis();
        LIZJ = System.currentTimeMillis();
        LJ = new HashMap<>();
        LJI = new ArrayList();
        LJIILJJIL = C221108m2.LIZIZ(C76559U2x.LJLIL);
    }

    public static java.util.Map LIZ() {
        int i;
        InterfaceC75973Trl LLIIJI;
        List<LinkUser> LJJIIZI;
        Integer valueOf;
        java.util.Map LIZJ2 = LIZJ();
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LLIIJI = R6.LLIIJI()) != null && (LJJIIZI = LLIIJI.LJJIIZI()) != null && (valueOf = Integer.valueOf(LJJIIZI.size())) != null && valueOf.intValue() >= 1) {
            i = valueOf.intValue() - 1;
        } else {
            i = 0;
        }
        LIZJ2.put("guest_cnt", String.valueOf(i));
        return LIZJ2;
    }

    public static java.util.Map LIZIZ() {
        String str;
        Long LJIIJ2;
        java.util.Map LIZ2 = LIZ();
        U35 LIZ3 = TQA.LIZ();
        if (LIZ3 == null || (LJIIJ2 = LIZ3.LJIIJ()) == null || (str = LJIIJ2.toString()) == null) {
            str = "";
        }
        LIZ2.put("multiguest_liveshow_id", str);
        return LIZ2;
    }

    public static java.util.Map LIZLLL() {
        String str;
        Long LJIIJ2;
        java.util.Map LIZJ2 = LIZJ();
        LIZJ2.put("action_type", BJM.LIZLLL());
        LIZJ2.put("enter_method", BJM.LJIIIIZZ());
        LIZJ2.put("enter_from_merge", BJM.LJFF());
        U35 LIZ2 = TQA.LIZ();
        if (LIZ2 == null || (LJIIJ2 = LIZ2.LJIIJ()) == null || (str = LJIIJ2.toString()) == null) {
            str = "";
        }
        LIZJ2.put("multiguest_liveshow_id", str);
        return LIZJ2;
    }

    public static int LJ() {
        InterfaceC75973Trl LLIIJI;
        List<LinkUser> LJJIIZI;
        Integer valueOf;
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 == null || (LLIIJI = R6.LLIIJI()) == null || (LJJIIZI = LLIIJI.LJJIIZI()) == null || (valueOf = Integer.valueOf(LJJIIZI.size())) == null) {
            return 0;
        }
        return valueOf.intValue() - 1;
    }

    public static String LJFF() {
        U35 LIZ2 = TQA.LIZ();
        if (LIZ2 != null && LIZ2.LJII() == 2) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static void LJI() {
        Long l;
        ShowContent content;
        ShowConfig showConfig;
        U35 LIZ2 = TQA.LIZ();
        if (LIZ2 != null && (content = LIZ2.getContent()) != null && (showConfig = content.showConfig) != null) {
            l = Long.valueOf(showConfig.durationPerGuest);
        } else {
            l = null;
        }
        long currentTimeMillis = (System.currentTimeMillis() - LJIIJ) / 1000;
        if (l != null) {
            currentTimeMillis = Math.min(l.longValue(), currentTimeMillis);
        }
        LJIIIZ += currentTimeMillis;
    }

    public static void LJIILL() {
        long j;
        Long LJIIJ2;
        U35 LIZ2 = TQA.LIZ();
        if (LIZ2 != null) {
            long j2 = LIZ;
            Long LJIIJ3 = LIZ2.LJIIJ();
            if (LJIIJ3 != null && j2 == LJIIJ3.longValue()) {
                return;
            }
        }
        LJIIZILJ("livesdk_multiguest_liveshow_view_start", LIZLLL());
        U35 LIZ3 = TQA.LIZ();
        if (LIZ3 != null && (LJIIJ2 = LIZ3.LJIIJ()) != null) {
            j = LJIIJ2.longValue();
        } else {
            j = 0;
        }
        LIZ = j;
        System.currentTimeMillis();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r1 == true) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(long r4) {
        /*
            long r1 = X.C76548U2m.LJIIL
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto Lc5
            java.util.Map r5 = LIZJ()
            int r0 = LJ()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "guest_cnt"
            r5.put(r0, r1)
            X.U35 r0 = X.TQA.LIZ()
            java.lang.String r2 = ""
            if (r0 == 0) goto L35
            webcast.data.multi_guest_play.ShowContent r0 = r0.getContent()
            if (r0 == 0) goto L35
            webcast.data.multi_guest_play.ShowConfig r0 = r0.showConfig
            if (r0 == 0) goto L35
            long r0 = r0.durationPerGuest
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = r0.toString()
            if (r1 != 0) goto L36
        L35:
            r1 = r2
        L36:
            java.lang.String r0 = "show_duration_per_guest"
            r5.put(r0, r1)
            X.U35 r0 = X.TQA.LIZ()
            if (r0 == 0) goto Lca
            webcast.data.multi_guest_play.ShowContent r0 = r0.getContent()
            if (r0 == 0) goto Lca
            webcast.data.multi_guest_play.ShowConfig r0 = r0.showConfig
            if (r0 == 0) goto Lca
            boolean r1 = r0.allowOpenMicFreely
            r0 = 1
            if (r1 != r0) goto Lca
        L50:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_guest_mic_open"
            r5.put(r0, r1)
            X.U35 r0 = X.TQA.LIZ()
            if (r0 == 0) goto L71
            webcast.data.multi_guest_play.ShowContent r0 = r0.getContent()
            if (r0 == 0) goto L71
            long r0 = r0.showId
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto Lc8
        L71:
            java.lang.String r0 = "multiguest_liveshow_id"
            r5.put(r0, r2)
            long r0 = X.C76548U2m.LJIIL
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "onstage_guest_id"
            r5.put(r0, r1)
            X.U35 r0 = X.TQA.LIZ()
            if (r0 == 0) goto Lc6
            webcast.data.multi_guest_play.ShowContent r0 = r0.getContent()
            if (r0 == 0) goto Lc6
            webcast.data.multi_guest_play.ShowConfig r0 = r0.showConfig
            if (r0 == 0) goto Lc6
            long r0 = r0.durationPerGuest
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
        L97:
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = X.C76548U2m.LJIILIIL
            long r2 = r2 - r0
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r2 = r2 / r0
            if (r4 == 0) goto Lac
            long r0 = r4.longValue()
            long r2 = java.lang.Math.min(r0, r2)
        Lac:
            long r0 = X.C76548U2m.LJIIIIZZ
            long r0 = r0 + r2
            X.C76548U2m.LJIIIIZZ = r0
            java.lang.String r1 = "liveshow_guest_duration"
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r5.put(r1, r0)
            java.lang.String r0 = "livesdk_anchor_multiguest_liveshow_guest_onstage_over"
            LJIIZILJ(r0, r5)
            r0 = 0
            X.C76548U2m.LJIIL = r0
            X.C76548U2m.LJIILIIL = r0
        Lc5:
            return
        Lc6:
            r4 = 0
            goto L97
        Lc8:
            r2 = r0
            goto L71
        Lca:
            r0 = 0
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76548U2m.LJIIIIZZ(long):void");
    }

    public static void LJIIIZ(String str) {
        java.util.Map LIZ2 = LIZ();
        LIZ2.put("show_entrance", str);
        LIZ2.put("is_liveshow_ongoing", LJFF());
        LJIIZILJ("livesdk_anchor_multiguest_liveshow_info_show", LIZ2);
    }

    public static void LJIIJ(String str) {
        java.util.Map LIZJ2 = LIZJ();
        LIZJ2.put("guest_cnt", String.valueOf(LJ()));
        LIZJ2.put("show_entrance", str);
        LIZJ2.put("is_liveshow_ongoing", LJFF());
        LJIIZILJ("livesdk_anchor_multiguest_liveshow_panel_show", LIZJ2);
    }

    public static void LJIILLIIL(String str) {
        java.util.Map LIZ2 = LIZ();
        LIZ2.put("click_icon", str);
        LIZ2.put("is_liveshow_ongoing", LJFF());
        LJIIZILJ("livesdk_anchor_multiguest_liveshow_setting_duration_click", LIZ2);
    }

    public static void LJIILIIL(String str, boolean z) {
        String str2;
        String str3;
        Long LJIIJ2;
        java.util.Map LIZJ2 = LIZJ();
        LIZJ2.put("im_name", str);
        U35 LIZ2 = TQA.LIZ();
        if (LIZ2 == null || (LJIIJ2 = LIZ2.LJIIJ()) == null || (str2 = LJIIJ2.toString()) == null) {
            str2 = "";
        }
        LIZJ2.put("multiguest_liveshow_id", str2);
        LIZJ2.put("backup_duration", String.valueOf(MultiGuestLiveShowConfigSetting.INSTANCE.getSettingValue().calibrateContentTime));
        if (z) {
            str3 = "livesdk_anchor_multiguest_liveshow_im_backup";
        } else {
            str3 = "livesdk_guest_multiguest_liveshow_im_backup";
        }
        BZI LIZ3 = C28787BRn.LIZ(str3);
        LIZ3.LJJIFFI(LIZJ2);
        LIZ3.LJJIIJZLJL();
    }

    public static void LJIIZILJ(String str, java.util.Map map) {
        BZI LIZ2 = C28787BRn.LIZ(str);
        LIZ2.LJJIFFI(map);
        LIZ2.LJJIIJZLJL();
    }
}
