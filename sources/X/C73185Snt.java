package X;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.Snt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73185Snt implements C0A5 {
    public final ViewOnAttachStateChangeListenerC73199So7 LJLIL;
    public float LJLILLLLZI;
    public boolean LJLJI;
    public int LJLJJI;
    public boolean LJLJJL;
    public final AtomicBoolean LJLJJLL;
    public volatile boolean LJLJL;
    public final C73182Snq LJLJLJ;

    @Override // X.C0A5
    public final void LIZ(RecyclerView view, MotionEvent event) {
        o.LJIIJ(view, "view");
        o.LJIIJ(event, "event");
    }

    @Override // X.C0A5
    public final void LIZIZ(boolean z) {
    }

    public C73185Snt(C73182Snq loadingDelegate) {
        o.LJIIJ(loadingDelegate, "loadingDelegate");
        this.LJLJLJ = loadingDelegate;
        this.LJLIL = new ViewOnAttachStateChangeListenerC73199So7(0);
        this.LJLJJL = true;
        this.LJLJJLL = new AtomicBoolean(false);
    }

    @Override // X.C0A5
    public final boolean LIZJ(RecyclerView view, MotionEvent event) {
        boolean canScrollHorizontally;
        o.LJIIJ(view, "view");
        o.LJIIJ(event, "event");
        if (event.getAction() == 0) {
            this.LJLILLLLZI = event.getY();
            this.LJLJI = true;
        }
        RecyclerView recyclerView = this.LJLIL.LJLIL;
        if (recyclerView != null && this.LJLJL && this.LJLJI && this.LJLILLLLZI - event.getY() > this.LJLJJI) {
            if (this.LJLJJL) {
                canScrollHorizontally = recyclerView.canScrollVertically(1);
            } else {
                canScrollHorizontally = recyclerView.canScrollHorizontally(1);
            }
            if (!canScrollHorizontally) {
                C73182Snq c73182Snq = this.LJLJLJ;
                if (c73182Snq.LJIIIIZZ == 244) {
                    c73182Snq.LJI(244);
                } else {
                    c73182Snq.LJI(241);
                }
                this.LJLJL = false;
                this.LJLJI = false;
            }
        }
        return false;
    }
}
