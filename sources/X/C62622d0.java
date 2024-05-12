package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2d0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62622d0 {
    public static final ConcurrentHashMap<String, C62622d0> LIZIZ = new ConcurrentHashMap<>();
    public final ArrayList<OSZ<Integer, WeakReference<InterfaceC62632d1>>> LIZ = new ArrayList<>();

    public static final C62622d0 LIZ() {
        ConcurrentHashMap<String, C62622d0> concurrentHashMap = LIZIZ;
        if (!concurrentHashMap.containsKey("live_room_ctr")) {
            synchronized (C62622d0.class) {
                if (!concurrentHashMap.containsKey("live_room_ctr")) {
                    concurrentHashMap.put("live_room_ctr", new C62622d0());
                }
            }
        }
        C62622d0 c62622d0 = concurrentHashMap.get("live_room_ctr");
        o.LJI(c62622d0);
        return c62622d0;
    }

    public final void LIZIZ(InterfaceC62632d1 interfaceC62632d1, int i) {
        InterfaceC62632d1 interfaceC62632d12;
        if (interfaceC62632d1 != null) {
            this.LIZ.add(new OSZ<>(Integer.valueOf(i), new WeakReference(interfaceC62632d1)));
        }
        int size = this.LIZ.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((Number) ((OSZ) ListProtector.get(this.LIZ, i2)).getFirst()).intValue() < i && (interfaceC62632d12 = (InterfaceC62632d1) ((Reference) ((OSZ) ListProtector.get(this.LIZ, i2)).getSecond()).get()) != null) {
                interfaceC62632d12.O8();
            }
        }
    }
}
