package X;

import com.bytedance.android.livesdk.api.BroadcastRoomApi;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BP4 {
    public static final C5H3<BP4> LIZIZ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, BP6.LJLIL);
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(BP5.LJLIL);

    public final BroadcastRoomApi LIZ() {
        return (BroadcastRoomApi) LIZIZ(BroadcastRoomApi.class);
    }

    public final <T> T LIZIZ(Class<T> cls) {
        if (!((ConcurrentHashMap) this.LIZ.getValue()).contains(cls)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.LIZ.getValue();
            C65814PsI.LIZ().getClass();
            Object LIZJ = C65814PsI.LIZJ(cls);
            o.LJI(LIZJ);
            concurrentHashMap.putIfAbsent(cls, LIZJ);
        }
        return (T) ((ConcurrentHashMap) this.LIZ.getValue()).get(cls);
    }
}
