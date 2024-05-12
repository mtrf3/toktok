package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.anchor.fragment.ECommerceCommodityListActivity;

/* renamed from: X.RzE, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71340RzE extends AbstractC030309z {
    public final /* synthetic */ ECommerceCommodityListActivity LJLIL;

    public C71340RzE(ECommerceCommodityListActivity eCommerceCommodityListActivity) {
        this.LJLIL = eCommerceCommodityListActivity;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        int LIZJ = C1JX.LIZJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state", view);
        ECommerceCommodityListActivity eCommerceCommodityListActivity = this.LJLIL;
        if (eCommerceCommodityListActivity.LJLJLLL == EnumC71337RzB.OneRowBigImage) {
            int i = eCommerceCommodityListActivity.LJLZ;
            rect.top = i;
            rect.left = i;
            rect.right = i;
            if (LIZJ == eCommerceCommodityListActivity.LJLJJI.size() - 1) {
                rect.bottom = this.LJLIL.LJZ;
                return;
            }
            return;
        }
        if (LIZJ == 0) {
            int i2 = eCommerceCommodityListActivity.LJLZ;
            rect.top = i2;
            rect.left = i2;
            rect.right = eCommerceCommodityListActivity.LJLLLL;
        } else if (LIZJ == 1) {
            int i3 = eCommerceCommodityListActivity.LJLZ;
            rect.top = i3;
            rect.right = i3;
            rect.left = eCommerceCommodityListActivity.LJLLLL;
        } else {
            int i4 = LIZJ % 2;
            if (i4 == 0) {
                rect.right = eCommerceCommodityListActivity.LJLLLL;
                rect.left = eCommerceCommodityListActivity.LJLZ;
                rect.top = eCommerceCommodityListActivity.LJLLLLLL;
            } else if (i4 == 1) {
                rect.left = eCommerceCommodityListActivity.LJLLLL;
                rect.top = eCommerceCommodityListActivity.LJLLLLLL;
                rect.right = eCommerceCommodityListActivity.LJLZ;
            }
        }
        if (eCommerceCommodityListActivity.LJLJJI.size() % 2 == 0 && (LIZJ == this.LJLIL.LJLJJI.size() - 1 || LIZJ == this.LJLIL.LJLJJI.size() - 2)) {
            rect.bottom = this.LJLIL.LJZ;
        }
        if (this.LJLIL.LJLJJI.size() % 2 == 1 && LIZJ == this.LJLIL.LJLJJI.size() - 1) {
            rect.bottom = this.LJLIL.LJZ;
        }
        if (C90193gN.LIZ()) {
            int i5 = rect.left;
            rect.left = rect.right;
            rect.right = i5;
        }
    }
}
