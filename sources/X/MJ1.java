package X;

import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.ss.android.ugc.aweme.music.model.MusicDetail;

/* loaded from: classes10.dex */
public final class MJ1 extends AbstractC65781Prl implements InterfaceC65784Pro<C199547sM<MusicDetail>> {
    public static final MJ1 LJLIL = new MJ1();

    public MJ1() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C199547sM<MusicDetail> invoke() {
        return new C199547sM<>(16, LivePlayEnforceIntervalSetting.DEFAULT);
    }
}
