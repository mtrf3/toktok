package X;

import com.bytedance.ies.abmock.ClientExpManager;

/* renamed from: X.DRl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33881DRl extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C33881DRl LJLIL = new C33881DRl();

    public C33881DRl() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        Integer num;
        try {
            Integer valueOf = Integer.valueOf(FFL.LJIIIZ().LJIIJJI(ClientExpManager.new_user_task_downgrade(), "new_user_task_downgrade"));
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
