package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* renamed from: X.HxG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C45738HxG extends RecyclerView {
    public final boolean LJLJJL() {
        if (getLayoutManager() instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) getLayoutManager()).LLFF;
        }
        if (getLayoutManager() instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) getLayoutManager()).LL;
        }
        return false;
    }

    public int getEndItemIndex() {
        if (!LJLJJL()) {
            return getAdapter().getItemCount() - 1;
        }
        return 0;
    }

    public int getFirstPosition() {
        if (getChildCount() < 1) {
            return -1;
        }
        return RecyclerView.LJJJJIZL(getChildAt(0));
    }

    public int getLastPosition() {
        if (getChildCount() < 1) {
            return -1;
        }
        return RecyclerView.LJJJJIZL(getChildAt(getChildCount() - 1));
    }

    public int getStartItemIndex() {
        if (!LJLJJL()) {
            return 0;
        }
        return getAdapter().getItemCount() - 1;
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
    }

    public C45738HxG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C45738HxG(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }
}
