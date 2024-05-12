package com.ss.android.ugc.aweme.editpost;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EditDiffMessage implements Serializable {

    @InterfaceC65349Pkn("aweme_id")
    public final String aid;

    @InterfaceC65349Pkn("edit_id")
    public final String editId;

    @InterfaceC65349Pkn("edit_post_permission")
    public final EditPostPermission permission;

    /* JADX WARN: Multi-variable type inference failed */
    public EditDiffMessage() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EditDiffMessage copy$default(EditDiffMessage editDiffMessage, String str, String str2, EditPostPermission editPostPermission, int i, Object obj) {
        if ((i & 1) != 0) {
            str = editDiffMessage.aid;
        }
        if ((i & 2) != 0) {
            str2 = editDiffMessage.editId;
        }
        if ((i & 4) != 0) {
            editPostPermission = editDiffMessage.permission;
        }
        return editDiffMessage.copy(str, str2, editPostPermission);
    }

    public final EditDiffMessage copy(String aid, String editId, EditPostPermission editPostPermission) {
        o.LJIIIZ(aid, "aid");
        o.LJIIIZ(editId, "editId");
        return new EditDiffMessage(aid, editId, editPostPermission);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditDiffMessage)) {
            return false;
        }
        EditDiffMessage editDiffMessage = (EditDiffMessage) obj;
        return o.LJ(this.aid, editDiffMessage.aid) && o.LJ(this.editId, editDiffMessage.editId) && o.LJ(this.permission, editDiffMessage.permission);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditDiffMessage(aid=");
        LIZ.append(this.aid);
        LIZ.append(", editId=");
        LIZ.append(this.editId);
        LIZ.append(", permission=");
        LIZ.append(this.permission);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.editId, this.aid.hashCode() * 31, 31);
        EditPostPermission editPostPermission = this.permission;
        if (editPostPermission == null) {
            hashCode = 0;
        } else {
            hashCode = editPostPermission.hashCode();
        }
        return LJ + hashCode;
    }

    public final String getAid() {
        return this.aid;
    }

    public final String getEditId() {
        return this.editId;
    }

    public final EditPostPermission getPermission() {
        return this.permission;
    }

    public EditDiffMessage(String aid, String editId, EditPostPermission editPostPermission) {
        o.LJIIIZ(aid, "aid");
        o.LJIIIZ(editId, "editId");
        this.aid = aid;
        this.editId = editId;
        this.permission = editPostPermission;
    }

    public /* synthetic */ EditDiffMessage(String str, String str2, EditPostPermission editPostPermission, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : editPostPermission);
    }
}
