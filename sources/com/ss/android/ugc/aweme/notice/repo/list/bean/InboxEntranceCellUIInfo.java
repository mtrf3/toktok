package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C79062V1e;
import X.HH1;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class InboxEntranceCellUIInfo {

    @InterfaceC65349Pkn("avatar_image_url")
    public final UrlModel avatarImageUrl;

    @InterfaceC65349Pkn("avatar_dark_image_url")
    public final UrlModel avatarImageUrlDark;

    @InterfaceC65349Pkn("content")
    public final String content;

    @InterfaceC65349Pkn("schema_url")
    public final String schemaUrl;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("ui_style")
    public final int uiStyle;

    @InterfaceC65349Pkn("unread_count_style")
    public final int unreadType;

    public InboxEntranceCellUIInfo() {
        this(0, null, null, null, null, 0, null, 127, null);
    }

    public static /* synthetic */ InboxEntranceCellUIInfo copy$default(InboxEntranceCellUIInfo inboxEntranceCellUIInfo, int i, UrlModel urlModel, UrlModel urlModel2, String str, String str2, int i2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = inboxEntranceCellUIInfo.uiStyle;
        }
        if ((i3 & 2) != 0) {
            urlModel = inboxEntranceCellUIInfo.avatarImageUrl;
        }
        if ((i3 & 4) != 0) {
            urlModel2 = inboxEntranceCellUIInfo.avatarImageUrlDark;
        }
        if ((i3 & 8) != 0) {
            str = inboxEntranceCellUIInfo.title;
        }
        if ((i3 & 16) != 0) {
            str2 = inboxEntranceCellUIInfo.content;
        }
        if ((i3 & 32) != 0) {
            i2 = inboxEntranceCellUIInfo.unreadType;
        }
        if ((i3 & 64) != 0) {
            str3 = inboxEntranceCellUIInfo.schemaUrl;
        }
        return inboxEntranceCellUIInfo.copy(i, urlModel, urlModel2, str, str2, i2, str3);
    }

    public final InboxEntranceCellUIInfo copy(int i, UrlModel urlModel, UrlModel urlModel2, String title, String content, int i2, String schemaUrl) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(content, "content");
        o.LJIIIZ(schemaUrl, "schemaUrl");
        return new InboxEntranceCellUIInfo(i, urlModel, urlModel2, title, content, i2, schemaUrl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboxEntranceCellUIInfo)) {
            return false;
        }
        InboxEntranceCellUIInfo inboxEntranceCellUIInfo = (InboxEntranceCellUIInfo) obj;
        return this.uiStyle == inboxEntranceCellUIInfo.uiStyle && o.LJ(this.avatarImageUrl, inboxEntranceCellUIInfo.avatarImageUrl) && o.LJ(this.avatarImageUrlDark, inboxEntranceCellUIInfo.avatarImageUrlDark) && o.LJ(this.title, inboxEntranceCellUIInfo.title) && o.LJ(this.content, inboxEntranceCellUIInfo.content) && this.unreadType == inboxEntranceCellUIInfo.unreadType && o.LJ(this.schemaUrl, inboxEntranceCellUIInfo.schemaUrl);
    }

    public int hashCode() {
        int hashCode;
        int i = this.uiStyle * 31;
        UrlModel urlModel = this.avatarImageUrl;
        int i2 = 0;
        if (urlModel == null) {
            hashCode = 0;
        } else {
            hashCode = urlModel.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        UrlModel urlModel2 = this.avatarImageUrlDark;
        if (urlModel2 != null) {
            i2 = urlModel2.hashCode();
        }
        return this.schemaUrl.hashCode() + ((C79062V1e.LJ(this.content, C79062V1e.LJ(this.title, (i3 + i2) * 31, 31), 31) + this.unreadType) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InboxEntranceCellUIInfo(uiStyle=");
        LIZ.append(this.uiStyle);
        LIZ.append(", avatarImageUrl=");
        LIZ.append(this.avatarImageUrl);
        LIZ.append(", avatarImageUrlDark=");
        LIZ.append(this.avatarImageUrlDark);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", content=");
        LIZ.append(this.content);
        LIZ.append(", unreadType=");
        LIZ.append(this.unreadType);
        LIZ.append(", schemaUrl=");
        return q.LIZIZ(LIZ, this.schemaUrl, ')', LIZ);
    }

    public final UrlModel getAvatarImageUrl() {
        return this.avatarImageUrl;
    }

    public final UrlModel getAvatarImageUrlDark() {
        return this.avatarImageUrlDark;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getSchemaUrl() {
        return this.schemaUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getUiStyle() {
        return this.uiStyle;
    }

    public final int getUnreadType() {
        return this.unreadType;
    }

    public InboxEntranceCellUIInfo(int i, UrlModel urlModel, UrlModel urlModel2, String str, String str2, int i2, String str3) {
        HH1.LIZ(str, "title", str2, "content", str3, "schemaUrl");
        this.uiStyle = i;
        this.avatarImageUrl = urlModel;
        this.avatarImageUrlDark = urlModel2;
        this.title = str;
        this.content = str2;
        this.unreadType = i2;
        this.schemaUrl = str3;
    }

    public /* synthetic */ InboxEntranceCellUIInfo(int i, UrlModel urlModel, UrlModel urlModel2, String str, String str2, int i2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 2 : i, (i3 & 2) != 0 ? null : urlModel, (i3 & 4) == 0 ? urlModel2 : null, (i3 & 8) != 0 ? "" : str, (i3 & 16) != 0 ? "" : str2, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) == 0 ? str3 : "");
    }
}
