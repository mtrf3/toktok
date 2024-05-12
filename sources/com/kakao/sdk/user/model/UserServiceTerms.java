package com.kakao.sdk.user.model;

import X.C1NE;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UserServiceTerms {
    public final List<ServiceTerms> allowedServiceTerms;
    public final List<AppServiceTerms> appServiceTerms;
    public final Long userId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserServiceTerms copy$default(UserServiceTerms userServiceTerms, Long l, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = userServiceTerms.userId;
        }
        if ((i & 2) != 0) {
            list = userServiceTerms.allowedServiceTerms;
        }
        if ((i & 4) != 0) {
            list2 = userServiceTerms.appServiceTerms;
        }
        return userServiceTerms.copy(l, list, list2);
    }

    public final UserServiceTerms copy(Long l, List<ServiceTerms> list, List<AppServiceTerms> list2) {
        return new UserServiceTerms(l, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserServiceTerms)) {
            return false;
        }
        UserServiceTerms userServiceTerms = (UserServiceTerms) obj;
        return o.LJ(this.userId, userServiceTerms.userId) && o.LJ(this.allowedServiceTerms, userServiceTerms.allowedServiceTerms) && o.LJ(this.appServiceTerms, userServiceTerms.appServiceTerms);
    }

    public int hashCode() {
        Long l = this.userId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        List<ServiceTerms> list = this.allowedServiceTerms;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<AppServiceTerms> list2 = this.appServiceTerms;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserServiceTerms(userId=");
        LIZ.append(this.userId);
        LIZ.append(", allowedServiceTerms=");
        LIZ.append(this.allowedServiceTerms);
        LIZ.append(", appServiceTerms=");
        return C1NE.LIZIZ(LIZ, this.appServiceTerms, ')', LIZ);
    }

    public final List<ServiceTerms> getAllowedServiceTerms() {
        return this.allowedServiceTerms;
    }

    public final List<AppServiceTerms> getAppServiceTerms() {
        return this.appServiceTerms;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public UserServiceTerms(Long l, List<ServiceTerms> list, List<AppServiceTerms> list2) {
        this.userId = l;
        this.allowedServiceTerms = list;
        this.appServiceTerms = list2;
    }
}
