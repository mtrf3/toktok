package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _HostInfo_ProtoDecoder implements InterfaceC31105CIr<HostInfo> {
    public static HostInfo LIZIZ(Q9H q9h) {
        HostInfo hostInfo = new HostInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        hostInfo.addtimesecond = q9h.LJIIJJI();
                    }
                } else {
                    hostInfo.userInfo = _User_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return hostInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final HostInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
