package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _ImageConvertResponse_ProtoDecoder implements InterfaceC31105CIr<ImageConvertResponse> {
    @Override // X.InterfaceC31105CIr
    public final ImageConvertResponse LIZ(Q9H q9h) {
        ImageConvertResponse imageConvertResponse = new ImageConvertResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    imageConvertResponse.data = _ImageConvertResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return imageConvertResponse;
            }
        }
    }
}
