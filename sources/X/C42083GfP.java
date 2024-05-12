package X;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.GfP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42083GfP {
    public static final java.util.Map<GSH, WeakReference<C42236Ghs<?, ?>>> LIZ = new ConcurrentHashMap();

    public static C42236Ghs LIZ(Class cls, Class cls2) {
        C42236Ghs c42236Ghs;
        try {
            java.util.Map<GSH, WeakReference<C42236Ghs<?, ?>>> map = LIZ;
            WeakReference weakReference = (WeakReference) ((ConcurrentHashMap) map).get(new GSH(cls, cls2, false));
            if (weakReference == null || (c42236Ghs = (C42236Ghs) weakReference.get()) == null) {
                C42236Ghs c42236Ghs2 = new C42236Ghs(cls, cls2, false);
                ((ConcurrentHashMap) map).put(new GSH(cls, cls2, false), new WeakReference(c42236Ghs2));
                return c42236Ghs2;
            }
            return c42236Ghs;
        } catch (Exception unused) {
            C60903NvH.LJIIJJI().LJJIIJ();
            return new C42236Ghs(cls, cls2, false);
        }
    }
}
