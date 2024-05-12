package X;

import android.os.SystemClock;

/* renamed from: X.4OZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4OZ implements InterfaceC98193tH {
    public long LIZ = -1;

    @Override // X.InterfaceC98193tH
    public final void LIZ() {
        long j;
        if (this.LIZ > 0) {
            j = SystemClock.uptimeMillis() - this.LIZ;
        } else {
            j = -1;
        }
        C84683Ua.LJFF.LIZ(C108684Oi.LJ, new AnonymousClass308(j));
    }

    @Override // X.InterfaceC98193tH
    public final void LIZIZ() {
        this.LIZ = SystemClock.uptimeMillis();
    }
}
