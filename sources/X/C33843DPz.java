package X;

import com.bytedance.ies.abmock.ClientExpManager;
import java.util.Random;

/* renamed from: X.DPz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33843DPz extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C33843DPz LJLIL = new C33843DPz();

    public C33843DPz() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        Integer num;
        int LJIIJJI;
        try {
            if (C2NW.LIZ().LJIILL()) {
                if (new Random().nextFloat() < 0.5d) {
                    LJIIJJI = 3;
                } else {
                    LJIIJJI = FFL.LJIIIZ().LJIIJJI(ClientExpManager.new_user_video_first_frame_opt(), "new_user_video_first_frame_opt");
                }
            } else {
                LJIIJJI = FFL.LJIIIZ().LJIIJJI(ClientExpManager.new_user_video_first_frame_opt(), "new_user_video_first_frame_opt");
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
