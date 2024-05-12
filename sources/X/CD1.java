package X;

import com.bytedance.android.livesdk.livesetting.subscription.SubWaveLynxUrlSetting;

/* loaded from: classes6.dex */
public final class CD1 extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final CD1 LJLIL = new CD1();

    public CD1() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        return SubWaveLynxUrlSetting.INSTANCE.getUrlMap().optString("anchor_wave_popup", "");
    }
}
