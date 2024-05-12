package X;

import Y.IDLListenerS190S0100000_2;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.6re, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C173626re extends C02Z {
    public final float LJLILLLLZI;
    public String LJLJI;
    public final Paint LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public final float LJLJLJ;
    public final float LJLJLLL;
    public final float LJLL;
    public final boolean LJLLI;
    public int LJLLILLLL;
    public final float LJLLJ;
    public final Paint LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;

    @Override // android.widget.ProgressBar
    public synchronized int getProgress() {
        int progress;
        progress = super.getProgress();
        String valueOf = String.valueOf(progress);
        this.LJLJI = valueOf;
        if (!CardStruct.IStatusCode.DEFAULT.equals(valueOf) && this.LJLLLL) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLJI);
            LIZ.append("%");
            this.LJLJI = X1D.LIZIZ(LIZ);
        }
        Paint paint = this.LJLJJI;
        if (paint != null) {
            this.LJLJJL = paint.measureText(this.LJLJI);
        }
        return progress;
    }

    public int getDefaultDotProgress() {
        int i = this.LJLLILLLL;
        if (i == -1 || !this.LJLLI) {
            return -1;
        }
        return i;
    }

    @Override // X.C02Z, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect bounds = getProgressDrawable().getBounds();
        float progress = getProgress() / getMax();
        float f = this.LJLLILLLL / 100.0f;
        if (C74275TDb.LJI(this)) {
            progress = 1.0f - progress;
            f = 1.0f - f;
        }
        if (this.LJLLLLLL) {
            canvas.drawText(this.LJLJI, ((bounds.width() * progress) - (this.LJLJJL / 2.0f)) + this.LJLJJLL, this.LJLL, this.LJLJJI);
        }
        if (this.LJLLILLLL != -1 && this.LJLLI) {
            canvas.drawCircle((bounds.width() * f) + this.LJLJJLL, ((getHeight() + this.LJLJLJ) - this.LJLJLLL) / 2.0f, LIZ(getContext(), this.LJLLJ), this.LJLLL);
        }
    }

    public void setDefaultDotProgress(int i) {
        this.LJLLILLLL = i;
        invalidate();
    }

    public void setDisplayPercent(boolean z) {
        this.LJLLLL = z;
    }

    public void setShowText(boolean z) {
        this.LJLLLLLL = z;
    }

    public void setTextColor(int i) {
        this.LJLJJI.setColor(i);
        invalidate();
    }

    public void setTextSize(float f) {
        Paint paint = this.LJLJJI;
        if (paint != null) {
            paint.setTextSize(f);
            invalidate();
        }
    }

    public C173626re(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public static float LIZ(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public C173626re(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Typeface LIZ;
        this.LJLJI = "";
        this.LJLL = LIZ(getContext(), 10.0f);
        this.LJLLLLLL = true;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{com.zhiliaoapp.musically.R.attr.za, com.zhiliaoapp.musically.R.attr.a9g, com.zhiliaoapp.musically.R.attr.a9h, com.zhiliaoapp.musically.R.attr.a9i, com.zhiliaoapp.musically.R.attr.any, com.zhiliaoapp.musically.R.attr.b6o, com.zhiliaoapp.musically.R.attr.b6p, com.zhiliaoapp.musically.R.attr.b6r, com.zhiliaoapp.musically.R.attr.b82, com.zhiliaoapp.musically.R.attr.bai, com.zhiliaoapp.musically.R.attr.bi9, com.zhiliaoapp.musically.R.attr.bkg}, i, 0);
        int indexCount = obtainStyledAttributes.getIndexCount();
        int i2 = 0;
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            if (index == 5) {
                i2 = obtainStyledAttributes.getColor(index, -1);
            } else if (index == 7) {
                this.LJLILLLLZI = obtainStyledAttributes.getDimension(index, 15.0f);
            }
        }
        if (obtainStyledAttributes.hasValue(4)) {
            this.LJLJJLL = obtainStyledAttributes.getDimension(4, 0.0f);
        } else {
            this.LJLJJLL = LIZ(context, 10.0f);
        }
        if (obtainStyledAttributes.hasValue(8)) {
            this.LJLJL = obtainStyledAttributes.getDimension(8, 0.0f);
        } else {
            this.LJLJL = this.LJLJJLL;
        }
        if (obtainStyledAttributes.hasValue(11)) {
            this.LJLJLJ = obtainStyledAttributes.getDimension(11, 0.0f);
        } else {
            this.LJLJLJ = LIZ(context, 13.0f);
        }
        if (obtainStyledAttributes.hasValue(0)) {
            this.LJLJLLL = obtainStyledAttributes.getDimension(0, 0.0f);
        } else {
            this.LJLJLLL = this.LJLJLJ;
        }
        if (obtainStyledAttributes.hasValue(10)) {
            this.LJLL = obtainStyledAttributes.getDimension(10, 10.0f);
        }
        this.LJLLI = obtainStyledAttributes.getBoolean(9, false);
        this.LJLLILLLL = obtainStyledAttributes.getInt(2, -1);
        int color = obtainStyledAttributes.getColor(1, -1);
        this.LJLLJ = obtainStyledAttributes.getFloat(3, 2.5f);
        String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 6);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.LJLJJI = paint;
        paint.setAntiAlias(true);
        paint.setColor(i2);
        if (!TextUtils.isEmpty(LLLZLZ)) {
            Typeface LIZ2 = C78882Uxa.LIZ(LLLZLZ);
            paint.setTypeface(LIZ2 == null ? Typeface.defaultFromStyle(1) : LIZ2);
        } else {
            EnumC49617Jdd fontType = EnumC49617Jdd.MEDIUM;
            o.LJIIIZ(fontType, "fontType");
            C78882Uxa c78882Uxa = C78882Uxa.LJ;
            c78882Uxa.getClass();
            InterfaceC173646rg interfaceC173646rg = (InterfaceC173646rg) C78882Uxa.LIZIZ.LIZ(c78882Uxa, C78882Uxa.LIZ[0]);
            if (interfaceC173646rg != null && (LIZ = interfaceC173646rg.LIZ(fontType.getVALUE())) != null) {
                paint.setTypeface(LIZ);
            }
        }
        paint.setTextSize(this.LJLILLLLZI);
        Rect rect = new Rect();
        String valueOf = String.valueOf(getProgress());
        this.LJLJI = valueOf;
        paint.getTextBounds(valueOf, 0, valueOf.length(), rect);
        Paint paint2 = new Paint();
        this.LJLLL = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(color);
        setPadding((int) this.LJLJJLL, (int) this.LJLJLJ, (int) this.LJLJL, (int) this.LJLJLLL);
        getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS190S0100000_2(this, 0));
    }
}
