package X;

import Y.IDrS48S0100000_9;
import android.graphics.Rect;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MSQ {
    public LinearLayoutManager LIZ;
    public int LIZIZ;
    public int LIZJ = 6;
    public final Rect LIZLLL = new Rect();
    public final Rect LJ = new Rect();
    public MRR LJFF;

    public final void LIZ(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, MRR listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZ = linearLayoutManager;
        this.LJFF = listener;
        recyclerView.LJIIJJI(new IDrS48S0100000_9(this, 9));
    }
}
