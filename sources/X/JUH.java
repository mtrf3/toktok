package X;

import Y.ARunnableS44S0100000_8;
import Y.IDrS47S0100000_8;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JUH implements InterfaceC49224JTo {
    public final RecyclerView LJLIL;
    public final /* synthetic */ JUF LJLILLLLZI = new JUF();

    public final int LIZJ() {
        if (this.LJLIL.getAdapter() instanceof C73210SoI) {
            AbstractC029409q adapter = this.LJLIL.getAdapter();
            o.LJII(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.base.HeaderAndFooterWrapper");
            return ((ArrayList) ((C73210SoI) adapter).LJZI()).size();
        }
        return 0;
    }

    @Override // X.InterfaceC49224JTo
    public final void LLLLLILLIL() {
        this.LJLILLLLZI.LJLIL = null;
    }

    public final void LJFF() {
        C49638Jdy.LIZ();
        this.LJLIL.post(new ARunnableS44S0100000_8(this, 171));
    }

    public JUH(RecyclerView recyclerView) {
        this.LJLIL = recyclerView;
        recyclerView.LJIIJJI(new IDrS47S0100000_8(this, 12));
    }

    public static InterfaceC49148JQq LIZLLL(List list) {
        Object obj;
        InterfaceC49137JQf priority;
        InterfaceC49137JQf priority2;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                OSZ osz = (OSZ) obj;
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) osz.getFirst();
                InterfaceC49148JQq interfaceC49148JQq = (InterfaceC49148JQq) osz.getSecond();
                if (viewHolder.itemView.isAttachedToWindow() && viewHolder.getBindingAdapterPosition() >= 0 && LJ(viewHolder) && (priority = interfaceC49148JQq.getPriority()) != null && priority.C() && (priority2 = interfaceC49148JQq.getPriority()) != null && priority2.LJJJJ() >= 0.5d) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        OSZ osz2 = (OSZ) obj;
        if (osz2 == null) {
            return null;
        }
        return (InterfaceC49148JQq) osz2.getSecond();
    }

    public static boolean LJ(RecyclerView.ViewHolder viewHolder) {
        C1BU c1bu;
        ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
        if (layoutParams instanceof C1BU) {
            c1bu = (C1BU) layoutParams;
        } else {
            c1bu = null;
        }
        if (c1bu == null || c1bu.LJLILLLLZI <= 1) {
            return false;
        }
        return true;
    }

    public final List<InterfaceC49148JQq> LIZ(List<? extends OSZ<? extends RecyclerView.ViewHolder, ? extends InterfaceC49148JQq>> list) {
        int LIZJ = LIZJ();
        ArrayList arrayList = new ArrayList();
        for (OSZ<? extends RecyclerView.ViewHolder, ? extends InterfaceC49148JQq> osz : list) {
            OSZ<? extends RecyclerView.ViewHolder, ? extends InterfaceC49148JQq> osz2 = osz;
            RecyclerView.ViewHolder first = osz2.getFirst();
            InterfaceC49148JQq second = osz2.getSecond();
            if (first.itemView.isAttachedToWindow() && (first.getBindingAdapterPosition() - LIZJ == 0 || first.getBindingAdapterPosition() - LIZJ == 1)) {
                if (!LJ(first) && second.LLIIII()) {
                    arrayList.add(osz);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((OSZ) it.next()).getSecond());
        }
        return arrayList2;
    }

    public final InterfaceC49148JQq LIZIZ(List<? extends OSZ<? extends RecyclerView.ViewHolder, ? extends InterfaceC49148JQq>> list) {
        OSZ<? extends RecyclerView.ViewHolder, ? extends InterfaceC49148JQq> osz;
        Iterator<? extends OSZ<? extends RecyclerView.ViewHolder, ? extends InterfaceC49148JQq>> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                osz = it.next();
                OSZ<? extends RecyclerView.ViewHolder, ? extends InterfaceC49148JQq> osz2 = osz;
                RecyclerView.ViewHolder first = osz2.getFirst();
                InterfaceC49148JQq second = osz2.getSecond();
                if (first.itemView.isAttachedToWindow() && first.getBindingAdapterPosition() - LIZJ() == 0 && LJ(first) && second.LLIIII()) {
                    break;
                }
            } else {
                osz = null;
                break;
            }
        }
        OSZ<? extends RecyclerView.ViewHolder, ? extends InterfaceC49148JQq> osz3 = osz;
        if (osz3 == null) {
            return null;
        }
        return osz3.getSecond();
    }

    @Override // X.InterfaceC49224JTo
    public final void LLIIJI(JU3 eventDispatcher) {
        o.LJIIIZ(eventDispatcher, "eventDispatcher");
        JUF juf = this.LJLILLLLZI;
        juf.getClass();
        juf.LJLIL = eventDispatcher;
    }
}
