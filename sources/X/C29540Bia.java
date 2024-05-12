package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.ui.landscapefeeds.LiveLandNoMoreFragment;

/* renamed from: X.Bia, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29540Bia extends AbstractC030309z {
    public final int LJLIL = C15380j0.LIZ(2.0f);
    public final /* synthetic */ LiveLandNoMoreFragment LJLILLLLZI;

    public C29540Bia(LiveLandNoMoreFragment liveLandNoMoreFragment) {
        this.LJLILLLLZI = liveLandNoMoreFragment;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        int i;
        T28.LJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state");
        super.LJ(rect, view, recyclerView, c0ac);
        int LJJJJIZL = RecyclerView.LJJJJIZL(view);
        B9U b9u = this.LJLILLLLZI.LJLJJI;
        if (b9u != null) {
            i = b9u.getItemCount();
        } else {
            i = 0;
        }
        if (LJJJJIZL < i - 1) {
            if (C15380j0.LJIIZILJ()) {
                rect.left = this.LJLIL;
                rect.right = 0;
                return;
            } else {
                rect.left = 0;
                rect.right = this.LJLIL;
                return;
            }
        }
        rect.left = 0;
        rect.right = 0;
    }
}
