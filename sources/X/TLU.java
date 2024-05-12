package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TLU extends PagerAdapter {
    public final /* synthetic */ TLW LJLILLLLZI;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object obj) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(obj, "obj");
        return view == obj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LJLILLLLZI.LIZ).size();
    }

    public TLU(TLW tlw) {
        this.LJLILLLLZI = tlw;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup container) {
        o.LJIIIZ(container, "container");
        Object invoke = ((InterfaceC65784Pro) ((OSZ) ListProtector.get(this.LJLILLLLZI.LIZ, i)).getSecond()).invoke();
        container.addView((View) invoke);
        return invoke;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object obj) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(obj, "obj");
        Object obj2 = null;
        if (!(obj instanceof View)) {
            obj = null;
        }
        View view = (View) obj;
        if (view != null) {
            C16880lQ.LJLLL(view, container);
            if (!this.LJLILLLLZI.LJIIIIZZ) {
                Object tag = view.getTag(R.id.em_);
                if (tag instanceof InterfaceC74488TLg) {
                    obj2 = tag;
                }
                InterfaceC74488TLg interfaceC74488TLg = (InterfaceC74488TLg) obj2;
                if (interfaceC74488TLg != null) {
                    interfaceC74488TLg.destroy();
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIL(int i, ViewGroup container, Object obj) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(obj, "obj");
        if (this.LJLILLLLZI.LJI) {
            Object obj2 = null;
            if (!(obj instanceof View)) {
                obj = null;
            }
            View view = (View) obj;
            if (view != null) {
                Object tag = view.getTag(R.id.em_);
                if (tag instanceof TL0) {
                    obj2 = tag;
                }
                TL0 tl0 = (TL0) obj2;
                if (tl0 != null) {
                    tl0.LIZIZ();
                }
            }
        }
    }
}
