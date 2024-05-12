package X;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WK1 extends C1BY {
    public final /* synthetic */ InterfaceC65784Pro<Boolean> LJLIL;
    public final /* synthetic */ WK2 LJLILLLLZI;
    public final /* synthetic */ GestureDetector LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;

    @Override // X.C1BY, X.C0A5
    public final void LIZ(RecyclerView rv, MotionEvent e) {
        WKQ wkq;
        C81975WFf LLJILJILJ;
        WKQ wkq2;
        o.LJIIIZ(rv, "rv");
        o.LJIIIZ(e, "e");
        this.LJLJI.onTouchEvent(e);
        if (e.getAction() == 2) {
            WK2 wk2 = this.LJLILLLLZI;
            if (wk2.LJLL) {
                if (wk2.LLJJ(1) == null) {
                    return;
                }
                float x = e.getX() - this.LJLILLLLZI.LJLLI.getFirst().floatValue();
                float y = e.getY() - this.LJLILLLLZI.LJLLI.getSecond().floatValue();
                if (y > 88.0f || y < -88.0f) {
                    C81975WFf LLJILJILJ2 = this.LJLILLLLZI.LLJILJILJ(1);
                    if (LLJILJILJ2 != null && (wkq = LLJILJILJ2.LJLLILLLL) != null) {
                        wkq.LIZIZ((int) e.getX(), (int) (e.getY() - r8.getTop()), (int) x, (int) y);
                    }
                    this.LJLILLLLZI.LJLLI = new OSZ<>(Integer.valueOf((int) e.getX()), Integer.valueOf((int) e.getY()));
                }
                Rect rect = new Rect();
                RecyclerView recyclerView = this.LJLILLLLZI.LJLJL;
                if (recyclerView != null) {
                    recyclerView.getLocalVisibleRect(rect);
                    if (!rect.contains((int) e.getX(), (int) e.getY()) && (LLJILJILJ = this.LJLILLLLZI.LLJILJILJ(1)) != null && (wkq2 = LLJILJILJ.LJLLILLLL) != null) {
                        wkq2.LIZJ((int) e.getX(), (int) (e.getY() - r8.getTop()));
                    }
                } else {
                    o.LJIJI("toolbarRecyclerView");
                    throw null;
                }
            }
        }
        if (e.getAction() == 1 && this.LJLILLLLZI.LJLL) {
            this.LJLJJI.invoke();
        }
    }

    @Override // X.C0A5
    public final boolean LIZJ(RecyclerView rv, MotionEvent e) {
        o.LJIIIZ(rv, "rv");
        o.LJIIIZ(e, "e");
        if (!this.LJLIL.invoke().booleanValue()) {
            return false;
        }
        if (e.getAction() == 2 && this.LJLILLLLZI.LJLL) {
            return true;
        }
        if (e.getAction() == 1 && this.LJLILLLLZI.LJLL) {
            return true;
        }
        this.LJLJI.onTouchEvent(e);
        return false;
    }

    public WK1(InterfaceC65784Pro<Boolean> interfaceC65784Pro, WK2 wk2, GestureDetector gestureDetector, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = wk2;
        this.LJLJI = gestureDetector;
        this.LJLJJI = interfaceC65784Pro2;
    }
}
