package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.model.DataPoint;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.6M4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6M4 extends View implements InterfaceC60822a6 {
    public final Path LJLIL;
    public final List<DataPoint> LJLILLLLZI;
    public final List<DataPoint> LJLJI;
    public final int LJLJJI;
    public final Paint LJLJJL;
    public final Paint LJLJJLL;
    public final Paint LJLJL;
    public final int LJLJLJ;
    public final int LJLJLLL;
    public final Canvas LJLL;
    public Bitmap LJLLI;
    public DataPoint LJLLILLLL;
    public C6M5 LJLLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6M4(Context context) {
        super(context);
        int i;
        int i2;
        new LinkedHashMap();
        this.LJLIL = new Path();
        this.LJLILLLLZI = new ArrayList();
        this.LJLJI = new ArrayList();
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        Integer LJI = C79045V0n.LJI(R.attr.eg, context2);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        this.LJLJJI = i;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        Integer LJI2 = C79045V0n.LJI(R.attr.eh, context3);
        if (LJI2 != null) {
            i2 = LJI2.intValue();
        } else {
            i2 = 0;
        }
        paint.setColor(i2);
        this.LJLJJL = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        Context context4 = getContext();
        o.LJIIIIZZ(context4, "context");
        Integer LJI3 = C79045V0n.LJI(R.attr.dj, context4);
        paint2.setColor(LJI3 != null ? LJI3.intValue() : 0);
        this.LJLJJLL = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setPathEffect(new DashPathEffect(new float[]{20.0f, 5.0f}, 0.0f));
        paint3.setColor(i);
        this.LJLJL = paint3;
        this.LJLJLJ = Resources.getSystem().getDisplayMetrics().widthPixels;
        this.LJLJLLL = C7MY.LIZIZ(16);
        this.LJLL = new Canvas();
    }

    public static float LIZJ(DataPoint dataPoint) {
        double d = 2;
        return (float) Math.sqrt(((float) Math.pow(dataPoint.x, d)) + ((float) Math.pow(dataPoint.y, d)));
    }

    @Override // X.InterfaceC60822a6
    public final void LIZ(int i) {
        float f = i * 1000.0f;
        Iterator it = ((ArrayList) this.LJLILLLLZI).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (((DataPoint) it.next()).x == f) {
                if (i2 < 0 || i2 >= ((ArrayList) this.LJLJI).size()) {
                    return;
                }
                DataPoint dataPoint = (DataPoint) ListProtector.get(this.LJLJI, i2);
                Canvas canvas = this.LJLL;
                canvas.drawColor(0, PorterDuff.Mode.MULTIPLY);
                this.LJLLILLLL = dataPoint;
                canvas.drawCircle(dataPoint.x, dataPoint.y, C7MY.LIZIZ(8), this.LJLJJLL);
                canvas.drawCircle(dataPoint.x, dataPoint.y, C7MY.LIZIZ(4), this.LJLJJL);
                canvas.drawLine(dataPoint.x, C7MY.LIZIZ(8) + dataPoint.y, dataPoint.x, getMeasuredHeight() - C7MY.LIZIZ(8), this.LJLJL);
                return;
            }
            i2++;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Object obj;
        super.onDraw(canvas);
        if (((ArrayList) this.LJLJI).isEmpty()) {
            return;
        }
        if (canvas != null) {
            int i = 0;
            boolean z = true;
            if (getLayoutDirection() != 1) {
                z = false;
            }
            float f = 1.0f;
            if (z) {
                canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
            }
            try {
                if (!((ArrayList) this.LJLJI).isEmpty()) {
                    this.LJLIL.reset();
                    this.LJLIL.moveTo(((DataPoint) ORZ.LJLLJ(this.LJLJI)).x, ((DataPoint) ORZ.LJLLJ(this.LJLJI)).y);
                    int size = ((ArrayList) this.LJLJI).size() - 1;
                    while (i < size) {
                        int i2 = i - 1;
                        if (i2 >= 0) {
                            obj = ListProtector.get(this.LJLJI, i2);
                        } else {
                            obj = ListProtector.get(this.LJLJI, ((ArrayList) r1).size() - 1);
                        }
                        DataPoint dataPoint = (DataPoint) obj;
                        DataPoint dataPoint2 = (DataPoint) ListProtector.get(this.LJLJI, i);
                        List<DataPoint> list = this.LJLJI;
                        int i3 = i + 1;
                        DataPoint dataPoint3 = (DataPoint) ListProtector.get(list, i3 % ((ArrayList) list).size());
                        List<DataPoint> list2 = this.LJLJI;
                        DataPoint dataPoint4 = (DataPoint) ListProtector.get(list2, (i + 2) % ((ArrayList) list2).size());
                        float LIZJ = LIZJ(LIZIZ(dataPoint2, dataPoint));
                        float LIZJ2 = LIZJ(LIZIZ(dataPoint3, dataPoint2));
                        float LIZJ3 = LIZJ(LIZIZ(dataPoint4, dataPoint3));
                        double d = LIZJ;
                        float f2 = 2;
                        double d2 = f2 * f;
                        double d3 = LIZJ2;
                        DataPoint LIZIZ = LIZIZ(LIZLLL(dataPoint3, (float) Math.pow(d, d2)), LIZLLL(dataPoint, (float) Math.pow(d3, d2)));
                        float pow = ((float) Math.pow(d, d2)) * f2;
                        float f3 = 3;
                        double d4 = 1.0f;
                        DataPoint LIZLLL = LIZLLL(dataPoint2, (((float) Math.pow(d, d4)) * f3 * ((float) Math.pow(d3, d4))) + pow + ((float) Math.pow(d3, d2)));
                        DataPoint LIZLLL2 = LIZLLL(new DataPoint(LIZIZ.x + LIZLLL.x, LIZIZ.y + LIZLLL.y), 1.0f / ((((float) Math.pow(d, d4)) + ((float) Math.pow(d3, d4))) * (((float) Math.pow(d, d4)) * f3)));
                        double d5 = LIZJ3;
                        DataPoint LIZIZ2 = LIZIZ(LIZLLL(dataPoint2, (float) Math.pow(d5, d2)), LIZLLL(dataPoint4, (float) Math.pow(d3, d2)));
                        DataPoint LIZLLL3 = LIZLLL(dataPoint3, (((float) Math.pow(d5, d4)) * f3 * ((float) Math.pow(d3, d4))) + (((float) Math.pow(d5, d2)) * f2) + ((float) Math.pow(d3, d2)));
                        DataPoint LIZLLL4 = LIZLLL(new DataPoint(LIZIZ2.x + LIZLLL3.x, LIZIZ2.y + LIZLLL3.y), 1.0f / ((((float) Math.pow(d5, d4)) + ((float) Math.pow(d3, d4))) * (f3 * ((float) Math.pow(d5, d4)))));
                        float max = Math.max(dataPoint2.x, dataPoint3.x);
                        float min = Math.min(dataPoint2.x, dataPoint3.x);
                        float max2 = Math.max(dataPoint2.y, dataPoint3.y);
                        float min2 = Math.min(dataPoint2.y, dataPoint3.y);
                        this.LJLIL.cubicTo(C78842Uww.LJIIJJI(LIZLLL2.x, min, max), C78842Uww.LJIIJJI(LIZLLL2.y, min2, max2), C78842Uww.LJIIJJI(LIZLLL4.x, min, max), C78842Uww.LJIIJJI(LIZLLL4.y, min2, max2), dataPoint3.x, dataPoint3.y);
                        i = i3;
                        f = 1.0f;
                    }
                    DataPoint dataPoint5 = (DataPoint) ORZ.LLFF(this.LJLJI);
                    this.LJLIL.lineTo(dataPoint5.x + O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), dataPoint5.y);
                    this.LJLIL.lineTo(dataPoint5.x + O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), getMeasuredHeight() + O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                    this.LJLIL.lineTo(0.0f, getMeasuredHeight() + O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                    Paint paint = new Paint();
                    paint.setStyle(Paint.Style.FILL);
                    paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getMeasuredHeight(), this.LJLJJI, 0, Shader.TileMode.CLAMP));
                    paint.setAlpha(127);
                    Paint paint2 = new Paint();
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(12.0f);
                    paint2.setColor(this.LJLJJI);
                    canvas.drawPath(this.LJLIL, paint);
                    canvas.drawPath(this.LJLIL, paint2);
                }
            } catch (Exception unused) {
            }
        }
        Bitmap bitmap = this.LJLLI;
        if (bitmap != null && canvas != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object next;
        float f;
        float f2;
        if (motionEvent == null) {
            return false;
        }
        Iterator it = ((ArrayList) this.LJLJI).iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                DataPoint dataPoint = (DataPoint) next;
                if (getLayoutDirection() == 1) {
                    f = this.LJLJLJ - dataPoint.x;
                } else {
                    f = dataPoint.x;
                }
                float abs = Math.abs(motionEvent.getX() - f);
                do {
                    Object next2 = it.next();
                    DataPoint dataPoint2 = (DataPoint) next2;
                    if (getLayoutDirection() == 1) {
                        f2 = this.LJLJLJ - dataPoint2.x;
                    } else {
                        f2 = dataPoint2.x;
                    }
                    float abs2 = Math.abs(motionEvent.getX() - f2);
                    if (Float.compare(abs, abs2) > 0) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
        }
        int LJZ = ORZ.LJZ(next, this.LJLJI);
        if (LJZ < 0 || LJZ >= ((ArrayList) this.LJLILLLLZI).size()) {
            return false;
        }
        float f3 = ((DataPoint) ListProtector.get(this.LJLILLLLZI, LJZ)).x / 1000.0f;
        if (next != null && !o.LJ(this.LJLLILLLL, next)) {
            C6M5 c6m5 = this.LJLLJ;
            if (c6m5 != null) {
                c6m5.LIZIZ(f3, ((DataPoint) ListProtector.get(this.LJLILLLLZI, LJZ)).y);
            }
            LIZ((int) f3);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                getParent().requestDisallowInterceptTouchEvent(false);
                C6M5 c6m52 = this.LJLLJ;
                if (c6m52 != null) {
                    c6m52.LIZ(f3);
                }
            }
        } else {
            getParent().requestDisallowInterceptTouchEvent(true);
            C6M5 c6m53 = this.LJLLJ;
            if (c6m53 != null) {
                c6m53.LIZJ();
            }
        }
        return true;
    }

    @Override // X.InterfaceC60822a6
    public void setOnPointSelectedListener(C6M5 listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLLJ = listener;
    }

    @Override // X.InterfaceC60822a6
    public void setPoints(List<DataPoint> points) {
        o.LJIIIZ(points, "points");
        ((ArrayList) this.LJLILLLLZI).clear();
        ((ArrayList) this.LJLILLLLZI).addAll(points);
        ((ArrayList) this.LJLJI).clear();
        if (!((ArrayList) this.LJLILLLLZI).isEmpty()) {
            float f = this.LJLJLJ;
            float f2 = 0.6f * f;
            float size = f / (((ArrayList) this.LJLILLLLZI).size() - 1);
            Iterator it = ((ArrayList) this.LJLILLLLZI).iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    float f3 = ((DataPoint) next).y;
                    do {
                        Object next2 = it.next();
                        float f4 = ((DataPoint) next2).y;
                        if (Float.compare(f3, f4) < 0) {
                            next = next2;
                            f3 = f4;
                        }
                    } while (it.hasNext());
                }
                float f5 = ((DataPoint) next).y;
                if (f5 != 0.0f) {
                    int size2 = ((ArrayList) this.LJLILLLLZI).size();
                    for (int i = 0; i < size2; i++) {
                        ((ArrayList) this.LJLJI).add(new DataPoint(i * size, (f2 - ((((DataPoint) ListProtector.get(this.LJLILLLLZI, i)).y / f5) * f2)) + this.LJLJLLL));
                    }
                }
            } else {
                throw new NoSuchElementException();
            }
        }
        invalidate();
    }

    public static DataPoint LIZIZ(DataPoint dataPoint, DataPoint dataPoint2) {
        return new DataPoint(dataPoint.x - dataPoint2.x, dataPoint.y - dataPoint2.y);
    }

    public static DataPoint LIZLLL(DataPoint dataPoint, float f) {
        return new DataPoint(dataPoint.x * f, dataPoint.y * f);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.LJLJLJ;
        setMeasuredDimension(i3, (int) ((i3 * 0.6d) + (this.LJLJLLL * 2)));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LJLLI == null) {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.LJLLI = createBitmap;
            this.LJLL.setBitmap(createBitmap);
        }
    }
}
