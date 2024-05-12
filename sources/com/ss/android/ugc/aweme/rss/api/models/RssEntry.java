package com.ss.android.ugc.aweme.rss.api.models;

import X.AnonymousClass391;
import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RssEntry {

    @InterfaceC65349Pkn("date_unix_milliseconds")
    public final Long date;

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("rss_entry_guid")
    public final String guid;

    @InterfaceC65349Pkn("has_max_images")
    public final Boolean hasMaxImages;

    @InterfaceC65349Pkn("image_url")
    public final List<UrlModel> imageUrl;

    @InterfaceC65349Pkn("item_ids")
    public final List<Long> itemIds;

    @InterfaceC65349Pkn("link")
    public final String linkUrl;

    @InterfaceC65349Pkn("rss_url")
    public final String rssUrl;

    @InterfaceC65349Pkn("status")
    public final int status;

    @InterfaceC65349Pkn("title")
    public final String title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RssEntry)) {
            return false;
        }
        RssEntry rssEntry = (RssEntry) obj;
        return o.LJ(this.guid, rssEntry.guid) && o.LJ(this.linkUrl, rssEntry.linkUrl) && o.LJ(this.title, rssEntry.title) && o.LJ(this.description, rssEntry.description) && o.LJ(this.imageUrl, rssEntry.imageUrl) && this.status == rssEntry.status && o.LJ(this.itemIds, rssEntry.itemIds) && o.LJ(this.rssUrl, rssEntry.rssUrl) && o.LJ(this.date, rssEntry.date) && o.LJ(this.hasMaxImages, rssEntry.hasMaxImages);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        String str = this.guid;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.linkUrl;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.title;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.description;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int LIZIZ = (AnonymousClass391.LIZIZ(this.imageUrl, (i4 + hashCode4) * 31, 31) + this.status) * 31;
        List<Long> list = this.itemIds;
        if (list == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = list.hashCode();
        }
        int i5 = (LIZIZ + hashCode5) * 31;
        String str5 = this.rssUrl;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        Long l = this.date;
        if (l == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = l.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        Boolean bool = this.hasMaxImages;
        if (bool != null) {
            i = bool.hashCode();
        }
        return i7 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RssEntry(guid=");
        LIZ.append(this.guid);
        LIZ.append(", linkUrl=");
        LIZ.append(this.linkUrl);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", description=");
        LIZ.append(this.description);
        LIZ.append(", imageUrl=");
        LIZ.append(this.imageUrl);
        LIZ.append(", status=");
        LIZ.append(this.status);
        LIZ.append(", itemIds=");
        LIZ.append(this.itemIds);
        LIZ.append(", rssUrl=");
        LIZ.append(this.rssUrl);
        LIZ.append(", date=");
        LIZ.append(this.date);
        LIZ.append(", hasMaxImages=");
        return C78920UyC.LIZIZ(LIZ, this.hasMaxImages, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RssEntry(String str, String str2, String str3, String str4, List<? extends UrlModel> imageUrl, int i, List<Long> list, String str5, Long l, Boolean bool) {
        o.LJIIIZ(imageUrl, "imageUrl");
        this.guid = str;
        this.linkUrl = str2;
        this.title = str3;
        this.description = str4;
        this.imageUrl = imageUrl;
        this.status = i;
        this.itemIds = list;
        this.rssUrl = str5;
        this.date = l;
        this.hasMaxImages = bool;
    }
}
