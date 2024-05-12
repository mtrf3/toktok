package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;

/* renamed from: X.Vn9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80783Vn9 extends C80782Vn8 {
    public final /* synthetic */ VWJ LJLJI;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIIL(Object obj) {
        int LJIIL = this.LJLILLLLZI.LJIIL(obj);
        if (this.LJLJI.LIZJ()) {
            if (LJIIL == -1 || LJIIL == -2) {
                return -2;
            }
            return (getCount() - LJIIL) - 1;
        }
        return LJIIL;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        if (this.LJLJI.LIZJ()) {
            i = (getCount() - i) - 1;
        }
        return this.LJLILLLLZI.LJIILIIL(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final float LJIILJJIL(int i) {
        if (this.LJLJI.LIZJ()) {
            i = (getCount() - i) - 1;
        }
        return this.LJLILLLLZI.LJIILJJIL(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80783Vn9(VWJ vwj, PagerAdapter pagerAdapter) {
        super(pagerAdapter);
        this.LJLJI = vwj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILL(int i, View view) {
        if (this.LJLJI.LIZJ()) {
            i = (getCount() - i) - 1;
        }
        return this.LJLILLLLZI.LJIILL(i, view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup viewGroup) {
        if (this.LJLJI.LIZJ()) {
            i = (getCount() - i) - 1;
        }
        return this.LJLILLLLZI.LJIILLIIL(i, viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIIZZ(int i, View view, Object obj) {
        if (this.LJLJI.LIZJ()) {
            i = (getCount() - i) - 1;
        }
        this.LJLILLLLZI.LJIIIIZZ(i, view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup viewGroup, Object obj) {
        if (this.LJLJI.LIZJ()) {
            i = (getCount() - i) - 1;
        }
        this.LJLILLLLZI.LJIIIZ(i, viewGroup, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIJJLI(int i, View view, Object obj) {
        if (this.LJLJI.LIZJ()) {
            i = (getCount() - i) - 1;
        }
        this.LJLILLLLZI.LJIJJLI(i, view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIL(int i, ViewGroup viewGroup, Object obj) {
        if (this.LJLJI.LIZJ()) {
            i = (getCount() - i) - 1;
        }
        this.LJLILLLLZI.LJIL(i, viewGroup, obj);
    }
}
