package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Bc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C130725Bc extends C130715Bb {
    public final ActivityC45651qj LJIILJJIL;
    public final float LJIILL;
    public Integer LJIILLIIL;
    public final int LJIIZILJ;
    public final int LJIJ;
    public final int LJIJI;
    public int LJIJJ;
    public final ArrayList<PointF> LJIJJLI;
    public final ArrayList<PointF> LJIL;
    public final Paint LJJ;
    public final Path LJJI;
    public final C62822Ol8 LJJIFFI;
    public final ArrayList<PointF> LJJII;
    public final ArrayList<PointF> LJJIII;
    public final C62822Ol8 LJJIIJ;
    public final C62822Ol8 LJJIIJZLJL;

    public final boolean LJIIIIZZ() {
        return ((Boolean) this.LJJIIJZLJL.getValue()).booleanValue();
    }

    public final boolean LJIIIZ() {
        return ((Boolean) this.LJJIIJ.getValue()).booleanValue();
    }

    public int LJII() {
        if (LJIIIZ()) {
            if (C51H.LIZ().ov0()) {
                return C134845Qy.LIZ(10.0f);
            }
            return C134845Qy.LIZ(14.0f);
        }
        return C134845Qy.LIZ(20.0f);
    }

    public C130725Bc(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        this.LJIILJJIL = activity;
        this.LJIILL = 0.3f;
        Integer LJI = C79045V0n.LJI(R.attr.d9, activity);
        this.LJIILLIIL = LJI == null ? Integer.valueOf(AnonymousClass636.LJIIIIZZ(R.attr.d7, activity)) : LJI;
        this.LJIIZILJ = AnonymousClass636.LJIIIIZZ(R.attr.c6, activity);
        this.LJIJ = C134845Qy.LIZ(7.0f);
        this.LJIJI = C134845Qy.LIZ(2.0f);
        this.LJIJJ = C134845Qy.LIZ(11.0f);
        this.LJIJJLI = new ArrayList<>();
        this.LJIL = new ArrayList<>();
        this.LJJ = C6D8.LIZIZ(true);
        this.LJJI = new Path();
        this.LJJIFFI = C221108m2.LIZIZ(C130845Bo.LJLIL);
        this.LJJII = new ArrayList<>();
        this.LJJIII = new ArrayList<>();
        this.LJJIIJ = C221108m2.LIZIZ(C130765Bg.LJLIL);
        this.LJJIIJZLJL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1017));
    }

    public final void LJ(ArrayList arrayList, List list) {
        arrayList.clear();
        if (list.size() <= 1) {
            return;
        }
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            PointF pointF = (PointF) it.next();
            if (i == 0) {
                PointF pointF2 = (PointF) ListProtector.get(list, i2);
                float f = pointF.x;
                arrayList.add(new PointF(((pointF2.x - f) * this.LJIILL) + f, pointF.y));
            } else if (i == list.size() - 1) {
                PointF pointF3 = (PointF) ListProtector.get(list, i - 1);
                float f2 = pointF.x;
                arrayList.add(new PointF(f2 - ((f2 - pointF3.x) * this.LJIILL), pointF.y));
            } else {
                PointF pointF4 = (PointF) ListProtector.get(list, i - 1);
                PointF pointF5 = (PointF) ListProtector.get(list, i2);
                float f3 = pointF5.y - pointF4.y;
                float f4 = pointF5.x;
                float f5 = pointF4.x;
                float f6 = f3 / (f4 - f5);
                float f7 = pointF.y;
                float f8 = pointF.x;
                float f9 = f7 - (f6 * f8);
                float f10 = f8 - ((f8 - f5) * this.LJIILL);
                arrayList.add(new PointF(f10, (f6 * f10) + f9));
                float f11 = pointF.x;
                float f12 = ((pointF5.x - f11) * this.LJIILL) + f11;
                arrayList.add(new PointF(f12, (f6 * f12) + f9));
            }
            i = i2;
        }
    }

    public float LJFF(float f, long j, float f2, C5BH audioType) {
        float f3;
        o.LJIIIZ(audioType, "audioType");
        if (LJIIIIZZ()) {
            return f - (((((float) j) * f2) - this.LJFF) / this.LJII);
        }
        float f4 = ((float) j) * f2;
        if (audioType == C5BH.TEXT_TO_SPEECH) {
            f3 = this.LJFF;
        } else {
            f3 = this.LJ;
        }
        return (f4 - f3) / this.LJII;
    }

    public static void LJI(Path path, float f, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        float f2 = f;
        path.reset();
        if (z) {
            f2--;
        }
        PointF pointF = (PointF) ORZ.LJLLJ(arrayList);
        path.moveTo(pointF.x, f2);
        path.lineTo(pointF.x, pointF.y);
        C40511Fv9 LJIL = C78842Uww.LJIL(C78842Uww.LJJ(0, (arrayList.size() * 2) - 2), 2);
        int i = LJIL.LJLIL;
        int i2 = LJIL.LJLILLLLZI;
        int i3 = LJIL.LJLJI;
        if (i3 <= 0 ? !(i3 >= 0 || i2 > i) : i <= i2) {
            while (true) {
                Object obj = ListProtector.get(arrayList2, i);
                o.LJIIIIZZ(obj, "controlPointList[i]");
                PointF pointF2 = (PointF) obj;
                Object obj2 = ListProtector.get(arrayList2, i + 1);
                o.LJIIIIZZ(obj2, "controlPointList[i + 1]");
                PointF pointF3 = (PointF) obj2;
                Object obj3 = ListProtector.get(arrayList, (i / 2) + 1);
                o.LJIIIIZZ(obj3, "valuePointList[i / 2 + 1]");
                PointF pointF4 = (PointF) obj3;
                path.cubicTo(pointF2.x, pointF2.y, pointF3.x, pointF3.y, pointF4.x, pointF4.y);
                if (i == i2) {
                    break;
                } else {
                    i += i3;
                }
            }
        }
        PointF pointF5 = (PointF) ORZ.LLFF(arrayList);
        path.lineTo(pointF5.x, f2);
        path.lineTo(pointF.x, f2);
        path.setLastPoint(pointF5.x, f2);
    }

    @Override // X.C130715Bb, X.C5BJ
    public void LIZJ(Canvas canvas, RectF rect, List<Integer> stickPointList, float f, float f2) {
        float f3;
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(rect, "rect");
        o.LJIIIZ(stickPointList, "stickPointList");
        this.LJJ.setStyle(Paint.Style.FILL);
        this.LJJ.setColor(this.LJIIZILJ);
        ArrayList arrayList = new ArrayList(C32I.LJJL(stickPointList, 10));
        Iterator<Integer> it = stickPointList.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((this.LJIIIIZZ - this.LJIIIZ) + it.next().intValue()) * f));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            float floatValue = ((Number) it2.next()).floatValue();
            if (this.LJII != 0.0f) {
                if (LJIIIIZZ()) {
                    f3 = f2 - ((floatValue - this.LJFF) / this.LJII);
                } else {
                    f3 = (floatValue - this.LJI) / this.LJII;
                }
                canvas.drawCircle(f3, rect.bottom - this.LJIJ, this.LJIJI, this.LJJ);
            }
        }
    }

    @Override // X.C130715Bb, X.C5BJ
    public final void LIZIZ(Canvas canvas, RectF rect, List<OSZ<Long, Float>> wavePoints, float f, Rect clipCanvasBounds, C5BH audioType, float f2) {
        Object next;
        float f3;
        float f4;
        int LJIIIIZZ;
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(rect, "rect");
        o.LJIIIZ(wavePoints, "wavePoints");
        o.LJIIIZ(clipCanvasBounds, "clipCanvasBounds");
        o.LJIIIZ(audioType, "audioType");
        int i = C5BP.LIZ[audioType.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i == 4) {
                    this.LJIJJ = LJII();
                    if (LJIIIZ()) {
                        this.LJIILLIIL = C79045V0n.LJI(R.attr.ab3, this.LJIILJJIL);
                    }
                }
            } else {
                this.LJIJJ = LJII();
                if (LJIIIZ()) {
                    this.LJIILLIIL = C79045V0n.LJI(R.attr.aaz, this.LJIILJJIL);
                }
            }
        } else {
            this.LJIJJ = LJII();
            if (LJIIIZ()) {
                this.LJIILLIIL = C79045V0n.LJI(R.attr.aaw, this.LJIILJJIL);
            }
        }
        ArrayList arrayList = (ArrayList) wavePoints;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                float floatValue = ((Number) ((OSZ) next).getSecond()).floatValue();
                do {
                    Object next2 = it.next();
                    float floatValue2 = ((Number) ((OSZ) next2).getSecond()).floatValue();
                    if (Float.compare(floatValue, floatValue2) < 0) {
                        next = next2;
                        floatValue = floatValue2;
                    }
                } while (it.hasNext());
            }
        }
        OSZ osz = (OSZ) next;
        if (osz != null && ((Number) osz.getSecond()).floatValue() > 1.0f) {
            f3 = ((Number) osz.getSecond()).floatValue();
        } else {
            f3 = 1.0f;
        }
        float f5 = (33 * f) / this.LJII;
        float f6 = rect.left - f5;
        float f7 = rect.right + f5;
        this.LJIJJLI.clear();
        this.LJJII.clear();
        float f8 = rect.top;
        if (LJIIIZ()) {
            f4 = (rect.bottom - f8) / 2;
        } else {
            f4 = rect.bottom - f8;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            OSZ osz2 = (OSZ) it2.next();
            long longValue = ((Number) osz2.getFirst()).longValue();
            float floatValue3 = ((Number) osz2.getSecond()).floatValue();
            float LJFF = LJFF(f2, longValue, f, audioType);
            float f9 = floatValue3 / f3;
            float min = (f4 - f8) - (Math.min(f9, 1.0f) * this.LJIJJ);
            float min2 = (Math.min(f9, 1.0f) * this.LJIJJ) + f4;
            if (f6 <= LJFF && LJFF <= f7) {
                this.LJIJJLI.add(new PointF(LJFF, min));
                if (LJIIIZ()) {
                    this.LJJII.add(new PointF(LJFF, min2));
                }
            }
        }
        if (this.LJIJJLI.isEmpty()) {
            return;
        }
        LJ(this.LJIL, this.LJIJJLI);
        LJI(this.LJJI, f4, this.LJIJJLI, this.LJIL, false);
        if (LJIIIZ()) {
            LJ(this.LJJIII, this.LJJII);
            LJI((Path) this.LJJIFFI.getValue(), f4, this.LJJII, this.LJJIII, true);
        }
        Paint paint = this.LJJ;
        paint.setAlpha(255);
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(null);
        Integer num = this.LJIILLIIL;
        if (num != null) {
            LJIIIIZZ = num.intValue();
        } else {
            LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.d7, this.LJIILJJIL);
        }
        paint.setColor(LJIIIIZZ);
        canvas.drawPath(this.LJJI, this.LJJ);
        if (LJIIIZ()) {
            canvas.drawPath((Path) this.LJJIFFI.getValue(), this.LJJ);
        }
    }
}
