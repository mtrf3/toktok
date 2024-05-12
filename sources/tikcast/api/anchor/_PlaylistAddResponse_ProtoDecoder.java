package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _PlaylistAddResponse_ProtoDecoder implements InterfaceC31105CIr<PlaylistAddResponse> {
    @Override // X.InterfaceC31105CIr
    public final PlaylistAddResponse LIZ(Q9H q9h) {
        PlaylistAddResponse playlistAddResponse = new PlaylistAddResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    playlistAddResponse.data = _PlaylistAddResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return playlistAddResponse;
            }
        }
    }
}
