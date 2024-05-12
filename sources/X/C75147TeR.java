package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3ServiceCancelInviteTimerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSequentialEventReportSetting;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.TeR, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75147TeR implements OnMessageListener {
    public static final C73318Sq2 LJLIL = new C73318Sq2();
    public static final java.util.Map<Long, String> LJLILLLLZI = new LinkedHashMap();
    public static final java.util.Map<Long, String> LJLJI = new LinkedHashMap();
    public static final java.util.Map<Long, Integer> LJLJJI = new LinkedHashMap();
    public static final java.util.Set<Long> LJLJJL = new CopyOnWriteArraySet();
    public static final java.util.Map<Long, String> LJLJJLL = new LinkedHashMap();

    public static final void LIZIZ() {
        LJLIL.LIZLLL();
        ((CopyOnWriteArraySet) LJLJJL).clear();
        ((LinkedHashMap) LJLILLLLZI).clear();
        ((LinkedHashMap) LJLJI).clear();
        ((LinkedHashMap) LJLJJI).clear();
    }

    public static final String LIZJ(long j) {
        String str = (String) ((LinkedHashMap) LJLILLLLZI).get(Long.valueOf(j));
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage message) {
        long j;
        o.LJIIIZ(message, "message");
        if (!(message instanceof MemberMessage)) {
            return;
        }
        User user = ((MemberMessage) message).user;
        if (user != null) {
            j = user.getId();
        } else {
            j = 0;
        }
        LIZLLL(j, true);
    }

    public static final void LIZLLL(long j, boolean z) {
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) LJLJJL;
        if (copyOnWriteArraySet.contains(Long.valueOf(j))) {
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            long j2 = 0;
            if (room != null) {
                long id = room.getId();
                if (id != 0 && z) {
                    String LIZ = TS8.LIZ.LIZ(j);
                    if (LIZ == null) {
                        LIZ = "";
                    }
                    JSONObject jSONObject = new JSONObject();
                    C05630Jz.LJFF(jSONObject, "guest_user_id", j);
                    C05630Jz.LJI(jSONObject, "guest_linkmic_id", LIZ);
                    Long valueOf = Long.valueOf(j);
                    if (valueOf != null) {
                        j2 = valueOf.longValue();
                    }
                    C05630Jz.LJFF(jSONObject, "remote_user_id", j2);
                    C05630Jz.LJI(jSONObject, "remote_linkmic_id", LIZ);
                    C74736TUu.LIZ.LJIL(0, "cancel_invite", jSONObject, true);
                    C75149TeT c75149TeT = (C75149TeT) C74736TUu.LIZJ.getValue();
                    c75149TeT.getClass();
                    if (!ujb.o.LJJJJJL(LIZ) && LinkmicSequentialEventReportSetting.INSTANCE.getValue().enable) {
                        C76788UBs.LJII((C76788UBs) c75149TeT.LIZIZ.getValue(), LIZ, "cancel_invite", null, null, 240);
                    }
                    InterfaceC75441TjB R6 = C8E.LJ().R6();
                    if (R6 != null) {
                        R6.LLIIIJ(new C76001TsD(id, j, LinkMicMultiGuestV3ServiceCancelInviteTimerSetting.getValue(), 28), new C75148TeS());
                    }
                }
            }
            copyOnWriteArraySet.remove(Long.valueOf(j));
            LJLILLLLZI.remove(Long.valueOf(j));
            LJLJI.remove(Long.valueOf(j));
            LJLJJI.remove(Long.valueOf(j));
        }
    }

    public static void LIZ(long j, String str, int i, int i2) {
        String sharePlatform;
        if ((i2 & 4) != 0) {
            sharePlatform = "room";
        } else {
            sharePlatform = null;
        }
        if ((i2 & 8) != 0) {
            i = 1;
        }
        o.LJIIIZ(sharePlatform, "sharePlatform");
        ((CopyOnWriteArraySet) LJLJJL).add(Long.valueOf(j));
        LJLILLLLZI.put(Long.valueOf(j), str);
        LJLJI.put(Long.valueOf(j), sharePlatform);
        LJLJJI.put(Long.valueOf(j), Integer.valueOf(i));
    }
}
