package X;

import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.BdY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class RunnableC29228BdY implements Runnable {
    public final ViewPager LJLIL;

    public final void LIZ() {
        if (CCJ.LIZ(C15380j0.LIZLLL())) {
            ViewPager viewPager = this.LJLIL;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
            return;
        }
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mFirstLayout");
            declaredField.setAccessible(true);
            declaredField.set(this.LJLIL, Boolean.FALSE);
            declaredField.setAccessible(false);
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Method declaredMethod = ViewPager.class.getDeclaredMethod("setCurrentItemInternal", cls, cls2, cls2, cls);
            declaredMethod.setAccessible(true);
            ViewPager viewPager2 = this.LJLIL;
            Boolean bool = Boolean.TRUE;
            declaredMethod.invoke(viewPager2, Integer.valueOf(viewPager2.getCurrentItem() + 1), bool, bool, 1);
            declaredMethod.setAccessible(false);
        } catch (Exception unused) {
            ViewPager viewPager3 = this.LJLIL;
            viewPager3.setCurrentItem(viewPager3.getCurrentItem() + 1);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC29228BdY(ViewPager viewPager) {
        this.LJLIL = viewPager;
    }
}
