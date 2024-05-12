package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.o;

/* renamed from: X.0D8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0D8 {
    public final C29321Dc LIZ;
    public final ParcelableSnapshotMutableState LIZIZ;

    public final InterfaceC273215k LIZ() {
        InterfaceC273215k interfaceC273215k = (InterfaceC273215k) this.LIZIZ.getValue();
        if (interfaceC273215k != null) {
            return interfaceC273215k;
        }
        "Intrinsic size is queried but there is no measure policy in place.".toString();
        throw new IllegalStateException("Intrinsic size is queried but there is no measure policy in place.");
    }

    public C0D8(C29321Dc layoutNode) {
        o.LJIIIZ(layoutNode, "layoutNode");
        this.LIZ = layoutNode;
        this.LIZIZ = C78966Uyw.LJJJIL(null);
    }
}
