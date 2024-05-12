package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C26648Ad2;
import X.C26895Ah1;
import X.C76732zl;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.ORZ;
import android.content.Context;
import android.text.SpannableStringBuilder;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressListData;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListState;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.shipping.UsShippingVH;
import java.util.List;

/* loaded from: classes5.dex */
public class AqS30S0301000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS30S0301000_4 aqS30S0301000_4, Object obj) {
        String selectAddressId;
        Integer num;
        ReachableAddress reachableAddress;
        Address address;
        AddressListState setState = (AddressListState) obj;
        o.LJIIIZ(setState, "$this$setState");
        List<Object> Pv0 = ((AddressListViewModel) aqS30S0301000_4.l0).Pv0((AddressListData) aqS30S0301000_4.l1);
        C26648Ad2 c26648Ad2 = new C26648Ad2(((AddressListData) aqS30S0301000_4.l1).privacyPolicyStatement, ((AddressListViewModel) aqS30S0301000_4.l0).Nv0());
        C26895Ah1 c26895Ah1 = new C26895Ah1(aqS30S0301000_4.i3, ((C76732zl) aqS30S0301000_4.l2).element);
        AddressListViewModel addressListViewModel = (AddressListViewModel) aqS30S0301000_4.l0;
        List<ReachableAddress> list = ((AddressListData) aqS30S0301000_4.l1).addressList;
        addressListViewModel.getClass();
        if (list == null || list.isEmpty() || (num = addressListViewModel.LJZ) == null || num.intValue() != 4 || list == null || (reachableAddress = (ReachableAddress) ORZ.LJLLLLLL(0, list)) == null || (address = reachableAddress.address) == null || (selectAddressId = address.id) == null) {
            selectAddressId = setState.getSelectAddressId();
        }
        return AddressListState.copy$default(setState, 0, Pv0, selectAddressId, c26648Ad2, c26895Ah1, 1, null);
    }

    public static final Object invoke$1(AqS30S0301000_4 aqS30S0301000_4, Object obj) {
        TuxTextView setText = (TuxTextView) obj;
        o.LJIIIZ(setText, "$this$setText");
        setText.setTuxFont(aqS30S0301000_4.i3);
        setText.setText((SpannableStringBuilder) aqS30S0301000_4.l0);
        LinkRichText linkRichText = (LinkRichText) aqS30S0301000_4.l1;
        Context context = ((UsShippingVH) aqS30S0301000_4.l2).itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        setText.setTextColor(linkRichText.LIZ(context));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS30S0301000_4(int i, SpannableStringBuilder spannableStringBuilder, LinkRichText linkRichText, UsShippingVH usShippingVH, int i2) {
        super(1);
        this.$t = i2;
        this.i3 = i;
        this.l0 = spannableStringBuilder;
        this.l1 = linkRichText;
        this.l2 = usShippingVH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS30S0301000_4(AddressListViewModel addressListViewModel, AddressListData addressListData, int i, C76732zl c76732zl, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = addressListViewModel;
        this.l1 = addressListData;
        this.i3 = i;
        this.l2 = c76732zl;
    }
}
