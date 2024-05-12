package webcast.data.multi_guest_play;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _ShowConfig_ProtoDecoder implements InterfaceC31105CIr<ShowConfig> {
    public static ShowConfig LIZIZ(Q9H q9h) {
        ShowConfig showConfig = new ShowConfig();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        showConfig.allowOpenMicFreely = Q9J.LIZ(q9h);
                    }
                } else {
                    showConfig.durationPerGuest = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return showConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ShowConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
