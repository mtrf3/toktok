package X;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;

/* renamed from: X.Vmx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80771Vmx extends C1BC {
    public final PagerAdapter LJLJJLL;
    public final /* synthetic */ C80766Vms LJLJL;

    @Override // X.C1BC, androidx.viewpager.widget.PagerAdapter
    public final Parcelable LJIJJ() {
        return this.LJLJJLL.LJIJJ();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLJJLL.getCount();
    }

    @Override // X.C1BC, androidx.viewpager.widget.PagerAdapter
    public final void LJIIJJI(ViewGroup viewGroup) {
        this.LJLJJLL.LJIIJJI(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIIL(Object obj) {
        int LJIIL = this.LJLJJLL.LJIIL(obj);
        if (this.LJLJL.LJJIJL()) {
            if (LJIIL == -1 || LJIIL == -2) {
                return -2;
            }
            return (getCount() - LJIIL) - 1;
        }
        return LJIIL;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        if (this.LJLJL.LJJIJL()) {
            i = (getCount() - i) - 1;
        }
        return this.LJLJJLL.LJIILIIL(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final float LJIILJJIL(int i) {
        if (this.LJLJL.LJJIJL()) {
            i = (getCount() - i) - 1;
        }
        return this.LJLJJLL.LJIILJJIL(i);
    }

    @Override // X.C1BC, androidx.viewpager.widget.PagerAdapter
    public final void LJJIFFI(ViewGroup viewGroup) {
        this.LJLJJLL.LJJIFFI(viewGroup);
    }

    @Override // X.C1BC
    public final Fragment LJJIII(int i) {
        if (this.LJLJL.LJJIJL()) {
            i = (getCount() - i) - 1;
        }
        return ((C1BC) this.LJLJJLL).LJJIII(i);
    }

    @Override // X.C1BC
    public final long LJJIIJ(int i) {
        if (this.LJLJL.LJJIJL()) {
            i = (getCount() - i) - 1;
        }
        return i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80771Vmx(C80766Vms c80766Vms, PagerAdapter pagerAdapter) {
        super(null, 0);
        this.LJLJL = c80766Vms;
        this.LJLJJLL = pagerAdapter;
        pagerAdapter.LJIJ(new C80768Vmu(this));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILL(int i, View view) {
        if (this.LJLJL.LJJIJL()) {
            i = (getCount() - i) - 1;
        }
        return this.LJLJJLL.LJIILL(i, view);
    }

    @Override // X.C1BC, androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup viewGroup) {
        if (this.LJLJL.LJJIJL()) {
            i = (getCount() - i) - 1;
        }
        return this.LJLJJLL.LJIILLIIL(i, viewGroup);
    }

    @Override // X.C1BC, androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object obj) {
        return this.LJLJJLL.LJIIZILJ(view, obj);
    }

    @Override // X.C1BC, androidx.viewpager.widget.PagerAdapter
    public final void LJIJI(Parcelable parcelable, ClassLoader classLoader) {
        this.LJLJJLL.LJIJI(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIIZZ(int i, View view, Object obj) {
        if (this.LJLJL.LJJIJL()) {
            i = (getCount() - i) - 1;
        }
        this.LJLJJLL.LJIIIIZZ(i, view, obj);
    }

    @Override // X.C1BC, androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup viewGroup, Object obj) {
        if (this.LJLJL.LJJIJL()) {
            i = (getCount() - i) - 1;
        }
        if (i < 0) {
            i = 0;
        }
        this.LJLJJLL.LJIIIZ(i, viewGroup, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIJJLI(int i, View view, Object obj) {
        if (this.LJLJL.LJJIJL()) {
            i = (getCount() - i) - 1;
        }
        this.LJLJJLL.LJIJJLI(i, view, obj);
    }

    @Override // X.C1BC, androidx.viewpager.widget.PagerAdapter
    public final void LJIL(int i, ViewGroup viewGroup, Object obj) {
        if (this.LJLJL.LJJIJL()) {
            i = (getCount() - i) - 1;
        }
        this.LJLJJLL.LJIL(i, viewGroup, obj);
    }
}
