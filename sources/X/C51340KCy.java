package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.AppCompatImageView;

/* renamed from: X.KCy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C51340KCy extends AppCompatImageView {
    public int LJLIL;
    public KDD LJLILLLLZI;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.LJLILLLLZI != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 2) {
                    this.LJLILLLLZI.LJIJJ(true);
                } else {
                    float f = this.LJLIL;
                    float f2 = -f;
                    if (x < f2 || y < f2 || x >= (getRight() - getLeft()) + f || y >= (getBottom() - getTop()) + f) {
                        this.LJLILLLLZI.LJIJI();
                    }
                }
            } else {
                this.LJLILLLLZI.LJIJJ(false);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setKeyboardDismissHandler(KDD kdd) {
        this.LJLILLLLZI = kdd;
    }

    public C51340KCy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C51340KCy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LJLIL = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
