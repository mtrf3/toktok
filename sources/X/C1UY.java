package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1UY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1UY extends AbstractC030309z {
    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        boolean equals;
        super.LJ(rect, view, recyclerView, c0ac);
        recyclerView.getClass();
        if (RecyclerView.LJJJJIZL(view) == 0) {
            if (C15380j0.LIZLLL() == null) {
                equals = false;
            } else {
                equals = "ar".equals(C15380j0.LIZLLL().getResources().getConfiguration().locale.getLanguage());
            }
            if (equals) {
                rect.set(0, 0, C15380j0.LIZ(6.0f), 0);
                return;
            } else {
                rect.set(C15380j0.LIZ(6.0f), 0, 0, 0);
                return;
            }
        }
        rect.set(0, 0, 0, 0);
    }
}
