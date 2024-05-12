package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _PreloadRoomResponse_ProtoDecoder implements InterfaceC31105CIr<PreloadRoomResponse> {
    @Override // X.InterfaceC31105CIr
    public final PreloadRoomResponse LIZ(Q9H q9h) {
        PreloadRoomResponse preloadRoomResponse = new PreloadRoomResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            preloadRoomResponse.reason = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        preloadRoomResponse.data = _Room_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    preloadRoomResponse.extra = _PreloadRoomExtra_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return preloadRoomResponse;
            }
        }
    }
}
