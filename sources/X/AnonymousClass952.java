package X;

import android.os.SystemClock;

/* renamed from: X.952, reason: invalid class name */
/* loaded from: classes5.dex */
public final class AnonymousClass952 extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final AnonymousClass952 LJLIL = new AnonymousClass952();

    public AnonymousClass952() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(SystemClock.elapsedRealtime() - C56662Kg.LIZ().LJIIJJI);
    }
}
