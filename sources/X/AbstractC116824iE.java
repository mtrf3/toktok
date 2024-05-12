package X;

import Y.ARunnableS1S0401000_1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4iE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC116824iE<VH extends RecyclerView.ViewHolder, T> extends C8HS<T> {
    public final C116814iD<T> LJLIL;

    public int LJLLLLLL() {
        return 0;
    }

    @Override // X.MK7, X.C4II, X.AbstractC029409q
    public final int getItemCount() {
        int i;
        List<? extends T> list = this.LJLIL.LJ;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        return LJLLLLLL() + i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.4iF] */
    public AbstractC116824iE(Object obj) {
        super(false, 1, null);
        AbstractC03160Am<T> abstractC03160Am = new AbstractC03160Am<T>() { // from class: X.4iJ
            @Override // X.AbstractC03160Am
            public final boolean LIZ(T t, T t2) {
                return o.LJ(t, t2);
            }

            @Override // X.AbstractC03160Am
            public final boolean LIZIZ(T t, T t2) {
                return o.LJ(t, t2);
            }
        };
        C116854iH c116854iH = new C116854iH(abstractC03160Am);
        if (c116854iH.LIZ == null) {
            synchronized (C116854iH.LIZIZ) {
                if (C116854iH.LIZJ == null) {
                    C116854iH.LIZJ = C16880lQ.LLLLZ(2);
                }
            }
            c116854iH.LIZ = C116854iH.LIZJ;
        }
        Executor executor = c116854iH.LIZ;
        o.LJI(executor);
        C116864iI c116864iI = new C116864iI(abstractC03160Am, executor, null);
        final AqS167S0100000_1 aqS167S0100000_1 = new AqS167S0100000_1(this, (AbstractC116824iE<RecyclerView.ViewHolder, Object>) 491);
        this.LJLIL = new C116814iD<>(new C4NF(this, aqS167S0100000_1) { // from class: X.4iF
            public final T LJLIL;
            public final InterfaceC88472Yns<Integer, Integer> LJLILLLLZI;

            @Override // X.C4NF
            public final void notifyDataSetChanged() {
                this.LJLIL.notifyDataSetChanged();
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                o.LJIIIZ(this, "adapter");
                this.LJLIL = this;
                this.LJLILLLLZI = aqS167S0100000_1;
            }

            @Override // X.C0AK
            public final void LJJIJLIJ(int i, int i2) {
                if (i2 == 0) {
                    return;
                }
                if (i == 0 && i2 == this.LJLIL.getItemCount()) {
                    this.LJLIL.notifyDataSetChanged();
                }
                this.LJLIL.notifyItemRangeRemoved(this.LJLILLLLZI.invoke(Integer.valueOf(i)).intValue(), i2);
            }

            @Override // X.C0AK
            public final void LJLIIIL(int i, int i2) {
                if (i2 == 0) {
                    return;
                }
                this.LJLIL.notifyItemRangeInserted(this.LJLILLLLZI.invoke(Integer.valueOf(i)).intValue(), i2);
            }

            @Override // X.C0AK
            public final void LJLJLLL(int i, int i2) {
                this.LJLIL.notifyItemMoved(this.LJLILLLLZI.invoke(Integer.valueOf(i)).intValue(), this.LJLILLLLZI.invoke(Integer.valueOf(i2)).intValue());
            }

            @Override // X.C0AK
            public final void LJJLIIIJILLIZJL(int i, int i2, Object obj2) {
                this.LJLIL.notifyItemRangeChanged(this.LJLILLLLZI.invoke(Integer.valueOf(i)).intValue(), i2, obj2);
            }
        }, c116864iI);
        this.mShowFooter = false;
    }

    public final T getItem(int i) {
        if (i >= LJLLLLLL() && i < getItemCount()) {
            C116814iD<T> c116814iD = this.LJLIL;
            int LJLLLLLL = i - LJLLLLLL();
            List<? extends T> list = c116814iD.LJ;
            if (list != null && LJLLLLLL < list.size() && LJLLLLLL >= 0) {
                return (T) ListProtector.get(list, LJLLLLLL);
            }
        }
        return null;
    }

    public final void LJJIIJ(List<? extends T> list, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C116814iD<T> c116814iD = this.LJLIL;
        int i = c116814iD.LIZLLL + 1;
        c116814iD.LIZLLL = i;
        List<? extends T> list2 = c116814iD.LJ;
        if (list != list2) {
            if (list == null) {
                o.LJI(list2);
                int size = list2.size();
                c116814iD.LJ = null;
                c116814iD.LIZ.LJJIJLIJ(0, size);
                return;
            }
            if (list2 == null) {
                c116814iD.LJ = list;
                c116814iD.LIZ.LJLIIIL(0, list.size());
            } else {
                c116814iD.LIZIZ.LIZIZ.execute(new ARunnableS1S0401000_1(c116814iD, i, list2, list, interfaceC65784Pro, 1));
            }
        }
    }
}
