package com.bytedance.android.live.effect.navi.model;

import X.C20000qS;
import X.InterfaceC65349Pkn;
import X.ORZ;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class ProfileNaviCandidate implements Serializable {

    @InterfaceC65349Pkn("features")
    public List<ProfileNaviFeature> features;

    @InterfaceC65349Pkn("starter_navi_id")
    public String starterNaviId;

    @InterfaceC65349Pkn("staticImage")
    public ProfileNaviStaticImage staticImage;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfileNaviCandidate copy$default(ProfileNaviCandidate profileNaviCandidate, String str, List list, ProfileNaviStaticImage profileNaviStaticImage, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileNaviCandidate.starterNaviId;
        }
        if ((i & 2) != 0) {
            list = profileNaviCandidate.features;
        }
        if ((i & 4) != 0) {
            profileNaviStaticImage = profileNaviCandidate.staticImage;
        }
        return profileNaviCandidate.copy(str, list, profileNaviStaticImage);
    }

    public final ProfileNaviCandidate copy(String str, List<ProfileNaviFeature> list, ProfileNaviStaticImage profileNaviStaticImage) {
        return new ProfileNaviCandidate(str, list, profileNaviStaticImage);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviCandidate)) {
            return false;
        }
        ProfileNaviCandidate profileNaviCandidate = (ProfileNaviCandidate) obj;
        return o.LJ(this.starterNaviId, profileNaviCandidate.starterNaviId) && o.LJ(this.features, profileNaviCandidate.features) && o.LJ(this.staticImage, profileNaviCandidate.staticImage);
    }

    public int hashCode() {
        String str = this.starterNaviId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ProfileNaviFeature> list = this.features;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        ProfileNaviStaticImage profileNaviStaticImage = this.staticImage;
        return hashCode2 + (profileNaviStaticImage != null ? profileNaviStaticImage.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileNaviCandidate(starterNaviId=");
        LIZ.append(this.starterNaviId);
        LIZ.append(", features=");
        LIZ.append(this.features);
        LIZ.append(", staticImage=");
        LIZ.append(this.staticImage);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final C20000qS transformCandidateNavi() {
        List list;
        String str = this.starterNaviId;
        List<ProfileNaviFeature> list2 = this.features;
        if (list2 != null) {
            list = ORZ.LLJILJILJ(list2);
        } else {
            list = null;
        }
        return new C20000qS(null, str, list, this.staticImage, 1);
    }

    public final List<ProfileNaviFeature> getFeatures() {
        return this.features;
    }

    public final String getStarterNaviId() {
        return this.starterNaviId;
    }

    public final ProfileNaviStaticImage getStaticImage() {
        return this.staticImage;
    }

    public final void setFeatures(List<ProfileNaviFeature> list) {
        this.features = list;
    }

    public final void setStarterNaviId(String str) {
        this.starterNaviId = str;
    }

    public final void setStaticImage(ProfileNaviStaticImage profileNaviStaticImage) {
        this.staticImage = profileNaviStaticImage;
    }

    public ProfileNaviCandidate(String str, List<ProfileNaviFeature> list, ProfileNaviStaticImage profileNaviStaticImage) {
        this.starterNaviId = str;
        this.features = list;
        this.staticImage = profileNaviStaticImage;
    }
}
