package X;

import android.view.Choreographer;

/* loaded from: classes16.dex */
public final class YKC implements Choreographer.FrameCallback {
    public final /* synthetic */ YKA LJLIL;

    public YKC(YKA yka) {
        this.LJLIL = yka;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.LJLIL.LLF.size() > 0) {
            this.LJLIL.invalidate();
            C16880lQ.LLIIIJ().postFrameCallbackDelayed(this, this.LJLIL.LLI);
        } else {
            this.LJLIL.LLIFFJFJJ = false;
        }
    }
}
