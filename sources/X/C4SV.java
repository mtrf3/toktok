package X;

import com.bytedance.forest.Forest;
import defpackage.i0;
import java.io.File;
import kotlin.jvm.internal.AqS83S1100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4SV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4SV {
    public static boolean LIZIZ;
    public static String LIZJ;
    public static final C4SV LIZ = new C4SV();
    public static final String LIZLLL = Forest.openSession$default((Forest) C4SW.LIZ.getValue(), null, 1, null);

    public static String LIZ(String str) {
        String str2 = LIZJ;
        if (str2 == null || str2.length() <= 0) {
            return null;
        }
        return i0.LJFF(str2, str);
    }

    public static void LIZIZ(String str, InterfaceC88471Ynr interfaceC88471Ynr) {
        String LIZ2 = LIZ(str);
        if (LIZ2 != null && C78685UuP.LJJJZ(LIZ2) && interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(Boolean.TRUE, LIZ2);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        String resBundle = JBR.LJFF(LIZ3, File.separator, str, LIZ3);
        String str2 = LIZLLL;
        AqS83S1100000_1 aqS83S1100000_1 = new AqS83S1100000_1(str, (String) interfaceC88471Ynr, (InterfaceC88471Ynr<? super Boolean, ? super String, C76800UCe>) 0);
        C108014Lt c108014Lt = new C108014Lt((Forest) C4SW.LIZ.getValue());
        o.LJIIIZ(resBundle, "resBundle");
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C4ST(c108014Lt, "", str2, "tiktok_bot_avatar_resource", resBundle, aqS83S1100000_1, null), 3);
    }
}
