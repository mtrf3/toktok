package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import kotlin.jvm.internal.o;

/* renamed from: X.UhJ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77873UhJ {
    public static C77798Ug6 LIZ(Context context) {
        Object LIZ;
        o.LJIIJ(context, "context");
        C77798Ug6 c77798Ug6 = new C77798Ug6(context, null);
        c77798Ug6.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        c77798Ug6.setTabMode(0);
        c77798Ug6.setSelectedTabIndicator(R.drawable.bqf);
        c77798Ug6.setSelectedTabIndicatorHeight(-1);
        c77798Ug6.setBackgroundResource(R.drawable.bqg);
        c77798Ug6.getBackground().mutate();
        Drawable tabSelectedIndicator = c77798Ug6.getTabSelectedIndicator();
        if (tabSelectedIndicator != null) {
            tabSelectedIndicator.mutate();
        }
        try {
            Field declaredField = C80261Vej.class.getDeclaredField("tabPaddingStart");
            o.LJFF(declaredField, "TabLayout::class.java.ge…dField(\"tabPaddingStart\")");
            declaredField.setAccessible(true);
            declaredField.set(c77798Ug6, 0);
            Field declaredField2 = C80261Vej.class.getDeclaredField("tabPaddingEnd");
            o.LJFF(declaredField2, "TabLayout::class.java.ge…redField(\"tabPaddingEnd\")");
            declaredField2.setAccessible(true);
            declaredField2.set(c77798Ug6, 0);
            Field declaredField3 = C80261Vej.class.getDeclaredField("tabPaddingTop");
            o.LJFF(declaredField3, "TabLayout::class.java.ge…redField(\"tabPaddingTop\")");
            declaredField3.setAccessible(true);
            declaredField3.set(c77798Ug6, 0);
            Field declaredField4 = C80261Vej.class.getDeclaredField("tabPaddingBottom");
            o.LJFF(declaredField4, "TabLayout::class.java.ge…Field(\"tabPaddingBottom\")");
            declaredField4.setAccessible(true);
            declaredField4.set(c77798Ug6, 0);
            Field declaredField5 = C80261Vej.class.getDeclaredField("requestedTabMinWidth");
            o.LJFF(declaredField5, "TabLayout::class.java.ge…d(\"requestedTabMinWidth\")");
            declaredField5.setAccessible(true);
            declaredField5.set(c77798Ug6, 0);
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
        return c77798Ug6;
    }
}
