package X;

import Y.ACListenerS29S0101000_12;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* loaded from: classes13.dex */
public abstract class SR0<VH extends RecyclerView.ViewHolder> extends AbstractC029409q<VH> {
    public SR1 LJLIL;

    @Override // X.AbstractC029409q
    public void onBindViewHolder(VH vh, int i) {
        View view;
        if (vh != null && (view = vh.itemView) != null) {
            C16880lQ.LJIIJ(new ACListenerS29S0101000_12(i, this, 2), view);
        }
    }
}
