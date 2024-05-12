package com.ss.android.ugc.aweme.model.api.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileNaviFeatureDataModel implements Serializable {

    @InterfaceC65349Pkn("category_key")
    public String category;

    @InterfaceC65349Pkn("info")
    public String info;

    public static /* synthetic */ ProfileNaviFeatureDataModel copy$default(ProfileNaviFeatureDataModel profileNaviFeatureDataModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileNaviFeatureDataModel.category;
        }
        if ((i & 2) != 0) {
            str2 = profileNaviFeatureDataModel.info;
        }
        return profileNaviFeatureDataModel.copy(str, str2);
    }

    public final ProfileNaviFeatureDataModel copy(String str, String str2) {
        return new ProfileNaviFeatureDataModel(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviFeatureDataModel)) {
            return false;
        }
        ProfileNaviFeatureDataModel profileNaviFeatureDataModel = (ProfileNaviFeatureDataModel) obj;
        return o.LJ(this.category, profileNaviFeatureDataModel.category) && o.LJ(this.info, profileNaviFeatureDataModel.info);
    }

    public int hashCode() {
        String str = this.category;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.info;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileNaviFeatureDataModel(category=");
        LIZ.append(this.category);
        LIZ.append(", info=");
        return q.LIZIZ(LIZ, this.info, ')', LIZ);
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getInfo() {
        return this.info;
    }

    public final void setCategory(String str) {
        this.category = str;
    }

    public final void setInfo(String str) {
        this.info = str;
    }

    public ProfileNaviFeatureDataModel(String str, String str2) {
        this.category = str;
        this.info = str2;
    }
}
