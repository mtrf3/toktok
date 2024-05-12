package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class UserNowPackStruct implements Serializable {

    @InterfaceC65349Pkn("now_avatar_badge_status")
    public Integer nowAvatarBadgeStatus;

    @InterfaceC65349Pkn("user_now_status")
    public int userNowStatus;

    /* JADX WARN: Multi-variable type inference failed */
    public UserNowPackStruct() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UserNowPackStruct copy$default(UserNowPackStruct userNowPackStruct, int i, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = userNowPackStruct.userNowStatus;
        }
        if ((i2 & 2) != 0) {
            num = userNowPackStruct.nowAvatarBadgeStatus;
        }
        return userNowPackStruct.copy(i, num);
    }

    public final UserNowPackStruct copy(int i, Integer num) {
        return new UserNowPackStruct(i, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserNowPackStruct)) {
            return false;
        }
        UserNowPackStruct userNowPackStruct = (UserNowPackStruct) obj;
        return this.userNowStatus == userNowPackStruct.userNowStatus && o.LJ(this.nowAvatarBadgeStatus, userNowPackStruct.nowAvatarBadgeStatus);
    }

    public int hashCode() {
        int i = this.userNowStatus * 31;
        Integer num = this.nowAvatarBadgeStatus;
        return i + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserNowPackStruct(userNowStatus=");
        LIZ.append(this.userNowStatus);
        LIZ.append(", nowAvatarBadgeStatus=");
        return s0.LIZJ(LIZ, this.nowAvatarBadgeStatus, ')', LIZ);
    }

    public final Integer getNowAvatarBadgeStatus() {
        return this.nowAvatarBadgeStatus;
    }

    public final int getUserNowStatus() {
        return this.userNowStatus;
    }

    public final void setUserNowStatus(int i) {
        this.userNowStatus = i;
    }

    public UserNowPackStruct(int i, Integer num) {
        this.userNowStatus = i;
        this.nowAvatarBadgeStatus = num;
    }

    public /* synthetic */ UserNowPackStruct(int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0 : num);
    }
}
