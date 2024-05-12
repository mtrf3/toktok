package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.placediscovery.ui.NearbyCategoryListAssem;

/* renamed from: X.Lcn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54661Lcn extends AbstractC030309z {
    public final /* synthetic */ NearbyCategoryListAssem LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    public C54661Lcn(NearbyCategoryListAssem nearbyCategoryListAssem, int i) {
        this.LJLIL = nearbyCategoryListAssem;
        this.LJLILLLLZI = i;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        T28.LJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state");
        super.LJ(rect, view, recyclerView, c0ac);
        AbstractC029409q adapter = recyclerView.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            int LJJJJIZL = RecyclerView.LJJJJIZL(view);
            if (LJJJJIZL == itemCount - 1) {
                if (((Boolean) this.LJLIL.LJLILLLLZI.getValue()).booleanValue()) {
                    rect.left = C7MY.LIZIZ(8);
                    rect.right = this.LJLILLLLZI;
                    return;
                } else {
                    rect.left = this.LJLILLLLZI;
                    rect.right = C7MY.LIZIZ(8);
                    return;
                }
            }
            if (LJJJJIZL == 0) {
                if (((Boolean) this.LJLIL.LJLILLLLZI.getValue()).booleanValue()) {
                    rect.left = this.LJLILLLLZI;
                    rect.right = C7MY.LIZIZ(8);
                    return;
                } else {
                    rect.left = C7MY.LIZIZ(8);
                    rect.right = this.LJLILLLLZI;
                    return;
                }
            }
            int i = this.LJLILLLLZI;
            rect.left = i;
            rect.right = i;
        }
    }
}
