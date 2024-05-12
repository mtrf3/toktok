package X;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7fR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191537fR implements C0A5 {
    public final RecyclerView LJLIL;
    public final InterfaceC191547fS LJLILLLLZI;
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

    public C191537fR(RecyclerView recyclerView, InterfaceC191547fS interfaceC191547fS) {
        this.LJLIL = recyclerView;
        this.LJLILLLLZI = interfaceC191547fS;
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
            InterfaceC191547fS interfaceC191547fS = this.LJLILLLLZI;
            if (interfaceC191547fS != null) {
                interfaceC191547fS.LJIIJJI();
            }
            this.LJLJI = false;
            this.LJLJJI = false;
        }
        return false;
    }
}
