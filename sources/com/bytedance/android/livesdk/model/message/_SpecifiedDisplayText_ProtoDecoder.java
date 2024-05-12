package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _SpecifiedDisplayText_ProtoDecoder implements InterfaceC31105CIr<SpecifiedDisplayText> {
    public static SpecifiedDisplayText LIZIZ(Q9H q9h) {
        SpecifiedDisplayText specifiedDisplayText = new SpecifiedDisplayText();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        specifiedDisplayText.displayText = _Text_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    specifiedDisplayText.uid = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return specifiedDisplayText;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SpecifiedDisplayText LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
