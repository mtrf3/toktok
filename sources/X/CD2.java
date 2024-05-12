package X;

import com.bytedance.android.livesdk.livesetting.subscription.SubWaveLynxUrlSetting;

/* loaded from: classes6.dex */
public final class CD2 extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final CD2 LJLIL = new CD2();

    public CD2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        return SubWaveLynxUrlSetting.INSTANCE.getUrlMap().optString("user_wave_popup", "");
    }
}
