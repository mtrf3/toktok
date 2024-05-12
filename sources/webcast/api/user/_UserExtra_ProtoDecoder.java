package webcast.api.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _UserExtra_ProtoDecoder implements InterfaceC31105CIr<UserExtra> {
    public static UserExtra LIZIZ(Q9H q9h) {
        UserExtra userExtra = new UserExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            userExtra.preloadEmptyReason = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        userExtra.preloadRoom = _Room_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    userExtra.anonymousIsSilence = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return userExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UserExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
