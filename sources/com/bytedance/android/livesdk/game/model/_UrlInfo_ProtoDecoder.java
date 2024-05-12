package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes16.dex */
public final class _UrlInfo_ProtoDecoder implements InterfaceC31105CIr<UrlInfo> {
    public static UrlInfo LIZIZ(Q9H q9h) {
        UrlInfo urlInfo = new UrlInfo();
        urlInfo.urlList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        urlInfo.urlList.add(Q9J.LIZIZ(q9h));
                    }
                } else {
                    urlInfo.uri = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return urlInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UrlInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
