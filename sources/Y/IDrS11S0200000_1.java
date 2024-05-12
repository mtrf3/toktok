package Y;

import X.C0A6;
import X.C108824Ow;
import X.C114194dz;
import X.P1W;
import X.SYL;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.assem.VideoStickerContentListAssem$list$2$1$lm$1;
import com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.SharePanelWidget;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDrS11S0200000_1 extends C0A6 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        switch (this.$t) {
            case 0:
                LJIILJJIL$0(this, i, recyclerView);
                return;
            default:
                super.LJIILJJIL(i, recyclerView);
                return;
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 1:
                LJIILL$0(this, recyclerView, i, i2);
                return;
            case 2:
                LJIILL$1(this, recyclerView, i, i2);
                return;
            case 3:
                LJIILL$2(this, recyclerView, i, i2);
                return;
            default:
                super.LJIILL(recyclerView, i, i2);
                return;
        }
    }

    public IDrS11S0200000_1(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void LJIILJJIL$0(IDrS11S0200000_1 iDrS11S0200000_1, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0 && !((SYL) iDrS11S0200000_1.l0).canScrollVertically(-1)) {
            VideoStickerContentListAssem$list$2$1$lm$1 videoStickerContentListAssem$list$2$1$lm$1 = (VideoStickerContentListAssem$list$2$1$lm$1) iDrS11S0200000_1.l1;
            videoStickerContentListAssem$list$2$1$lm$1.LLIFFJFJJ.LIZIZ();
            videoStickerContentListAssem$list$2$1$lm$1.LJZ();
            ((SYL) iDrS11S0200000_1.l0).LJJJJZI();
        }
    }

    public static final void LJIILL$0(IDrS11S0200000_1 iDrS11S0200000_1, RecyclerView recyclerView, int i, int i2) {
        int i3;
        o.LJIIIZ(recyclerView, "recyclerView");
        C114194dz c114194dz = ((P1W) iDrS11S0200000_1.l0).LJLJI;
        if (c114194dz != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) iDrS11S0200000_1.l1;
            if (linearLayoutManager != null) {
                i3 = linearLayoutManager.LLILL() - ((P1W) iDrS11S0200000_1.l0).LJLLILLLL;
            } else {
                i3 = 0;
            }
            c114194dz.setRecycleViewPos(i3);
        }
    }

    public static final void LJIILL$1(IDrS11S0200000_1 iDrS11S0200000_1, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((C108824Ow) iDrS11S0200000_1.l0).LIZLLL(i, (LinearLayoutManager) iDrS11S0200000_1.l1);
    }

    public static final void LJIILL$2(IDrS11S0200000_1 iDrS11S0200000_1, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((SharePanelWidget) iDrS11S0200000_1.l0).LIZLLL(i, (LinearLayoutManager) iDrS11S0200000_1.l1);
    }
}
