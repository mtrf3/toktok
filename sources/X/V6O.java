package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class V6O<ITEM> {
    public final ParcelableSnapshotMutableState LJLIL;
    public final ParcelableSnapshotMutableState LJLILLLLZI;
    public final ParcelableSnapshotMutableState LJLJI;
    public final ParcelableSnapshotMutableState LJLJJI;

    /* JADX WARN: Multi-variable type inference failed */
    public final V6P LIZ() {
        if (this.LJLILLLLZI.getValue() instanceof C79226V7m) {
            return new V6P(V75.REFRESH, (V7I) this.LJLIL.getValue());
        }
        return new V6P(V75.NEXT, (V7I) this.LJLILLLLZI.getValue());
    }

    public V6O() {
        C79226V7m c79226V7m = C79226V7m.LIZ;
        this.LJLIL = C78966Uyw.LJJJIL(c79226V7m);
        this.LJLILLLLZI = C78966Uyw.LJJJIL(c79226V7m);
        this.LJLJI = C78966Uyw.LJJJIL(c79226V7m);
        this.LJLJJI = C78966Uyw.LJJJIL(C61878OQg.INSTANCE);
    }

    public final void LIZIZ(V7I v7i) {
        o.LJIIIZ(v7i, "<set-?>");
        this.LJLJI.setValue(v7i);
    }

    public final void LIZJ(V7I v7i) {
        o.LJIIIZ(v7i, "<set-?>");
        this.LJLILLLLZI.setValue(v7i);
    }

    public final void LIZLLL(V7I v7i) {
        o.LJIIIZ(v7i, "<set-?>");
        this.LJLIL.setValue(v7i);
    }
}
