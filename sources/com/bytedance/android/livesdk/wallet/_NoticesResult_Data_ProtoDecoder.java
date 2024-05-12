package com.bytedance.android.livesdk.wallet;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.wallet.NoticesResult;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _NoticesResult_Data_ProtoDecoder implements InterfaceC31105CIr<NoticesResult.Data> {
    public static NoticesResult.Data LIZIZ(Q9H q9h) {
        NoticesResult.Data data = new NoticesResult.Data();
        data.notices = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    data.notices.add(_NoticesResult_Notice_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final NoticesResult.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
