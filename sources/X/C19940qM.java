package X;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* renamed from: X.0qM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19940qM {
    public C19920qK LIZJ;
    public final Queue<C19920qK> LIZ = new LinkedList();
    public final java.util.Map<View, C19910qJ> LIZIZ = new HashMap();
    public final List<C19920qK> LIZLLL = new ArrayList();
    public final boolean LJ = true;

    public final void LIZ() {
        C19920qK c19920qK;
        if (this.LJ && this.LIZJ == null && (c19920qK = (C19920qK) ((LinkedList) this.LIZ).poll()) != null) {
            LIZIZ(c19920qK);
            this.LIZJ = c19920qK;
            C19980qQ.LIZIZ(c19920qK);
        }
    }

    public final void LIZIZ(C19920qK c19920qK) {
        ((LinkedList) this.LIZ).remove(c19920qK);
        C19910qJ c19910qJ = (C19910qJ) ((HashMap) this.LIZIZ).get(c19920qK.LIZLLL.LIZIZ);
        if (c19910qJ != null && !c19910qJ.LIZ.isEmpty()) {
            ((LinkedList) c19910qJ.LIZ).remove(c19920qK);
            if (c19910qJ.LIZ.isEmpty()) {
                c19920qK.LIZLLL.LIZIZ.removeOnAttachStateChangeListener(c19910qJ.LIZIZ);
                ((HashMap) this.LIZIZ).remove(c19920qK.LIZLLL.LIZIZ);
            }
        }
    }
}
