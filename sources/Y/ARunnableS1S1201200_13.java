package Y;

import X.C2NU;
import X.C31012CFc;
import X.C76762UAs;
import X.C76786UBq;
import X.C77119UOl;
import X.CN1;
import X.U66;
import X.U85;
import X.UA9;
import X.UAN;
import X.UAS;
import X.UC0;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitStatus;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyStatus;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS1S1201200_13 implements Runnable {
    public final int $t;
    public int i3;
    public long j4;
    public long j5;
    public Object l1;
    public Object l2;
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
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        boolean z;
        JSONObject LJIJI = UC0.LJIJI((U66) this.l1);
        long currentTimeMillis = System.currentTimeMillis();
        ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        C76762UAs c76762UAs = (C76762UAs) this.l2;
        c76762UAs.LIZLLL.LIZIZ(new UAN(c76762UAs, (U66) this.l1, this.j4, currentTimeMillis, LJIJI, this.i3, this.s0, this.j5, z));
    }

    public final void LIZ$1() {
        UAS LIZIZ = UA9.LIZLLL().LIZIZ((U66) this.l1, this.s0, U85.HANDLER);
        if (LIZIZ != null) {
            int i = this.i3;
            JSONObject jSONObject = (JSONObject) this.l2;
            long j = this.j4;
            long j2 = this.j5;
            if (i == 1) {
                LIZIZ.LJIJI = C31012CFc.LIZIZ();
            }
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZIZ);
            JSONObject LJIIZILJ = UC0.LJIIZILJ(7, null, null);
            LJIIZILJ.put("permit_status", PermitStatus.Companion.stateToString(i));
            C77119UOl.LJJIFFI(LJ, LIZIZ, jSONObject, "permit", LJIIZILJ, j, j2);
        }
    }

    public final void LIZ$2() {
        UAS LIZJ = UA9.LIZLLL().LIZJ((U66) this.l1, this.s0, U85.INVITEE);
        if (LIZJ != null) {
            int i = this.i3;
            JSONObject jSONObject = (JSONObject) this.l2;
            long j = this.j4;
            long j2 = this.j5;
            if (i == 1) {
                LIZJ.LJIJI = C31012CFc.LIZIZ();
            }
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZJ);
            JSONObject LJIIZILJ = UC0.LJIIZILJ(7, null, null);
            LJIIZILJ.put("reply_status", ReplyStatus.Companion.replyStatusToString(i));
            C77119UOl.LJJIFFI(LJ, LIZJ, jSONObject, "reply_invite", LJIIZILJ, j, j2);
        }
    }

    public static final void run$0(ARunnableS1S1201200_13 aRunnableS1S1201200_13) {
        boolean LIZ;
        try {
            aRunnableS1S1201200_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS1S1201200_13 aRunnableS1S1201200_13) {
        boolean LIZ;
        try {
            aRunnableS1S1201200_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS1S1201200_13 aRunnableS1S1201200_13) {
        boolean LIZ;
        try {
            aRunnableS1S1201200_13.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS1S1201200_13(Object obj, String str, int i, Object obj2, long j, long j2, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.s0 = str;
        this.i3 = i;
        this.l2 = obj2;
        this.j4 = j;
        this.j5 = j2;
    }
}
