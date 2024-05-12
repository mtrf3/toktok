package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.detail.RoomPlayer2;
import com.bytedance.android.livesdk.livesetting.pullstream.EnableEnterRoomOptReuseRoomPlayerSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes6.dex */
public final class BMZ {
    public static final String LIZJ = C16880lQ.LJLLJ(BMZ.class);
    public static volatile BMZ LIZLLL;
    public final java.util.Map<String, B35> LIZ = new HashMap();
    public final Queue<B35> LIZIZ = new LinkedList();

    public static BMZ LIZIZ() {
        if (LIZLLL == null) {
            synchronized (BMZ.class) {
                if (LIZLLL == null) {
                    LIZLLL = new BMZ();
                }
            }
        }
        return LIZLLL;
    }

    public static boolean LJFF() {
        Boolean valueOf = Boolean.valueOf(EnableEnterRoomOptReuseRoomPlayerSetting.INSTANCE.getValue());
        if (valueOf != null && !valueOf.booleanValue()) {
            return true;
        }
        return false;
    }

    public static void LJI(int i) {
        UFE.LIZIZ(i, C28787BRn.LIZ("live_pre_player_state"), "state");
    }

    public final B35 LIZJ(String str) {
        return (B35) ((HashMap) this.LIZ).get(str);
    }

    public final B35 LIZLLL(String str) {
        if (((HashMap) this.LIZ).containsKey(str)) {
            return (B35) ((HashMap) this.LIZ).get(str);
        }
        return null;
    }

    public final B35 LIZ(long j, Context context, String str, String str2, String str3, String str4, StreamUrlExtra.SrConfig srConfig, LiveMode liveMode, long j2, boolean z) {
        B35 b35;
        C16880lQ.LLLLL(context);
        C28644BMa c28644BMa = new C28644BMa();
        c28644BMa.LIZ = str3;
        if (!TextUtils.isEmpty(str3)) {
            c28644BMa.LJII = 1;
        }
        c28644BMa.LIZIZ = str4;
        c28644BMa.LIZJ = str;
        if (c28644BMa.LJII == 0 && !TextUtils.isEmpty(str)) {
            c28644BMa.LJII = 2;
        }
        c28644BMa.LIZLLL = str2;
        c28644BMa.LJ = liveMode;
        c28644BMa.LJFF = srConfig;
        c28644BMa.LJI = j2;
        if (this.LIZIZ.isEmpty() || (b35 = (B35) ((LinkedList) this.LIZIZ).poll()) == null) {
            b35 = new RoomPlayer2(j, c28644BMa, z);
        } else {
            b35.setIsPreparePlayer(z);
            b35.initialize(j, c28644BMa);
        }
        ((HashMap) this.LIZ).put(b35.getPlayerTag(), b35);
        if (b35.getIsPreparePlayer()) {
            LJI(0);
        }
        String str5 = LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("createRoomPlayer -> playerTag: ");
        LIZ.append(b35.getPlayerTag());
        B4I.LIZ(str5, X1D.LIZIZ(LIZ));
        return b35;
    }

    public final B35 LJ(long j, Context context, String str, String str2, String str3, String str4, StreamUrlExtra.SrConfig srConfig, LiveMode liveMode, boolean z, String str5, String str6, long j2, boolean z2) {
        if (context == null) {
            return null;
        }
        if (C38354F3m.LJ(str) && C38354F3m.LJ(str3)) {
            return null;
        }
        B35 LIZ = LIZ(j, context, str, str2, str3, str4, srConfig, liveMode, j2, false);
        LIZ.setReusePlayer(z, str5, z2);
        LIZ.setEnterRoomScene(str6);
        LIZ.warmUp();
        return LIZ;
    }
}
