package X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes15.dex */
public final class VUQ implements View.OnTouchListener {
    public final /* synthetic */ boolean LJLIL;

    public VUQ(boolean z) {
        this.LJLIL = z;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return !this.LJLIL;
    }
}
