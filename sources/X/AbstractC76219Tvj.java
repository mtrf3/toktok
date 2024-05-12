package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.Tvj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC76219Tvj extends AbstractC31414CUo {
    public final /* synthetic */ int LIZIZ;

    public /* synthetic */ AbstractC76219Tvj(int i) {
        this.LIZIZ = i;
    }

    @Override // X.AbstractC31414CUo
    public final void LJ(RecyclerView.ViewHolder viewHolder) {
        switch (this.LIZIZ) {
            case 0:
                AbstractC76220Tvk holder = (AbstractC76220Tvk) viewHolder;
                o.LJIIIZ(holder, "holder");
                holder.onViewDetachedFromWindow();
                return;
            default:
                return;
        }
    }

    @Override // X.AbstractC31414CUo
    public final void LJFF(RecyclerView.ViewHolder holder) {
        switch (this.LIZIZ) {
            case 0:
                AbstractC76220Tvk holder2 = (AbstractC76220Tvk) holder;
                o.LJIIIZ(holder2, "holder");
                holder2.LJJJJIZL();
                return;
            case 1:
                AbstractC76218Tvi holder3 = (AbstractC76218Tvi) holder;
                o.LJIIIZ(holder3, "holder");
                holder3.LJJJJIZL();
                return;
            default:
                o.LJIIIZ(holder, "holder");
                return;
        }
    }

    @Override // X.AbstractC31414CUo
    public final void LIZ(RecyclerView.ViewHolder viewHolder, Object item) {
        switch (this.LIZIZ) {
            case 0:
                AbstractC76220Tvk holder = (AbstractC76220Tvk) viewHolder;
                o.LJIIIZ(holder, "holder");
                o.LJIIIZ(item, "item");
                holder.L(holder.getAdapterPosition(), item);
                return;
            case 1:
                AbstractC76218Tvi holder2 = (AbstractC76218Tvi) viewHolder;
                o.LJIIIZ(holder2, "holder");
                holder2.L(holder2.getAdapterPosition(), item);
                return;
            default:
                AbstractC76214Tve holder3 = (AbstractC76214Tve) viewHolder;
                o.LJIIIZ(holder3, "holder");
                o.LJIIIZ(item, "item");
                holder3.L(holder3.getAdapterPosition(), item);
                return;
        }
    }
}
