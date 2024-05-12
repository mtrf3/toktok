package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model._KaraokeSong_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _KaraokeTab_ProtoDecoder implements InterfaceC31105CIr<KaraokeTab> {
    public static KaraokeTab LIZIZ(Q9H q9h) {
        KaraokeTab karaokeTab = new KaraokeTab();
        karaokeTab.songList = new ArrayList();
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
                                    karaokeTab.hasMore = Q9J.LIZ(q9h);
                                }
                            } else {
                                karaokeTab.offset = q9h.LJIIJJI();
                            }
                        } else {
                            karaokeTab.songList.add(_KaraokeSong_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        karaokeTab.tabName = Q9J.LIZIZ(q9h);
                    }
                } else {
                    karaokeTab.id = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return karaokeTab;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final KaraokeTab LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
