package com.ss.android.ugc.aweme.im.sdk.activitystatus.data.api;

import X.AbstractC73638SvC;
import X.E4Q;
import X.E4T;
import X.InterfaceC195757mF;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import X.InterfaceC65349Pkn;
import X.InterfaceC67352kd;
import X.V0N;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public interface ActivityStatusAPI {

    /* loaded from: classes2.dex */
    public enum StatusCode {
        SERVER_ERROR,
        INVALID_PARAM;

        public static StatusCode valueOf(String str) {
            return (StatusCode) V0N.LJJJ(StatusCode.class, str);
        }
    }

    @E4Q("activity_status/fetch_contacts")
    Object getMUFActivityStatues(@InterfaceC64989Pez("scene") String str, InterfaceC67352kd<? super Result> interfaceC67352kd);

    @E4Q("activity_status/fetch")
    AbstractC73638SvC<Result> getStatuses(@InterfaceC64989Pez("friends_list") String str, @InterfaceC64989Pez("scene") String str2);

    @InterfaceC195757mF
    @E4T("activity_status/report")
    AbstractC73638SvC<Result> reportStatus(@InterfaceC64987Pex("scene") String str, @InterfaceC64987Pex("type") Integer num);

    /* loaded from: classes2.dex */
    public static final class Result extends BaseResponse {

        @InterfaceC65349Pkn("activity_status")
        public final List<ActivityStatus> activityStatuses;

        @InterfaceC65349Pkn("log_pb")
        public final LogPbBean logPB;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Result)) {
                return false;
            }
            Result result = (Result) obj;
            return o.LJ(this.activityStatuses, result.activityStatuses) && o.LJ(this.logPB, result.logPB);
        }

        public final int hashCode() {
            List<ActivityStatus> list = this.activityStatuses;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            LogPbBean logPbBean = this.logPB;
            return hashCode + (logPbBean != null ? logPbBean.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Result(activityStatuses=");
            LIZ.append(this.activityStatuses);
            LIZ.append(", logPB=");
            LIZ.append(this.logPB);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public Result(List<ActivityStatus> list, LogPbBean logPbBean) {
            this.activityStatuses = list;
            this.logPB = logPbBean;
        }
    }
}
