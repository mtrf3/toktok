package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E62 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final E62 LJLIL = new E62();

    public E62() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Keva keva = E63.LIZ;
        if (keva.contains("is_new_user_key")) {
            return Boolean.valueOf(keva.getBoolean("is_new_user_key", false));
        }
        Boolean isNewUser = C38987FRv.LIZLLL();
        o.LJIIIIZZ(isNewUser, "isNewUser");
        keva.storeBoolean("is_new_user_key", isNewUser.booleanValue());
        return isNewUser;
    }
}
