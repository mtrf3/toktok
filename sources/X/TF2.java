package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TF2 implements InterfaceC83564Wqu {
    public final /* synthetic */ SearchStickerViewContainer LJLIL;

    @Override // X.InterfaceC83564Wqu
    public final void keyBoardModify(int i) {
    }

    public TF2(SearchStickerViewContainer searchStickerViewContainer) {
        this.LJLIL = searchStickerViewContainer;
    }

    @Override // X.InterfaceC83564Wqu
    public final void keyBoardHide(int i) {
        if (this.LJLIL.LJI()) {
            this.LJLIL.LJZL.setValue(Boolean.FALSE);
            RecyclerView recyclerView = this.LJLIL.LJLJL;
            if (recyclerView != null) {
                if (recyclerView.getVisibility() != 0) {
                    this.LJLIL.LJFF(false);
                    return;
                }
                return;
            }
            o.LJIJI("rvStickerContent");
            throw null;
        }
    }

    @Override // X.InterfaceC83564Wqu
    public final void keyBoardShow(int i) {
        if (!this.LJLIL.LJI()) {
            SearchStickerViewContainer searchStickerViewContainer = this.LJLIL;
            searchStickerViewContainer.LLF = i;
            searchStickerViewContainer.LJZL.setValue(Boolean.TRUE);
        }
    }
}
