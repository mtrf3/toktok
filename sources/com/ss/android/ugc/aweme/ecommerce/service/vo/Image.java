package com.ss.android.ugc.aweme.ecommerce.service.vo;

import X.C1FJ;
import X.C1NE;
import X.C27660AtM;
import X.C32151Nz;
import X.C62562cu;
import X.InterfaceC65349Pkn;
import X.O6R;
import X.ORZ;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.net.URI;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes13.dex */
public final class Image implements Parcelable, Serializable {
    public static final Parcelable.Creator<Image> CREATOR = new C27660AtM();

    @InterfaceC65349Pkn("height")
    public Integer height;

    @InterfaceC65349Pkn("mimetype")
    public final String mimetype;

    @InterfaceC65349Pkn("thumb_uri")
    public final String thumbUri;

    @InterfaceC65349Pkn("thumb_url_list")
    public List<String> thumbUrls;

    @InterfaceC65349Pkn("uri")
    public final String uri;

    @InterfaceC65349Pkn("url_list")
    public List<String> urls;

    @InterfaceC65349Pkn("width")
    public Integer width;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Image copy$default(Image image, Integer num, Integer num2, String str, String str2, List list, String str3, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = image.width;
        }
        if ((i & 2) != 0) {
            num2 = image.height;
        }
        if ((i & 4) != 0) {
            str = image.mimetype;
        }
        if ((i & 8) != 0) {
            str2 = image.uri;
        }
        if ((i & 16) != 0) {
            list = image.urls;
        }
        if ((i & 32) != 0) {
            str3 = image.thumbUri;
        }
        if ((i & 64) != 0) {
            list2 = image.thumbUrls;
        }
        return image.copy(num, num2, str, str2, list, str3, list2);
    }

    public final Image copy(Integer num, Integer num2, String str, String str2, List<String> list, String str3, List<String> list2) {
        return new Image(num, num2, str, str2, list, str3, list2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Image)) {
            return false;
        }
        Image image = (Image) obj;
        return o.LJ(this.width, image.width) && o.LJ(this.height, image.height) && o.LJ(this.mimetype, image.mimetype) && o.LJ(this.uri, image.uri) && o.LJ(this.urls, image.urls) && o.LJ(this.thumbUri, image.thumbUri) && o.LJ(this.thumbUrls, image.thumbUrls);
    }

    public int hashCode() {
        Integer num = this.width;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.height;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.mimetype;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.uri;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.urls;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.thumbUri;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list2 = this.thumbUrls;
        return hashCode6 + (list2 != null ? list2.hashCode() : 0);
    }

    private final C62562cu toThumbImageUrlModel() {
        return new C62562cu(this.thumbUrls);
    }

    public final String getHost() {
        String str;
        List<String> list = this.urls;
        if (list != null && (str = (String) ORZ.LJLLLL(list)) != null) {
            return URI.create(str).getHost();
        }
        return null;
    }

    public final float getRadio() {
        int i;
        Integer num = this.width;
        Integer num2 = this.height;
        int i2 = 1;
        if (num == null || num.intValue() == 0) {
            i = 1;
        } else {
            i = num.intValue();
        }
        if (num2 != null && num2.intValue() != 0) {
            i2 = num2.intValue();
        }
        return i / i2;
    }

    public final String getSuffix() {
        String str;
        String str2;
        List<String> list = this.urls;
        if (list == null || (str = (String) ORZ.LJLLLL(list)) == null || (str2 = this.uri) == null || str2.length() <= 0) {
            return null;
        }
        return (String) ORZ.LJLLLLLL(1, s.LJLJJL(str, new String[]{str2}, 0, 6));
    }

    public final C62562cu toImageUrlModel() {
        return new C62562cu(this.urls);
    }

    public final C62562cu toThumbFirstImageUrlModel() {
        List<String> list = this.thumbUrls;
        if (list == null || list.isEmpty()) {
            return toImageUrlModel();
        }
        return toThumbImageUrlModel();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Image(width=");
        LIZ.append(this.width);
        LIZ.append(", height=");
        LIZ.append(this.height);
        LIZ.append(", mimetype=");
        LIZ.append(this.mimetype);
        LIZ.append(", uri=");
        LIZ.append(this.uri);
        LIZ.append(", urls=");
        LIZ.append(this.urls);
        LIZ.append(", thumbUri=");
        LIZ.append(this.thumbUri);
        LIZ.append(", thumbUrls=");
        return C1NE.LIZIZ(LIZ, this.thumbUrls, ')', LIZ);
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

    public final Integer getWidth(float f) {
        Integer num = this.width;
        if (num != null && num.intValue() > 0) {
            int intValue = num.intValue();
            Integer num2 = this.height;
            if (num2 != null && num2.intValue() > 0) {
                return Integer.valueOf(O6R.LJJIIZ((C32151Nz.LJIIZILJ(Float.valueOf(f)) * intValue) / num2.intValue()));
            }
        }
        return null;
    }

    public final void setHeight(Integer num) {
        this.height = num;
    }

    public final void setThumbUrls(List<String> list) {
        this.thumbUrls = list;
    }

    public final void setUrls(List<String> list) {
        this.urls = list;
    }

    public final void setWidth(Integer num) {
        this.width = num;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Integer num = this.width;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Integer num2 = this.height;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        out.writeString(this.mimetype);
        out.writeString(this.uri);
        out.writeStringList(this.urls);
        out.writeString(this.thumbUri);
        out.writeStringList(this.thumbUrls);
    }

    public Image(Integer num, Integer num2, String str, String str2, List<String> list, String str3, List<String> list2) {
        this.width = num;
        this.height = num2;
        this.mimetype = str;
        this.uri = str2;
        this.urls = list;
        this.thumbUri = str3;
        this.thumbUrls = list2;
    }
}
