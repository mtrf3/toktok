package X;

import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data.NewUserPopUp;
import kotlin.jvm.internal.o;

/* renamed from: X.Rw4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71144Rw4 {
    public static NewUserPopUp LIZ;
    public static InterfaceC71142Rw2 LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static long LJ;
    public static String LJFF = "";

    public static void LIZIZ(InterfaceC71142Rw2 callback) {
        o.LJIIIZ(callback, "callback");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("unRegisterShowCallback start roomId = ");
        CK3.LIZIZ(LIZ2, LJFF, LIZ2, 4);
        if (o.LJ(callback, LIZIZ)) {
            LIZIZ = null;
        }
    }

    public static void LIZ(String roomId, NewUserPopUp newUserPopUp) {
        o.LJIIIZ(roomId, "roomId");
        LIZJ = false;
        if (o.LJ(roomId, LJFF)) {
            LIZ = newUserPopUp;
            InterfaceC71142Rw2 interfaceC71142Rw2 = LIZIZ;
            if (interfaceC71142Rw2 != null) {
                interfaceC71142Rw2.LIZ(newUserPopUp, LIZLLL, LJ);
            }
            LIZIZ = null;
            return;
        }
        C36746EbW.LIZ(6, "set data but room is not valid");
    }
}
