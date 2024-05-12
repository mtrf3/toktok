package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.VuV, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81239VuV extends C02Z implements SeekBar.OnSeekBarChangeListener {
    public final C80861VoP LJLILLLLZI;
    public final C81241VuX LJLJI;
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
        C80861VoP c80861VoP = this.LJLILLLLZI;
        float LIZ2 = LIZ(getSecondaryProgress());
        c80861VoP.LJI = LIZ;
        c80861VoP.LJII = LIZ2;
        super.onDraw(canvas);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.LJLJI.LJII = true;
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.LJLJJI;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.LJLJI.LJII = false;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81239VuV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.kj);
        a1.LJFF(context, "context");
        C80861VoP c80861VoP = new C80861VoP();
        this.LJLILLLLZI = c80861VoP;
        C81241VuX c81241VuX = new C81241VuX();
        this.LJLJI = c81241VuX;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bpy, R.attr.bsv, R.attr.bsw, R.attr.bta, R.attr.bu8, R.attr.bu9, R.attr.bu_, R.attr.bua, R.attr.bub, R.attr.buc, R.attr.bud}, R.attr.kj, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…defStyleAttr, 0\n        )");
        setProgressDrawable(c80861VoP);
        c80861VoP.LIZJ = obtainStyledAttributes.getColor(0, -16777216);
        c80861VoP.LIZ = obtainStyledAttributes.getColor(1, -16777216);
        c80861VoP.LIZIZ = obtainStyledAttributes.getColor(3, -16777216);
        c80861VoP.LIZLLL = obtainStyledAttributes.getDimension(2, 0.0f);
        setThumb(c81241VuX);
        c81241VuX.LIZ = obtainStyledAttributes.getFloat(5, 1.0f);
        c81241VuX.LIZIZ = obtainStyledAttributes.getDimension(10, 0.0f);
        c81241VuX.LIZJ = obtainStyledAttributes.getColor(4, -1);
        c81241VuX.LIZLLL = obtainStyledAttributes.getDimension(7, 0.0f);
        c81241VuX.LJ = obtainStyledAttributes.getDimension(8, 0.0f);
        c81241VuX.LJFF = obtainStyledAttributes.getDimension(9, 0.0f);
        c81241VuX.LJI = obtainStyledAttributes.getColor(6, -16777216);
        obtainStyledAttributes.recycle();
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
