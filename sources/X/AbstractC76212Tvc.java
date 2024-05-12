package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Tvc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC76212Tvc extends AbstractC31414CUo {
    public final /* synthetic */ int LIZIZ;

    @Override // X.AbstractC31414CUo
    public final void LIZLLL(RecyclerView.ViewHolder holder) {
        switch (this.LIZIZ) {
            case 0:
                o.LJIIIZ(holder, "holder");
                return;
            default:
                return;
        }
    }

    @Override // X.AbstractC31414CUo
    public final void LJ(RecyclerView.ViewHolder viewHolder) {
        switch (this.LIZIZ) {
            case 0:
                AbstractC76213Tvd holder = (AbstractC76213Tvd) viewHolder;
                o.LJIIIZ(holder, "holder");
                holder.onViewDetachedFromWindow();
                return;
            default:
                return;
        }
    }

    @Override // X.AbstractC31414CUo
    public final void LJFF(RecyclerView.ViewHolder viewHolder) {
        switch (this.LIZIZ) {
            case 0:
                AbstractC76213Tvd holder = (AbstractC76213Tvd) viewHolder;
                o.LJIIIZ(holder, "holder");
                holder.LJJJJIZL();
                return;
            default:
                return;
        }
    }

    @Override // X.AbstractC31414CUo
    public final void LIZ(RecyclerView.ViewHolder viewHolder, Object obj) {
        switch (this.LIZIZ) {
            case 0:
                AbstractC76213Tvd holder = (AbstractC76213Tvd) viewHolder;
                o.LJIIIZ(holder, "holder");
                holder.L(holder.getAdapterPosition(), obj);
                return;
            default:
                CJM holder2 = (CJM) viewHolder;
                o.LJIIIZ(holder2, "holder");
                holder2.L(holder2.getAdapterPosition(), obj);
                return;
        }
    }

    @Override // X.AbstractC31414CUo
    public final void LIZIZ(RecyclerView.ViewHolder viewHolder, Object obj, List payloads) {
        switch (this.LIZIZ) {
            case 0:
                AbstractC76213Tvd holder = (AbstractC76213Tvd) viewHolder;
                o.LJIIIZ(holder, "holder");
                o.LJIIIZ(payloads, "payloads");
                if (payloads.size() <= 0) {
                    LIZ(holder, obj);
                    return;
                } else {
                    holder.M(holder.getAdapterPosition(), obj, payloads);
                    return;
                }
            default:
                LIZ(viewHolder, obj);
                return;
        }
    }
}
