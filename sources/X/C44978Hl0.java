package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.Hl0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44978Hl0 implements C0AK {
    public final C45498HtO LJLIL;
    public final RecyclerView LJLILLLLZI;

    public C44978Hl0(C45498HtO adapter, RecyclerView recyclerView) {
        o.LJIIIZ(adapter, "adapter");
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLIL = adapter;
        this.LJLILLLLZI = recyclerView;
    }

    @Override // X.C0AK
    public final void LJJIJLIJ(int i, int i2) {
        this.LJLIL.notifyItemRangeRemoved(i, i2);
    }

    @Override // X.C0AK
    public final void LJLIIIL(int i, int i2) {
        this.LJLIL.notifyItemRangeInserted(i, i2);
        if (i == 0) {
            this.LJLILLLLZI.LJLI(0);
        }
    }

    @Override // X.C0AK
    public final void LJLJLLL(int i, int i2) {
        this.LJLIL.notifyItemMoved(i, i2);
    }

    @Override // X.C0AK
    public final void LJJLIIIJILLIZJL(int i, int i2, Object obj) {
        if (C44980Hl2.LIZ()) {
            this.LJLIL.notifyItemRangeChanged(i, i2, obj);
        } else {
            this.LJLIL.notifyDataSetChanged();
        }
    }
}
