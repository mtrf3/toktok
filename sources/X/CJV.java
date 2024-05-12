package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.viewmodule.QuickCommentWidget;

/* loaded from: classes6.dex */
public final class CJV extends AbstractC030309z {
    public final int LJLIL = C15380j0.LIZ(8.0f);
    public final /* synthetic */ QuickCommentWidget LJLILLLLZI;

    public CJV(QuickCommentWidget quickCommentWidget) {
        this.LJLILLLLZI = quickCommentWidget;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        boolean z;
        T28.LJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state");
        super.LJ(rect, view, recyclerView, c0ac);
        if (C16310kV.LIZLLL(view) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (RecyclerView.LJJJJIZL(view) < this.LJLILLLLZI.LJLILLLLZI.getItemCount() - 1) {
            if (z) {
                rect.left = this.LJLIL;
                rect.right = 0;
                return;
            } else {
                rect.right = this.LJLIL;
                rect.left = 0;
                return;
            }
        }
        rect.left = 0;
        rect.right = 0;
    }
}
