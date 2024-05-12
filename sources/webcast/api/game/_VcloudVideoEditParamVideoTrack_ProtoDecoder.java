package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _VcloudVideoEditParamVideoTrack_ProtoDecoder implements InterfaceC31105CIr<VcloudVideoEditParamVideoTrack> {
    public static VcloudVideoEditParamVideoTrack LIZIZ(Q9H q9h) {
        VcloudVideoEditParamVideoTrack vcloudVideoEditParamVideoTrack = new VcloudVideoEditParamVideoTrack();
        vcloudVideoEditParamVideoTrack.videoCutsInfo = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        vcloudVideoEditParamVideoTrack.concatType = q9h.LJIIJ();
                    }
                } else {
                    vcloudVideoEditParamVideoTrack.videoCutsInfo.add(_VideoCutsInfo_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return vcloudVideoEditParamVideoTrack;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final VcloudVideoEditParamVideoTrack LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
