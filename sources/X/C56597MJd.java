package X;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import kotlin.jvm.internal.o;

/* renamed from: X.MJd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56597MJd extends PagerAdapter {
    public final PagerAdapter LJLILLLLZI;
    public final C54963Lhf LJLJI;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Parcelable LJIJJ() {
        return this.LJLILLLLZI.LJIJJ();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLILLLLZI.getCount();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void notifyDataSetChanged() {
        this.LJLILLLLZI.notifyDataSetChanged();
    }

    public C56597MJd(PagerAdapter pagerAdapter) {
        o.LJIIIZ(pagerAdapter, "pagerAdapter");
        this.LJLILLLLZI = pagerAdapter;
        C54963Lhf c54963Lhf = new C54963Lhf(this);
        this.LJLJI = c54963Lhf;
        pagerAdapter.LJIJ(c54963Lhf);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIJJI(ViewGroup container) {
        o.LJIIIZ(container, "container");
        this.LJLILLLLZI.LJIIJJI(container);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIIL(Object object) {
        o.LJIIIZ(object, "object");
        int LJIIL = this.LJLILLLLZI.LJIIL(object);
        if (LJIIL != -1 && LJIIL != -2) {
            return LJJIIJ(LJIIL);
        }
        return LJIIL;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        return this.LJLILLLLZI.LJIILIIL(LJJIIJ(i));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final float LJIILJJIL(int i) {
        return this.LJLILLLLZI.LJIILJJIL(LJJIIJ(i));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIJ(DataSetObserver observer) {
        o.LJIIIZ(observer, "observer");
        try {
            this.LJLILLLLZI.LJIJ(observer);
        } catch (Throwable unused) {
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIFFI(ViewGroup container) {
        o.LJIIIZ(container, "container");
        this.LJLILLLLZI.LJJIFFI(container);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJII(DataSetObserver observer) {
        o.LJIIIZ(observer, "observer");
        try {
            this.LJLILLLLZI.LJJII(observer);
        } catch (Throwable unused) {
        }
    }

    public final int LJJIIJ(int i) {
        return (getCount() - i) - 1;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup container) {
        o.LJIIIZ(container, "container");
        Object LJIILLIIL = this.LJLILLLLZI.LJIILLIIL(LJJIIJ(i), container);
        o.LJIIIIZZ(LJIILLIIL, "pagerAdapter.instantiate…etUsedPosition(position))");
        return LJIILLIIL;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object object) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(object, "object");
        return this.LJLILLLLZI.LJIIZILJ(view, object);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIJI(Parcelable parcelable, ClassLoader classLoader) {
        this.LJLILLLLZI.LJIJI(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object object) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(object, "object");
        this.LJLILLLLZI.LJIIIZ(LJJIIJ(i), container, object);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIL(int i, ViewGroup container, Object object) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(object, "object");
        this.LJLILLLLZI.LJIL(LJJIIJ(i), container, object);
    }
}
