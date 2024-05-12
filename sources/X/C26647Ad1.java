package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClaimIncentiveWithAddressResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.NoticeDialogMessage;

/* renamed from: X.Ad1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26647Ad1<T> implements InterfaceC64592gB {
    public static final C26647Ad1<T> LJLIL = new C26647Ad1<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        ClaimIncentiveWithAddressResponseData claimIncentiveWithAddressResponseData;
        Integer num;
        NoticeDialogMessage noticeDialogMessage;
        Response response = (Response) ((C64797Pbt) obj).LIZIZ;
        ClaimIncentiveWithAddressResponseData claimIncentiveWithAddressResponseData2 = (ClaimIncentiveWithAddressResponseData) response.data;
        if (claimIncentiveWithAddressResponseData2 != null && (noticeDialogMessage = claimIncentiveWithAddressResponseData2.noticeDialogMessage) != null) {
            C26059AKp.LIZ().LIZ("ec_show_notice_dialog", C27739Aud.LJI(noticeDialogMessage));
        }
        if (!response.isCodeOK() || (claimIncentiveWithAddressResponseData = (ClaimIncentiveWithAddressResponseData) response.data) == null || (num = claimIncentiveWithAddressResponseData.resultCode) == null || num.intValue() != 0) {
            return;
        }
        C26059AKp.LIZ().LIZ("lucky_bag_address_confirmed", "{}");
    }
}
