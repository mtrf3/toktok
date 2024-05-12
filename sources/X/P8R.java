package X;

import Y.IDRunnableS6S0101000;
import android.os.Handler;
import android.view.View;

/* loaded from: classes12.dex */
public final class P8R implements View.OnAttachStateChangeListener {
    public final /* synthetic */ SYK LJLIL;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public P8R(SYK syk) {
        this.LJLIL = syk;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        new Handler(C16880lQ.LLJJJJ()).post(new IDRunnableS6S0101000(3, this, 8));
    }
}
