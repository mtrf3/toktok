package X;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1KD, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1KD<VH extends RecyclerView.ViewHolder, Effect> extends AbstractC029409q<VH> {
    public final List<Effect> LJLIL = new ArrayList();

    public void LLIFFJFJJ(int i, RecyclerView.ViewHolder holder, Object obj) {
        o.LJIIIZ(holder, "holder");
    }

    public void LLII(int i, RecyclerView.ViewHolder holder, Object obj) {
        o.LJIIIZ(holder, "holder");
    }

    public void LLIIII(int i, RecyclerView.ViewHolder holder, Object obj) {
        o.LJIIIZ(holder, "holder");
    }

    public void LLIIIILZ(int i, RecyclerView.ViewHolder holder, Object obj) {
        o.LJIIIZ(holder, "holder");
    }

    public void LLIIIJ(RecyclerView.ViewHolder holder, Object obj, int i) {
        o.LJIIIZ(holder, "holder");
    }

    public void LLIIIL(int i, RecyclerView.ViewHolder holder, Object obj) {
        o.LJIIIZ(holder, "holder");
    }

    public void LLIIIZ(RecyclerView.ViewHolder holder, Object obj) {
        o.LJIIIZ(holder, "holder");
    }

    public void LLIIJI(RecyclerView.ViewHolder holder, Object obj) {
        o.LJIIIZ(holder, "holder");
    }

    public abstract void LLIIJLIL(int i, RecyclerView.ViewHolder viewHolder, Object obj);

    public void LLIIL(int i, RecyclerView.ViewHolder holder, Object obj) {
        o.LJIIIZ(holder, "holder");
    }

    public abstract void LLIILII(int i, RecyclerView.ViewHolder viewHolder, Object obj);

    public void LLIILZL(int i, RecyclerView.ViewHolder holder, Object obj) {
        o.LJIIIZ(holder, "holder");
    }

    public abstract void LLIIZ(int i, RecyclerView.ViewHolder viewHolder, Object obj);

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(VH holder, int i) {
        o.LJIIIZ(holder, "holder");
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLIL).size();
    }

    public final void LJLLLLLL(int i) {
        if (i >= 0 && i < ((ArrayList) this.LJLIL).size()) {
            notifyItemChanged(i, "item_deleted");
        }
    }

    public final void LJLZ(int i) {
        if (i >= 0 && i < ((ArrayList) this.LJLIL).size()) {
            notifyItemChanged(i, "item_download_fail");
        }
    }

    public final void LJZ(Effect effect) {
        LJLZ(ORZ.LJZ(effect, this.LJLIL));
    }

    public final void LJZI(int i) {
        if (i >= 0 && i < ((ArrayList) this.LJLIL).size()) {
            notifyItemChanged(i, "item_download_start");
        }
    }

    public final void LJZL(Effect effect) {
        LJZI(ORZ.LJZ(effect, this.LJLIL));
    }

    public void LL(int i) {
        if (i >= 0 && i < ((ArrayList) this.LJLIL).size()) {
            notifyItemChanged(i, "item_download_success");
        }
    }

    public final void LLD(Effect effect) {
        LL(ORZ.LJZ(effect, this.LJLIL));
    }

    public final void LLFFF(int i) {
        if (i >= 0 && i < ((ArrayList) this.LJLIL).size()) {
            notifyItemChanged(i, "item_select");
        }
    }

    public final void LLFII(int i) {
        if (i >= 0 && i < ((ArrayList) this.LJLIL).size()) {
            notifyItemChanged(i, "item_unselect");
        }
    }

    public final void LLFZ(Effect effect) {
        LLFII(ORZ.LJZ(effect, this.LJLIL));
    }

    public final void LLF(int i, int i2) {
        if (i >= 0 && i < ((ArrayList) this.LJLIL).size()) {
            notifyItemChanged(i, Integer.valueOf(i2));
        }
    }

    public final void LLFF(int i, Object obj) {
        LLF(ORZ.LJZ(obj, this.LJLIL), i);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(VH holder, int i, List<Object> payloads) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        Object obj = ListProtector.get(this.LJLIL, i);
        if (!payloads.isEmpty()) {
            if (!payloads.isEmpty()) {
                Iterator<Object> it = payloads.iterator();
                while (it.hasNext()) {
                    if (o.LJ(it.next(), "item_deleted")) {
                    }
                }
            }
            for (Object obj2 : payloads) {
                if (o.LJ(obj2, "item_select")) {
                    LLIIJLIL(i, holder, obj);
                } else if (o.LJ(obj2, "item_unselect")) {
                    LLIILII(i, holder, obj);
                } else if (o.LJ(obj2, "item_download_start")) {
                    LLIIII(i, holder, obj);
                } else if (o.LJ(obj2, "item_download_success")) {
                    LLIIIILZ(i, holder, obj);
                } else if (o.LJ(obj2, "item_download_fail")) {
                    LLII(i, holder, obj);
                } else if (o.LJ(obj2, "item_update_white_dot")) {
                    LLIILZL(i, holder, obj);
                } else if (o.LJ(obj2, "item_lock")) {
                    LLIFFJFJJ(i, holder, obj);
                } else if (o.LJ(obj2, "item_unlock")) {
                    LLIIL(i, holder, obj);
                } else if (o.LJ(obj2, "item_edit_changed")) {
                    LLIIIL(i, holder, obj);
                } else if (o.LJ(obj2, "item_mutate")) {
                    LLIIIZ(holder, obj);
                } else if (o.LJ(obj2, "item_normal")) {
                    LLIIJI(holder, obj);
                } else if (obj2 instanceof Integer) {
                    LLIIIJ(holder, obj, ((Number) obj2).intValue());
                }
            }
            return;
        }
        LLIIZ(i, holder, obj);
    }
}
