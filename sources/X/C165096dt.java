package X;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6dt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165096dt extends C173626re {
    public int LJLZ;
    public int LJZ;
    public boolean LJZI;

    @Override // X.C173626re, android.widget.ProgressBar
    public int getProgress() {
        String valueOf;
        int progress = super.getProgress();
        if (this.LJZI) {
            float f = progress;
            if (f >= getMax() / 2.0f) {
                valueOf = String.valueOf((int) (((this.LJZ / (getMax() / 2.0f)) * f) - this.LJZ));
            } else {
                valueOf = String.valueOf((int) ((((-this.LJLZ) / (getMax() / 2.0f)) * f) + this.LJLZ));
            }
        } else {
            valueOf = String.valueOf((int) ((((this.LJZ - this.LJLZ) / getMax()) * progress) + this.LJLZ));
        }
        this.LJLJI = valueOf;
        return progress;
    }

    public final int getMaxValue() {
        return this.LJZ;
    }

    public final int getMinValue() {
        return this.LJLZ;
    }

    public final void setDoubleDirection(boolean z) {
        this.LJZI = z;
    }

    public final void setMaxValue(int i) {
        this.LJZ = i;
    }

    public final void setMinValue(int i) {
        this.LJLZ = i;
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        int progress = super.getProgress();
        super.setProgress(i);
        if (progress == super.getProgress()) {
            invalidate();
        }
    }

    public C165096dt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (context == null) {
            return;
        }
        Paint mPaint = this.LJLJJI;
        o.LJIIIIZZ(mPaint, "mPaint");
        mPaint.setColor(context.getResources().getColor(R.color.ua));
        Paint mPaint2 = this.LJLJJI;
        o.LJIIIIZZ(mPaint2, "mPaint");
        mPaint2.setFakeBoldText(true);
    }
}
