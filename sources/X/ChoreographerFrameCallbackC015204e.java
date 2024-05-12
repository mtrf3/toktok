package X;

import android.view.Choreographer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.04e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC015204e implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ C29Y LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C29Y.LJJIJIL(this.LJLIL);
            C29Y c29y = this.LJLIL;
            synchronized (c29y.LJLJI) {
                if (c29y.LJLJJL.isEmpty()) {
                    c29y.LJLIL.removeFrameCallback(this);
                    c29y.LJLJLJ = false;
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ChoreographerFrameCallbackC015204e(C29Y c29y) {
        this.LJLIL = c29y;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.LJLIL.LJLILLLLZI.removeCallbacks(this);
        C29Y.LJJIJIL(this.LJLIL);
        C29Y c29y = this.LJLIL;
        synchronized (c29y.LJLJI) {
            if (c29y.LJLJLJ) {
                c29y.LJLJLJ = false;
                List<Choreographer.FrameCallback> list = c29y.LJLJJL;
                c29y.LJLJJL = c29y.LJLJJLL;
                c29y.LJLJJLL = list;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) ListProtector.get(list, i)).doFrame(j);
                }
                list.clear();
            }
        }
    }
}
