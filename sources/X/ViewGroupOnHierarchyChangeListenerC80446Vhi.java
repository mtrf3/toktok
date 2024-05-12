package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Vhi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class ViewGroupOnHierarchyChangeListenerC80446Vhi implements ViewGroup.OnHierarchyChangeListener {
    public ViewGroup.OnHierarchyChangeListener LJLIL;
    public final /* synthetic */ C80445Vhh LJLILLLLZI;

    public ViewGroupOnHierarchyChangeListenerC80446Vhi(C80445Vhh c80445Vhh) {
        this.LJLILLLLZI = c80445Vhh;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        C80445Vhh c80445Vhh;
        int id;
        int i;
        if (view == this.LJLILLLLZI && (view2 instanceof C80438Vha)) {
            if (view2.getId() == -1) {
                view2.setId(View.generateViewId());
            }
            C80438Vha c80438Vha = (C80438Vha) view2;
            if (c80438Vha.isChecked() && (id = c80438Vha.getId()) != (i = (c80445Vhh = (C80445Vhh) view).LJLLI)) {
                if (i != -1 && c80445Vhh.LJLJL) {
                    c80445Vhh.LIZIZ(i, false);
                }
                if (id != -1) {
                    c80445Vhh.LIZIZ(id, true);
                }
                c80445Vhh.setCheckedId(id);
            }
            c80438Vha.setOnCheckedChangeListenerInternal(this.LJLILLLLZI.LJLJLLL);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.LJLIL;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        if (view == this.LJLILLLLZI && (view2 instanceof C80438Vha)) {
            ((C80438Vha) view2).setOnCheckedChangeListenerInternal(null);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.LJLIL;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
