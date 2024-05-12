package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model._KaraokeSong_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _ReqSong_ProtoDecoder implements InterfaceC31105CIr<ReqSong> {
    public static ReqSong LIZIZ(Q9H q9h) {
        ReqSong reqSong = new ReqSong();
        reqSong.userList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            reqSong.reqCount = q9h.LJIIJJI();
                        }
                    } else {
                        reqSong.userList.add(_User_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    reqSong.song = _KaraokeSong_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return reqSong;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ReqSong LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
