package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.ApY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27424ApY extends AbstractC27419ApT<OSZ<? extends String, ? extends Integer>> {
    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return R.layout.a4n;
    }

    public C27424ApY(AqS154S0100000_4 aqS154S0100000_4) {
        super(new AqS186S0100000_4(aqS154S0100000_4, 278), 2);
    }

    @Override // X.AbstractC27419ApT
    public final View LJLLLLLL(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return C72545SdZ.LIZJ(parent, "parent.context", R.layout.a4n, parent, false);
    }

    @Override // X.AbstractC27419ApT
    /* renamed from: LJLZ */
    public final void onBindViewHolder(C27422ApW holder, int i) {
        o.LJIIIZ(holder, "holder");
        super.onBindViewHolder(holder, i);
        ((TextView) holder.itemView.findViewById(R.id.n2r)).setText(getItem(i).getFirst());
        holder.itemView.setPadding(getItem(i).getSecond().intValue(), 0, 0, 0);
    }

    @Override // X.AbstractC27419ApT, X.AbstractC029409q
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        onBindViewHolder((C27422ApW) viewHolder, i);
    }
}
