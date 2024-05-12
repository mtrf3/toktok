package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.ss.android.ugc.aweme.impl.StrategyImpl;
import com.ss.android.ugc.aweme.player.ab.abs.buffer.PlayeAbBufferConfigData;

/* renamed from: X.EKs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36254EKs extends AbstractC65781Prl implements InterfaceC65784Pro<PlayeAbBufferConfigData> {
    public static final C36254EKs LJLIL = new C36254EKs();

    public C36254EKs() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, com.ss.android.ugc.aweme.player.ab.abs.buffer.PlayeAbBufferConfigData] */
    @Override // X.InterfaceC65784Pro
    public final PlayeAbBufferConfigData invoke() {
        boolean LIZ = C33827DPj.LIZ();
        PlayeAbBufferConfigData playeAbBufferConfigData = new PlayeAbBufferConfigData();
        playeAbBufferConfigData.setInteractionBlockDurationPreloaded(LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
        playeAbBufferConfigData.setInteractionBlockDurationNonPreloaded(800);
        playeAbBufferConfigData.setNetBlockDurationMax(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
        playeAbBufferConfigData.setNetBlockIncFactor(9.0f);
        playeAbBufferConfigData.setNetBlockDurationInitial(800);
        return C78596Usy.LJJIJIIJIL(LIZ, playeAbBufferConfigData, C36256EKu.LIZ.contains(StrategyImpl.LIZIZ().LJJIII()), C36255EKt.LJLIL);
    }
}
