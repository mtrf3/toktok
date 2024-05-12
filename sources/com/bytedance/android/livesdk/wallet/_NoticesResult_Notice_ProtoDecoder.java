package com.bytedance.android.livesdk.wallet;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.wallet.NoticesResult;

/* loaded from: classes14.dex */
public final class _NoticesResult_Notice_ProtoDecoder implements InterfaceC31105CIr<NoticesResult.Notice> {
    public static NoticesResult.Notice LIZIZ(Q9H q9h) {
        NoticesResult.Notice notice = new NoticesResult.Notice();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        notice.id = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        notice.title = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        notice.content = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        notice.priority = q9h.LJIIJ();
                        break;
                    case 5:
                        notice.style = _NoticesResult_Style_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        notice.schemaText = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        notice.schemaUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        notice.closable = Boolean.valueOf(Q9J.LIZ(q9h));
                        break;
                    case 9:
                        notice.maxViewCount = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return notice;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final NoticesResult.Notice LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
