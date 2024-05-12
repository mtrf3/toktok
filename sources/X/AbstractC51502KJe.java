package X;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;

/* renamed from: X.KJe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51502KJe<T> extends PagerAdapter {
    public final SparseArray<T> LJLILLLLZI = new SparseArray<>();
    public Fragment LJLJI;

    public abstract Object LJJIII(int i, ViewGroup viewGroup);

    public boolean LJJIIJ(int i) {
        if (this.LJLILLLLZI.get(i) != null) {
            return true;
        }
        return false;
    }
}
