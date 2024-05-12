package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.4a0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111724a0 {
    public WeakReference<ViewGroup> LIZ;
    public WeakReference<FrameLayout> LIZIZ;
    public WeakReference<ViewGroup> LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.view.View] */
    public final void LIZ(FrameLayout frameLayout) {
        FrameLayout frameLayout2;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (frameLayout == null) {
            return;
        }
        WeakReference<FrameLayout> weakReference = this.LIZIZ;
        View view = null;
        if (weakReference != null) {
            frameLayout2 = weakReference.get();
        } else {
            frameLayout2 = null;
        }
        WeakReference<ViewGroup> weakReference2 = this.LIZ;
        if (weakReference2 != null) {
            viewGroup = weakReference2.get();
        } else {
            viewGroup = null;
        }
        WeakReference<ViewGroup> weakReference3 = this.LIZJ;
        if (weakReference3 != null) {
            viewGroup2 = weakReference3.get();
        } else {
            viewGroup2 = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("attach begin:");
        LIZ.append(frameLayout.getContext());
        X1D.LIZIZ(LIZ);
        this.LIZIZ = new WeakReference<>(frameLayout);
        if (viewGroup != null) {
            return;
        }
        if (viewGroup2 == null) {
            boolean z = false;
            for (ViewParent viewParent = frameLayout.getParent(); viewParent != null; viewParent = viewParent.getParent()) {
                if (viewParent instanceof ViewGroup) {
                    view = (View) viewParent;
                } else {
                    z = true;
                }
            }
            if (z) {
                viewGroup2 = view;
                if (view == null) {
                    return;
                } else {
                    this.LIZJ = new WeakReference<>(view);
                }
            } else {
                return;
            }
        }
        View findViewWithTag = viewGroup2.findViewWithTag("SIM_KIT_VIDEO_CONTAINER_LIST_TAG");
        if (findViewWithTag == null) {
            if (frameLayout2 != null) {
                for (FrameLayout frameLayout3 = frameLayout; frameLayout2.getParent() != frameLayout3.getParent(); frameLayout3 = (View) frameLayout3.getParent()) {
                    if ((frameLayout2.getParent() instanceof View) && (frameLayout3.getParent() instanceof View)) {
                        frameLayout2 = (View) frameLayout2.getParent();
                    } else {
                        return;
                    }
                }
                ViewParent parent = frameLayout2.getParent();
                if (parent != null) {
                    this.LIZ = new WeakReference<>(parent);
                    return;
                }
                return;
            }
            return;
        }
        this.LIZ = new WeakReference<>(findViewWithTag);
    }

    public final FrameLayout LIZIZ(boolean z) {
        FrameLayout frameLayout;
        ViewGroup viewGroup;
        View view;
        WeakReference<FrameLayout> weakReference = this.LIZIZ;
        if (weakReference != null) {
            frameLayout = weakReference.get();
        } else {
            frameLayout = null;
        }
        WeakReference<ViewGroup> weakReference2 = this.LIZ;
        if (weakReference2 == null || (viewGroup = weakReference2.get()) == null || frameLayout == null) {
            return null;
        }
        while (frameLayout.getParent() != null && frameLayout.getParent() != viewGroup) {
            if (!(frameLayout.getParent() instanceof View)) {
                return null;
            }
            frameLayout = (View) frameLayout.getParent();
        }
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            arrayList.add(viewGroup.getChildAt(i));
        }
        arrayList.remove(frameLayout);
        if (arrayList.size() == 0) {
            return null;
        }
        C16880lQ.LLLZ("findNearbyHolder current: [top:%s, bottom:%s]", new Object[]{Integer.valueOf(frameLayout.getTop()), Integer.valueOf(frameLayout.getBottom())});
        if (z) {
            Iterator it = arrayList.iterator();
            view = null;
            while (it.hasNext()) {
                View view2 = (View) it.next();
                int top = view2.getTop() - frameLayout.getBottom();
                if (top >= 0 && top <= 200) {
                    C16880lQ.LLLZ("findNearbyHolder isBelowCurrent: [top:%s, bottom:%s]", new Object[]{Integer.valueOf(view2.getTop()), Integer.valueOf(view2.getBottom())});
                    view = view2;
                }
            }
        } else {
            Iterator it2 = arrayList.iterator();
            view = null;
            while (it2.hasNext()) {
                View view3 = (View) it2.next();
                int top2 = frameLayout.getTop() - view3.getBottom();
                if (top2 >= 0 && top2 <= 200) {
                    C16880lQ.LLLZ("findNearbyHolder isAboveCurrent: [top:%s, bottom:%s]", new Object[]{Integer.valueOf(view3.getTop()), Integer.valueOf(view3.getBottom())});
                    view = view3;
                }
            }
        }
        if (view == null) {
            return null;
        }
        return (FrameLayout) view.findViewWithTag("SIM_KIT_VIDEO_CONTAINER_TAG");
    }
}
