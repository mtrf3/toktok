package X;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WK4 extends C1BY {
    public final /* synthetic */ InterfaceC65784Pro<Boolean> LJLIL;
    public final /* synthetic */ WK3 LJLILLLLZI;
    public final /* synthetic */ GestureDetector LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;

    @Override // X.C1BY, X.C0A5
    public final void LIZ(RecyclerView rv, MotionEvent e) {
        WKQ wkq;
        C81975WFf LLJILJIL;
        WKQ wkq2;
        o.LJIIIZ(rv, "rv");
        o.LJIIIZ(e, "e");
        this.LJLJI.onTouchEvent(e);
        if (e.getAction() == 2) {
            WK3 wk3 = this.LJLILLLLZI;
            if (wk3.LJLJLLL) {
                if (wk3.LLJILJILJ(1) == null) {
                    return;
                }
                float x = e.getX() - this.LJLILLLLZI.LJLL.getFirst().floatValue();
                float y = e.getY() - this.LJLILLLLZI.LJLL.getSecond().floatValue();
                if (y > 88.0f || y < -88.0f) {
                    C81975WFf LLJILJIL2 = this.LJLILLLLZI.LLJILJIL(1);
                    if (LLJILJIL2 != null && (wkq = LLJILJIL2.LJLLILLLL) != null) {
                        wkq.LIZIZ((int) e.getX(), (int) (e.getY() - r8.getTop()), (int) x, (int) y);
                    }
                    this.LJLILLLLZI.LJLL = new OSZ<>(Integer.valueOf((int) e.getX()), Integer.valueOf((int) e.getY()));
                }
                Rect rect = new Rect();
                RecyclerView recyclerView = this.LJLILLLLZI.LJLJJL;
                if (recyclerView != null) {
                    recyclerView.getLocalVisibleRect(rect);
                    if (!rect.contains((int) e.getX(), (int) e.getY()) && (LLJILJIL = this.LJLILLLLZI.LLJILJIL(1)) != null && (wkq2 = LLJILJIL.LJLLILLLL) != null) {
                        wkq2.LIZJ((int) e.getX(), (int) (e.getY() - r8.getTop()));
                    }
                } else {
                    o.LJIJI("toolbarRecyclerView");
                    throw null;
                }
            }
        }
        if (e.getAction() == 1 && this.LJLILLLLZI.LJLJLLL) {
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
        if (e.getAction() == 2 && this.LJLILLLLZI.LJLJLLL) {
            return true;
        }
        if (e.getAction() == 1 && this.LJLILLLLZI.LJLJLLL) {
            return true;
        }
        this.LJLJI.onTouchEvent(e);
        return false;
    }

    public WK4(InterfaceC65784Pro<Boolean> interfaceC65784Pro, WK3 wk3, GestureDetector gestureDetector, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = wk3;
        this.LJLJI = gestureDetector;
        this.LJLJJI = interfaceC65784Pro2;
    }
}
