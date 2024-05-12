package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.ApR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27417ApR extends AbstractC27419ApT<String> {
    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return R.layout.ys;
    }

    public C27417ApR(AqS170S0100000_4 aqS170S0100000_4) {
        super(new AqS186S0100000_4(aqS170S0100000_4, 293), 2);
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLJJL = recyclerView;
    }

    @Override // X.AbstractC27419ApT
    /* renamed from: LJLZ */
    public final void onBindViewHolder(C27422ApW holder, int i) {
        int i2;
        int i3;
        o.LJIIIZ(holder, "holder");
        super.onBindViewHolder(holder, i);
        Context ctx = holder.itemView.getContext();
        ((TextView) holder.itemView.findViewById(R.id.gvs)).setText(getItem(i));
        TextView textView = (TextView) holder.itemView.findViewById(R.id.gvs);
        int i4 = 0;
        int[][] iArr = {new int[]{android.R.attr.state_selected}, new int[0]};
        int[] iArr2 = new int[2];
        o.LJIIIIZZ(ctx, "ctx");
        Integer LJI = C79045V0n.LJI(R.attr.go, ctx);
        if (LJI != null) {
            i2 = LJI.intValue();
        } else {
            i2 = 0;
        }
        iArr2[0] = i2;
        Integer LJI2 = C79045V0n.LJI(R.attr.gv, ctx);
        if (LJI2 != null) {
            i3 = LJI2.intValue();
        } else {
            i3 = 0;
        }
        iArr2[1] = i3;
        textView.setTextColor(new ColorStateList(iArr, iArr2));
        View findViewById = holder.itemView.findViewById(R.id.el4);
        o.LJIIIIZZ(findViewById, "holder.itemView.indicator");
        if (i != this.LJLJJI) {
            i4 = 8;
        }
        findViewById.setVisibility(i4);
    }

    @Override // X.AbstractC27419ApT, X.AbstractC029409q
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        onBindViewHolder((C27422ApW) viewHolder, i);
    }
}
