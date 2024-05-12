package X;

import Y.IDObjectS0S0101000;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.RelativeLayout;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.959, reason: invalid class name */
/* loaded from: classes5.dex */
public final class AnonymousClass959 {
    public static final java.util.Map<Integer, Integer> LIZ = new LinkedHashMap();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(AnonymousClass923.LJLIL);

    public static long LIZJ() {
        return ((Number) LIZIZ.getValue()).longValue();
    }

    public static java.util.Set LIZIZ(boolean z) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(Integer.valueOf(R.id.n4p));
        linkedHashSet.add(Integer.valueOf(R.id.epy));
        if (!z) {
            linkedHashSet.add(Integer.valueOf(R.id.alo));
        }
        linkedHashSet.add(Integer.valueOf(R.id.hqv));
        linkedHashSet.add(Integer.valueOf(R.id.hop));
        linkedHashSet.add(Integer.valueOf(R.id.k5d));
        linkedHashSet.add(Integer.valueOf(R.id.rw));
        return linkedHashSet;
    }

    public static void LIZLLL(boolean z, View view, boolean z2) {
        if (view != null) {
            if (z) {
                view.setVisibility(8);
                view.setAlpha(0.0f);
                return;
            }
            view.setAlpha(0.0f);
            view.setVisibility(0);
            if (z2) {
                C09K.LIZ(view, 1.0f, 300L).setStartDelay(200L).start();
            } else {
                view.setAlpha(1.0f);
            }
        }
    }

    public static void LIZ(View view, boolean z, boolean z2, java.util.Set set) {
        long j;
        double d;
        int id = view.getId();
        int i = 0;
        if (id == R.id.n4p || id == R.id.alo) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                if (z) {
                    d = 12.0d;
                } else {
                    d = 8.0d;
                }
                layoutParams2.bottomMargin = C17N.LJIILL(d);
            }
            view.setLayoutParams(layoutParams);
            Object tag = view.getTag(C8QI.LJII);
            Object obj = null;
            if (!(tag instanceof Boolean)) {
                tag = null;
            }
            if (view.getId() == R.id.alo && (view instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) view;
                C115524g8 c115524g8 = new C115524g8(OJ4.LJJJJI(C78924UyG.LIZLLL(viewGroup), new AqS169S0100000_3(set, (java.util.Set<Integer>) 624)));
                while (true) {
                    int i2 = 4;
                    if (!c115524g8.hasNext()) {
                        break;
                    }
                    View view2 = (View) c115524g8.next();
                    if (!z) {
                        i2 = 0;
                    }
                    view2.setVisibility(i2);
                }
                Iterator<View> it = C78924UyG.LIZLLL(viewGroup).iterator();
                while (true) {
                    IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
                    if (!iDObjectS0S0101000.hasNext()) {
                        break;
                    }
                    Object next = iDObjectS0S0101000.next();
                    if (((View) next).getId() == R.id.k5d) {
                        obj = next;
                        break;
                    }
                }
                View view3 = (View) obj;
                if (view3 != null && o.LJ(tag, Boolean.FALSE)) {
                    if (z) {
                        i = 4;
                    }
                    view3.setVisibility(i);
                    return;
                }
                return;
            }
            if (view.getId() == R.id.n4p && o.LJ(tag, Boolean.FALSE)) {
                if (z) {
                    LIZ.put(Integer.valueOf(view.getId()), Integer.valueOf(view.getVisibility()));
                    view.setVisibility(8);
                    view.setAlpha(0.0f);
                    return;
                }
                Integer num = (Integer) ((LinkedHashMap) LIZ).get(Integer.valueOf(view.getId()));
                if (num != null) {
                    i = num.intValue();
                }
                view.setVisibility(i);
                ViewPropertyAnimator duration = view.animate().alpha(1.0f).setDuration(300L);
                if (z2) {
                    j = 200;
                } else {
                    j = 0;
                }
                duration.setStartDelay(j).start();
                return;
            }
            return;
        }
        if (id != R.id.hop || view.getVisibility() != 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if (layoutParams3 instanceof RelativeLayout.LayoutParams) {
            if (z) {
                ((RelativeLayout.LayoutParams) layoutParams3).addRule(12);
            } else {
                ((RelativeLayout.LayoutParams) layoutParams3).removeRule(12);
            }
        }
        view.setLayoutParams(layoutParams3);
    }
}
