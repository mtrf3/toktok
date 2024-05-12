package com.ss.android.ugc.aweme.experiment;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileViewersExpConfig {

    @InterfaceC65349Pkn("profile_viewers_enable")
    public Boolean profileViewersEnable;

    @InterfaceC65349Pkn("profile_viewers_fixed_entrance")
    public Boolean profileViewersFixedEntrance;

    @InterfaceC65349Pkn("profile_viewers_push_enable")
    public Boolean profileViewersPushEnable;

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileViewersExpConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileViewersExpConfig)) {
            return false;
        }
        ProfileViewersExpConfig profileViewersExpConfig = (ProfileViewersExpConfig) obj;
        return o.LJ(this.profileViewersEnable, profileViewersExpConfig.profileViewersEnable) && o.LJ(this.profileViewersFixedEntrance, profileViewersExpConfig.profileViewersFixedEntrance) && o.LJ(this.profileViewersPushEnable, profileViewersExpConfig.profileViewersPushEnable);
    }

    public final int hashCode() {
        Boolean bool = this.profileViewersEnable;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.profileViewersFixedEntrance;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.profileViewersPushEnable;
        return hashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileViewersExpConfig(profileViewersEnable=");
        LIZ.append(this.profileViewersEnable);
        LIZ.append(", profileViewersFixedEntrance=");
        LIZ.append(this.profileViewersFixedEntrance);
        LIZ.append(", profileViewersPushEnable=");
        return C78920UyC.LIZIZ(LIZ, this.profileViewersPushEnable, ')', LIZ);
    }

    public ProfileViewersExpConfig(Boolean bool, Boolean bool2, Boolean bool3) {
        this.profileViewersEnable = bool;
        this.profileViewersFixedEntrance = bool2;
        this.profileViewersPushEnable = bool3;
    }

    public /* synthetic */ ProfileViewersExpConfig(Boolean bool, Boolean bool2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? Boolean.FALSE : bool2, (i & 4) != 0 ? Boolean.FALSE : bool3);
    }
}
