package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import tikcast.api.anchor.PlaylistSongsResponse;
import webcast.data._MusicSong_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _PlaylistSongsResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<PlaylistSongsResponse.ResponseData> {
    public static PlaylistSongsResponse.ResponseData LIZIZ(Q9H q9h) {
        PlaylistSongsResponse.ResponseData responseData = new PlaylistSongsResponse.ResponseData();
        responseData.songs = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        responseData.total = q9h.LJIIJJI();
                    }
                } else {
                    responseData.songs.add(_MusicSong_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PlaylistSongsResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
