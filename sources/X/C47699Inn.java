package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.bottom.LiveVideoEducationEntranceList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.Inn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47699Inn {
    public static JSONObject LIZLLL;
    public static String LJ;
    public static boolean LJIIIIZZ;
    public static int LJIIL;
    public static String LIZ = "";
    public static String LIZIZ = "";
    public static String LIZJ = "";
    public static long LJFF = -1;
    public static long LJI = -1;
    public static long LJII = -1;
    public static final java.util.Map<String, Integer> LJIIIZ = new HashMap();
    public static final java.util.Map<String, Boolean> LJIIJ = new HashMap();
    public static final java.util.Set<String> LJIIJJI = new HashSet();

    public static void LJ() {
        int i = LJIIL - 1;
        LJIIL = i;
        if (i == 0) {
            LIZ = "";
            LIZIZ = "";
            LIZJ = "";
            ((HashMap) LJIIIZ).clear();
            ((HashMap) LJIIJ).clear();
            ((HashSet) LJIIJJI).clear();
        }
    }

    public static boolean LIZ(String id) {
        o.LJIIIZ(id, "id");
        Integer num = (Integer) ((HashMap) LJIIIZ).get(id);
        if (num == null || num.intValue() != 0) {
            return false;
        }
        return true;
    }

    public static int LIZIZ(String str) {
        Integer num = (Integer) ((HashMap) LJIIIZ).get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static void LIZJ(Aweme aweme) {
        LinkedHashMap linkedHashMap;
        if (LJIIIIZZ || aweme == null) {
            return;
        }
        List LJLJJL = s.LJLJJL(LIZJ, new String[]{","}, 0, 6);
        if (LJLJJL.size() < 4) {
            return;
        }
        try {
            HashMap hashMap = (HashMap) C190837eJ.LIZIZ(LIZLLL);
            linkedHashMap = new LinkedHashMap(C51029K0z.LJJIIZ(hashMap.size()));
            for (Object obj : hashMap.entrySet()) {
                linkedHashMap.put(((Map.Entry) obj).getKey(), ((Map.Entry) obj).getValue().toString());
            }
        } catch (Exception unused) {
            linkedHashMap = null;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("anchor_id", ((RBX) HG3.LJIILL()).getCurUserId());
        c188727au.LJIIIZ("enter_from", (String) ListProtector.get(LJLJJL, 0));
        c188727au.LJIIIZ("event_page", (String) ListProtector.get(LJLJJL, 1));
        c188727au.LJIIIZ("request_page", (String) ListProtector.get(LJLJJL, 2));
        c188727au.LJIIIZ("click_position", (String) ListProtector.get(LJLJJL, 3));
        c188727au.LJIIIZ("task_id", LJ);
        c188727au.LJIIIIZZ(linkedHashMap);
        FMX.LJIIL("livesdk_live_center_video_watched", c188727au.LIZ);
    }

    public static void LIZLLL(Aweme aweme, boolean z) {
        Object obj;
        Object obj2;
        Object obj3;
        long j;
        if (aweme == null || !LiveVideoEducationEntranceList.INSTANCE.getList().contains(LIZ)) {
            return;
        }
        JSONObject jSONObject = LIZLLL;
        Object obj4 = null;
        if (jSONObject != null) {
            obj = jSONObject.get("ban_time");
        } else {
            obj = null;
        }
        JSONObject jSONObject2 = LIZLLL;
        if (jSONObject2 != null) {
            obj2 = jSONObject2.get("ban_type");
        } else {
            obj2 = null;
        }
        JSONObject jSONObject3 = LIZLLL;
        if (jSONObject3 != null) {
            obj3 = jSONObject3.get("ban_reason");
        } else {
            obj3 = null;
        }
        JSONObject jSONObject4 = LIZLLL;
        if (jSONObject4 != null) {
            obj4 = jSONObject4.get("is_underage");
        }
        if (z) {
            j = LJII;
        } else {
            j = (LJI - LJFF) % LJII;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", LIZ);
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        c188727au.LJIIIZ("video_id", aid);
        c188727au.LJIIIZ("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
        c188727au.LJ(j, "watch_duration");
        c188727au.LJ(LJII, "video_duration");
        c188727au.LJFF(obj, "ban_time");
        c188727au.LJFF(obj2, "ban_type");
        c188727au.LJFF(obj3, "ban_reason");
        c188727au.LJFF(obj4, "is_underage");
        FMX.LJIIL("livesdk_tutorial_video_play_duration", c188727au.LIZ);
        if (z) {
            LJFF = System.currentTimeMillis();
        }
    }

    public static void LJFF(Aweme aweme, boolean z) {
        LinkedHashMap linkedHashMap;
        String str;
        String str2;
        o.LJIIIZ(aweme, "aweme");
        List LJLJJL = s.LJLJJL(LIZJ, new String[]{","}, 0, 6);
        if (LJLJJL.size() < 4) {
            return;
        }
        try {
            HashMap hashMap = (HashMap) C190837eJ.LIZIZ(LIZLLL);
            linkedHashMap = new LinkedHashMap(C51029K0z.LJJIIZ(hashMap.size()));
            for (Object obj : hashMap.entrySet()) {
                linkedHashMap.put(((Map.Entry) obj).getKey(), ((Map.Entry) obj).getValue().toString());
            }
        } catch (Exception unused) {
            linkedHashMap = null;
        }
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        int LIZIZ2 = LIZIZ(aid);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("anchor_id", ((RBX) HG3.LJIILL()).getCurUserId());
        c188727au.LJIIIZ("enter_from", (String) ListProtector.get(LJLJJL, 0));
        c188727au.LJIIIZ("event_page", (String) ListProtector.get(LJLJJL, 1));
        c188727au.LJIIIZ("request_page", (String) ListProtector.get(LJLJJL, 2));
        c188727au.LJIIIIZZ(linkedHashMap);
        c188727au.LJIIIZ("task_id", String.valueOf(LJ));
        if (z) {
            str = "show";
        } else {
            str = "click";
        }
        c188727au.LJIIIZ("event_type", str);
        if (LIZIZ2 == 1) {
            str2 = "completed";
        } else {
            str2 = "not_completed";
        }
        c188727au.LJIIIZ("task_status", str2);
        FMX.LJIIL("livesdk_live_center_bottom_bar", c188727au.LIZ);
    }
}
