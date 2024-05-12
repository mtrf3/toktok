package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.AoY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC27362AoY extends RecyclerView.ViewHolder implements View.OnClickListener {
    public final boolean LJLIL;
    public InterfaceC27363AoZ LJLILLLLZI;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC27363AoZ interfaceC27363AoZ = this.LJLILLLLZI;
        if (interfaceC27363AoZ != null) {
            interfaceC27363AoZ.onItemClick(getLayoutPosition());
        }
    }

    public ViewOnClickListenerC27362AoY(View view, boolean z) {
        super(view);
        this.LJLIL = z;
        C16880lQ.LJIIJ(this, this.itemView);
    }
}
