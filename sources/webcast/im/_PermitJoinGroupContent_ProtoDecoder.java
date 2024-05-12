package webcast.im;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.linkcore._RTCExtraInfo_ProtoDecoder;
import java.util.ArrayList;
import tikcast.linkmic.common._GroupChannelAllUser_ProtoDecoder;
import tikcast.linkmic.common._GroupPlayer_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _PermitJoinGroupContent_ProtoDecoder implements InterfaceC31105CIr<PermitJoinGroupContent> {
    public static PermitJoinGroupContent LIZIZ(Q9H q9h) {
        PermitJoinGroupContent permitJoinGroupContent = new PermitJoinGroupContent();
        permitJoinGroupContent.groupExtInfo = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    permitJoinGroupContent.groupUser = _GroupChannelAllUser_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                permitJoinGroupContent.groupExtInfo.add(_RTCExtraInfo_ProtoDecoder.LIZIZ(q9h));
                            }
                        } else {
                            permitJoinGroupContent.type = q9h.LJIIJ();
                        }
                    } else {
                        permitJoinGroupContent.agreeStatus = q9h.LJIIJ();
                    }
                } else {
                    permitJoinGroupContent.approver = _GroupPlayer_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return permitJoinGroupContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PermitJoinGroupContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
