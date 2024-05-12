package X;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.widget.SeekBar;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS177S0200000_29;
import kotlin.jvm.internal.o;

/* renamed from: X.ZvE, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91476ZvE extends C02Z implements SeekBar.OnSeekBarChangeListener {
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public final int LJLJLLL;
    public final int LJLL;
    public final int LJLLI;
    public final float LJLLILLLL;
    public final long LJLLJ;
    public final int LJLLL;
    public final C91325Zsn LJLLLL;
    public final C91328Zsq LJLLLLLL;
    public SeekBar.OnSeekBarChangeListener LJLZ;
    public boolean LJZ;
    public Float LJZI;
    public final float LJZL;
    public float LL;
    public float LLD;

    public final boolean LIZIZ() {
        boolean z;
        boolean z2;
        boolean z3;
        float f = this.LL;
        if (0.0f <= f && f <= 1.0f) {
            z = true;
        } else {
            z = false;
        }
        float f2 = this.LLD;
        if (0.0f <= f2 && f2 <= 1.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (f < f2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z && z2 && z3) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C91325Zsn c91325Zsn = this.LJLLLL;
        c91325Zsn.LJI.removeUpdateListener(c91325Zsn.LJII);
    }

    public final boolean getHasMove() {
        return this.LJZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91476ZvE(Context context) {
        super(context, null, R.attr.b_h);
        int i;
        int i2;
        new LinkedHashMap();
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        Integer LJI = C79045V0n.LJI(R.attr.dh, context2);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        this.LJLILLLLZI = i;
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        Integer LJI2 = C79045V0n.LJI(R.attr.cl, context3);
        if (LJI2 != null) {
            i2 = LJI2.intValue();
        } else {
            i2 = 0;
        }
        this.LJLJI = i2;
        Context context4 = getContext();
        o.LJIIIIZZ(context4, "context");
        Integer LJI3 = C79045V0n.LJI(R.attr.da, context4);
        this.LJLJJI = LJI3 != null ? LJI3.intValue() : 0;
        int LIZJ = (int) KL2.LIZJ(getContext(), 2.0f);
        this.LJLJJL = LIZJ;
        this.LJLJJLL = (int) KL2.LIZJ(getContext(), 3.0f);
        this.LJLJL = (int) KL2.LIZJ(getContext(), 4.0f);
        int LIZJ2 = (int) KL2.LIZJ(getContext(), 6.0f);
        this.LJLJLJ = LIZJ2;
        int LIZJ3 = (int) KL2.LIZJ(getContext(), 7.0f);
        this.LJLJLLL = (int) KL2.LIZJ(getContext(), 8.0f);
        this.LJLL = (int) KL2.LIZJ(getContext(), 10.0f);
        this.LJLLI = (int) KL2.LIZJ(getContext(), 60.0f);
        this.LJLLILLLL = 16.0f;
        this.LJLLJ = 800L;
        this.LJLLL = 10;
        C91325Zsn c91325Zsn = new C91325Zsn(this);
        this.LJLLLL = c91325Zsn;
        C91328Zsq c91328Zsq = new C91328Zsq(this);
        this.LJLLLLLL = c91328Zsq;
        this.LJZL = LIZJ;
        this.LL = -1.0f;
        this.LLD = -1.0f;
        setThumb(c91328Zsq);
        setProgressDrawable(c91325Zsn);
        setPadding(LIZJ2, LIZJ3, LIZJ2, LIZJ3);
        setOnSeekBarChangeListener(this);
    }

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

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.LJLZ;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        requestLayout();
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.LJLZ;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        getParent().requestDisallowInterceptTouchEvent(true);
        if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (valueOf.intValue() == 0) {
                this.LJZ = false;
                this.LJZI = Float.valueOf(motionEvent.getRawX());
                super.onTouchEvent(motionEvent);
            } else if (valueOf.intValue() == 2) {
                Float f = this.LJZI;
                if (f != null && Math.abs(f.floatValue() - motionEvent.getRawX()) > this.LJLLL) {
                    this.LJZ = true;
                    super.onTouchEvent(motionEvent);
                }
            } else if (valueOf.intValue() == 1) {
                if (this.LJZ) {
                    super.onTouchEvent(motionEvent);
                } else {
                    onStartTrackingTouch(this);
                    onStopTrackingTouch(this);
                }
                this.LJZ = false;
            } else if (valueOf.intValue() == 3) {
                super.onTouchEvent(motionEvent);
                this.LJZ = false;
            }
        }
        return true;
    }

    public final void setCustomOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener l) {
        o.LJIIIZ(l, "l");
        this.LJLZ = l;
    }

    public final void setMode(EnumC91326Zso mode) {
        o.LJIIIZ(mode, "mode");
        C243119gR.LIZIZ(new IDqS177S0200000_29(this, mode, 6));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.LJLZ;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
        }
    }
}
