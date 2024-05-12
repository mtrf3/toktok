package com.bytedance.android.livesdk.guide.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.guide.model.GuideKeywordsResponse;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _GuideKeywordsResponse_Data_ProtoDecoder implements InterfaceC31105CIr<GuideKeywordsResponse.Data> {
    public static GuideKeywordsResponse.Data LIZIZ(Q9H q9h) {
        GuideKeywordsResponse.Data data = new GuideKeywordsResponse.Data();
        data.keywordsLibrary = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            data.keywordsLibrary.add(_KeywordsLibrary_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        data.userInfo = _GuideKeywordsResponse_UserInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    data.version = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GuideKeywordsResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
