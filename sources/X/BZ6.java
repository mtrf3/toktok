package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LivePullPureAudioSetting;

/* loaded from: classes6.dex */
public final class BZ6 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final BZ6 LJLIL = new BZ6();

    public BZ6() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(LivePullPureAudioSetting.INSTANCE.getCurrentValue().getRetryCount());
    }
}
