package com.ss.android.ugc.aweme.model.api.data;

import X.C31461Li;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ProfileNaviAnimatedGifDataModel implements Serializable {

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("animation_url")
    public UrlModel url;

    public static /* synthetic */ ProfileNaviAnimatedGifDataModel copy$default(ProfileNaviAnimatedGifDataModel profileNaviAnimatedGifDataModel, String str, UrlModel urlModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileNaviAnimatedGifDataModel.name;
        }
        if ((i & 2) != 0) {
            urlModel = profileNaviAnimatedGifDataModel.url;
        }
        return profileNaviAnimatedGifDataModel.copy(str, urlModel);
    }

    public final ProfileNaviAnimatedGifDataModel copy(String str, UrlModel urlModel) {
        return new ProfileNaviAnimatedGifDataModel(str, urlModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviAnimatedGifDataModel)) {
            return false;
        }
        ProfileNaviAnimatedGifDataModel profileNaviAnimatedGifDataModel = (ProfileNaviAnimatedGifDataModel) obj;
        return o.LJ(this.name, profileNaviAnimatedGifDataModel.name) && o.LJ(this.url, profileNaviAnimatedGifDataModel.url);
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        UrlModel urlModel = this.url;
        return hashCode + (urlModel != null ? urlModel.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileNaviAnimatedGifDataModel(name=");
        LIZ.append(this.name);
        LIZ.append(", url=");
        return C31461Li.LIZLLL(LIZ, this.url, ')', LIZ);
    }

    public final String getName() {
        return this.name;
    }

    public final UrlModel getUrl() {
        return this.url;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setUrl(UrlModel urlModel) {
        this.url = urlModel;
    }

    public ProfileNaviAnimatedGifDataModel(String str, UrlModel urlModel) {
        this.name = str;
        this.url = urlModel;
    }
}
