package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Error;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.SaveData;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ame, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27244Ame extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public final /* synthetic */ SaveData LJLIL;
    public final /* synthetic */ AddressEditViewModel LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27244Ame(SaveData saveData, AddressEditViewModel addressEditViewModel, long j) {
        super(1);
        this.LJLIL = saveData;
        this.LJLILLLLZI = addressEditViewModel;
        this.LJLJI = j;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        Object obj;
        LaneParams logNode = laneParams;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("is_success", 0);
        List<Error> list = this.LJLIL.errors;
        ArrayList arrayList = new ArrayList();
        Iterator<Error> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next().key;
            if (str != null) {
                arrayList.add(str);
            }
        }
        String str2 = null;
        logNode.plusAssign("fail_reason", ORZ.LLD(arrayList, ",", null, null, C27304Anc.LJLIL, 30));
        String str3 = "1";
        if (this.LJLILLLLZI.LLILIL) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        logNode.plusAssign("is_with_tip", obj);
        AddressPageStarter.AddressEditEnterParams addressEditEnterParams = this.LJLILLLLZI.LJZ;
        Object obj2 = null;
        if (addressEditEnterParams != null) {
            str2 = addressEditEnterParams.pdpFrom;
        }
        logNode.plusAssign("pdp_from", str2);
        logNode.plusAssign("update_address_format_select", this.LJLILLLLZI.LLIZ);
        logNode.plusAssign("duration", Long.valueOf(this.LJLJI));
        logNode.plusAssign("address_result", this.LJLILLLLZI.LLIIIILZ);
        logNode.plusAssign("is_all_filled", Integer.valueOf(this.LJLILLLLZI.Vv0()));
        HashMap<String, Object> hashMap = this.LJLILLLLZI.LJLLLL;
        if (hashMap != null) {
            obj2 = hashMap.get("previous_page");
        }
        logNode.plusAssign("previous_page", obj2);
        if (!this.LJLILLLLZI.LLJILJILJ) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        logNode.plusAssign("is_fullscreen", str3);
        return C76800UCe.LIZ;
    }
}
