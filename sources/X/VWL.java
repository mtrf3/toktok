package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class VWL extends ViewPager {
    public boolean LJLIL;

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent arg0) {
        o.LJIIIZ(arg0, "arg0");
        if (!this.LJLIL && super.onInterceptTouchEvent(arg0)) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent arg0) {
        o.LJIIIZ(arg0, "arg0");
        try {
            if (this.LJLIL) {
                return false;
            }
            if (!super.onTouchEvent(arg0)) {
                return false;
            }
            return true;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("cur_item:");
            sb.append(getCurrentItem());
            if (getAdapter() != null) {
                sb.append(", count:");
                PagerAdapter adapter = getAdapter();
                o.LJI(adapter);
                sb.append(adapter.getCount());
            }
            H78.LIZJ(sb.toString());
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        super.setCurrentItem(i, false);
    }

    public final void setNoScroll(boolean z) {
        this.LJLIL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VWL(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
        o.LJI(context);
        this.LJLIL = true;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void setCurrentItem(int i, boolean z) {
        super.setCurrentItem(i, z);
    }
}
