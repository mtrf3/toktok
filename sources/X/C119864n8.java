package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.4n8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119864n8 extends View {
    public final Paint LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public float LJLJJI;

    public final int getCy() {
        return this.LJLJI;
    }

    public final void LIZ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            Paint paint = this.LJLIL;
                            Context context = getContext();
                            o.LJIIIIZZ(context, "context");
                            Integer LJI = C79045V0n.LJI(R.attr.cp, context);
                            if (LJI != null) {
                                paint.setColor(LJI.intValue());
                            } else {
                                return;
                            }
                        } else {
                            Paint paint2 = this.LJLIL;
                            Context context2 = getContext();
                            o.LJIIIIZZ(context2, "context");
                            Integer LJI2 = C79045V0n.LJI(R.attr.dn, context2);
                            if (LJI2 != null) {
                                paint2.setColor(LJI2.intValue());
                                getLayoutParams().width = C7MY.LIZIZ(43);
                                getLayoutParams().height = C7MY.LIZIZ(43);
                            } else {
                                return;
                            }
                        }
                    } else {
                        Paint paint3 = this.LJLIL;
                        Context context3 = getContext();
                        o.LJIIIIZZ(context3, "context");
                        Integer LJI3 = C79045V0n.LJI(R.attr.cp, context3);
                        if (LJI3 != null) {
                            paint3.setColor(LJI3.intValue());
                            getLayoutParams().width = C7MY.LIZIZ(43);
                            getLayoutParams().height = C7MY.LIZIZ(43);
                        } else {
                            return;
                        }
                    }
                } else {
                    Paint paint4 = this.LJLIL;
                    Context context4 = getContext();
                    o.LJIIIIZZ(context4, "context");
                    Integer LJI4 = C79045V0n.LJI(R.attr.dn, context4);
                    if (LJI4 != null) {
                        paint4.setColor(LJI4.intValue());
                    } else {
                        return;
                    }
                }
            } else {
                Paint paint5 = this.LJLIL;
                Context context5 = getContext();
                o.LJIIIIZZ(context5, "context");
                Integer LJI5 = C79045V0n.LJI(R.attr.eg, context5);
                if (LJI5 != null) {
                    paint5.setColor(LJI5.intValue());
                } else {
                    return;
                }
            }
        } else {
            Paint paint6 = this.LJLIL;
            Context context6 = getContext();
            o.LJIIIIZZ(context6, "context");
            Integer LJI6 = C79045V0n.LJI(R.attr.e5, context6);
            if (LJI6 == null) {
                return;
            } else {
                paint6.setColor(LJI6.intValue());
            }
        }
        postInvalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            canvas.drawCircle(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLIL);
        }
    }

    public final void setCy(int i) {
        this.LJLJI = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C119864n8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        Paint paint = new Paint();
        this.LJLIL = paint;
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(KL2.LIZJ(context, 2.0f));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LJLILLLLZI = getMeasuredWidth() / 2;
        this.LJLJI = getMeasuredHeight() / 2;
        this.LJLJJI = (getMeasuredHeight() / 2) - getPaddingBottom();
    }
}
