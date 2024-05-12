package com.ss.android.ugc.aweme.model.api.data;

import X.C1NE;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileNaviDataModel implements Serializable {

    @InterfaceC65349Pkn("animated_gifs")
    public List<ProfileNaviAnimatedGifDataModel> animationList;

    @InterfaceC65349Pkn("background_color")
    public String background_color;

    @InterfaceC65349Pkn("features")
    public List<ProfileNaviFeatureDataModel> features;

    @InterfaceC65349Pkn("navi_id")
    public String navi_id;

    @InterfaceC65349Pkn("staticImage")
    public List<ProfileNaviStaticImageDataModel> staticImage;

    @InterfaceC65349Pkn("user_id")
    public String user_id;

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileNaviDataModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfileNaviDataModel copy$default(ProfileNaviDataModel profileNaviDataModel, String str, String str2, String str3, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileNaviDataModel.navi_id;
        }
        if ((i & 2) != 0) {
            str2 = profileNaviDataModel.user_id;
        }
        if ((i & 4) != 0) {
            str3 = profileNaviDataModel.background_color;
        }
        if ((i & 8) != 0) {
            list = profileNaviDataModel.animationList;
        }
        if ((i & 16) != 0) {
            list2 = profileNaviDataModel.features;
        }
        if ((i & 32) != 0) {
            list3 = profileNaviDataModel.staticImage;
        }
        return profileNaviDataModel.copy(str, str2, str3, list, list2, list3);
    }

    public final ProfileNaviDataModel copy(String str, String str2, String background_color, List<ProfileNaviAnimatedGifDataModel> list, List<ProfileNaviFeatureDataModel> list2, List<ProfileNaviStaticImageDataModel> list3) {
        o.LJIIIZ(background_color, "background_color");
        return new ProfileNaviDataModel(str, str2, background_color, list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviDataModel)) {
            return false;
        }
        ProfileNaviDataModel profileNaviDataModel = (ProfileNaviDataModel) obj;
        return o.LJ(this.navi_id, profileNaviDataModel.navi_id) && o.LJ(this.user_id, profileNaviDataModel.user_id) && o.LJ(this.background_color, profileNaviDataModel.background_color) && o.LJ(this.animationList, profileNaviDataModel.animationList) && o.LJ(this.features, profileNaviDataModel.features) && o.LJ(this.staticImage, profileNaviDataModel.staticImage);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
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
        List<ProfileNaviAnimatedGifDataModel> list = this.animationList;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int i3 = (LJ + hashCode3) * 31;
        List<ProfileNaviFeatureDataModel> list2 = this.features;
        if (list2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list2.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        List<ProfileNaviStaticImageDataModel> list3 = this.staticImage;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return i4 + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileNaviDataModel(navi_id=");
        LIZ.append(this.navi_id);
        LIZ.append(", user_id=");
        LIZ.append(this.user_id);
        LIZ.append(", background_color=");
        LIZ.append(this.background_color);
        LIZ.append(", animationList=");
        LIZ.append(this.animationList);
        LIZ.append(", features=");
        LIZ.append(this.features);
        LIZ.append(", staticImage=");
        return C1NE.LIZIZ(LIZ, this.staticImage, ')', LIZ);
    }

    public final List<ProfileNaviAnimatedGifDataModel> getAnimationList() {
        return this.animationList;
    }

    public final String getBackground_color() {
        return this.background_color;
    }

    public final List<ProfileNaviFeatureDataModel> getFeatures() {
        return this.features;
    }

    public final String getNavi_id() {
        return this.navi_id;
    }

    public final List<ProfileNaviStaticImageDataModel> getStaticImage() {
        return this.staticImage;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public final void setAnimationList(List<ProfileNaviAnimatedGifDataModel> list) {
        this.animationList = list;
    }

    public final void setBackground_color(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.background_color = str;
    }

    public final void setFeatures(List<ProfileNaviFeatureDataModel> list) {
        this.features = list;
    }

    public final void setNavi_id(String str) {
        this.navi_id = str;
    }

    public final void setStaticImage(List<ProfileNaviStaticImageDataModel> list) {
        this.staticImage = list;
    }

    public final void setUser_id(String str) {
        this.user_id = str;
    }

    public ProfileNaviDataModel(String str, String str2, String background_color, List<ProfileNaviAnimatedGifDataModel> list, List<ProfileNaviFeatureDataModel> list2, List<ProfileNaviStaticImageDataModel> list3) {
        o.LJIIIZ(background_color, "background_color");
        this.navi_id = str;
        this.user_id = str2;
        this.background_color = background_color;
        this.animationList = list;
        this.features = list2;
        this.staticImage = list3;
    }

    public /* synthetic */ ProfileNaviDataModel(String str, String str2, String str3, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "#A5E6FF" : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) == 0 ? list3 : null);
    }
}
