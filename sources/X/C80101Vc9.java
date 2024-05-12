package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.Vc9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80101Vc9 extends C40161hs {
    public C28861Bi LJFF;
    public C28851Bh LJI;
    public RecyclerView LJII;

    @Override // X.C40161hs, X.AbstractC28951Br
    public int[] LIZJ(C0A2 c0a2, View view) {
        throw null;
    }

    public View LJIIL(C0A2 c0a2, AbstractC03050Ab abstractC03050Ab) {
        throw null;
    }

    @Override // X.AbstractC28951Br
    public final void LIZIZ(RecyclerView recyclerView) {
        super.LIZIZ(recyclerView);
        this.LJII = recyclerView;
    }

    @Override // X.AbstractC28951Br
    public final C1C9 LJ(C0A2 c0a2) {
        RecyclerView recyclerView;
        Context context = null;
        if (!(c0a2 instanceof C0AA) || (recyclerView = this.LJII) == null || recyclerView.getContext() == null) {
            return null;
        }
        RecyclerView recyclerView2 = this.LJII;
        if (recyclerView2 != null) {
            context = recyclerView2.getContext();
        }
        return new C74593TPh(this, c0a2, context);
    }

    @Override // X.C40161hs, X.AbstractC28951Br
    public final View LJFF(C0A2 layoutManager) {
        o.LJIIIZ(layoutManager, "layoutManager");
        if (layoutManager.LJIL()) {
            return LJIIL(layoutManager, LJIIJJI(layoutManager));
        }
        if (layoutManager.LJIJJLI()) {
            return LJIIL(layoutManager, LJIIJ(layoutManager));
        }
        return null;
    }

    public final AbstractC03050Ab LJIIJ(C0A2 layoutManager) {
        o.LJIIIZ(layoutManager, "layoutManager");
        if (this.LJI == null) {
            this.LJI = new C28851Bh(layoutManager);
        }
        C28851Bh c28851Bh = this.LJI;
        o.LJI(c28851Bh);
        return c28851Bh;
    }

    public final AbstractC03050Ab LJIIJJI(C0A2 layoutManager) {
        o.LJIIIZ(layoutManager, "layoutManager");
        if (this.LJFF == null) {
            this.LJFF = new C28861Bi(layoutManager);
        }
        C28861Bi c28861Bi = this.LJFF;
        o.LJI(c28861Bi);
        return c28861Bi;
    }
}
