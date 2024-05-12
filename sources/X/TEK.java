package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TEK extends C0A6 {
    public int LJLIL;
    public final /* synthetic */ StickerCategoryFragment LJLILLLLZI;

    public TEK(StickerCategoryFragment stickerCategoryFragment) {
        this.LJLILLLLZI = stickerCategoryFragment;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (this.LJLILLLLZI.xl().LJFF.LJLLI) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        W5I.LIZ().LJIIJJI();
                    }
                } else if (this.LJLIL == 2) {
                    W5I.LIZ().LJIIJJI();
                } else {
                    W6J LIZ = W5I.LIZ();
                    o.LJIIIIZZ(LIZ, "Fresco.getImagePipeline()");
                    if (LIZ.LJIIJ()) {
                        W5I.LIZ().LJIILL();
                    }
                }
            } else {
                W6J LIZ2 = W5I.LIZ();
                o.LJIIIIZZ(LIZ2, "Fresco.getImagePipeline()");
                if (LIZ2.LJIIJ()) {
                    W5I.LIZ().LJIILL();
                }
            }
        }
        this.LJLIL = i;
        if (i == 0) {
            StickerCategoryFragment stickerCategoryFragment = this.LJLILLLLZI;
            if (stickerCategoryFragment.LJLLJ) {
                stickerCategoryFragment.LJLLJ = false;
                return;
            }
            return;
        }
        if (1 != i) {
            return;
        }
        this.LJLILLLLZI.LJLLJ = true;
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        StickerCategoryFragment stickerCategoryFragment = this.LJLILLLLZI;
        if (stickerCategoryFragment.LJLLJ) {
            stickerCategoryFragment.Ql();
        }
    }
}
