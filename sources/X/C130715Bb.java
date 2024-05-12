package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5Bb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C130715Bb implements C5BJ {
    public static final int LJIIJ = ColorProtector.parseColor("#11862F");
    public static final int LJIIJJI = ColorProtector.parseColor("#ECC66B");
    public static final int LJIIL = ColorProtector.parseColor("#ED8ACE");
    public static final int LJIILIIL;
    public final Paint LIZ;
    public final Path LIZIZ;
    public final int LIZJ;
    public final float LIZLLL;
    public float LJ;
    public float LJFF;
    public float LJI;
    public float LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;

    static {
        C04330Ez.LIZIZ(C58S.LIZ(), R.color.ee);
        LJIILIIL = ColorProtector.parseColor("#FACE15");
    }

    public C130715Bb() {
        Paint paint = new Paint();
        paint.setStrokeWidth(C134845Qy.LIZ(1.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        this.LIZ = paint;
        this.LIZIZ = new Path();
        this.LIZJ = C134845Qy.LIZ(13.0f);
        this.LIZLLL = C134845Qy.LIZ(1.5f);
        this.LJII = 1.0f;
    }

    @Override // X.C5BJ
    public final void LIZ(float f, float f2, float f3) {
        this.LJ = f;
        this.LJFF = f2;
        this.LJII = f3;
    }

    @Override // X.C5BJ
    public final void LIZLLL(float f, int i, int i2) {
        this.LJI = f;
        this.LJIIIIZZ = i;
        this.LJIIIZ = i2;
    }

    @Override // X.C5BJ
    public void LIZJ(Canvas canvas, RectF rect, List<Integer> stickPointList, float f, float f2) {
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(rect, "rect");
        o.LJIIIZ(stickPointList, "stickPointList");
        this.LIZ.setColor(LJIILIIL);
        ArrayList arrayList = new ArrayList(C32I.LJJL(stickPointList, 10));
        Iterator<Integer> it = stickPointList.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(it.next().intValue() * f));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            float floatValue = (((Number) it2.next()).floatValue() - this.LJI) / this.LJII;
            if (floatValue >= rect.left && floatValue <= rect.right) {
                float height = rect.height() - (this.LIZLLL * 3);
                float height2 = rect.height();
                float f3 = this.LIZLLL;
                canvas.drawCircle(floatValue, ((height2 - f3) - height) / 2, f3, this.LIZ);
            }
        }
    }

    @Override // X.C5BJ
    public void LIZIZ(Canvas canvas, RectF rect, List<OSZ<Long, Float>> wavePoints, float f, Rect clipCanvasBounds, C5BH audioType, float f2) {
        int i;
        int i2;
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(rect, "rect");
        o.LJIIIZ(wavePoints, "wavePoints");
        o.LJIIIZ(clipCanvasBounds, "clipCanvasBounds");
        o.LJIIIZ(audioType, "audioType");
        ArrayList arrayList = (ArrayList) wavePoints;
        if (arrayList.isEmpty()) {
            return;
        }
        float f3 = (33 * f) / this.LJII;
        float f4 = rect.left - f3;
        float f5 = rect.right + f3;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            OSZ osz = (OSZ) it.next();
            float floatValue = ((((Number) osz.getFirst()).floatValue() * f) - this.LJ) / this.LJII;
            float max = Math.max(((Number) osz.getSecond()).floatValue() * this.LIZJ, 0.5f);
            if (f4 <= floatValue && floatValue <= f5) {
                arrayList2.add(new OSZ(Float.valueOf(floatValue), Float.valueOf(max)));
            }
        }
        Paint paint = this.LIZ;
        int i3 = C130705Ba.LIZ[audioType.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                i2 = LJIIJJI;
            } else {
                i2 = LJIIL;
            }
        } else {
            i2 = LJIIJ;
        }
        paint.setColor(i2);
        this.LIZIZ.reset();
        float centerY = rect.centerY();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            int i4 = i + 1;
            if (i >= 0) {
                OSZ osz2 = (OSZ) next;
                if (i == 0) {
                    this.LIZIZ.moveTo(((Number) osz2.getFirst()).floatValue(), centerY - ((Number) osz2.getSecond()).floatValue());
                } else {
                    this.LIZIZ.moveTo(((Number) osz2.getFirst()).floatValue(), centerY - ((Number) osz2.getSecond()).floatValue());
                    this.LIZIZ.lineTo(((Number) osz2.getFirst()).floatValue(), ((Number) osz2.getSecond()).floatValue() + centerY);
                }
                i = i4;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        canvas.drawPath(this.LIZIZ, this.LIZ);
        this.LIZIZ.reset();
    }
}
