package X;

import com.bytedance.android.livesdk.livesetting.subscription.SubWaveLynxUrlSetting;

/* loaded from: classes6.dex */
public final class CD5 extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final CD5 LJLIL = new CD5();

    public CD5() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        return SubWaveLynxUrlSetting.INSTANCE.getUrlMap().optString("wave_setting_popup", "");
    }
}
