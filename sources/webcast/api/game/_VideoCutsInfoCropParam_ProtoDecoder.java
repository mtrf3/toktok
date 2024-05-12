package webcast.api.game;

import X.C29991Fr;
import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _VideoCutsInfoCropParam_ProtoDecoder implements InterfaceC31105CIr<VideoCutsInfoCropParam> {
    public static VideoCutsInfoCropParam LIZIZ(Q9H q9h) {
        VideoCutsInfoCropParam videoCutsInfoCropParam = new VideoCutsInfoCropParam();
        videoCutsInfoCropParam.pos = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    C29991Fr.LIZ(q9h, videoCutsInfoCropParam.pos);
                }
            } else {
                q9h.LJ(LIZJ);
                return videoCutsInfoCropParam;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final VideoCutsInfoCropParam LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
