package com.bytedance.android.live.effect.navi.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.live.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class ProfileNaviStaticImage implements Serializable {

    @InterfaceC65349Pkn("static_image_larger")
    public UrlModel staticImageUrl;

    @InterfaceC65349Pkn("static_image_thumbnail")
    public UrlModel thumbnailUrl;

    @InterfaceC65349Pkn("type")
    public String type;

    public static /* synthetic */ ProfileNaviStaticImage copy$default(ProfileNaviStaticImage profileNaviStaticImage, String str, UrlModel urlModel, UrlModel urlModel2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileNaviStaticImage.type;
        }
        if ((i & 2) != 0) {
            urlModel = profileNaviStaticImage.staticImageUrl;
        }
        if ((i & 4) != 0) {
            urlModel2 = profileNaviStaticImage.thumbnailUrl;
        }
        return profileNaviStaticImage.copy(str, urlModel, urlModel2);
    }

    public final ProfileNaviStaticImage copy(String str, UrlModel urlModel, UrlModel urlModel2) {
        return new ProfileNaviStaticImage(str, urlModel, urlModel2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviStaticImage)) {
            return false;
        }
        ProfileNaviStaticImage profileNaviStaticImage = (ProfileNaviStaticImage) obj;
        return o.LJ(this.type, profileNaviStaticImage.type) && o.LJ(this.staticImageUrl, profileNaviStaticImage.staticImageUrl) && o.LJ(this.thumbnailUrl, profileNaviStaticImage.thumbnailUrl);
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
        LIZ.append("ProfileNaviStaticImage(type=");
        LIZ.append(this.type);
        LIZ.append(", staticImageUrl=");
        LIZ.append(this.staticImageUrl);
        LIZ.append(", thumbnailUrl=");
        LIZ.append(this.thumbnailUrl);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
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

    public ProfileNaviStaticImage(String str, UrlModel urlModel, UrlModel urlModel2) {
        this.type = str;
        this.staticImageUrl = urlModel;
        this.thumbnailUrl = urlModel2;
    }
}
