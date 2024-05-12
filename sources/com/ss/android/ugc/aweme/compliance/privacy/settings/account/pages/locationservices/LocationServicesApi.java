package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices;

import X.AbstractC73672Svk;
import X.C74822wg;
import X.E4T;
import X.InterfaceC195727mC;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.b0;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public interface LocationServicesApi {
    public static final C74822wg LIZ = C74822wg.LIZ;

    @E4T("/tiktok/location/delete/")
    AbstractC73672Svk<DeleteLocationHistoryResponse> deleteLocationHistory(@InterfaceC195727mC DeleteLocationHistoryBody deleteLocationHistoryBody);

    /* loaded from: classes2.dex */
    public static final class DeleteLocationHistoryBody {

        @InterfaceC65349Pkn("delete_coarse")
        public final int delete_coarse;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeleteLocationHistoryBody) && this.delete_coarse == ((DeleteLocationHistoryBody) obj).delete_coarse;
        }

        public final int hashCode() {
            return this.delete_coarse;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DeleteLocationHistoryBody(delete_coarse=");
            return b0.LIZJ(LIZ, this.delete_coarse, ')', LIZ);
        }

        public DeleteLocationHistoryBody(int i) {
            this.delete_coarse = i;
        }
    }

    /* loaded from: classes2.dex */
    public static final class DeleteLocationHistoryResponse extends BaseResponse {

        @InterfaceC65349Pkn("data")
        public final String data;

        @InterfaceC65349Pkn("err_no")
        public final Integer resultCode;

        @InterfaceC65349Pkn("err_msg")
        public final String resultMessage;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeleteLocationHistoryResponse)) {
                return false;
            }
            DeleteLocationHistoryResponse deleteLocationHistoryResponse = (DeleteLocationHistoryResponse) obj;
            return o.LJ(this.resultCode, deleteLocationHistoryResponse.resultCode) && o.LJ(this.resultMessage, deleteLocationHistoryResponse.resultMessage) && o.LJ(this.data, deleteLocationHistoryResponse.data);
        }

        public final int hashCode() {
            Integer num = this.resultCode;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.resultMessage;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.data;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DeleteLocationHistoryResponse(resultCode=");
            LIZ.append(this.resultCode);
            LIZ.append(", resultMessage=");
            LIZ.append(this.resultMessage);
            LIZ.append(", data=");
            return q.LIZIZ(LIZ, this.data, ')', LIZ);
        }

        public DeleteLocationHistoryResponse(Integer num, String str, String str2) {
            this.resultCode = num;
            this.resultMessage = str;
            this.data = str2;
        }
    }
}
