package com.ss.android.ugc.aweme.personalized;

import X.AbstractC73672Svk;
import X.C1NE;
import X.E8M;
import X.InterfaceC195727mC;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public interface ReportHybridABApi {
    @E8M("/tiktok/v1/report/hybridab/")
    AbstractC73672Svk<ReportHybridABResponse> reportHybridAB(@InterfaceC195727mC ReportHybridABRequest reportHybridABRequest);

    /* loaded from: classes7.dex */
    public static final class HybridABExperimentInfo {

        @InterfaceC65349Pkn("experiment_name_id")
        public final int experimentNameId;

        @InterfaceC65349Pkn("vid")
        public final String vid;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HybridABExperimentInfo)) {
                return false;
            }
            HybridABExperimentInfo hybridABExperimentInfo = (HybridABExperimentInfo) obj;
            return this.experimentNameId == hybridABExperimentInfo.experimentNameId && o.LJ(this.vid, hybridABExperimentInfo.vid);
        }

        public final int hashCode() {
            return this.vid.hashCode() + (this.experimentNameId * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HybridABExperimentInfo(experimentNameId=");
            LIZ.append(this.experimentNameId);
            LIZ.append(", vid=");
            return q.LIZIZ(LIZ, this.vid, ')', LIZ);
        }

        public HybridABExperimentInfo(int i, String vid) {
            o.LJIIIZ(vid, "vid");
            this.experimentNameId = i;
            this.vid = vid;
        }
    }

    /* loaded from: classes7.dex */
    public static final class HybridABExperimentInfoHandleResult {

        @InterfaceC65349Pkn("experiment_name_id")
        public final int experimentNameId;

        @InterfaceC65349Pkn("failure_reason")
        public final String failureReason;

        @InterfaceC65349Pkn("is_successful")
        public final boolean isSuccessful;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HybridABExperimentInfoHandleResult)) {
                return false;
            }
            HybridABExperimentInfoHandleResult hybridABExperimentInfoHandleResult = (HybridABExperimentInfoHandleResult) obj;
            return this.experimentNameId == hybridABExperimentInfoHandleResult.experimentNameId && this.isSuccessful == hybridABExperimentInfoHandleResult.isSuccessful && o.LJ(this.failureReason, hybridABExperimentInfoHandleResult.failureReason);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int i = this.experimentNameId * 31;
            boolean z = this.isSuccessful;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            int i3 = (i + i2) * 31;
            String str = this.failureReason;
            return i3 + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HybridABExperimentInfoHandleResult(experimentNameId=");
            LIZ.append(this.experimentNameId);
            LIZ.append(", isSuccessful=");
            LIZ.append(this.isSuccessful);
            LIZ.append(", failureReason=");
            return q.LIZIZ(LIZ, this.failureReason, ')', LIZ);
        }

        public HybridABExperimentInfoHandleResult(int i, boolean z, String str) {
            this.experimentNameId = i;
            this.isSuccessful = z;
            this.failureReason = str;
        }
    }

    /* loaded from: classes2.dex */
    public static final class ReportHybridABRequest {

        @InterfaceC65349Pkn("hybridab_experiment_info")
        public final List<HybridABExperimentInfo> hybridABExperimentInfo;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReportHybridABRequest) && o.LJ(this.hybridABExperimentInfo, ((ReportHybridABRequest) obj).hybridABExperimentInfo);
        }

        public final int hashCode() {
            return this.hybridABExperimentInfo.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ReportHybridABRequest(hybridABExperimentInfo=");
            return C1NE.LIZIZ(LIZ, this.hybridABExperimentInfo, ')', LIZ);
        }

        public ReportHybridABRequest(List<HybridABExperimentInfo> hybridABExperimentInfo) {
            o.LJIIIZ(hybridABExperimentInfo, "hybridABExperimentInfo");
            this.hybridABExperimentInfo = hybridABExperimentInfo;
        }
    }

    /* loaded from: classes7.dex */
    public static final class ReportHybridABResponse {

        @InterfaceC65349Pkn("result")
        public final HybridABExperimentInfoHandleResult[] result;

        @InterfaceC65349Pkn("status_code")
        public final int statusCode;

        @InterfaceC65349Pkn("status_msg")
        public final String statusMessage;

        public ReportHybridABResponse(HybridABExperimentInfoHandleResult[] hybridABExperimentInfoHandleResultArr, int i, String str) {
            this.result = hybridABExperimentInfoHandleResultArr;
            this.statusCode = i;
            this.statusMessage = str;
        }
    }
}
