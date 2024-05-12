package X;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.3Y8, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Y8 {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(RecyclerView view) {
        Fragment LJIIIZ;
        InterfaceC55251LmJ LIZLLL;
        C3Y7 c3y7;
        RecyclerView.ViewHolder LJJIJIL;
        RecyclerView.ViewHolder viewHolder;
        o.LJIIIZ(view, "view");
        if (C46442IKo.LIZIZ() || (LJIIIZ = C79234V7u.LJIIIZ(view)) == null || (LIZLLL = C55247LmF.LIZLLL(C55230Lly.LIZJ(LJIIIZ, null), C3Y7.class, "source_default_key")) == null || (c3y7 = (C3Y7) LIZLLL.getSource()) == null || (LJJIJIL = c3y7.LJLIL.LJJIJIL(view)) == null || (viewHolder = c3y7.LJLILLLLZI) == null) {
            return false;
        }
        return !o.LJ(LJJIJIL, viewHolder);
    }

    public static void LIZIZ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        Fragment LJIIIZ;
        C3Y7 c3y7;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (!C46442IKo.LIZIZ() && viewHolder != null && (LJIIIZ = C79234V7u.LJIIIZ(recyclerView)) != null) {
            InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LJIIIZ, null);
            InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(LIZJ, C3Y7.class, "source_default_key");
            if (LIZLLL == null || (c3y7 = (C3Y7) LIZLLL.getSource()) == null) {
                C55247LmF.LIZIZ(LIZJ, new C3Y7(recyclerView, viewHolder), C3Y7.class, "source_default_key");
            } else {
                c3y7.LJLILLLLZI = viewHolder;
            }
        }
    }
}
