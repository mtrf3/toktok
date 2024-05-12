package com.ss.android.ugc.aweme.plugin.realtimefeedbackexperiment;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;

/* loaded from: classes7.dex */
public final class RealtimeFeedbackSettings {
    public static final RealtimeFeedbackModel LIZ = new RealtimeFeedbackModel(1, false);

    /* loaded from: classes7.dex */
    public static final class RealtimeFeedbackModel {

        @InterfaceC65349Pkn("is_server_config")
        public final boolean isServerConfig;

        @InterfaceC65349Pkn("should_upload")
        public final int shouldUpload;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RealtimeFeedbackModel)) {
                return false;
            }
            RealtimeFeedbackModel realtimeFeedbackModel = (RealtimeFeedbackModel) obj;
            return this.shouldUpload == realtimeFeedbackModel.shouldUpload && this.isServerConfig == realtimeFeedbackModel.isServerConfig;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int i = this.shouldUpload * 31;
            boolean z = this.isServerConfig;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            return i + i2;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RealtimeFeedbackModel(shouldUpload=");
            LIZ.append(this.shouldUpload);
            LIZ.append(", isServerConfig=");
            return C48339Iy7.LIZJ(LIZ, this.isServerConfig, ')', LIZ);
        }

        public RealtimeFeedbackModel(int i, boolean z) {
            this.shouldUpload = i;
            this.isServerConfig = z;
        }
    }
}
