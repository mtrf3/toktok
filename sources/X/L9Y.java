package X;

import Y.ARunnableS45S0100000_9;
import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class L9Y extends AbstractC51620KNs {
    public static final /* synthetic */ int LIZLLL = 0;
    public final ConcurrentHashMap<Integer, LinkedList<View>> LIZIZ;
    public long LIZJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L9Y(Activity activity) {
        super(activity);
        o.LJIIIZ(activity, "activity");
        this.LIZIZ = new ConcurrentHashMap<>();
        this.LIZJ = 10000L;
    }

    @Override // X.InterfaceC51123K4p
    public View LIZ(int i) {
        if (C53791L9f.LIZ()) {
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
            View LIZ = C16950lX.LIZ(this.LIZ, i, new FrameLayout(this.LIZ), false, -1);
            o.LJIIIIZZ(LIZ, "{\n                val vi…ty), false)\n            }");
            return LIZ;
        }
        if (((Boolean) C53791L9f.LIZIZ.getValue()).booleanValue()) {
            View LIZ2 = C16950lX.LIZ(this.LIZ, i, new FrameLayout(this.LIZ), false, -1);
            o.LJIIIIZZ(LIZ2, "getView(activity, layout…eLayout(activity), false)");
            return LIZ2;
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
    public void LIZJ(C208108Es target, long j) {
        o.LJIIIZ(target, "target");
        if (!C53791L9f.LIZ()) {
            return;
        }
        AqS156S0200000_9 aqS156S0200000_9 = new AqS156S0200000_9(this, target, 0);
        if (j > 0) {
            C37190Eig.LIZ.postDelayed(new ARunnableS45S0100000_9((Object) aqS156S0200000_9, 7), j);
        } else {
            C37190Eig.LIZ.post(new ARunnableS45S0100000_9((Object) aqS156S0200000_9, 7));
        }
    }
}
