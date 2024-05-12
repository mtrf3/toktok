package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._BadgeStruct_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _Audience_ProtoDecoder implements InterfaceC31105CIr<Audience> {
    public static Audience LIZIZ(Q9H q9h) {
        Audience audience = new Audience();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        audience.userId = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        audience.userName = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        audience.userAvatar = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        audience.subTime = q9h.LJIIJJI();
                        break;
                    case 5:
                        audience.badge = _BadgeStruct_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        audience.haveClaimed = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return audience;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final Audience LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
