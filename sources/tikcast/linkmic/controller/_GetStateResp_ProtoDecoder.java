package tikcast.linkmic.controller;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import tikcast.linkmic.common._BackGroundImageState_ProtoDecoder;
import tikcast.linkmic.common._LayoutState_ProtoDecoder;
import tikcast.linkmic.common._LinkUserState_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _GetStateResp_ProtoDecoder implements InterfaceC31105CIr<GetStateResp> {
    @Override // X.InterfaceC31105CIr
    public final GetStateResp LIZ(Q9H q9h) {
        GetStateResp getStateResp = new GetStateResp();
        getStateResp.states = new ArrayList();
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
                                    getStateResp.backGroundImage = _BackGroundImageState_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                getStateResp.states.add(_LinkUserState_ProtoDecoder.LIZIZ(q9h));
                            }
                        } else {
                            getStateResp.layout = _LayoutState_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        getStateResp.channelId = q9h.LJIIJJI();
                    }
                } else {
                    getStateResp.version = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return getStateResp;
            }
        }
    }
}
