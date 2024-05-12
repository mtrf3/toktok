package com.ss.android.ugc.aweme.compliance.protection.perception;

import X.AbstractC73672Svk;
import X.C1NE;
import X.C77800Ug8;
import X.E4Q;
import X.EFJ;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UserPerceptionApiManager {
    public static final UserPerceptionApi LIZ;

    /* loaded from: classes2.dex */
    public interface UserPerceptionApi {
        @E4Q("tiktok/v1/user_perception/popup/")
        AbstractC73672Svk<UserPerceptionPopupResponse> getUserPerceptionPopup();
    }

    /* loaded from: classes2.dex */
    public static final class UserPerceptionPopupResponse extends BaseResponse {

        @InterfaceC65349Pkn("popup_list")
        public final List<PerceptionPopup> popupList;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserPerceptionPopupResponse) && o.LJ(this.popupList, ((UserPerceptionPopupResponse) obj).popupList);
        }

        public final int hashCode() {
            List<PerceptionPopup> list = this.popupList;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("UserPerceptionPopupResponse(popupList=");
            return C1NE.LIZIZ(LIZ, this.popupList, ')', LIZ);
        }

        public UserPerceptionPopupResponse(List<PerceptionPopup> list) {
            this.popupList = list;
        }
    }

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZ = (UserPerceptionApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, UserPerceptionApi.class);
    }
}
