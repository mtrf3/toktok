package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.2sc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72302sc {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("im_message_request_keva");
        return UPJ.LJ((RBX) HG3.LJIILL(), LIZ2, LIZ2);
    }

    public static boolean LIZIZ() {
        Keva kevaRepo = Keva.getRepo(LIZ());
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        boolean z = kevaRepo.getBoolean("show_message_request_unread_red_dot", true);
        String LIZ2 = LIZ();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("getShow - ");
        LIZ3.append(z);
        C34B.LJI(LIZ2, X1D.LIZIZ(LIZ3));
        return z;
    }

    public static void LIZJ(boolean z) {
        Keva kevaRepo = Keva.getRepo(LIZ());
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        String LIZ2 = LIZ();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("storeShow - ");
        LIZ3.append(z);
        C34B.LJI(LIZ2, X1D.LIZIZ(LIZ3));
        kevaRepo.storeBoolean("show_message_request_unread_red_dot", z);
    }
}
