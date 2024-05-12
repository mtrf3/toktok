package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes13.dex */
public final class _AtmosphereTagInfo_ProtoDecoder implements InterfaceC31105CIr<AtmosphereTagInfo> {
    public static AtmosphereTagInfo LIZIZ(Q9H q9h) {
        AtmosphereTagInfo atmosphereTagInfo = new AtmosphereTagInfo();
        atmosphereTagInfo.atmosphereTags = new ArrayList();
        atmosphereTagInfo.pinAtmosphereTags = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            atmosphereTagInfo.pinAtmosphereTags.add(_ProductAtmosphereTag_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        atmosphereTagInfo.atmosphereTags.add(_ProductAtmosphereTag_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    atmosphereTagInfo.tagType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return atmosphereTagInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AtmosphereTagInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
