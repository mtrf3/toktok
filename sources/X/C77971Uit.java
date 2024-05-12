package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Uit, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77971Uit extends CZA<C78017Ujd, C78019Ujf> {
    public C77971Uit() {
        super(R.layout.di2, Boolean.FALSE);
    }

    @Override // X.CZA, X.AbstractC31414CUo
    public final void LJFF(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.LJFF(holder);
        holder.itemView.setVisibility(4);
    }

    @Override // X.CZA, X.AbstractC31414CUo
    public final void LIZ(RecyclerView.ViewHolder holder, Object p1) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(p1, "p1");
        holder.itemView.setVisibility(0);
        try {
            T4V t4v = (T4V) holder.itemView.findViewById(R.id.cfh);
            if (t4v != null) {
                t4v.LIZIZ();
            }
        } catch (Exception unused) {
            C0NB.LIZLLL("RankListItemLoadingViewHolder loading view had replace");
        }
    }

    @Override // X.CZA
    public final C78019Ujf LJI(View view, ViewGroup viewGroup) {
        if (viewGroup != null) {
            view.getLayoutParams().height = viewGroup.getHeight();
        }
        return new C78019Ujf(view);
    }
}
