package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.zhiliaoapp.musically.R;

/* renamed from: X.02Z, reason: invalid class name */
/* loaded from: classes.dex */
public class C02Z extends SeekBar {
    public final C19V LJLIL;

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C19V c19v = this.LJLIL;
        Drawable drawable = c19v.LJ;
        if (drawable != null && drawable.isStateful() && drawable.setState(c19v.LIZLLL.getDrawableState())) {
            c19v.LIZLLL.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.LJLIL.LJ;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.LJLIL.LIZLLL(canvas);
    }

    public C02Z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.b_h);
    }

    public C02Z(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C16880lQ.LLLLII(getContext());
        C19V c19v = new C19V(this);
        this.LJLIL = c19v;
        c19v.LIZ(attributeSet, i);
    }
}
