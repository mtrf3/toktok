package com.ss.android.ugc.aweme.model.api.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileNaviImageDataModel implements Serializable {

    @InterfaceC65349Pkn("background_color")
    public final String backgroundColorHex;

    @InterfaceC65349Pkn("dynamic_profile_image")
    public final UrlModel dynamicImageUrlModel;

    @InterfaceC65349Pkn("navi_id")
    public final String naviId;

    @InterfaceC65349Pkn("static_profile_image")
    public final UrlModel staticImageUrlModel;

    public static /* synthetic */ ProfileNaviImageDataModel copy$default(ProfileNaviImageDataModel profileNaviImageDataModel, String str, UrlModel urlModel, UrlModel urlModel2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileNaviImageDataModel.naviId;
        }
        if ((i & 2) != 0) {
            urlModel = profileNaviImageDataModel.staticImageUrlModel;
        }
        if ((i & 4) != 0) {
            urlModel2 = profileNaviImageDataModel.dynamicImageUrlModel;
        }
        if ((i & 8) != 0) {
            str2 = profileNaviImageDataModel.backgroundColorHex;
        }
        return profileNaviImageDataModel.copy(str, urlModel, urlModel2, str2);
    }

    public final ProfileNaviImageDataModel copy(String str, UrlModel urlModel, UrlModel urlModel2, String str2) {
        return new ProfileNaviImageDataModel(str, urlModel, urlModel2, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviImageDataModel)) {
            return false;
        }
        ProfileNaviImageDataModel profileNaviImageDataModel = (ProfileNaviImageDataModel) obj;
        return o.LJ(this.naviId, profileNaviImageDataModel.naviId) && o.LJ(this.staticImageUrlModel, profileNaviImageDataModel.staticImageUrlModel) && o.LJ(this.dynamicImageUrlModel, profileNaviImageDataModel.dynamicImageUrlModel) && o.LJ(this.backgroundColorHex, profileNaviImageDataModel.backgroundColorHex);
    }

    public int hashCode() {
        String str = this.naviId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        UrlModel urlModel = this.staticImageUrlModel;
        int hashCode2 = (hashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        UrlModel urlModel2 = this.dynamicImageUrlModel;
        int hashCode3 = (hashCode2 + (urlModel2 == null ? 0 : urlModel2.hashCode())) * 31;
        String str2 = this.backgroundColorHex;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileNaviImageDataModel(naviId=");
        LIZ.append(this.naviId);
        LIZ.append(", staticImageUrlModel=");
        LIZ.append(this.staticImageUrlModel);
        LIZ.append(", dynamicImageUrlModel=");
        LIZ.append(this.dynamicImageUrlModel);
        LIZ.append(", backgroundColorHex=");
        return q.LIZIZ(LIZ, this.backgroundColorHex, ')', LIZ);
    }

    public final String getBackgroundColorHex() {
        return this.backgroundColorHex;
    }

    public final UrlModel getDynamicImageUrlModel() {
        return this.dynamicImageUrlModel;
    }

    public final String getNaviId() {
        return this.naviId;
    }

    public final UrlModel getStaticImageUrlModel() {
        return this.staticImageUrlModel;
    }

    public ProfileNaviImageDataModel(String str, UrlModel urlModel, UrlModel urlModel2, String str2) {
        this.naviId = str;
        this.staticImageUrlModel = urlModel;
        this.dynamicImageUrlModel = urlModel2;
        this.backgroundColorHex = str2;
    }
}
