package X;

import com.bytedance.pia.core.setting.Config;
import com.bytedance.pia.core.setting.Settings;

/* renamed from: X.EmY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37430EmY extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Set<? extends String>> {
    public final /* synthetic */ Config LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37430EmY(Config config) {
        super(0);
        this.LJLIL = config;
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Set<? extends String> invoke() {
        Config config = this.LJLIL;
        if (config.isFromMock) {
            return config.expectedFeatures;
        }
        return ORZ.LJZI(C37413EmH.LIZ(Settings.LJIIIZ).enabledFeatures, this.LJLIL.expectedFeatures);
    }
}
