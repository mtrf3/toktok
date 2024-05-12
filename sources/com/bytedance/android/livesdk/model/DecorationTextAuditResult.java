package com.bytedance.android.livesdk.model;

import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class DecorationTextAuditResult {

    @InterfaceC65349Pkn("audit_nopass_warn")
    public String auditNotPassWarnText;

    @InterfaceC65349Pkn("audit_status")
    public int auditStatus;

    public String getAuditNotPassWarnText() {
        return this.auditNotPassWarnText;
    }

    public int getAuditStatus() {
        return this.auditStatus;
    }

    public void setAuditNotPassWarnText(String str) {
        this.auditNotPassWarnText = str;
    }

    public void setAuditStatus(int i) {
        this.auditStatus = i;
    }
}
