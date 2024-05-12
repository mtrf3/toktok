package X;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.ss.android.ttve.nativePort.TEImageInterface;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* renamed from: X.5wo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151345wo {
    public static final LinkedBlockingQueue<C151225wc> LIZ = new LinkedBlockingQueue<>();
    public static int LIZIZ = C151105wQ.LIZ();
    public static int LIZJ = C151105wQ.LIZ();
    public static final AtomicInteger LIZLLL = new AtomicInteger(0);
    public static final int LJ = Q7K.LIZIZ("studio_synthesis_max_ve_image_count", 3);

    public static void LIZIZ() {
        SurfaceHolder holder;
        LIZLLL.set(-1);
        Iterator<C151225wc> it = LIZ.iterator();
        while (it.hasNext()) {
            C151225wc it2 = it.next();
            o.LJIIIIZZ(it2, "it");
            C151325wm c151325wm = it2.LIZ;
            TEImageInterface tEImageInterface = c151325wm.LJII;
            if (tEImageInterface != null) {
                tEImageInterface.destoryVEImage();
            }
            SurfaceView surfaceView = c151325wm.LIZ;
            if (surfaceView != null && (holder = surfaceView.getHolder()) != null) {
                holder.removeCallback(c151325wm.LIZIZ);
            }
            c151325wm.LIZ = null;
            c151325wm.LJII = null;
            C151365wq.LIZIZ(it2.LIZ);
        }
        LIZ.clear();
    }

    public static void LIZ(C151225wc c151225wc) {
        SurfaceHolder holder;
        c151225wc.LIZIZ = false;
        if (LIZLLL.get() == -1) {
            C151325wm c151325wm = c151225wc.LIZ;
            TEImageInterface tEImageInterface = c151325wm.LJII;
            if (tEImageInterface != null) {
                tEImageInterface.destoryVEImage();
            }
            SurfaceView surfaceView = c151325wm.LIZ;
            if (surfaceView != null && (holder = surfaceView.getHolder()) != null) {
                holder.removeCallback(c151325wm.LIZIZ);
            }
            c151325wm.LIZ = null;
            c151325wm.LJII = null;
            C151365wq.LIZIZ(c151225wc.LIZ);
            return;
        }
        LIZ.offer(c151225wc);
    }
}
