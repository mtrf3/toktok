package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.GqG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42756GqG extends AbstractC030309z {
    public final int LJLIL;

    public C42756GqG(int i) {
        this.LJLIL = i;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        T28.LJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state");
        rect.left = this.LJLIL;
    }
}
