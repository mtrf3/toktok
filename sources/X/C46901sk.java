package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveGameDualDeviceSourceSetting;

/* renamed from: X.1sk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46901sk extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C46901sk LJLIL = new C46901sk();

    public C46901sk() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(LiveGameDualDeviceSourceSetting.INSTANCE.getDuration());
    }
}
