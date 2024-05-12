package X;

import Y.ACListenerS30S0300000_4;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.ApP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27415ApP extends AbstractC27419ApT<District> {
    public C27415ApP() {
        throw null;
    }

    public C27415ApP(AqS170S0100000_4 aqS170S0100000_4) {
        super(true, (InterfaceC88471Ynr) new AqS186S0100000_4(aqS170S0100000_4, 287));
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (getItem(i).showIndex) {
            return R.layout.yt;
        }
        return R.layout.yq;
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLJJL = recyclerView;
    }

    @Override // X.AbstractC27419ApT
    /* renamed from: LJLZ */
    public final void onBindViewHolder(C27422ApW holder, int i) {
        boolean z;
        int i2;
        int i3;
        String str;
        o.LJIIIZ(holder, "holder");
        View view = holder.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        if (i < getItemCount() - 1) {
            z = true;
        } else {
            z = false;
        }
        C26508Aam.LIZ(view, z);
        District item = getItem(i);
        Context ctx = holder.itemView.getContext();
        if (item.showIndex) {
            TextView textView = (TextView) holder.itemView.findViewById(R.id.ekv);
            if (o.LJ(item.index, "[")) {
                str = "#";
            } else {
                str = item.index;
            }
            textView.setText(str);
        }
        ((TextView) holder.itemView.findViewById(R.id.esz)).setText(item.name);
        TextView textView2 = (TextView) holder.itemView.findViewById(R.id.esz);
        int[][] iArr = {new int[]{android.R.attr.state_selected}, new int[0]};
        int[] iArr2 = new int[2];
        o.LJIIIIZZ(ctx, "ctx");
        Integer LJI = C79045V0n.LJI(R.attr.eb, ctx);
        if (LJI != null) {
            i2 = LJI.intValue();
        } else {
            i2 = 0;
        }
        iArr2[0] = i2;
        Integer LJI2 = C79045V0n.LJI(R.attr.go, ctx);
        if (LJI2 != null) {
            i3 = LJI2.intValue();
        } else {
            i3 = 0;
        }
        iArr2[1] = i3;
        textView2.setTextColor(new ColorStateList(iArr, iArr2));
        if (i == this.LJLJJI) {
            ((TuxTextView) holder.itemView.findViewById(R.id.esz)).setTuxFont(42);
            ((TextView) holder.itemView.findViewById(R.id.esz)).setSelected(true);
        } else {
            ((TuxTextView) holder.itemView.findViewById(R.id.esz)).setTuxFont(41);
            ((TextView) holder.itemView.findViewById(R.id.esz)).setSelected(false);
        }
        TuxTextView tuxTextView = (TuxTextView) holder.itemView.findViewById(R.id.esz);
        o.LJIIIIZZ(tuxTextView, "holder.itemView.item");
        C16880lQ.LJIIJ(new ViewOnClickListenerC27418ApS(tuxTextView, Integer.valueOf(LiveMaxRetainAlogMessageSizeSetting.DEFAULT), Boolean.TRUE, C27100AkK.LIZ(), new ACListenerS30S0300000_4(this, holder, item, 18)), tuxTextView);
    }

    @Override // X.AbstractC27419ApT, X.AbstractC029409q
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        onBindViewHolder((C27422ApW) viewHolder, i);
    }
}
