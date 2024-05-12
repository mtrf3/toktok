package com.ss.android.ugc.aweme.ecommerce.mall.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class MallSkyLightFeed {

    @InterfaceC65349Pkn("live")
    public final MallSkyLightFeedLive live;

    @InterfaceC65349Pkn("type")
    public final int type;

    public static /* synthetic */ MallSkyLightFeed copy$default(MallSkyLightFeed mallSkyLightFeed, int i, MallSkyLightFeedLive mallSkyLightFeedLive, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = mallSkyLightFeed.type;
        }
        if ((i2 & 2) != 0) {
            mallSkyLightFeedLive = mallSkyLightFeed.live;
        }
        return mallSkyLightFeed.copy(i, mallSkyLightFeedLive);
    }

    public final MallSkyLightFeed copy(int i, MallSkyLightFeedLive mallSkyLightFeedLive) {
        return new MallSkyLightFeed(i, mallSkyLightFeedLive);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallSkyLightFeed)) {
            return false;
        }
        MallSkyLightFeed mallSkyLightFeed = (MallSkyLightFeed) obj;
        return this.type == mallSkyLightFeed.type && o.LJ(this.live, mallSkyLightFeed.live);
    }

    public int hashCode() {
        int i = this.type * 31;
        MallSkyLightFeedLive mallSkyLightFeedLive = this.live;
        return i + (mallSkyLightFeedLive == null ? 0 : mallSkyLightFeedLive.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MallSkyLightFeed(type=");
        LIZ.append(this.type);
        LIZ.append(", live=");
        LIZ.append(this.live);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final MallSkyLightFeedLive getLive() {
        return this.live;
    }

    public final int getType() {
        return this.type;
    }

    public MallSkyLightFeed(int i, MallSkyLightFeedLive mallSkyLightFeedLive) {
        this.type = i;
        this.live = mallSkyLightFeedLive;
    }

    public /* synthetic */ MallSkyLightFeed(int i, MallSkyLightFeedLive mallSkyLightFeedLive, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : mallSkyLightFeedLive);
    }
}
