package X;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.a91, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92331a91 implements C0A5 {
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

    public C92331a91(SYL syl, InterfaceC191547fS interfaceC191547fS) {
        this.LJLIL = syl;
        this.LJLILLLLZI = interfaceC191547fS;
        this.LJLJJL = ViewConfiguration.get(syl.getContext()).getScaledTouchSlop();
        syl.LJIIJ(this);
    }

    @Override // X.C0A5
    public final boolean LIZJ(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = true;
        if (motionEvent.getAction() == 0) {
            this.LJLJJLL = motionEvent.getY();
            this.LJLJJI = true;
        }
        RecyclerView recyclerView2 = this.LJLIL;
        if (recyclerView2 != null && this.LJLJI && this.LJLJJI) {
            recyclerView2.canScrollVertically(1);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.LJLIL.getLayoutManager();
            int LLILLJJLI = linearLayoutManager.LLILLJJLI();
            int LJJJI = linearLayoutManager.LJJJI();
            int LJJJJZ = linearLayoutManager.LJJJJZ();
            if (LJJJI > 0 && LLILLJJLI == LJJJJZ - 2) {
                z = true;
            } else {
                z = false;
            }
            if (this.LJLJJLL - motionEvent.getY() <= this.LJLJJL) {
                z2 = false;
            }
            if (z && z2) {
                InterfaceC191547fS interfaceC191547fS = this.LJLILLLLZI;
                if (interfaceC191547fS != null) {
                    interfaceC191547fS.LJIIJJI();
                }
                this.LJLJI = false;
                this.LJLJJI = false;
            }
        }
        return false;
    }
}
