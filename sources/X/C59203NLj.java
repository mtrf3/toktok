package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ad.dynamic.DynamicAdConfig;

/* renamed from: X.NLj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59203NLj extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C59203NLj LJLIL = new C59203NLj();

    public C59203NLj() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        DynamicAdConfig dynamicAdConfig;
        int i;
        try {
            SettingsManager.LIZLLL().getClass();
            dynamicAdConfig = (DynamicAdConfig) SettingsManager.LJII("dynamic_ad_config", DynamicAdConfig.class);
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            dynamicAdConfig = null;
        }
        if (dynamicAdConfig != null) {
            i = dynamicAdConfig.getLynxViewPreRenderGap();
        } else {
            i = 6;
        }
        return Integer.valueOf(i);
    }
}
