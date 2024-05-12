package com.bytedance.android.live.effect.navi.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class ProfileNaviFeature implements Serializable {

    @InterfaceC65349Pkn("category_key")
    public String category;

    @InterfaceC65349Pkn("info")
    public String info;

    public static /* synthetic */ ProfileNaviFeature copy$default(ProfileNaviFeature profileNaviFeature, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileNaviFeature.category;
        }
        if ((i & 2) != 0) {
            str2 = profileNaviFeature.info;
        }
        return profileNaviFeature.copy(str, str2);
    }

    public final ProfileNaviFeature copy(String str, String str2) {
        return new ProfileNaviFeature(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviFeature)) {
            return false;
        }
        ProfileNaviFeature profileNaviFeature = (ProfileNaviFeature) obj;
        return o.LJ(this.category, profileNaviFeature.category) && o.LJ(this.info, profileNaviFeature.info);
    }

    public int hashCode() {
        String str = this.category;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.info;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileNaviFeature(category=");
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

    public ProfileNaviFeature(String str, String str2) {
        this.category = str;
        this.info = str2;
    }
}
