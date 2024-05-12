package com.ss.android.ugc.aweme.profile.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ProfileViewersConfig {

    @InterfaceC65349Pkn("enabled_max_followers")
    public Integer enabledMaxFollowers;

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileViewersConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfileViewersConfig) && o.LJ(this.enabledMaxFollowers, ((ProfileViewersConfig) obj).enabledMaxFollowers);
    }

    public final int hashCode() {
        Integer num = this.enabledMaxFollowers;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileViewersConfig(enabledMaxFollowers=");
        return s0.LIZJ(LIZ, this.enabledMaxFollowers, ')', LIZ);
    }

    public ProfileViewersConfig(Integer num) {
        this.enabledMaxFollowers = num;
    }

    public /* synthetic */ ProfileViewersConfig(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 5000 : num);
    }
}
