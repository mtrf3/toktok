package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.3xg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100923xg {
    public final C99033ud LIZ;
    public final AbstractC1038245q LIZIZ;
    public final RecyclerView LIZJ;
    public boolean LIZLLL;

    public final void LIZ() {
        if (this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        C100723xM.LIZ(this.LIZ, this.LIZIZ.getCurrentList().size());
        C100723xM.LJFF(this.LIZJ);
    }

    public C100923xg(C99033ud sessionInfo, AbstractC1038245q adapter, RecyclerView recyclerView) {
        o.LJIIIZ(sessionInfo, "sessionInfo");
        o.LJIIIZ(adapter, "adapter");
        this.LIZ = sessionInfo;
        this.LIZIZ = adapter;
        this.LIZJ = recyclerView;
    }
}
