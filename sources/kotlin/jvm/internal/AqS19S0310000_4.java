package kotlin.jvm.internal;

import X.A37;
import X.AbstractC65781Prl;
import X.C254739zB;
import X.C26634Aco;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.global.address.list.module.addressitem.GlobalAddressItemViewHolder;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.logisticselectaddress.USLogisticSelectAddressItemVH;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.paidcontent.assem.PaidContentCollectionDetailDescriptionAssem;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentCollectionListAssemViewModel;

/* loaded from: classes5.dex */
public class AqS19S0310000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS19S0310000_4 aqS19S0310000_4, Object obj) {
        A37 it = (A37) obj;
        o.LJIIIZ(it, "it");
        ((PaidContentCollectionDetailDescriptionAssem) aqS19S0310000_4.l0).Q3(aqS19S0310000_4.z3, ((CollectionDetailModel) aqS19S0310000_4.l1).getHasPurchasedCollection(), (C254739zB) aqS19S0310000_4.l2);
        if (o.LJ(it.LJLJJI, Boolean.TRUE) && it.LJLJJL) {
            PaidContentCollectionListAssemViewModel paidContentCollectionListAssemViewModel = (PaidContentCollectionListAssemViewModel) ((PaidContentCollectionDetailDescriptionAssem) aqS19S0310000_4.l0).LJLJJLL.getValue();
            CollectionDetailModel newCollectionModel = (CollectionDetailModel) aqS19S0310000_4.l1;
            o.LJIIIZ(newCollectionModel, "newCollectionModel");
            paidContentCollectionListAssemViewModel.withState(new AqS28S0210000_4(newCollectionModel, false, paidContentCollectionListAssemViewModel, 5));
            ((PaidContentCollectionDetailDescriptionAssem) aqS19S0310000_4.l0).Q3(aqS19S0310000_4.z3, false, (C254739zB) aqS19S0310000_4.l2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS19S0310000_4 aqS19S0310000_4, Object obj) {
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("click_area", "remove");
        GlobalAddressItemViewHolder globalAddressItemViewHolder = (GlobalAddressItemViewHolder) aqS19S0310000_4.l0;
        boolean z = aqS19S0310000_4.z3;
        boolean LJ = ((Address) aqS19S0310000_4.l1).LJ();
        int bindingAdapterPosition = ((GlobalAddressItemViewHolder) aqS19S0310000_4.l0).getBindingAdapterPosition() - 1;
        C26634Aco c26634Aco = (C26634Aco) aqS19S0310000_4.l2;
        globalAddressItemViewHolder.M(logView, z, LJ, bindingAdapterPosition, c26634Aco.LIZIZ, c26634Aco.LIZJ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS19S0310000_4 aqS19S0310000_4, Object obj) {
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("click_area", "edit");
        GlobalAddressItemViewHolder globalAddressItemViewHolder = (GlobalAddressItemViewHolder) aqS19S0310000_4.l0;
        boolean z = aqS19S0310000_4.z3;
        boolean LJ = ((Address) aqS19S0310000_4.l1).LJ();
        int bindingAdapterPosition = ((GlobalAddressItemViewHolder) aqS19S0310000_4.l0).getBindingAdapterPosition() - 1;
        C26634Aco c26634Aco = (C26634Aco) aqS19S0310000_4.l2;
        globalAddressItemViewHolder.M(logView, z, LJ, bindingAdapterPosition, c26634Aco.LIZIZ, c26634Aco.LIZJ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS19S0310000_4 aqS19S0310000_4, Object obj) {
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("click_area", "default");
        GlobalAddressItemViewHolder globalAddressItemViewHolder = (GlobalAddressItemViewHolder) aqS19S0310000_4.l0;
        boolean z = aqS19S0310000_4.z3;
        boolean LJ = ((Address) aqS19S0310000_4.l1).LJ();
        int bindingAdapterPosition = ((GlobalAddressItemViewHolder) aqS19S0310000_4.l0).getBindingAdapterPosition() - 1;
        C26634Aco c26634Aco = (C26634Aco) aqS19S0310000_4.l2;
        globalAddressItemViewHolder.M(logView, z, LJ, bindingAdapterPosition, c26634Aco.LIZIZ, c26634Aco.LIZJ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS19S0310000_4 aqS19S0310000_4, Object obj) {
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("click_area", "other");
        GlobalAddressItemViewHolder globalAddressItemViewHolder = (GlobalAddressItemViewHolder) aqS19S0310000_4.l0;
        boolean z = aqS19S0310000_4.z3;
        boolean LJ = ((Address) aqS19S0310000_4.l1).LJ();
        int bindingAdapterPosition = ((GlobalAddressItemViewHolder) aqS19S0310000_4.l0).getBindingAdapterPosition() - 1;
        C26634Aco c26634Aco = (C26634Aco) aqS19S0310000_4.l2;
        globalAddressItemViewHolder.M(logView, z, LJ, bindingAdapterPosition, c26634Aco.LIZIZ, c26634Aco.LIZJ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS19S0310000_4 aqS19S0310000_4, Object obj) {
        LaneParams logWhenShow = (LaneParams) obj;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        GlobalAddressItemViewHolder globalAddressItemViewHolder = (GlobalAddressItemViewHolder) aqS19S0310000_4.l0;
        boolean z = aqS19S0310000_4.z3;
        boolean LJ = ((Address) aqS19S0310000_4.l1).LJ();
        int bindingAdapterPosition = ((GlobalAddressItemViewHolder) aqS19S0310000_4.l0).getBindingAdapterPosition() - 1;
        C26634Aco c26634Aco = (C26634Aco) aqS19S0310000_4.l2;
        globalAddressItemViewHolder.M(logWhenShow, z, LJ, bindingAdapterPosition, c26634Aco.LIZIZ, c26634Aco.LIZJ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS19S0310000_4 aqS19S0310000_4, Object obj) {
        boolean z;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("page_name", "logistics");
        logView.plusAssign("is_fullscreen", CardStruct.IStatusCode.DEFAULT);
        logView.plusAssign("previous_page", "logistics");
        logView.plusAssign("sub_page_name", "choose_your_location");
        logView.plusAssign("module_name", "address");
        USLogisticSelectAddressItemVH uSLogisticSelectAddressItemVH = (USLogisticSelectAddressItemVH) aqS19S0310000_4.l0;
        boolean z2 = aqS19S0310000_4.z3;
        boolean LJ = ((Address) aqS19S0310000_4.l1).LJ();
        int bindingAdapterPosition = ((USLogisticSelectAddressItemVH) aqS19S0310000_4.l0).getBindingAdapterPosition() - 1;
        ReachableAddress reachableAddress = (ReachableAddress) aqS19S0310000_4.l2;
        boolean z3 = reachableAddress.isSelect;
        Boolean bool = reachableAddress.reachable;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        uSLogisticSelectAddressItemVH.L(logView, z2, LJ, bindingAdapterPosition, z3, z);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS19S0310000_4 aqS19S0310000_4, Object obj) {
        boolean z;
        LaneParams logWhenShow = (LaneParams) obj;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        logWhenShow.plusAssign("page_name", "logistics");
        logWhenShow.plusAssign("is_fullscreen", CardStruct.IStatusCode.DEFAULT);
        logWhenShow.plusAssign("previous_page", "logistics");
        logWhenShow.plusAssign("sub_page_name", "choose_your_location");
        logWhenShow.plusAssign("module_name", "address");
        USLogisticSelectAddressItemVH uSLogisticSelectAddressItemVH = (USLogisticSelectAddressItemVH) aqS19S0310000_4.l0;
        boolean z2 = aqS19S0310000_4.z3;
        boolean LJ = ((Address) aqS19S0310000_4.l1).LJ();
        int bindingAdapterPosition = ((USLogisticSelectAddressItemVH) aqS19S0310000_4.l0).getBindingAdapterPosition() - 1;
        ReachableAddress reachableAddress = (ReachableAddress) aqS19S0310000_4.l2;
        boolean z3 = reachableAddress.isSelect;
        Boolean bool = reachableAddress.reachable;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        uSLogisticSelectAddressItemVH.L(logWhenShow, z2, LJ, bindingAdapterPosition, z3, z);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS19S0310000_4(Address address, C26634Aco c26634Aco, GlobalAddressItemViewHolder globalAddressItemViewHolder, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = globalAddressItemViewHolder;
        this.z3 = z;
        this.l1 = address;
        this.l2 = c26634Aco;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS19S0310000_4(Address address, ReachableAddress reachableAddress, USLogisticSelectAddressItemVH uSLogisticSelectAddressItemVH, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = uSLogisticSelectAddressItemVH;
        this.z3 = z;
        this.l1 = address;
        this.l2 = reachableAddress;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS19S0310000_4(PaidContentCollectionDetailDescriptionAssem paidContentCollectionDetailDescriptionAssem, boolean z, CollectionDetailModel collectionDetailModel, C254739zB c254739zB, int i) {
        super(1);
        this.$t = i;
        this.l0 = paidContentCollectionDetailDescriptionAssem;
        this.z3 = z;
        this.l1 = collectionDetailModel;
        this.l2 = c254739zB;
    }
}
