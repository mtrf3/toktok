package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.views.SpannedGridLayoutManager;
import com.ss.android.ugc.gamora.recorder.sticker.gallery.GalleryStickerLayoutManger;
import kotlin.jvm.internal.o;

/* renamed from: X.Vc4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80096Vc4 extends C1C9 {
    public C80096Vc4(Context context) {
        super(context);
    }

    @Override // X.C1C9, X.C0AB
    public final void LJFF(View targetView, C0AC state, C0A9 action) {
        GalleryStickerLayoutManger galleryStickerLayoutManger;
        int i;
        o.LJIIIZ(targetView, "targetView");
        o.LJIIIZ(state, "state");
        o.LJIIIZ(action, "action");
        C0A2 c0a2 = this.LIZJ;
        if (c0a2 instanceof GalleryStickerLayoutManger) {
            galleryStickerLayoutManger = (GalleryStickerLayoutManger) c0a2;
        } else {
            galleryStickerLayoutManger = null;
        }
        int i2 = 0;
        if (galleryStickerLayoutManger != null) {
            ViewGroup.LayoutParams layoutParams = targetView.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            C28851Bh c28851Bh = new C28851Bh(galleryStickerLayoutManger);
            i = ((int) galleryStickerLayoutManger.LLFII) - ((c28851Bh.LJ(targetView) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + ((int) (((c28851Bh.LIZIZ(targetView) + r4.rightMargin) - r5) / 2.0f)));
        } else {
            i = 0;
        }
        C0A2 c0a22 = this.LIZJ;
        if ((c0a22 instanceof GalleryStickerLayoutManger) && c0a22 != null && (c0a22 instanceof SpannedGridLayoutManager)) {
            ViewGroup.LayoutParams layoutParams2 = targetView.getLayoutParams();
            o.LJII(layoutParams2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            int top = (targetView.getTop() - C0A2.LJJLI(targetView)) - marginLayoutParams.topMargin;
            int LJJIZ = C0A2.LJJIZ(targetView) + targetView.getBottom() + marginLayoutParams.bottomMargin;
            int paddingTop = c0a22.getPaddingTop();
            i2 = ((int) (((c0a22.LJLLLLLL - c0a22.getPaddingBottom()) - paddingTop) / 2.0f)) - (top + ((int) ((LJJIZ - top) / 2.0f)));
        }
        float f = i;
        float f2 = f * 1.0f * f;
        float f3 = i2;
        int LJIIJJI = LJIIJJI((int) Math.sqrt((1.0f * f3 * f3) + f2));
        if (LJIIJJI > 0) {
            action.LIZIZ(-i, -i2, LJIIJJI, this.LJIIIIZZ);
        }
    }
}
