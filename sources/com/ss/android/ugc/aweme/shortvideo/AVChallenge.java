package com.ss.android.ugc.aweme.shortvideo;

import X.InterfaceC65349Pkn;
import X.InterfaceC65404Plg;
import Y.IDCreatorS51S0000000_7;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.mapping.AVChallengeExtrasAdapterFactory;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class AVChallenge implements Serializable, Parcelable {
    public static final Parcelable.Creator<AVChallenge> CREATOR = new IDCreatorS51S0000000_7(9);

    @InterfaceC65349Pkn("activity_creation_schema")
    public String activityCreationSchema;

    @InterfaceC65349Pkn("align")
    public int align;

    @InterfaceC65349Pkn("can_use_under_line")
    public boolean canUseUnderLine;

    @InterfaceC65349Pkn("cha_name")
    public String challengeName;

    @InterfaceC65349Pkn("cid")
    public String cid;

    @InterfaceC65349Pkn("dynamic_activity_info")
    public String dynamicRecordActivityInfo;

    @InterfaceC65349Pkn("game_tpl_id")
    public String dynamicRecordLynxChannel;

    @InterfaceC65404Plg(AVChallengeExtrasAdapterFactory.class)
    public HashMap<String, Serializable> extras;

    @InterfaceC65349Pkn("group_id")
    public String groupId;

    @InterfaceC65349Pkn("init_offset_isLeftAxis")
    public boolean initOffsetIsLeftAxis;

    @InterfaceC65349Pkn("init_offset_x")
    public float initOffsetX;

    @InterfaceC65349Pkn("init_offset_y")
    public float initOffsetY;

    @InterfaceC65349Pkn("is_commerce")
    public boolean isCommerce;

    @InterfaceC65349Pkn("is_status")
    public Boolean mStatus;

    @InterfaceC65349Pkn("with_sticker_on_edit_page")
    public int mWithStickerOnEditPage;

    @InterfaceC65349Pkn("music_id")
    public String musicId;

    @InterfaceC65349Pkn("mv_id")
    public String mvId;

    @InterfaceC65349Pkn("sticker_id")
    public String stickerId;

    @InterfaceC65349Pkn("text_color")
    public int textColor;

    @InterfaceC65349Pkn("text_size")
    public float textSize;

    @InterfaceC65349Pkn("type")
    public int type;

    @InterfaceC65349Pkn("user_count")
    public int userCount;

    @InterfaceC65349Pkn("view_count")
    public long viewCount;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        String str = this.cid;
        if (str != null) {
            return str.hashCode();
        }
        String str2 = this.challengeName;
        if (str2 != null) {
            return str2.hashCode();
        }
        return super.hashCode();
    }

    public AVChallenge() {
        this.viewCount = -1L;
        this.textSize = 24.0f;
        this.textColor = -1;
        this.align = 2;
        this.canUseUnderLine = true;
        this.mStatus = Boolean.FALSE;
        this.extras = new HashMap<>();
    }

    public long getDisplayCount() {
        long viewCount = getViewCount();
        if (viewCount >= 0) {
            return viewCount;
        }
        return getUserCount();
    }

    public String getChallengeName() {
        return this.challengeName;
    }

    public String getCid() {
        return this.cid;
    }

    public Map<String, Serializable> getExtras() {
        return this.extras;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public float getInitOffsetX() {
        return this.initOffsetX;
    }

    public float getInitOffsetY() {
        return this.initOffsetY;
    }

    public String getMusicId() {
        return this.musicId;
    }

    public String getMvId() {
        return this.mvId;
    }

    public Boolean getStatus() {
        return this.mStatus;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public long getViewCount() {
        return this.viewCount;
    }

    public int getWithStickerOnEditPage() {
        return this.mWithStickerOnEditPage;
    }

    public boolean isCommerce() {
        return this.isCommerce;
    }

    public AVChallenge(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.viewCount = -1L;
        this.textSize = 24.0f;
        this.textColor = -1;
        this.align = 2;
        this.canUseUnderLine = true;
        this.mStatus = Boolean.FALSE;
        this.extras = new HashMap<>();
        this.cid = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isCommerce = z;
        this.challengeName = parcel.readString();
        this.type = parcel.readInt();
        this.stickerId = parcel.readString();
        this.viewCount = parcel.readLong();
        this.userCount = parcel.readInt();
        this.musicId = parcel.readString();
        this.mvId = parcel.readString();
        this.mWithStickerOnEditPage = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mStatus = Boolean.valueOf(z2);
        this.extras = (HashMap) parcel.readSerializable();
        this.initOffsetX = parcel.readFloat();
        this.initOffsetY = parcel.readFloat();
        this.textSize = parcel.readFloat();
        this.textColor = parcel.readInt();
        this.align = parcel.readInt();
        if (parcel.readInt() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.initOffsetIsLeftAxis = z3;
        this.canUseUnderLine = parcel.readInt() == 1;
        this.dynamicRecordLynxChannel = parcel.readString();
        this.activityCreationSchema = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof AVChallenge) {
            AVChallenge aVChallenge = (AVChallenge) obj;
            if (TextUtils.equals(aVChallenge.cid, this.cid) && TextUtils.equals(aVChallenge.challengeName, this.challengeName)) {
                return true;
            }
        }
        return false;
    }

    public <T extends Serializable> T getFromExtra(String str) {
        Serializable serializable = this.extras.get(str);
        if (serializable == null) {
            return null;
        }
        return (T) serializable;
    }

    public boolean isNew(String str) {
        if (TextUtils.isEmpty(this.cid) && !TextUtils.isEmpty(str) && str.equals(this.challengeName)) {
            return true;
        }
        return false;
    }

    public void setWithStickerOnEditPage(int i) {
        this.mWithStickerOnEditPage = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cid);
        parcel.writeByte(this.isCommerce ? (byte) 1 : (byte) 0);
        parcel.writeString(this.challengeName);
        parcel.writeInt(this.type);
        parcel.writeString(this.stickerId);
        parcel.writeLong(this.viewCount);
        parcel.writeInt(this.userCount);
        parcel.writeString(this.musicId);
        parcel.writeString(this.mvId);
        parcel.writeInt(this.mWithStickerOnEditPage);
        parcel.writeByte(this.mStatus.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeSerializable(this.extras);
        parcel.writeFloat(this.initOffsetX);
        parcel.writeFloat(this.initOffsetY);
        parcel.writeFloat(this.textSize);
        parcel.writeInt(this.textColor);
        parcel.writeInt(this.align);
        parcel.writeInt(this.initOffsetIsLeftAxis ? 1 : 0);
        parcel.writeInt(this.canUseUnderLine ? 1 : 0);
        parcel.writeString(this.dynamicRecordLynxChannel);
        parcel.writeString(this.activityCreationSchema);
    }
}
