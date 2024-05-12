package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Cda, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31778Cda extends FrameLayout {
    public final C47121t6 LJLIL;
    public final SeekBar LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;
    public final int LJLJLJ;
    public final boolean LJLJLLL;

    public final void LIZ(SeekBar seekBar) {
        int progress = seekBar.getProgress();
        this.LJLJJLL = progress;
        C47121t6 c47121t6 = this.LJLIL;
        if (c47121t6 != null) {
            int measuredWidth = (seekBar.getMeasuredWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight();
            c47121t6.setText(String.valueOf(progress));
            int i = this.LJLJJL;
            if (progress > i || i <= 0) {
                return;
            }
            double measuredWidth2 = (((progress / i) * measuredWidth) + r1) - (c47121t6.getMeasuredWidth() / 2.0d);
            if (C15380j0.LJIIZILJ()) {
                measuredWidth2 = -measuredWidth2;
            }
            c47121t6.setTranslationX((float) measuredWidth2);
            c47121t6.setTranslationY(this.LJLJLJ);
        }
    }

    public final void setCurrentProgress(int i) {
        SeekBar seekBar = this.LJLILLLLZI;
        if (seekBar == null) {
            return;
        }
        seekBar.setProgress(i);
    }

    public final void setMaxProgress(int i) {
        this.LJLJJL = i;
        SeekBar seekBar = this.LJLILLLLZI;
        if (seekBar == null) {
            return;
        }
        seekBar.setMax(i);
    }

    public final void setSeekbarListener(SeekBar.OnSeekBarChangeListener listener) {
        o.LJIIIZ(listener, "listener");
        SeekBar seekBar = this.LJLILLLLZI;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(new C31779Cdb(this, listener));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31778Cda(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJJL = 5;
        this.LJLJL = true;
        try {
            if (C29306Beo.LIZJ(context) != null) {
                FrameLayout.inflate(context, R.layout.de3, this);
            }
            C47121t6 c47121t6 = (C47121t6) findViewById(R.id.jkp);
            this.LJLIL = c47121t6;
            SeekBar seekBar = (SeekBar) findViewById(R.id.jkq);
            this.LJLILLLLZI = seekBar;
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.b_i, R.attr.b_j, R.attr.b_k, R.attr.b_l, R.attr.b_m, R.attr.b_n});
                o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…tyleable.LiveTextSeekBar)");
                this.LJLJLLL = obtainStyledAttributes.getBoolean(0, false);
                this.LJLJJLL = obtainStyledAttributes.getInteger(2, 0);
                this.LJLJI = obtainStyledAttributes.getColor(3, -1);
                this.LJLJJI = obtainStyledAttributes.getDimensionPixelSize(4, (int) TypedValue.applyDimension(2, 14.0f, Resources.getSystem().getDisplayMetrics()));
                this.LJLJJL = obtainStyledAttributes.getInteger(1, 5);
                this.LJLJLJ = (int) obtainStyledAttributes.getDimension(5, C15380j0.LIZ(0.0f));
                obtainStyledAttributes.recycle();
            }
            if (c47121t6 != null) {
                c47121t6.setText(String.valueOf(this.LJLJJLL));
                c47121t6.setTextColor(this.LJLJI);
                c47121t6.setTextSize(0, this.LJLJJI);
            }
            if (seekBar != null) {
                seekBar.setMax(this.LJLJJL);
            }
            if (!this.LJLJLLL || seekBar == null) {
                return;
            }
            seekBar.setThumb(C15380j0.LJI(R.drawable.da2));
        } catch (Exception e) {
            C0NB.LIZIZ("LiveTextSeekbar", e.toString());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.LJLJL) {
            SeekBar seekBar = this.LJLILLLLZI;
            if (seekBar != null) {
                LIZ(seekBar);
            }
            this.LJLJL = false;
        }
    }
}
