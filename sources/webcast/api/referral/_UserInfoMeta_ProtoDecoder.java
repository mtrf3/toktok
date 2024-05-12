package webcast.api.referral;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _UserInfoMeta_ProtoDecoder implements InterfaceC31105CIr<UserInfoMeta> {
    public static UserInfoMeta LIZIZ(Q9H q9h) {
        UserInfoMeta userInfoMeta = new UserInfoMeta();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        userInfoMeta.avatarThumb = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    userInfoMeta.displayId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return userInfoMeta;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UserInfoMeta LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
