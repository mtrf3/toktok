package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.2sN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72152sN extends AbstractC65781Prl implements InterfaceC88472Yns<Long, C76800UCe> {
    public static final C72152sN LJLIL = new C72152sN();

    public C72152sN() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Long l) {
        long longValue = l.longValue();
        Keva kevaRepo = C91093hp.LIZLLL();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("key_last_auto_dismiss_red_dot");
        LIZ.append(curUserId);
        kevaRepo.storeLong(X1D.LIZIZ(LIZ), longValue);
        return C76800UCe.LIZ;
    }
}
