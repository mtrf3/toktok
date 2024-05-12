package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._BadgeStruct_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _FansLevelInfo_ProtoDecoder implements InterfaceC31105CIr<FansLevelInfo> {
    public static FansLevelInfo LIZIZ(Q9H q9h) {
        FansLevelInfo fansLevelInfo = new FansLevelInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        fansLevelInfo.userid = q9h.LJIIJJI();
                        break;
                    case 2:
                        fansLevelInfo.anchorid = q9h.LJIIJJI();
                        break;
                    case 3:
                        fansLevelInfo.score = q9h.LJIIJJI();
                        break;
                    case 4:
                        fansLevelInfo.level = q9h.LJIIJJI();
                        break;
                    case 5:
                        fansLevelInfo.isSleeping = Q9J.LIZ(q9h);
                        break;
                    case 6:
                        fansLevelInfo.timeToSleep = q9h.LJIIJJI();
                        break;
                    case 7:
                        fansLevelInfo.fansScoreRule = _FansScoreRule_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        fansLevelInfo.badge = _BadgeStruct_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return fansLevelInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansLevelInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
