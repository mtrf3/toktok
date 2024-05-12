package X;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Grg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42844Grg implements C0A5 {
    public final RecyclerView LJLIL;
    public final InterfaceC42845Grh LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public final int LJLJJL;
    public float LJLJJLL;

    @Override // X.C0A5
    public final void LIZ(RecyclerView recyclerView, MotionEvent motionEvent) {
    }

    @Override // X.C0A5
    public final void LIZIZ(boolean z) {
    }

    public C42844Grg(RecyclerView recyclerView, C42846Gri c42846Gri) {
        this.LJLIL = recyclerView;
        this.LJLILLLLZI = c42846Gri;
        this.LJLJJL = ViewConfiguration.get(recyclerView.getContext()).getScaledTouchSlop();
        recyclerView.LJIIJ(this);
    }

    @Override // X.C0A5
    public final boolean LIZJ(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.LJLJJLL = motionEvent.getY();
            this.LJLJJI = true;
        }
        RecyclerView recyclerView2 = this.LJLIL;
        if (recyclerView2 != null && this.LJLJI && this.LJLJJI && !recyclerView2.canScrollVertically(1) && this.LJLJJLL - motionEvent.getY() > this.LJLJJL) {
            InterfaceC42845Grh interfaceC42845Grh = this.LJLILLLLZI;
            if (interfaceC42845Grh != null) {
                interfaceC42845Grh.LJIIJJI();
            }
            this.LJLJI = false;
            this.LJLJJI = false;
        }
        return false;
    }
}
