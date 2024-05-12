package webcast.data.cohost_biz;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BizJoinGroupParams_ProtoDecoder implements InterfaceC31105CIr<BizJoinGroupParams> {
    public static BizJoinGroupParams LIZIZ(Q9H q9h) {
        BizJoinGroupParams bizJoinGroupParams = new BizJoinGroupParams();
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
                                    bizJoinGroupParams.needWithdraw = Q9J.LIZ(q9h);
                                }
                            } else {
                                bizJoinGroupParams.tagValue = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            bizJoinGroupParams.tagType = q9h.LJIIJ();
                        }
                    } else {
                        bizJoinGroupParams.checkPerceptionCenter = Q9J.LIZ(q9h);
                    }
                } else {
                    bizJoinGroupParams.sourceType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return bizJoinGroupParams;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BizJoinGroupParams LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
