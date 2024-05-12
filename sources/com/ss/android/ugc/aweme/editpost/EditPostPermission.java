package com.ss.android.ugc.aweme.editpost;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EditPostPermission implements Serializable {

    @InterfaceC65349Pkn("biz_permissions")
    public List<EditPostBizPermissionStruct> bizPermission;

    /* JADX WARN: Multi-variable type inference failed */
    public EditPostPermission() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditPostPermission copy$default(EditPostPermission editPostPermission, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = editPostPermission.bizPermission;
        }
        return editPostPermission.copy(list);
    }

    public final EditPostPermission copy(List<EditPostBizPermissionStruct> list) {
        return new EditPostPermission(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EditPostPermission) && o.LJ(this.bizPermission, ((EditPostPermission) obj).bizPermission);
    }

    public int hashCode() {
        List<EditPostBizPermissionStruct> list = this.bizPermission;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditPostPermission(bizPermission=");
        return C1NE.LIZIZ(LIZ, this.bizPermission, ')', LIZ);
    }

    public final List<EditPostBizPermissionStruct> getBizPermission() {
        return this.bizPermission;
    }

    public EditPostPermission(List<EditPostBizPermissionStruct> list) {
        this.bizPermission = list;
    }

    public /* synthetic */ EditPostPermission(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
