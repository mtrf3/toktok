package com.ss.android.ugc.aweme.effect;

import X.InterfaceC36436ERs;
import X.Q89;
import X.X1D;
import Y.IDCreatorS47S0000000_2;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class EffectPointModel implements Serializable, Parcelable, Cloneable {
    public static final Parcelable.Creator<EffectPointModel> CREATOR = new IDCreatorS47S0000000_2(2);
    public String adjustParams;
    public String category;
    public String challenge;
    public int duration;
    public int endPoint;
    public String extra;
    public int index;
    public Boolean isFromEditPro;
    public boolean isFromEnd;
    public Boolean isNewEngineEffect;
    public String key;
    public String name;
    public int originalEndTime;
    public int originalStartTime;

    @InterfaceC36436ERs
    public String resDir;
    public String resourceId;
    public String selectFrom;
    public int selectedColor;
    public int startPoint;
    public int type;
    public int uiEndPoint;
    public int uiStartPoint;
    public String uuid;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public EffectPointModel() {
        this.selectFrom = "";
        this.key = CardStruct.IStatusCode.DEFAULT;
        this.category = "filter";
        Boolean bool = Boolean.FALSE;
        this.isNewEngineEffect = bool;
        this.isFromEditPro = bool;
        this.resourceId = "";
        this.challenge = "";
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public EffectPointModel m113clone() {
        try {
            return (EffectPointModel) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EffectPointModel{index=");
        LIZ.append(this.index);
        LIZ.append(", startPoint=");
        LIZ.append(this.startPoint);
        LIZ.append(", endPoint=");
        LIZ.append(this.endPoint);
        LIZ.append(", uiStartPoint=");
        LIZ.append(this.uiStartPoint);
        LIZ.append(", uiEndPoint=");
        LIZ.append(this.uiEndPoint);
        LIZ.append(", selectedColor=");
        LIZ.append(this.selectedColor);
        LIZ.append(", key='");
        Q89.LIZIZ(LIZ, this.key, '\'', ", select_from='");
        Q89.LIZIZ(LIZ, this.selectFrom, '\'', ", type=");
        LIZ.append(this.type);
        LIZ.append(", isFromEnd=");
        LIZ.append(this.isFromEnd);
        LIZ.append(", resDir='");
        Q89.LIZIZ(LIZ, this.resDir, '\'', ", name='");
        Q89.LIZIZ(LIZ, this.name, '\'', ", duration=");
        LIZ.append(this.duration);
        LIZ.append(", category='");
        Q89.LIZIZ(LIZ, this.category, '\'', ", extra='");
        Q89.LIZIZ(LIZ, this.extra, '\'', ", challenge='");
        Q89.LIZIZ(LIZ, this.challenge, '\'', ", isfromEditPro='");
        LIZ.append(this.isFromEditPro);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public String getAdjustParams() {
        return this.adjustParams;
    }

    public String getCategory() {
        return this.category;
    }

    public String getChallenge() {
        return this.challenge;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getEndPoint() {
        return this.endPoint;
    }

    public String getExtra() {
        return this.extra;
    }

    public int getIndex() {
        return this.index;
    }

    public Boolean getIsFromEditPro() {
        return this.isFromEditPro;
    }

    public Boolean getIsNewEngineEffect() {
        return this.isNewEngineEffect;
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public int getOriginalEndTime() {
        return this.originalEndTime;
    }

    public int getOriginalStartTime() {
        return this.originalStartTime;
    }

    public String getResDir() {
        return this.resDir;
    }

    public String getResourceId() {
        return this.resourceId;
    }

    public String getSelectFrom() {
        return this.selectFrom;
    }

    public int getSelectedColor() {
        return this.selectedColor;
    }

    public int getStartPoint() {
        return this.startPoint;
    }

    public int getType() {
        return this.type;
    }

    public int getUiEndPoint() {
        return this.uiEndPoint;
    }

    public int getUiStartPoint() {
        return this.uiStartPoint;
    }

    public String getUuid() {
        return this.uuid;
    }

    public boolean isFromEnd() {
        return this.isFromEnd;
    }

    public EffectPointModel(Parcel parcel) {
        boolean z;
        boolean z2;
        this.selectFrom = "";
        this.key = CardStruct.IStatusCode.DEFAULT;
        this.category = "filter";
        Boolean bool = Boolean.FALSE;
        this.isNewEngineEffect = bool;
        this.isFromEditPro = bool;
        this.resourceId = "";
        this.challenge = "";
        this.startPoint = parcel.readInt();
        this.endPoint = parcel.readInt();
        this.uiStartPoint = parcel.readInt();
        this.uiEndPoint = parcel.readInt();
        this.selectedColor = parcel.readInt();
        this.key = parcel.readString();
        this.selectFrom = parcel.readString();
        this.type = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isFromEnd = z;
        this.resDir = parcel.readString();
        this.name = parcel.readString();
        this.category = parcel.readString();
        this.duration = parcel.readInt();
        this.extra = parcel.readString();
        this.adjustParams = parcel.readString();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isNewEngineEffect = Boolean.valueOf(z2);
        this.uuid = parcel.readString();
        this.resourceId = parcel.readString();
        this.challenge = parcel.readString();
        this.index = parcel.readInt();
        this.isFromEditPro = Boolean.valueOf(parcel.readByte() != 0);
    }

    public void setAdjustParams(String str) {
        this.adjustParams = str;
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setChallenge(String str) {
        this.challenge = str;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setEndPoint(int i) {
        this.endPoint = i;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFromEnd(boolean z) {
        this.isFromEnd = z;
    }

    public EffectPointModel setIndex(int i) {
        this.index = i;
        return this;
    }

    public void setIsFromEditPro(Boolean bool) {
        this.isFromEditPro = bool;
    }

    public void setIsNewEngineEffect(Boolean bool) {
        this.isNewEngineEffect = bool;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOriginalEndTime(int i) {
        this.originalEndTime = i;
    }

    public void setOriginalStartTime(int i) {
        this.originalStartTime = i;
    }

    public void setResDir(String str) {
        this.resDir = str;
    }

    public void setResourceId(String str) {
        this.resourceId = str;
    }

    public void setSelectFrom(String str) {
        this.selectFrom = str;
    }

    public void setSelectedColor(int i) {
        this.selectedColor = i;
    }

    public void setStartPoint(int i) {
        this.startPoint = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUiEndPoint(int i) {
        this.uiEndPoint = i;
    }

    public void setUiStartPoint(int i) {
        this.uiStartPoint = i;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.startPoint);
        parcel.writeInt(this.endPoint);
        parcel.writeInt(this.uiStartPoint);
        parcel.writeInt(this.uiEndPoint);
        parcel.writeInt(this.selectedColor);
        parcel.writeString(this.key);
        parcel.writeString(this.selectFrom);
        parcel.writeInt(this.type);
        parcel.writeByte(this.isFromEnd ? (byte) 1 : (byte) 0);
        parcel.writeString(this.resDir);
        parcel.writeString(this.name);
        parcel.writeString(this.category);
        parcel.writeInt(this.duration);
        parcel.writeString(this.extra);
        parcel.writeString(this.adjustParams);
        parcel.writeByte(this.isNewEngineEffect.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeString(this.uuid);
        parcel.writeString(this.resourceId);
        parcel.writeString(this.challenge);
        parcel.writeInt(this.index);
        parcel.writeByte(this.isFromEditPro.booleanValue() ? (byte) 1 : (byte) 0);
    }
}
