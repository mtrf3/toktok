package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _ShowInfo_ProtoDecoder implements InterfaceC31105CIr<ShowInfo> {
    public static ShowInfo LIZIZ(Q9H q9h) {
        ShowInfo showInfo = new ShowInfo();
        showInfo.anchors = new ArrayList();
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
                                showInfo.showIntroduction = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            showInfo.anchors.add(_User_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        showInfo.showEndTime = q9h.LJIIJJI();
                    }
                } else {
                    showInfo.showStartTime = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return showInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ShowInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
