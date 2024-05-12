package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeGalleryLayoutManager;
import kotlin.jvm.internal.o;

/* renamed from: X.MkY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57690MkY extends C0A6 {
    public int LJLIL;
    public boolean LJLILLLLZI;
    public final /* synthetic */ RecSwipeGalleryLayoutManager LJLJI;

    public C57690MkY(RecSwipeGalleryLayoutManager recSwipeGalleryLayoutManager) {
        this.LJLJI = recSwipeGalleryLayoutManager;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        Integer num;
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLIL = i;
        String msg = KMP.LJ("onScrollStateChanged: ", i);
        o.LJIIIZ(msg, "msg");
        if (this.LJLIL == 0) {
            View LJFF = this.LJLJI.LLF.LJFF(recyclerView.getLayoutManager());
            if (LJFF != null) {
                if (recyclerView.getLayoutManager() != null) {
                    num = Integer.valueOf(C0A2.LJJJLL(LJFF));
                } else {
                    num = null;
                }
                int i2 = this.LJLJI.LJZL;
                if (num == null || num.intValue() != i2) {
                    View view = this.LJLJI.LL;
                    if (view != null) {
                        view.setSelected(false);
                    }
                    this.LJLJI.LL = LJFF;
                    LJFF.setSelected(true);
                    if (num != null) {
                        this.LJLJI.LJZL = num.intValue();
                    }
                    RecSwipeGalleryLayoutManager recSwipeGalleryLayoutManager = this.LJLJI;
                    C57616MjM c57616MjM = recSwipeGalleryLayoutManager.LLII;
                    if (c57616MjM != null) {
                        c57616MjM.LIZ(recSwipeGalleryLayoutManager.LJZL);
                        return;
                    }
                    return;
                }
                this.LJLJI.getClass();
                RecSwipeGalleryLayoutManager recSwipeGalleryLayoutManager2 = this.LJLJI;
                C57616MjM c57616MjM2 = recSwipeGalleryLayoutManager2.LLII;
                if (c57616MjM2 == null || !this.LJLILLLLZI) {
                    return;
                }
                this.LJLILLLLZI = false;
                c57616MjM2.LIZ(recSwipeGalleryLayoutManager2.LJZL);
                return;
            }
            C221018lt.LIZIZ("TTRecGalleryLayoutManager", "onScrollStateChanged: snap null");
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        Integer num;
        o.LJIIIZ(recyclerView, "recyclerView");
        View LJFF = this.LJLJI.LLF.LJFF(recyclerView.getLayoutManager());
        if (LJFF != null) {
            if (recyclerView.getLayoutManager() != null) {
                num = Integer.valueOf(C0A2.LJJJLL(LJFF));
            } else {
                num = null;
            }
            int i3 = this.LJLJI.LJZL;
            if (num == null || num.intValue() != i3) {
                View view = this.LJLJI.LL;
                if (view != null) {
                    view.setSelected(false);
                }
                this.LJLJI.LL = LJFF;
                LJFF.setSelected(true);
                if (num != null) {
                    this.LJLJI.LJZL = num.intValue();
                }
                this.LJLJI.getClass();
                if (this.LJLIL != 0) {
                    this.LJLILLLLZI = true;
                    return;
                }
                RecSwipeGalleryLayoutManager recSwipeGalleryLayoutManager = this.LJLJI;
                C57616MjM c57616MjM = recSwipeGalleryLayoutManager.LLII;
                if (c57616MjM != null) {
                    c57616MjM.LIZ(recSwipeGalleryLayoutManager.LJZL);
                }
            }
        }
        String msg = C48263Iwt.LIZLLL("onScrolled: dx:", i, ",dy:", i2);
        o.LJIIIZ(msg, "msg");
    }
}
