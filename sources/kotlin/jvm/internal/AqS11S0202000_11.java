package kotlin.jvm.internal;

import X.AbstractC65259PjL;
import X.AbstractC65291Pjr;
import X.AbstractC65781Prl;
import X.C16880lQ;
import X.C44432HcC;
import X.C51029K0z;
import X.C65053Pg1;
import X.C65265PjR;
import X.C65288Pjo;
import X.C65294Pju;
import X.C66414Q4s;
import X.C66532Q9g;
import X.C66607QCd;
import X.C76800UCe;
import X.C85999Xp5;
import X.E2C;
import X.H4F;
import X.InterfaceC65784Pro;
import X.OSZ;
import X.Q85;
import X.Q96;
import X.Q9D;
import X.X1D;
import android.content.Intent;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.identity.TwitterAuthClient;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes12.dex */
public class AqS11S0202000_11 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS11S0202000_11 aqS11S0202000_11) {
        return C66532Q9g.LIZ(Boolean.valueOf(((Q85) aqS11S0202000_11.l0).LIZ.onActivityResult(aqS11S0202000_11.i2, aqS11S0202000_11.i3, (Intent) aqS11S0202000_11.l1)));
    }

    public static final Object invoke$1(AqS11S0202000_11 aqS11S0202000_11) {
        Q96 q96 = new Q96();
        q96.LIZ = "Facebook";
        q96.LIZIZ = "onActivityResult";
        q96.LIZJ = C51029K0z.LJJIIZI(new OSZ("data", (Intent) aqS11S0202000_11.l0));
        q96.LIZLLL = E2C.LIZJ("x-tt-dataflow-id", "939524609");
        return C85999Xp5.LJ(new Q9D(q96), C66607QCd.LJLIL, new AqS11S0202000_11(aqS11S0202000_11.i2, aqS11S0202000_11.i3, (Intent) aqS11S0202000_11.l0, (Q85) aqS11S0202000_11.l1, 0));
    }

    public static final Object invoke$2(AqS11S0202000_11 aqS11S0202000_11) {
        C66414Q4s c66414Q4s = ((C65294Pju) aqS11S0202000_11.l0).LIZ;
        C76800UCe c76800UCe = null;
        if (c66414Q4s != null) {
            int i = aqS11S0202000_11.i2;
            int i2 = aqS11S0202000_11.i3;
            Intent intent = (Intent) aqS11S0202000_11.l1;
            c66414Q4s.getTwitterAuthClient().LIZJ.getClass();
            if (i == 140) {
                TwitterAuthClient twitterAuthClient = c66414Q4s.getTwitterAuthClient();
                twitterAuthClient.getClass();
                C44432HcC LIZIZ = C65265PjR.LIZIZ();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onActivityResult called with ");
                LIZ.append(i);
                LIZ.append(" ");
                LIZ.append(i2);
                X1D.LIZIZ(LIZ);
                LIZIZ.getClass();
                if (((AtomicReference) twitterAuthClient.LIZ.LIZ).get() != null) {
                    AbstractC65291Pjr abstractC65291Pjr = (AbstractC65291Pjr) ((AtomicReference) twitterAuthClient.LIZ.LIZ).get();
                    if (abstractC65291Pjr != null && abstractC65291Pjr.LIZ == i) {
                        AbstractC65259PjL<TwitterSession> abstractC65259PjL = abstractC65291Pjr.LIZJ;
                        if (abstractC65259PjL != null) {
                            if (i2 == -1) {
                                String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "tk");
                                String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "ts");
                                String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(intent, "screen_name");
                                abstractC65259PjL.LIZIZ(new H4F(new TwitterSession(new TwitterAuthToken(LLJJIJIIJIL, LLJJIJIIJIL2), intent.getLongExtra("user_id", 0L), LLJJIJIIJIL3), null));
                            } else if (intent != null && intent.hasExtra("auth_error")) {
                                abstractC65259PjL.LIZ((C65053Pg1) intent.getSerializableExtra("auth_error"));
                            } else {
                                abstractC65259PjL.LIZ(new C65288Pjo("Authorize failed."));
                            }
                        }
                        ((AtomicReference) twitterAuthClient.LIZ.LIZ).set(null);
                    }
                } else {
                    C65265PjR.LIZIZ().getClass();
                }
            }
            c76800UCe = C76800UCe.LIZ;
        }
        return C66532Q9g.LIZ(c76800UCe);
    }

    public static final Object invoke$3(AqS11S0202000_11 aqS11S0202000_11) {
        Q96 q96 = new Q96();
        q96.LIZ = "Twitter";
        q96.LIZIZ = "onActivityResult";
        q96.LIZJ = C51029K0z.LJJIIZI(new OSZ("data", (Intent) aqS11S0202000_11.l0));
        q96.LIZLLL = E2C.LIZJ("x-tt-dataflow-id", "939524866");
        return C85999Xp5.LJ(new Q9D(q96), C66607QCd.LJLIL, new AqS11S0202000_11(aqS11S0202000_11.i2, aqS11S0202000_11.i3, (Intent) aqS11S0202000_11.l0, (C65294Pju) aqS11S0202000_11.l1, 2));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS11S0202000_11(int r3, int r4, android.content.Intent r5, X.C65294Pju r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            switch(r7) {
                case 2: goto L13;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r6
            r1.i2 = r3
            r1.i3 = r4
            r0 = 0
        Lf:
            r1.<init>(r0)
            return
        L13:
            r1 = r2
            r1.l0 = r6
            r1.i2 = r3
            r1.i3 = r4
            r1.l1 = r5
            r0 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS11S0202000_11.<init>(int, int, android.content.Intent, X.Pju, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS11S0202000_11(int r3, int r4, android.content.Intent r5, X.Q85 r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            switch(r7) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r6
            r1.i2 = r3
            r1.i3 = r4
            r0 = 0
        Lf:
            r1.<init>(r0)
            return
        L13:
            r1 = r2
            r1.l0 = r6
            r1.i2 = r3
            r1.i3 = r4
            r1.l1 = r5
            r0 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS11S0202000_11.<init>(int, int, android.content.Intent, X.Q85, int):void");
    }
}
