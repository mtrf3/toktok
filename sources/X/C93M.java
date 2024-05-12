package X;

import android.os.SystemClock;

/* renamed from: X.93M, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C93M extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C93M LJLIL = new C93M();

    public C93M() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(SystemClock.uptimeMillis());
    }
}
