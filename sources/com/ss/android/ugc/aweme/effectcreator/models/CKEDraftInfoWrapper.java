package com.ss.android.ugc.aweme.effectcreator.models;

import X.C36440ERw;
import X.C79062V1e;
import X.UPJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class CKEDraftInfoWrapper implements Parcelable {
    public static final Parcelable.Creator<CKEDraftInfoWrapper> CREATOR = new C36440ERw();
    public final String author;
    public final String createTime;
    public final String defaultIconPath;
    public final String defaultName;
    public final String draftID;
    public final String draftPath;
    public final EffectHintWrapper effectHint;
    public final String effectId;
    public final String effectPath;
    public final int iconEdit;
    public final String iconPath;
    public final String modelId;
    public final String name;
    public final String updateTime;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CKEDraftInfoWrapper)) {
            return false;
        }
        CKEDraftInfoWrapper cKEDraftInfoWrapper = (CKEDraftInfoWrapper) obj;
        return o.LJ(this.draftID, cKEDraftInfoWrapper.draftID) && o.LJ(this.draftPath, cKEDraftInfoWrapper.draftPath) && o.LJ(this.effectPath, cKEDraftInfoWrapper.effectPath) && o.LJ(this.effectId, cKEDraftInfoWrapper.effectId) && o.LJ(this.defaultIconPath, cKEDraftInfoWrapper.defaultIconPath) && o.LJ(this.defaultName, cKEDraftInfoWrapper.defaultName) && o.LJ(this.iconPath, cKEDraftInfoWrapper.iconPath) && o.LJ(this.name, cKEDraftInfoWrapper.name) && o.LJ(this.createTime, cKEDraftInfoWrapper.createTime) && o.LJ(this.updateTime, cKEDraftInfoWrapper.updateTime) && o.LJ(this.modelId, cKEDraftInfoWrapper.modelId) && o.LJ(this.author, cKEDraftInfoWrapper.author) && o.LJ(this.effectHint, cKEDraftInfoWrapper.effectHint) && this.iconEdit == cKEDraftInfoWrapper.iconEdit;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.draftID);
        out.writeString(this.draftPath);
        out.writeString(this.effectPath);
        out.writeString(this.effectId);
        out.writeString(this.defaultIconPath);
        out.writeString(this.defaultName);
        out.writeString(this.iconPath);
        out.writeString(this.name);
        out.writeString(this.createTime);
        out.writeString(this.updateTime);
        out.writeString(this.modelId);
        out.writeString(this.author);
        EffectHintWrapper effectHintWrapper = this.effectHint;
        if (effectHintWrapper == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            effectHintWrapper.writeToParcel(out, i);
        }
        out.writeInt(this.iconEdit);
    }

    public CKEDraftInfoWrapper() {
        this("", "", "", "", "", "", "", "", "", "", "", "", null, 0);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.author, C79062V1e.LJ(this.modelId, C79062V1e.LJ(this.updateTime, C79062V1e.LJ(this.createTime, C79062V1e.LJ(this.name, C79062V1e.LJ(this.iconPath, C79062V1e.LJ(this.defaultName, C79062V1e.LJ(this.defaultIconPath, C79062V1e.LJ(this.effectId, C79062V1e.LJ(this.effectPath, C79062V1e.LJ(this.draftPath, this.draftID.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        EffectHintWrapper effectHintWrapper = this.effectHint;
        if (effectHintWrapper == null) {
            hashCode = 0;
        } else {
            hashCode = effectHintWrapper.hashCode();
        }
        return ((LJ + hashCode) * 31) + this.iconEdit;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CKEDraftInfoWrapper(draftID=");
        sb.append(this.draftID);
        sb.append(", draftPath=");
        sb.append(this.draftPath);
        sb.append(", effectPath=");
        sb.append(this.effectPath);
        sb.append(", effectId=");
        sb.append(this.effectId);
        sb.append(", defaultIconPath=");
        sb.append(this.defaultIconPath);
        sb.append(", defaultName=");
        sb.append(this.defaultName);
        sb.append(", iconPath=");
        sb.append(this.iconPath);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", createTime=");
        sb.append(this.createTime);
        sb.append(", updateTime=");
        sb.append(this.updateTime);
        sb.append(", modelId=");
        sb.append(this.modelId);
        sb.append(", author=");
        sb.append(this.author);
        sb.append(", effectHint=");
        sb.append(this.effectHint);
        sb.append(", iconEdit=");
        return UPJ.LIZLLL(sb, this.iconEdit, ')');
    }

    public static CKEDraftInfoWrapper LIZ(CKEDraftInfoWrapper cKEDraftInfoWrapper, String str, String str2, String str3, EffectHintWrapper effectHintWrapper, int i, int i2) {
        String draftID;
        String draftPath;
        String effectPath;
        String defaultIconPath;
        String defaultName;
        String createTime;
        String updateTime;
        String modelId;
        EffectHintWrapper effectHintWrapper2 = effectHintWrapper;
        String name = str3;
        int i3 = i;
        String effectId = str;
        String iconPath = str2;
        String author = null;
        if ((i2 & 1) != 0) {
            draftID = cKEDraftInfoWrapper.draftID;
        } else {
            draftID = null;
        }
        if ((i2 & 2) != 0) {
            draftPath = cKEDraftInfoWrapper.draftPath;
        } else {
            draftPath = null;
        }
        if ((i2 & 4) != 0) {
            effectPath = cKEDraftInfoWrapper.effectPath;
        } else {
            effectPath = null;
        }
        if ((i2 & 8) != 0) {
            effectId = cKEDraftInfoWrapper.effectId;
        }
        if ((i2 & 16) != 0) {
            defaultIconPath = cKEDraftInfoWrapper.defaultIconPath;
        } else {
            defaultIconPath = null;
        }
        if ((i2 & 32) != 0) {
            defaultName = cKEDraftInfoWrapper.defaultName;
        } else {
            defaultName = null;
        }
        if ((i2 & 64) != 0) {
            iconPath = cKEDraftInfoWrapper.iconPath;
        }
        if ((i2 & 128) != 0) {
            name = cKEDraftInfoWrapper.name;
        }
        if ((i2 & 256) != 0) {
            createTime = cKEDraftInfoWrapper.createTime;
        } else {
            createTime = null;
        }
        if ((i2 & 512) != 0) {
            updateTime = cKEDraftInfoWrapper.updateTime;
        } else {
            updateTime = null;
        }
        if ((i2 & 1024) != 0) {
            modelId = cKEDraftInfoWrapper.modelId;
        } else {
            modelId = null;
        }
        if ((i2 & 2048) != 0) {
            author = cKEDraftInfoWrapper.author;
        }
        if ((i2 & 4096) != 0) {
            effectHintWrapper2 = cKEDraftInfoWrapper.effectHint;
        }
        if ((i2 & FileUtils.BUFFER_SIZE) != 0) {
            i3 = cKEDraftInfoWrapper.iconEdit;
        }
        cKEDraftInfoWrapper.getClass();
        o.LJIIIZ(draftID, "draftID");
        o.LJIIIZ(draftPath, "draftPath");
        o.LJIIIZ(effectPath, "effectPath");
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(defaultIconPath, "defaultIconPath");
        o.LJIIIZ(defaultName, "defaultName");
        o.LJIIIZ(iconPath, "iconPath");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(createTime, "createTime");
        o.LJIIIZ(updateTime, "updateTime");
        o.LJIIIZ(modelId, "modelId");
        o.LJIIIZ(author, "author");
        return new CKEDraftInfoWrapper(draftID, draftPath, effectPath, effectId, defaultIconPath, defaultName, iconPath, name, createTime, updateTime, modelId, author, effectHintWrapper2, i3);
    }

    public CKEDraftInfoWrapper(String draftID, String draftPath, String effectPath, String effectId, String defaultIconPath, String defaultName, String iconPath, String name, String createTime, String updateTime, String modelId, String author, EffectHintWrapper effectHintWrapper, int i) {
        o.LJIIIZ(draftID, "draftID");
        o.LJIIIZ(draftPath, "draftPath");
        o.LJIIIZ(effectPath, "effectPath");
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(defaultIconPath, "defaultIconPath");
        o.LJIIIZ(defaultName, "defaultName");
        o.LJIIIZ(iconPath, "iconPath");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(createTime, "createTime");
        o.LJIIIZ(updateTime, "updateTime");
        o.LJIIIZ(modelId, "modelId");
        o.LJIIIZ(author, "author");
        this.draftID = draftID;
        this.draftPath = draftPath;
        this.effectPath = effectPath;
        this.effectId = effectId;
        this.defaultIconPath = defaultIconPath;
        this.defaultName = defaultName;
        this.iconPath = iconPath;
        this.name = name;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.modelId = modelId;
        this.author = author;
        this.effectHint = effectHintWrapper;
        this.iconEdit = i;
    }
}
