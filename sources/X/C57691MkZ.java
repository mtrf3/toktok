package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager;

/* renamed from: X.MkZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C57691MkZ extends C0A6 {
    public int LJLIL;
    public boolean LJLILLLLZI;
    public final /* synthetic */ GalleryLayoutManager LJLJI;

    public C57691MkZ(GalleryLayoutManager galleryLayoutManager) {
        this.LJLJI = galleryLayoutManager;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        this.LJLIL = i;
        if (i == 0) {
            this.LJLJI.getClass();
            View LJFF = this.LJLJI.LLF.LJFF(recyclerView.getLayoutManager());
            if (LJFF != null) {
                recyclerView.getLayoutManager().getClass();
                int LJJJLL = C0A2.LJJJLL(LJFF);
                GalleryLayoutManager galleryLayoutManager = this.LJLJI;
                int i2 = galleryLayoutManager.LJZL;
                if (LJJJLL != i2) {
                    View view = galleryLayoutManager.LL;
                    if (view != null) {
                        view.setSelected(false);
                    }
                    this.LJLJI.LL = LJFF;
                    LJFF.setSelected(true);
                    GalleryLayoutManager galleryLayoutManager2 = this.LJLJI;
                    galleryLayoutManager2.LJZL = LJJJLL;
                    if (galleryLayoutManager2.LLII != null) {
                        galleryLayoutManager2.LLIILZL(LJJJLL, LJFF, recyclerView);
                        return;
                    }
                    return;
                }
                if (galleryLayoutManager.LLII == null || !this.LJLILLLLZI) {
                    return;
                }
                this.LJLILLLLZI = false;
                galleryLayoutManager.LLIILZL(i2, LJFF, recyclerView);
                return;
            }
            return;
        }
        this.LJLJI.getClass();
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        View LJFF = this.LJLJI.LLF.LJFF(recyclerView.getLayoutManager());
        if (LJFF != null) {
            recyclerView.getLayoutManager().getClass();
            int LJJJLL = C0A2.LJJJLL(LJFF);
            GalleryLayoutManager galleryLayoutManager = this.LJLJI;
            if (LJJJLL != galleryLayoutManager.LJZL) {
                View view = galleryLayoutManager.LL;
                if (view != null) {
                    view.setSelected(false);
                }
                this.LJLJI.LL = LJFF;
                LJFF.setSelected(true);
                GalleryLayoutManager galleryLayoutManager2 = this.LJLJI;
                galleryLayoutManager2.LJZL = LJJJLL;
                if (this.LJLIL != 0) {
                    this.LJLILLLLZI = true;
                } else if (galleryLayoutManager2.LLII != null) {
                    galleryLayoutManager2.LLIILZL(LJJJLL, LJFF, recyclerView);
                }
            }
        }
    }
}
