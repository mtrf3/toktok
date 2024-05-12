package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.RankOptimizeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CZ8 extends CZA<C78006UjS, CZ6> {
    public final DataChannel LIZLLL;
    public final CZ9 LJ;

    @Override // X.CZA, X.AbstractC31414CUo
    public final void LJFF(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.LJFF(holder);
        if (RankOptimizeSetting.INSTANCE.getValue()) {
            C16880lQ.LJIIJ(null, holder.itemView);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CZ8(DataChannel dataChannel, C77947UiV itemEventListener) {
        super(R.layout.d7o, Boolean.FALSE);
        o.LJIIIZ(itemEventListener, "itemEventListener");
        this.LIZLLL = dataChannel;
        this.LJ = itemEventListener;
    }

    @Override // X.CZA, X.AbstractC31414CUo
    public final void LIZ(RecyclerView.ViewHolder viewHolder, Object obj) {
        CZ6 holder = (CZ6) viewHolder;
        C78006UjS item = (C78006UjS) obj;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        holder.L(item, true, this.LIZLLL, this.LJ);
    }

    @Override // X.CZA
    public final CZ6 LJI(View view, ViewGroup viewGroup) {
        return new CZ6(view);
    }

    @Override // X.CZA, X.AbstractC31414CUo
    public final void LIZIZ(RecyclerView.ViewHolder viewHolder, Object obj, List payloads) {
        CZ6 holder = (CZ6) viewHolder;
        C78006UjS item = (C78006UjS) obj;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        o.LJIIIZ(payloads, "payloads");
        if ((!payloads.isEmpty()) && o.LJ(ListProtector.get(payloads, 0), "ket_not_change_avatar")) {
            holder.L(item, false, this.LIZLLL, this.LJ);
        } else {
            holder.L(item, true, this.LIZLLL, this.LJ);
        }
    }
}
