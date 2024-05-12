package X;

import Y.IDrS12S0200000_7;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.gamora.recorder.sticker.gallery.GalleryStickerLayoutManger;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HQy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44060HQy implements InterfaceC44054HQs {
    public final ViewGroup LIZ;
    public final HQU LIZIZ;
    public final OSZ<Integer, Integer> LIZJ;
    public final InterfaceC88472Yns<Integer, C76800UCe> LIZLLL;

    @Override // X.InterfaceC44054HQs
    public final void LIZ() {
        ((RecyclerView) this.LIZ.findViewById(R.id.k4z)).LJIIJJI(new IDrS12S0200000_7(this, 1));
        RecyclerView recyclerView = (RecyclerView) this.LIZ.findViewById(R.id.k4z);
        GalleryStickerLayoutManger galleryStickerLayoutManger = new GalleryStickerLayoutManger(C90193gN.LIZ());
        galleryStickerLayoutManger.LLI = true;
        RecyclerView recyclerView2 = (RecyclerView) this.LIZ.findViewById(R.id.k4z);
        if (recyclerView2 != null) {
            galleryStickerLayoutManger.LLFF = recyclerView2;
            galleryStickerLayoutManger.LJZI = Math.max(0, -1);
            recyclerView2.setLayoutManager(galleryStickerLayoutManger);
            galleryStickerLayoutManger.LL.LIZIZ(recyclerView2);
            recyclerView2.LJIIJJI(galleryStickerLayoutManger.LLD);
            galleryStickerLayoutManger.LLFFF = new C44058HQw(this);
            recyclerView.setLayoutManager(galleryStickerLayoutManger);
            View findViewById = this.LIZ.findViewById(R.id.hen);
            o.LJIIIIZZ(findViewById, "rootView.outlineView");
            C87277YNd.LJJIJIIJI(findViewById, true);
            ViewGroup.LayoutParams layoutParams = this.LIZ.findViewById(R.id.hen).getLayoutParams();
            layoutParams.width = this.LIZJ.getFirst().intValue();
            layoutParams.height = this.LIZJ.getSecond().intValue();
            this.LIZ.findViewById(R.id.hen).setLayoutParams(layoutParams);
            return;
        }
        "The attach RecycleView must not null!!".toString();
        throw new IllegalArgumentException("The attach RecycleView must not null!!");
    }

    public C44060HQy(ViewGroup rootView, HQU previewContext, OSZ osz, AqS173S0100000_7 aqS173S0100000_7) {
        o.LJIIIZ(rootView, "rootView");
        o.LJIIIZ(previewContext, "previewContext");
        this.LIZ = rootView;
        this.LIZIZ = previewContext;
        this.LIZJ = osz;
        this.LIZLLL = aqS173S0100000_7;
    }
}
