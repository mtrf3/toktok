package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.SeekBar;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.5Ru, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135065Ru extends C02Z implements SeekBar.OnSeekBarChangeListener {
    public C131815Fh LJLILLLLZI;
    public C5FS LJLJI;
    public SeekBar.OnSeekBarChangeListener LJLJJI;

    public final float LIZ(int i) {
        float f;
        int max;
        if (Build.VERSION.SDK_INT >= 26) {
            max = getMax() - getMin();
            if (max <= 0) {
                return 0.0f;
            }
            f = (i - getMin()) * 1.0f;
        } else {
            if (getMax() <= 0) {
                return 0.0f;
            }
            f = i * 1.0f;
            max = getMax();
        }
        return f / max;
    }

    @Override // X.C02Z, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        float LIZ = LIZ(getProgress());
        C131815Fh c131815Fh = this.LJLILLLLZI;
        LIZ(getSecondaryProgress());
        c131815Fh.LJI = LIZ;
        C5FS c5fs = this.LJLJI;
        LIZ(getSecondaryProgress());
        Rect bounds = this.LJLILLLLZI.getBounds();
        o.LJIIIIZZ(bounds, "pd.bounds");
        c5fs.getClass();
        c5fs.LJII = bounds;
        super.onDraw(canvas);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.LJLJI.getClass();
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.LJLJJI;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.LJLJI.getClass();
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.LJLJJI;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.SeekBar
    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        if (o.LJ(onSeekBarChangeListener, this)) {
            super.setOnSeekBarChangeListener(onSeekBarChangeListener);
        } else {
            this.LJLJJI = onSeekBarChangeListener;
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i) {
        super.setProgress(i);
    }

    public final void setProgressColor(int i) {
        this.LJLILLLLZI.LIZ = i;
    }

    @Override // android.widget.ProgressBar
    public void setSecondaryProgress(int i) {
        super.setSecondaryProgress(i);
    }

    public final void setSliderProgressDrawable(C131815Fh drawable) {
        o.LJIIIZ(drawable, "drawable");
        this.LJLILLLLZI = drawable;
        setProgressDrawable(drawable);
        invalidate();
    }

    public final void setSliderThumbDrawable(C5FS drawable) {
        o.LJIIIZ(drawable, "drawable");
        this.LJLJI = drawable;
        setThumb(drawable);
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C135065Ru(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLILLLLZI = new C131815Fh(context);
        this.LJLJI = new C5FS();
        setProgressDrawable(this.LJLILLLLZI);
        setThumb(this.LJLJI);
        setOnSeekBarChangeListener(this);
        setLayerType(1, null);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.LJLJJI;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
        }
    }
}
