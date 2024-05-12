package com.ss.android.ugc.aweme.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class ChannelReRankAndFlipConfig extends F9E {

    @InterfaceC65349Pkn("br_flip_logic")
    public final int brFlipLogic;

    @InterfaceC65349Pkn("copylink_flip_logic")
    public final int copylinkFlipLogic;

    @InterfaceC65349Pkn("re_rank_logic")
    public final int rerankLogic;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ChannelReRankAndFlipConfig() {
        /*
            r6 = this;
            r1 = 0
            r4 = 7
            r5 = 0
            r0 = r6
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.experiment.ChannelReRankAndFlipConfig.<init>():void");
    }

    public static /* synthetic */ ChannelReRankAndFlipConfig copy$default(ChannelReRankAndFlipConfig channelReRankAndFlipConfig, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = channelReRankAndFlipConfig.rerankLogic;
        }
        if ((i4 & 2) != 0) {
            i2 = channelReRankAndFlipConfig.copylinkFlipLogic;
        }
        if ((i4 & 4) != 0) {
            i3 = channelReRankAndFlipConfig.brFlipLogic;
        }
        return channelReRankAndFlipConfig.copy(i, i2, i3);
    }

    public final ChannelReRankAndFlipConfig copy(int i, int i2, int i3) {
        return new ChannelReRankAndFlipConfig(i, i2, i3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.rerankLogic), Integer.valueOf(this.copylinkFlipLogic), Integer.valueOf(this.brFlipLogic)};
    }

    public final int getBrFlipLogic() {
        return this.brFlipLogic;
    }

    public final int getCopylinkFlipLogic() {
        return this.copylinkFlipLogic;
    }

    public final int getRerankLogic() {
        return this.rerankLogic;
    }

    public ChannelReRankAndFlipConfig(int i, int i2, int i3) {
        this.rerankLogic = i;
        this.copylinkFlipLogic = i2;
        this.brFlipLogic = i3;
    }

    public /* synthetic */ ChannelReRankAndFlipConfig(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
