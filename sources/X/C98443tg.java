package X;

import android.os.SystemClock;

/* renamed from: X.3tg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C98443tg extends TBS implements InterfaceC65784Pro<Long> {
    public static final C98443tg LJLIL = new C98443tg();

    public C98443tg() {
        super(0, SystemClock.class, "uptimeMillis", "uptimeMillis()J", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(SystemClock.uptimeMillis());
    }
}
