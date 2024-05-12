package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.58q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1300858q extends View {
    public final List<Float> LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public AbstractC1304059w LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public float LJLLI;
    public C55M LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public int LJLLL;
    public long LJLLLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1300858q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final void LIZ() {
        Iterator<Float> it = this.LJLIL.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            float floatValue = it.next().floatValue();
            float f = this.LJLLL / ((((float) this.LJLLLL) / floatValue) / 1000);
            this.LJLJJLL = f;
            if (O6R.LJJIIZ(f) >= this.LJLILLLLZI) {
                this.LJLJJL = floatValue;
                break;
            }
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        o.LJII(parent, "null cannot be cast to non-null type com.ss.ugc.android.editor.track.widget.EditScroller");
        AbstractC1304059w abstractC1304059w = (AbstractC1304059w) parent;
        this.LJLJJI = abstractC1304059w;
        abstractC1304059w.setScrollChangeListener(new AqS184S0100000_2(this, 55));
    }

    public final long getDurationTime() {
        return this.LJLLLL;
    }

    private final void setDurationWidth(int i) {
        if (this.LJLLL == i || i <= 0) {
            return;
        }
        this.LJLLL = i;
        LIZ();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (canvas == null || this.LJLLL <= 0 || this.LJLLLL <= 0 || O6R.LJJIIZ(this.LJLJJLL) < this.LJLILLLLZI) {
            return;
        }
        int i2 = this.LJLJI / 2;
        int i3 = 0;
        if (((Boolean) this.LJLLJ.getValue()).booleanValue()) {
            int measuredWidth = getMeasuredWidth();
            AbstractC1304059w abstractC1304059w = this.LJLJJI;
            if (abstractC1304059w != null) {
                i3 = abstractC1304059w.getScrollX();
            }
            int min = Math.min(i3, -i2) + measuredWidth;
            this.LJLJLLL = min;
            this.LJLL = Math.max(min - ((int) (this.LJLJI * 1.5d)), i2);
            this.LJLJLJ = (int) (((getMeasuredWidth() - i2) - this.LJLJLLL) / this.LJLJJLL);
            this.LJLJL = (getMeasuredWidth() - i2) - (this.LJLJLJ * this.LJLJJLL);
            while (true) {
                float f = this.LJLJL;
                if (f <= this.LJLL) {
                    return;
                }
                int i4 = this.LJLJLJ;
                float f2 = i4 * this.LJLJJL;
                C55M c55m = this.LJLLILLLL;
                if (c55m != null) {
                    c55m.LIZ(canvas, i4, f, this.LJLLI, f2);
                }
                this.LJLJL -= this.LJLJJLL + 0.0f;
                this.LJLJLJ++;
            }
        } else {
            AbstractC1304059w abstractC1304059w2 = this.LJLJJI;
            if (abstractC1304059w2 != null) {
                i = abstractC1304059w2.getScrollX();
            } else {
                i = 0;
            }
            this.LJLJLLL = i;
            int i5 = (int) ((this.LJLJI * 1.5d) + i);
            this.LJLL = i5;
            int i6 = this.LJLLL + i2;
            if (i5 >= i6) {
                i5 = i6;
            }
            this.LJLL = i5;
            if (i > i2) {
                i3 = (int) ((i - i2) / this.LJLJJLL);
            }
            this.LJLJLJ = i3;
            this.LJLJL = (i3 * this.LJLJJLL) + i2;
            while (true) {
                float f3 = this.LJLJL;
                if (f3 >= this.LJLL) {
                    return;
                }
                int i7 = this.LJLJLJ;
                float f4 = i7 * this.LJLJJL;
                C55M c55m2 = this.LJLLILLLL;
                if (c55m2 != null) {
                    c55m2.LIZ(canvas, i7, f3, this.LJLLI, f4);
                }
                this.LJLJL = this.LJLJJLL + 0.0f + this.LJLJL;
                this.LJLJLJ++;
            }
        }
    }

    public final void setDurationTime(long j) {
        if (this.LJLLLL == j || j <= 0) {
            return;
        }
        this.LJLLLL = j;
        LIZ();
    }

    public final void setTimeLinePaint(C55M paint) {
        o.LJIIIZ(paint, "paint");
        this.LJLLILLLL = paint;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setDurationWidth((int) (C1300758p.LIZIZ() * ((float) this.LJLLLL)));
        setMeasuredDimension(((this.LJLJI / 2) * 2) + this.LJLLL, View.MeasureSpec.getSize(i2));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1300858q(android.content.Context r5, android.util.AttributeSet r6, int r7) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1300858q.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LJLLI = i2 / 2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSizeChanged::viewCenterY = ");
        LIZ.append(this.LJLLI);
        C131935Ft.LIZIZ("TrackRuler", X1D.LIZIZ(LIZ));
    }
}
