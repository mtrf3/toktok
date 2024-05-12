package X;

import Y.ARunnableS44S0100000_8;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class J2N implements Choreographer.FrameCallback, Handler.Callback, VGA {
    public final Handler LJLIL;
    public Choreographer LJLILLLLZI;
    public final ArrayList<J2Q> LJLJI;
    public final WindowManager LJLJJI;
    public volatile long LJLJJL;
    public boolean LJLJJLL;
    public final int LJLJL;

    @Override // X.VGA
    public final void LIZ() {
    }

    @Override // X.VGA
    public final boolean LIZLLL() {
        if (this.LJLJI.size() > 0 && this.LJLJJLL) {
            return true;
        }
        return false;
    }

    @Override // X.VGA
    public final void LIZIZ(J2Q j2q) {
        C48284IxE.LIZ(2, this.LJLJL, "VsyncHelper", "removeObserver");
        if (j2q == null) {
            return;
        }
        Message obtainMessage = this.LJLIL.obtainMessage(30);
        obtainMessage.obj = j2q;
        obtainMessage.sendToTarget();
    }

    @Override // X.VGA
    public final void LIZJ(J2Q j2q) {
        C48284IxE.LIZ(2, this.LJLJL, "VsyncHelper", "addObserver");
        if (j2q == null) {
            return;
        }
        Message obtainMessage = this.LJLIL.obtainMessage(29);
        obtainMessage.obj = j2q;
        obtainMessage.sendToTarget();
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.LJLJI.size() > 0 && this.LJLJJLL) {
            Iterator<J2Q> it = this.LJLJI.iterator();
            while (it.hasNext()) {
                it.next().notifyVsync();
            }
            this.LJLILLLLZI.postFrameCallback(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Choreographer choreographer;
        Choreographer choreographer2;
        switch (message.what) {
            case 29:
                if (!this.LJLJI.contains(message.obj)) {
                    this.LJLJI.add(message.obj);
                    if (this.LJLJI.size() == 1 && (choreographer = this.LJLILLLLZI) != null) {
                        choreographer.postFrameCallback(this);
                    }
                }
                break;
            case 28:
                return true;
            case 30:
                this.LJLJI.remove(message.obj);
                if (this.LJLJI.size() == 0 && (choreographer2 = this.LJLILLLLZI) != null) {
                    choreographer2.removeFrameCallback(this);
                }
                return true;
            default:
                return false;
        }
    }

    @Override // X.VGA
    public final void setEnable(boolean z) {
        this.LJLJJLL = z;
    }

    public J2N(Context context, int i) {
        this.LJLJL = -1;
        Handler handler = new Handler(C16880lQ.LLJJJJ(), this);
        this.LJLIL = handler;
        handler.post(new ARunnableS44S0100000_8(this, 10));
        this.LJLJI = new ArrayList<>();
        Display display = null;
        if (context != null) {
            this.LJLJJI = (WindowManager) C16880lQ.LLILL(C16880lQ.LLLLL(context), "window");
        } else {
            this.LJLJJI = null;
        }
        WindowManager windowManager = this.LJLJJI;
        if (windowManager != null && (display = windowManager.getDefaultDisplay()) != null) {
            this.LJLJJL = (long) (1.0E9d / display.getRefreshRate());
        } else {
            this.LJLJJL = 16666667L;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("vsyncDurationNs:");
        LIZ.append(this.LJLJJL);
        LIZ.append("defaultDisplay:");
        LIZ.append(display);
        C48284IxE.LIZ(2, -1, "VsyncHelper", X1D.LIZIZ(LIZ));
        this.LJLJJLL = true;
        this.LJLJL = i;
        C48284IxE.LIZ(2, i, "VsyncHelper", "new VsyncHelper");
    }
}
