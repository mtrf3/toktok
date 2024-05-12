package X;

import com.bytedance.ies.abmock.datacenter.plugin.BaseConfigPlugin;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.FHt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38725FHt {
    public static C38725FHt LIZIZ;
    public final java.util.Map<BaseConfigPlugin, Boolean> LIZ = new ConcurrentHashMap();

    public static C38725FHt LIZ() {
        if (LIZIZ == null) {
            synchronized (C38725FHt.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C38725FHt();
                }
            }
        }
        return LIZIZ;
    }
}
