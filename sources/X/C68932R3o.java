package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.notification.frequency.Config;

/* renamed from: X.R3o, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68932R3o extends AbstractC65781Prl implements InterfaceC65784Pro<Config[]> {
    public static final C68932R3o LJLIL = new C68932R3o();

    public C68932R3o() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Config[] invoke() {
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            Config[] configArr = C68931R3n.LIZ;
            Config[] configArr2 = (Config[]) LIZLLL.LJIIIIZZ("inbox_notice_frequency_setting", Config[].class, configArr);
            if (configArr2 != null) {
                return configArr2;
            }
            return configArr;
        } catch (Throwable unused) {
            return C68931R3n.LIZ;
        }
    }
}
