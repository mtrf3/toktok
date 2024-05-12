package X;

import com.bytedance.globalpayment.iap.common.ability.model.api.entity.OneTimeOrderStateResponseEntity;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.ResponseEntity;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.SubscriptionOrderStateResponseEntity;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.OrderStateInfo;
import com.bytedance.globalpayment.iap.model.enums.OrderStateEnum;

/* renamed from: X.Uof, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78329Uof implements InterfaceC78326Uoc<ResponseEntity> {
    public final /* synthetic */ C78330Uog LIZ;

    public C78329Uof(C78330Uog c78330Uog) {
        this.LIZ = c78330Uog;
    }

    @Override // X.InterfaceC78326Uoc
    public final void LIZ(AbsResult absResult) {
        C78330Uog c78330Uog;
        int i;
        C78273Unl.LJIIIZ().LIZLLL().getClass();
        if (C73994T2g.LJIL() && (i = (c78330Uog = this.LIZ).LIZJ) < c78330Uog.LIZLLL) {
            int i2 = i + 1;
            c78330Uog.LIZJ = i2;
            long LIZ = c78330Uog.LIZ(i2);
            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("OrderStateManager: prepare delay ");
            LIZ2.append(LIZ);
            LIZ2.append("ms retry query order state.");
            X1D.LIZIZ(LIZ2);
            LJ.getClass();
            this.LIZ.LJIIJJI.sendEmptyMessageDelayed(1, LIZ);
            C78330Uog c78330Uog2 = this.LIZ;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Failed due to API failed. Detail :");
            LIZ3.append(absResult.getMessage());
            c78330Uog2.LIZIZ("livesdk_iap_check_receipt_fail_original", X1D.LIZIZ(LIZ3));
            return;
        }
        InterfaceC78326Uoc<OrderStateInfo> interfaceC78326Uoc = this.LIZ.LIZIZ;
        if (interfaceC78326Uoc == null) {
            return;
        }
        interfaceC78326Uoc.LIZ(absResult);
    }

    @Override // X.InterfaceC78326Uoc
    public final void onSuccess(ResponseEntity responseEntity) {
        SubscriptionOrderStateResponseEntity.Data data;
        SubscriptionOrderStateResponseEntity.SubsInfo subsInfo;
        OrderStateEnum orderStateEnum;
        OneTimeOrderStateResponseEntity.Data data2;
        ResponseEntity responseEntity2 = responseEntity;
        if (responseEntity2 instanceof OneTimeOrderStateResponseEntity) {
            C78330Uog c78330Uog = this.LIZ;
            OneTimeOrderStateResponseEntity oneTimeOrderStateResponseEntity = (OneTimeOrderStateResponseEntity) responseEntity2;
            InterfaceC78326Uoc<OrderStateInfo> interfaceC78326Uoc = c78330Uog.LIZIZ;
            if (interfaceC78326Uoc == null) {
                return;
            }
            if (oneTimeOrderStateResponseEntity == null || (data2 = oneTimeOrderStateResponseEntity.data) == null) {
                C78273Unl.LJIIIZ().LJ().getClass();
                orderStateEnum = OrderStateEnum.Failed;
            } else {
                orderStateEnum = OrderStateEnum.from(data2.status);
            }
            int i = C78340Uoq.LIZ[orderStateEnum.ordinal()];
            if (i != 3) {
                switch (i) {
                    case 8:
                        OrderStateInfo orderStateInfo = new OrderStateInfo();
                        orderStateInfo.setProductId(c78330Uog.LJ);
                        orderStateInfo.setOrderId(c78330Uog.LJFF);
                        orderStateInfo.setOrderState(orderStateEnum);
                        interfaceC78326Uoc.onSuccess(orderStateInfo);
                        return;
                    case 9:
                    case 10:
                        break;
                    default:
                        int i2 = c78330Uog.LIZJ + 1;
                        c78330Uog.LIZJ = i2;
                        long LIZ = c78330Uog.LIZ(i2);
                        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("OrderStateManager: prepare delay ");
                        LIZ2.append(LIZ);
                        LIZ2.append("ms retry query order state.");
                        X1D.LIZIZ(LIZ2);
                        LJ.getClass();
                        c78330Uog.LJIIJJI.sendEmptyMessageDelayed(1, LIZ);
                        c78330Uog.LIZIZ("livesdk_iap_check_receipt_fail_original", oneTimeOrderStateResponseEntity.data.status);
                        return;
                }
            }
            int ordinal = orderStateEnum.ordinal();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("query order error because of the entity state, the state is ");
            LIZ3.append(orderStateEnum.name());
            interfaceC78326Uoc.LIZ(new C78368UpI(204, ordinal, X1D.LIZIZ(LIZ3)));
            return;
        }
        C78330Uog c78330Uog2 = this.LIZ;
        SubscriptionOrderStateResponseEntity subscriptionOrderStateResponseEntity = (SubscriptionOrderStateResponseEntity) responseEntity2;
        InterfaceC78326Uoc<OrderStateInfo> interfaceC78326Uoc2 = c78330Uog2.LIZIZ;
        if (interfaceC78326Uoc2 == null) {
            return;
        }
        if (subscriptionOrderStateResponseEntity == null || (data = subscriptionOrderStateResponseEntity.data) == null || (subsInfo = data.subsInfo) == null) {
            C78273Unl.LJIIIZ().LJ().getClass();
            interfaceC78326Uoc2.LIZ(new C78368UpI(204, 2021, "entity is null when OrderStateManager.onQuerySubscriptionOrderStateSuccess"));
            return;
        }
        OrderStateEnum from = OrderStateEnum.from(subsInfo.status);
        switch (C78340Uoq.LIZ[from.ordinal()]) {
            case 1:
            case 2:
            case 3:
                OrderStateInfo orderStateInfo2 = new OrderStateInfo();
                orderStateInfo2.setProductId(c78330Uog2.LJ);
                orderStateInfo2.setOrderId(c78330Uog2.LJFF);
                orderStateInfo2.setOrderState(OrderStateEnum.from(subscriptionOrderStateResponseEntity.data.subsInfo.status));
                interfaceC78326Uoc2.onSuccess(orderStateInfo2);
                return;
            case 4:
            case 5:
            case 6:
                int ordinal2 = from.ordinal();
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("query subscription order error because of the entity state, the state is ");
                LIZ4.append(from.name());
                interfaceC78326Uoc2.LIZ(new C78368UpI(204, ordinal2, X1D.LIZIZ(LIZ4)));
                return;
            default:
                int i3 = c78330Uog2.LIZJ + 1;
                c78330Uog2.LIZJ = i3;
                long LIZ5 = c78330Uog2.LIZ(i3);
                C39670Fha LJ2 = C78273Unl.LJIIIZ().LJ();
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("OrderStateManager: prepare delay ");
                LIZ6.append(LIZ5);
                LIZ6.append("ms retry query order state.");
                X1D.LIZIZ(LIZ6);
                LJ2.getClass();
                c78330Uog2.LJIIJJI.sendEmptyMessageDelayed(1, LIZ5);
                c78330Uog2.LIZIZ("livesdk_iap_check_receipt_fail_original", from.toString());
                return;
        }
    }
}
