package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.sdk.common.data.manager.keva.IMCriticalFlowKeva;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.3Y4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Y4 {
    public static final C3Y4 LIZ = new C3Y4();
    public static final java.util.Map<String, String> LIZIZ = new ConcurrentHashMap();
    public static String LIZJ = "";
    public static C99033ud LIZLLL;

    public static String LIZIZ(int i) {
        return i != 0 ? i != 1 ? i != 20 ? "" : "group" : "stranger" : "private";
    }

    public static final String LIZ() {
        String LIZ2 = AnonymousClass629.LIZ("randomUUID().toString()");
        LIZJ = LIZ2;
        return LIZ2;
    }

    public static final String LIZLLL(C99033ud c99033ud) {
        if (c99033ud == null) {
            return "";
        }
        if (c99033ud.isStrangerChat()) {
            return "message_box";
        }
        String LIZJ2 = LIZJ("enter_from", "");
        if (LIZJ2.length() == 0) {
            String enterFromForMob = c99033ud.getEnterFromForMob();
            if (enterFromForMob.length() == 0) {
                return "chat";
            }
            return enterFromForMob;
        }
        return LIZJ2;
    }

    public static final String LIZJ(String str, String str2) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (str2 == null) {
                return "";
            }
            return str2;
        }
        String str3 = (String) ((ConcurrentHashMap) LIZIZ).get(str);
        if (str3 == null) {
            if (str2 == null) {
                return "";
            }
            return str2;
        }
        return str3;
    }

    public static void LJ(String str, String str2) {
        java.util.Map<String, String> map = LIZIZ;
        if (str2 == null) {
            str2 = "";
        }
        ((ConcurrentHashMap) map).put(str, str2);
    }

    public static void LJFF(Integer num, String inbox, String str, String str2) {
        String str3;
        o.LJIIIZ(inbox, "inbox");
        Keva LIZJ2 = IMCriticalFlowKeva.LIZ.LIZJ();
        long j = LIZJ2.getLong("show_chat_list_performance", -1L);
        LIZJ2.erase("show_chat_list_performance");
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (j > 0 && currentTimeMillis > 0) {
            C3TV c3tv = C3TV.LIZ;
            C85323Wm onEventV3 = C772831o.LIZ();
            c3tv.getClass();
            String LIZ2 = C3TV.LIZ();
            o.LJIIIZ(onEventV3, "onEventV3");
            C1HQ c1hq = new C1HQ();
            c1hq.put("duration", String.valueOf(currentTimeMillis));
            c1hq.put("is_new_inbox", inbox);
            c1hq.put("enter_method", str2);
            c1hq.put("enter_from", str);
            if (num != null) {
                str3 = num.toString();
            } else {
                str3 = null;
            }
            c1hq.put("num", str3);
            c1hq.put("from_book_mode", LIZ2);
            onEventV3.LIZIZ("show_chat_list_performance", c1hq);
        }
    }
}
