package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import java.util.List;

/* renamed from: X.Rzw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71384Rzw extends AbstractC030309z {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ List<ShopWindowAnchorModel> LJLILLLLZI;

    public C71384Rzw(boolean z, List<ShopWindowAnchorModel> list) {
        this.LJLIL = z;
        this.LJLILLLLZI = list;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        int LIZJ = C1JX.LIZJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state", view);
        if (LIZJ == 0) {
            return;
        }
        if (this.LJLIL && LIZJ == this.LJLILLLLZI.size()) {
            return;
        }
        if (LIZJ != 1 && LIZJ != 2) {
            rect.top = C71383Rzv.LIZJ;
        } else {
            rect.top = C71383Rzv.LJ;
        }
        if (LIZJ == this.LJLILLLLZI.size() - 1 || (LIZJ % 2 == 1 && this.LJLILLLLZI.size() >= 3 && LIZJ == this.LJLILLLLZI.size() - 2)) {
            rect.bottom = C71383Rzv.LJ;
        }
        if (LIZJ % 2 == 1) {
            rect.left = C71383Rzv.LJ;
        } else {
            rect.left = C71383Rzv.LIZIZ;
            rect.right = C71383Rzv.LJ;
        }
        if (C90193gN.LIZ()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
    }
}
