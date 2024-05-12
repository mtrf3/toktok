package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Bf1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29319Bf1 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        if (((IInteractService) CN1.LIZ(IInteractService.class)).ta0()) {
            return "audience";
        }
        if (((IInteractService) CN1.LIZ(IInteractService.class)).mT()) {
            return "manual_pk";
        }
        if (((IInteractService) CN1.LIZ(IInteractService.class)).OB()) {
            return "anchor";
        }
        return "normal";
    }

    public static void LIZIZ(DataChannel dataChannel, String uid, boolean z) {
        String str;
        Long l;
        String str2;
        LiveMode streamType;
        o.LJIIIZ(uid, "uid");
        LinkCrossRoomDataHolder LIZIZ = B5G.LIZIZ();
        BZI LIZ2 = C28787BRn.LIZ("livesdk_follow_guide_show");
        if (C29306Beo.LJIIJ(dataChannel)) {
            str = "anchor";
        } else {
            str = "user";
        }
        LIZ2.LJIJJ(str, "user_type");
        boolean ZQ = ((IInteractService) CN1.LIZ(IInteractService.class)).ZQ();
        String str3 = CardStruct.IStatusCode.DEFAULT;
        Long l2 = null;
        if (ZQ) {
            List<Long> QD = ((IInteractService) CN1.LIZ(IInteractService.class)).QD();
            if (QD.size() > 2) {
                str3 = "1";
            }
            LIZ2.LJIJJ(str3, "is_multi");
            LIZ2.LJIJJ(Integer.valueOf(QD.size()), "current_connection_cnts");
            LIZ2.LJIJJ(QD.toString(), "uid_list");
        } else {
            Object[] objArr = new Object[2];
            User user = B5G.LIZIZ().LJJIL;
            if (user != null) {
                l = Long.valueOf(user.getId());
            } else {
                l = null;
            }
            objArr[0] = l;
            objArr[1] = uid;
            LIZ2.LJIJJ(CardStruct.IStatusCode.DEFAULT, "is_multi");
            LIZ2.LJIJJ("2", "current_connection_cnts");
            LIZ2.LJIJJ(objArr.toString(), "uid_list");
        }
        LIZ2.LJIJJ(uid, "user_id");
        LIZ2.LJIJJ(Long.valueOf(C29306Beo.LJJIZ(dataChannel)), "room_id");
        Room LJJIJLIJ = C29306Beo.LJJIJLIJ(dataChannel);
        if (LJJIJLIJ != null && (streamType = LJJIJLIJ.getStreamType()) != null) {
            str2 = C28509BGv.LIZ(streamType);
        } else {
            str2 = "";
        }
        LIZ2.LJIJJ(str2, "live_type");
        Room LJJIJLIJ2 = C29306Beo.LJJIJLIJ(dataChannel);
        if (LJJIJLIJ2 != null) {
            l2 = Long.valueOf(LJJIJLIJ2.getOwnerUserId());
        }
        LIZ2.LJIJJ(String.valueOf(l2), "anchor_id");
        LIZ2.LJIJJ(String.valueOf(LIZIZ.LJFF), "channel_id");
        LIZ2.LJIJJ(String.valueOf(LIZIZ.LJJJJJL), "pk_id");
        LIZ2.LJIJJ(LIZ(), "connection_type");
        LIZ2.LJIJJ(Boolean.valueOf(z), "follow_status");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJJIIJZLJL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x02d5, code lost:
    
        if (r17 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(X.EnumC75614Tly r14, long r15, boolean r17, long r18, com.bytedance.android.livesdkapi.depend.model.live.Room r20, com.bytedance.ies.sdk.datachannel.DataChannel r21, java.lang.String r22, java.lang.Long r23) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29319Bf1.LIZJ(X.Tly, long, boolean, long, com.bytedance.android.livesdkapi.depend.model.live.Room, com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.String, java.lang.Long):void");
    }
}
