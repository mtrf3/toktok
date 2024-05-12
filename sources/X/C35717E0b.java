package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.awemepushlib.experiments.PushCustomUISettings;

/* renamed from: X.E0b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35717E0b extends AbstractC65781Prl implements InterfaceC65784Pro<PushCustomUISettings.MetaData> {
    public static final C35717E0b LJLIL = new C35717E0b();

    public C35717E0b() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.awemepushlib.experiments.PushCustomUISettings$MetaData] */
    @Override // X.InterfaceC65784Pro
    public final PushCustomUISettings.MetaData invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        PushCustomUISettings.MetaData metaData = PushCustomUISettings.LIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("push_custom_ui_settings", PushCustomUISettings.MetaData.class, metaData);
        if (LJIIIIZZ == 0) {
            return metaData;
        }
        return LJIIIIZZ;
    }
}
