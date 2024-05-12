package X;

import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.AckStrategy;
import com.bytedance.globalpayment.iap.model.OrderStateInfo;
import com.bytedance.globalpayment.iap.model.enums.OrderStateEnum;
import org.json.JSONObject;

/* renamed from: X.Uok, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78334Uok implements InterfaceC78326Uoc<OrderStateInfo> {
    public final C78297Uo9 LIZ;
    public final AckStrategy LIZIZ;
    public final /* synthetic */ AbstractC78335Uol LIZJ;

    @Override // X.InterfaceC78326Uoc
    public final void LIZ(AbsResult absResult) {
        int i;
        int i2;
        if (this.LIZIZ.isNeedAckAfterSuccessQuery() && this.LIZIZ.getAutoAckAfterUploadTokenInMs() > 0) {
            C78341Uor LIZIZ = C78342Uos.LIZLLL().LIZIZ();
            JSONObject LIZ = LIZIZ.LIZ(this.LIZJ.LIZ);
            LIZIZ.LIZIZ(LIZ, C78368UpI.LIZ(absResult));
            C78273Unl.LJIIIZ().LIZIZ().onEventV3("ack_after_query_failed", LIZ);
            this.LIZJ.LIZLLL();
        }
        if (absResult != null) {
            i = absResult.getCode();
            i2 = absResult.getDetailCode();
        } else {
            i = -1;
            i2 = -1;
        }
        if (i == 204) {
            if (i2 == OrderStateEnum.Failed.ordinal() || i2 == OrderStateEnum.Closed.ordinal() || i2 == OrderStateEnum.Expired.ordinal()) {
                this.LIZ.LIZIZ(true, i2, C78368UpI.LIZ(absResult));
                this.LIZJ.LJ();
            } else if (i2 == OrderStateEnum.Abandoned.ordinal() || i2 == OrderStateEnum.SusPended.ordinal() || i2 == OrderStateEnum.Preorder.ordinal()) {
                this.LIZ.LIZIZ(true, i2, C78368UpI.LIZ(absResult));
                this.LIZJ.LJ();
            } else {
                this.LIZ.LIZIZ(false, i2, C78368UpI.LIZ(absResult));
            }
        } else {
            this.LIZ.LIZIZ(false, -1, C78368UpI.LIZ(absResult));
        }
        this.LIZJ.LIZIZ(C78368UpI.LIZ(absResult));
    }

    @Override // X.InterfaceC78326Uoc
    public final void onSuccess(OrderStateInfo orderStateInfo) {
        this.LIZ.LIZIZ(true, orderStateInfo.getOrderState().ordinal(), null);
        this.LIZJ.LIZ.setQuerySucceed(true);
        this.LIZJ.LJ();
        if (this.LIZIZ.isNeedAckAfterSuccessQuery()) {
            this.LIZJ.LIZLLL();
        }
        C78273Unl.LJIIIZ().LIZLLL().getClass();
        if ((C73994T2g.LJIL() || this.LIZJ.LIZ.isSuccess()) && !this.LIZJ.LIZ.isFinished()) {
            this.LIZJ.LIZIZ(new C78368UpI(0, 0, "pay success in QueryOrderStateCallback."));
        }
    }

    public C78334Uok(AbstractC78335Uol abstractC78335Uol, C78297Uo9 c78297Uo9, AckStrategy ackStrategy) {
        this.LIZJ = abstractC78335Uol;
        this.LIZ = c78297Uo9;
        this.LIZIZ = ackStrategy;
        if (!ackStrategy.isNeedAckAfterSuccessQuery()) {
            abstractC78335Uol.LIZLLL();
            return;
        }
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ackStrategy.getAutoAckAfterUploadTokenInMs() is  ");
        LIZ.append(ackStrategy.getAutoAckAfterUploadTokenInMs());
        LIZ.append(" ms");
        X1D.LIZIZ(LIZ);
        LJ.getClass();
        if (ackStrategy.getAutoAckAfterUploadTokenInMs() <= 0) {
            return;
        }
        C39670Fha LJ2 = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("auto ack after ");
        LIZ2.append(ackStrategy.getAutoAckAfterUploadTokenInMs());
        LIZ2.append(" ms");
        X1D.LIZIZ(LIZ2);
        LJ2.getClass();
        abstractC78335Uol.LJI.sendEmptyMessageDelayed(1659, ackStrategy.getAutoAckAfterUploadTokenInMs());
    }
}
