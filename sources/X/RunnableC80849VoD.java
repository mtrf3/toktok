package X;

import android.content.Context;
import android.widget.OverScroller;

/* renamed from: X.VoD, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC80849VoD implements Runnable {
    public final OverScroller LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ ViewOnTouchListenerC80851VoF LJLJJI;

    public final void LIZ() {
        VA9<V92> LJFF;
        if (!this.LJLIL.isFinished() && (LJFF = this.LJLJJI.LJFF()) != null) {
            ViewOnTouchListenerC80851VoF viewOnTouchListenerC80851VoF = this.LJLJJI;
            if (this.LJLIL.computeScrollOffset()) {
                int currX = this.LJLIL.getCurrX();
                int currY = this.LJLIL.getCurrY();
                viewOnTouchListenerC80851VoF.LJLZ.postTranslate(this.LJLILLLLZI - currX, this.LJLJI - currY);
                LJFF.invalidate();
                this.LJLILLLLZI = currX;
                this.LJLJI = currY;
                LJFF.postOnAnimation(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC80849VoD(ViewOnTouchListenerC80851VoF viewOnTouchListenerC80851VoF, Context context) {
        this.LJLJJI = viewOnTouchListenerC80851VoF;
        this.LJLIL = new OverScroller(context);
    }
}
