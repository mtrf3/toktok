package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.YBv, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86983YBv {
    public static int LIZ(String str) {
        Integer num;
        java.util.Map<String, Integer> map = C86982YBu.LJLJJLL;
        if (map == null || (num = (Integer) ((LinkedHashMap) map).get(str)) == null) {
            int i = C86982YBu.LJLJL;
            C86982YBu.LJLJL = i + 1;
            java.util.Map<String, Integer> map2 = C86982YBu.LJLJJLL;
            if (map2 != null) {
                map2.put(str, Integer.valueOf(i));
                return i;
            }
            return i;
        }
        return num.intValue();
    }

    public static boolean LIZIZ(Context context) {
        boolean z;
        if (C86982YBu.LJLJJL == null && context != null) {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            C86982YBu.LJLJJL = Boolean.valueOf(z);
        }
        return o.LJ(C86982YBu.LJLJJL, Boolean.TRUE);
    }

    public static boolean LIZLLL(C86980YBs c86980YBs) {
        if (c86980YBs != null) {
            for (Object obj : c86980YBs.LIZ) {
                if ((obj instanceof C86975YBn) && ((C86975YBn) obj).LIZ != 0) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean LIZJ(C86982YBu fl, View view, C86981YBt c86981YBt, int i, int i2) {
        int childMeasureSpec;
        int childMeasureSpec2;
        o.LJIIIZ(fl, "fl");
        if (i == -5) {
            float LJFF = c86981YBt.LJFF();
            if (LJFF == LJFF) {
                i = Math.round(LJFF);
            } else {
                if (!LIZLLL(c86981YBt.LJI) || !LIZLLL(c86981YBt.LIZ) || !LIZLLL(c86981YBt.LIZIZ) || !LIZLLL(c86981YBt.LJ)) {
                    return false;
                }
                i = -2;
            }
        }
        if (i2 == -5) {
            float LIZIZ = c86981YBt.LIZIZ();
            if (LIZIZ == LIZIZ) {
                i2 = Math.round(LIZIZ);
            } else {
                if (!LIZLLL(c86981YBt.LJII) || !LIZLLL(c86981YBt.LIZJ) || !LIZLLL(c86981YBt.LIZLLL) || !LIZLLL(c86981YBt.LJFF)) {
                    return false;
                }
                i2 = -2;
            }
        }
        if (fl.getMyWidth() == -1) {
            childMeasureSpec = ViewGroup.getChildMeasureSpec(fl.getMyWidthMeasureSpec(), fl.getPaddingRight() + fl.getPaddingLeft(), i);
        } else {
            childMeasureSpec = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(fl.getMyWidth(), 1073741824), 0, i);
        }
        if (fl.getMyHeight() == -1) {
            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(fl.getMyHeightMeasureSpec(), fl.getPaddingBottom() + fl.getPaddingTop(), i2);
        } else {
            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(fl.getMyHeight(), 1073741824), 0, i2);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
        c86981YBt.LJIILLIIL = view.getMeasuredWidth();
        c86981YBt.LJIIZILJ = view.getMeasuredHeight();
        return true;
    }
}
