package X;

import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MdV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractChoreographerFrameCallbackC57253MdV implements Choreographer.FrameCallback {
    public final boolean LJLIL;
    public final List<InterfaceC57255MdX> LJLILLLLZI = new ArrayList();
    public boolean LJLJI;

    public void LIZIZ() {
    }

    public void LIZJ() {
    }

    public abstract void LIZLLL();

    public AbstractChoreographerFrameCallbackC57253MdV(boolean z) {
        this.LJLIL = z;
    }

    public void LIZ(InterfaceC57255MdX listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) this.LJLILLLLZI).add(listener);
        if (!this.LJLJI) {
            if (this.LJLIL) {
                C16880lQ.LLIIIJ().postFrameCallback(this);
            }
            this.LJLJI = true;
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (!this.LJLJI) {
            return;
        }
        C16880lQ.LLIIIJ().removeFrameCallback(this);
        C16880lQ.LLIIIJ().postFrameCallback(this);
        LIZIZ();
    }
}
