package X;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WK7 extends C1BY {
    public final /* synthetic */ GestureDetector LJLIL;
    public final /* synthetic */ WK9 LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;

    @Override // X.C0A5
    public final boolean LIZJ(RecyclerView rv, MotionEvent e) {
        WKQ wkq;
        C81975WFf LLJILJILJ;
        WKQ wkq2;
        o.LJIIIZ(rv, "rv");
        o.LJIIIZ(e, "e");
        this.LJLIL.onTouchEvent(e);
        if (e.getAction() == 2) {
            WK9 wk9 = this.LJLILLLLZI;
            if (wk9.LJLJJLL) {
                if (wk9.LLJJ(1) == null) {
                    return false;
                }
                float x = e.getX() - this.LJLILLLLZI.LJLJL.getFirst().floatValue();
                float y = e.getY() - this.LJLILLLLZI.LJLJL.getSecond().floatValue();
                if (y > 88.0f || y < -88.0f) {
                    C81975WFf LLJILJILJ2 = this.LJLILLLLZI.LLJILJILJ(1);
                    if (LLJILJILJ2 != null && (wkq = LLJILJILJ2.LJLLILLLL) != null) {
                        wkq.LIZIZ((int) e.getX(), (int) (e.getY() - r8.getTop()), (int) x, (int) y);
                    }
                    this.LJLILLLLZI.LJLJL = new OSZ<>(Integer.valueOf((int) e.getX()), Integer.valueOf((int) e.getY()));
                }
                Rect rect = new Rect();
                RecyclerView recyclerView = this.LJLILLLLZI.LJLJI;
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
        if (e.getAction() != 1 || !this.LJLILLLLZI.LJLJJLL) {
            return false;
        }
        this.LJLJI.invoke();
        return true;
    }

    public WK7(GestureDetector gestureDetector, WK9 wk9, AqS164S0100000_14 aqS164S0100000_14) {
        this.LJLIL = gestureDetector;
        this.LJLILLLLZI = wk9;
        this.LJLJI = aqS164S0100000_14;
    }
}
