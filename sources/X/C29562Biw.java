package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Biw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29562Biw extends AbstractC030309z {
    public final int LJLIL;
    public final List<Integer> LJLILLLLZI;

    public C29562Biw(List indexes) {
        o.LJIIIZ(indexes, "indexes");
        this.LJLIL = 8;
        this.LJLILLLLZI = indexes;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        int LIZJ = C1JX.LIZJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state", view);
        if (LIZJ != 0 && this.LJLILLLLZI.contains(Integer.valueOf(LIZJ))) {
            rect.top = C7MY.LIZIZ(this.LJLIL);
        } else {
            rect.top = 0;
        }
    }
}
