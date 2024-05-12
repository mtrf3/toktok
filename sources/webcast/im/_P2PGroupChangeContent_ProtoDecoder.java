package webcast.im;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.linkcore._RTCExtraInfo_ProtoDecoder;
import java.util.ArrayList;
import tikcast.linkmic.common._GroupChannelAllUser_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _P2PGroupChangeContent_ProtoDecoder implements InterfaceC31105CIr<P2PGroupChangeContent> {
    public static P2PGroupChangeContent LIZIZ(Q9H q9h) {
        P2PGroupChangeContent p2PGroupChangeContent = new P2PGroupChangeContent();
        p2PGroupChangeContent.groupExtInfo = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        p2PGroupChangeContent.groupUser = _GroupChannelAllUser_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    p2PGroupChangeContent.groupExtInfo.add(_RTCExtraInfo_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return p2PGroupChangeContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final P2PGroupChangeContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
