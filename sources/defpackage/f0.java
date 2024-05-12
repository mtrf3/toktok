package defpackage;

import X.C85990Xow;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class f0 {
    public static final f0 LIZ = new f0();
    public static final EcomPaymentStyleModel LIZIZ;

    static {
        EcomPaymentStyleModel ecomPaymentStyleModel;
        String lowerCase = C85990Xow.LIZ().toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (o.LJ(lowerCase, "us") || o.LJ(lowerCase, "br")) {
            ecomPaymentStyleModel = new EcomPaymentStyleModel(new Interact(1), new Vision(1, 0, 0, 1));
        } else {
            ecomPaymentStyleModel = new EcomPaymentStyleModel(null, null, 3, null);
        }
        LIZIZ = ecomPaymentStyleModel;
    }

    public static Interact LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        EcomPaymentStyleModel ecomPaymentStyleModel = LIZIZ;
        EcomPaymentStyleModel ecomPaymentStyleModel2 = (EcomPaymentStyleModel) LIZLLL.LJIIIIZZ("ecom_payment_style", EcomPaymentStyleModel.class, ecomPaymentStyleModel);
        if (ecomPaymentStyleModel2 != null) {
            ecomPaymentStyleModel = ecomPaymentStyleModel2;
        }
        Interact interact = ecomPaymentStyleModel.interact;
        if (interact == null) {
            return new Interact(null, 1, null);
        }
        return interact;
    }

    public static Vision LIZIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        EcomPaymentStyleModel ecomPaymentStyleModel = LIZIZ;
        EcomPaymentStyleModel ecomPaymentStyleModel2 = (EcomPaymentStyleModel) LIZLLL.LJIIIIZZ("ecom_payment_style", EcomPaymentStyleModel.class, ecomPaymentStyleModel);
        if (ecomPaymentStyleModel2 != null) {
            ecomPaymentStyleModel = ecomPaymentStyleModel2;
        }
        Vision vision = ecomPaymentStyleModel.vision;
        if (vision == null) {
            return new Vision(null, null, null, null, 15, null);
        }
        return vision;
    }
}
