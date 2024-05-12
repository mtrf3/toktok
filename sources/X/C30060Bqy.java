package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveWatchLiveInteractionReuseSetting;

/* renamed from: X.Bqy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30060Bqy extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C30060Bqy LJLIL = new C30060Bqy();

    public C30060Bqy() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(LiveWatchLiveInteractionReuseSetting.INSTANCE.getValue());
    }
}
