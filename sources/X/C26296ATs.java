package X;

import com.bytedance.keva.Keva;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* renamed from: X.ATs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26296ATs {
    public static final java.util.Set<InterfaceC88472Yns<String[], C76800UCe>> LIZ;
    public static final Keva LIZIZ;

    static {
        java.util.Set<InterfaceC88472Yns<String[], C76800UCe>> linkedHashSet;
        if (C52929Kpx.LIZ()) {
            linkedHashSet = Collections.newSetFromMap(new WeakHashMap());
        } else {
            linkedHashSet = new LinkedHashSet<>();
        }
        LIZ = linkedHashSet;
        Keva repo = Keva.getRepo("auto_translation_settings_cache");
        LIZIZ = repo;
        repo.registerChangeListener(C26295ATr.LIZ);
    }
}
