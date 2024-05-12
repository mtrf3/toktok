package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddressListData {

    @InterfaceC65349Pkn("shipping_address_list")
    public final List<ReachableAddress> addressList;

    @InterfaceC65349Pkn("address_num_threshold")
    public final Integer addressThreshold;

    @InterfaceC65349Pkn("change_hint_msg")
    public final String changeHintMsg;

    @InterfaceC65349Pkn("incentive_notice_dialog")
    public final NoticeDialogMessage noticeDialogMessage;

    @InterfaceC65349Pkn("privacy_policy_statement")
    public final LinkRichText privacyPolicyStatement;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressListData)) {
            return false;
        }
        AddressListData addressListData = (AddressListData) obj;
        return o.LJ(this.changeHintMsg, addressListData.changeHintMsg) && o.LJ(this.addressList, addressListData.addressList) && o.LJ(this.privacyPolicyStatement, addressListData.privacyPolicyStatement) && o.LJ(this.noticeDialogMessage, addressListData.noticeDialogMessage) && o.LJ(this.addressThreshold, addressListData.addressThreshold);
    }

    public final int hashCode() {
        String str = this.changeHintMsg;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ReachableAddress> list = this.addressList;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        LinkRichText linkRichText = this.privacyPolicyStatement;
        int hashCode3 = (hashCode2 + (linkRichText == null ? 0 : linkRichText.hashCode())) * 31;
        NoticeDialogMessage noticeDialogMessage = this.noticeDialogMessage;
        int hashCode4 = (hashCode3 + (noticeDialogMessage == null ? 0 : noticeDialogMessage.hashCode())) * 31;
        Integer num = this.addressThreshold;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddressListData(changeHintMsg=");
        LIZ.append(this.changeHintMsg);
        LIZ.append(", addressList=");
        LIZ.append(this.addressList);
        LIZ.append(", privacyPolicyStatement=");
        LIZ.append(this.privacyPolicyStatement);
        LIZ.append(", noticeDialogMessage=");
        LIZ.append(this.noticeDialogMessage);
        LIZ.append(", addressThreshold=");
        return s0.LIZJ(LIZ, this.addressThreshold, ')', LIZ);
    }

    public AddressListData(String str, List<ReachableAddress> list, LinkRichText linkRichText, NoticeDialogMessage noticeDialogMessage, Integer num) {
        this.changeHintMsg = str;
        this.addressList = list;
        this.privacyPolicyStatement = linkRichText;
        this.noticeDialogMessage = noticeDialogMessage;
        this.addressThreshold = num;
    }
}
