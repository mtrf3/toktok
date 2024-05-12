package com.bytedance.android.livesdk.model.message;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.common.Text;

/* loaded from: classes6.dex */
public final class RankUpdate {
    public RankAnimationInfo animationInfo;
    public int belongType;
    public long countdown = 1000;
    public Text defaultContent;
    public long ownRank;

    @InterfaceC65349Pkn("OwnerOnRank")
    public boolean owneronrank;
    public int rankType;

    @InterfaceC65349Pkn("request_first_show_type")
    public int requestFirstShowType;

    @InterfaceC65349Pkn("supported_version")
    public long supportedVersion;
}
