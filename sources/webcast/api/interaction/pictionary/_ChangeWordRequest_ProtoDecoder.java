package webcast.api.interaction.pictionary;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _ChangeWordRequest_ProtoDecoder implements InterfaceC31105CIr<ChangeWordRequest> {
    @Override // X.InterfaceC31105CIr
    public final ChangeWordRequest LIZ(Q9H q9h) {
        ChangeWordRequest changeWordRequest = new ChangeWordRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        changeWordRequest.pictionaryId = q9h.LJIIJJI();
                    }
                } else {
                    changeWordRequest.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return changeWordRequest;
            }
        }
    }
}
