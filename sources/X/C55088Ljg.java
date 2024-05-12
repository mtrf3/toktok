package X;

import Y.ARunnableS45S0100000_9;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;

/* renamed from: X.Ljg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55088Ljg {
    public static long LIZ;
    public static SlimRoom.LinkMic LIZIZ;

    public static final SlimRoom.LinkMic LIZ(LiveRoomStruct liveRoomStruct) {
        Long l;
        String str;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("start generate roomStruct id is: ");
        SlimRoom.LinkMic linkMic = null;
        if (liveRoomStruct != null) {
            l = Long.valueOf(liveRoomStruct.id);
        } else {
            l = null;
        }
        LIZ2.append(l);
        X1D.LIZIZ(LIZ2);
        if (liveRoomStruct == null || (str = liveRoomStruct.linkMic) == null) {
            return null;
        }
        try {
            linkMic = (SlimRoom.LinkMic) C75792yF.LIZ(str, SlimRoom.LinkMic.class);
        } catch (Exception unused) {
        }
        LIZ = liveRoomStruct.id;
        LIZIZ = linkMic;
        return linkMic;
    }

    public static SlimRoom.LinkMic LIZIZ(LiveRoomStruct liveRoomStruct) {
        SlimRoom.LinkMic linkMic;
        if (liveRoomStruct == null || TextUtils.isEmpty(liveRoomStruct.linkMic)) {
            return null;
        }
        if (LIZ == liveRoomStruct.id && (linkMic = LIZIZ) != null) {
            return linkMic;
        }
        return LIZ(liveRoomStruct);
    }

    public static final void LIZJ(LiveRoomStruct liveRoomStruct) {
        if (liveRoomStruct == null || !((Boolean) C52474Kic.LIZ.getValue()).booleanValue() || TextUtils.isEmpty(liveRoomStruct.linkMic)) {
            return;
        }
        if (LIZ == liveRoomStruct.id && LIZIZ != null) {
            return;
        }
        C38995FSd.LIZLLL().submit(new ARunnableS45S0100000_9(liveRoomStruct, 178));
    }
}
