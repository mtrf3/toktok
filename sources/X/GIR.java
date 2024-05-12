package X;

import Y.ARunnableS26S0200000_7;
import android.view.ViewTreeObserver;
import com.bytedance.tux.input.TuxTextView;

/* loaded from: classes8.dex */
public final class GIR implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ TuxTextView LJLIL;

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.LJLIL.getLineCount() <= 2) {
            this.LJLIL.setMaxLines(2);
            this.LJLIL.LJJJ(32.0f);
            this.LJLIL.setMinTextSize(24.0f);
            this.LJLIL.requestLayout();
        } else {
            this.LJLIL.setMaxLines(3);
            this.LJLIL.requestLayout();
        }
        TuxTextView tuxTextView = this.LJLIL;
        tuxTextView.post(new ARunnableS26S0200000_7(this, tuxTextView, 3));
    }

    public GIR(TuxTextView tuxTextView) {
        this.LJLIL = tuxTextView;
    }
}
