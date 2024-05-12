package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.sticker.StickerWrapper;
import kotlin.jvm.internal.o;

/* renamed from: X.Vx4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81398Vx4 {
    public final /* synthetic */ C81489VyX LIZ;

    public C81398Vx4(C81489VyX c81489VyX) {
        this.LIZ = c81489VyX;
    }

    public final void LIZ(int i) {
        StickerWrapper stickerWrapper;
        C81541VzN c81541VzN;
        C160726Sm c160726Sm = this.LIZ.LJLJI;
        if (c160726Sm != null) {
            RecyclerView.ViewHolder LJJIZ = c160726Sm.LJJIZ(i);
            if ((LJJIZ instanceof C81541VzN) && (c81541VzN = (C81541VzN) LJJIZ) != null) {
                c81541VzN.N(true);
            }
            C81539VzL c81539VzL = this.LIZ.LJLLLLLL;
            if (c81539VzL != null) {
                stickerWrapper = (StickerWrapper) ListProtector.get(c81539VzL.LJLJJI, i);
            } else {
                stickerWrapper = null;
            }
            C81489VyX c81489VyX = this.LIZ;
            if (stickerWrapper != null) {
                TuxTextView tuxTextView = c81489VyX.LJLL;
                if (tuxTextView != null) {
                    tuxTextView.setText(stickerWrapper.mEffect.getName());
                } else {
                    o.LJIJI("duetName");
                    throw null;
                }
            }
            TuxTextView tuxTextView2 = this.LIZ.LJLL;
            if (tuxTextView2 != null) {
                tuxTextView2.setVisibility(8);
                C81489VyX c81489VyX2 = this.LIZ;
                if (c81489VyX2.LL) {
                    TuxTextView tuxTextView3 = c81489VyX2.LJLL;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setAlpha(1.0f);
                        tuxTextView3.setVisibility(0);
                        tuxTextView3.animate().setStartDelay(600L).alpha(0.0f).setDuration(c81489VyX2.LJZ).setListener(null);
                        return;
                    }
                    o.LJIJI("duetName");
                    throw null;
                }
                return;
            }
            o.LJIJI("duetName");
            throw null;
        }
        o.LJIJI("modeRecyclerView");
        throw null;
    }
}
