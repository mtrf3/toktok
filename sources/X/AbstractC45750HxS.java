package X;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.scene.group.UserVisibleHintGroupScene;

/* renamed from: X.HxS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC45750HxS<T> extends PagerAdapter {
    public final SparseArray<T> LJLILLLLZI = new SparseArray<>();
    public T LJLJI;

    public abstract UserVisibleHintGroupScene LJJIII(int i, ViewGroup viewGroup);

    public abstract Object LJJIIJ(int i, ViewGroup viewGroup);

    @Override // androidx.viewpager.widget.PagerAdapter
    public void LJIL(int i, ViewGroup viewGroup, Object obj) {
        this.LJLJI = (T) LJJIII(i, viewGroup);
    }
}
