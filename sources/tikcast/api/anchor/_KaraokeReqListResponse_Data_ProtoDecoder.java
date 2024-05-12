package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import tikcast.api.anchor.KaraokeReqListResponse;
import webcast.data._ReqSong_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _KaraokeReqListResponse_Data_ProtoDecoder implements InterfaceC31105CIr<KaraokeReqListResponse.Data> {
    public static KaraokeReqListResponse.Data LIZIZ(Q9H q9h) {
        KaraokeReqListResponse.Data data = new KaraokeReqListResponse.Data();
        data.reqSongList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    data.hasMore = Q9J.LIZ(q9h);
                                }
                            } else {
                                data.isUpdate = Q9J.LIZ(q9h);
                            }
                        } else {
                            data.timestamp = q9h.LJIIJJI();
                        }
                    } else {
                        data.offset = q9h.LJIIJJI();
                    }
                } else {
                    data.reqSongList.add(_ReqSong_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final KaraokeReqListResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
