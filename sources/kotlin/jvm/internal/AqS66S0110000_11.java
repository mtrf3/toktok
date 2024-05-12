package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C0DC;
import X.C63053Oor;
import X.C65902Pti;
import X.C66532Q9g;
import X.C66607QCd;
import X.C68074Qne;
import X.C68161Qp3;
import X.C76800UCe;
import X.C85999Xp5;
import X.E2C;
import X.InterfaceC65784Pro;
import X.PYQ;
import X.Q96;
import X.Q9D;
import X.R5Q;
import X.X1D;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListFragment;

/* loaded from: classes12.dex */
public class AqS66S0110000_11 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public boolean z1;

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

    public static final Object invoke$0(AqS66S0110000_11 aqS66S0110000_11) {
        ((LoginMethodListFragment) aqS66S0110000_11.l0).LJIJ();
        if (aqS66S0110000_11.z1) {
            R5Q.LIZLLL(null, true);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS66S0110000_11 aqS66S0110000_11) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" \n========================================================(NetworkPipeline)\n");
        if (aqS66S0110000_11.z1) {
            str = "filterAllowNetworkEvent: true";
        } else {
            str = "";
        }
        LIZ.append(str);
        LIZ.append(" id: ");
        LIZ.append(((PYQ) aqS66S0110000_11.l0).LJJJJL().LJLIL.LIZ);
        LIZ.append(" uuid: ");
        LIZ.append(((PYQ) aqS66S0110000_11.l0).LJJJJL().LL);
        LIZ.append("\nurl: ");
        LIZ.append(((C65902Pti) ((PYQ) aqS66S0110000_11.l0)).getUrl());
        LIZ.append("\n========================================================");
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$2(AqS66S0110000_11 aqS66S0110000_11) {
        FirebaseAnalytics firebaseAnalytics = ((C63053Oor) aqS66S0110000_11.l0).LIZ;
        boolean z = aqS66S0110000_11.z1;
        C68074Qne c68074Qne = firebaseAnalytics.LIZ;
        Boolean valueOf = Boolean.valueOf(z);
        c68074Qne.getClass();
        c68074Qne.LIZIZ(new C68161Qp3(c68074Qne, valueOf));
        return C66532Q9g.LIZ(C76800UCe.LIZ);
    }

    public static final Object invoke$3(AqS66S0110000_11 aqS66S0110000_11) {
        Q96 q96 = new Q96();
        q96.LIZ = "Firebase";
        q96.LIZIZ = "setAnalyticsCollectionEnabled";
        q96.LIZJ = C0DC.LIZIZ("enabled", Boolean.valueOf(aqS66S0110000_11.z1));
        q96.LIZLLL = E2C.LIZJ("x-tt-dataflow-id", "939524353");
        return C85999Xp5.LJ(new Q9D(q96), C66607QCd.LJLIL, new AqS66S0110000_11((C63053Oor) aqS66S0110000_11.l0, aqS66S0110000_11.z1, 2));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS66S0110000_11(X.C63053Oor r3, boolean r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 2: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.z1 = r4
            r1.l0 = r3
            r0 = 0
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r3
            r1.z1 = r4
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS66S0110000_11.<init>(X.Oor, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS66S0110000_11(LoginMethodListFragment loginMethodListFragment, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = loginMethodListFragment;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS66S0110000_11(boolean z, PYQ pyq, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = pyq;
    }
}
