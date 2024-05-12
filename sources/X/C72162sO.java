package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.2sO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72162sO extends AbstractC65781Prl implements InterfaceC88472Yns<Integer, C76800UCe> {
    public static final C72162sO LJLIL = new C72162sO();

    public C72162sO() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Integer num) {
        int intValue = num.intValue();
        Keva kevaRepo = C91093hp.LIZLLL();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("key_auto_dismiss_red_dot_count");
        LIZ.append(curUserId);
        kevaRepo.storeInt(X1D.LIZIZ(LIZ), intValue);
        return C76800UCe.LIZ;
    }
}
