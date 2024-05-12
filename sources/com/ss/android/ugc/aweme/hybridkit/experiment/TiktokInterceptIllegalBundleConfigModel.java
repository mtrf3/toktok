package com.ss.android.ugc.aweme.hybridkit.experiment;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TiktokInterceptIllegalBundleConfigModel {

    @InterfaceC65349Pkn("enable_intercept")
    public final boolean enableIntercept;

    @InterfaceC65349Pkn("enable_report")
    public final boolean enableReport;

    @InterfaceC65349Pkn("illegalBundleWords")
    public final List<String> illegalBundleWords;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TiktokInterceptIllegalBundleConfigModel)) {
            return false;
        }
        TiktokInterceptIllegalBundleConfigModel tiktokInterceptIllegalBundleConfigModel = (TiktokInterceptIllegalBundleConfigModel) obj;
        return this.enableIntercept == tiktokInterceptIllegalBundleConfigModel.enableIntercept && this.enableReport == tiktokInterceptIllegalBundleConfigModel.enableReport && o.LJ(this.illegalBundleWords, tiktokInterceptIllegalBundleConfigModel.illegalBundleWords);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final int hashCode() {
        boolean z = this.enableIntercept;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = ((r0 * 31) + (this.enableReport ? 1 : 0)) * 31;
        List<String> list = this.illegalBundleWords;
        return i + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TiktokInterceptIllegalBundleConfigModel(enableIntercept=");
        LIZ.append(this.enableIntercept);
        LIZ.append(", enableReport=");
        LIZ.append(this.enableReport);
        LIZ.append(", illegalBundleWords=");
        return C1NE.LIZIZ(LIZ, this.illegalBundleWords, ')', LIZ);
    }

    public TiktokInterceptIllegalBundleConfigModel(boolean z, boolean z2, List<String> list) {
        this.enableIntercept = z;
        this.enableReport = z2;
        this.illegalBundleWords = list;
    }
}
