package com.bytedance.android.livesdk.model.message.ext;

import X.C1FJ;
import X.F9E;
import X.InterfaceC65349Pkn;
import X.RUK;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class GImage extends F9E implements Serializable, Parcelable {
    public static final Parcelable.Creator<GImage> CREATOR = new RUK();

    @InterfaceC65349Pkn("height")
    public final Integer height;

    @InterfaceC65349Pkn("mimetype")
    public final String mimetype;

    @InterfaceC65349Pkn("thumb_uri")
    public final String thumbUri;

    @InterfaceC65349Pkn("thumb_url_list")
    public final List<String> thumbUrls;

    @InterfaceC65349Pkn("uri")
    public final String uri;

    @InterfaceC65349Pkn("url_list")
    public final List<String> urls;

    @InterfaceC65349Pkn("width")
    public final Integer width;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GImage copy$default(GImage gImage, Integer num, Integer num2, String str, String str2, List list, String str3, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = gImage.width;
        }
        if ((i & 2) != 0) {
            num2 = gImage.height;
        }
        if ((i & 4) != 0) {
            str = gImage.mimetype;
        }
        if ((i & 8) != 0) {
            str2 = gImage.uri;
        }
        if ((i & 16) != 0) {
            list = gImage.urls;
        }
        if ((i & 32) != 0) {
            str3 = gImage.thumbUri;
        }
        if ((i & 64) != 0) {
            list2 = gImage.thumbUrls;
        }
        return gImage.copy(num, num2, str, str2, list, str3, list2);
    }

    public final GImage copy(Integer num, Integer num2, String str, String str2, List<String> list, String str3, List<String> list2) {
        return new GImage(num, num2, str, str2, list, str3, list2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.width, this.height, this.mimetype, this.uri, this.urls, this.thumbUri, this.thumbUrls};
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getMimetype() {
        return this.mimetype;
    }

    public final String getThumbUri() {
        return this.thumbUri;
    }

    public final List<String> getThumbUrls() {
        return this.thumbUrls;
    }

    public final String getUri() {
        return this.uri;
    }

    public final List<String> getUrls() {
        return this.urls;
    }

    public final Integer getWidth() {
        return this.width;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        Integer num = this.width;
        if (num != null) {
            C1FJ.LJ(parcel, 1, num);
        } else {
            parcel.writeInt(0);
        }
        Integer num2 = this.height;
        if (num2 != null) {
            C1FJ.LJ(parcel, 1, num2);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.mimetype);
        parcel.writeString(this.uri);
        parcel.writeStringList(this.urls);
        parcel.writeString(this.thumbUri);
        parcel.writeStringList(this.thumbUrls);
    }

    public GImage(Integer num, Integer num2, String str, String str2, List<String> list, String str3, List<String> list2) {
        this.width = num;
        this.height = num2;
        this.mimetype = str;
        this.uri = str2;
        this.urls = list;
        this.thumbUri = str3;
        this.thumbUrls = list2;
    }
}
