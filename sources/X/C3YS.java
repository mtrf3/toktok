package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.sdk.common.controller.appsettings.RelationFetchFrequencyConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.3YS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3YS extends AbstractC65781Prl implements InterfaceC65784Pro<RelationFetchFrequencyConfig> {
    public static final C3YS LJLIL = new C3YS();

    public C3YS() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final RelationFetchFrequencyConfig invoke() {
        try {
            SettingsManager.LIZLLL().getClass();
            Object LJII = SettingsManager.LJII("im_contact_update_freq", RelationFetchFrequencyConfig.class);
            o.LJIIIIZZ(LJII, "{\n            SettingsMa…gs::class.java)\n        }");
            return (RelationFetchFrequencyConfig) LJII;
        } catch (Throwable unused) {
            return C3YR.LIZ;
        }
    }
}
