package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.3G6, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3G6 implements InterfaceC224288rA {
    public static final List<Float> LJLIL = C47261Igj.LJJIJIL(Float.valueOf(0.15f), Float.valueOf(0.12f), Float.valueOf(0.1f), Float.valueOf(0.08f), Float.valueOf(0.06f), Float.valueOf(0.04f), Float.valueOf(0.02f));
    public static final java.util.Map<String, Float> LJLILLLLZI = new LinkedHashMap();

    @Override // X.InterfaceC224288rA
    public void LIZJ(ImageView coverView) {
        o.LJIIIZ(coverView, "coverView");
    }

    public abstract boolean LJII(C3G7 c3g7);

    public static C3G7 LJFF(C3G7 param) {
        o.LJIIIZ(param, "param");
        int i = param.LJLIL;
        int i2 = param.LJLILLLLZI;
        if (i <= 0 || i2 <= 0) {
            return param;
        }
        double d = i / i2;
        int i3 = param.LJLJI;
        int i4 = param.LJLJJI;
        if (i3 <= 0 || i4 <= 0) {
            return param;
        }
        if (d > i3 / i4) {
            i4 = (i3 * i2) / i;
        } else {
            i3 = (i4 * i) / i2;
        }
        return new C3G7(i, i2, i3, i4);
    }

    public static float LJI(C3G7 param) {
        int i;
        o.LJIIIZ(param, "param");
        C3G7 LJFF = LJFF(param);
        if (param.LJLJI <= 0 || (i = param.LJLJJI) <= 0) {
            return 1.0f;
        }
        return (LJFF.LJLJI * LJFF.LJLJJI) / (r3 * i);
    }

    @Override // X.InterfaceC224288rA
    public final void LIZIZ(ViewGroup viewGroup, C3G4 listener) {
        o.LJIIIZ(listener, "listener");
        Context context = viewGroup.getContext();
        o.LJIIIIZZ(context, "container.context");
        C3G5 c3g5 = new C3G5(context);
        Iterator it = ((ArrayList) c3g5.LJLIL).iterator();
        while (true) {
            if (it.hasNext()) {
                if (o.LJ(((Reference) it.next()).get(), listener)) {
                    break;
                }
            } else {
                ((ArrayList) c3g5.LJLIL).add(new WeakReference(listener));
                break;
            }
        }
        viewGroup.addView(c3g5, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // X.InterfaceC224288rA
    public final void LJ(String str, C3G7 c3g7) {
        int i;
        Float f;
        float f2;
        if (LJII(c3g7) && str != null) {
            java.util.Map<String, Float> map = LJLILLLLZI;
            if (!map.containsKey(str)) {
                float LJI = LJI(c3g7);
                if (LJI < 1.0f && LJI >= 0.8d) {
                    map.put(str, Float.valueOf(1 - LJI));
                }
            }
            if (map.size() >= 100) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                    Iterator<Float> it = LJLIL.iterator();
                    while (true) {
                        i = 0;
                        if (it.hasNext()) {
                            f = it.next();
                            if (((Number) entry.getValue()).floatValue() >= f.floatValue()) {
                                break;
                            }
                        } else {
                            f = null;
                            break;
                        }
                    }
                    Float f3 = f;
                    if (f3 != null) {
                        f2 = f3.floatValue();
                    } else {
                        f2 = 0.0f;
                    }
                    Integer num = (Integer) linkedHashMap.get(Float.valueOf(f2));
                    if (num != null) {
                        i = num.intValue();
                    }
                    linkedHashMap.put(Float.valueOf(f2), Integer.valueOf(i + 1));
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    C188727au c188727au = new C188727au();
                    c188727au.LIZIZ(((Number) entry2.getKey()).floatValue(), "black_border_ratio_scope");
                    c188727au.LIZLLL(((Number) entry2.getValue()).intValue(), "frequency");
                    FMX.LJIIL("tablet_feed_resize_info", c188727au.LIZ);
                }
                ((LinkedHashMap) LJLILLLLZI).clear();
            }
        }
    }
}
