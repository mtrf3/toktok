package X;

import android.os.SystemClock;

/* renamed from: X.3tf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C98433tf extends TBS implements InterfaceC65784Pro<Long> {
    public static final C98433tf LJLIL = new C98433tf();

    public C98433tf() {
        super(0, SystemClock.class, "uptimeMillis", "uptimeMillis()J", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(SystemClock.uptimeMillis());
    }
}
