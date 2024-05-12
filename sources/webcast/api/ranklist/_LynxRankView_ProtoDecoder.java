package webcast.api.ranklist;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.rank.list.model._RankListV2Response_LynxRankData_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _LynxRankView_ProtoDecoder implements InterfaceC31105CIr<LynxRankView> {
    public static LynxRankView LIZIZ(Q9H q9h) {
        LynxRankView lynxRankView = new LynxRankView();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                lynxRankView.hisListLynxType = q9h.LJIIJJI();
                            }
                        } else {
                            lynxRankView.listLynxType = q9h.LJIIJJI();
                        }
                    } else {
                        lynxRankView.lynxRankData = _RankListV2Response_LynxRankData_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    lynxRankView.lynxSchema = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return lynxRankView;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LynxRankView LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
