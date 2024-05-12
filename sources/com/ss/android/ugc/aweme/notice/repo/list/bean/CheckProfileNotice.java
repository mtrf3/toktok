package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C16880lQ;
import X.C47135Ieh;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CheckProfileNotice {

    @InterfaceC65349Pkn("count")
    public final int countOfUser;

    @InterfaceC65349Pkn("create_time")
    public final long createTime;

    @InterfaceC65349Pkn("users")
    public final List<User> users;

    /* JADX WARN: Multi-variable type inference failed */
    public CheckProfileNotice() {
        this(0, null, 0L, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckProfileNotice copy$default(CheckProfileNotice checkProfileNotice, int i, List list, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = checkProfileNotice.countOfUser;
        }
        if ((i2 & 2) != 0) {
            list = checkProfileNotice.users;
        }
        if ((i2 & 4) != 0) {
            j = checkProfileNotice.createTime;
        }
        return checkProfileNotice.copy(i, list, j);
    }

    public final CheckProfileNotice copy(int i, List<? extends User> list, long j) {
        return new CheckProfileNotice(i, list, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckProfileNotice)) {
            return false;
        }
        CheckProfileNotice checkProfileNotice = (CheckProfileNotice) obj;
        return this.countOfUser == checkProfileNotice.countOfUser && o.LJ(this.users, checkProfileNotice.users) && this.createTime == checkProfileNotice.createTime;
    }

    public int hashCode() {
        int i = this.countOfUser * 31;
        List<User> list = this.users;
        return C16880lQ.LLJIJIL(this.createTime) + ((i + (list == null ? 0 : list.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CheckProfileNotice(countOfUser=");
        LIZ.append(this.countOfUser);
        LIZ.append(", users=");
        LIZ.append(this.users);
        LIZ.append(", createTime=");
        return C47135Ieh.LIZIZ(LIZ, this.createTime, ')', LIZ);
    }

    public final int getCountOfUser() {
        return this.countOfUser;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final List<User> getUsers() {
        return this.users;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CheckProfileNotice(int i, List<? extends User> list, long j) {
        this.countOfUser = i;
        this.users = list;
        this.createTime = j;
    }

    public /* synthetic */ CheckProfileNotice(int i, List list, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? 0L : j);
    }
}
