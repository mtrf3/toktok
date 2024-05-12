package X;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.53d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1286553d<VH extends RecyclerView.ViewHolder> extends AbstractC029409q<VH> {
    public final ArrayList<AnonymousClass523> LJLIL = new ArrayList<>();
    public boolean LJLILLLLZI = true;
    public C53D LJLJI;

    public abstract void LJLZ(int i, VH vh, AnonymousClass523 anonymousClass523);

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public final void LJZ(AnonymousClass523 funcItem) {
        o.LJIIIZ(funcItem, "funcItem");
        ArrayList<AnonymousClass523> arrayList = this.LJLIL;
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator<AnonymousClass523> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().LJ);
        }
        if (arrayList2.contains(funcItem.LJ)) {
            int indexOf = arrayList2.indexOf(funcItem.LJ);
            this.LJLIL.remove(funcItem);
            notifyItemRemoved(indexOf);
        }
    }

    public final void LJZL(AnonymousClass523 funcItem) {
        o.LJIIIZ(funcItem, "funcItem");
        ArrayList<AnonymousClass523> arrayList = this.LJLIL;
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator<AnonymousClass523> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().LJ);
        }
        if (arrayList2.contains(funcItem.LJ)) {
            int indexOf = arrayList2.indexOf(funcItem.LJ);
            ListProtector.remove(this.LJLIL, indexOf);
            ListProtector.add(this.LJLIL, indexOf, funcItem);
            notifyItemChanged(indexOf);
        }
    }

    public final void LJLLLLLL(int i, AnonymousClass523 funcItem) {
        o.LJIIIZ(funcItem, "funcItem");
        int size = this.LJLIL.size();
        if (i < 0 || i > size - 1) {
            return;
        }
        ListProtector.add(this.LJLIL, i, funcItem);
        notifyItemInserted(i);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(VH holder, int i) {
        o.LJIIIZ(holder, "holder");
        Object obj = ListProtector.get(this.LJLIL, i);
        o.LJIIIIZZ(obj, "this[position]");
        AnonymousClass523 anonymousClass523 = (AnonymousClass523) obj;
        LJLZ(i, holder, anonymousClass523);
        C140545fO.LIZ(holder.itemView, anonymousClass523.LJII, new C1286453c(this, anonymousClass523, i, holder));
    }

    public final void LJZI(String funcType, AnonymousClass523 newItem, boolean z) {
        o.LJIIIZ(funcType, "funcType");
        o.LJIIIZ(newItem, "newItem");
        Iterator<AnonymousClass523> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            AnonymousClass523 next = it.next();
            if (o.LJ(next.LJ, funcType)) {
                if (next != null) {
                    int indexOf = this.LJLIL.indexOf(next);
                    ListProtector.remove(this.LJLIL, indexOf);
                    ListProtector.add(this.LJLIL, indexOf, newItem);
                    if (z) {
                        notifyItemChanged(indexOf);
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }
}
