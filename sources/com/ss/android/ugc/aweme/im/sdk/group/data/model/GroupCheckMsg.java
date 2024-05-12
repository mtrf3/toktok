package com.ss.android.ugc.aweme.im.sdk.group.data.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class GroupCheckMsg implements Serializable {

    @InterfaceC65349Pkn("invalid_members")
    public List<Long> invalidMembers;

    @InterfaceC65349Pkn("status_code")
    public Integer statusCode;

    @InterfaceC65349Pkn("status_msg")
    public String statusMsg;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GroupCheckMsg(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", statusMsg=");
        LIZ.append(this.statusMsg);
        LIZ.append(", invalidMembers=");
        return C1NE.LIZIZ(LIZ, this.invalidMembers, ')', LIZ);
    }

    public final List<Long> getInvalidMembers() {
        return this.invalidMembers;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final void setInvalidMembers(List<Long> list) {
        this.invalidMembers = list;
    }

    public final void setStatusCode(Integer num) {
        this.statusCode = num;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }
}
