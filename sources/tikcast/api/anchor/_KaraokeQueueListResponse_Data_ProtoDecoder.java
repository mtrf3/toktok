package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model._KaraokeSong_ProtoDecoder;
import java.util.ArrayList;
import tikcast.api.anchor.KaraokeQueueListResponse;

/* loaded from: classes17.dex */
public final class _KaraokeQueueListResponse_Data_ProtoDecoder implements InterfaceC31105CIr<KaraokeQueueListResponse.Data> {
    public static KaraokeQueueListResponse.Data LIZIZ(Q9H q9h) {
        KaraokeQueueListResponse.Data data = new KaraokeQueueListResponse.Data();
        data.queueList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            data.hasMore = Q9J.LIZ(q9h);
                        }
                    } else {
                        data.offset = q9h.LJIIJJI();
                    }
                } else {
                    data.queueList.add(_KaraokeSong_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final KaraokeQueueListResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
