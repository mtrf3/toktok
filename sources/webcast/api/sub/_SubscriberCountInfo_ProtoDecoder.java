package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _SubscriberCountInfo_ProtoDecoder implements InterfaceC31105CIr<SubscriberCountInfo> {
    public static SubscriberCountInfo LIZIZ(Q9H q9h) {
        SubscriberCountInfo subscriberCountInfo = new SubscriberCountInfo();
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
                                subscriberCountInfo.avatar = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            subscriberCountInfo.nickName = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        subscriberCountInfo.count = q9h.LJIIJJI();
                    }
                } else {
                    subscriberCountInfo.countType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return subscriberCountInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubscriberCountInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
