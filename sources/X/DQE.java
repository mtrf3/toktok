package X;

import com.bytedance.ies.abmock.ClientExpManager;
import java.security.SecureRandom;

/* loaded from: classes7.dex */
public final class DQE extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DQE LJLIL = new DQE();

    public DQE() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        Integer num;
        int LJIIJJI;
        try {
            if (C2NW.LIZ().LJIILL()) {
                if (new SecureRandom().nextFloat() < 0.5d) {
                    LJIIJJI = 4;
                } else {
                    LJIIJJI = FFL.LJIIIZ().LJIIJJI(ClientExpManager.new_user_resources_first_day_opt(), "new_user_resources_first_day_opt");
                }
            } else {
                LJIIJJI = FFL.LJIIIZ().LJIIJJI(ClientExpManager.new_user_resources_first_day_opt(), "new_user_resources_first_day_opt");
            }
            Integer valueOf = Integer.valueOf(LJIIJJI);
            C3C5.m7constructorimpl(valueOf);
            num = valueOf;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            num = LIZ;
        }
        if (C3C5.m10exceptionOrNullimpl(num) == null) {
            return num;
        }
        return 0;
    }
}
