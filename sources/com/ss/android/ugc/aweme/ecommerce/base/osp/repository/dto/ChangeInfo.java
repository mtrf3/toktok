package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class ChangeInfo extends F9E implements Serializable {

    @InterfaceC65349Pkn("change_type")
    public final int billInfoChangeType;

    public static /* synthetic */ ChangeInfo copy$default(ChangeInfo changeInfo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = changeInfo.billInfoChangeType;
        }
        return changeInfo.copy(i);
    }

    public final ChangeInfo copy(int i) {
        return new ChangeInfo(i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.billInfoChangeType)};
    }

    public final int getBillInfoChangeType() {
        return this.billInfoChangeType;
    }

    public ChangeInfo(int i) {
        this.billInfoChangeType = i;
    }
}
