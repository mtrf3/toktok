package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _CaptionInfo_ProtoDecoder implements InterfaceC31105CIr<CaptionInfo> {
    public static CaptionInfo LIZIZ(Q9H q9h) {
        CaptionInfo captionInfo = new CaptionInfo();
        captionInfo.supportLang = new ArrayList();
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
                                captionInfo.location = q9h.LJIIJ();
                            }
                        } else {
                            captionInfo.supportLang.add(Q9J.LIZIZ(q9h));
                        }
                    } else {
                        captionInfo.alignStream = Q9J.LIZ(q9h);
                    }
                } else {
                    captionInfo.open = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return captionInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CaptionInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
