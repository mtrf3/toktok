package com.ss.android.ugc.aweme.model.api.data;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileNaviInitialDataModel implements Serializable {

    @InterfaceC65349Pkn("features")
    public List<ProfileNaviFeatureDataModel> features;

    @InterfaceC65349Pkn("starter_navi_id")
    public String id;

    @InterfaceC65349Pkn("staticImage")
    public ProfileNaviStaticImageDataModel image;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfileNaviInitialDataModel copy$default(ProfileNaviInitialDataModel profileNaviInitialDataModel, String str, ProfileNaviStaticImageDataModel profileNaviStaticImageDataModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileNaviInitialDataModel.id;
        }
        if ((i & 2) != 0) {
            profileNaviStaticImageDataModel = profileNaviInitialDataModel.image;
        }
        if ((i & 4) != 0) {
            list = profileNaviInitialDataModel.features;
        }
        return profileNaviInitialDataModel.copy(str, profileNaviStaticImageDataModel, list);
    }

    public final ProfileNaviInitialDataModel copy(String str, ProfileNaviStaticImageDataModel profileNaviStaticImageDataModel, List<ProfileNaviFeatureDataModel> list) {
        return new ProfileNaviInitialDataModel(str, profileNaviStaticImageDataModel, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviInitialDataModel)) {
            return false;
        }
        ProfileNaviInitialDataModel profileNaviInitialDataModel = (ProfileNaviInitialDataModel) obj;
        return o.LJ(this.id, profileNaviInitialDataModel.id) && o.LJ(this.image, profileNaviInitialDataModel.image) && o.LJ(this.features, profileNaviInitialDataModel.features);
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ProfileNaviStaticImageDataModel profileNaviStaticImageDataModel = this.image;
        int hashCode2 = (hashCode + (profileNaviStaticImageDataModel == null ? 0 : profileNaviStaticImageDataModel.hashCode())) * 31;
        List<ProfileNaviFeatureDataModel> list = this.features;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileNaviInitialDataModel(id=");
        LIZ.append(this.id);
        LIZ.append(", image=");
        LIZ.append(this.image);
        LIZ.append(", features=");
        return C1NE.LIZIZ(LIZ, this.features, ')', LIZ);
    }

    public final List<ProfileNaviFeatureDataModel> getFeatures() {
        return this.features;
    }

    public final String getId() {
        return this.id;
    }

    public final ProfileNaviStaticImageDataModel getImage() {
        return this.image;
    }

    public final void setFeatures(List<ProfileNaviFeatureDataModel> list) {
        this.features = list;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setImage(ProfileNaviStaticImageDataModel profileNaviStaticImageDataModel) {
        this.image = profileNaviStaticImageDataModel;
    }

    public ProfileNaviInitialDataModel(String str, ProfileNaviStaticImageDataModel profileNaviStaticImageDataModel, List<ProfileNaviFeatureDataModel> list) {
        this.id = str;
        this.image = profileNaviStaticImageDataModel;
        this.features = list;
    }
}
