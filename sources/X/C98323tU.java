package X;

import android.os.SystemClock;

/* renamed from: X.3tU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C98323tU extends TBS implements InterfaceC65784Pro<Long> {
    public static final C98323tU LJLIL = new C98323tU();

    public C98323tU() {
        super(0, SystemClock.class, "uptimeMillis", "uptimeMillis()J", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(SystemClock.uptimeMillis());
    }
}
