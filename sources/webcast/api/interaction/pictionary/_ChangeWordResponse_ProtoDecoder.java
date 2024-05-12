package webcast.api.interaction.pictionary;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _ChangeWordResponse_ProtoDecoder implements InterfaceC31105CIr<ChangeWordResponse> {
    @Override // X.InterfaceC31105CIr
    public final ChangeWordResponse LIZ(Q9H q9h) {
        ChangeWordResponse changeWordResponse = new ChangeWordResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        changeWordResponse.pictionaryId = q9h.LJIIJJI();
                    }
                } else {
                    changeWordResponse.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return changeWordResponse;
            }
        }
    }
}
