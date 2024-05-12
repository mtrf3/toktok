package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;

/* loaded from: classes2.dex */
public class CommitRemarkNameResponse {

    @InterfaceC65349Pkn("remark_name")
    public String remarkName;

    @InterfaceC65349Pkn("status_code")
    public int statusCode;

    @InterfaceC65349Pkn("status_msg")
    public String statusMsg;

    public boolean isOK() {
        if (this.statusCode == 0) {
            return true;
        }
        return false;
    }
}
