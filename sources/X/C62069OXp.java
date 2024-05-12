package X;

import com.ss.android.ugc.aweme.experiment.ChannelReRankAndFlipConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.OXp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62069OXp extends AbstractC65781Prl implements InterfaceC65784Pro<ChannelReRankAndFlipConfig> {
    public static final C62069OXp LJLIL = new C62069OXp();

    public C62069OXp() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final ChannelReRankAndFlipConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        ChannelReRankAndFlipConfig channelReRankAndFlipConfig = C62068OXo.LIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "channel_re_rank_and_flip_optimize", 31744, ChannelReRankAndFlipConfig.class, channelReRankAndFlipConfig);
        if (LJIJ != 0) {
            channelReRankAndFlipConfig = LJIJ;
        }
        o.LJIIIIZZ(channelReRankAndFlipConfig, "ABManager.getInstance().…n::class.java) ?: DEFAULT");
        return channelReRankAndFlipConfig;
    }
}
