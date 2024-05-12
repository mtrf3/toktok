package com.ss.android.ugc.aweme.editpost;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes8.dex */
public final class EditPostBizPermissionStruct extends F9E implements Serializable {

    @InterfaceC65349Pkn("biz_status")
    public int bizStatus;

    @InterfaceC65349Pkn("biz_type")
    public int bizType;

    public EditPostBizPermissionStruct() {
    }

    public static /* synthetic */ EditPostBizPermissionStruct copy$default(EditPostBizPermissionStruct editPostBizPermissionStruct, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = editPostBizPermissionStruct.bizType;
        }
        if ((i3 & 2) != 0) {
            i2 = editPostBizPermissionStruct.bizStatus;
        }
        return editPostBizPermissionStruct.copy(i, i2);
    }

    public final EditPostBizPermissionStruct copy(int i, int i2) {
        return new EditPostBizPermissionStruct(i, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.bizType), Integer.valueOf(this.bizStatus)};
    }

    public final int getBizStatus() {
        return this.bizStatus;
    }

    public final int getBizType() {
        return this.bizType;
    }

    public EditPostBizPermissionStruct(int i, int i2) {
        this.bizType = i;
        this.bizStatus = i2;
    }
}
