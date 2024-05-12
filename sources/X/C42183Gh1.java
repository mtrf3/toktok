package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Gh1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42183Gh1 extends AbstractC030309z {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ C42176Ggu LJLILLLLZI;

    public C42183Gh1(Context context, C42176Ggu c42176Ggu) {
        this.LJLIL = context;
        this.LJLILLLLZI = c42176Ggu;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        int LIZJ = C1JX.LIZJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state", view);
        if (LIZJ == -1) {
            return;
        }
        int LIZIZ = (int) C74275TDb.LIZIZ(this.LJLIL, 4.0f);
        int LIZIZ2 = C7MY.LIZIZ(16);
        if (LIZJ == 0) {
            if (C90193gN.LIZIZ(this.LJLIL)) {
                rect.set(LIZIZ, 0, LIZIZ2, 0);
                return;
            } else {
                rect.set(LIZIZ2, 0, LIZIZ, 0);
                return;
            }
        }
        if (LIZJ == this.LJLILLLLZI.LJLIL.getItemCount() - 1) {
            if (C90193gN.LIZIZ(this.LJLIL)) {
                rect.set(LIZIZ2, 0, LIZIZ, 0);
                return;
            } else {
                rect.set(LIZIZ, 0, LIZIZ2, 0);
                return;
            }
        }
        rect.set(LIZIZ, 0, LIZIZ, 0);
    }
}
