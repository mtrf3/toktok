package X;

import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchPerformanceAnchorSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchPerformanceAudienceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchPerformanceMonitorSetting;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CL6 {
    public static boolean LIZ;
    public static final java.util.Map<String, Integer> LIZIZ = C113554cx.LJJLIIIIJ(new OSZ("match_color_eggs_guide", Integer.valueOf(B4U.LIZ().LJLL)), new OSZ("match_color_eggs_task_start", Integer.valueOf(B4U.LIZ().LJLL)), new OSZ("match_color_eggs_reward_start", Integer.valueOf(B4U.LIZ().LJLL)));
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(CL7.LJLIL);

    public static long LIZ() {
        return ((Number) LIZJ.getValue()).longValue();
    }

    public static void LIZJ() {
        B4U.LIZ().LLFF = new LinkedHashMap();
        C88207Yjb.LJIILLIIL();
        C88207Yjb.LJI = "broadcast_link_period";
        C88207Yjb.LJIIJ();
        B4U.LIZ().LJJ(B4U.LIZ().LJLJLLL, "resident");
    }

    public static void LIZIZ(String str) {
        String str2;
        long j;
        Integer num;
        int i;
        CHK chk;
        String str3;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("start match monitor enabled = + ");
        LiveMatchPerformanceMonitorSetting liveMatchPerformanceMonitorSetting = LiveMatchPerformanceMonitorSetting.INSTANCE;
        LIZ2.append(liveMatchPerformanceMonitorSetting.getValue());
        C0NB.LIZIZ("MatchPerformanceMonitor", X1D.LIZIZ(LIZ2));
        String str4 = "";
        if (liveMatchPerformanceMonitorSetting.getValue()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C76280Twi c76280Twi = C76265TwT.LIZ;
            linkedHashMap.put("battle_id", String.valueOf(c76280Twi.LIZIZ()));
            linkedHashMap.put("channel_id", String.valueOf(c76280Twi.LIZJ()));
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            InterfaceC29980Bpg hq0 = ((IBarrageService) CN1.LIZ(IBarrageService.class)).hq0(j);
            if (hq0 != null) {
                num = Integer.valueOf(hq0.LJIIJJI());
            } else {
                num = null;
            }
            linkedHashMap.put("like_count", String.valueOf(num));
            linkedHashMap.put("linked_user_count", String.valueOf(C8E.LIZLLL().LJIILJJIL().size()));
            C75883TqJ LJI = C8E.LIZLLL().LJI(LIZ());
            if (LJI != null && (str3 = LJI.LJII) != null) {
                str4 = str3;
            }
            linkedHashMap.put("linkmic_id", str4);
            C5H3 c5h3 = (C5H3) ((LinkedHashMap) C88207Yjb.LJ).get(C88207Yjb.LJI);
            if (c5h3 != null && (chk = (CHK) c5h3.getValue()) != null) {
                chk.LJIILLIIL = linkedHashMap;
            }
            C88207Yjb.LJIILLIIL();
            C88207Yjb.LJI = str;
            C88207Yjb.LJIIJ();
            if (!LIZ ? LIZ() % LiveMatchPerformanceAudienceSetting.INSTANCE.getValue() == 0 : LIZ() % LiveMatchPerformanceAnchorSetting.INSTANCE.getValue() == 0) {
                B4U.LIZ().LLFF = linkedHashMap;
                LivePerformanceManager LIZ3 = B4U.LIZ();
                Integer num2 = (Integer) ((LinkedHashMap) LIZIZ).get(str);
                if (num2 != null) {
                    i = num2.intValue();
                } else {
                    i = B4U.LIZ().LJLJLLL;
                }
                LIZ3.LJJ(i, str);
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("start match monitor scene = ");
            LIZ4.append(str);
            LIZ4.append(linkedHashMap);
            C0NB.LIZIZ("MatchPerformanceMonitor", X1D.LIZIZ(LIZ4));
            return;
        }
        if (!o.LJ(str, "match_prepare")) {
            return;
        }
        C88207Yjb.LJIILLIIL();
        C88207Yjb.LJI = "pk_period";
        C88207Yjb.LJIIJ();
        C31014CFe.LIZLLL(String.valueOf(C76265TwT.LIZ.LIZJ()));
        C75883TqJ LJI2 = C8E.LIZLLL().LJI(LIZ());
        if (LJI2 != null && (str2 = LJI2.LJII) != null) {
            str4 = str2;
        }
        C31014CFe.LJIIJJI(str4);
        B4U.LIZ().LJJI("live_pk");
    }
}
