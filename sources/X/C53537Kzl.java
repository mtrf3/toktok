package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.notification.perf.monitor.AdapterNotifyCrashFixer;

/* renamed from: X.Kzl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53537Kzl extends AbstractC65781Prl implements InterfaceC65784Pro<AdapterNotifyCrashFixer.Meta> {
    public static final C53537Kzl LJLIL = new C53537Kzl();

    public C53537Kzl() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.ss.android.ugc.aweme.notification.perf.monitor.AdapterNotifyCrashFixer$Meta, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final AdapterNotifyCrashFixer.Meta invoke() {
        ?? LJIIIIZZ = SettingsManager.LIZLLL().LJIIIIZZ("inbox_adapter_notify_fixer", AdapterNotifyCrashFixer.Meta.class, AdapterNotifyCrashFixer.LIZ);
        if (LJIIIIZZ == 0) {
            return new AdapterNotifyCrashFixer.Meta(false, false, 3, null);
        }
        return LJIIIIZZ;
    }
}
