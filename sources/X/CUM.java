package X;

import X.CUL;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.o;
import uw.s;
import zw.c;

/* loaded from: classes6.dex */
public abstract class CUM<TEXT_MODEL extends s, PINNED_MODEL extends c<TEXT_MODEL>, VH extends CUL<TEXT_MODEL, PINNED_MODEL>> extends AbstractC31414CUo<PINNED_MODEL, VH> {
    public CQQ LIZIZ;

    public final CQQ LJI() {
        CQQ cqq = this.LIZIZ;
        if (cqq != null) {
            return cqq;
        }
        o.LJIJI("publicScreenContext");
        throw null;
    }

    @Override // X.AbstractC31414CUo
    public final void LIZ(RecyclerView.ViewHolder viewHolder, Object obj) {
        CUL holder = (CUL) viewHolder;
        CSH item = (CSH) obj;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        holder.L(item, C61878OQg.INSTANCE);
    }

    @Override // X.AbstractC31414CUo
    public final void LIZIZ(RecyclerView.ViewHolder viewHolder, Object obj, List payloads) {
        CUL holder = (CUL) viewHolder;
        CSH item = (CSH) obj;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        o.LJIIIZ(payloads, "payloads");
        holder.L(item, payloads);
    }
}
