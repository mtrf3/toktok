package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _FansBannerConfig_ProtoDecoder implements InterfaceC31105CIr<FansBannerConfig> {
    public static FansBannerConfig LIZIZ(Q9H q9h) {
        FansBannerConfig fansBannerConfig = new FansBannerConfig();
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
                                fansBannerConfig.schema = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            fansBannerConfig.backgroundIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        fansBannerConfig.rightIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    fansBannerConfig.text = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return fansBannerConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansBannerConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
