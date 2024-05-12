package X;

import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C1A {
    public static DataChannel LIZIZ;
    public static final ConcurrentHashMap<Class<?>, Object> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Integer, CopyOnWriteArrayList<OnMessageListener>> LIZJ = new ConcurrentHashMap<>();

    public static Object LIZJ(Class cls) {
        if (C29306Beo.LJJII(LIZIZ)) {
            Object obj = LIZ.get(cls);
            if (obj == null) {
                obj = Q7L.LIZIZ(cls);
            }
            o.LJIIIIZZ(obj, "{\n            (services[…getService(cls)\n        }");
            return obj;
        }
        return TTL.LIZ(cls, "{\n            LiveClient…getService(cls)\n        }");
    }

    public static void LIZLLL(OnMessageListener listener) {
        o.LJIIIZ(listener, "listener");
        Iterator LIZLLL = C47135Ieh.LIZLLL(LIZJ, "messageListenerMap.values");
        while (LIZLLL.hasNext()) {
            ((CopyOnWriteArrayList) LIZLLL.next()).remove(listener);
        }
    }

    public static void LIZ(int i, OnMessageListener listener) {
        o.LJIIIZ(listener, "listener");
        ConcurrentHashMap<Integer, CopyOnWriteArrayList<OnMessageListener>> concurrentHashMap = LIZJ;
        CopyOnWriteArrayList<OnMessageListener> copyOnWriteArrayList = concurrentHashMap.get(Integer.valueOf(i));
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        }
        copyOnWriteArrayList.add(listener);
        concurrentHashMap.put(Integer.valueOf(i), copyOnWriteArrayList);
    }

    public static void LIZIZ(int i, PollMessage pollMessage) {
        CopyOnWriteArrayList<OnMessageListener> copyOnWriteArrayList = LIZJ.get(Integer.valueOf(i));
        if (copyOnWriteArrayList != null) {
            Iterator<OnMessageListener> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().onMessage(pollMessage);
            }
        }
    }
}
