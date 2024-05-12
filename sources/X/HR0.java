package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.gamora.recorder.sticker.gallery.GalleryStickerLayoutManger;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HR0 extends C0A6 {
    public int LJLIL;
    public final /* synthetic */ GalleryStickerLayoutManger LJLILLLLZI;

    public HR0(GalleryStickerLayoutManger galleryStickerLayoutManger) {
        this.LJLILLLLZI = galleryStickerLayoutManger;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        View LJFF;
        Integer num;
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLIL = i;
        if (i == 0 && (LJFF = this.LJLILLLLZI.LL.LJFF(recyclerView.getLayoutManager())) != null) {
            if (recyclerView.getLayoutManager() != null) {
                num = Integer.valueOf(C0A2.LJJJLL(LJFF));
            } else {
                num = null;
            }
            int i2 = this.LJLILLLLZI.LJZL;
            if (num == null || num.intValue() != i2) {
                this.LJLILLLLZI.LLF = LJFF;
                LJFF.setSelected(true);
                if (num != null) {
                    this.LJLILLLLZI.LJZL = num.intValue();
                }
            }
            C44058HQw c44058HQw = this.LJLILLLLZI.LLFFF;
            if (c44058HQw != null) {
                RecyclerView.ViewHolder LJJJJJL = recyclerView.LJJJJJL(LJFF);
                o.LJIIIIZZ(LJJJJJL, "recyclerView.getChildViewHolder(snap)");
                c44058HQw.LIZ(LJJJJJL, this.LJLILLLLZI.LJZL);
            }
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        Integer num;
        C44058HQw c44058HQw;
        o.LJIIIZ(recyclerView, "recyclerView");
        View LJFF = this.LJLILLLLZI.LL.LJFF(recyclerView.getLayoutManager());
        if (LJFF != null) {
            if (recyclerView.getLayoutManager() != null) {
                num = Integer.valueOf(C0A2.LJJJLL(LJFF));
            } else {
                num = null;
            }
            int i3 = this.LJLILLLLZI.LJZL;
            if (num == null || num.intValue() != i3) {
                this.LJLILLLLZI.LLF = LJFF;
                LJFF.setSelected(true);
                if (num != null) {
                    this.LJLILLLLZI.LJZL = num.intValue();
                }
                if (this.LJLIL != 0) {
                    return;
                }
                GalleryStickerLayoutManger galleryStickerLayoutManger = this.LJLILLLLZI;
                if (!galleryStickerLayoutManger.LLI && (c44058HQw = galleryStickerLayoutManger.LLFFF) != null) {
                    RecyclerView.ViewHolder LJJJJJL = recyclerView.LJJJJJL(LJFF);
                    o.LJIIIIZZ(LJJJJJL, "recyclerView.getChildViewHolder(snap)");
                    c44058HQw.LIZ(LJJJJJL, this.LJLILLLLZI.LJZL);
                }
            }
        }
    }
}
