package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1Q3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Q3 extends PagerAdapter {
    public final List<? extends View> LJLILLLLZI;
    public String[] LJLJI;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLILLLLZI.size();
    }

    public C1Q3(List<? extends View> list) {
        this.LJLILLLLZI = list;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        String[] strArr = this.LJLJI;
        if (strArr != null) {
            return strArr[i];
        }
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup container) {
        o.LJIIIZ(container, "container");
        container.addView((View) ListProtector.get(this.LJLILLLLZI, i));
        return ListProtector.get(this.LJLILLLLZI, i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object object) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(object, "object");
        return o.LJ(view, object);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object object) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(object, "object");
        C16880lQ.LLIFFJFJJ(i, container);
    }
}
