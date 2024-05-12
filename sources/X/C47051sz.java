package X;

import com.bytedance.android.live.core.monitor.PersistenceReporter;
import com.bytedance.keva.Keva;

/* renamed from: X.1sz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47051sz extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C47051sz LJLIL = new C47051sz();

    public C47051sz() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        Keva keva = PersistenceReporter.LJIIIIZZ;
        long j = keva.getLong("app_start_id", 0L);
        keva.storeLong("app_start_id", 1 + j);
        return Long.valueOf(j);
    }
}
