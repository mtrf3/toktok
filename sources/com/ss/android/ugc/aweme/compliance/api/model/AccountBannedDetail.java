package com.ss.android.ugc.aweme.compliance.api.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AccountBannedDetail extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("ban_infos")
    public final List<BanInfo> banInfos;

    /* JADX WARN: Multi-variable type inference failed */
    public AccountBannedDetail() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountBannedDetail copy$default(AccountBannedDetail accountBannedDetail, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = accountBannedDetail.banInfos;
        }
        return accountBannedDetail.copy(list);
    }

    public final AccountBannedDetail copy(List<BanInfo> list) {
        return new AccountBannedDetail(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountBannedDetail) && o.LJ(this.banInfos, ((AccountBannedDetail) obj).banInfos);
    }

    public int hashCode() {
        List<BanInfo> list = this.banInfos;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AccountBannedDetail(banInfos=");
        return C1NE.LIZIZ(LIZ, this.banInfos, ')', LIZ);
    }

    public final List<BanInfo> getBanInfos() {
        return this.banInfos;
    }

    public AccountBannedDetail(List<BanInfo> list) {
        this.banInfos = list;
    }

    public /* synthetic */ AccountBannedDetail(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
