package Y;

import X.C115284fk;
import X.C63120Opw;
import X.C63150OqQ;
import X.C63274OsQ;
import X.C63291Osh;
import X.C63314Ot4;
import X.C63322OtC;
import X.C63447OvD;
import X.C89453Z8v;
import X.OFH;
import X.OFI;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationRequestBody;
import defpackage.b0;
import defpackage.i0;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class ARunnableS15S1000000_10 implements Runnable {
    public final int $t;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        long j;
        long j2;
        int i;
        C63120Opw LJIIIZ;
        long currentTimeMillis = System.currentTimeMillis();
        C63291Osh LIZ = C63291Osh.LIZ();
        String str = this.s0;
        LIZ.getClass();
        long LIZLLL = currentTimeMillis - C63291Osh.LIZLLL.LIZLLL(0L, i0.LJFF(str, "_check_time"));
        JSONObject jSONObject = C63314Ot4.LJIILIIL;
        if (jSONObject != null) {
            j = jSONObject.optInt("conversationMsgRepairInterval");
        } else {
            j = C63314Ot4.LJFF;
        }
        if (LIZLLL <= j) {
            return;
        }
        C63291Osh.LIZ().getClass();
        C63291Osh LIZ2 = C63291Osh.LIZ();
        String str2 = this.s0;
        LIZ2.getClass();
        C63291Osh.LIZLLL.LIZIZ(Long.valueOf(currentTimeMillis), i0.LJFF(str2, "_check_time"));
        long LJIIJJI = C63150OqQ.LJIIJJI(this.s0);
        if (LJIIJJI <= 10000000) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("RepairManager checkConversationMsg cid:");
            b0.LJ(LIZ3, this.s0, ", minIndex invalid:", LJIIJJI);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ3));
            return;
        }
        C63274OsQ c63274OsQ = new C63274OsQ();
        String str3 = this.s0;
        JSONObject jSONObject2 = C63314Ot4.LJIILIIL;
        if (jSONObject2 != null) {
            j2 = jSONObject2.optInt("conversationMsgRepairStart");
        } else {
            j2 = C63314Ot4.LJI;
        }
        JSONObject jSONObject3 = C63314Ot4.LJIILIIL;
        if (jSONObject3 != null) {
            i = jSONObject3.optInt("conversationMsgRepairCount");
        } else {
            i = C63314Ot4.LJII;
        }
        if (TextUtils.isEmpty(str3) || (LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(str3)) == null) {
            return;
        }
        c63274OsQ.LIZJ = j2;
        c63274OsQ.LIZLLL = LJIIJJI;
        int inboxType = LJIIIZ.getInboxType();
        C63447OvD c63447OvD = new C63447OvD();
        c63447OvD.LJ = str3;
        c63447OvD.LIZLLL = Long.valueOf(LJIIIZ.getConversationShortId());
        c63447OvD.LJFF = Integer.valueOf(LJIIIZ.getConversationType());
        c63447OvD.LJI = Long.valueOf(j2);
        c63447OvD.LJII = Long.valueOf(LJIIJJI);
        c63447OvD.LJIIIIZZ = Integer.valueOf(i);
        GetMessagesCheckInfoInConversationRequestBody build = c63447OvD.build();
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJIIJJI = build;
        c63274OsQ.LJIIJJI(inboxType, c89453Z8v.build(), null, str3);
    }

    public static final void run$0(ARunnableS15S1000000_10 aRunnableS15S1000000_10) {
        boolean LIZ;
        try {
            aRunnableS15S1000000_10.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS15S1000000_10 aRunnableS15S1000000_10) {
        boolean LIZ;
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("invalidateID [monitorId:");
            LIZ2.append(aRunnableS15S1000000_10.s0);
            LIZ2.append(']');
            X1D.LIZIZ(LIZ2);
            OFI ofi = OFH.LIZ;
            String str = aRunnableS15S1000000_10.s0;
            ofi.getClass();
            OFI.LIZ(str);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS15S1000000_10(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }

    public ARunnableS15S1000000_10(C63120Opw c63120Opw, String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
