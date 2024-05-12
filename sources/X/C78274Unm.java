package X;

import android.text.TextUtils;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;

/* renamed from: X.Unm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78274Unm {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C16880lQ.LJLLJ(C78274Unm.class);
    }

    public static String LIZ() {
        C78259UnX c78259UnX = ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LJIILIIL;
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getHost with iapConfiguration.iapHost:");
        LIZ2.append(c78259UnX.LIZ);
        X1D.LIZIZ(LIZ2);
        LJ.getClass();
        if (!TextUtils.isEmpty(c78259UnX.LIZ)) {
            return c78259UnX.LIZ;
        }
        C39670Fha LJ2 = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("getHost return :");
        C78273Unl.LJIIIZ().LJII();
        LIZ3.append(C78270Uni.LIZ());
        X1D.LIZIZ(LIZ3);
        LJ2.getClass();
        C78273Unl.LJIIIZ().LJII();
        return C78270Uni.LIZ();
    }

    public static String LIZIZ(String str) {
        String str2;
        C78259UnX c78259UnX = ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LJIILIIL;
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getHost with iapConfiguration.mpHost:");
        LIZ2.append(c78259UnX.LJIIIZ);
        X1D.LIZIZ(LIZ2);
        LJ.getClass();
        if (!TextUtils.isEmpty(c78259UnX.LJIIIZ)) {
            str2 = c78259UnX.LJIIIZ;
        } else {
            str2 = "";
        }
        String LIZ3 = LIZ();
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        return LIZ3;
    }

    public static int LIZJ(int i, IapPaymentMethod iapPaymentMethod) {
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
            return i;
        }
        return 0;
    }
}
