package com.bytedance.android.live.base.model;

import X.InterfaceC65349Pkn;
import Y.IDCreatorS45S0000000;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ImageModel implements Parcelable {
    public static final Parcelable.Creator<ImageModel> CREATOR = new IDCreatorS45S0000000(38);

    @InterfaceC65349Pkn("avg_color")
    public String avgColor;

    @InterfaceC65349Pkn("content")
    public Content content;

    @InterfaceC65349Pkn("height")
    public int height;

    @InterfaceC65349Pkn("image_type")
    public int imageType;

    @InterfaceC65349Pkn("is_animated")
    public boolean isAnimated;
    public boolean isFeedCandidate;
    public boolean isLoaded;
    public boolean isMonitored;

    @InterfaceC65349Pkn("uri")
    public String mUri;

    @InterfaceC65349Pkn("url_list")
    public List<String> mUrls;

    @InterfaceC65349Pkn("open_web_url")
    public String schema;

    @InterfaceC65349Pkn("width")
    public int width;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return hash(this.avgColor, this.mUri, this.mUrls, Integer.valueOf(this.width), Integer.valueOf(this.height));
    }

    /* loaded from: classes.dex */
    public static class Content implements Parcelable {
        public static final Parcelable.Creator<Content> CREATOR = new IDCreatorS45S0000000(37);

        @InterfaceC65349Pkn("font_color")
        public String fontColor;

        @InterfaceC65349Pkn("level")
        public long level;

        @InterfaceC65349Pkn("name")
        public String name;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public Content() {
            this.name = "";
            this.fontColor = "";
        }

        public Content(Parcel parcel) {
            this.name = "";
            this.fontColor = "";
            this.name = parcel.readString();
            this.fontColor = parcel.readString();
            this.level = parcel.readLong();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.name);
            parcel.writeString(this.fontColor);
            parcel.writeLong(this.level);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{\"uri\":\"");
        String str = this.mUri;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append("\",\"image_type\":\"");
        String str3 = this.schema;
        if (str3 != null) {
            str2 = str3;
        }
        sb.append(str2);
        sb.append("\",\"url_list\":[");
        List<String> list = this.mUrls;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append("\"");
                sb.append((String) ListProtector.get(this.mUrls, i));
                sb.append("\"");
                if (i != size - 1) {
                    sb.append(",");
                }
            }
        }
        sb.append("]}");
        return sb.toString();
    }

    public ImageModel() {
        this.avgColor = "";
        this.mUri = "";
        this.mUrls = new ArrayList();
        this.schema = "";
    }

    public String getAvgColor() {
        return this.avgColor;
    }

    public int getHeight() {
        return this.height;
    }

    @InterfaceC65349Pkn("content")
    public Content getImageContent() {
        return this.content;
    }

    @InterfaceC65349Pkn("image_type")
    public int getImageType() {
        return this.imageType;
    }

    @InterfaceC65349Pkn("open_web_url")
    public String getSchema() {
        return this.schema;
    }

    @InterfaceC65349Pkn("uri")
    public String getUri() {
        return this.mUri;
    }

    @InterfaceC65349Pkn("url_list")
    public List<String> getUrls() {
        return this.mUrls;
    }

    public int getWidth() {
        return this.width;
    }

    @InterfaceC65349Pkn("is_animated")
    public boolean isAnimated() {
        return this.isAnimated;
    }

    public boolean isFeedCandidate() {
        return this.isFeedCandidate;
    }

    public boolean isLoaded() {
        return this.isLoaded;
    }

    public boolean isMonitored() {
        return this.isMonitored;
    }

    public ImageModel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.avgColor = "";
        this.mUri = "";
        this.mUrls = new ArrayList();
        this.schema = "";
        this.mUri = parcel.readString();
        this.mUrls = parcel.createStringArrayList();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.schema = parcel.readString();
        this.imageType = parcel.readInt();
        this.content = (Content) parcel.readParcelable(Content.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isAnimated = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isLoaded = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isMonitored = z3;
        this.isFeedCandidate = parcel.readByte() != 0;
    }

    public static ImageModel genBy(String str) {
        ImageModel imageModel = new ImageModel();
        imageModel.setUrls(Collections.singletonList(str));
        return imageModel;
    }

    public static int hash(Object... objArr) {
        int hashCode;
        if (objArr == null) {
            return 0;
        }
        int i = 1;
        for (Object obj : objArr) {
            int i2 = i * 31;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i = i2 + hashCode;
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageModel imageModel = (ImageModel) obj;
        if (this.width == imageModel.width && this.height == imageModel.height && equals(this.avgColor, imageModel.avgColor) && equals(this.mUri, imageModel.mUri) && equals(this.mUrls, imageModel.mUrls)) {
            return true;
        }
        return false;
    }

    @InterfaceC65349Pkn("is_animated")
    public void setAnimated(boolean z) {
        this.isAnimated = z;
    }

    public void setAvgColor(String str) {
        this.avgColor = str;
    }

    @InterfaceC65349Pkn("content")
    public void setContent(Content content) {
        this.content = content;
    }

    public void setFeedCandidate(boolean z) {
        this.isFeedCandidate = z;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    @InterfaceC65349Pkn("image_type")
    public void setImageType(int i) {
        this.imageType = i;
    }

    public void setLoaded(boolean z) {
        this.isLoaded = z;
    }

    public void setMonitored(boolean z) {
        this.isMonitored = z;
    }

    @InterfaceC65349Pkn("open_web_url")
    public void setSchema(String str) {
        this.schema = str;
    }

    @InterfaceC65349Pkn("uri")
    public void setUri(String str) {
        this.mUri = str;
    }

    @InterfaceC65349Pkn("url_list")
    public void setUrls(List<String> list) {
        this.mUrls = list;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public ImageModel(String str, List<String> list) {
        this.avgColor = "";
        this.mUri = "";
        new ArrayList();
        this.schema = "";
        this.mUri = str;
        this.mUrls = list;
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mUri);
        parcel.writeStringList(this.mUrls);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.schema);
        parcel.writeInt(this.imageType);
        parcel.writeParcelable(this.content, i);
        parcel.writeByte(this.isAnimated ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isLoaded ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isMonitored ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isFeedCandidate ? (byte) 1 : (byte) 0);
    }

    public ImageModel(String str, List<String> list, String str2) {
        this.avgColor = "";
        this.mUri = "";
        new ArrayList();
        this.mUri = str;
        this.mUrls = list;
        this.schema = str2;
    }
}
