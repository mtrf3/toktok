package X;

import android.app.Activity;
import android.os.HandlerThread;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayThreadPrioritySettings;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VCG implements VCO {
    public static final VCG LIZ = new VCG();
    public static final List<VCF> LIZIZ;
    public static volatile WeakReference<Activity> LIZJ;
    public static final VCK LIZLLL;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VCE());
        LIZIZ = arrayList;
        LIZLLL = VCK.LIVE_PLAY;
    }

    public static final HandlerThread LIZLLL() {
        int i = VCJ.LIZ[LIZLLL.ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                throw new C162476Zf();
            }
        } else {
            z = LivePlayThreadPrioritySettings.INSTANCE.isEnabled(VCI.ENABLE_DOWN_LOGGER);
        }
        if (z) {
            return new HandlerThread("live_logger", LivePlayThreadPrioritySettings.INSTANCE.getThreadPriority(VCI.ENABLE_DOWN_LOGGER));
        }
        return new HandlerThread("live_logger");
    }

    public static void LIZJ(boolean z, VCK vck) {
        int i = VCJ.LIZ[vck.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
        } else if (!LivePlayThreadPrioritySettings.INSTANCE.isEnabled(VCI.ENABLE_DOWN_TEA)) {
            return;
        }
        Iterator it = ((ArrayList) LIZIZ).iterator();
        while (it.hasNext()) {
            ((VCF) it.next()).LIZ(z);
        }
    }

    @Override // X.VCO
    public final void LIZ(WeakReference<Activity> weakReference, VCK type) {
        o.LJIIIZ(type, "type");
        LIZJ = weakReference;
        LIZJ(true, type);
    }

    @Override // X.VCO
    public final void LIZIZ(WeakReference<Activity> weakReference, VCK type) {
        Activity activity;
        o.LJIIIZ(type, "type");
        WeakReference<Activity> weakReference2 = LIZJ;
        if (weakReference2 != null) {
            activity = weakReference2.get();
        } else {
            activity = null;
        }
        if (o.LJ(activity, weakReference.get())) {
            LIZJ(false, type);
            LIZJ = null;
        }
    }
}
