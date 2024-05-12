package X;

import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0CA, reason: invalid class name */
/* loaded from: classes.dex */
public class C0CA {
    public C29081Ce LIZ;
    public C40301i6 LIZIZ;
    public LifecycleEventObserver LIZJ;
    public C0CM LIZLLL;
    public long LJ = -1;
    public final /* synthetic */ FragmentStateAdapter LJFF;

    public C0CA(FragmentStateAdapter fragmentStateAdapter) {
        this.LJFF = fragmentStateAdapter;
    }

    public static C0CM LIZ(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof C0CM) {
            return (C0CM) parent;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Expected ViewPager2 instance. Got: ");
        LIZ.append(parent);
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public final void LIZIZ(boolean z) {
        int currentItem;
        boolean z2;
        if (this.LJFF.LJLILLLLZI.LJJJLZIJ() || this.LIZLLL.getScrollState() != 0 || this.LJFF.LJLJI.LJIIIIZZ() == 0 || this.LJFF.getItemCount() == 0 || (currentItem = this.LIZLLL.getCurrentItem()) >= this.LJFF.getItemCount()) {
            return;
        }
        long itemId = this.LJFF.getItemId(currentItem);
        if (itemId == this.LJ && !z) {
            return;
        }
        Fragment fragment = null;
        Fragment LJ = this.LJFF.LJLJI.LJ(itemId, null);
        if (LJ == null || !LJ.isAdded()) {
            return;
        }
        this.LJ = itemId;
        FragmentManager fragmentManager = this.LJFF.LJLILLLLZI;
        C1B3 LIZ = C1B6.LIZ(fragmentManager, fragmentManager);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.LJFF.LJLJI.LJIIIIZZ(); i++) {
            long LJFF = this.LJFF.LJLJI.LJFF(i);
            Fragment LJIIIZ = this.LJFF.LJLJI.LJIIIZ(i);
            if (LJIIIZ.isAdded()) {
                if (LJFF != this.LJ) {
                    LIZ.LJJIFFI(LJIIIZ, Lifecycle.State.STARTED);
                    arrayList.add(this.LJFF.LJLJL.LIZ());
                } else {
                    fragment = LJIIIZ;
                }
                if (LJFF == this.LJ) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                LJIIIZ.setMenuVisibility(z2);
            }
        }
        if (fragment != null) {
            LIZ.LJJIFFI(fragment, Lifecycle.State.RESUMED);
            arrayList.add(this.LJFF.LJLJL.LIZ());
        }
        if (LIZ.LIZ.isEmpty()) {
            return;
        }
        LIZ.LJIILLIIL();
        Collections.reverse(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            this.LJFF.LJLJL.getClass();
            C0C9.LIZIZ(list);
        }
    }
}
