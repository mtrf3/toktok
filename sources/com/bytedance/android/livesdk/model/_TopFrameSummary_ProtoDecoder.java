package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.depend.model.live._ShowInfo_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _TopFrameSummary_ProtoDecoder implements InterfaceC31105CIr<TopFrameSummary> {
    public static TopFrameSummary LIZIZ(Q9H q9h) {
        TopFrameSummary topFrameSummary = new TopFrameSummary();
        topFrameSummary.showList = new ArrayList();
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
                                topFrameSummary.showList.add(_ShowInfo_ProtoDecoder.LIZIZ(q9h));
                            }
                        } else {
                            topFrameSummary.schema = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        topFrameSummary.title = Q9J.LIZIZ(q9h);
                    }
                } else {
                    topFrameSummary.id = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return topFrameSummary;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TopFrameSummary LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
