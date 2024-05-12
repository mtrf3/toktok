package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _VcloudVideoEditParamVideoExtra_ProtoDecoder implements InterfaceC31105CIr<VcloudVideoEditParamVideoExtra> {
    public static VcloudVideoEditParamVideoExtra LIZIZ(Q9H q9h) {
        VcloudVideoEditParamVideoExtra vcloudVideoEditParamVideoExtra = new VcloudVideoEditParamVideoExtra();
        vcloudVideoEditParamVideoExtra.videoTrackList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        vcloudVideoEditParamVideoExtra.concatType = q9h.LJIIJ();
                    }
                } else {
                    vcloudVideoEditParamVideoExtra.videoTrackList.add(_VcloudVideoEditParamVideoTrack_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return vcloudVideoEditParamVideoExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final VcloudVideoEditParamVideoExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
