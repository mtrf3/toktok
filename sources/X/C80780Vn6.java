package X;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;

/* renamed from: X.Vn6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80780Vn6 extends C1BC {
    public final PagerAdapter LJLJJLL;

    @Override // X.C1BC, androidx.viewpager.widget.PagerAdapter
    public final Parcelable LJIJJ() {
        return this.LJLJJLL.LJIJJ();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLJJLL.getCount();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void notifyDataSetChanged() {
        this.LJLJJLL.notifyDataSetChanged();
    }

    public final void LJJIIJZLJL() {
        super.notifyDataSetChanged();
    }

    public C80780Vn6(PagerAdapter pagerAdapter) {
        super(null, 0);
        this.LJLJJLL = pagerAdapter;
        pagerAdapter.LJIJ(new C80791VnH(this));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIJ(View view) {
        this.LJLJJLL.LJIIJ(view);
    }

    @Override // X.C1BC, androidx.viewpager.widget.PagerAdapter
    public final void LJIIJJI(ViewGroup viewGroup) {
        this.LJLJJLL.LJIIJJI(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIJ(DataSetObserver dataSetObserver) {
        this.LJLJJLL.LJIJ(dataSetObserver);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJI(View view) {
        this.LJLJJLL.LJJI(view);
    }

    @Override // X.C1BC, androidx.viewpager.widget.PagerAdapter
    public final void LJJIFFI(ViewGroup viewGroup) {
        this.LJLJJLL.LJJIFFI(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJII(DataSetObserver dataSetObserver) {
        this.LJLJJLL.LJJII(dataSetObserver);
    }

    @Override // X.C1BC, androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object obj) {
        return this.LJLJJLL.LJIIZILJ(view, obj);
    }

    @Override // X.C1BC, androidx.viewpager.widget.PagerAdapter
    public final void LJIJI(Parcelable parcelable, ClassLoader classLoader) {
        this.LJLJJLL.LJIJI(parcelable, classLoader);
    }
}
