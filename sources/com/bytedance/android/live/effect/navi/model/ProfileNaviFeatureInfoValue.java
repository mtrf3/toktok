package com.bytedance.android.live.effect.navi.model;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class ProfileNaviFeatureInfoValue implements Serializable {

    @InterfaceC65349Pkn("key")
    public String key;

    @InterfaceC65349Pkn("value")
    public Long value;

    public static /* synthetic */ ProfileNaviFeatureInfoValue copy$default(ProfileNaviFeatureInfoValue profileNaviFeatureInfoValue, String str, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileNaviFeatureInfoValue.key;
        }
        if ((i & 2) != 0) {
            l = profileNaviFeatureInfoValue.value;
        }
        return profileNaviFeatureInfoValue.copy(str, l);
    }

    public final ProfileNaviFeatureInfoValue copy(String key, Long l) {
        o.LJIIIZ(key, "key");
        return new ProfileNaviFeatureInfoValue(key, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviFeatureInfoValue)) {
            return false;
        }
        ProfileNaviFeatureInfoValue profileNaviFeatureInfoValue = (ProfileNaviFeatureInfoValue) obj;
        return o.LJ(this.key, profileNaviFeatureInfoValue.key) && o.LJ(this.value, profileNaviFeatureInfoValue.value);
    }

    public int hashCode() {
        int hashCode = this.key.hashCode() * 31;
        Long l = this.value;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileNaviFeatureInfoValue(key=");
        LIZ.append(this.key);
        LIZ.append(", value=");
        return JBR.LJ(LIZ, this.value, ')', LIZ);
    }

    public final String getKey() {
        return this.key;
    }

    public final Long getValue() {
        return this.value;
    }

    public final void setKey(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.key = str;
    }

    public final void setValue(Long l) {
        this.value = l;
    }

    public ProfileNaviFeatureInfoValue(String key, Long l) {
        o.LJIIIZ(key, "key");
        this.key = key;
        this.value = l;
    }
}
