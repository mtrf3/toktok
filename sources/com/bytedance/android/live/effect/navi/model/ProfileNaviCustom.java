package com.bytedance.android.live.effect.navi.model;

import X.C1NE;
import X.C20000qS;
import X.InterfaceC65349Pkn;
import X.ORZ;
import X.X1D;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class ProfileNaviCustom implements Serializable {

    @InterfaceC65349Pkn("background_color")
    public String backgroundColor;

    @InterfaceC65349Pkn("features")
    public List<ProfileNaviFeature> features;

    @InterfaceC65349Pkn("navi_id")
    public String naviId;

    @InterfaceC65349Pkn("staticImage")
    public List<ProfileNaviStaticImage> staticImage;

    @InterfaceC65349Pkn("user_id")
    public String userId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfileNaviCustom copy$default(ProfileNaviCustom profileNaviCustom, String str, String str2, String str3, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileNaviCustom.naviId;
        }
        if ((i & 2) != 0) {
            str2 = profileNaviCustom.userId;
        }
        if ((i & 4) != 0) {
            str3 = profileNaviCustom.backgroundColor;
        }
        if ((i & 8) != 0) {
            list = profileNaviCustom.features;
        }
        if ((i & 16) != 0) {
            list2 = profileNaviCustom.staticImage;
        }
        return profileNaviCustom.copy(str, str2, str3, list, list2);
    }

    public final ProfileNaviCustom copy(String str, String str2, String str3, List<ProfileNaviFeature> list, List<ProfileNaviStaticImage> list2) {
        return new ProfileNaviCustom(str, str2, str3, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviCustom)) {
            return false;
        }
        ProfileNaviCustom profileNaviCustom = (ProfileNaviCustom) obj;
        return o.LJ(this.naviId, profileNaviCustom.naviId) && o.LJ(this.userId, profileNaviCustom.userId) && o.LJ(this.backgroundColor, profileNaviCustom.backgroundColor) && o.LJ(this.features, profileNaviCustom.features) && o.LJ(this.staticImage, profileNaviCustom.staticImage);
    }

    public int hashCode() {
        String str = this.naviId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<ProfileNaviFeature> list = this.features;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<ProfileNaviStaticImage> list2 = this.staticImage;
        return hashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final C20000qS transformToProfileNavi() {
        List list;
        ProfileNaviStaticImage profileNaviStaticImage;
        String str = this.naviId;
        List<ProfileNaviFeature> list2 = this.features;
        if (list2 != null) {
            list = ORZ.LLJILJILJ(list2);
        } else {
            list = null;
        }
        List<ProfileNaviStaticImage> list3 = this.staticImage;
        if (list3 != null) {
            profileNaviStaticImage = (ProfileNaviStaticImage) ListProtector.get(list3, 0);
        } else {
            profileNaviStaticImage = null;
        }
        return new C20000qS(str, null, list, profileNaviStaticImage, 2);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileNaviCustom(naviId=");
        LIZ.append(this.naviId);
        LIZ.append(", userId=");
        LIZ.append(this.userId);
        LIZ.append(", backgroundColor=");
        LIZ.append(this.backgroundColor);
        LIZ.append(", features=");
        LIZ.append(this.features);
        LIZ.append(", staticImage=");
        return C1NE.LIZIZ(LIZ, this.staticImage, ')', LIZ);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<ProfileNaviFeature> getFeatures() {
        return this.features;
    }

    public final String getNaviId() {
        return this.naviId;
    }

    public final List<ProfileNaviStaticImage> getStaticImage() {
        return this.staticImage;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final void setBackgroundColor(String str) {
        this.backgroundColor = str;
    }

    public final void setFeatures(List<ProfileNaviFeature> list) {
        this.features = list;
    }

    public final void setNaviId(String str) {
        this.naviId = str;
    }

    public final void setStaticImage(List<ProfileNaviStaticImage> list) {
        this.staticImage = list;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public ProfileNaviCustom(String str, String str2, String str3, List<ProfileNaviFeature> list, List<ProfileNaviStaticImage> list2) {
        this.naviId = str;
        this.userId = str2;
        this.backgroundColor = str3;
        this.features = list;
        this.staticImage = list2;
    }
}
