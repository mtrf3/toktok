package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.live.feedpage.LiveStateApi;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* renamed from: X.EeX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36933EeX {
    public static final C36933EeX LIZLLL = new C36933EeX();
    public long LIZIZ;
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C36932EeW.LJLIL);
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C36931EeV.LJLIL);

    public final java.util.Set<String> LIZ() {
        return (java.util.Set) this.LIZ.getValue();
    }

    public final String LIZIZ() {
        if (LIZ().isEmpty()) {
            return null;
        }
        return ORZ.LLD(LIZ(), ",", null, null, null, 62);
    }

    public final void LIZJ(boolean z) {
        String LIZIZ;
        long j;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            Keva repo = Keva.getRepo("live_history_repo");
            LIZIZ = repo.getString("live_history_list", "");
            j = repo.getLong("live_history_time", System.currentTimeMillis() / 1000);
            linkedHashMap.put("trigger_method", "quit");
            repo.erase("live_history_list");
            repo.erase("live_history_time");
        } else {
            LIZIZ = LIZIZ();
            LIZ().clear();
            j = this.LIZIZ;
            linkedHashMap.put("trigger_method", "refresh");
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("report");
        LIZ.append(z);
        LIZ.append("      ");
        LIZ.append(LIZIZ);
        C0NB.LIZIZ("LivePreviewService", X1D.LIZIZ(LIZ));
        if (LIZIZ == null || LIZIZ.length() == 0) {
            return;
        }
        linkedHashMap.put("unwatched_room_id", LIZIZ);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("channel_id", 112);
        jSONObject.put("req_from", "fyp_preview_live_unread");
        jSONObject.put("gen_time", j);
        jSONObject.put("is_backup", 0);
        FMX.LJIIL("livesdk_live_refresh_req", linkedHashMap);
        C1EW.LIZ(((LiveStateApi) this.LIZJ.getValue()).collectUnreadRequest(jSONObject.toString(), LIZIZ)).LJJJLIIL(C36934EeY.LJLIL, C36935EeZ.LJLIL);
    }

    public final void LIZLLL(boolean z) {
        if (z) {
            LIZ().clear();
            return;
        }
        String LIZIZ = LIZIZ();
        if (LIZIZ == null) {
            return;
        }
        Keva.getRepo("live_history_repo").storeString("live_history_list", LIZIZ);
        Keva.getRepo("live_history_repo").storeLong("live_history_time", this.LIZIZ);
    }
}
