package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import kotlin.jvm.internal.o;

/* renamed from: X.Vmz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80773Vmz extends PagerAdapter {
    public boolean LJLILLLLZI;
    public final PagerAdapter LJLJI;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLJI.getCount();
    }

    public C80773Vmz(PagerAdapter mDelegete) {
        o.LJIIJ(mDelegete, "mDelegete");
        this.LJLJI = mDelegete;
        mDelegete.LJIJ(new C80266Veo(this));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIIL(Object object) {
        o.LJIIJ(object, "object");
        int LJIIL = this.LJLJI.LJIIL(object);
        if (this.LJLILLLLZI) {
            if (LJIIL == -1 || LJIIL == -2) {
                return -2;
            }
            return (getCount() - LJIIL) - 1;
        }
        return LJIIL;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        if (this.LJLILLLLZI) {
            i = (getCount() - i) - 1;
        }
        return this.LJLJI.LJIILIIL(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final float LJIILJJIL(int i) {
        if (this.LJLILLLLZI) {
            i = (getCount() - i) - 1;
        }
        return this.LJLJI.LJIILJJIL(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILL(int i, View container) {
        o.LJIIJ(container, "container");
        if (this.LJLILLLLZI) {
            i = (getCount() - i) - 1;
        }
        Object LJIILL = this.LJLJI.LJIILL(i, container);
        o.LJFF(LJIILL, "mDelegete.instantiateItem(container, position)");
        return LJIILL;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup container) {
        o.LJIIJ(container, "container");
        if (this.LJLILLLLZI) {
            i = (getCount() - i) - 1;
        }
        Object LJIILLIIL = this.LJLJI.LJIILLIIL(i, container);
        o.LJFF(LJIILLIIL, "mDelegete.instantiateItem(container, position)");
        return LJIILLIIL;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object o) {
        o.LJIIJ(view, "view");
        o.LJIIJ(o, "o");
        return this.LJLJI.LJIIZILJ(view, o);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIIZZ(int i, View container, Object object) {
        o.LJIIJ(container, "container");
        o.LJIIJ(object, "object");
        if (this.LJLILLLLZI) {
            i = (getCount() - i) - 1;
        }
        this.LJLJI.LJIIIIZZ(i, container, object);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object object) {
        o.LJIIJ(container, "container");
        o.LJIIJ(object, "object");
        if (this.LJLILLLLZI) {
            i = (getCount() - i) - 1;
        }
        this.LJLJI.LJIIIZ(i, container, object);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIJJLI(int i, View container, Object object) {
        o.LJIIJ(container, "container");
        o.LJIIJ(object, "object");
        if (this.LJLILLLLZI) {
            i = (getCount() - i) - 1;
        }
        this.LJLJI.LJIJJLI(i, container, object);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIL(int i, ViewGroup container, Object object) {
        o.LJIIJ(container, "container");
        o.LJIIJ(object, "object");
        if (this.LJLILLLLZI) {
            i = (getCount() - i) - 1;
        }
        this.LJLJI.LJIL(i, container, object);
    }
}
