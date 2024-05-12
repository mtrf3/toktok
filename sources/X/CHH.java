package X;

import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenDirectDispatchSetting;

/* loaded from: classes6.dex */
public final class CHH extends AbstractC65781Prl implements InterfaceC65784Pro<LivePublicScreenDirectDispatchSetting.LivePublicScreenDistributeConfig> {
    public static final CHH LJLIL = new CHH();

    public CHH() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final LivePublicScreenDirectDispatchSetting.LivePublicScreenDistributeConfig invoke() {
        return LivePublicScreenDirectDispatchSetting.getValue();
    }
}
