package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LivePullPureAudioSetting;

/* loaded from: classes6.dex */
public final class BZ7 extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final BZ7 LJLIL = new BZ7();

    public BZ7() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(LivePullPureAudioSetting.INSTANCE.getCurrentValue().getRetryDelay());
    }
}
