package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.Smt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73123Smt extends AbstractC030309z {
    public final /* synthetic */ C73124Smu LJLIL;

    public C73123Smt(C73124Smu c73124Smu) {
        this.LJLIL = c73124Smu;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        int LIZJ = C1JX.LIZJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state", view);
        if (LIZJ == -1) {
            return;
        }
        if (LIZJ == 0) {
            if (C74275TDb.LJI(this.LJLIL)) {
                rect.right = this.LJLIL.LLLFF;
            } else {
                rect.left = this.LJLIL.LLLFF;
            }
        }
        o.LJI(recyclerView.getAdapter());
        if (LIZJ == r0.getItemCount() - 1) {
            if (C74275TDb.LJI(this.LJLIL)) {
                rect.left = this.LJLIL.LLLFFI;
                return;
            } else {
                rect.right = this.LJLIL.LLLFFI;
                return;
            }
        }
        if (C74275TDb.LJI(this.LJLIL)) {
            rect.left = this.LJLIL.LLLF;
        } else {
            rect.right = this.LJLIL.LLLF;
        }
    }
}
