package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.ss.android.ugc.aweme.notice.api.bean.BCVideosInPushMsg;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.NiR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60107NiR implements InterfaceC54360LVc, InterfaceC67148QWy {
    public static final C60109NiT LJLILLLLZI = new C60109NiT();
    public static C60107NiR LJLJI;
    public BCVideosInPushMsg LJLIL;

    public C60107NiR() {
        if (C35154Dqw.LIZ()) {
            C67128QWe c67128QWe = C67128QWe.LIZIZ;
            c67128QWe.LIZJ(20164, 1, this);
            c67128QWe.LIZJ(20047, 1, this);
            return;
        }
        C67125QWb.LJLL.LIZLLL(EnumC54358LVa.BC, this);
    }

    @Override // X.InterfaceC54360LVc
    public final void LJIIL(LVZ lvz) {
        String str;
        User currentUser;
        if (lvz instanceof BCVideosInPushMsg) {
            BCVideosInPushMsg bCVideosInPushMsg = (BCVideosInPushMsg) lvz;
            this.LJLIL = bCVideosInPushMsg;
            if (bCVideosInPushMsg != null) {
                NH9 nh9 = (NH9) NHB.LIZ.LIZ();
                if (nh9 != null && (currentUser = nh9.getCurrentUser()) != null) {
                    str = currentUser.getUid();
                } else {
                    str = null;
                }
                bCVideosInPushMsg.setUid(str);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("videoCounts", Integer.valueOf(bCVideosInPushMsg.getNewContentNum()));
            long updateTime = bCVideosInPushMsg.getUpdateTime();
            new F15();
            C72818Shy.LIZ(new C76052yf(updateTime, F15.LIZLLL(linkedHashMap), "onBCVideoCountsChange"));
        }
    }

    @Override // X.InterfaceC67148QWy
    public final void LJIJJLI(WsChannelMsg msg) {
        Object LIZ;
        o.LJIIIZ(msg, "msg");
        try {
            byte[] LIZ2 = msg.LIZ();
            o.LJIIIIZZ(LIZ2, "msg.payload");
            BCVideosInPushMsg bCVideosInPushMsg = (BCVideosInPushMsg) JsonParseUtils.LIZJ(BCVideosInPushMsg.class, new String(LIZ2, PVC.LIZ));
            if (bCVideosInPushMsg instanceof LVZ) {
                LJIIL(bCVideosInPushMsg);
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
    }
}
