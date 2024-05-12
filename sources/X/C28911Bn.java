package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* renamed from: X.1Bn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28911Bn extends C16120kC {
    public final C28921Bo LIZ;
    public final java.util.Map<View, C16120kC> LIZIZ = new WeakHashMap();

    public C28911Bn(C28921Bo c28921Bo) {
        this.LIZ = c28921Bo;
    }

    @Override // X.C16120kC
    public final C17780ms getAccessibilityNodeProvider(View view) {
        C16120kC c16120kC = (C16120kC) ((WeakHashMap) this.LIZIZ).get(view);
        if (c16120kC != null) {
            return c16120kC.getAccessibilityNodeProvider(view);
        }
        return super.getAccessibilityNodeProvider(view);
    }

    @Override // X.C16120kC
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C16120kC c16120kC = (C16120kC) ((WeakHashMap) this.LIZIZ).get(view);
        if (c16120kC != null) {
            return c16120kC.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C16120kC c16120kC = (C16120kC) ((WeakHashMap) this.LIZIZ).get(view);
        if (c16120kC != null) {
            c16120kC.onInitializeAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View view, C17760mq c17760mq) {
        RecyclerView recyclerView = this.LIZ.LIZ;
        if (!recyclerView.LL || recyclerView.LLII || recyclerView.LJLJJI.LJI() || this.LIZ.LIZ.getLayoutManager() == null) {
            super.onInitializeAccessibilityNodeInfo(view, c17760mq);
            return;
        }
        this.LIZ.LIZ.getLayoutManager().LJJZZI(view, c17760mq);
        C16120kC c16120kC = (C16120kC) ((WeakHashMap) this.LIZIZ).get(view);
        if (c16120kC != null) {
            c16120kC.onInitializeAccessibilityNodeInfo(view, c17760mq);
        } else {
            super.onInitializeAccessibilityNodeInfo(view, c17760mq);
        }
    }

    @Override // X.C16120kC
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C16120kC c16120kC = (C16120kC) ((WeakHashMap) this.LIZIZ).get(view);
        if (c16120kC != null) {
            c16120kC.onPopulateAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // X.C16120kC
    public final void sendAccessibilityEvent(View view, int i) {
        C16120kC c16120kC = (C16120kC) ((WeakHashMap) this.LIZIZ).get(view);
        if (c16120kC != null) {
            c16120kC.sendAccessibilityEvent(view, i);
        } else {
            super.sendAccessibilityEvent(view, i);
        }
    }

    @Override // X.C16120kC
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        C16120kC c16120kC = (C16120kC) ((WeakHashMap) this.LIZIZ).get(view);
        if (c16120kC != null) {
            c16120kC.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        } else {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    @Override // X.C16120kC
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C16120kC c16120kC = (C16120kC) ((WeakHashMap) this.LIZIZ).get(viewGroup);
        if (c16120kC != null) {
            return c16120kC.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // X.C16120kC
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        RecyclerView recyclerView = this.LIZ.LIZ;
        if (!recyclerView.LL || recyclerView.LLII || recyclerView.LJLJJI.LJI() || this.LIZ.LIZ.getLayoutManager() == null) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        C16120kC c16120kC = (C16120kC) ((WeakHashMap) this.LIZIZ).get(view);
        if (c16120kC != null) {
            if (c16120kC.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
        } else if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        this.LIZ.LIZ.getLayoutManager();
        return false;
    }
}
