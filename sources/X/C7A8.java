package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.7A8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7A8 implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final ViewGroup LJLIL;
    public final HashSet<View> LJLILLLLZI;
    public final Rect LJLJI;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewGroup viewGroup = this.LJLIL;
        if (viewGroup != null) {
            LIZ(viewGroup.getRootView());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        Iterator<View> it = this.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            View next = it.next();
            if (next instanceof InterfaceC58432Rb) {
                boolean localVisibleRect = next.getLocalVisibleRect(this.LJLJI);
                InterfaceC88472Yns<Boolean, C76800UCe> exposeListener = ((InterfaceC58432Rb) next).getExposeListener();
                if (exposeListener != null) {
                    exposeListener.invoke(Boolean.valueOf(localVisibleRect));
                }
            }
        }
    }

    public C7A8(C45631qh c45631qh) {
        ViewGroup viewGroup;
        View childAt = c45631qh.getChildAt(0);
        if (childAt instanceof ViewGroup) {
            viewGroup = (ViewGroup) childAt;
        } else {
            viewGroup = null;
        }
        this.LJLIL = viewGroup;
        this.LJLILLLLZI = new HashSet<>();
        this.LJLJI = new Rect();
    }

    public final void LIZ(View view) {
        if (view != null) {
            if (view instanceof InterfaceC58432Rb) {
                this.LJLILLLLZI.add(view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof InterfaceC58432Rb) {
                        this.LJLILLLLZI.add(childAt);
                    }
                    if (childAt instanceof ViewGroup) {
                        LIZ(childAt);
                    }
                }
            }
        }
    }
}
