package X;

import com.ss.android.ugc.aweme.im.sdk.chatlist.experiment.DMAvatarLoadConfig;

/* loaded from: classes10.dex */
public final class LBT extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final LBT LJLIL = new LBT();

    public LBT() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (System.currentTimeMillis() % 100 < ((DMAvatarLoadConfig) LBS.LIZIZ.getValue()).eventSampleRate) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
