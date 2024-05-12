package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import webcast.api.sub.ImageConvertResponse;

/* loaded from: classes6.dex */
public final class _ImageConvertResponse_Data_ProtoDecoder implements InterfaceC31105CIr<ImageConvertResponse.Data> {
    public static ImageConvertResponse.Data LIZIZ(Q9H q9h) {
        ImageConvertResponse.Data data = new ImageConvertResponse.Data();
        data.images = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    data.images.add(_ImageConvertResponse_Images_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ImageConvertResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
