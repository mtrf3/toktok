package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.ApZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27425ApZ extends AbstractC27419ApT<C27426Apa> {
    @Override // X.AbstractC27419ApT, X.AbstractC029409q
    public final long getItemId(int i) {
        return i;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return R.layout.a4m;
    }

    public C27425ApZ(InterfaceC88471Ynr<? super Integer, ? super C27426Apa, C76800UCe> interfaceC88471Ynr) {
        super(interfaceC88471Ynr, 2);
    }

    @Override // X.AbstractC27419ApT
    public final View LJLLLLLL(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return C72545SdZ.LIZJ(parent, "parent.context", R.layout.a4m, parent, false);
    }

    @Override // X.AbstractC27419ApT
    /* renamed from: LJLZ */
    public final void onBindViewHolder(C27422ApW holder, int i) {
        o.LJIIIZ(holder, "holder");
        super.onBindViewHolder(holder, i);
        int LIZ = C1EU.LIZ(holder.itemView, "context", R.attr.dz);
        C27426Apa item = getItem(i);
        View view = holder.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) (layoutParams.width / item.LJLIL.getRadio());
        view.setLayoutParams(layoutParams);
        W5F LIZLLL = C70759Rpr.LIZLLL(item.LJLIL.toThumbFirstImageUrlModel());
        S3I s3i = new S3I();
        s3i.LIZLLL = C45804HyK.LJJ(2);
        float LJJ = C45804HyK.LJJ(0.5f);
        s3i.LIZJ = LIZ;
        s3i.LIZIZ = LJJ;
        LIZLLL.LJIJJLI = new S3L(s3i);
        SmartImageView smartImageView = (SmartImageView) holder.itemView.findViewById(R.id.k9b);
        o.LJII(smartImageView, "null cannot be cast to non-null type com.bytedance.lighten.loader.SmartImageView");
        LIZLLL.LJJIIJ = smartImageView;
        L9G.LIZ(LIZLLL);
        if (item.LJLILLLLZI) {
            holder.itemView.findViewById(R.id.jlb).setVisibility(0);
        } else {
            holder.itemView.findViewById(R.id.jlb).setVisibility(4);
        }
        int i2 = C70210Rh0.LIZ[item.LJLJI.ordinal()];
        float f = 1.0f;
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    return;
                }
                holder.itemView.findViewById(R.id.k9b).setAlpha(0.6f);
                View findViewById = holder.itemView.findViewById(R.id.kkw);
                o.LJIIIIZZ(findViewById, "holder.itemView.stock_status_text");
                findViewById.setVisibility(0);
                return;
            }
            View findViewById2 = holder.itemView.findViewById(R.id.k9b);
            if (!item.LJLILLLLZI) {
                f = 0.6f;
            }
            findViewById2.setAlpha(f);
            View findViewById3 = holder.itemView.findViewById(R.id.kkw);
            o.LJIIIIZZ(findViewById3, "holder.itemView.stock_status_text");
            findViewById3.setVisibility(8);
            return;
        }
        holder.itemView.findViewById(R.id.k9b).setAlpha(1.0f);
        View findViewById4 = holder.itemView.findViewById(R.id.kkw);
        o.LJIIIIZZ(findViewById4, "holder.itemView.stock_status_text");
        findViewById4.setVisibility(8);
    }

    @Override // X.AbstractC27419ApT, X.AbstractC029409q
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        onBindViewHolder((C27422ApW) viewHolder, i);
    }
}
