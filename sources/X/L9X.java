package X;

import Y.ARunnableS45S0100000_9;
import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS98S0300000_9;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes10.dex */
public final class L9X extends AbstractC51620KNs {
    public static WeakReference<L9X> LIZJ;
    public final ConcurrentHashMap<Integer, LinkedList<View>> LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L9X(Activity activity) {
        super(activity);
        o.LJIIIZ(activity, "activity");
        this.LIZIZ = new ConcurrentHashMap<>();
    }

    @Override // X.InterfaceC51123K4p
    public final View LIZ(int i) {
        LinkedList<View> linkedList = this.LIZIZ.get(Integer.valueOf(i));
        if (linkedList != null) {
            synchronized (linkedList) {
                View poll = linkedList.poll();
                if (poll != null) {
                    return poll;
                }
                this.LIZIZ.remove(Integer.valueOf(i));
            }
        }
        String layoutName = this.LIZ.getResources().getResourceName(i);
        o.LJIIIIZZ(layoutName, "layoutName");
        if (s.LJJJLZIJ(layoutName, "commerce_", false)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ECAsyncInflater miss load ");
            LIZ.append(layoutName);
            C78983UzD.LJIILL(X1D.LIZIZ(LIZ));
        }
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LIZ), i, new FrameLayout(this.LIZ), false);
        o.LJIIIIZZ(LLLLIILL, "from(activity).inflate(l…eLayout(activity), false)");
        return LLLLIILL;
    }

    @Override // X.InterfaceC51123K4p
    public final boolean LIZIZ(int i) {
        boolean z;
        LinkedList<View> linkedList = this.LIZIZ.get(Integer.valueOf(i));
        if (linkedList != null) {
            synchronized (linkedList) {
                z = !linkedList.isEmpty();
            }
            return z;
        }
        return false;
    }

    @Override // X.AbstractC51620KNs
    public final void LIZJ(C208108Es target, long j) {
        o.LJIIIZ(target, "target");
        AqS98S0300000_9 aqS98S0300000_9 = new AqS98S0300000_9(this, target, new C76732zl(), 18);
        if (j > 0) {
            C37190Eig.LIZ.postDelayed(new ARunnableS45S0100000_9((Object) aqS98S0300000_9, LiveTryModeCountDownThresholdSetting.DEFAULT), j);
        } else {
            C37190Eig.LIZ.postAtFrontOfQueue(new ARunnableS45S0100000_9((Object) aqS98S0300000_9, LiveTryModeCountDownThresholdSetting.DEFAULT));
        }
    }
}
