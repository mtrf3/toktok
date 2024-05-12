package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.IDqS416S0100000;

/* renamed from: X.1ZQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1ZQ implements InterfaceC21850tR {
    public final InterfaceC88472Yns<C21840tQ, Boolean> LIZ;
    public final ParcelableSnapshotMutableState LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC21850tR
    public final int LIZ() {
        return ((C21840tQ) this.LIZIZ.getValue()).LIZ;
    }

    public C1ZQ(IDqS416S0100000 iDqS416S0100000, int i) {
        this.LIZ = iDqS416S0100000;
        this.LIZIZ = C78966Uyw.LJJJIL(new C21840tQ(i));
    }
}
