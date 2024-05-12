package X;

import android.os.SystemClock;

/* renamed from: X.3te, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C98423te extends TBS implements InterfaceC65784Pro<Long> {
    public static final C98423te LJLIL = new C98423te();

    public C98423te() {
        super(0, SystemClock.class, "uptimeMillis", "uptimeMillis()J", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(SystemClock.uptimeMillis());
    }
}
