package com.ss.android.ugc.aweme.commercialize.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FollowButtonData implements Serializable {

    @InterfaceC65349Pkn("enable")
    public Boolean enable;

    @InterfaceC65349Pkn("show_seconds")
    public Integer showSeconds;

    /* JADX WARN: Multi-variable type inference failed */
    public FollowButtonData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FollowButtonData copy$default(FollowButtonData followButtonData, Boolean bool, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = followButtonData.enable;
        }
        if ((i & 2) != 0) {
            num = followButtonData.showSeconds;
        }
        return followButtonData.copy(bool, num);
    }

    public final FollowButtonData copy(Boolean bool, Integer num) {
        return new FollowButtonData(bool, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowButtonData)) {
            return false;
        }
        FollowButtonData followButtonData = (FollowButtonData) obj;
        return o.LJ(this.enable, followButtonData.enable) && o.LJ(this.showSeconds, followButtonData.showSeconds);
    }

    public int hashCode() {
        Boolean bool = this.enable;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.showSeconds;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FollowButtonData(enable=");
        LIZ.append(this.enable);
        LIZ.append(", showSeconds=");
        return s0.LIZJ(LIZ, this.showSeconds, ')', LIZ);
    }

    public final Boolean getEnable() {
        return this.enable;
    }

    public final Integer getShowSeconds() {
        return this.showSeconds;
    }

    public final void setEnable(Boolean bool) {
        this.enable = bool;
    }

    public final void setShowSeconds(Integer num) {
        this.showSeconds = num;
    }

    public FollowButtonData(Boolean bool, Integer num) {
        this.enable = bool;
        this.showSeconds = num;
    }

    public /* synthetic */ FollowButtonData(Boolean bool, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? 2 : num);
    }
}
