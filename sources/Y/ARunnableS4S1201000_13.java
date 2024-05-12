package Y;

import X.C2NU;
import X.C31012CFc;
import X.C38393F4z;
import X.C76762UAs;
import X.C78443UqV;
import X.CN1;
import X.RunnableC76745UAb;
import X.U66;
import X.UC0;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import defpackage.i0;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS4S1201000_13 implements Runnable {
    public final int $t;
    public int i3;
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
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        boolean z;
        JSONObject LJIJI = UC0.LJIJI((U66) this.l1);
        long LIZIZ = C31012CFc.LIZIZ();
        long currentTimeMillis = System.currentTimeMillis();
        ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        C76762UAs c76762UAs = (C76762UAs) this.l2;
        c76762UAs.LIZLLL.LIZIZ(new ARunnableS0S1311200_13(c76762UAs, (U66) this.l1, LIZIZ, currentTimeMillis, LJIJI, this.i3, this.s0, z, 0));
    }

    public final void LIZ$1() {
        boolean z;
        JSONObject LJIJI = UC0.LJIJI((U66) this.l1);
        long LIZIZ = C31012CFc.LIZIZ();
        long currentTimeMillis = System.currentTimeMillis();
        ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        C76762UAs c76762UAs = (C76762UAs) this.l2;
        c76762UAs.LIZLLL.LIZIZ(new ARunnableS0S1311200_13(c76762UAs, (U66) this.l1, LIZIZ, currentTimeMillis, LJIJI, this.i3, this.s0, z, 1));
    }

    public static final void run$0(ARunnableS4S1201000_13 aRunnableS4S1201000_13) {
        ((C78443UqV) aRunnableS4S1201000_13.l1).monitorStatusAndDuration(aRunnableS4S1201000_13.s0, aRunnableS4S1201000_13.i3, null, (JSONObject) aRunnableS4S1201000_13.l2);
    }

    public static final void run$1(ARunnableS4S1201000_13 aRunnableS4S1201000_13) {
        C78443UqV c78443UqV = (C78443UqV) aRunnableS4S1201000_13.l1;
        Map map = (Map) aRunnableS4S1201000_13.l2;
        String str = aRunnableS4S1201000_13.s0;
        int i = aRunnableS4S1201000_13.i3;
        c78443UqV.getClass();
        c78443UqV.monitorStatus(str, i, C38393F4z.LIZLLL(map));
    }

    public static final void run$2(ARunnableS4S1201000_13 aRunnableS4S1201000_13) {
        C78443UqV c78443UqV = (C78443UqV) aRunnableS4S1201000_13.l1;
        String str = aRunnableS4S1201000_13.s0;
        JSONObject jSONObject = (JSONObject) aRunnableS4S1201000_13.l2;
        int i = aRunnableS4S1201000_13.i3;
        c78443UqV.getClass();
        if (!str.startsWith("ttlive_")) {
            str = i0.LJFF("ttlive_", str);
        }
        C78443UqV.LJJI().monitorStatusRate(str, i, C78443UqV.LJIL(jSONObject));
    }

    public static final void run$3(ARunnableS4S1201000_13 aRunnableS4S1201000_13) {
        C78443UqV c78443UqV = (C78443UqV) aRunnableS4S1201000_13.l1;
        String str = aRunnableS4S1201000_13.s0;
        int i = aRunnableS4S1201000_13.i3;
        JSONObject jSONObject = (JSONObject) aRunnableS4S1201000_13.l2;
        c78443UqV.getClass();
        C78443UqV.LJJI().monitorStatusRate(str, i, jSONObject);
    }

    public static final void run$4(ARunnableS4S1201000_13 aRunnableS4S1201000_13) {
        C78443UqV c78443UqV = (C78443UqV) aRunnableS4S1201000_13.l1;
        String str = aRunnableS4S1201000_13.s0;
        JSONObject jSONObject = (JSONObject) aRunnableS4S1201000_13.l2;
        int i = aRunnableS4S1201000_13.i3;
        c78443UqV.getClass();
        if (!str.startsWith("ttlive_")) {
            str = i0.LJFF("ttlive_", str);
        }
        C78443UqV.LJJI().monitorStatusRate(str, i, C78443UqV.LJIL(jSONObject));
    }

    public static final void run$5(ARunnableS4S1201000_13 aRunnableS4S1201000_13) {
        boolean LIZ;
        try {
            aRunnableS4S1201000_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS4S1201000_13 aRunnableS4S1201000_13) {
        boolean LIZ;
        try {
            JSONObject LJIJI = UC0.LJIJI((U66) aRunnableS4S1201000_13.l1);
            long LIZIZ = C31012CFc.LIZIZ();
            long currentTimeMillis = System.currentTimeMillis();
            C76762UAs c76762UAs = (C76762UAs) aRunnableS4S1201000_13.l2;
            c76762UAs.LIZLLL.LIZIZ(new RunnableC76745UAb(c76762UAs, (U66) aRunnableS4S1201000_13.l1, LIZIZ, currentTimeMillis, LJIJI, aRunnableS4S1201000_13.s0, aRunnableS4S1201000_13.i3));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS4S1201000_13 aRunnableS4S1201000_13) {
        boolean LIZ;
        try {
            aRunnableS4S1201000_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS4S1201000_13(C78443UqV c78443UqV, JSONObject jSONObject, int i) {
        this.$t = i;
        this.l1 = c78443UqV;
        this.s0 = "ttlive_settings_manager_monitor";
        this.l2 = jSONObject;
        this.i3 = 0;
    }

    public ARunnableS4S1201000_13(int i, C78443UqV c78443UqV, String str, JSONObject jSONObject, int i2) {
        this.$t = i2;
        switch (i2) {
            case 0:
            case 3:
                this.l1 = c78443UqV;
                this.s0 = str;
                this.i3 = i;
                this.l2 = jSONObject;
                return;
            case 1:
            case 2:
            default:
                this.l1 = c78443UqV;
                this.s0 = str;
                this.l2 = jSONObject;
                this.i3 = i;
                return;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS4S1201000_13(int r2, X.U66 r3, X.C76762UAs r4, java.lang.String r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 5: goto L12;
                case 6: goto L5;
                case 7: goto L12;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l1 = r3
            r0.l2 = r4
            r0.s0 = r5
            r0.i3 = r2
        Le:
            r0.<init>()
            return
        L12:
            r0 = r1
            r0.l1 = r3
            r0.l2 = r4
            r0.i3 = r2
            r0.s0 = r5
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS4S1201000_13.<init>(int, X.U66, X.UAs, java.lang.String, int):void");
    }

    public ARunnableS4S1201000_13(C78443UqV c78443UqV, Map map, String str, int i, int i2) {
        this.$t = i2;
        this.l1 = c78443UqV;
        this.l2 = map;
        this.s0 = str;
        this.i3 = i;
    }
}
