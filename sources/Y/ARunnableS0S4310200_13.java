package Y;

import X.C31012CFc;
import X.C76786UBq;
import X.C77119UOl;
import X.OSZ;
import X.U66;
import X.U85;
import X.UA9;
import X.UAO;
import X.UAR;
import X.UAS;
import X.UC0;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S4310200_13 implements Runnable {
    public final int $t;
    public long j8;
    public long j9;
    public Object l4;
    public Object l5;
    public Object l6;
    public String s0;
    public String s1;
    public String s2;
    public String s3;
    public boolean z7;

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
        UAS LIZJ = UA9.LIZLLL().LIZJ((U66) this.l4, this.s0, U85.INVITER);
        if (LIZJ != null) {
            String str = this.s1;
            String str2 = this.s2;
            long j = this.j8;
            long j2 = this.j9;
            String str3 = this.s3;
            OSZ osz = (OSZ) this.l5;
            JSONObject jSONObject = (JSONObject) this.l6;
            boolean z = this.z7;
            if (str != null) {
                LIZJ.LIZJ(str);
            }
            if (str2 != null) {
                LIZJ.LIZLLL(str2);
            }
            long j3 = j - j2;
            UAR.LIZIZ(LIZJ, "invite", j3, str3, ((Number) osz.getFirst()).longValue());
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZJ);
            C77119UOl.LJIJJLI(LJ, LIZJ, jSONObject, "invite", UC0.LJIILLIIL((Long) osz.getFirst(), (String) osz.getSecond(), str3), j2, j);
            UAR.LJ(LIZJ, z, j3);
            if (!z) {
                C77119UOl.LJJ(UA9.LJ(), LIZJ, 2);
                UA9.LIZLLL().LJFF(LIZJ.LIZIZ());
            }
        }
    }

    public final void LIZ$1() {
        String str;
        String str2;
        UAO LIZLLL = UA9.LIZLLL();
        U66 u66 = (U66) this.l4;
        String str3 = this.s0;
        Room LIZJ = u66.LIZJ();
        if (LIZJ != null) {
            str = LIZJ.getIdStr();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        U85 u85 = U85.INVITER;
        Room LIZJ2 = ((U66) this.l4).LIZJ();
        if (LIZJ2 == null || (str2 = LIZJ2.getIdStr()) == null) {
            str2 = "";
        }
        UAS LIZ = UAO.LIZ(LIZLLL, u66, str3, str, u85, null, null, str2, null, null, 0, 944);
        C76786UBq LJ = UA9.LJ();
        JSONObject jSONObject = (JSONObject) this.l5;
        UC0.LJJLIIIJJI(jSONObject, LIZ);
        C77119UOl.LJJII(LJ, LIZ, jSONObject, this.j8, this.j9);
        JSONObject jSONObject2 = (JSONObject) this.l5;
        UC0.LJJLIIIJJI(jSONObject2, LIZ);
        C77119UOl.LJJIFFI(LJ, LIZ, jSONObject2, "resume_channel", UC0.LJIIZILJ(7, null, null), this.j8, this.j9);
        UA9.LJJJI(LIZ);
        String str4 = this.s1;
        if (str4 != null) {
            LIZ.LIZJ(str4);
        }
        String str5 = this.s2;
        if (str5 != null) {
            LIZ.LIZLLL(str5);
        }
        long LIZIZ = C31012CFc.LIZIZ();
        long j = LIZIZ - this.j8;
        UAR.LIZIZ(LIZ, "resume_channel", j, this.s3, ((Number) ((OSZ) this.l6).getFirst()).longValue());
        C76786UBq LJ2 = UA9.LJ();
        JSONObject jSONObject3 = (JSONObject) this.l5;
        UC0.LJJLIIIJJI(jSONObject3, LIZ);
        C77119UOl.LJIJJLI(LJ2, LIZ, jSONObject3, "resume_channel", UC0.LJIILLIIL((Long) ((OSZ) this.l6).getFirst(), (String) ((OSZ) this.l6).getSecond(), this.s3), this.j8, LIZIZ);
        UAR.LJ(LIZ, this.z7, j);
    }

    public final void LIZ$2() {
        UAS LIZJ = UA9.LIZLLL().LIZJ((U66) this.l4, this.s0, U85.APPLICANT);
        if (LIZJ != null) {
            String str = this.s1;
            String str2 = this.s2;
            long j = this.j8;
            long j2 = this.j9;
            String str3 = this.s3;
            OSZ osz = (OSZ) this.l5;
            JSONObject jSONObject = (JSONObject) this.l6;
            boolean z = this.z7;
            if (str != null) {
                LIZJ.LIZJ(str);
            }
            if (str2 != null) {
                LIZJ.LIZLLL(str2);
            }
            long j3 = j - j2;
            UAR.LIZIZ(LIZJ, "apply", j3, str3, ((Number) osz.getFirst()).longValue());
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZJ);
            C77119UOl.LJIJJLI(LJ, LIZJ, jSONObject, "apply", UC0.LJIILLIIL((Long) osz.getFirst(), (String) osz.getSecond(), str3), j2, j);
            UAR.LJ(LIZJ, z, j3);
            if (!z) {
                C77119UOl.LJJ(UA9.LJ(), LIZJ, 2);
                UA9.LIZLLL().LJFF(LIZJ.LIZIZ());
            }
        }
    }

    public static final void run$0(ARunnableS0S4310200_13 aRunnableS0S4310200_13) {
        boolean LIZ;
        try {
            aRunnableS0S4310200_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S4310200_13 aRunnableS0S4310200_13) {
        boolean LIZ;
        try {
            aRunnableS0S4310200_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS0S4310200_13 aRunnableS0S4310200_13) {
        boolean LIZ;
        try {
            aRunnableS0S4310200_13.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS0S4310200_13(long r2, long r4, X.U66 r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, X.OSZ r11, org.json.JSONObject r12, boolean r13, int r14) {
        /*
            r1 = this;
            r1.$t = r14
            switch(r14) {
                case 0: goto L1e;
                case 1: goto L5;
                case 2: goto L1e;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l4 = r6
            r0.s0 = r7
            r0.l5 = r12
            r0.j8 = r2
            r0.j9 = r4
            r0.s1 = r8
            r0.s2 = r9
            r0.s3 = r10
            r0.l6 = r11
            r0.z7 = r13
        L1a:
            r0.<init>()
            return
        L1e:
            r0 = r1
            r0.l4 = r6
            r0.s0 = r7
            r0.s1 = r8
            r0.s2 = r9
            r0.j8 = r2
            r0.j9 = r4
            r0.s3 = r10
            r0.l5 = r11
            r0.l6 = r12
            r0.z7 = r13
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS0S4310200_13.<init>(long, long, X.U66, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.OSZ, org.json.JSONObject, boolean, int):void");
    }
}
