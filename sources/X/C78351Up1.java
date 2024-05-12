package X;

import Y.ARunnableS49S0100000_13;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: X.Up1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78351Up1 implements WeakHandler.IHandler {
    public WeakHandler LJLIL;
    public final long LJLILLLLZI;
    public final boolean LJLJI;
    public C78293Uo5 LJLJJL;
    public volatile ARunnableS49S0100000_13 LJLJJLL;
    public final CopyOnWriteArrayList<String> LJLJJI = new CopyOnWriteArrayList<>();
    public final C78352Up2 LJLJL = new C78352Up2(this);

    public C78351Up1() {
        C78273Unl.LJIIIZ().LJIIIIZZ();
        JSONObject LIZ = C78301UoD.LIZJ().LIZ();
        this.LJLILLLLZI = LIZ != null ? LIZ.optLong("restore_order_task_delay", 0L) : 0L;
        C78273Unl.LJIIIZ().LJIIIIZZ();
        JSONObject LIZ2 = C78301UoD.LIZJ().LIZ();
        this.LJLJI = LIZ2 != null ? LIZ2.optBoolean("use_new_logic_on_purchase_ok", false) : false;
        new PthreadThread(new ARunnableS49S0100000_13(this, 24), "restore_order_opt_thread").start();
    }

    public final boolean LIZIZ() {
        C78273Unl.LJIIIZ().LIZLLL().getClass();
        if (C73994T2g.LJIILLIIL("iap_exp_1_optimize_restore", 0) != 1 && this.LJLILLLLZI > 0) {
            return false;
        }
        return true;
    }

    public final void LIZ(AbsIapChannelOrderData absIapChannelOrderData) {
        if (!LIZIZ() && this.LJLJJI.contains(absIapChannelOrderData.getSelfOrderId())) {
            this.LJLJJI.remove(absIapChannelOrderData.getSelfOrderId());
            if (this.LJLJJL == null) {
                this.LJLJJL = new C78293Uo5();
            }
            C78293Uo5 c78293Uo5 = this.LJLJJL;
            c78293Uo5.getClass();
            c78293Uo5.LIZ(3, absIapChannelOrderData.getProductId(), absIapChannelOrderData.getSelfOrderId(), absIapChannelOrderData.isSubscription());
        }
    }

    public final void LIZJ(OrderData orderData) {
        if (LIZIZ() || orderData == null) {
            return;
        }
        String orderId = orderData.getOrderId();
        if (this.LJLJJI.contains(orderId)) {
            return;
        }
        this.LJLJJI.add(orderId);
        if (this.LJLJJL == null) {
            this.LJLJJL = new C78293Uo5();
        }
        C78293Uo5 c78293Uo5 = this.LJLJJL;
        c78293Uo5.getClass();
        c78293Uo5.LIZ(1, orderData.getProductId(), orderData.getOrderId(), orderData.getIapPayRequest().LJII);
        if (this.LJLJJI.size() != 1 || LIZIZ()) {
            return;
        }
        ARunnableS49S0100000_13 aRunnableS49S0100000_13 = new ARunnableS49S0100000_13(this, 25);
        WeakHandler weakHandler = this.LJLIL;
        if (weakHandler == null) {
            this.LJLJJLL = aRunnableS49S0100000_13;
        } else {
            weakHandler.post(aRunnableS49S0100000_13);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message == null || message.what != 1020 || LIZIZ()) {
            return;
        }
        ARunnableS49S0100000_13 aRunnableS49S0100000_13 = new ARunnableS49S0100000_13(this, 25);
        WeakHandler weakHandler = this.LJLIL;
        if (weakHandler == null) {
            this.LJLJJLL = aRunnableS49S0100000_13;
        } else {
            weakHandler.post(aRunnableS49S0100000_13);
        }
    }
}
