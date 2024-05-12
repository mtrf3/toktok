package X;

import Y.IDObjectS326S0100000_1;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KFW implements KGO {
    public final InterfaceC60761Nsz LIZ;
    public final String LIZIZ;
    public RecyclerView LIZJ;
    public final C62822Ol8 LIZLLL;

    @Override // X.KGO
    public final RecyclerView LIZ() {
        VNS vns;
        View view;
        RecyclerView recyclerView;
        RecyclerView recyclerView2 = this.LIZJ;
        if (recyclerView2 != null) {
            return recyclerView2;
        }
        try {
            View LIZJ = this.LIZ.LIZJ();
            if (LIZJ instanceof VNS) {
                vns = (VNS) LIZJ;
            } else {
                vns = null;
            }
            if (vns == null) {
                view = null;
            } else {
                view = vns.findViewByIdSelector(this.LIZIZ);
            }
            if (view instanceof RecyclerView) {
                recyclerView = (RecyclerView) view;
            } else {
                recyclerView = null;
            }
            if (recyclerView == null) {
                recyclerView = LIZLLL();
            }
            this.LIZJ = recyclerView;
            return recyclerView;
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            return null;
        }
    }

    public final KG2 LIZJ() {
        return (KG2) this.LIZLLL.getValue();
    }

    public final RecyclerView LIZLLL() {
        View LIZJ = this.LIZ.LIZJ();
        if (!(LIZJ instanceof ViewGroup) || LIZJ == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Rect rect = new Rect();
        linkedList.add(LIZJ);
        while (!linkedList.isEmpty()) {
            ViewGroup viewGroup = (ViewGroup) linkedList.poll();
            if (viewGroup != null) {
                Iterator it = new IDObjectS326S0100000_1(viewGroup, 1).iterator();
                while (it.hasNext()) {
                    View view = (View) it.next();
                    if (view.getGlobalVisibleRect(rect) && view.isAttachedToWindow()) {
                        if (view instanceof RecyclerView) {
                            linkedList.clear();
                            return (RecyclerView) view;
                        }
                        if (view instanceof ViewGroup) {
                            linkedList.add(view);
                        }
                    } else if (view instanceof ViewGroup) {
                        linkedList.add(view);
                    }
                }
            }
        }
        return null;
    }

    public final void LJ() {
        KG2 LIZJ = LIZJ();
        if (LIZJ != null) {
            LIZJ.LJ();
        }
    }

    public KFW(InterfaceC60761Nsz view, String str) {
        o.LJIIIZ(view, "view");
        this.LIZ = view;
        this.LIZIZ = str;
        this.LIZLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 22));
    }

    @Override // X.KGO
    public final boolean LIZIZ(int i, int[] offsetInWindow) {
        KG2 LIZJ;
        o.LJIIIZ(offsetInWindow, "offsetInWindow");
        offsetInWindow[0] = 0;
        offsetInWindow[1] = 0;
        if (LIZJ() == null) {
            return false;
        }
        if (i > 0) {
            KG2 LIZJ2 = LIZJ();
            if (LIZJ2 != null && LIZJ2.LIZ()) {
                KG2 LIZJ3 = LIZJ();
                if (LIZJ3 != null) {
                    LIZJ3.LIZIZ(i, offsetInWindow);
                }
                return true;
            }
        } else if (i < 0 && (LIZJ = LIZJ()) != null && LIZJ.LIZJ()) {
            KG2 LIZJ4 = LIZJ();
            if (LIZJ4 != null) {
                LIZJ4.LIZLLL(i, offsetInWindow);
            }
            return true;
        }
        return false;
    }
}
