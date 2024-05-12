package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.google.gson.m;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class CombineLiveNotice {

    @InterfaceC65349Pkn("room_info")
    public final m roomInfo;

    @InterfaceC65349Pkn("type")
    public final int type;

    @InterfaceC65349Pkn("owner")
    public final User user;

    /* JADX WARN: Multi-variable type inference failed */
    public CombineLiveNotice() {
        this(null, 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CombineLiveNotice copy$default(CombineLiveNotice combineLiveNotice, User user, int i, m mVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            user = combineLiveNotice.user;
        }
        if ((i2 & 2) != 0) {
            i = combineLiveNotice.type;
        }
        if ((i2 & 4) != 0) {
            mVar = combineLiveNotice.roomInfo;
        }
        return combineLiveNotice.copy(user, i, mVar);
    }

    public final CombineLiveNotice copy(User user, int i, m mVar) {
        return new CombineLiveNotice(user, i, mVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CombineLiveNotice)) {
            return false;
        }
        CombineLiveNotice combineLiveNotice = (CombineLiveNotice) obj;
        return o.LJ(this.user, combineLiveNotice.user) && this.type == combineLiveNotice.type && o.LJ(this.roomInfo, combineLiveNotice.roomInfo);
    }

    public int hashCode() {
        User user = this.user;
        int hashCode = (((user == null ? 0 : user.hashCode()) * 31) + this.type) * 31;
        m mVar = this.roomInfo;
        return hashCode + (mVar != null ? mVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CombineLiveNotice(user=");
        LIZ.append(this.user);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", roomInfo=");
        LIZ.append(this.roomInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final m getRoomInfo() {
        return this.roomInfo;
    }

    public final int getType() {
        return this.type;
    }

    public final User getUser() {
        return this.user;
    }

    public CombineLiveNotice(User user, int i, m mVar) {
        this.user = user;
        this.type = i;
        this.roomInfo = mVar;
    }

    public /* synthetic */ CombineLiveNotice(User user, int i, m mVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : user, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : mVar);
    }
}
