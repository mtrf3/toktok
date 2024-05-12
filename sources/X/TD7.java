package X;

import Y.ARunnableS48S0100000_12;
import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TD7 extends C8HN {
    public TD8 LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public boolean LJLLILLLL;
    public final ARunnableS48S0100000_12 LJLLJ;

    public final void LJJIJLIJ() {
        removeCallbacks(this.LJLLJ);
        TD8 td8 = this.LJLJL;
        if (td8 != null && !td8.LJI) {
            td8.LJI = true;
        }
        if (LJJIJL()) {
            setTextDirection(4);
            setLayoutDirection(1);
            invalidate();
            requestLayout();
        }
        postDelayed(this.LJLLJ, 0L);
    }

    public final boolean LJJIJL() {
        if (C16310kV.LIZLLL(this) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LJLLILLLL) {
            LJJIJLIJ();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.LJLLJ);
        TD8 td8 = this.LJLJL;
        if (td8 != null && !td8.LJI) {
            td8.LJI = true;
        }
        setHorizontallyScrolling(false);
        setHorizontalFadingEdgeEnabled(false);
        setEllipsize(TextUtils.TruncateAt.END);
    }

    public final int getCount() {
        return this.LJLJLLL;
    }

    public final int getEndPosition() {
        return this.LJLJLJ;
    }

    public final int getSpeed() {
        return this.LJLL;
    }

    public final int getTaskInterval() {
        return this.LJLLI;
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.LJLLILLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TD7(Context context) {
        super(context, null, 0);
        o.LJIIIZ(context, "context");
        this.LJLJLLL = -1;
        this.LJLL = 40;
        this.LJLLI = 25;
        this.LJLLJ = new ARunnableS48S0100000_12(this, 66);
    }

    public final void setCount(int i) {
        this.LJLJLLL = i;
    }

    public final void setEndPosition(int i) {
        this.LJLJLJ = i;
    }

    public final void setMarqueeEnable$lib_runtime_release(boolean z) {
        if (this.LJLLILLLL != z) {
            this.LJLLILLLL = z;
            if (z) {
                LJJIJLIJ();
                return;
            }
            removeCallbacks(this.LJLLJ);
            TD8 td8 = this.LJLJL;
            if (td8 != null && !td8.LJI) {
                td8.LJI = true;
            }
            setHorizontallyScrolling(false);
            setHorizontalFadingEdgeEnabled(false);
            setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    public final void setSpeed(int i) {
        this.LJLL = i;
    }

    public final void setTaskInterval(int i) {
        this.LJLLI = i;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        TD8 td8 = this.LJLJL;
        if (td8 != null && !td8.LJI) {
            td8.LJI = true;
        }
        this.LJLJL = null;
        super.setText(charSequence, bufferType);
    }
}
