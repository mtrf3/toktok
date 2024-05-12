package X;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.5wq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151365wq {
    public static C151595xD LIZ;
    public static final CopyOnWriteArrayList<C151325wm> LIZIZ = new CopyOnWriteArrayList<>();

    public static C151595xD LIZ(C151325wm c151325wm) {
        if (LIZ == null) {
            return null;
        }
        LIZIZ.add(c151325wm);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("VeImageCacheManagerHelper: add veImage");
        LIZ2.append(c151325wm.hashCode());
        H78.LIZ(X1D.LIZIZ(LIZ2));
        return LIZ;
    }

    public static void LIZIZ(C151325wm veImage) {
        o.LJIIIZ(veImage, "veImage");
        CopyOnWriteArrayList<C151325wm> copyOnWriteArrayList = LIZIZ;
        copyOnWriteArrayList.remove(veImage);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("VeImageCacheManagerHelper: remove veImage");
        LIZ2.append(veImage.hashCode());
        H78.LIZ(X1D.LIZIZ(LIZ2));
        if (copyOnWriteArrayList.isEmpty()) {
            C151595xD c151595xD = LIZ;
            if (c151595xD != null) {
                synchronized (c151595xD) {
                    c151595xD.LIZ.destroy();
                }
            }
            LIZ = null;
            H78.LIZ("VeImageCacheManagerHelper: destroy veImageCacheManager");
        }
    }
}
