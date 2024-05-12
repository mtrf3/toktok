package X;

import android.content.Context;
import android.text.TextUtils;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.FQs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38958FQs {
    public static final ConcurrentHashMap<String, Integer> LIZ = new ConcurrentHashMap<>(2);
    public static final HashMap<String, Integer> LIZIZ;

    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        LIZIZ = hashMap;
        hashMap.put("pm_following_livecard_live_icon", Integer.valueOf(R.string.l_4));
        hashMap.put("pm_mt_live_events_live_consumer_live_events", Integer.valueOf(R.string.mgt));
    }

    public static int LIZ() {
        if (C53254KvC.LIZ()) {
            return R.layout.bp5;
        }
        return R.layout.bp4;
    }

    public static String LIZIZ(int i, Context context) {
        if (i == 0) {
            return "";
        }
        String string = context.getString(i);
        o.LJIIIIZZ(string, "context.getString(liveResource)");
        return string;
    }

    public static void LIZJ(Context context, String str) {
        if (context == null || !TextUtils.equals(str, "homepage_hot")) {
            return;
        }
        ConcurrentHashMap<String, Integer> concurrentHashMap = LIZ;
        Integer num = concurrentHashMap.get(str);
        if (num == null || num.intValue() == 0) {
            C53106Kso.LIZ.getClass();
            if (C53106Kso.LIZIZ() || C53106Kso.LIZ() == 1) {
                C38619FDr.LIZLLL(LIZ(), context);
                C38619FDr.LIZLLL(R.layout.bqb, context);
                C38619FDr.LIZLLL(R.layout.afm, context);
            } else {
                C16970lZ.LJ(LIZ(), context);
            }
            if (str != null) {
                concurrentHashMap.put(str, 1);
            }
        }
    }
}
