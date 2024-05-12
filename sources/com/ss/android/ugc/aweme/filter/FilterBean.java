package com.ss.android.ugc.aweme.filter;

import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.tools.ToolsUrlModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes15.dex */
public class FilterBean implements Parcelable, Serializable {
    public static final Parcelable.Creator<FilterBean> CREATOR = new IDCreatorS56S0000000_14(9);

    @InterfaceC65349Pkn("category_extra")
    public FilterCategoryExtra categoryExtra;

    @InterfaceC65349Pkn("filter_category")
    public String categoryKey;
    public String compareKey;

    @InterfaceC65349Pkn("enter_method")
    public transient String enterMethod;
    public transient boolean executeSetFilterFolder;

    @InterfaceC65349Pkn("extra")
    public String extra;
    public transient float internalDefaultIntensity;
    public transient boolean isSaveFilter2BeautySequence;

    @InterfaceC65349Pkn("en_name")
    public String mEnName;

    @InterfaceC65349Pkn("filter_file_path")
    public String mFilterFilePath;

    @InterfaceC65349Pkn("filter_folder")
    public String mFilterFolder;

    @InterfaceC65349Pkn("id")
    public int mId;
    public transient int mIndex;

    @InterfaceC65349Pkn("name")
    public String mName;

    @InterfaceC65349Pkn("resource")
    public transient ToolsUrlModel mResource;
    public transient String mTagUpdateAt;
    public transient String mThumbnailFilePath;
    public transient Uri mThumbnailFileUri;

    @InterfaceC65349Pkn("resource_id")
    public String resId;
    public transient List<String> tags;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mId), getCompareKey());
    }

    public void resetCompareKey() {
        this.compareKey = null;
    }

    public List<String> getTags() {
        List<String> list = this.tags;
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        return this.tags;
    }

    public String toString() {
        String str;
        ToolsUrlModel toolsUrlModel = this.mResource;
        if (toolsUrlModel != null) {
            str = toolsUrlModel.toString();
        } else {
            str = "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FilterBean{mId=");
        LIZ.append(this.mId);
        LIZ.append(", resId:");
        LIZ.append(this.resId);
        LIZ.append(", mName='");
        Q89.LIZIZ(LIZ, this.mName, '\'', ", mEnName='");
        Q89.LIZIZ(LIZ, this.mEnName, '\'', ", mCategory");
        LIZ.append(this.categoryKey);
        LIZ.append('\'');
        LIZ.append(", mResource=");
        LIZ.append(str);
        LIZ.append(", mIndex=");
        LIZ.append(this.mIndex);
        LIZ.append(", mThumbnailFileUri=");
        LIZ.append(this.mThumbnailFileUri);
        LIZ.append(", mThumbnailFilePath='");
        Q89.LIZIZ(LIZ, this.mThumbnailFilePath, '\'', ", mFilterFilePath='");
        Q89.LIZIZ(LIZ, this.mFilterFilePath, '\'', ", mFilterFolder='");
        Q89.LIZIZ(LIZ, this.mFilterFolder, '\'', ", tags=");
        LIZ.append(this.tags);
        LIZ.append(", mTagUpdateAt=");
        LIZ.append(this.mTagUpdateAt);
        LIZ.append(", internalDefaultIntensity=");
        LIZ.append(this.internalDefaultIntensity);
        LIZ.append(", executeSetFilterFolder=");
        LIZ.append(this.executeSetFilterFolder);
        LIZ.append(", isSaveFilter2BeautySequence=");
        LIZ.append(this.isSaveFilter2BeautySequence);
        LIZ.append(", extra=");
        LIZ.append(this.extra);
        LIZ.append(", categoryExtra");
        LIZ.append(this.categoryExtra);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public FilterBean() {
        this.mTagUpdateAt = "";
        this.categoryKey = "";
        this.enterMethod = "";
        this.internalDefaultIntensity = -1.0f;
        this.isSaveFilter2BeautySequence = true;
        this.resId = "";
        this.extra = "";
        this.categoryExtra = new FilterCategoryExtra();
    }

    public FilterCategoryExtra getCategoryExtra() {
        return this.categoryExtra;
    }

    public String getCategoryKey() {
        return this.categoryKey;
    }

    public String getCompareKey() {
        return this.compareKey;
    }

    public String getEnName() {
        return this.mEnName;
    }

    public String getEnterMethod() {
        return this.enterMethod;
    }

    public boolean getExecuteSetFilterFolder() {
        return this.executeSetFilterFolder;
    }

    public String getExtra() {
        return this.extra;
    }

    public String getFilterFilePath() {
        return this.mFilterFilePath;
    }

    public String getFilterFolder() {
        return this.mFilterFolder;
    }

    public int getId() {
        return this.mId;
    }

    public String getName() {
        return this.mName;
    }

    public String getResId() {
        return this.resId;
    }

    public ToolsUrlModel getResource() {
        return this.mResource;
    }

    public String getTagUpdateAt() {
        return this.mTagUpdateAt;
    }

    public String getThumbnailFilePath() {
        return this.mThumbnailFilePath;
    }

    public Uri getThumbnailFileUri() {
        return this.mThumbnailFileUri;
    }

    public boolean isSaveFilter2BeautySequence() {
        return this.isSaveFilter2BeautySequence;
    }

    public FilterBean(Parcel parcel) {
        this.mTagUpdateAt = "";
        this.categoryKey = "";
        this.enterMethod = "";
        this.internalDefaultIntensity = -1.0f;
        this.isSaveFilter2BeautySequence = true;
        this.resId = "";
        this.extra = "";
        this.categoryExtra = new FilterCategoryExtra();
        this.mId = parcel.readInt();
        this.mName = parcel.readString();
        this.mEnName = parcel.readString();
        this.mFilterFilePath = parcel.readString();
        this.mFilterFolder = parcel.readString();
        this.resId = parcel.readString();
        this.extra = parcel.readString();
        this.tags = parcel.createStringArrayList();
        this.categoryKey = parcel.readString();
        this.mResource = (ToolsUrlModel) parcel.readParcelable(ToolsUrlModel.class.getClassLoader());
        this.mThumbnailFileUri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.categoryExtra = (FilterCategoryExtra) parcel.readSerializable();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterBean)) {
            return false;
        }
        FilterBean filterBean = (FilterBean) obj;
        if (this.mId == filterBean.mId && TextUtils.equals(this.categoryKey, filterBean.categoryKey) && TextUtils.equals(getCompareKey(), filterBean.getCompareKey())) {
            return true;
        }
        return false;
    }

    public void setCategoryExtra(FilterCategoryExtra filterCategoryExtra) {
        this.categoryExtra = filterCategoryExtra;
    }

    public void setCategoryKey(String str) {
        this.categoryKey = str;
    }

    public void setCompareKey(String str) {
        this.compareKey = str;
    }

    public void setEnName(String str) {
        this.mEnName = str;
    }

    public void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public void setExecuteSetFilterFolder(boolean z) {
        this.executeSetFilterFolder = z;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFilterFilePath(String str) {
        this.mFilterFilePath = str;
    }

    public void setFilterFolder(String str) {
        this.mFilterFolder = str;
    }

    public void setId(int i) {
        this.mId = i;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setResId(String str) {
        this.resId = str;
    }

    public void setResource(ToolsUrlModel toolsUrlModel) {
        this.mResource = toolsUrlModel;
    }

    public void setSaveFilter2BeautySequence(boolean z) {
        this.isSaveFilter2BeautySequence = z;
    }

    public void setTagUpdateAt(String str) {
        this.mTagUpdateAt = str;
    }

    public void setTags(List<String> list) {
        this.tags = list;
    }

    public void setThumbnailFilePath(String str) {
        this.mThumbnailFilePath = str;
    }

    public void setThumbnailFileUri(Uri uri) {
        this.mThumbnailFileUri = uri;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mId);
        parcel.writeString(this.mName);
        parcel.writeString(this.mEnName);
        parcel.writeString(this.mFilterFilePath);
        parcel.writeString(this.mFilterFolder);
        parcel.writeString(this.resId);
        parcel.writeString(this.extra);
        parcel.writeStringList(this.tags);
        parcel.writeString(this.categoryKey);
        parcel.writeParcelable(this.mResource, i);
        parcel.writeParcelable(this.mThumbnailFileUri, i);
        parcel.writeSerializable(this.categoryExtra);
    }
}
