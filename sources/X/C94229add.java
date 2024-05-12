package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.add, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94229add extends RecyclerView.ViewHolder {
    public final TextView LJLIL;

    public C94229add(FrameLayout frameLayout) {
        super(frameLayout);
        View childAt = frameLayout.getChildAt(0);
        if (childAt != null) {
            this.LJLIL = (TextView) childAt;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }
}
