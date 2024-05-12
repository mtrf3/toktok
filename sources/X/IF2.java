package X;

import android.os.SystemClock;

/* loaded from: classes9.dex */
public final class IF2 extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final IF2 LJLIL = new IF2();

    public IF2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(SystemClock.elapsedRealtime());
    }
}
