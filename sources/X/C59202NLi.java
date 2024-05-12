package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ad.dynamic.DynamicAdConfig;

/* renamed from: X.NLi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59202NLi extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C59202NLi LJLIL = new C59202NLi();

    public C59202NLi() {
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
            i = dynamicAdConfig.getLynxViewReleaseGap();
        } else {
            i = 8;
        }
        if (i <= C59198NLe.LJI()) {
            i = C59198NLe.LJI() + 1;
        }
        return Integer.valueOf(i);
    }
}
