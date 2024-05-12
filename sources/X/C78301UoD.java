package X;

import android.text.TextUtils;
import com.bytedance.globalpayment.payment.common.lib.settings.PaymentLocalSettings;
import com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: X.UoD, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78301UoD implements InterfaceC78302UoE {
    @Override // X.QT5
    public final void LIZ() {
    }

    public C78301UoD() {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        String str = ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LIZLLL;
        if (TextUtils.isEmpty(str) || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        ((C78303UoF) C78273Unl.LJIIIZ().LIZJ()).LIZ.execute(new QT4(str, this));
    }

    public static final PaymentLocalSettings LIZIZ() {
        return (PaymentLocalSettings) PT6.LIZ(((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LIZ, PaymentLocalSettings.class);
    }

    public static final PaymentOnlineSettings LIZJ() {
        return (PaymentOnlineSettings) PT6.LIZ(((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LIZ, PaymentOnlineSettings.class);
    }

    public final boolean LIZLLL() {
        JSONObject LIZ = LIZJ().LIZ();
        if (LIZ == null) {
            return true;
        }
        return LIZ.optBoolean("use_new_restore_order", true);
    }
}
