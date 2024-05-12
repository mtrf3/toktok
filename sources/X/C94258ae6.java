package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.ae6, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94258ae6 extends RecyclerView.ViewHolder {
    public final ImageView LJLIL;
    public final TextView LJLILLLLZI;

    public C94258ae6(ViewGroup viewGroup) {
        super(viewGroup);
        View childAt = viewGroup.getChildAt(0);
        if (childAt != null) {
            this.LJLIL = (ImageView) childAt;
            View childAt2 = viewGroup.getChildAt(1);
            if (childAt2 != null) {
                this.LJLILLLLZI = (TextView) childAt2;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
    }
}
