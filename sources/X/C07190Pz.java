package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.IDqS11S0101000;

/* renamed from: X.0Pz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07190Pz {
    public final C25710zf<C1JE<?, ?>> LIZ = new C25710zf<>(new C1JE[16]);
    public final ParcelableSnapshotMutableState LIZIZ = C78966Uyw.LJJJIL(Boolean.FALSE);
    public long LIZJ = Long.MIN_VALUE;
    public final ParcelableSnapshotMutableState LIZLLL = C78966Uyw.LJJJIL(Boolean.TRUE);

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(InterfaceC24520xk interfaceC24520xk, int i) {
        C35931b3 LJIL = interfaceC24520xk.LJIL(2102343854);
        if (((Boolean) this.LIZLLL.getValue()).booleanValue() || ((Boolean) this.LIZIZ.getValue()).booleanValue()) {
            C24610xt.LJ(this, new C2BT(this, null), LJIL);
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new IDqS11S0101000(this, i, 3);
    }
}
