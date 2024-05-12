package com.bytedance.android.livesdk.model.message;

import X.C29991Fr;
import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _FlexImageModel_ProtoDecoder implements InterfaceC31105CIr<FlexImageModel> {
    public static FlexImageModel LIZIZ(Q9H q9h) {
        FlexImageModel flexImageModel = new FlexImageModel();
        flexImageModel.flexSetting = new ArrayList();
        flexImageModel.urlList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            C29991Fr.LIZ(q9h, flexImageModel.flexSetting);
                        }
                    } else {
                        flexImageModel.uri = Q9J.LIZIZ(q9h);
                    }
                } else {
                    flexImageModel.urlList.add(Q9J.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return flexImageModel;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FlexImageModel LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
