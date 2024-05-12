package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import kotlin.jvm.internal.o;

/* renamed from: X.Tcl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75043Tcl extends C0A6 {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ MultiLiveAsAnchorListDialogV2 LJLILLLLZI;

    public C75043Tcl(int i, MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2) {
        this.LJLIL = i;
        this.LJLILLLLZI = multiLiveAsAnchorListDialogV2;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        boolean z;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (this.LJLILLLLZI.LJJJLL() && this.LJLIL == 0) {
            MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LJLILLLLZI;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            multiLiveAsAnchorListDialogV2.LLJJJIL = z;
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        int i3;
        o.LJIIIZ(recyclerView, "recyclerView");
        int i4 = this.LJLIL;
        if (this.LJLILLLLZI.LJJJLL()) {
            ViewPager viewPager = this.LJLILLLLZI.LJLLLLLL;
            if (viewPager != null) {
                i3 = viewPager.getCurrentItem();
            } else {
                o.LJIJI("viewPager");
                throw null;
            }
        } else {
            i3 = 0;
        }
        if (i4 != i3) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onScrolled return as tabIndex:");
            C1DD.LJFF(LIZ, this.LJLIL, LIZ, "MultiLiveAsAnchorListDialogV2");
        } else if ((recyclerView.getLayoutManager() instanceof LinearLayoutManager) && (recyclerView.getAdapter() instanceof C31413CUn)) {
            C0A2 layoutManager = recyclerView.getLayoutManager();
            o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            this.LJLILLLLZI.LJJLJ((LinearLayoutManager) layoutManager, recyclerView);
        }
    }
}
