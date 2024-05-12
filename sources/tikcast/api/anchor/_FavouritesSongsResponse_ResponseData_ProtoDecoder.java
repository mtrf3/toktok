package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import tikcast.api.anchor.FavouritesSongsResponse;
import webcast.data._MusicSong_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _FavouritesSongsResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<FavouritesSongsResponse.ResponseData> {
    public static FavouritesSongsResponse.ResponseData LIZIZ(Q9H q9h) {
        FavouritesSongsResponse.ResponseData responseData = new FavouritesSongsResponse.ResponseData();
        responseData.songs = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            responseData.total = q9h.LJIIJJI();
                        }
                    } else {
                        responseData.hasMore = Q9J.LIZ(q9h);
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
    public final FavouritesSongsResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
