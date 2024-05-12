package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C16880lQ;
import X.C63053Oor;
import X.C65902Pti;
import X.C65908Pto;
import X.C65912Pts;
import X.C66529Q9d;
import X.C66532Q9g;
import X.C66606QCc;
import X.C66607QCd;
import X.C68074Qne;
import X.C68162Qp4;
import X.C76732zl;
import X.C76800UCe;
import X.C85999Xp5;
import X.E2C;
import X.InterfaceC65784Pro;
import X.OHQ;
import X.PYQ;
import X.PZP;
import X.Q96;
import X.Q9D;
import X.Q9Y;
import X.RunnableC66527Q9b;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import com.bytedance.helios.network.okhttp.impl.OkHttpServiceImpl;
import com.bytedance.helios.network.ttnet.impl.TTNetServiceImpl;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.internal.LineAuthenticationActivity;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public class AqS78S1100000_11 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public String s0;

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
            case 14:
                return invoke$14(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS78S1100000_11 aqS78S1100000_11) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OkHttpServiceImpl.getCookies isHitCache:true size: ");
        LIZ.append(((Map) aqS78S1100000_11.l1).size());
        LIZ.append(" cookie: ");
        LIZ.append(aqS78S1100000_11.s0.hashCode());
        LIZ.append(" lruCache: ");
        LIZ.append(OkHttpServiceImpl.cookieLruCache);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$1(AqS78S1100000_11 aqS78S1100000_11) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OkHttpServiceImpl.getCookies isHitCache:false size: ");
        LIZ.append(((HashMap) aqS78S1100000_11.l1).size());
        LIZ.append(" cookie: ");
        LIZ.append(aqS78S1100000_11.s0.hashCode());
        LIZ.append(" lruCache: ");
        LIZ.append(OkHttpServiceImpl.cookieLruCache);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$10(AqS78S1100000_11 aqS78S1100000_11) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UrlConnectionServiceImpl.getQueries isHitCache:true size: ");
        LIZ.append(((Map) aqS78S1100000_11.l1).size());
        LIZ.append(" url: ");
        LIZ.append(aqS78S1100000_11.s0.hashCode());
        LIZ.append(" lruCache: ");
        LIZ.append(PZP.LIZ);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$11(AqS78S1100000_11 aqS78S1100000_11) {
        FirebaseAnalytics firebaseAnalytics = ((C63053Oor) aqS78S1100000_11.l1).LIZ;
        String str = aqS78S1100000_11.s0;
        C68074Qne c68074Qne = firebaseAnalytics.LIZ;
        c68074Qne.getClass();
        c68074Qne.LIZIZ(new C68162Qp4(c68074Qne, str));
        return C66532Q9g.LIZ(C76800UCe.LIZ);
    }

    public static final Object invoke$12(AqS78S1100000_11 aqS78S1100000_11) {
        Q96 q96 = new Q96();
        q96.LIZ = "Firebase";
        q96.LIZIZ = "setUserId";
        q96.LIZJ = E2C.LIZJ("id", aqS78S1100000_11.s0);
        q96.LIZLLL = E2C.LIZJ("x-tt-dataflow-id", "939524355");
        return C85999Xp5.LJ(new Q9D(q96), C66607QCd.LJLIL, new AqS78S1100000_11((C63053Oor) aqS78S1100000_11.l1, aqS78S1100000_11.s0, 11));
    }

    public static final Object invoke$13(AqS78S1100000_11 aqS78S1100000_11) {
        Context context = (Context) aqS78S1100000_11.l1;
        LineAuthenticationConfig lineAuthenticationConfig = new LineAuthenticationConfig(new Q9Y(aqS78S1100000_11.s0));
        List emptyList = Collections.emptyList();
        if (!lineAuthenticationConfig.isEncryptorPreparationDisabled && !C66529Q9d.LIZIZ) {
            C66529Q9d.LIZIZ = true;
            C16880lQ.LLLLZLLIL().execute(new RunnableC66527Q9b(C16880lQ.LLLLL(context)));
        }
        Intent intent = new Intent(context, (Class<?>) LineAuthenticationActivity.class);
        intent.putExtra("authentication_config", lineAuthenticationConfig);
        intent.putExtra(OHQ.LIZIZ, (String[]) emptyList.toArray(new String[emptyList.size()]));
        return C66532Q9g.LIZ(intent);
    }

    public static final Object invoke$14(AqS78S1100000_11 aqS78S1100000_11) {
        return C85999Xp5.LIZLLL("Line", "getLoginIntent", E2C.LIZJ("channel_id", aqS78S1100000_11.s0), C66606QCc.LJLIL, new AqS78S1100000_11((Context) aqS78S1100000_11.l1, aqS78S1100000_11.s0, 13));
    }

    public static final Object invoke$2(AqS78S1100000_11 aqS78S1100000_11) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OkHttpServiceImpl.getQueries isHitCache:true size: ");
        LIZ.append(((Map) aqS78S1100000_11.l1).size());
        LIZ.append(" url: ");
        LIZ.append(aqS78S1100000_11.s0.hashCode());
        LIZ.append(" lruCache: ");
        LIZ.append(OkHttpServiceImpl.queryLruCache);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$3(AqS78S1100000_11 aqS78S1100000_11) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TTNetServiceImpl.getQueries isHitCache:false size: ");
        LIZ.append(((HashMap) aqS78S1100000_11.l1).size());
        LIZ.append(" url: ");
        LIZ.append(aqS78S1100000_11.s0.hashCode());
        LIZ.append(" lruCache: ");
        LIZ.append(TTNetServiceImpl.queryLruCache);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$4(AqS78S1100000_11 aqS78S1100000_11) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TTNetServiceImpl.getQueries isHitCache:true size: ");
        LIZ.append(((Map) aqS78S1100000_11.l1).size());
        LIZ.append(" url: ");
        LIZ.append(aqS78S1100000_11.s0.hashCode());
        LIZ.append(" lruCache: ");
        LIZ.append(TTNetServiceImpl.queryLruCache);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$5(AqS78S1100000_11 aqS78S1100000_11) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RuleEngineManger id:");
        LIZ.append(((PYQ) aqS78S1100000_11.l1).LJJJJL().LJLIL.LIZ);
        LIZ.append(" uuid:");
        LIZ.append(((PYQ) aqS78S1100000_11.l1).LJJJJL().LL);
        LIZ.append(" pipelineType:");
        LIZ.append(aqS78S1100000_11.s0);
        LIZ.append("\nhandleResult:");
        LIZ.append(((PYQ) aqS78S1100000_11.l1).LJJJJL().LJZI);
        LIZ.append("\n========================================================");
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$6(AqS78S1100000_11 aqS78S1100000_11) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TTNetEventCacheManager pairCacheEvent id: ");
        LIZ.append(((C76732zl) aqS78S1100000_11.l1).element);
        LIZ.append(" uuid:");
        LIZ.append(aqS78S1100000_11.s0);
        LIZ.append(" rest:(");
        C65908Pto<C65902Pti> c65908Pto = C65912Pts.LIZ;
        LIZ.append(c65908Pto.size());
        LIZ.append(", ");
        LIZ.append(c65908Pto.getMapSize());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$7(AqS78S1100000_11 aqS78S1100000_11) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UrlConnectionServiceImpl.getCookies isHitCache:true size: ");
        LIZ.append(((Map) aqS78S1100000_11.l1).size());
        LIZ.append(" cookie: ");
        LIZ.append(aqS78S1100000_11.s0.hashCode());
        LIZ.append(" lruCache: ");
        LIZ.append(PZP.LIZIZ);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$8(AqS78S1100000_11 aqS78S1100000_11) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UrlConnectionServiceImpl.getCookies isHitCache:false size: ");
        LIZ.append(((HashMap) aqS78S1100000_11.l1).size());
        LIZ.append(" cookie: ");
        LIZ.append(aqS78S1100000_11.s0.hashCode());
        LIZ.append(" lruCache: ");
        LIZ.append(PZP.LIZIZ);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$9(AqS78S1100000_11 aqS78S1100000_11) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UrlConnectionServiceImpl.getQueries isHitCache:false size: ");
        LIZ.append(((HashMap) aqS78S1100000_11.l1).size());
        LIZ.append(" url: ");
        LIZ.append(aqS78S1100000_11.s0.hashCode());
        LIZ.append(" lruCache: ");
        LIZ.append(PZP.LIZ);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS78S1100000_11(PYQ pyq, int i) {
        super(0);
        this.$t = i;
        this.l1 = pyq;
        this.s0 = "guard";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS78S1100000_11(java.lang.String r3, java.util.HashMap r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 1: goto Lf;
                case 8: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.s0 = r3
            r1.l1 = r4
            r0 = 0
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l1 = r4
            r1.s0 = r3
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS78S1100000_11.<init>(java.lang.String, java.util.HashMap, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS78S1100000_11(X.C63053Oor r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 11: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.s0 = r4
            r1.l1 = r3
            r0 = 0
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l1 = r3
            r1.s0 = r4
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS78S1100000_11.<init>(X.Oor, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS78S1100000_11(C76732zl c76732zl, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c76732zl;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS78S1100000_11(Context context, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = context;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS78S1100000_11(String str, Context context, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS78S1100000_11(Map map, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = map;
        this.s0 = str;
    }
}
