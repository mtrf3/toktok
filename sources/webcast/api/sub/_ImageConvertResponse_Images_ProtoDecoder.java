package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import webcast.api.sub.ImageConvertResponse;

/* loaded from: classes6.dex */
public final class _ImageConvertResponse_Images_ProtoDecoder implements InterfaceC31105CIr<ImageConvertResponse.Images> {
    public static ImageConvertResponse.Images LIZIZ(Q9H q9h) {
        ImageConvertResponse.Images images = new ImageConvertResponse.Images();
        images.url = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    images.url.add(Q9J.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return images;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ImageConvertResponse.Images LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
