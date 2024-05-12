package com.ss.android.ugc.aweme.model;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import Y.IDCreatorS48S0000000_3;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes4.dex */
public class TextExtraStruct implements Parcelable, Serializable, Cloneable {
    public static final Parcelable.Creator<TextExtraStruct> CREATOR = new IDCreatorS48S0000000_3(2);

    @InterfaceC65349Pkn("at_user_type")
    public String atUserType;

    @InterfaceC65349Pkn("aweme_id")
    public String awemeId;
    public boolean boldText;

    @InterfaceC65349Pkn("hashtag_id")
    public String cid;

    @InterfaceC65349Pkn("color")
    public int color;
    public Object customSpan;

    @InterfaceC65349Pkn("end")
    public int end;
    public boolean everFolded;
    public int foldedTagIndex;
    public List<Integer> foldedTagsPos;

    @InterfaceC65349Pkn("hashtag_name")
    public String hashTagName;
    public boolean isClickable = true;

    @InterfaceC65349Pkn("is_commerce")
    public boolean isCommerce;

    @InterfaceC65349Pkn("line_idx")
    public int lineIndex;

    @InterfaceC65349Pkn("live_data")
    public String liveData;

    @InterfaceC65349Pkn("sec_uid")
    public String mSecUid;
    public int originPos;
    public String schema;

    @InterfaceC65349Pkn("search_keyword")
    public String searchKeyword;

    @InterfaceC65349Pkn("search_keyword_id")
    public String searchKeywordId;

    @InterfaceC65349Pkn("start")
    public int start;

    @InterfaceC65349Pkn("sticker_id")
    public String stickerId;

    @InterfaceC65349Pkn("sticker_source")
    public int stickerSource;

    @InterfaceC65349Pkn("sticker_url")
    public com.ss.android.ugc.aweme.base.model.UrlModel stickerUrl;

    @InterfaceC65349Pkn("sub_type")
    public int subType;

    @InterfaceC65349Pkn("tag_id")
    public String tagId;

    @InterfaceC65349Pkn("type")
    public int type;

    @InterfaceC65349Pkn("user_follow_status")
    public int userFollowStatus;

    @InterfaceC65349Pkn("user_id")
    public String userId;

    @InterfaceC65349Pkn("word_position")
    public int wordPosition;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.userId;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = ((i * 31) + this.type + this.subType) * 31;
        String str2 = this.atUserType;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.hashTagName;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    public TextExtraStruct() {
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public TextExtraStruct m142clone() {
        try {
            return (TextExtraStruct) super.clone();
        } catch (CloneNotSupportedException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public String getAtUserType() {
        return this.atUserType;
    }

    public String getAwemeId() {
        return this.awemeId;
    }

    public String getCid() {
        return this.cid;
    }

    public int getColor() {
        return this.color;
    }

    public Object getCustomSpan() {
        return this.customSpan;
    }

    public int getEnd() {
        return this.end;
    }

    public boolean getEverFolded() {
        return this.everFolded;
    }

    public int getFoldedTagIndex() {
        return this.foldedTagIndex;
    }

    public List<Integer> getFoldedTagsPos() {
        return this.foldedTagsPos;
    }

    public String getHashTagName() {
        return this.hashTagName;
    }

    public int getLineIndex() {
        return this.lineIndex;
    }

    public String getLiveData() {
        return this.liveData;
    }

    public int getOriginPos() {
        return this.originPos;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getSearchKeyword() {
        return this.searchKeyword;
    }

    public String getSearchKeywordId() {
        return this.searchKeywordId;
    }

    public String getSecUid() {
        return this.mSecUid;
    }

    public int getStart() {
        return this.start;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public int getStickerSource() {
        return this.stickerSource;
    }

    public com.ss.android.ugc.aweme.base.model.UrlModel getStickerUrl() {
        return this.stickerUrl;
    }

    public int getSubtype() {
        return this.subType;
    }

    public String getTagId() {
        return this.tagId;
    }

    public int getType() {
        return this.type;
    }

    public int getUserFollowStatus() {
        return this.userFollowStatus;
    }

    public String getUserId() {
        return this.userId;
    }

    public int getWordPosition() {
        return this.wordPosition;
    }

    public boolean isBoldText() {
        return this.boldText;
    }

    public boolean isClickable() {
        return this.isClickable;
    }

    public boolean isCommerce() {
        return this.isCommerce;
    }

    public TextExtraStruct(Parcel parcel) {
        this.start = parcel.readInt();
        this.end = parcel.readInt();
        this.userId = parcel.readString();
        this.mSecUid = parcel.readString();
        this.type = parcel.readInt();
        this.atUserType = parcel.readString();
        this.hashTagName = parcel.readString();
        this.awemeId = parcel.readString();
        this.schema = parcel.readString();
        this.subType = parcel.readInt();
        this.lineIndex = parcel.readInt();
        this.tagId = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextExtraStruct)) {
            return false;
        }
        TextExtraStruct textExtraStruct = (TextExtraStruct) obj;
        if (this.type != textExtraStruct.type || this.subType != textExtraStruct.subType) {
            return false;
        }
        String str = this.userId;
        if (str == null ? textExtraStruct.userId != null : !str.equals(textExtraStruct.userId)) {
            return false;
        }
        if (!TextUtils.equals(this.hashTagName, textExtraStruct.hashTagName)) {
            return false;
        }
        String str2 = this.atUserType;
        String str3 = textExtraStruct.atUserType;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public void setAtUserType(String str) {
        this.atUserType = str;
    }

    public void setAwemeId(String str) {
        this.awemeId = str;
    }

    public void setBoldText(boolean z) {
        this.boldText = z;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setClickable(boolean z) {
        this.isClickable = z;
    }

    public void setColor(int i) {
        this.color = i;
    }

    public void setCommerce(boolean z) {
        this.isCommerce = z;
    }

    public void setCustomSpan(Object obj) {
        this.customSpan = obj;
    }

    public void setEnd(int i) {
        this.end = i;
    }

    public void setEverFolded(boolean z) {
        this.everFolded = z;
    }

    public void setFoldedTagIndex(int i) {
        this.foldedTagIndex = i;
    }

    public void setFoldedTagsPos(List<Integer> list) {
        this.foldedTagsPos = list;
    }

    public void setHashTagName(String str) {
        this.hashTagName = str;
    }

    public void setLineIndex(int i) {
        this.lineIndex = i;
    }

    public void setOriginPos(int i) {
        this.originPos = i;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setSearchKeyword(String str) {
        this.searchKeyword = str;
    }

    public void setSearchKeywordId(String str) {
        this.searchKeywordId = str;
    }

    public void setSecUid(String str) {
        this.mSecUid = str;
    }

    public void setStart(int i) {
        this.start = i;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public void setStickerSource(int i) {
        this.stickerSource = i;
    }

    public void setStickerUrl(com.ss.android.ugc.aweme.base.model.UrlModel urlModel) {
        this.stickerUrl = urlModel;
    }

    public void setSubType(int i) {
        this.subType = i;
    }

    public void setTagId(String str) {
        this.tagId = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void setUserUserFollowStatus(int i) {
        this.userFollowStatus = i;
    }

    public void setWordPosition(int i) {
        this.wordPosition = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
        parcel.writeString(this.userId);
        parcel.writeString(this.mSecUid);
        parcel.writeInt(this.type);
        parcel.writeString(this.atUserType);
        parcel.writeString(this.hashTagName);
        parcel.writeString(this.awemeId);
        parcel.writeString(this.schema);
        parcel.writeInt(this.subType);
        parcel.writeInt(this.lineIndex);
        parcel.writeString(this.tagId);
    }
}
