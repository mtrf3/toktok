package X;

import Y.ARunnableS14S0101000_10;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.OSo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61938OSo extends C73207SoF {
    public int LJLJLLL;
    public AbstractC56614MJu LJLL;
    public InterfaceC61937OSn LJLLI;
    public final KRX LJLLILLLL;
    public boolean LJLLJ;
    public View LJLLL;

    public final void LJZI() {
        if (!this.LJLLJ && this.LJLJLLL == 1) {
            this.LJLLJ = true;
            InterfaceC61937OSn interfaceC61937OSn = this.LJLLI;
            if (interfaceC61937OSn != null) {
                interfaceC61937OSn.LJJIJIL();
            }
        }
    }

    public C61938OSo(C56619MJz c56619MJz) {
        super(c56619MJz);
        this.LJLJLLL = -1;
        this.LJLL = new C56613MJt();
        KRX krx = new KRX();
        this.LJLLILLLL = krx;
        krx.LJLILLLLZI = new C61941OSr(this);
    }

    public final void LJZ(int i) {
        if (i != 0) {
            this.LJLLJ = false;
            if (this.LJLJLLL != i) {
                this.LJLJLLL = i;
                RecyclerView recyclerView = this.LJLJL;
                if (recyclerView != null) {
                    recyclerView.post(new ARunnableS14S0101000_10(i, this, 10));
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("STATE_INIT only can be set in the LoadMoreAdapterWrapper");
    }

    @Override // X.C73207SoF, X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        int i;
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        if (this.LJLLL == null) {
            this.LJLLL = this.LJLL.LIZ(recyclerView, this);
            this.LJLL.LIZIZ(0);
            View view = this.LJLLL;
            o.LJI(view);
            int size = this.LJLJI.size();
            if (size >= 0 && size <= this.LJLJI.size()) {
                C61940OSq c61940OSq = this.LJLJJLL;
                if (c61940OSq.LIZIZ.size() > 0) {
                    Integer removeFirst = c61940OSq.LIZIZ.removeFirst();
                    o.LJIIIIZZ(removeFirst, "{\n            mRecycleList.removeFirst()\n        }");
                    i = removeFirst.intValue();
                } else {
                    i = c61940OSq.LIZ;
                    if (i <= 110000) {
                        c61940OSq.LIZ = i + 1;
                    } else {
                        throw new IllegalStateException("Your viewType is too much,it's impossible in common");
                    }
                }
                C61942OSs c61942OSs = new C61942OSs(i, view);
                this.LJLJI.add(c61942OSs);
                this.LJLJJL.LJI(i, c61942OSs);
                notifyItemInserted((getItemCount() - this.LJLJI.size()) + size);
            }
        }
        recyclerView.LJIIJJI(this.LJLLILLLL);
    }

    @Override // X.C73207SoF, X.AbstractC029409q
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        recyclerView.LJJLL(this.LJLLILLLL);
    }

    @Override // X.C73207SoF, X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (this.LJLLL == holder.itemView) {
            LJZI();
        }
    }
}
