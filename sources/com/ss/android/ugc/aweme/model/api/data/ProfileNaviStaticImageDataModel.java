package com.ss.android.ugc.aweme.model.api.data;

import X.C31461Li;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileNaviStaticImageDataModel implements Serializable {

    @InterfaceC65349Pkn("static_image_larger")
    public UrlModel staticImageUrl;

    @InterfaceC65349Pkn("static_image_thumbnail")
    public UrlModel thumbnailUrl;

    @InterfaceC65349Pkn("type")
    public String type;

    public static /* synthetic */ ProfileNaviStaticImageDataModel copy$default(ProfileNaviStaticImageDataModel profileNaviStaticImageDataModel, String str, UrlModel urlModel, UrlModel urlModel2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileNaviStaticImageDataModel.type;
        }
        if ((i & 2) != 0) {
            urlModel = profileNaviStaticImageDataModel.staticImageUrl;
        }
        if ((i & 4) != 0) {
            urlModel2 = profileNaviStaticImageDataModel.thumbnailUrl;
        }
        return profileNaviStaticImageDataModel.copy(str, urlModel, urlModel2);
    }

    public final ProfileNaviStaticImageDataModel copy(String str, UrlModel urlModel, UrlModel urlModel2) {
        return new ProfileNaviStaticImageDataModel(str, urlModel, urlModel2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviStaticImageDataModel)) {
            return false;
        }
        ProfileNaviStaticImageDataModel profileNaviStaticImageDataModel = (ProfileNaviStaticImageDataModel) obj;
        return o.LJ(this.type, profileNaviStaticImageDataModel.type) && o.LJ(this.staticImageUrl, profileNaviStaticImageDataModel.staticImageUrl) && o.LJ(this.thumbnailUrl, profileNaviStaticImageDataModel.thumbnailUrl);
    }

    public int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        UrlModel urlModel = this.staticImageUrl;
        int hashCode2 = (hashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        UrlModel urlModel2 = this.thumbnailUrl;
        return hashCode2 + (urlModel2 != null ? urlModel2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileNaviStaticImageDataModel(type=");
        LIZ.append(this.type);
        LIZ.append(", staticImageUrl=");
        LIZ.append(this.staticImageUrl);
        LIZ.append(", thumbnailUrl=");
        return C31461Li.LIZLLL(LIZ, this.thumbnailUrl, ')', LIZ);
    }

    public final UrlModel getStaticImageUrl() {
        return this.staticImageUrl;
    }

    public final UrlModel getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final String getType() {
        return this.type;
    }

    public final void setStaticImageUrl(UrlModel urlModel) {
        this.staticImageUrl = urlModel;
    }

    public final void setThumbnailUrl(UrlModel urlModel) {
        this.thumbnailUrl = urlModel;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public ProfileNaviStaticImageDataModel(String str, UrlModel urlModel, UrlModel urlModel2) {
        this.type = str;
        this.staticImageUrl = urlModel;
        this.thumbnailUrl = urlModel2;
    }

    public /* synthetic */ ProfileNaviStaticImageDataModel(String str, UrlModel urlModel, UrlModel urlModel2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : urlModel, urlModel2);
    }
}
