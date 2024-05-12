package com.ss.android.ugc.aweme.feed.model.live;

import X.C16880lQ;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class FeedRoomTag implements Serializable {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("da_info")
    public String daInfo;

    @InterfaceC65349Pkn("icon")
    public UrlModel icon;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("recommond_info")
    public final String recommendInfo;

    @InterfaceC65349Pkn("style")
    public int style;

    /* JADX WARN: Multi-variable type inference failed */
    public FeedRoomTag() {
        this(0L, 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FeedRoomTag copy$default(FeedRoomTag feedRoomTag, long j, int i, String str, UrlModel urlModel, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = feedRoomTag.id;
        }
        if ((i2 & 2) != 0) {
            i = feedRoomTag.style;
        }
        if ((i2 & 4) != 0) {
            str = feedRoomTag.content;
        }
        if ((i2 & 8) != 0) {
            urlModel = feedRoomTag.icon;
        }
        if ((i2 & 16) != 0) {
            str2 = feedRoomTag.daInfo;
        }
        if ((i2 & 32) != 0) {
            str3 = feedRoomTag.recommendInfo;
        }
        return feedRoomTag.copy(j, i, str, urlModel, str2, str3);
    }

    public final FeedRoomTag copy(long j, int i, String content, UrlModel urlModel, String str, String str2) {
        o.LJIIIZ(content, "content");
        return new FeedRoomTag(j, i, content, urlModel, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedRoomTag)) {
            return false;
        }
        FeedRoomTag feedRoomTag = (FeedRoomTag) obj;
        return this.id == feedRoomTag.id && this.style == feedRoomTag.style && o.LJ(this.content, feedRoomTag.content) && o.LJ(this.icon, feedRoomTag.icon) && o.LJ(this.daInfo, feedRoomTag.daInfo) && o.LJ(this.recommendInfo, feedRoomTag.recommendInfo);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int LJ = C79062V1e.LJ(this.content, ((C16880lQ.LLJIJIL(this.id) * 31) + this.style) * 31, 31);
        UrlModel urlModel = this.icon;
        int i = 0;
        if (urlModel == null) {
            hashCode = 0;
        } else {
            hashCode = urlModel.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str = this.daInfo;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.recommendInfo;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedRoomTag(id=");
        LIZ.append(this.id);
        LIZ.append(", style=");
        LIZ.append(this.style);
        LIZ.append(", content=");
        LIZ.append(this.content);
        LIZ.append(", icon=");
        LIZ.append(this.icon);
        LIZ.append(", daInfo=");
        LIZ.append(this.daInfo);
        LIZ.append(", recommendInfo=");
        return q.LIZIZ(LIZ, this.recommendInfo, ')', LIZ);
    }

    /* loaded from: classes13.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final String getContent() {
        return this.content;
    }

    public final String getDaInfo() {
        return this.daInfo;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final long getId() {
        return this.id;
    }

    public final String getRecommendInfo() {
        return this.recommendInfo;
    }

    public final int getStyle() {
        return this.style;
    }

    public final void setContent(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.content = str;
    }

    public final void setDaInfo(String str) {
        this.daInfo = str;
    }

    public final void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setStyle(int i) {
        this.style = i;
    }

    public FeedRoomTag(long j, int i, String content, UrlModel urlModel, String str, String str2) {
        o.LJIIIZ(content, "content");
        this.id = j;
        this.style = i;
        this.content = content;
        this.icon = urlModel;
        this.daInfo = str;
        this.recommendInfo = str2;
    }

    public /* synthetic */ FeedRoomTag(long j, int i, String str, UrlModel urlModel, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1L : j, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? null : urlModel, (i2 & 16) != 0 ? null : str2, (i2 & 32) == 0 ? str3 : null);
    }
}
