package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2gl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64952gl {
    public java.util.Map<Integer, Float> LIZ = new HashMap();
    public boolean LIZIZ;

    public final void LIZ(RecyclerView recyclerView, InterfaceC65784Pro<C76800UCe> tryVideoPreFetch) {
        o.LJIIIZ(tryVideoPreFetch, "tryVideoPreFetch");
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C64942gk(recyclerView, this, tryVideoPreFetch, null), 3);
    }
}
