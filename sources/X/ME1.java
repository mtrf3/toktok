package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

/* loaded from: classes10.dex */
public class ME1 extends LinearLayout {
    public TextView LJLIL;
    public SeekBar LJLILLLLZI;
    public boolean LJLJI;

    public final void LIZ() {
        SeekBar seekBar = this.LJLILLLLZI;
        if (seekBar != null && this.LJLIL != null) {
            int paddingLeft = seekBar.getPaddingLeft();
            int measuredWidth = (this.LJLILLLLZI.getMeasuredWidth() - paddingLeft) - this.LJLILLLLZI.getPaddingRight();
            int progress = this.LJLILLLLZI.getProgress();
            this.LJLIL.setText(String.valueOf(progress));
            int measuredWidth2 = this.LJLIL.getMeasuredWidth();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.LJLIL.getLayoutParams());
            layoutParams.leftMargin = (int) ((((progress / 100.0d) * measuredWidth) + paddingLeft) - (measuredWidth2 / 2.0d));
            this.LJLIL.setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.LJLIL = (TextView) getChildAt(0);
        this.LJLILLLLZI = (SeekBar) getChildAt(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (dispatchTouchEvent) {
            LIZ();
        }
        return dispatchTouchEvent;
    }

    public ME1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJI = true;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        SeekBar seekBar = this.LJLILLLLZI;
        if (seekBar != null && seekBar.getMeasuredWidth() != 0 && this.LJLJI) {
            LIZ();
            this.LJLJI = false;
        }
    }
}
