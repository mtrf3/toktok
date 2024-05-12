package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class WV6 extends WV5 {
    public long LLIIJI;
    public final C62822Ol8 LLIIJLIL;
    public final float LLIIL;
    public float LLIILII;

    private final RectF getMArcRectF() {
        return (RectF) this.LLIIJLIL.getValue();
    }

    @Override // X.WV5
    public final void LIZ(Canvas canvas) {
        long j = 0;
        if (this.LJLILLLLZI != null) {
            long duration = r3.getDuration() + 0;
            float LJIIJ = LJIIJ(duration);
            if (LJIIJ < 360.0f) {
                if (canvas != null) {
                    canvas.drawArc(getMArcRectF(), LJIIJ - 90.0f, 4.0f, false, this.LJLJLJ);
                }
            } else if (canvas != null) {
                canvas.drawArc(getMArcRectF(), (LJIIJ - 90.0f) - 2.0f, 4.0f, false, this.LJLJLJ);
            }
            j = duration;
        }
        List<TimeSpeedModelExtension> list = this.LJLIL;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) ListProtector.get(this.LJLIL, i);
                j += TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension.getDuration(), timeSpeedModelExtension.getSpeed());
                float LJIIJ2 = LJIIJ(j);
                if (LJIIJ2 < 360.0f) {
                    if (canvas != null) {
                        canvas.drawArc(getMArcRectF(), LJIIJ2 - 90.0f, 4.0f, false, this.LJLJLJ);
                    }
                } else if (canvas != null) {
                    canvas.drawArc(getMArcRectF(), (LJIIJ2 - 90.0f) - 2.0f, 4.0f, false, this.LJLJLJ);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012d A[SYNTHETIC] */
    @Override // X.WV5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.graphics.Canvas r29) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WV6.LIZIZ(android.graphics.Canvas):void");
    }

    public final float LJIIJ(long j) {
        return Math.min((((float) j) / ((float) this.LJZL)) * 360, 360.0f);
    }

    @Override // X.WV5, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.LLFZ == 2) {
            LIZIZ(canvas);
            return;
        }
        float LJIIJ = LJIIJ(this.LJLJI);
        long j = this.LLIIJI;
        if (j > 0) {
            float LJIIJ2 = LJIIJ(j);
            if (canvas != null) {
                canvas.drawArc(getMArcRectF(), -90.0f, LJIIJ2, false, this.LJLJJLL);
                if (LJIIJ2 < 360.0f) {
                    canvas.drawArc(getMArcRectF(), LJIIJ2 - 90.0f, 4.0f, false, this.LJLJLJ);
                } else {
                    canvas.drawArc(getMArcRectF(), (LJIIJ2 - 90.0f) - 2.0f, 4.0f, false, this.LJLJLJ);
                }
            }
        }
        if (this.LJLILLLLZI == null) {
            if (canvas != null) {
                canvas.drawArc(getMArcRectF(), -90.0f, LJIIJ, false, this.LJLJJL);
            }
        } else {
            float LJIIJ3 = LJIIJ(r1.getDuration());
            if (canvas != null) {
                canvas.drawArc(getMArcRectF(), -90.0f, LJIIJ3, false, this.LJLJLLL);
                if (LJIIJ > LJIIJ3) {
                    canvas.drawArc(getMArcRectF(), LJIIJ3 - 90.0f, LJIIJ - LJIIJ3, false, this.LJLLILLLL);
                }
            }
        }
        LIZ(canvas);
    }

    public void setCircleRadius(float f) {
        if (C52910Kpe.LIZ() && this.LLIILII == f) {
            return;
        }
        this.LLIILII = f;
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        getMArcRectF().left = (measuredWidth - f) + this.LLIIL;
        getMArcRectF().top = (measuredHeight - f) + this.LLIIL;
        getMArcRectF().right = (measuredWidth + f) - this.LLIIL;
        getMArcRectF().bottom = (measuredHeight + f) - this.LLIIL;
        invalidate();
    }

    public final void setCountDownStopTime(long j) {
        this.LLIIJI = j;
    }

    public final void setProgressColor(int i) {
        Paint paint = this.LJLJJL;
        if (paint == null) {
            return;
        }
        paint.setColor(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WV6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LLIIJI = -1L;
        this.LLIIJLIL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 381));
        float LIZJ = KL2.LIZJ(context, 6.0f);
        this.LLIIL = LIZJ / 2;
        Paint paint = this.LJLJJL;
        if (paint != null) {
            paint.setStrokeWidth(LIZJ);
            paint.setStyle(Paint.Style.STROKE);
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "this@CircleProgressSegmentView.context");
            paint.setColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, context2));
        }
        Paint paint2 = this.LJLJJLL;
        if (paint2 != null) {
            paint2.setStrokeWidth(LIZJ);
            paint2.setStyle(Paint.Style.STROKE);
            Context context3 = getContext();
            o.LJIIIIZZ(context3, "this@CircleProgressSegmentView.context");
            paint2.setColor(AnonymousClass636.LJIIIIZZ(R.attr.da, context3));
        }
        Paint paint3 = this.LJLJLJ;
        if (paint3 != null) {
            paint3.setStrokeWidth(LIZJ);
            paint3.setStyle(Paint.Style.STROKE);
        }
        Paint paint4 = this.LJLJJI;
        if (paint4 != null) {
            paint4.setStrokeWidth(LIZJ);
            paint4.setStyle(Paint.Style.STROKE);
        }
        Paint paint5 = this.LJLJL;
        if (paint5 != null) {
            paint5.setStrokeWidth(LIZJ);
            paint5.setStyle(Paint.Style.STROKE);
            Context context4 = getContext();
            o.LJIIIIZZ(context4, "this@CircleProgressSegmentView.context");
            paint5.setColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, context4));
            paint5.setAlpha(86);
        }
        Paint paint6 = this.LJLLJ;
        if (paint6 != null) {
            paint6.setStrokeWidth(LIZJ);
            paint6.setStyle(Paint.Style.STROKE);
        }
        Paint paint7 = this.LJLLL;
        if (paint7 != null) {
            paint7.setStrokeWidth(LIZJ);
            paint7.setStyle(Paint.Style.STROKE);
            Context context5 = getContext();
            o.LJIIIIZZ(context5, "this@CircleProgressSegmentView.context");
            paint7.setColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, context5));
        }
        Paint paint8 = this.LJLJLLL;
        if (paint8 != null) {
            paint8.setStrokeWidth(LIZJ);
            paint8.setStyle(Paint.Style.STROKE);
            Context context6 = getContext();
            o.LJIIIIZZ(context6, "this@CircleProgressSegmentView.context");
            paint8.setColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, context6));
        }
        Paint paint9 = this.LJLLILLLL;
        if (paint9 != null) {
            paint9.setStrokeWidth(LIZJ);
            paint9.setStyle(Paint.Style.STROKE);
            Context context7 = getContext();
            o.LJIIIIZZ(context7, "this@CircleProgressSegmentView.context");
            paint9.setColor(AnonymousClass636.LJIIIIZZ(R.attr.eg, context7));
        }
        this.LLIILII = -1.0f;
    }
}
