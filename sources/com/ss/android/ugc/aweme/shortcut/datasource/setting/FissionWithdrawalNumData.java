package com.ss.android.ugc.aweme.shortcut.datasource.setting;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FissionWithdrawalNumData extends BaseResponse {

    @InterfaceC65349Pkn("data")
    public final FissionWithdrawalNum data;

    public final int hashCode() {
        return Objects.hash(this.data);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("FissionWithdrawalNumData:%s", this.data);
    }

    public FissionWithdrawalNumData(FissionWithdrawalNum data) {
        o.LJIIIZ(data, "data");
        this.data = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FissionWithdrawalNumData)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((FissionWithdrawalNumData) obj).data}, new Object[]{this.data});
    }
}
