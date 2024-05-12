package X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1Bo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28921Bo extends C16120kC {
    public final RecyclerView LIZ;
    public final C28911Bn LIZIZ;

    public C28921Bo(RecyclerView recyclerView) {
        this.LIZ = recyclerView;
        C28911Bn c28911Bn = this.LIZIZ;
        if (c28911Bn != null) {
            this.LIZIZ = c28911Bn;
        } else {
            this.LIZIZ = new C28911Bn(this);
        }
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = this.LIZ;
            if (!recyclerView.LL || recyclerView.LLII || recyclerView.LJLJJI.LJI()) {
                return;
            }
            RecyclerView recyclerView2 = (RecyclerView) view;
            if (recyclerView2.getLayoutManager() == null) {
                return;
            }
            recyclerView2.getLayoutManager().LJJLL(accessibilityEvent);
        }
    }

    @Override // X.C16120kC
    public void onInitializeAccessibilityNodeInfo(View view, C17760mq c17760mq) {
        super.onInitializeAccessibilityNodeInfo(view, c17760mq);
        RecyclerView recyclerView = this.LIZ;
        if (!recyclerView.LL || recyclerView.LLII || recyclerView.LJLJJI.LJI() || this.LIZ.getLayoutManager() == null) {
            return;
        }
        C0A2 layoutManager = this.LIZ.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.LJLILLLLZI;
        layoutManager.LJJZ(recyclerView2.LJLILLLLZI, recyclerView2.LLJIJIL, c17760mq);
    }

    @Override // X.C16120kC
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.LIZ;
        if (!recyclerView.LL || recyclerView.LLII || recyclerView.LJLJJI.LJI() || this.LIZ.getLayoutManager() == null) {
            return false;
        }
        C0A2 layoutManager = this.LIZ.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.LJLILLLLZI;
        return layoutManager.LJLL(recyclerView2.LJLILLLLZI, recyclerView2.LLJIJIL, i, bundle);
    }
}
