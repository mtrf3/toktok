package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _FansLevelShowConfig_ProtoDecoder implements InterfaceC31105CIr<FansLevelShowConfig> {
    public static FansLevelShowConfig LIZIZ(Q9H q9h) {
        FansLevelShowConfig fansLevelShowConfig = new FansLevelShowConfig();
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
                                fansLevelShowConfig.fontColorCode = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            fansLevelShowConfig.leftUpEntranceIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        fansLevelShowConfig.badgeIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    fansLevelShowConfig.level = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return fansLevelShowConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansLevelShowConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
