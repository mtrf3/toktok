package X;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;

/* renamed from: X.Vn8, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80782Vn8 extends PagerAdapter {
    public final PagerAdapter LJLILLLLZI;

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

    public final void LJJIII() {
        super.notifyDataSetChanged();
    }

    public C80782Vn8(PagerAdapter pagerAdapter) {
        this.LJLILLLLZI = pagerAdapter;
        pagerAdapter.LJIJ(new C80788VnE(this));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIJ(View view) {
        this.LJLILLLLZI.LJIIJ(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIJJI(ViewGroup viewGroup) {
        this.LJLILLLLZI.LJIIJJI(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIJ(DataSetObserver dataSetObserver) {
        this.LJLILLLLZI.LJIJ(dataSetObserver);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJI(View view) {
        this.LJLILLLLZI.LJJI(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIFFI(ViewGroup viewGroup) {
        this.LJLILLLLZI.LJJIFFI(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJII(DataSetObserver dataSetObserver) {
        this.LJLILLLLZI.LJJII(dataSetObserver);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object obj) {
        return this.LJLILLLLZI.LJIIZILJ(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIJI(Parcelable parcelable, ClassLoader classLoader) {
        this.LJLILLLLZI.LJIJI(parcelable, classLoader);
    }
}
