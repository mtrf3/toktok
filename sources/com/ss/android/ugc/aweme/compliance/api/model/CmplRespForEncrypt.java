package com.ss.android.ugc.aweme.compliance.api.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CmplRespForEncrypt extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("cmpl_enc")
    public final String complianceEncrypt;

    @InterfaceC65349Pkn("log_pb")
    public final LogPbBean logPb;

    /* JADX WARN: Multi-variable type inference failed */
    public CmplRespForEncrypt() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CmplRespForEncrypt copy$default(CmplRespForEncrypt cmplRespForEncrypt, String str, LogPbBean logPbBean, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cmplRespForEncrypt.complianceEncrypt;
        }
        if ((i & 2) != 0) {
            logPbBean = cmplRespForEncrypt.logPb;
        }
        return cmplRespForEncrypt.copy(str, logPbBean);
    }

    public final CmplRespForEncrypt copy(String str, LogPbBean logPbBean) {
        return new CmplRespForEncrypt(str, logPbBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CmplRespForEncrypt)) {
            return false;
        }
        CmplRespForEncrypt cmplRespForEncrypt = (CmplRespForEncrypt) obj;
        return o.LJ(this.complianceEncrypt, cmplRespForEncrypt.complianceEncrypt) && o.LJ(this.logPb, cmplRespForEncrypt.logPb);
    }

    public int hashCode() {
        String str = this.complianceEncrypt;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        LogPbBean logPbBean = this.logPb;
        return hashCode + (logPbBean != null ? logPbBean.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CmplRespForEncrypt(complianceEncrypt=");
        LIZ.append(this.complianceEncrypt);
        LIZ.append(", logPb=");
        LIZ.append(this.logPb);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getComplianceEncrypt() {
        return this.complianceEncrypt;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public CmplRespForEncrypt(String str, LogPbBean logPbBean) {
        this.complianceEncrypt = str;
        this.logPb = logPbBean;
    }

    public /* synthetic */ CmplRespForEncrypt(String str, LogPbBean logPbBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : logPbBean);
    }
}
