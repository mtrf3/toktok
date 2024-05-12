package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.VqU, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC80990VqU {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C80991VqV.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C80992VqW.LJLIL);

    public abstract void LIZIZ(LinearLayout linearLayout);

    public abstract void LIZLLL(long j, long j2, int i, long j3, int i2);

    public abstract long LJI(int i, long j, long j2, long j3);

    public long LJII(long j) {
        return j;
    }

    public abstract void LJIIJ(C80995VqZ c80995VqZ);

    public abstract long LJIIL(long j, int i, Object obj);

    public final Calendar LJIIIIZZ() {
        Object value = this.LIZ.getValue();
        o.LJIIIIZZ(value, "<get-calendar>(...)");
        return (Calendar) value;
    }

    public final Calendar LJIIIZ() {
        Object value = this.LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-calendar2>(...)");
        return (Calendar) value;
    }

    public static C80619VkV LIZ(LinearLayout parent) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "context");
        C80619VkV c80619VkV = new C80619VkV(context);
        C80896Voy c80896Voy = new C80896Voy(context, null, 6, 0);
        c80896Voy.addView(c80619VkV, new FrameLayout.LayoutParams(-2, -2));
        parent.addView(c80896Voy, new LinearLayout.LayoutParams(-2, -2));
        return c80619VkV;
    }

    public static void LIZJ(LinearLayout parent) {
        o.LJIIIZ(parent, "parent");
        View view = new View(parent.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 1);
        layoutParams.weight = 1.0f;
        parent.addView(view, layoutParams);
    }

    public static void LJ(List pickersInLayoutOrder, List list) {
        o.LJIIIZ(pickersInLayoutOrder, "pickersInLayoutOrder");
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(3, 3, Locale.getDefault());
        o.LJII(dateTimeInstance, "null cannot be cast to non-null type java.text.SimpleDateFormat");
        String pattern = ((SimpleDateFormat) dateTimeInstance).toPattern();
        List LLJILJILJ = ORZ.LLJILJILJ(pickersInLayoutOrder);
        o.LJIIIIZZ(pattern, "pattern");
        for (int i = 0; i < pattern.length(); i++) {
            char charAt = pattern.charAt(i);
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    OSZ osz = (OSZ) it.next();
                    if (((Boolean) ((InterfaceC88472Yns) osz.getFirst()).invoke(Character.valueOf(charAt))).booleanValue()) {
                        ((InterfaceC88472Yns) osz.getSecond()).invoke(ORS.LJJLJ(LLJILJILJ));
                        it.remove();
                        break;
                    }
                }
            }
            list.isEmpty();
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            OSZ osz2 = (OSZ) it2.next();
            ((InterfaceC88472Yns) osz2.getSecond()).invoke(ORS.LJJLJ(LLJILJILJ));
        }
    }

    public static OSZ LJIIJJI(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return new OSZ(new C40517FvF(i2, i3), Integer.valueOf(i4));
        }
        int i5 = ((i2 + 4) / 5) * 5;
        int i6 = (i3 / 5) * 5;
        if (i6 < i5) {
            i6 = i5;
        }
        int i7 = (i4 / 5) * 5;
        if (i7 < i5) {
            i7 = i5;
        }
        if (i7 > i6) {
            i7 = i6;
        }
        return new OSZ(C78842Uww.LJIL(new C40517FvF(i5, i6), 5), Integer.valueOf(i7));
    }

    public static long LJFF(Calendar calendar, long j, long j2, long j3, int i) {
        if (i == 0) {
            return j3;
        }
        if (i == 1) {
            calendar.setTimeInMillis(j3);
            int i2 = calendar.get(12);
            if (i2 % 5 != 0) {
                calendar.set(12, (i2 / 5) * 5);
                long timeInMillis = calendar.getTimeInMillis();
                if (j <= timeInMillis && timeInMillis <= j2) {
                    return timeInMillis;
                }
                calendar.add(12, 5);
                return calendar.getTimeInMillis();
            }
            return j3;
        }
        return j3;
    }
}
