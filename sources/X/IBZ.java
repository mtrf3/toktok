package X;

import com.ss.android.vesdk.VERecorder;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class IBZ {
    public static volatile IBZ LIZIZ;
    public WeakReference<VERecorder> LIZ;

    public static IBZ LIZ() {
        if (LIZIZ != null) {
            return LIZIZ;
        }
        synchronized (IBZ.class) {
            if (LIZIZ != null) {
                return LIZIZ;
            }
            LIZIZ = new IBZ();
            return LIZIZ;
        }
    }

    public final VERecorder LIZIZ() {
        WeakReference<VERecorder> weakReference = this.LIZ;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
