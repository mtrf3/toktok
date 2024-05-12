package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Be3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29259Be3 {
    public static final HashMap<String, HandlerThread> LIZ;
    public static final List<String> LIZIZ;
    public static final List<String> LIZJ;

    static {
        new Handler(C16880lQ.LLJJJJ());
        LIZ = new HashMap<>();
        LIZIZ = Arrays.asList("NpthHandlerThread", "NewVideo-HandlerThread", "trace_time_update_thread");
        LIZJ = Arrays.asList("DBHelper-AsyncOp-New");
        new HashMap();
    }

    public static HandlerThread LIZ() {
        Iterator<Map.Entry<String, HandlerThread>> it = LIZ.entrySet().iterator();
        while (it.hasNext()) {
            if (!it.next().getValue().isAlive()) {
                it.remove();
            }
        }
        HashMap<String, HandlerThread> hashMap = LIZ;
        HandlerThread handlerThread = hashMap.get("ParseThread");
        if (handlerThread == null) {
            HandlerThreadC29260Be4 handlerThreadC29260Be4 = new HandlerThreadC29260Be4();
            handlerThreadC29260Be4.start();
            hashMap.put("ParseThread", handlerThreadC29260Be4);
            return handlerThreadC29260Be4;
        }
        return handlerThread;
    }
}
