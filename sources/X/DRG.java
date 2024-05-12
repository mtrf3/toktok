package X;

import com.bytedance.ies.abmock.ClientExpManager;

/* loaded from: classes7.dex */
public final class DRG extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DRG LJLIL = new DRG();

    public DRG() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        Integer num;
        try {
            Integer valueOf = Integer.valueOf(FFL.LJIIIZ().LJIIJJI(ClientExpManager.new_user_login_experience_aggre_opt(), "new_user_login_experience_aggre_opt"));
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
