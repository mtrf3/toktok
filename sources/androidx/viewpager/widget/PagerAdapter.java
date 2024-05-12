package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class PagerAdapter {
    public final DataSetObservable LJLIL = new DataSetObservable();
    public DataSetObserver mViewPagerObserver;

    public void LJIIJ(View view) {
    }

    public int LJIIL(Object obj) {
        return -1;
    }

    public CharSequence LJIILIIL(int i) {
        return null;
    }

    public float LJIILJJIL(int i) {
        return 1.0f;
    }

    public abstract boolean LJIIZILJ(View view, Object obj);

    public void LJIJI(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable LJIJJ() {
        return null;
    }

    public void LJIJJLI(int i, View view, Object obj) {
    }

    public void LJJI(View view) {
    }

    public abstract int getCount();

    public void notifyDataSetChanged() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.mViewPagerObserver;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.LJLIL.notifyChanged();
    }

    public void LJIIJJI(ViewGroup viewGroup) {
        LJIIJ(viewGroup);
    }

    public void LJIJ(DataSetObserver dataSetObserver) {
        this.LJLIL.registerObserver(dataSetObserver);
    }

    public void LJJ(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.mViewPagerObserver = dataSetObserver;
        }
    }

    public void LJJIFFI(ViewGroup viewGroup) {
        LJJI(viewGroup);
    }

    public void LJJII(DataSetObserver dataSetObserver) {
        this.LJLIL.unregisterObserver(dataSetObserver);
    }

    public Object LJIILL(int i, View view) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public Object LJIILLIIL(int i, ViewGroup viewGroup) {
        return LJIILL(i, viewGroup);
    }

    public void LJIIIIZZ(int i, View view, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void LJIIIZ(int i, ViewGroup viewGroup, Object obj) {
        LJIIIIZZ(i, viewGroup, obj);
    }

    public void LJIL(int i, ViewGroup viewGroup, Object obj) {
        LJIJJLI(i, viewGroup, obj);
    }
}
