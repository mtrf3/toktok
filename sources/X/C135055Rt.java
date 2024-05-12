package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.5Rt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135055Rt extends C173626re {
    public final TypedArray LJLZ;
    public final C131805Fg LJZ;
    public long LJZI;
    public final C5FT LJZL;
    public final C5FT LL;

    public final void LIZIZ() {
        C5FT c5ft;
        if (o.LJ(getThumb(), this.LJZL)) {
            c5ft = this.LL;
        } else {
            c5ft = this.LJZL;
        }
        setThumb(c5ft);
    }

    public final TypedArray getAttributes() {
        return this.LJLZ;
    }

    @Override // X.C173626re, X.C02Z, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        int max;
        float f2;
        int i;
        int progress = getProgress();
        if (Build.VERSION.SDK_INT >= 26) {
            max = getMax() - getMin();
            if (max > 0) {
                f = (progress - getMin()) * 1.0f;
                f2 = f / max;
            }
            f2 = 0.0f;
        } else {
            if (getMax() > 0) {
                f = progress * 1.0f;
                max = getMax();
                f2 = f / max;
            }
            f2 = 0.0f;
        }
        C131805Fg c131805Fg = this.LJZ;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        boolean LJI = C74275TDb.LJI(this);
        c131805Fg.getClass();
        c131805Fg.LJIIIIZZ = LJI;
        c131805Fg.LJIIIZ = f2;
        SY9 sy9 = c131805Fg.LJFF;
        if (f2 >= 0.055f) {
            i = R.attr.gp;
        } else {
            i = R.attr.dm;
        }
        sy9.LJFF(i, context);
        C5FT c5ft = this.LJZL;
        Rect bounds = this.LJZ.getBounds();
        o.LJIIIIZZ(bounds, "pd.bounds");
        c5ft.getClass();
        c5ft.LJII = bounds;
        C5FT c5ft2 = this.LL;
        Rect bounds2 = this.LJZ.getBounds();
        o.LJIIIIZZ(bounds2, "pd.bounds");
        c5ft2.getClass();
        c5ft2.LJII = bounds2;
        super.onDraw(canvas);
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        if (event.getAction() == 0 && !isEnabled() && this.LJLZ.getBoolean(14, false) && System.currentTimeMillis() - this.LJZI >= 500) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(this.LJLZ.getResourceId(13, 0));
            C78915Uy7.LJJIJ(this, 3026, creativeToastBuilder);
            this.LJZI = System.currentTimeMillis();
        }
        return super.onTouchEvent(event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C135055Rt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, android.R.attr.seekBarStyle);
        a1.LJFF(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.b2c, R.attr.b2d, R.attr.b2e, R.attr.b2f, R.attr.b2g, R.attr.b2h, R.attr.b2i, R.attr.b2j, R.attr.b2k, R.attr.b2l, R.attr.b2m, R.attr.b2n, R.attr.b2o, R.attr.b2p, R.attr.b2q});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…eable.NewProgressSeekBar)");
        this.LJLZ = obtainStyledAttributes;
        C131805Fg c131805Fg = new C131805Fg(context, attributeSet);
        this.LJZ = c131805Fg;
        C5FT c5ft = new C5FT(context, attributeSet, obtainStyledAttributes.getDimension(12, C7MY.LIZIZ(16)), obtainStyledAttributes.getDimension(10, C7MY.LIZIZ(46)));
        this.LJZL = c5ft;
        this.LL = new C5FT(context, attributeSet, obtainStyledAttributes.getDimension(8, C7MY.LIZIZ(19)), obtainStyledAttributes.getDimension(7, C7MY.LIZIZ(55)));
        setThumb(c5ft);
        setProgressDrawable(c131805Fg);
        setSplitTrack(true);
    }
}
