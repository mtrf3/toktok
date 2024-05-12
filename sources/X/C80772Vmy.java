package X;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import java.lang.reflect.Field;

/* renamed from: X.Vmy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80772Vmy extends PagerAdapter {
    public static final Field LJLJJL;
    public final PagerAdapter LJLILLLLZI;
    public final boolean LJLJI;
    public final int LJLJJI;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIIL(Object obj) {
        return -2;
    }

    static {
        try {
            Field declaredField = PagerAdapter.class.getDeclaredField("mViewPagerObserver");
            LJLJJL = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Parcelable LJIJJ() {
        return this.LJLILLLLZI.LJIJJ();
    }

    public final void LJJIII() {
        try {
            Field field = LJLJJL;
            Object obj = field.get(this);
            Object obj2 = field.get(this.LJLILLLLZI);
            if (obj == null && obj2 != null) {
                field.set(this.LJLILLLLZI, null);
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        try {
            Field field = LJLJJL;
            field.set(this.LJLILLLLZI, field.get(this));
            if (!this.LJLJI || this.LJLILLLLZI.getCount() == 1) {
                return this.LJLILLLLZI.getCount();
            }
            return this.LJLJJI;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void notifyDataSetChanged() {
        this.LJLILLLLZI.notifyDataSetChanged();
    }

    public C80772Vmy(AbstractC29229BdZ abstractC29229BdZ) {
        this(abstractC29229BdZ, Integer.MAX_VALUE);
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
    public final CharSequence LJIILIIL(int i) {
        return this.LJLILLLLZI.LJIILIIL(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final float LJIILJJIL(int i) {
        return this.LJLILLLLZI.LJIILJJIL(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIJ(DataSetObserver dataSetObserver) {
        this.LJLILLLLZI.LJIJ(dataSetObserver);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJI(View view) {
        LJJIII();
        this.LJLILLLLZI.LJJI(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIFFI(ViewGroup viewGroup) {
        LJJIII();
        this.LJLILLLLZI.LJJIFFI(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJII(DataSetObserver dataSetObserver) {
        this.LJLILLLLZI.LJJII(dataSetObserver);
    }

    public C80772Vmy(AbstractC29229BdZ abstractC29229BdZ, int i) {
        this.LJLJI = true;
        abstractC29229BdZ.getClass();
        this.LJLILLLLZI = abstractC29229BdZ;
        this.LJLJJI = i;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILL(int i, View view) {
        int count = this.LJLILLLLZI.getCount();
        if (count == 0) {
            return null;
        }
        return this.LJLILLLLZI.LJIILL(i % count, view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup viewGroup) {
        int count = this.LJLILLLLZI.getCount();
        if (count == 0) {
            return null;
        }
        return this.LJLILLLLZI.LJIILLIIL(i % count, viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object obj) {
        return this.LJLILLLLZI.LJIIZILJ(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIJI(Parcelable parcelable, ClassLoader classLoader) {
        this.LJLILLLLZI.LJIJI(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIIZZ(int i, View view, Object obj) {
        int count = this.LJLILLLLZI.getCount();
        if (count == 0) {
            return;
        }
        this.LJLILLLLZI.LJIIIIZZ(i / count, view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup viewGroup, Object obj) {
        int count = this.LJLILLLLZI.getCount();
        if (count == 0) {
            return;
        }
        this.LJLILLLLZI.LJIIIZ(i / count, viewGroup, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIJJLI(int i, View view, Object obj) {
        this.LJLILLLLZI.LJIJJLI(i, view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIL(int i, ViewGroup viewGroup, Object obj) {
        this.LJLILLLLZI.LJIL(i, viewGroup, obj);
    }
}
