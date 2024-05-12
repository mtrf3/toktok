package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.commercialize.live.settings.BASchemaConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.E2w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35790E2w extends AbstractC65781Prl implements InterfaceC65784Pro<BASchemaConfig.BASchemaConfigData> {
    public static final C35790E2w LJLIL = new C35790E2w();

    public C35790E2w() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final BASchemaConfig.BASchemaConfigData invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        BASchemaConfig.BASchemaConfigData bASchemaConfigData = BASchemaConfig.LIZIZ;
        Object LJIIIIZZ = LIZLLL.LJIIIIZZ("ba_live_link_schema", BASchemaConfig.BASchemaConfigData.class, bASchemaConfigData);
        if (LJIIIIZZ == 0) {
            BASchemaConfig.LIZ.getClass();
        } else {
            bASchemaConfigData = LJIIIIZZ;
        }
        o.LJIIIIZZ(bASchemaConfigData, "SettingsManager.getInsta…g::class.java) ?: DEFAULT");
        return bASchemaConfigData;
    }
}
