package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Jbq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49506Jbq extends AbstractC030309z {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        Object first;
        Object second;
        OSZ LIZ = C49508Jbs.LIZ(C1JX.LIZJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state", view), c0ac.LIZIZ());
        if (C90193gN.LIZ()) {
            first = LIZ.getSecond();
        } else {
            first = LIZ.getFirst();
        }
        rect.left = ((Number) first).intValue();
        if (C90193gN.LIZ()) {
            second = LIZ.getFirst();
        } else {
            second = LIZ.getSecond();
        }
        rect.right = ((Number) second).intValue();
    }
}
