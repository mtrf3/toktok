package webcast.im;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import webcast.im.JoinGroupMessageExtra;

/* loaded from: classes14.dex */
public final class _JoinGroupMessageExtra_RivalExtra_AuthenticationInfo_ProtoDecoder implements InterfaceC31105CIr<JoinGroupMessageExtra.RivalExtra.AuthenticationInfo> {
    public static JoinGroupMessageExtra.RivalExtra.AuthenticationInfo LIZIZ(Q9H q9h) {
        JoinGroupMessageExtra.RivalExtra.AuthenticationInfo authenticationInfo = new JoinGroupMessageExtra.RivalExtra.AuthenticationInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            authenticationInfo.authenticationBadge = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        authenticationInfo.enterpriseVerifyReason = Q9J.LIZIZ(q9h);
                    }
                } else {
                    authenticationInfo.customVerify = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return authenticationInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final JoinGroupMessageExtra.RivalExtra.AuthenticationInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
