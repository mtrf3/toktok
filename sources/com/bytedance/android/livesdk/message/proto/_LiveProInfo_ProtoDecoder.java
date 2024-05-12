package com.bytedance.android.livesdk.message.proto;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _LiveProInfo_ProtoDecoder implements InterfaceC31105CIr<LiveProInfo> {
    public static LiveProInfo LIZIZ(Q9H q9h) {
        LiveProInfo liveProInfo = new LiveProInfo();
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
                                    liveProInfo.label = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                liveProInfo.bannerStarlingKey = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            liveProInfo.banner = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        liveProInfo.showBanner = Q9J.LIZ(q9h);
                    }
                } else {
                    liveProInfo.isLivePro = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return liveProInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LiveProInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
