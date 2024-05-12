package Y;

import X.C76786UBq;
import X.C77119UOl;
import X.OSZ;
import X.U66;
import X.U85;
import X.UA9;
import X.UAR;
import X.UAS;
import X.UC0;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S3320200_13 implements Runnable {
    public final int $t;
    public long j8;
    public long j9;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;
    public String s2;
    public boolean z6;
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
        UAS LIZJ = UA9.LIZLLL().LIZJ((U66) this.l3, this.s0, U85.INVITEE);
        if (LIZJ != null) {
            String str = this.s1;
            long j = this.j8;
            long j2 = this.j9;
            String str2 = this.s2;
            OSZ osz = (OSZ) this.l4;
            JSONObject jSONObject = (JSONObject) this.l5;
            boolean z = this.z6;
            boolean z2 = this.z7;
            if (str != null) {
                LIZJ.LIZJ(str);
            }
            UAR.LIZIZ(LIZJ, "join_direct", j - j2, str2, ((Number) osz.getFirst()).longValue());
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZJ);
            C77119UOl.LJIJJLI(LJ, LIZJ, jSONObject, "join_direct", UC0.LJIILLIIL((Long) osz.getFirst(), (String) osz.getSecond(), str2), j2, j);
            if (!z) {
                C77119UOl.LJJ(UA9.LJ(), LIZJ, 2);
                UAR.LJFF(((Number) osz.getFirst()).longValue(), j, LIZJ, "join_direct", null, z2);
                UA9.LIZLLL().LJFF(LIZJ.LIZIZ());
            }
        }
    }

    public final void LIZ$1() {
        UAS LIZIZ = UA9.LIZLLL().LIZIZ((U66) this.l3, this.s0, null);
        if (LIZIZ != null) {
            long j = this.j8;
            long j2 = this.j9;
            String str = this.s1;
            OSZ osz = (OSZ) this.l4;
            JSONObject jSONObject = (JSONObject) this.l5;
            boolean z = this.z6;
            String str2 = this.s2;
            boolean z2 = this.z7;
            UAR.LIZIZ(LIZIZ, "kick_out_all", j - j2, str, ((Number) osz.getFirst()).longValue());
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZIZ);
            C77119UOl.LJIJJLI(LJ, LIZIZ, jSONObject, "kick_out_all", UC0.LJIILLIIL((Long) osz.getFirst(), (String) osz.getSecond(), str), j2, j);
            if (z) {
                C77119UOl.LJJ(UA9.LJ(), LIZIZ, 2);
                UAR.LJFF(0L, j, LIZIZ, "kick_out_all", str2, z2);
                UA9.LIZLLL().LJFF(LIZIZ.LIZIZ());
            }
        }
    }

    public final void LIZ$2() {
        UAS LIZIZ = UA9.LIZLLL().LIZIZ((U66) this.l3, this.s0, null);
        if (LIZIZ != null) {
            long j = this.j8;
            long j2 = this.j9;
            String str = this.s1;
            OSZ osz = (OSZ) this.l4;
            JSONObject jSONObject = (JSONObject) this.l5;
            boolean z = this.z6;
            String str2 = this.s2;
            boolean z2 = this.z7;
            UAR.LIZIZ(LIZIZ, "kick_out", j - j2, str, ((Number) osz.getFirst()).longValue());
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZIZ);
            C77119UOl.LJIJJLI(LJ, LIZIZ, jSONObject, "kick_out", UC0.LJIILLIIL((Long) osz.getFirst(), (String) osz.getSecond(), str), j2, j);
            if (z) {
                C77119UOl.LJJ(UA9.LJ(), LIZIZ, 2);
                UAR.LJFF(0L, j, LIZIZ, "kick_out", str2, z2);
                UA9.LIZLLL().LJFF(LIZIZ.LIZIZ());
            }
        }
    }

    public static final void run$0(ARunnableS0S3320200_13 aRunnableS0S3320200_13) {
        boolean LIZ;
        try {
            aRunnableS0S3320200_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S3320200_13 aRunnableS0S3320200_13) {
        boolean LIZ;
        try {
            aRunnableS0S3320200_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS0S3320200_13 aRunnableS0S3320200_13) {
        boolean LIZ;
        try {
            aRunnableS0S3320200_13.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS0S3320200_13(long r2, long r4, X.U66 r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, X.OSZ r10, org.json.JSONObject r11, boolean r12, boolean r13, int r14) {
        /*
            r1 = this;
            r1.$t = r14
            switch(r14) {
                case 0: goto L1e;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l3 = r6
            r0.s0 = r7
            r0.j8 = r2
            r0.j9 = r4
            r0.s1 = r8
            r0.l4 = r10
            r0.l5 = r11
            r0.z6 = r12
            r0.s2 = r9
            r0.z7 = r13
        L1a:
            r0.<init>()
            return
        L1e:
            r0 = r1
            r0.l3 = r6
            r0.s0 = r7
            r0.s1 = r8
            r0.j8 = r2
            r0.j9 = r4
            r0.s2 = r9
            r0.l4 = r10
            r0.l5 = r11
            r0.z6 = r12
            r0.z7 = r13
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS0S3320200_13.<init>(long, long, X.U66, java.lang.String, java.lang.String, java.lang.String, X.OSZ, org.json.JSONObject, boolean, boolean, int):void");
    }
}
