package com.ss.android.ugc.aweme.discover.model;

import X.C07670Rv;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchOperation implements Serializable {

    @InterfaceC65349Pkn("banner")
    public UrlModel banner;

    @InterfaceC65349Pkn("activity_id")
    public String cardId;

    @InterfaceC65349Pkn("link_desc")
    public String desc;

    @InterfaceC65349Pkn("doc_id")
    public String docId;
    public boolean isLive;

    @InterfaceC65349Pkn("link_url")
    public String link;

    @InterfaceC65349Pkn("live_type")
    public Integer liveType;
    public boolean recorded;

    @InterfaceC65349Pkn("related_users")
    public List<? extends User> relatedUsers;

    @InterfaceC65349Pkn("scale")
    public Integer scale;

    @InterfaceC65349Pkn("title")
    public String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchOperation copy$default(SearchOperation searchOperation, String str, String str2, String str3, UrlModel urlModel, String str4, List list, Integer num, Integer num2, boolean z, boolean z2, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchOperation.title;
        }
        if ((i & 2) != 0) {
            str2 = searchOperation.desc;
        }
        if ((i & 4) != 0) {
            str3 = searchOperation.link;
        }
        if ((i & 8) != 0) {
            urlModel = searchOperation.banner;
        }
        if ((i & 16) != 0) {
            str4 = searchOperation.cardId;
        }
        if ((i & 32) != 0) {
            list = searchOperation.relatedUsers;
        }
        if ((i & 64) != 0) {
            num = searchOperation.scale;
        }
        if ((i & 128) != 0) {
            num2 = searchOperation.liveType;
        }
        if ((i & 256) != 0) {
            z = searchOperation.recorded;
        }
        if ((i & 512) != 0) {
            z2 = searchOperation.isLive;
        }
        if ((i & 1024) != 0) {
            str5 = searchOperation.docId;
        }
        return searchOperation.copy(str, str2, str3, urlModel, str4, list, num, num2, z, z2, str5);
    }

    public final SearchOperation copy(String title, String desc, String link, UrlModel banner, String cardId, List<? extends User> list, Integer num, Integer num2, boolean z, boolean z2, String str) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(desc, "desc");
        o.LJIIIZ(link, "link");
        o.LJIIIZ(banner, "banner");
        o.LJIIIZ(cardId, "cardId");
        return new SearchOperation(title, desc, link, banner, cardId, list, num, num2, z, z2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchOperation)) {
            return false;
        }
        SearchOperation searchOperation = (SearchOperation) obj;
        return o.LJ(this.title, searchOperation.title) && o.LJ(this.desc, searchOperation.desc) && o.LJ(this.link, searchOperation.link) && o.LJ(this.banner, searchOperation.banner) && o.LJ(this.cardId, searchOperation.cardId) && o.LJ(this.relatedUsers, searchOperation.relatedUsers) && o.LJ(this.scale, searchOperation.scale) && o.LJ(this.liveType, searchOperation.liveType) && this.recorded == searchOperation.recorded && this.isLive == searchOperation.isLive && o.LJ(this.docId, searchOperation.docId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int LJ = C79062V1e.LJ(this.cardId, (this.banner.hashCode() + C79062V1e.LJ(this.link, C79062V1e.LJ(this.desc, this.title.hashCode() * 31, 31), 31)) * 31, 31);
        List<? extends User> list = this.relatedUsers;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        Integer num = this.scale;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Integer num2 = this.liveType;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        boolean z = this.recorded;
        int i5 = 1;
        int i6 = z;
        if (z != 0) {
            i6 = 1;
        }
        int i7 = (i4 + i6) * 31;
        if (!this.isLive) {
            i5 = 0;
        }
        int i8 = (i7 + i5) * 31;
        String str = this.docId;
        if (str != null) {
            i = str.hashCode();
        }
        return i8 + i;
    }

    public final boolean isPortraitVideo() {
        Integer num = this.liveType;
        if (num == null || num.intValue() != 2) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SearchOperation(title=");
        sb.append(this.title);
        sb.append(", desc=");
        sb.append(this.desc);
        sb.append(", link=");
        sb.append(this.link);
        sb.append(", banner=");
        sb.append(this.banner);
        sb.append(", cardId=");
        sb.append(this.cardId);
        sb.append(", relatedUsers=");
        sb.append(this.relatedUsers);
        sb.append(", scale=");
        sb.append(this.scale);
        sb.append(", liveType=");
        sb.append(this.liveType);
        sb.append(", recorded=");
        sb.append(this.recorded);
        sb.append(", isLive=");
        sb.append(this.isLive);
        sb.append(", docId=");
        return C07670Rv.LIZIZ(sb, this.docId, ')');
    }

    public final UrlModel getBanner() {
        return this.banner;
    }

    public final String getCardId() {
        return this.cardId;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getDocId() {
        return this.docId;
    }

    public final String getLink() {
        return this.link;
    }

    public final Integer getLiveType() {
        return this.liveType;
    }

    public final boolean getRecorded() {
        return this.recorded;
    }

    public final List<User> getRelatedUsers() {
        return this.relatedUsers;
    }

    public final Integer getScale() {
        return this.scale;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isLive() {
        return this.isLive;
    }

    public final void setBanner(UrlModel urlModel) {
        o.LJIIIZ(urlModel, "<set-?>");
        this.banner = urlModel;
    }

    public final void setCardId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.cardId = str;
    }

    public final void setDesc(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.desc = str;
    }

    public final void setDocId(String str) {
        this.docId = str;
    }

    public final void setLink(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.link = str;
    }

    public final void setLive(boolean z) {
        this.isLive = z;
    }

    public final void setLiveType(Integer num) {
        this.liveType = num;
    }

    public final void setRecorded(boolean z) {
        this.recorded = z;
    }

    public final void setRelatedUsers(List<? extends User> list) {
        this.relatedUsers = list;
    }

    public final void setScale(Integer num) {
        this.scale = num;
    }

    public final void setTitle(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.title = str;
    }

    public SearchOperation(String title, String desc, String link, UrlModel banner, String cardId, List<? extends User> list, Integer num, Integer num2, boolean z, boolean z2, String str) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(desc, "desc");
        o.LJIIIZ(link, "link");
        o.LJIIIZ(banner, "banner");
        o.LJIIIZ(cardId, "cardId");
        this.title = title;
        this.desc = desc;
        this.link = link;
        this.banner = banner;
        this.cardId = cardId;
        this.relatedUsers = list;
        this.scale = num;
        this.liveType = num2;
        this.recorded = z;
        this.isLive = z2;
        this.docId = str;
    }

    public /* synthetic */ SearchOperation(String str, String str2, String str3, UrlModel urlModel, String str4, List list, Integer num, Integer num2, boolean z, boolean z2, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, urlModel, str4, list, num, num2, (i & 256) != 0 ? false : z, (i & 512) != 0 ? false : z2, str5);
    }
}
