package X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* renamed from: X.VgF, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnTouchListenerC80355VgF implements View.OnTouchListener {
    public final /* synthetic */ AutoCompleteTextView LJLIL;
    public final /* synthetic */ C80342Vg2 LJLILLLLZI;

    public ViewOnTouchListenerC80355VgF(C80342Vg2 c80342Vg2, AutoCompleteTextView autoCompleteTextView) {
        this.LJLILLLLZI = c80342Vg2;
        this.LJLIL = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            C80342Vg2 c80342Vg2 = this.LJLILLLLZI;
            c80342Vg2.getClass();
            long currentTimeMillis = System.currentTimeMillis() - c80342Vg2.LJIIJ;
            if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                this.LJLILLLLZI.LJIIIIZZ = false;
            }
            this.LJLILLLLZI.LJFF(this.LJLIL);
        }
        return false;
    }
}
