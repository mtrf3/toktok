package X;

import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.ss.android.ugc.aweme.music.model.MusicDetail;

/* renamed from: X.8SX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8SX extends AbstractC65781Prl implements InterfaceC65784Pro<C199547sM<MusicDetail>> {
    public static final C8SX LJLIL = new C8SX();

    public C8SX() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C199547sM<MusicDetail> invoke() {
        return new C199547sM<>(16, LivePlayEnforceIntervalSetting.DEFAULT);
    }
}
