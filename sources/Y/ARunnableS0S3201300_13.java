package Y;

import X.C31012CFc;
import X.C76786UBq;
import X.C77119UOl;
import X.U66;
import X.U85;
import X.UA9;
import X.UAS;
import X.UC0;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitStatus;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyStatus;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S3201300_13 implements Runnable {
    public final int $t;
    public int i5;
    public long j6;
    public long j7;
    public long j8;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;
    public String s2;

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
        UAS LIZJ = UA9.LIZLLL().LIZJ((U66) this.l3, String.valueOf(this.j6), U85.HANDLER);
        if (LIZJ != null) {
            int i = this.i5;
            JSONObject jSONObject = (JSONObject) this.l4;
            long j = this.j7;
            long j2 = this.j8;
            String str = this.s0;
            String str2 = this.s1;
            String str3 = this.s2;
            if (str != null) {
                LIZJ.LIZJ(str);
            }
            if (str2 != null) {
                LIZJ.LIZLLL(str2);
            }
            if (i == 1) {
                LIZJ.LJIJI = C31012CFc.LIZIZ();
            }
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZJ);
            JSONObject LJIIZILJ = UC0.LJIIZILJ(7, null, null);
            LJIIZILJ.put("permit_status", PermitStatus.Companion.stateToString(i));
            LJIIZILJ.put("source", str3);
            C77119UOl.LJJIFFI(LJ, LIZJ, jSONObject, "permit", LJIIZILJ, j, j2);
        }
    }

    public final void LIZ$1() {
        UAS LIZJ = UA9.LIZLLL().LIZJ((U66) this.l3, String.valueOf(this.j6), U85.INVITEE);
        if (LIZJ != null) {
            int i = this.i5;
            JSONObject jSONObject = (JSONObject) this.l4;
            long j = this.j7;
            long j2 = this.j8;
            String str = this.s0;
            String str2 = this.s1;
            String str3 = this.s2;
            if (str != null) {
                LIZJ.LIZJ(str);
            }
            if (str2 != null) {
                LIZJ.LIZLLL(str2);
            }
            if (i == 1) {
                LIZJ.LJIJI = C31012CFc.LIZIZ();
            }
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZJ);
            JSONObject LJIIZILJ = UC0.LJIIZILJ(7, null, null);
            LJIIZILJ.put("reply_status", ReplyStatus.Companion.replyStatusToString(i));
            LJIIZILJ.put("source", str3);
            C77119UOl.LJJIFFI(LJ, LIZJ, jSONObject, "reply_invite", LJIIZILJ, j, j2);
        }
    }

    public static final void run$0(ARunnableS0S3201300_13 aRunnableS0S3201300_13) {
        boolean LIZ;
        try {
            aRunnableS0S3201300_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S3201300_13 aRunnableS0S3201300_13) {
        boolean LIZ;
        try {
            aRunnableS0S3201300_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S3201300_13(U66 u66, long j, int i, JSONObject jSONObject, long j2, long j3, String str, String str2, String str3, int i2) {
        this.$t = i2;
        this.l3 = u66;
        this.j6 = j;
        this.i5 = i;
        this.l4 = jSONObject;
        this.j7 = j2;
        this.j8 = j3;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }
}
