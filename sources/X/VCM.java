package X;

import android.app.Activity;
import com.bytedance.android.livesdkapi.host.IHostPerformanceOpt;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VCM implements VCO {
    public static final VCM LIZ = new VCM();
    public static WeakReference<Activity> LIZIZ;

    public static void LIZJ(WeakReference weakReference, boolean z) {
        Activity activity;
        if (z) {
            LIZIZ = weakReference;
            IHostPerformanceOpt iHostPerformanceOpt = (IHostPerformanceOpt) CN1.LIZ(IHostPerformanceOpt.class);
            if (iHostPerformanceOpt != null) {
                iHostPerformanceOpt.lr0(true);
                return;
            }
            return;
        }
        WeakReference<Activity> weakReference2 = LIZIZ;
        if (weakReference2 != null) {
            activity = weakReference2.get();
        } else {
            activity = null;
        }
        if (!o.LJ(activity, weakReference.get())) {
            return;
        }
        LIZIZ = null;
        IHostPerformanceOpt iHostPerformanceOpt2 = (IHostPerformanceOpt) CN1.LIZ(IHostPerformanceOpt.class);
        if (iHostPerformanceOpt2 == null) {
            return;
        }
        iHostPerformanceOpt2.lr0(false);
    }

    @Override // X.VCO
    public final void LIZ(WeakReference<Activity> weakReference, VCK type) {
        o.LJIIIZ(type, "type");
        if (VCL.LIZ[type.ordinal()] == 1) {
            LIZJ(weakReference, true);
        }
    }

    @Override // X.VCO
    public final void LIZIZ(WeakReference<Activity> weakReference, VCK type) {
        o.LJIIIZ(type, "type");
        if (VCL.LIZ[type.ordinal()] == 1) {
            LIZJ(weakReference, false);
        }
    }
}
