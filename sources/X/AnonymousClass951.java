package X;

import android.os.SystemClock;

/* renamed from: X.951, reason: invalid class name */
/* loaded from: classes5.dex */
public final class AnonymousClass951 extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final AnonymousClass951 LJLIL = new AnonymousClass951();

    public AnonymousClass951() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(SystemClock.elapsedRealtime() - C56662Kg.LIZ().LJIIJJI);
    }
}
