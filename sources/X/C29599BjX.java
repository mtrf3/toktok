package X;

import android.os.SystemClock;

/* renamed from: X.BjX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29599BjX extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C29599BjX LJLIL = new C29599BjX();

    public C29599BjX() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        long j = 0;
        if (C29598BjW.LIZ > 0) {
            j = (SystemClock.elapsedRealtime() - C29598BjW.LIZ) / 1000;
        }
        return Long.valueOf(j);
    }
}
