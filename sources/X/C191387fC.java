package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7fC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191387fC {
    public static void LIZ(Context context, C8DU iMap, C191427fG latLon, final Double d, final Double d2, final Double d3, final Double d4, Double d5, List list, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro) {
        final Integer num;
        Object LIZ;
        o.LJIIIZ(iMap, "iMap");
        o.LJIIIZ(latLon, "latLon");
        if (context == null) {
            return;
        }
        iMap.LJJJJLL();
        InterfaceC191407fE[] interfaceC191407fEArr = new InterfaceC191407fE[2];
        interfaceC191407fEArr[0] = new InterfaceC191407fE(d, d2, d3, d4) { // from class: X.7fF
            public final Double LIZ;
            public final Double LIZIZ;
            public final Double LIZJ;
            public final Double LIZLLL;

            @Override // X.InterfaceC191407fE
            public final boolean LIZ(C191427fG latLon2, C8DU iMap2) {
                o.LJIIIZ(latLon2, "latLon");
                o.LJIIIZ(iMap2, "iMap");
                Double d6 = this.LIZ;
                if (d6 != null) {
                    double doubleValue = d6.doubleValue();
                    Double d7 = this.LIZIZ;
                    if (d7 != null) {
                        double doubleValue2 = d7.doubleValue();
                        Double d8 = this.LIZJ;
                        if (d8 != null) {
                            double doubleValue3 = d8.doubleValue();
                            Double d9 = this.LIZLLL;
                            if (d9 != null) {
                                double doubleValue4 = d9.doubleValue();
                                if (doubleValue == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && doubleValue2 == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && doubleValue3 == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && doubleValue4 == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                                    return false;
                                }
                                OSZ osz = new OSZ(Double.valueOf(latLon2.getLat()), Double.valueOf(latLon2.getLon()));
                                double doubleValue5 = ((Number) osz.getFirst()).doubleValue();
                                double doubleValue6 = ((Number) osz.getSecond()).doubleValue();
                                double max = Math.max(Math.abs(doubleValue6 - doubleValue4), Math.abs(doubleValue6 - doubleValue3));
                                double max2 = Math.max(Math.abs(doubleValue5 - doubleValue2), Math.abs(doubleValue5 - doubleValue));
                                OSZ osz2 = new OSZ(Double.valueOf(doubleValue5 + max2), Double.valueOf(doubleValue6 - max));
                                double doubleValue7 = ((Number) osz2.getFirst()).doubleValue();
                                double doubleValue8 = ((Number) osz2.getSecond()).doubleValue();
                                OSZ osz3 = new OSZ(Double.valueOf(doubleValue5 - max2), Double.valueOf(doubleValue6 + max));
                                iMap2.LJJJJ(new C191427fG(doubleValue7, doubleValue8), new C191427fG(((Number) osz3.getFirst()).doubleValue(), ((Number) osz3.getSecond()).doubleValue()), null);
                                return true;
                            }
                        }
                    }
                }
                return false;
            }

            {
                this.LIZ = d;
                this.LIZIZ = d2;
                this.LIZJ = d3;
                this.LIZLLL = d4;
            }
        };
        if (d5 != null) {
            num = Integer.valueOf((int) d5.doubleValue());
        } else {
            num = null;
        }
        interfaceC191407fEArr[1] = new InterfaceC191407fE(num) { // from class: X.7fD
            public final Integer LIZ;

            {
                this.LIZ = num;
            }

            @Override // X.InterfaceC191407fE
            public final boolean LIZ(C191427fG latLon2, C8DU iMap2) {
                o.LJIIIZ(latLon2, "latLon");
                o.LJIIIZ(iMap2, "iMap");
                if (this.LIZ != null) {
                    iMap2.LJJJ(latLon2, Float.valueOf(r0.intValue()), null);
                    return true;
                }
                return false;
            }
        };
        List LJJIJIIJI = C47261Igj.LJJIJIIJI(interfaceC191407fEArr);
        float LIZIZ = C7MY.LIZIZ(44);
        float LIZIZ2 = C7MY.LIZIZ(44);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_color_map_pin;
        int i = (int) LIZIZ;
        c2068389v.LIZIZ = i;
        c2068389v.LIZJ = i;
        SY9 LIZ2 = c2068389v.LIZ(context);
        try {
            LIZ = Bitmap.createBitmap(LIZ2.LIZIZ(), LIZ2.LIZ(), Bitmap.Config.ARGB_8888);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        Bitmap bitmap = (Bitmap) LIZ;
        if (bitmap != null) {
            Canvas canvas = new Canvas(bitmap);
            LIZ2.setBounds(0, 0, i, (int) LIZIZ2);
            LIZ2.draw(canvas);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C191427fG c191427fG = (C191427fG) it.next();
                    C199627sU c199627sU = new C199627sU();
                    c199627sU.LIZ = bitmap;
                    iMap.LJJJJJ(c191427fG, c199627sU);
                }
            }
        }
        Iterator it2 = LJJIJIIJI.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((InterfaceC191407fE) next).LIZ(latLon, iMap)) {
                if (next != null) {
                    interfaceC88472Yns.invoke(next);
                    return;
                }
            }
        }
        interfaceC65784Pro.invoke();
    }
}
