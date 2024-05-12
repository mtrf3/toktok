package X;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: X.SXp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class ViewOnTouchListenerC72261SXp implements View.OnTouchListener {
    public final Dialog LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;

    public ViewOnTouchListenerC72261SXp(Dialog dialog, Rect rect) {
        this.LJLIL = dialog;
        this.LJLILLLLZI = rect.left;
        this.LJLJI = rect.top;
        this.LJLJJI = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.LJLILLLLZI;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.LJLJI, width, findViewById.getHeight() + r1).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.LJLJJI;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.LJLIL.onTouchEvent(obtain);
    }
}
