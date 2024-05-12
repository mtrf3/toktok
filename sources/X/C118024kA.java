package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4kA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118024kA extends PagerAdapter {
    public List<C29701Eo> LJLILLLLZI = new ArrayList();

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLILLLLZI.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup container) {
        o.LJIIIZ(container, "container");
        View view = (View) ListProtector.get(this.LJLILLLLZI, i);
        container.addView(view);
        return view;
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
        C16880lQ.LJLLL((View) ListProtector.get(this.LJLILLLLZI, i), container);
    }
}
