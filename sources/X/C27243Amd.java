package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ChangeOrderShippingAddressResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Error;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Amd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27243Amd extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ ChangeOrderShippingAddressResponseData LJLILLLLZI;
    public final /* synthetic */ AddressEditViewModel LJLJI;
    public final /* synthetic */ long LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27243Amd(boolean z, ChangeOrderShippingAddressResponseData changeOrderShippingAddressResponseData, AddressEditViewModel addressEditViewModel, long j) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = changeOrderShippingAddressResponseData;
        this.LJLJI = addressEditViewModel;
        this.LJLJJI = j;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        String str;
        Object obj;
        String str2;
        List<Error> list;
        LaneParams logNode = laneParams;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("is_success", Integer.valueOf(this.LJLIL ? 1 : 0));
        ChangeOrderShippingAddressResponseData changeOrderShippingAddressResponseData = this.LJLILLLLZI;
        Object obj2 = null;
        if (changeOrderShippingAddressResponseData != null && (list = changeOrderShippingAddressResponseData.errors) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<Error> it = list.iterator();
            while (it.hasNext()) {
                String str3 = it.next().key;
                if (str3 != null) {
                    arrayList.add(str3);
                }
            }
            str = ORZ.LLD(arrayList, ",", null, null, C27302Ana.LJLIL, 30);
        } else {
            str = null;
        }
        logNode.plusAssign("fail_reason", str);
        String str4 = "1";
        if (this.LJLJI.LLILIL) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        logNode.plusAssign("is_with_tip", obj);
        AddressPageStarter.AddressEditEnterParams addressEditEnterParams = this.LJLJI.LJZ;
        if (addressEditEnterParams != null) {
            str2 = addressEditEnterParams.pdpFrom;
        } else {
            str2 = null;
        }
        logNode.plusAssign("pdp_from", str2);
        logNode.plusAssign("update_address_format_select", this.LJLJI.LLIZ);
        logNode.plusAssign("duration", Long.valueOf(this.LJLJJI));
        logNode.plusAssign("address_result", this.LJLJI.LLIIIILZ);
        logNode.plusAssign("is_all_filled", Integer.valueOf(this.LJLJI.Vv0()));
        HashMap<String, Object> hashMap = this.LJLJI.LJLLLL;
        if (hashMap != null) {
            obj2 = hashMap.get("previous_page");
        }
        logNode.plusAssign("previous_page", obj2);
        logNode.plusAssign("fill_type", "edit");
        if (!this.LJLJI.LLJILJILJ) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        logNode.plusAssign("is_fullscreen", str4);
        return C76800UCe.LIZ;
    }
}
