package X;

import android.app.Application;
import com.bytedance.globalpayment.iap.model.AckStrategy;
import com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import defpackage.b1;

/* renamed from: X.Uol, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC78335Uol extends AbstractC78349Uoz {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public int LIZLLL;
    public C78330Uog LJ;
    public final AckStrategy LJFF;
    public final HandlerC78339Uop LJI;
    public boolean LJII;

    static {
        C16880lQ.LJLLJ(AbstractC78335Uol.class);
    }

    public final void LIZLLL() {
        if (this.LJII) {
            return;
        }
        this.LJII = true;
        AbstractC78349Uoz nextState = PaymentServiceManager.get().getIapExternalService().getNextState(this);
        if (nextState != null) {
            nextState.LIZ(this.LIZ);
        }
    }

    public final void LJ() {
        C78273Unl.LJIIIZ().LIZLLL().getClass();
        if (C73994T2g.LJIL()) {
            return;
        }
        Application application = ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LIZ;
        if (application != null) {
            PaymentServiceManager.get().getGoogleIapExternalService().getPayloadPreferencesService().removeQueryOrderParam(application, this.LIZ.getOrderId());
        } else {
            b1.LIZLLL();
        }
    }

    public AbstractC78335Uol(InterfaceC78388Upc interfaceC78388Upc) {
        super(interfaceC78388Upc);
        this.LIZLLL = 3;
        C78273Unl.LJIIIZ().LJIIIIZZ();
        PaymentOnlineSettings LIZJ = C78301UoD.LIZJ();
        this.LJFF = new AckStrategy(LIZJ.LJJIFFI(), LIZJ.LIZJ());
        this.LJI = new HandlerC78339Uop(this);
    }
}
