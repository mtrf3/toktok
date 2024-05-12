package tikcast.api.anchor;

import X.C29991Fr;
import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _PinSoundEffectRequest_ProtoDecoder implements InterfaceC31105CIr<PinSoundEffectRequest> {
    @Override // X.InterfaceC31105CIr
    public final PinSoundEffectRequest LIZ(Q9H q9h) {
        PinSoundEffectRequest pinSoundEffectRequest = new PinSoundEffectRequest();
        pinSoundEffectRequest.soundEffectIdList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    C29991Fr.LIZ(q9h, pinSoundEffectRequest.soundEffectIdList);
                }
            } else {
                q9h.LJ(LIZJ);
                return pinSoundEffectRequest;
            }
        }
    }
}
