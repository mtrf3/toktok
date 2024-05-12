package com.ss.android.ugc.aweme.friendstab.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ContentMetadata {

    @InterfaceC65349Pkn("author_id")
    public final String authorId;

    @InterfaceC65349Pkn("aweme_type")
    public final Integer awemeType;

    @InterfaceC65349Pkn("create_time")
    public final Long createTime;

    @InterfaceC65349Pkn("friend_relation_status")
    public final int friendRelationStatus;

    @InterfaceC65349Pkn("is_tiktok_story")
    public final Boolean isTikTokStory;

    @InterfaceC65349Pkn("item_id")
    public final String itemId;

    /* JADX WARN: Multi-variable type inference failed */
    public ContentMetadata() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 63, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ContentMetadata copy$default(ContentMetadata contentMetadata, String str, String str2, Integer num, Boolean bool, Long l, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = contentMetadata.itemId;
        }
        if ((i2 & 2) != 0) {
            str2 = contentMetadata.authorId;
        }
        if ((i2 & 4) != 0) {
            num = contentMetadata.awemeType;
        }
        if ((i2 & 8) != 0) {
            bool = contentMetadata.isTikTokStory;
        }
        if ((i2 & 16) != 0) {
            l = contentMetadata.createTime;
        }
        if ((i2 & 32) != 0) {
            i = contentMetadata.friendRelationStatus;
        }
        return contentMetadata.copy(str, str2, num, bool, l, i);
    }

    public final ContentMetadata copy(String str, String str2, Integer num, Boolean bool, Long l, int i) {
        return new ContentMetadata(str, str2, num, bool, l, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentMetadata)) {
            return false;
        }
        ContentMetadata contentMetadata = (ContentMetadata) obj;
        return o.LJ(this.itemId, contentMetadata.itemId) && o.LJ(this.authorId, contentMetadata.authorId) && o.LJ(this.awemeType, contentMetadata.awemeType) && o.LJ(this.isTikTokStory, contentMetadata.isTikTokStory) && o.LJ(this.createTime, contentMetadata.createTime) && this.friendRelationStatus == contentMetadata.friendRelationStatus;
    }

    public int hashCode() {
        String str = this.itemId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.authorId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.awemeType;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isTikTokStory;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.createTime;
        return ((hashCode4 + (l != null ? l.hashCode() : 0)) * 31) + this.friendRelationStatus;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ContentMetadata(itemId=");
        LIZ.append(this.itemId);
        LIZ.append(", authorId=");
        LIZ.append(this.authorId);
        LIZ.append(", awemeType=");
        LIZ.append(this.awemeType);
        LIZ.append(", isTikTokStory=");
        LIZ.append(this.isTikTokStory);
        LIZ.append(", createTime=");
        LIZ.append(this.createTime);
        LIZ.append(", friendRelationStatus=");
        return b0.LIZJ(LIZ, this.friendRelationStatus, ')', LIZ);
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final Integer getAwemeType() {
        return this.awemeType;
    }

    public final Long getCreateTime() {
        return this.createTime;
    }

    public final int getFriendRelationStatus() {
        return this.friendRelationStatus;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final Boolean isTikTokStory() {
        return this.isTikTokStory;
    }

    public ContentMetadata(String str, String str2, Integer num, Boolean bool, Long l, int i) {
        this.itemId = str;
        this.authorId = str2;
        this.awemeType = num;
        this.isTikTokStory = bool;
        this.createTime = l;
        this.friendRelationStatus = i;
    }

    public /* synthetic */ ContentMetadata(String str, String str2, Integer num, Boolean bool, Long l, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) == 0 ? str2 : "", (i2 & 4) != 0 ? -1 : num, (i2 & 8) != 0 ? Boolean.FALSE : bool, (i2 & 16) != 0 ? 0L : l, (i2 & 32) != 0 ? 0 : i);
    }
}
