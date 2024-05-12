package com.ss.android.ugc.aweme.shortvideo.model;

import X.C77800Ug8;
import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class AVUploadSaveModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<AVUploadSaveModel> CREATOR = new Parcelable.Creator<AVUploadSaveModel>() { // from class: com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AVUploadSaveModel createFromParcel(Parcel parcel) {
            return new AVUploadSaveModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AVUploadSaveModel[] newArray(int i) {
            return new AVUploadSaveModel[i];
        }
    };

    @InterfaceC65349Pkn("enable_silent_enhancement")
    public boolean enableSilentEnhancement;

    @InterfaceC65349Pkn("image_mode_cover_path")
    public String imageModeCoverPath;

    @InterfaceC65349Pkn("image_mode_cover_path_no_watermark")
    public String imageModeCoverPathNoWatermark;

    @InterfaceC65349Pkn("image_mode_local_paths")
    public List<String> imageModeLocalPaths;

    @InterfaceC65349Pkn("is_save_local")
    public boolean isSaveLocal;

    @InterfaceC65349Pkn("is_water_mark")
    public boolean isWaterMark;

    @InterfaceC65349Pkn("local_final_path")
    public String mLocalFinalPath;

    @InterfaceC65349Pkn("local_silent_share_path")
    public String mLocalSilentSharePath;

    @InterfaceC65349Pkn("local_temp_path")
    public String mLocalTempPath;

    @InterfaceC65349Pkn("save_to_album")
    public boolean mSaveToAlbum;

    @InterfaceC65349Pkn("save_private_path")
    public boolean mSaveToAppPathInsteadOfAlbum;

    @InterfaceC65349Pkn("save_type")
    public int mSaveType;

    @InterfaceC65349Pkn("save_with_caption")
    public boolean mSaveWithCaption;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isSaveLocal() {
        if (this.isSaveLocal || this.mSaveToAlbum) {
            return true;
        }
        return false;
    }

    public boolean isSaveLocalWithWaterMark() {
        if ((this.isSaveLocal || this.mSaveToAlbum) && this.isWaterMark) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AVUploadSaveModel{isWaterMark=");
        LIZ.append(this.isWaterMark);
        LIZ.append(", isSaveLocal=");
        LIZ.append(this.isSaveLocal);
        LIZ.append(", mLocalTempPath='");
        Q89.LIZIZ(LIZ, this.mLocalTempPath, '\'', ", mLocalFinalPath='");
        Q89.LIZIZ(LIZ, this.mLocalFinalPath, '\'', ", mLocalSilentSharePath='");
        Q89.LIZIZ(LIZ, this.mLocalSilentSharePath, '\'', ", mSaveType=");
        LIZ.append(this.mSaveType);
        LIZ.append(", mSaveToAlbum=");
        LIZ.append(this.mSaveToAlbum);
        LIZ.append(", mSaveWithCaption=");
        LIZ.append(this.mSaveWithCaption);
        LIZ.append(", mSaveToAppPathInsteadOfAlbum=");
        LIZ.append(this.mSaveToAppPathInsteadOfAlbum);
        LIZ.append(", enableSilentEnhancement=");
        LIZ.append(this.enableSilentEnhancement);
        LIZ.append(", imageModeLocalPaths=");
        LIZ.append(this.imageModeLocalPaths);
        LIZ.append(", imageModeCoverPath='");
        Q89.LIZIZ(LIZ, this.imageModeCoverPath, '\'', ", imageModeCoverPathNoWatermark='");
        return C77800Ug8.LIZJ(LIZ, this.imageModeCoverPathNoWatermark, '\'', '}', LIZ);
    }

    public AVUploadSaveModel() {
    }

    public String getImageModeCoverPath() {
        return this.imageModeCoverPath;
    }

    public String getImageModeCoverPathNoWatermark() {
        return this.imageModeCoverPathNoWatermark;
    }

    public List<String> getImageModeLocalPaths() {
        return this.imageModeLocalPaths;
    }

    public String getLocalFinalPath() {
        return this.mLocalFinalPath;
    }

    public String getLocalSilentSharePath() {
        return this.mLocalSilentSharePath;
    }

    public String getLocalTempPath() {
        return this.mLocalTempPath;
    }

    public boolean getSaveToAlbum() {
        return this.mSaveToAlbum;
    }

    public int getSaveType() {
        return this.mSaveType;
    }

    public boolean isSaveToAppPathInsteadOfAlbum() {
        return this.mSaveToAppPathInsteadOfAlbum;
    }

    public boolean isSaveWithCaption() {
        return this.mSaveWithCaption;
    }

    public boolean isWaterMark() {
        return this.isWaterMark;
    }

    public AVUploadSaveModel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isWaterMark = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isSaveLocal = z2;
        this.mLocalTempPath = parcel.readString();
        this.mSaveType = parcel.readInt();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.mSaveToAlbum = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.mSaveToAppPathInsteadOfAlbum = z4;
        this.enableSilentEnhancement = parcel.readByte() != 0;
        ArrayList arrayList = new ArrayList();
        this.imageModeLocalPaths = arrayList;
        parcel.readStringList(arrayList);
        this.imageModeCoverPath = parcel.readString();
    }

    public void setEnableSilentEnhancement(boolean z) {
        this.enableSilentEnhancement = z;
    }

    public void setImageModeCoverPath(String str) {
        this.imageModeCoverPath = str;
    }

    public void setImageModeCoverPathNoWatermark(String str) {
        this.imageModeCoverPathNoWatermark = str;
    }

    public void setImageModeLocalPaths(List<String> list) {
        this.imageModeLocalPaths = list;
    }

    public void setLocalFinalPath(String str) {
        this.mLocalFinalPath = str;
    }

    public void setLocalSilentSharePath(String str) {
        this.mLocalSilentSharePath = str;
    }

    public void setLocalTempPath(String str) {
        this.mLocalTempPath = str;
    }

    public void setSaveLocal(boolean z) {
        this.isSaveLocal = z;
    }

    public void setSaveToAlbum(boolean z) {
        this.mSaveToAlbum = z;
    }

    public void setSaveToAppPathInsteadOfAlbum(boolean z) {
        this.mSaveToAppPathInsteadOfAlbum = z;
    }

    public void setSaveType(int i) {
        this.mSaveType = i;
    }

    public void setSaveWithCaption(boolean z) {
        this.mSaveWithCaption = z;
    }

    public void setWaterMark(boolean z) {
        this.isWaterMark = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.isWaterMark ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isSaveLocal ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mLocalTempPath);
        parcel.writeInt(this.mSaveType);
        parcel.writeByte(this.mSaveToAlbum ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mSaveToAppPathInsteadOfAlbum ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableSilentEnhancement ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.imageModeLocalPaths);
        parcel.writeString(this.imageModeCoverPath);
    }
}
