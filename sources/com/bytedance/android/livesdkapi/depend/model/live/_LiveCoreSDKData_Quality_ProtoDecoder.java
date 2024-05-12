package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;

/* loaded from: classes6.dex */
public final class _LiveCoreSDKData_Quality_ProtoDecoder implements InterfaceC31105CIr<LiveCoreSDKData.Quality> {
    public static LiveCoreSDKData.Quality LIZIZ(Q9H q9h) {
        LiveCoreSDKData.Quality quality = new LiveCoreSDKData.Quality();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 6) {
                            Q9J.LIZJ(q9h);
                        } else {
                            quality.iconType = q9h.LJIIJ();
                        }
                    } else {
                        quality.sdkKey = Q9J.LIZIZ(q9h);
                    }
                } else {
                    quality.name = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return quality;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LiveCoreSDKData.Quality LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
