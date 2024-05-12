package com.ss.android.ugc.aweme.emoji.stickerstore.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StickerSetInfo implements Serializable {

    @InterfaceC65349Pkn("creator_avatar_url")
    public final UrlModel authorAvatar;

    @InterfaceC65349Pkn("creator_nickname")
    public final String authorName;

    @InterfaceC65349Pkn("creator_uid")
    public final Long authorUid;

    @InterfaceC65349Pkn("created_time")
    public final Long createdTime;

    @InterfaceC65349Pkn("description")
    public final String desc;

    @InterfaceC65349Pkn("icon_url")
    public final StickerUrlStruct iconUrl;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("id")
    public final Long setId;

    @InterfaceC65349Pkn("status")
    public final Integer setStatus;

    @InterfaceC65349Pkn("status_msg")
    public final String setStatusMsg;

    @InterfaceC65349Pkn("sticker_meta")
    public final IMStickerMeta stickerMeta;

    @InterfaceC65349Pkn("sticker_type")
    public final Integer stickerType;

    @InterfaceC65349Pkn("updated_time")
    public final Long updatedTime;

    /* JADX WARN: Multi-variable type inference failed */
    public StickerSetInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 8191, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ StickerSetInfo copy$default(StickerSetInfo stickerSetInfo, Long l, String str, String str2, StickerUrlStruct stickerUrlStruct, Integer num, Long l2, UrlModel urlModel, String str3, Integer num2, String str4, Long l3, Long l4, IMStickerMeta iMStickerMeta, int i, Object obj) {
        if ((i & 1) != 0) {
            l = stickerSetInfo.setId;
        }
        if ((i & 2) != 0) {
            str = stickerSetInfo.name;
        }
        if ((i & 4) != 0) {
            str2 = stickerSetInfo.desc;
        }
        if ((i & 8) != 0) {
            stickerUrlStruct = stickerSetInfo.iconUrl;
        }
        if ((i & 16) != 0) {
            num = stickerSetInfo.stickerType;
        }
        if ((i & 32) != 0) {
            l2 = stickerSetInfo.authorUid;
        }
        if ((i & 64) != 0) {
            urlModel = stickerSetInfo.authorAvatar;
        }
        if ((i & 128) != 0) {
            str3 = stickerSetInfo.authorName;
        }
        if ((i & 256) != 0) {
            num2 = stickerSetInfo.setStatus;
        }
        if ((i & 512) != 0) {
            str4 = stickerSetInfo.setStatusMsg;
        }
        if ((i & 1024) != 0) {
            l3 = stickerSetInfo.createdTime;
        }
        if ((i & 2048) != 0) {
            l4 = stickerSetInfo.updatedTime;
        }
        if ((i & 4096) != 0) {
            iMStickerMeta = stickerSetInfo.stickerMeta;
        }
        return stickerSetInfo.copy(l, str, str2, stickerUrlStruct, num, l2, urlModel, str3, num2, str4, l3, l4, iMStickerMeta);
    }

    public final StickerSetInfo copy(Long l, String str, String str2, StickerUrlStruct stickerUrlStruct, Integer num, Long l2, UrlModel urlModel, String str3, Integer num2, String str4, Long l3, Long l4, IMStickerMeta iMStickerMeta) {
        return new StickerSetInfo(l, str, str2, stickerUrlStruct, num, l2, urlModel, str3, num2, str4, l3, l4, iMStickerMeta);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerSetInfo)) {
            return false;
        }
        StickerSetInfo stickerSetInfo = (StickerSetInfo) obj;
        return o.LJ(this.setId, stickerSetInfo.setId) && o.LJ(this.name, stickerSetInfo.name) && o.LJ(this.desc, stickerSetInfo.desc) && o.LJ(this.iconUrl, stickerSetInfo.iconUrl) && o.LJ(this.stickerType, stickerSetInfo.stickerType) && o.LJ(this.authorUid, stickerSetInfo.authorUid) && o.LJ(this.authorAvatar, stickerSetInfo.authorAvatar) && o.LJ(this.authorName, stickerSetInfo.authorName) && o.LJ(this.setStatus, stickerSetInfo.setStatus) && o.LJ(this.setStatusMsg, stickerSetInfo.setStatusMsg) && o.LJ(this.createdTime, stickerSetInfo.createdTime) && o.LJ(this.updatedTime, stickerSetInfo.updatedTime) && o.LJ(this.stickerMeta, stickerSetInfo.stickerMeta);
    }

    public int hashCode() {
        Long l = this.setId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.desc;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        StickerUrlStruct stickerUrlStruct = this.iconUrl;
        int hashCode4 = (hashCode3 + (stickerUrlStruct == null ? 0 : stickerUrlStruct.hashCode())) * 31;
        Integer num = this.stickerType;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.authorUid;
        int hashCode6 = (hashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        UrlModel urlModel = this.authorAvatar;
        int hashCode7 = (hashCode6 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str3 = this.authorName;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.setStatus;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.setStatusMsg;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l3 = this.createdTime;
        int hashCode11 = (hashCode10 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.updatedTime;
        int hashCode12 = (hashCode11 + (l4 == null ? 0 : l4.hashCode())) * 31;
        IMStickerMeta iMStickerMeta = this.stickerMeta;
        return hashCode12 + (iMStickerMeta != null ? iMStickerMeta.hashCode() : 0);
    }

    public String toString() {
        return "StickerSetInfo(setId=" + this.setId + ", name=" + this.name + ", desc=" + this.desc + ", iconUrl=" + this.iconUrl + ", stickerType=" + this.stickerType + ", authorUid=" + this.authorUid + ", authorAvatar=" + this.authorAvatar + ", authorName=" + this.authorName + ", setStatus=" + this.setStatus + ", setStatusMsg=" + this.setStatusMsg + ", createdTime=" + this.createdTime + ", updatedTime=" + this.updatedTime + ", stickerMeta=" + this.stickerMeta + ')';
    }

    public final UrlModel getAuthorAvatar() {
        return this.authorAvatar;
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    public final Long getAuthorUid() {
        return this.authorUid;
    }

    public final Long getCreatedTime() {
        return this.createdTime;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final StickerUrlStruct getIconUrl() {
        return this.iconUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final Long getSetId() {
        return this.setId;
    }

    public final Integer getSetStatus() {
        return this.setStatus;
    }

    public final String getSetStatusMsg() {
        return this.setStatusMsg;
    }

    public final IMStickerMeta getStickerMeta() {
        return this.stickerMeta;
    }

    public final Integer getStickerType() {
        return this.stickerType;
    }

    public final Long getUpdatedTime() {
        return this.updatedTime;
    }

    public StickerSetInfo(Long l, String str, String str2, StickerUrlStruct stickerUrlStruct, Integer num, Long l2, UrlModel urlModel, String str3, Integer num2, String str4, Long l3, Long l4, IMStickerMeta iMStickerMeta) {
        this.setId = l;
        this.name = str;
        this.desc = str2;
        this.iconUrl = stickerUrlStruct;
        this.stickerType = num;
        this.authorUid = l2;
        this.authorAvatar = urlModel;
        this.authorName = str3;
        this.setStatus = num2;
        this.setStatusMsg = str4;
        this.createdTime = l3;
        this.updatedTime = l4;
        this.stickerMeta = iMStickerMeta;
    }

    public /* synthetic */ StickerSetInfo(Long l, String str, String str2, StickerUrlStruct stickerUrlStruct, Integer num, Long l2, UrlModel urlModel, String str3, Integer num2, String str4, Long l3, Long l4, IMStickerMeta iMStickerMeta, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : stickerUrlStruct, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? null : urlModel, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : num2, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : l3, (i & 2048) != 0 ? null : l4, (i & 4096) == 0 ? iMStickerMeta : null);
    }
}
