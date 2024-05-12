package com.bytedance.android.live.effect.navi.model;

import X.C1NE;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class ProfileNaviUploadDataModel implements Serializable {

    @InterfaceC65349Pkn("background_color")
    public String background_color;

    @InterfaceC65349Pkn("features")
    public List<ProfileNaviFeature> features;

    @InterfaceC65349Pkn("navi_id")
    public String navi_id;

    @InterfaceC65349Pkn("staticImage")
    public List<ProfileNaviStaticImage> staticImage;

    @InterfaceC65349Pkn("user_id")
    public String user_id;

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileNaviUploadDataModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfileNaviUploadDataModel copy$default(ProfileNaviUploadDataModel profileNaviUploadDataModel, String str, String str2, String str3, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileNaviUploadDataModel.navi_id;
        }
        if ((i & 2) != 0) {
            str2 = profileNaviUploadDataModel.user_id;
        }
        if ((i & 4) != 0) {
            str3 = profileNaviUploadDataModel.background_color;
        }
        if ((i & 8) != 0) {
            list = profileNaviUploadDataModel.features;
        }
        if ((i & 16) != 0) {
            list2 = profileNaviUploadDataModel.staticImage;
        }
        return profileNaviUploadDataModel.copy(str, str2, str3, list, list2);
    }

    public final ProfileNaviUploadDataModel copy(String str, String str2, String background_color, List<ProfileNaviFeature> list, List<ProfileNaviStaticImage> list2) {
        o.LJIIIZ(background_color, "background_color");
        return new ProfileNaviUploadDataModel(str, str2, background_color, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviUploadDataModel)) {
            return false;
        }
        ProfileNaviUploadDataModel profileNaviUploadDataModel = (ProfileNaviUploadDataModel) obj;
        return o.LJ(this.navi_id, profileNaviUploadDataModel.navi_id) && o.LJ(this.user_id, profileNaviUploadDataModel.user_id) && o.LJ(this.background_color, profileNaviUploadDataModel.background_color) && o.LJ(this.features, profileNaviUploadDataModel.features) && o.LJ(this.staticImage, profileNaviUploadDataModel.staticImage);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.navi_id;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.user_id;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int LJ = C79062V1e.LJ(this.background_color, (i2 + hashCode2) * 31, 31);
        List<ProfileNaviFeature> list = this.features;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int i3 = (LJ + hashCode3) * 31;
        List<ProfileNaviStaticImage> list2 = this.staticImage;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileNaviUploadDataModel(navi_id=");
        LIZ.append(this.navi_id);
        LIZ.append(", user_id=");
        LIZ.append(this.user_id);
        LIZ.append(", background_color=");
        LIZ.append(this.background_color);
        LIZ.append(", features=");
        LIZ.append(this.features);
        LIZ.append(", staticImage=");
        return C1NE.LIZIZ(LIZ, this.staticImage, ')', LIZ);
    }

    public final String getBackground_color() {
        return this.background_color;
    }

    public final List<ProfileNaviFeature> getFeatures() {
        return this.features;
    }

    public final String getNavi_id() {
        return this.navi_id;
    }

    public final List<ProfileNaviStaticImage> getStaticImage() {
        return this.staticImage;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public final void setBackground_color(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.background_color = str;
    }

    public final void setFeatures(List<ProfileNaviFeature> list) {
        this.features = list;
    }

    public final void setNavi_id(String str) {
        this.navi_id = str;
    }

    public final void setStaticImage(List<ProfileNaviStaticImage> list) {
        this.staticImage = list;
    }

    public final void setUser_id(String str) {
        this.user_id = str;
    }

    public ProfileNaviUploadDataModel(String str, String str2, String background_color, List<ProfileNaviFeature> list, List<ProfileNaviStaticImage> list2) {
        o.LJIIIZ(background_color, "background_color");
        this.navi_id = str;
        this.user_id = str2;
        this.background_color = background_color;
        this.features = list;
        this.staticImage = list2;
    }

    public /* synthetic */ ProfileNaviUploadDataModel(String str, String str2, String str3, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "#A5E6FF" : str3, (i & 8) != 0 ? null : list, (i & 16) == 0 ? list2 : null);
    }
}
