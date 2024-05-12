package com.ss.android.ugc.aweme.editpost;

import X.C79062V1e;
import X.HH1;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class EditPostResponse implements Serializable {

    @InterfaceC65349Pkn("biz_err_code")
    public final int bizErrorCode;

    @InterfaceC65349Pkn("edit_diff")
    public final EditDiffMessage editDiffMessage;

    @InterfaceC65349Pkn("error_msg")
    public final String errorMsg;

    @InterfaceC65349Pkn("local_cover_path")
    public String localCoverPath;

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    @InterfaceC65349Pkn("status_msg")
    public final String statusMsg;

    public static /* synthetic */ EditPostResponse copy$default(EditPostResponse editPostResponse, int i, String str, String str2, EditDiffMessage editDiffMessage, int i2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = editPostResponse.statusCode;
        }
        if ((i3 & 2) != 0) {
            str = editPostResponse.statusMsg;
        }
        if ((i3 & 4) != 0) {
            str2 = editPostResponse.errorMsg;
        }
        if ((i3 & 8) != 0) {
            editDiffMessage = editPostResponse.editDiffMessage;
        }
        if ((i3 & 16) != 0) {
            i2 = editPostResponse.bizErrorCode;
        }
        if ((i3 & 32) != 0) {
            str3 = editPostResponse.localCoverPath;
        }
        return editPostResponse.copy(i, str, str2, editDiffMessage, i2, str3);
    }

    public final EditPostResponse copy(int i, String statusMsg, String errorMsg, EditDiffMessage editDiffMessage, int i2, String localCoverPath) {
        o.LJIIIZ(statusMsg, "statusMsg");
        o.LJIIIZ(errorMsg, "errorMsg");
        o.LJIIIZ(localCoverPath, "localCoverPath");
        return new EditPostResponse(i, statusMsg, errorMsg, editDiffMessage, i2, localCoverPath);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditPostResponse)) {
            return false;
        }
        EditPostResponse editPostResponse = (EditPostResponse) obj;
        return this.statusCode == editPostResponse.statusCode && o.LJ(this.statusMsg, editPostResponse.statusMsg) && o.LJ(this.errorMsg, editPostResponse.errorMsg) && o.LJ(this.editDiffMessage, editPostResponse.editDiffMessage) && this.bizErrorCode == editPostResponse.bizErrorCode && o.LJ(this.localCoverPath, editPostResponse.localCoverPath);
    }

    public int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.errorMsg, C79062V1e.LJ(this.statusMsg, this.statusCode * 31, 31), 31);
        EditDiffMessage editDiffMessage = this.editDiffMessage;
        if (editDiffMessage == null) {
            hashCode = 0;
        } else {
            hashCode = editDiffMessage.hashCode();
        }
        return this.localCoverPath.hashCode() + ((((LJ + hashCode) * 31) + this.bizErrorCode) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditPostResponse(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", statusMsg=");
        LIZ.append(this.statusMsg);
        LIZ.append(", errorMsg=");
        LIZ.append(this.errorMsg);
        LIZ.append(", editDiffMessage=");
        LIZ.append(this.editDiffMessage);
        LIZ.append(", bizErrorCode=");
        LIZ.append(this.bizErrorCode);
        LIZ.append(", localCoverPath=");
        return q.LIZIZ(LIZ, this.localCoverPath, ')', LIZ);
    }

    public final int getBizErrorCode() {
        return this.bizErrorCode;
    }

    public final EditDiffMessage getEditDiffMessage() {
        return this.editDiffMessage;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final String getLocalCoverPath() {
        return this.localCoverPath;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final void setLocalCoverPath(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.localCoverPath = str;
    }

    public EditPostResponse(int i, String str, String str2, EditDiffMessage editDiffMessage, int i2, String str3) {
        HH1.LIZ(str, "statusMsg", str2, "errorMsg", str3, "localCoverPath");
        this.statusCode = i;
        this.statusMsg = str;
        this.errorMsg = str2;
        this.editDiffMessage = editDiffMessage;
        this.bizErrorCode = i2;
        this.localCoverPath = str3;
    }

    public /* synthetic */ EditPostResponse(int i, String str, String str2, EditDiffMessage editDiffMessage, int i2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? null : editDiffMessage, (i3 & 16) != 0 ? -1 : i2, (i3 & 32) == 0 ? str3 : "");
    }
}
