package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C113554cx;
import X.C141335gf;
import X.C19U;
import X.C1A8;
import X.C37692Eqm;
import X.C38352F3k;
import X.C3C5;
import X.C63053Oor;
import X.C65901Pth;
import X.C65922Pu2;
import X.C66225Pyv;
import X.C66321Q1d;
import X.C66532Q9g;
import X.C66607QCd;
import X.C68074Qne;
import X.C68158Qp0;
import X.C76800UCe;
import X.C85999Xp5;
import X.E2C;
import X.InterfaceC39301Fbd;
import X.InterfaceC65784Pro;
import X.ORZ;
import X.OSZ;
import X.PYQ;
import X.Q11;
import X.Q1A;
import X.Q1Y;
import X.Q1Z;
import X.Q2L;
import X.Q96;
import X.Q9B;
import X.Q9C;
import X.Q9D;
import X.X1D;
import Y.ARunnableS3S1400000_11;
import android.content.Context;
import android.os.Bundle;
import android.util.LruCache;
import com.appsflyer.AppsFlyerLib;
import com.bytedance.helios.api.config.NetworkConfig;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Map;
import ujb.s;

/* loaded from: classes12.dex */
public class AqS66S1200000_11 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS66S1200000_11 aqS66S1200000_11) {
        aqS66S1200000_11.invoke$0();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AqS66S1200000_11 aqS66S1200000_11) {
        aqS66S1200000_11.invoke$1();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return invoke$9(this);
            case 10:
                return invoke$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this);
            case 12:
                return invoke$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this);
            default:
                return null;
        }
    }

    public final void invoke$0() {
        C76800UCe c76800UCe;
        String LIZJ = C38352F3k.LIZJ(this.s0);
        o.LJFF(LIZJ, "DigestUtils.md5Hex(keyStr)");
        String charSequence = s.LJZI(LIZJ).toString();
        Q1Z<String, List<String>> q1z = ((Q1Y) this.l1).LIZ;
        if (q1z != null) {
            if (charSequence != null) {
                q1z.put(s.LJZI(charSequence).toString(), (List) this.l2);
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
        try {
            C66225Pyv c66225Pyv = Q1A.LJII;
            if (c66225Pyv != null) {
                c66225Pyv.LIZ(((Q1Y) this.l1).LIZIZ).LIZ(charSequence, ORZ.LLD((List) this.l2, null, null, null, null, 63));
            }
            C66225Pyv c66225Pyv2 = Q1A.LJII;
            if (c66225Pyv2 != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(((Q1Y) this.l1).LIZIZ);
                LIZ.append("_data");
                c66225Pyv2.LIZ(X1D.LIZIZ(LIZ)).LIZ(charSequence, this.s0);
                c76800UCe = C76800UCe.LIZ;
            } else {
                c76800UCe = null;
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public final void invoke$1() {
        C76800UCe c76800UCe;
        String LIZJ = C38352F3k.LIZJ(this.s0);
        o.LJFF(LIZJ, "DigestUtils.md5Hex(keyStr)");
        String charSequence = s.LJZI(LIZJ).toString();
        Q1Z<String, List<String>> q1z = ((Q1Y) this.l1).LIZ;
        if (q1z != null) {
            if (charSequence != null) {
                q1z.put(s.LJZI(charSequence).toString(), (List) this.l2);
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
        try {
            C66225Pyv c66225Pyv = Q1A.LJII;
            if (c66225Pyv != null) {
                c66225Pyv.LIZ(((Q1Y) this.l1).LIZIZ).LIZ(charSequence, ORZ.LLD((List) this.l2, null, null, null, null, 63));
            }
            C66225Pyv c66225Pyv2 = Q1A.LJII;
            if (c66225Pyv2 != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(((Q1Y) this.l1).LIZIZ);
                LIZ.append("_data");
                c66225Pyv2.LIZ(X1D.LIZIZ(LIZ)).LIZ(charSequence, this.s0);
                c76800UCe = C76800UCe.LIZ;
            } else {
                c76800UCe = null;
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static final Object invoke$10(AqS66S1200000_11 aqS66S1200000_11) {
        LruCache<String, List<Q2L>> lruCache = ((C66321Q1d) aqS66S1200000_11.l1).LIZ;
        if (lruCache != null) {
            String str = aqS66S1200000_11.s0;
            if (str != null) {
                lruCache.put(s.LJZI(str).toString(), (List) aqS66S1200000_11.l2);
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS66S1200000_11 aqS66S1200000_11) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" \nLegacyStackEventHandler.handleRequestStack\nid: ");
        LIZ.append(((C65922Pu2) ((ARunnableS3S1400000_11) aqS66S1200000_11.l2).l2).LIZ);
        LIZ.append(" threadName: ");
        LIZ.append(((ARunnableS3S1400000_11) aqS66S1200000_11.l2).s0);
        LIZ.append("\nurl: ");
        LIZ.append(aqS66S1200000_11.s0);
        LIZ.append('\n');
        LIZ.append((Map) aqS66S1200000_11.l1);
        LIZ.append("\n ");
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$12(AqS66S1200000_11 aqS66S1200000_11) {
        FirebaseAnalytics firebaseAnalytics = ((C63053Oor) aqS66S1200000_11.l1).LIZ;
        String str = aqS66S1200000_11.s0;
        Bundle bundle = (Bundle) aqS66S1200000_11.l2;
        C68074Qne c68074Qne = firebaseAnalytics.LIZ;
        c68074Qne.getClass();
        c68074Qne.LIZIZ(new C68158Qp0(c68074Qne, null, str, bundle, false));
        return C66532Q9g.LIZ(C76800UCe.LIZ);
    }

    public static final Object invoke$13(AqS66S1200000_11 aqS66S1200000_11) {
        Q96 q96 = new Q96();
        q96.LIZ = "Firebase";
        q96.LIZIZ = "logEvent";
        q96.LIZJ = C113554cx.LJJL(new OSZ("name", aqS66S1200000_11.s0), new OSZ("params", (Bundle) aqS66S1200000_11.l1));
        q96.LIZLLL = E2C.LIZJ("x-tt-dataflow-id", "939524354");
        return C85999Xp5.LJ(new Q9D(q96), C66607QCd.LJLIL, new AqS66S1200000_11((Bundle) aqS66S1200000_11.l1, (C63053Oor) aqS66S1200000_11.l2, aqS66S1200000_11.s0, 12));
    }

    public static final Object invoke$2(AqS66S1200000_11 aqS66S1200000_11) {
        Q96 q96 = new Q96();
        q96.LIZ = "AppsFlyer";
        q96.LIZIZ = "init";
        q96.LIZJ = E2C.LIZJ("devKey", aqS66S1200000_11.s0);
        q96.LIZLLL = E2C.LIZJ("x-tt-dataflow-id", "939524097");
        return C85999Xp5.LJ(new Q9D(q96), C66607QCd.LJLIL, new AqS61S1200000_6(aqS66S1200000_11.s0, (Context) aqS66S1200000_11.l1, (InterfaceC39301Fbd) aqS66S1200000_11.l2, 0));
    }

    public static final Object invoke$3(AqS66S1200000_11 aqS66S1200000_11) {
        Q96 q96 = new Q96();
        q96.LIZ = "AppsFlyer";
        q96.LIZIZ = "logEvent";
        q96.LIZJ = C113554cx.LJJL(new OSZ("eventName", aqS66S1200000_11.s0), new OSZ("eventValue", (Map) aqS66S1200000_11.l1));
        q96.LIZLLL = E2C.LIZJ("x-tt-dataflow-id", "939524106");
        return C85999Xp5.LJ(new Q9D(q96), C66607QCd.LJLIL, new AqS61S1200000_6((Context) aqS66S1200000_11.l2, (Context) aqS66S1200000_11.s0, (String) aqS66S1200000_11.l1, (Map<String, ? extends Object>) 1));
    }

    public static final Object invoke$4(AqS66S1200000_11 aqS66S1200000_11) {
        AppsFlyerLib.getInstance().start((Context) aqS66S1200000_11.l1, aqS66S1200000_11.s0, new Q9B((Q9C) aqS66S1200000_11.l2));
        return C66532Q9g.LIZ(C76800UCe.LIZ);
    }

    public static final Object invoke$5(AqS66S1200000_11 aqS66S1200000_11) {
        Q96 q96 = new Q96();
        q96.LIZ = "AppsFlyer";
        q96.LIZIZ = "start";
        q96.LIZJ = E2C.LIZJ("devKey", aqS66S1200000_11.s0);
        q96.LIZLLL = E2C.LIZJ("x-tt-dataflow-id", "939524099");
        return C85999Xp5.LJ(new Q9D(q96), C66607QCd.LJLIL, new AqS66S1200000_11((Context) aqS66S1200000_11.l1, (Q9C) aqS66S1200000_11.l2, aqS66S1200000_11.s0, 4));
    }

    public static final Object invoke$6(AqS66S1200000_11 aqS66S1200000_11) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NetworkReportManager.handleReport isReport:");
        LIZ.append(!((C65901Pth) aqS66S1200000_11.l1).LJLLJ.isEmpty());
        LIZ.append(" id:");
        LIZ.append(((PYQ) aqS66S1200000_11.l2).LJJJJL().LJLIL.LIZ);
        LIZ.append(" uuid:");
        LIZ.append(((PYQ) aqS66S1200000_11.l2).LJJJJL().LL);
        LIZ.append(" pipelineType:");
        LIZ.append(aqS66S1200000_11.s0);
        LIZ.append(" reportTags:");
        LIZ.append(((C65901Pth) aqS66S1200000_11.l1).LJLLJ);
        LIZ.append(" monitorScenes:");
        LIZ.append(((C65901Pth) aqS66S1200000_11.l1).LJLLILLLL);
        LIZ.append(" \nhandleResult:");
        LIZ.append(((C65901Pth) aqS66S1200000_11.l1).LJZI);
        LIZ.append(" sampleRateModel:");
        LIZ.append(((C65901Pth) aqS66S1200000_11.l1).LJLJJLL);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$7(AqS66S1200000_11 aqS66S1200000_11) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" \n========================================================(RuleEngineManger)\nRuleEngineManger id:");
        LIZ.append(((PYQ) aqS66S1200000_11.l2).LJJJJL().LJLIL.LIZ);
        LIZ.append(" uuid:");
        LIZ.append(((PYQ) aqS66S1200000_11.l2).LJJJJL().LL);
        LIZ.append(" pipelineType:");
        LIZ.append(aqS66S1200000_11.s0);
        LIZ.append("\nparams:");
        LIZ.append((Map) aqS66S1200000_11.l1);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$8(AqS66S1200000_11 aqS66S1200000_11) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RuleEngineManger id:");
        LIZ.append(((PYQ) aqS66S1200000_11.l2).LJJJJL().LJLIL.LIZ);
        LIZ.append(" uuid:");
        LIZ.append(((PYQ) aqS66S1200000_11.l2).LJJJJL().LL);
        LIZ.append(" pipelineType:");
        LIZ.append(aqS66S1200000_11.s0);
        LIZ.append("\nresponse:");
        LIZ.append((Q11) aqS66S1200000_11.l1);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$9(AqS66S1200000_11 aqS66S1200000_11) {
        Boolean bool;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" \n========================================================(RuleEngineManger)\nRuleEngineManger handleEvent(skip) id:");
        LIZ.append(((PYQ) aqS66S1200000_11.l1).LJJJJL().LJLIL.LIZ);
        LIZ.append(" uuid:");
        LIZ.append(((PYQ) aqS66S1200000_11.l1).LJJJJL().LL);
        LIZ.append(" pipelineType:");
        LIZ.append(aqS66S1200000_11.s0);
        LIZ.append(" enableFuseEngineControl:");
        NetworkConfig networkConfig = (NetworkConfig) aqS66S1200000_11.l2;
        Boolean bool2 = null;
        if (networkConfig != null) {
            bool = Boolean.valueOf(networkConfig.enableFuseEngineControl);
        } else {
            bool = null;
        }
        LIZ.append(bool);
        LIZ.append(" enableGuardEngineControl:");
        NetworkConfig networkConfig2 = (NetworkConfig) aqS66S1200000_11.l2;
        if (networkConfig2 != null) {
            bool2 = Boolean.valueOf(networkConfig2.enableGuardEngineControl);
        }
        LIZ.append(bool2);
        LIZ.append(" isFilter:");
        return C19U.LIZ(LIZ, ((PYQ) aqS66S1200000_11.l1).LJJJJL().LJZI.LJLIL, "\n ", LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS66S1200000_11(PYQ pyq, Q11 q11, int i) {
        super(0);
        this.$t = i;
        this.l1 = q11;
        this.l2 = pyq;
        this.s0 = "guard";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS66S1200000_11(PYQ pyq, NetworkConfig networkConfig, int i) {
        super(0);
        this.$t = i;
        this.l1 = pyq;
        this.s0 = "guard";
        this.l2 = networkConfig;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS66S1200000_11(Map map, PYQ pyq, int i) {
        super(0);
        this.$t = i;
        this.l1 = map;
        this.l2 = pyq;
        this.s0 = "guard";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS66S1200000_11(Context context, C1A8 c1a8, int i) {
        super(0);
        this.$t = i;
        this.s0 = null;
        this.l1 = context;
        this.l2 = c1a8;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS66S1200000_11(android.os.Bundle r3, X.C63053Oor r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 12: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.s0 = r5
            r1.l1 = r3
            r1.l2 = r4
            r0 = 0
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l1 = r4
            r1.s0 = r5
            r1.l2 = r3
            r0 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS66S1200000_11.<init>(android.os.Bundle, X.Oor, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS66S1200000_11(C65901Pth c65901Pth, String str, PYQ pyq, int i) {
        super(0);
        this.$t = i;
        this.l1 = c65901Pth;
        this.s0 = str;
        this.l2 = pyq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS66S1200000_11(Q1Y q1y, String str, List list, int i) {
        super(0);
        this.$t = i;
        this.l1 = q1y;
        this.s0 = str;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS66S1200000_11(C66321Q1d c66321Q1d, String str, List list, int i) {
        super(0);
        this.$t = i;
        this.l1 = c66321Q1d;
        this.s0 = str;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS66S1200000_11(Context context, Q9C q9c, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = context;
        this.s0 = str;
        this.l2 = q9c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS66S1200000_11(Context context, String str, Map map, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = map;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS66S1200000_11(String str, Context context, InterfaceC39301Fbd interfaceC39301Fbd, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = context;
        this.l2 = interfaceC39301Fbd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS66S1200000_11(String str, Map map, ARunnableS3S1400000_11 aRunnableS3S1400000_11, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = map;
        this.l2 = aRunnableS3S1400000_11;
    }
}
