package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1Bl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28891Bl implements C0AV {
    public final /* synthetic */ RecyclerView LIZ;

    public final int LIZ() {
        return this.LIZ.getChildCount();
    }

    public C28891Bl(RecyclerView recyclerView) {
        this.LIZ = recyclerView;
    }

    public final void LIZIZ(int i) {
        View childAt = this.LIZ.getChildAt(i);
        if (childAt != null) {
            this.LIZ.LJIJI(childAt);
            childAt.clearAnimation();
        }
        RecyclerView recyclerView = this.LIZ;
        try {
            if (C78996UzQ.LJJIIJZLJL(recyclerView.getChildAt(i))) {
                C78996UzQ.LJI();
            }
        } catch (Throwable unused) {
        }
        recyclerView.removeViewAt(i);
    }
}
