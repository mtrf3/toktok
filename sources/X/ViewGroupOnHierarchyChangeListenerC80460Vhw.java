package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Vhw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewGroupOnHierarchyChangeListenerC80460Vhw implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ YS3 LJLIL;

    public ViewGroupOnHierarchyChangeListenerC80460Vhw(YS3 ys3) {
        this.LJLIL = ys3;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        YS3 ys3 = this.LJLIL;
        if (view == ys3.LLIIIJ) {
            if (ys3.LLIIL == null) {
                ys3.LLIIL = new ArrayList();
            }
            this.LJLIL.getClass();
            ArrayList arrayList = new ArrayList();
            YS3.LJJIIJ(view2, arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!((ArrayList) this.LJLIL.LLIIL).contains(next)) {
                    ((ArrayList) this.LJLIL.LLIIL).add(next);
                }
            }
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        YS3 ys3 = this.LJLIL;
        if (view == ys3.LLIIIJ) {
            if (ys3.LLIIL == null) {
                ys3.LLIIL = new ArrayList();
            }
            this.LJLIL.getClass();
            ArrayList arrayList = new ArrayList();
            YS3.LJJIIJ(view2, arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ArrayList) this.LJLIL.LLIIL).remove(it.next());
            }
        }
    }
}
