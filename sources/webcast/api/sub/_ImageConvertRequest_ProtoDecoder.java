package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _ImageConvertRequest_ProtoDecoder implements InterfaceC31105CIr<ImageConvertRequest> {
    @Override // X.InterfaceC31105CIr
    public final ImageConvertRequest LIZ(Q9H q9h) {
        ImageConvertRequest imageConvertRequest = new ImageConvertRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    imageConvertRequest.uris = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return imageConvertRequest;
            }
        }
    }
}
