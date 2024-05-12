package X;

import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.UZz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77419UZz extends F9E {
    public boolean LJLIL;
    public final java.util.Map<String, Long> LJLILLLLZI;
    public final HashMap<String, Long> LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI};
    }

    public final C77420Ua0 M() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        Long l = this.LJLILLLLZI.get("send");
        long j10 = 0;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        Long l2 = this.LJLILLLLZI.get("create");
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = 0;
        }
        Long l3 = this.LJLILLLLZI.get("receive");
        if (l3 != null) {
            j3 = l3.longValue();
        } else {
            j3 = 0;
        }
        Long l4 = this.LJLILLLLZI.get("enqueue");
        if (l4 != null) {
            j4 = l4.longValue();
        } else {
            j4 = 0;
        }
        Long l5 = this.LJLILLLLZI.get("dequeue");
        if (l5 != null) {
            j5 = l5.longValue();
        } else {
            j5 = 0;
        }
        StringBuilder LIZJ = V10.LIZJ("calculateDurationCommon:\nsendTs(", j, ")\ncreateTs(");
        LIZJ.append(j2);
        C0MT.LIZLLL(LIZJ, ")\nreceiveTs(", j3, ")\nenqueueTs(");
        LIZJ.append(j4);
        C0MT.LIZLLL(LIZJ, ")\ndequeueTs(", j5, ")\n");
        C0NB.LIZIZ("LiveGiftGeneralTrayMessageTimestampInfo", X1D.LIZIZ(LIZJ));
        if (j > 0 && j3 > 0) {
            j6 = j3 - j;
        } else {
            j6 = 0;
        }
        if (j2 > 0 && j3 > 0) {
            j7 = j3 - j2;
        } else {
            j7 = 0;
        }
        if (j > 0 && j4 > 0) {
            j8 = j4 - j;
        } else {
            j8 = 0;
        }
        if (j3 > 0 && j4 > 0) {
            j9 = j4 - j3;
        } else {
            j9 = 0;
        }
        if (j4 > 0 && j5 > 0) {
            long j11 = j5 - j4;
            if (j11 >= 0) {
                j10 = j11;
            }
        }
        C77420Ua0 c77420Ua0 = new C77420Ua0(j, j3, j5, j6, j7, j8, j9, j10);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("calculateDurationCommon res:\n");
        LIZ.append(c77420Ua0);
        C0NB.LIZIZ("LiveGiftGeneralTrayMessageTimestampInfo", X1D.LIZIZ(LIZ));
        return c77420Ua0;
    }

    public C77419UZz(int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap<String, Long> hashMap = new HashMap<>();
        this.LJLIL = false;
        this.LJLILLLLZI = linkedHashMap;
        this.LJLJI = hashMap;
    }

    public final void L(JSONObject jSONObject) {
        C77420Ua0 M = M();
        jSONObject.put("send_receive_dur", M.LIZLLL);
        jSONObject.put("msg_create_receive_dur", M.LJ);
        jSONObject.put("send_enqueue_dur", M.LJFF);
        jSONObject.put("receive_enqueue_dur", M.LJI);
        jSONObject.put("in_queue_dur", M.LJII);
    }

    public final void N(GiftMessage msg) {
        o.LJIIIZ(msg, "msg");
        CommonMessageData commonMessageData = msg.baseMessage;
        if (commonMessageData != null) {
            long j = commonMessageData.createTime;
            if (j > 0) {
                this.LJLILLLLZI.put("create", Long.valueOf(j));
            }
        }
        if (this.LJLIL) {
            long LJIIJ = C32455CoV.LJIIJ(msg);
            if (LJIIJ > 0) {
                this.LJLILLLLZI.put("send", Long.valueOf(LJIIJ));
            }
        } else {
            long LJIIIZ = C32455CoV.LJIIIZ(msg);
            if (LJIIIZ > 0) {
                this.LJLILLLLZI.put("send", Long.valueOf(LJIIIZ));
            }
        }
        O("receive");
    }

    public final void O(String str) {
        if (this.LJLIL) {
            this.LJLILLLLZI.put(str, Long.valueOf(System.currentTimeMillis()));
        } else {
            this.LJLILLLLZI.put(str, Long.valueOf(C30725C4b.LIZ()));
        }
    }
}
