package X;

import com.bytedance.ies.abmock.ClientExpManager;

/* loaded from: classes7.dex */
public final class DR2 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DR2 LJLIL = new DR2();

    public DR2() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        Integer num;
        try {
            Integer valueOf = Integer.valueOf(FFL.LJIIIZ().LJIIJJI(ClientExpManager.zero_video_view_monitor_newuser_exp(), "zero_video_view_monitor_newuser_exp"));
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
