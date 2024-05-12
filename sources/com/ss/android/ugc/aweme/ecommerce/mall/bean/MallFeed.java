package com.ss.android.ugc.aweme.ecommerce.mall.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class MallFeed {

    @InterfaceC65349Pkn("extra")
    public final MallFeedAwemeExtra feedExtra;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("live")
    public final MallFeedAweme live;

    @InterfaceC65349Pkn("type")
    public final int type;

    @InterfaceC65349Pkn("video")
    public final MallFeedAweme video;

    public static /* synthetic */ MallFeed copy$default(MallFeed mallFeed, String str, int i, MallFeedAweme mallFeedAweme, MallFeedAweme mallFeedAweme2, MallFeedAwemeExtra mallFeedAwemeExtra, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = mallFeed.id;
        }
        if ((i2 & 2) != 0) {
            i = mallFeed.type;
        }
        if ((i2 & 4) != 0) {
            mallFeedAweme = mallFeed.video;
        }
        if ((i2 & 8) != 0) {
            mallFeedAweme2 = mallFeed.live;
        }
        if ((i2 & 16) != 0) {
            mallFeedAwemeExtra = mallFeed.feedExtra;
        }
        return mallFeed.copy(str, i, mallFeedAweme, mallFeedAweme2, mallFeedAwemeExtra);
    }

    public final MallFeed copy(String str, int i, MallFeedAweme mallFeedAweme, MallFeedAweme mallFeedAweme2, MallFeedAwemeExtra mallFeedAwemeExtra) {
        return new MallFeed(str, i, mallFeedAweme, mallFeedAweme2, mallFeedAwemeExtra);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallFeed)) {
            return false;
        }
        MallFeed mallFeed = (MallFeed) obj;
        return o.LJ(this.id, mallFeed.id) && this.type == mallFeed.type && o.LJ(this.video, mallFeed.video) && o.LJ(this.live, mallFeed.live) && o.LJ(this.feedExtra, mallFeed.feedExtra);
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.type) * 31;
        MallFeedAweme mallFeedAweme = this.video;
        int hashCode2 = (hashCode + (mallFeedAweme == null ? 0 : mallFeedAweme.hashCode())) * 31;
        MallFeedAweme mallFeedAweme2 = this.live;
        int hashCode3 = (hashCode2 + (mallFeedAweme2 == null ? 0 : mallFeedAweme2.hashCode())) * 31;
        MallFeedAwemeExtra mallFeedAwemeExtra = this.feedExtra;
        return hashCode3 + (mallFeedAwemeExtra != null ? mallFeedAwemeExtra.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MallFeed(id=");
        LIZ.append(this.id);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", video=");
        LIZ.append(this.video);
        LIZ.append(", live=");
        LIZ.append(this.live);
        LIZ.append(", feedExtra=");
        LIZ.append(this.feedExtra);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final MallFeedAwemeExtra getFeedExtra() {
        return this.feedExtra;
    }

    public final String getId() {
        return this.id;
    }

    public final MallFeedAweme getLive() {
        return this.live;
    }

    public final int getType() {
        return this.type;
    }

    public final MallFeedAweme getVideo() {
        return this.video;
    }

    public MallFeed(String str, int i, MallFeedAweme mallFeedAweme, MallFeedAweme mallFeedAweme2, MallFeedAwemeExtra mallFeedAwemeExtra) {
        this.id = str;
        this.type = i;
        this.video = mallFeedAweme;
        this.live = mallFeedAweme2;
        this.feedExtra = mallFeedAwemeExtra;
    }

    public /* synthetic */ MallFeed(String str, int i, MallFeedAweme mallFeedAweme, MallFeedAweme mallFeedAweme2, MallFeedAwemeExtra mallFeedAwemeExtra, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? null : mallFeedAweme, (i2 & 8) != 0 ? null : mallFeedAweme2, (i2 & 16) == 0 ? mallFeedAwemeExtra : null);
    }
}
