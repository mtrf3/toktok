package X;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Field;

/* loaded from: classes15.dex */
public final class VWM {
    public static final Field LIZ;

    static {
        try {
            Field declaredField = ViewPager.LayoutParams.class.getDeclaredField("position");
            LIZ = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    public static View LIZ(ViewPager viewPager) {
        int i = 0;
        if (viewPager != null && (viewPager instanceof VW3)) {
            VW3 vw3 = (VW3) viewPager;
            int currentItem = viewPager.getCurrentItem();
            while (i < viewPager.getChildCount()) {
                View childAt = viewPager.getChildAt(i);
                ViewPager.LayoutParams layoutParams = (ViewPager.LayoutParams) childAt.getLayoutParams();
                try {
                    int intValue = ((Integer) LIZ.get(layoutParams)).intValue();
                    if (vw3.LIZJ()) {
                        intValue = (vw3.getItemCount() - intValue) - 1;
                    }
                    if (!layoutParams.LIZ && currentItem == intValue) {
                        return childAt;
                    }
                    i++;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
            return null;
        }
        if (viewPager == null) {
            return null;
        }
        int currentItem2 = viewPager.getCurrentItem();
        while (i < viewPager.getChildCount()) {
            View childAt2 = viewPager.getChildAt(i);
            ViewPager.LayoutParams layoutParams2 = (ViewPager.LayoutParams) childAt2.getLayoutParams();
            try {
                int intValue2 = ((Integer) LIZ.get(layoutParams2)).intValue();
                if (!layoutParams2.LIZ && currentItem2 == intValue2) {
                    return childAt2;
                }
                i++;
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }
        return null;
    }
}
