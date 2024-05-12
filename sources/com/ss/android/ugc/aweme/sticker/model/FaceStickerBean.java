package com.ss.android.ugc.aweme.sticker.model;

import X.C78886Uxe;
import X.InterfaceC65349Pkn;
import Y.IDCreatorS51S0000000_7;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class FaceStickerBean implements Parcelable {
    public static String sCurPropSource;
    public static String sCurPropSourceKey;
    public static String sSlideCurrentEffectId;

    @InterfaceC65349Pkn("ad_raw_data")
    public String adRawData;

    @InterfaceC65349Pkn("children")
    public List<String> children;
    public String customizedBuzExtra;
    public String customizedPropIconPath;
    public String customizedPropId;
    public String customizedPropPath;

    @InterfaceC65349Pkn("designer_id")
    public String designerId;
    public String diyType;

    @InterfaceC65349Pkn("effect_publish_time")
    public Long effectPublishTime;

    @InterfaceC65349Pkn("effect_type")
    public int effectType;

    @InterfaceC65349Pkn("extra")
    public String extra;
    public FaceStickerCommerceBean faceStickerCommerceBean;

    @InterfaceC65349Pkn("file_url")
    public UrlModel fileUrl;

    @InterfaceC65349Pkn("force_bind_music_path")
    public String forceBindMusicPath;

    @InterfaceC65349Pkn("grade_key")
    public String gradeKey;

    @InterfaceC65349Pkn("hint")
    public String hint;

    @InterfaceC65349Pkn("hint_icon")
    public UrlModel hintIcon;

    @InterfaceC65349Pkn("icon_url")
    public UrlModel iconUrl;

    @InterfaceC65349Pkn("id")
    public String id;

    @InterfaceC65349Pkn("is_busi")
    public boolean isBusi;
    public boolean isEffectPassedModeration;

    @InterfaceC65349Pkn("is_force_bind_music")
    public boolean isForceBind;
    public boolean isMobileEffect;
    public boolean isSelected;
    public boolean isStackableEffect;
    public String mLocalPath;

    @InterfaceC65349Pkn("mention_user")
    public String mentionUserInfo;
    public List<String> musicIds;

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("parent")
    public String parentId;
    public String propSource;

    @InterfaceC65349Pkn("rec_id")
    public String recId;

    @InterfaceC65349Pkn("requirements")
    public List<String> requirements;

    @InterfaceC65349Pkn("resource_id")
    public String resourceID;

    @InterfaceC65349Pkn("schema")
    public String schema;

    @InterfaceC65349Pkn("sdk_extra")
    public String sdkExtra;

    @InterfaceC65349Pkn("source")
    public int source;

    @InterfaceC65349Pkn("sticker_id")
    public long stickerId;
    public String tabType;
    public List<String> tags;
    public String templatePropId;

    @InterfaceC65349Pkn("type")
    public long type;
    public List<String> types;

    @InterfaceC65349Pkn("usage_scenario")
    public int usageScenario;

    @InterfaceC65349Pkn("use_audio_graph_sticker")
    public boolean useVoiceRecognizeSticker;
    public static final FaceStickerBean NONE = new FaceStickerBean();
    public static final Parcelable.Creator<FaceStickerBean> CREATOR = new IDCreatorS51S0000000_7(21);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getPropSource() {
        String str = this.propSource;
        if (str == null) {
            return "";
        }
        return str;
    }

    public List<String> getTags() {
        if (C78886Uxe.LJJIJ(this.tags)) {
            return new ArrayList();
        }
        return this.tags;
    }

    public List<String> getTypes() {
        if (C78886Uxe.LJJIJ(this.types)) {
            return new ArrayList();
        }
        return this.types;
    }

    public int hashCode() {
        long j = this.stickerId;
        return (int) (j ^ (j >>> 32));
    }

    public boolean suportLive() {
        int i = this.usageScenario;
        if (i == 0 || i == 2) {
            return true;
        }
        return false;
    }

    public boolean supportVideo() {
        int i = this.usageScenario;
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    public FaceStickerBean() {
        this.requirements = new ArrayList();
        this.tabType = "main_panel";
        this.isMobileEffect = false;
        this.isEffectPassedModeration = true;
        this.isStackableEffect = false;
        this.isSelected = false;
    }

    public String getAdRawData() {
        return this.adRawData;
    }

    public List<String> getChildren() {
        return this.children;
    }

    public String getCustomizedBuzExtra() {
        return this.customizedBuzExtra;
    }

    public String getCustomizedPropIconPath() {
        return this.customizedPropIconPath;
    }

    public String getCustomizedPropId() {
        return this.customizedPropId;
    }

    public String getCustomizedPropPath() {
        return this.customizedPropPath;
    }

    public String getDesignerId() {
        return this.designerId;
    }

    public String getDiyType() {
        return this.diyType;
    }

    public Long getEffectPublishTime() {
        return this.effectPublishTime;
    }

    public int getEffectType() {
        return this.effectType;
    }

    public String getExtra() {
        return this.extra;
    }

    public FaceStickerCommerceBean getFaceStickerCommerceBean() {
        return this.faceStickerCommerceBean;
    }

    public UrlModel getFileUrl() {
        return this.fileUrl;
    }

    public String getForceBindMusicPath() {
        return this.forceBindMusicPath;
    }

    public String getGradeKey() {
        return this.gradeKey;
    }

    public String getHint() {
        return this.hint;
    }

    public UrlModel getHintIcon() {
        return this.hintIcon;
    }

    public UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public String getId() {
        return this.id;
    }

    public String getLocalPath() {
        return this.mLocalPath;
    }

    public String getMentionUserInfo() {
        return this.mentionUserInfo;
    }

    public List<String> getMusicIds() {
        return this.musicIds;
    }

    public String getName() {
        return this.name;
    }

    public String getParentId() {
        return this.parentId;
    }

    public String getRecId() {
        return this.recId;
    }

    public List<String> getRequirements() {
        return this.requirements;
    }

    public String getResourceID() {
        return this.resourceID;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getSdkExtra() {
        return this.sdkExtra;
    }

    public int getSource() {
        return this.source;
    }

    public long getStickerId() {
        return this.stickerId;
    }

    public String getTabType() {
        return this.tabType;
    }

    public String getTemplatePropId() {
        return this.templatePropId;
    }

    public long getType() {
        return this.type;
    }

    public boolean isBusi() {
        return this.isBusi;
    }

    public boolean isEffectPassedModeration() {
        return this.isEffectPassedModeration;
    }

    public boolean isForceBind() {
        return this.isForceBind;
    }

    public boolean isMobileEffect() {
        return this.isMobileEffect;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public boolean isStackableEffect() {
        return this.isStackableEffect;
    }

    public boolean isUseVoiceRecognizeSticker() {
        return this.useVoiceRecognizeSticker;
    }

    public FaceStickerBean(Parcel parcel) {
        boolean z;
        this.requirements = new ArrayList();
        this.tabType = "main_panel";
        this.isMobileEffect = false;
        this.isEffectPassedModeration = true;
        this.isStackableEffect = false;
        this.isSelected = false;
        this.id = parcel.readString();
        this.stickerId = parcel.readLong();
        this.name = parcel.readString();
        this.iconUrl = (UrlModel) parcel.readSerializable();
        this.fileUrl = (UrlModel) parcel.readSerializable();
        this.hint = parcel.readString();
        this.hintIcon = (UrlModel) parcel.readSerializable();
        this.type = parcel.readLong();
        this.usageScenario = parcel.readInt();
        this.types = parcel.createStringArrayList();
        this.mLocalPath = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isSelected = z;
        this.tags = parcel.createStringArrayList();
        this.effectType = parcel.readInt();
        this.schema = parcel.readString();
        this.source = parcel.readInt();
        this.designerId = parcel.readString();
        this.extra = parcel.readString();
        this.sdkExtra = parcel.readString();
        this.musicIds = parcel.createStringArrayList();
        this.adRawData = parcel.readString();
        this.forceBindMusicPath = parcel.readString();
        this.isForceBind = parcel.readByte() != 0;
        this.gradeKey = parcel.readString();
        this.recId = parcel.readString();
        this.requirements = parcel.createStringArrayList();
        this.mentionUserInfo = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FaceStickerBean) && this.stickerId == ((FaceStickerBean) obj).stickerId) {
            return true;
        }
        return false;
    }

    public void setAdRawData(String str) {
        this.adRawData = str;
    }

    public void setBusi(boolean z) {
        this.isBusi = z;
    }

    public void setChildren(List<String> list) {
        this.children = list;
    }

    public void setCustomizedBuzExtra(String str) {
        this.customizedBuzExtra = str;
    }

    public void setCustomizedPropIconPath(String str) {
        this.customizedPropIconPath = str;
    }

    public void setCustomizedPropId(String str) {
        this.customizedPropId = str;
    }

    public void setCustomizedPropPath(String str) {
        this.customizedPropPath = str;
    }

    public void setDesignerId(String str) {
        this.designerId = str;
    }

    public void setDiyType(String str) {
        this.diyType = str;
    }

    public void setEffectPassedModeration(boolean z) {
        this.isEffectPassedModeration = z;
    }

    public void setEffectPublishTime(Long l) {
        this.effectPublishTime = l;
    }

    public void setEffectType(int i) {
        this.effectType = i;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFaceStickerCommerceBean(FaceStickerCommerceBean faceStickerCommerceBean) {
        this.faceStickerCommerceBean = faceStickerCommerceBean;
    }

    public void setFileUrl(UrlModel urlModel) {
        this.fileUrl = urlModel;
    }

    public void setForceBind(boolean z) {
        this.isForceBind = z;
    }

    public void setForceBindMusicPath(String str) {
        this.forceBindMusicPath = str;
    }

    public void setGradeKey(String str) {
        this.gradeKey = str;
    }

    public void setHint(String str) {
        this.hint = str;
    }

    public void setHintIcon(UrlModel urlModel) {
        this.hintIcon = urlModel;
    }

    public void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setLocalPath(String str) {
        this.mLocalPath = str;
    }

    public void setMentionUserInfo(String str) {
        this.mentionUserInfo = str;
    }

    public void setMobileEffect(boolean z) {
        this.isMobileEffect = z;
    }

    public void setMusicIds(List<String> list) {
        this.musicIds = list;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setParentId(String str) {
        this.parentId = str;
    }

    public void setPropSource(String str) {
        this.propSource = str;
    }

    public void setRecId(String str) {
        this.recId = str;
    }

    public void setRequirements(List<String> list) {
        this.requirements = list;
    }

    public void setResourceID(String str) {
        this.resourceID = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setSdkExtra(String str) {
        this.sdkExtra = str;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public void setStackableEffect(boolean z) {
        this.isStackableEffect = z;
    }

    public void setStickerId(long j) {
        this.stickerId = j;
        if (this.templatePropId != null && !String.valueOf(j).equals(this.templatePropId)) {
            this.stickerId = CastLongProtector.parseLong(this.templatePropId);
        }
    }

    public void setTabType(String str) {
        this.tabType = str;
    }

    public void setTags(List<String> list) {
        this.tags = list;
    }

    public void setTemplatePropId(String str) {
        this.templatePropId = str;
        if (!String.valueOf(this.stickerId).equals(str)) {
            this.stickerId = CastLongProtector.parseLong(str);
        }
    }

    public void setType(long j) {
        this.type = j;
    }

    public void setTypes(List<String> list) {
        this.types = list;
    }

    public void setUseVoiceRecognizeSticker(boolean z) {
        this.useVoiceRecognizeSticker = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeLong(this.stickerId);
        parcel.writeString(this.name);
        parcel.writeSerializable(this.iconUrl);
        parcel.writeSerializable(this.fileUrl);
        parcel.writeString(this.hint);
        parcel.writeSerializable(this.hintIcon);
        parcel.writeLong(this.type);
        parcel.writeInt(this.usageScenario);
        parcel.writeStringList(this.types);
        parcel.writeString(this.mLocalPath);
        parcel.writeByte(this.isSelected ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.tags);
        parcel.writeInt(this.effectType);
        parcel.writeString(this.schema);
        parcel.writeInt(this.source);
        parcel.writeString(this.designerId);
        parcel.writeString(this.extra);
        parcel.writeString(this.sdkExtra);
        parcel.writeStringList(this.musicIds);
        parcel.writeString(this.adRawData);
        parcel.writeString(this.forceBindMusicPath);
        parcel.writeByte(this.isForceBind ? (byte) 1 : (byte) 0);
        parcel.writeString(this.gradeKey);
        parcel.writeString(this.recId);
        parcel.writeStringList(this.requirements);
        parcel.writeString(this.mentionUserInfo);
    }
}
