package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Vy1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81457Vy1 extends C0A6 {
    public boolean LJLIL;
    public final /* synthetic */ StaggeredGridLayoutManager LJLILLLLZI;
    public final /* synthetic */ C81455Vxz LJLJI;

    public C81457Vy1(StaggeredGridLayoutManager staggeredGridLayoutManager, C81455Vxz c81455Vxz) {
        this.LJLILLLLZI = staggeredGridLayoutManager;
        this.LJLJI = c81455Vxz;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        int i2;
        View LJJIJIL;
        o.LJIIIZ(recyclerView, "recyclerView");
        Integer LJJJZ = ORY.LJJJZ(this.LJLILLLLZI.LLILII(null));
        if (LJJJZ != null) {
            i2 = LJJJZ.intValue();
        } else {
            i2 = 0;
        }
        if (i == 0 && !this.LJLIL && this.LJLJI.LJLLILLLL && this.LJLILLLLZI.LJJJI() > 0 && i2 == this.LJLILLLLZI.LJJJJZ() - 1 && (LJJIJIL = this.LJLILLLLZI.LJJIJIL(i2)) != null && LJJIJIL.getGlobalVisibleRect(new Rect())) {
            this.LJLIL = true;
            TuxTextView tuxTextView = this.LJLJI.LJLJL;
            if (tuxTextView != null) {
                tuxTextView.setVisibility(4);
                T4X t4x = this.LJLJI.LJLJLJ;
                if (t4x != null) {
                    t4x.setVisibility(0);
                    T4X t4x2 = this.LJLJI.LJLJLJ;
                    if (t4x2 != null) {
                        t4x2.LIZIZ();
                        InterfaceC81454Vxy commentAndQuestionStickerPanelApi = this.LJLJI.getCommentAndQuestionStickerPanelApi();
                        EnumC81461Vy5 itemType = this.LJLJI.getItemType();
                        C81455Vxz c81455Vxz = this.LJLJI;
                        commentAndQuestionStickerPanelApi.jk(itemType, c81455Vxz.LJLLI, new AqS161S0200000_14(c81455Vxz, this, 75));
                        return;
                    }
                    o.LJIJI("loadMoreDoubleBall");
                    throw null;
                }
                o.LJIJI("loadMoreDoubleBall");
                throw null;
            }
            o.LJIJI("loadMoreText");
            throw null;
        }
    }
}
