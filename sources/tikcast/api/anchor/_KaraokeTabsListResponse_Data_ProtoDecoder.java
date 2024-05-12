package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import tikcast.api.anchor.KaraokeTabsListResponse;

/* loaded from: classes17.dex */
public final class _KaraokeTabsListResponse_Data_ProtoDecoder implements InterfaceC31105CIr<KaraokeTabsListResponse.Data> {
    public static KaraokeTabsListResponse.Data LIZIZ(Q9H q9h) {
        KaraokeTabsListResponse.Data data = new KaraokeTabsListResponse.Data();
        data.allTabs = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        data.favoriteTab = _KaraokeTab_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    data.allTabs.add(_KaraokeTab_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final KaraokeTabsListResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
