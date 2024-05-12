package com.ss.android.ugc.aweme.nows.feed.optimize;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class NowFeedXmlPreLoadConfig extends F9E {

    @InterfaceC65349Pkn("only_for_now_feed")
    public final boolean onlyForNowFeed;

    @InterfaceC65349Pkn("other_post_layout_num")
    public final int otherPostLayoutNum;

    @InterfaceC65349Pkn("other_post_layout_num_for_fps")
    public final int otherPostLayoutNumForFPS;

    @InterfaceC65349Pkn("self_post_container_layout_num")
    public final int selfPostContainerLayoutNum;

    @InterfaceC65349Pkn("self_post_layout_num")
    public final int selfPostLayoutNum;

    @InterfaceC65349Pkn("special_layout_preload_num")
    public final int specialLayoutPreLoadNum;

    /* JADX WARN: Multi-variable type inference failed */
    public NowFeedXmlPreLoadConfig() {
        this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, null);
    }

    public static /* synthetic */ NowFeedXmlPreLoadConfig copy$default(NowFeedXmlPreLoadConfig nowFeedXmlPreLoadConfig, int i, int i2, int i3, int i4, int i5, boolean z, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = nowFeedXmlPreLoadConfig.specialLayoutPreLoadNum;
        }
        if ((i6 & 2) != 0) {
            i2 = nowFeedXmlPreLoadConfig.selfPostContainerLayoutNum;
        }
        if ((i6 & 4) != 0) {
            i3 = nowFeedXmlPreLoadConfig.otherPostLayoutNum;
        }
        if ((i6 & 8) != 0) {
            i4 = nowFeedXmlPreLoadConfig.selfPostLayoutNum;
        }
        if ((i6 & 16) != 0) {
            i5 = nowFeedXmlPreLoadConfig.otherPostLayoutNumForFPS;
        }
        if ((i6 & 32) != 0) {
            z = nowFeedXmlPreLoadConfig.onlyForNowFeed;
        }
        return nowFeedXmlPreLoadConfig.copy(i, i2, i3, i4, i5, z);
    }

    public final NowFeedXmlPreLoadConfig copy(int i, int i2, int i3, int i4, int i5, boolean z) {
        return new NowFeedXmlPreLoadConfig(i, i2, i3, i4, i5, z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.specialLayoutPreLoadNum), Integer.valueOf(this.selfPostContainerLayoutNum), Integer.valueOf(this.otherPostLayoutNum), Integer.valueOf(this.selfPostLayoutNum), Integer.valueOf(this.otherPostLayoutNumForFPS), Boolean.valueOf(this.onlyForNowFeed)};
    }

    public final boolean getOnlyForNowFeed() {
        return this.onlyForNowFeed;
    }

    public final int getOtherPostLayoutNum() {
        return this.otherPostLayoutNum;
    }

    public final int getOtherPostLayoutNumForFPS() {
        return this.otherPostLayoutNumForFPS;
    }

    public final int getSelfPostContainerLayoutNum() {
        return this.selfPostContainerLayoutNum;
    }

    public final int getSelfPostLayoutNum() {
        return this.selfPostLayoutNum;
    }

    public final int getSpecialLayoutPreLoadNum() {
        return this.specialLayoutPreLoadNum;
    }

    public NowFeedXmlPreLoadConfig(int i, int i2, int i3, int i4, int i5, boolean z) {
        this.specialLayoutPreLoadNum = i;
        this.selfPostContainerLayoutNum = i2;
        this.otherPostLayoutNum = i3;
        this.selfPostLayoutNum = i4;
        this.otherPostLayoutNumForFPS = i5;
        this.onlyForNowFeed = z;
    }

    public /* synthetic */ NowFeedXmlPreLoadConfig(int i, int i2, int i3, int i4, int i5, boolean z, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 1 : i, (i6 & 2) == 0 ? i2 : 1, (i6 & 4) != 0 ? 2 : i3, (i6 & 8) != 0 ? 3 : i4, (i6 & 16) != 0 ? 2 : i5, (i6 & 32) != 0 ? false : z);
    }
}
