package Y;

import X.C76765UAv;
import X.CN1;
import X.OSZ;
import X.U66;
import X.U6D;
import X.UA9;
import X.UC0;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.realx.base.NetworkTypeUtils;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S3210200_13 implements Runnable {
    public final int $t;
    public long j6;
    public long j7;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;
    public String s2;
    public boolean z5;

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
        JSONObject LJIJI = UC0.LJIJI((U66) this.l3);
        boolean isNetworkAvailable = NetworkTypeUtils.isNetworkAvailable(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context());
        UA9.LJFF().LIZIZ(new ARunnableS0S3320200_13(this.j6, this.j7, (U66) this.l3, this.s0, this.s1, this.s2, (OSZ) this.l4, LJIJI, this.z5, isNetworkAvailable, 0));
    }

    public final void LIZ$1() {
        JSONObject LJIJI = UC0.LJIJI((U66) this.l3);
        boolean isNetworkAvailable = NetworkTypeUtils.isNetworkAvailable(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context());
        C76765UAv LJFF = UA9.LJFF();
        U66 u66 = (U66) this.l3;
        String str = this.s0;
        LJFF.LIZIZ(new ARunnableS0S3320200_13(this.j6, this.j7, u66, str, this.s1, this.s2, (OSZ) this.l4, LJIJI, this.z5, isNetworkAvailable, 1));
    }

    public final void LIZ$2() {
        JSONObject LJIJI = UC0.LJIJI((U66) this.l3);
        boolean isNetworkAvailable = NetworkTypeUtils.isNetworkAvailable(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context());
        C76765UAv LJFF = UA9.LJFF();
        U66 u66 = (U66) this.l3;
        String str = this.s0;
        LJFF.LIZIZ(new ARunnableS0S3320200_13(this.j6, this.j7, u66, str, this.s1, this.s2, (OSZ) this.l4, LJIJI, this.z5, isNetworkAvailable, 2));
    }

    public static final void run$0(ARunnableS0S3210200_13 aRunnableS0S3210200_13) {
        boolean LIZ;
        try {
            aRunnableS0S3210200_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S3210200_13 aRunnableS0S3210200_13) {
        boolean LIZ;
        try {
            aRunnableS0S3210200_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS0S3210200_13 aRunnableS0S3210200_13) {
        boolean LIZ;
        try {
            aRunnableS0S3210200_13.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS0S3210200_13(long r2, long r4, X.U7T r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, X.OSZ r10, boolean r11, int r12) {
        /*
            r1 = this;
            r1.$t = r12
            switch(r12) {
                case 0: goto L1a;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l3 = r6
            r0.s0 = r7
            r0.j6 = r2
            r0.j7 = r4
            r0.s1 = r8
            r0.l4 = r10
            r0.z5 = r11
            r0.s2 = r9
        L16:
            r0.<init>()
            return
        L1a:
            r0 = r1
            r0.l3 = r6
            r0.s0 = r7
            r0.s1 = r8
            r0.j6 = r2
            r0.j7 = r4
            r0.s2 = r9
            r0.l4 = r10
            r0.z5 = r11
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS0S3210200_13.<init>(long, long, X.U7T, java.lang.String, java.lang.String, java.lang.String, X.OSZ, boolean, int):void");
    }

    public ARunnableS0S3210200_13(long j, long j2, U6D u6d, String str, String str2, String str3, OSZ osz, boolean z, int i) {
        this.$t = i;
        this.l3 = u6d;
        this.s0 = str;
        this.j6 = j;
        this.j7 = j2;
        this.s1 = str2;
        this.l4 = osz;
        this.z5 = z;
        this.s2 = str3;
    }
}
