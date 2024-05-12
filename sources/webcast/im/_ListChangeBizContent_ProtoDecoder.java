package webcast.im;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.HashMap;
import tikcast.linkmic.common.CohostUserInfo;
import tikcast.linkmic.common._CohostUserInfo_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _ListChangeBizContent_ProtoDecoder implements InterfaceC31105CIr<ListChangeBizContent> {
    public static ListChangeBizContent LIZIZ(Q9H q9h) {
        ListChangeBizContent listChangeBizContent = new ListChangeBizContent();
        listChangeBizContent.userInfos = new HashMap();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    long LIZJ2 = q9h.LIZJ();
                    Long l = null;
                    CohostUserInfo cohostUserInfo = null;
                    while (true) {
                        int LJI2 = q9h.LJI();
                        if (LJI2 == -1) {
                            break;
                        }
                        if (LJI2 != 1) {
                            if (LJI2 == 2) {
                                cohostUserInfo = _CohostUserInfo_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            l = Long.valueOf(q9h.LJIIJJI());
                        }
                    }
                    q9h.LJ(LIZJ2);
                    if (l != null) {
                        if (cohostUserInfo != null) {
                            listChangeBizContent.userInfos.put(l, cohostUserInfo);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                q9h.LJ(LIZJ);
                return listChangeBizContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ListChangeBizContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
