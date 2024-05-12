package X;

import Y.ARunnableS37S0100000_1;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.3xw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnTouchListenerC101083xw implements View.OnTouchListener {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI = 0;

    public ViewOnTouchListenerC101083xw(int i, View view) {
        this.LJLIL = view;
        this.LJLILLLLZI = i;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        this.LJLIL.setBackgroundColor(this.LJLILLLLZI);
        C101073xv.LIZ.postDelayed(new ARunnableS37S0100000_1(this, 41), 150L);
        return false;
    }
}
