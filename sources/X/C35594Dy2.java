package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.inbox.cache.Configuration;

/* renamed from: X.Dy2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35594Dy2 extends AbstractC65781Prl implements InterfaceC65784Pro<Configuration> {
    public static final C35594Dy2 LJLIL = new C35594Dy2();

    public C35594Dy2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Configuration invoke() {
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            Configuration configuration = C35593Dy1.LIZ;
            Configuration configuration2 = (Configuration) LIZLLL.LJIIIIZZ("inbox_preload_setting", Configuration.class, configuration);
            if (configuration2 != null) {
                return configuration2;
            }
            return configuration;
        } catch (Throwable unused) {
            return C35593Dy1.LIZ;
        }
    }
}
