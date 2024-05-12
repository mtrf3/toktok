package com.ss.android.ugc.aweme.ad.feed.ibe.setting;

import X.C16880lQ;
import X.C47135Ieh;
import X.InterfaceC65349Pkn;
import X.X1D;

/* loaded from: classes9.dex */
public final class IBELoadRetryConfigSettings {
    public static final IbeLoadRetryConfigModel LIZ = new IbeLoadRetryConfigModel(3000, 3);

    /* loaded from: classes9.dex */
    public static final class IbeLoadRetryConfigModel {

        @InterfaceC65349Pkn("load_timeout_ms")
        public final long loadTimeoutMS;

        @InterfaceC65349Pkn("retry_count")
        public final long retryCount;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IbeLoadRetryConfigModel)) {
                return false;
            }
            IbeLoadRetryConfigModel ibeLoadRetryConfigModel = (IbeLoadRetryConfigModel) obj;
            return this.loadTimeoutMS == ibeLoadRetryConfigModel.loadTimeoutMS && this.retryCount == ibeLoadRetryConfigModel.retryCount;
        }

        public final int hashCode() {
            return C16880lQ.LLJIJIL(this.retryCount) + (C16880lQ.LLJIJIL(this.loadTimeoutMS) * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("IbeLoadRetryConfigModel(loadTimeoutMS=");
            LIZ.append(this.loadTimeoutMS);
            LIZ.append(", retryCount=");
            return C47135Ieh.LIZIZ(LIZ, this.retryCount, ')', LIZ);
        }

        public IbeLoadRetryConfigModel(long j, long j2) {
            this.loadTimeoutMS = j;
            this.retryCount = j2;
        }
    }
}
