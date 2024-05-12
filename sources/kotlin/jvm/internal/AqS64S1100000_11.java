package kotlin.jvm.internal;

import X.AEL;
import X.AbstractC65781Prl;
import X.AbstractViewOnClickListenerC67619QgJ;
import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import X.C66322Q1e;
import X.C66324Q1g;
import X.C66325Q1h;
import X.C66329Q1l;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.ORY;
import X.ORZ;
import X.Q12;
import X.Q1A;
import X.Q2U;
import X.X1D;
import android.location.LocationManager;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import com.ss.android.ugc.aweme.trace.TraceLogWrapApiImpl;
import com.zhiliaoapp.musically.R;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class AqS64S1100000_11 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS64S1100000_11 aqS64S1100000_11, Object obj) {
        ((TraceLogWrapApiImpl) aqS64S1100000_11.l1).LIZIZ.LIZJ(((Number) obj).longValue(), aqS64S1100000_11.s0, true);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS64S1100000_11 aqS64S1100000_11, Object obj) {
        ((TraceLogWrapApiImpl) aqS64S1100000_11.l1).LIZIZ.LIZJ(((Number) obj).longValue(), aqS64S1100000_11.s0, false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS64S1100000_11 aqS64S1100000_11, Object obj) {
        C66322Q1e receiver = (C66322Q1e) obj;
        o.LJIIJ(receiver, "$receiver");
        receiver.LIZ = "rule_engine_generate_strategies";
        JSONObject jSONObject = new JSONObject();
        receiver.LIZIZ = jSONObject;
        jSONObject.put("code", ((Q12) aqS64S1100000_11.l1).LIZ);
        JSONObject jSONObject2 = receiver.LIZIZ;
        if (jSONObject2 != null) {
            jSONObject2.put("strategyNames", ((Q12) aqS64S1100000_11.l1).LIZLLL);
        }
        JSONObject jSONObject3 = receiver.LIZIZ;
        if (jSONObject3 != null) {
            jSONObject3.put("source", aqS64S1100000_11.s0);
        }
        JSONObject jSONObject4 = receiver.LIZIZ;
        if (jSONObject4 != null) {
            jSONObject4.put("enable_fff", Q1A.LJIILIIL);
        }
        JSONObject jSONObject5 = new JSONObject();
        receiver.LIZLLL = jSONObject5;
        jSONObject5.put("cost", ((Q12) aqS64S1100000_11.l1).LIZJ.LJLJJI / 1000);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS64S1100000_11 aqS64S1100000_11, Object obj) {
        C66324Q1g receiver = (C66324Q1g) obj;
        o.LJIIJ(receiver, "$receiver");
        receiver.LIZIZ = "Execute";
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("expr:");
        LIZ.append(aqS64S1100000_11.s0.hashCode());
        receiver.LIZ = X1D.LIZIZ(LIZ);
        receiver.LIZJ = (Throwable) aqS64S1100000_11.l1;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS64S1100000_11 aqS64S1100000_11, Object obj) {
        C66324Q1g receiver = (C66324Q1g) obj;
        o.LJIIJ(receiver, "$receiver");
        receiver.LIZIZ = "PreExecute";
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("expr:");
        LIZ.append(aqS64S1100000_11.s0.hashCode());
        receiver.LIZ = X1D.LIZIZ(LIZ);
        receiver.LIZJ = (Throwable) aqS64S1100000_11.l1;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS64S1100000_11 aqS64S1100000_11, Object obj) {
        String LJIILIIL;
        AEL it = (AEL) obj;
        o.LJIIIZ(it, "it");
        AbstractViewOnClickListenerC67619QgJ abstractViewOnClickListenerC67619QgJ = (AbstractViewOnClickListenerC67619QgJ) aqS64S1100000_11.l1;
        String str = aqS64S1100000_11.s0;
        abstractViewOnClickListenerC67619QgJ.getClass();
        int hashCode = str.hashCode();
        Float valueOf = Float.valueOf(0.0f);
        if (hashCode != 63879010) {
            if (hashCode != 65307009) {
                if (hashCode == 67692361 && str.equals("GECKO")) {
                    LJIILIIL = abstractViewOnClickListenerC67619QgJ.LJIILIIL(R.string.cfn, valueOf);
                }
                Integer num = abstractViewOnClickListenerC67619QgJ.LJLJLLL;
                o.LJI(num);
                LJIILIIL = abstractViewOnClickListenerC67619QgJ.LJIILIIL(num.intValue(), valueOf);
            } else {
                if (str.equals("DRAFT")) {
                    LJIILIIL = abstractViewOnClickListenerC67619QgJ.LJIILIIL(R.string.qx9, valueOf);
                }
                Integer num2 = abstractViewOnClickListenerC67619QgJ.LJLJLLL;
                o.LJI(num2);
                LJIILIIL = abstractViewOnClickListenerC67619QgJ.LJIILIIL(num2.intValue(), valueOf);
            }
        } else {
            if (str.equals("CACHE")) {
                Integer num3 = abstractViewOnClickListenerC67619QgJ.LJLJL;
                o.LJI(num3);
                LJIILIIL = abstractViewOnClickListenerC67619QgJ.LJIILIIL(num3.intValue(), valueOf);
            }
            Integer num22 = abstractViewOnClickListenerC67619QgJ.LJLJLLL;
            o.LJI(num22);
            LJIILIIL = abstractViewOnClickListenerC67619QgJ.LJIILIIL(num22.intValue(), valueOf);
        }
        return AEL.LJIILJJIL(it, LJIILIIL, false, null, false, false, false, 15355);
    }

    public static final Object invoke$6(AqS64S1100000_11 aqS64S1100000_11, Object obj) {
        C66324Q1g receiver = (C66324Q1g) obj;
        o.LJIIJ(receiver, "$receiver");
        receiver.LIZIZ = "Parse";
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("expr hash:");
        LIZ.append(aqS64S1100000_11.s0.hashCode());
        LIZ.append(" words:");
        LIZ.append(ORY.LJJJJLL((Q2U[]) aqS64S1100000_11.l1, null, null, null, C66329Q1l.LJLIL, 31));
        receiver.LIZ = X1D.LIZIZ(LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS64S1100000_11 aqS64S1100000_11, Object obj) {
        String str;
        C66324Q1g receiver = (C66324Q1g) obj;
        o.LJIIJ(receiver, "$receiver");
        receiver.LIZIZ = "Parse";
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("expr hash:");
        LIZ.append(aqS64S1100000_11.s0.hashCode());
        LIZ.append(" commands:");
        List list = (List) aqS64S1100000_11.l1;
        if (list != null) {
            str = ORZ.LLD(list, null, null, null, C66325Q1h.INSTANCE, 31);
        } else {
            str = null;
        }
        LIZ.append(str);
        receiver.LIZ = X1D.LIZIZ(LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS64S1100000_11 aqS64S1100000_11, Object obj) {
        LocationManager locationManager = (LocationManager) aqS64S1100000_11.l1;
        String str = aqS64S1100000_11.s0;
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(ImagePreloadExperiment.PRIORITY_DEFAULT, "android/location/LocationManager", "getLastKnownLocation", locationManager, new Object[]{str}, "android.location.Location", new C65300Pk0(false, "(Ljava/lang/String;)Landroid/location/Location;", "5180359958872162344"));
        if (LIZJ.LIZ) {
            return LIZJ.LIZIZ;
        }
        return locationManager.getLastKnownLocation(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS64S1100000_11(Q12 q12, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = q12;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS64S1100000_11(AbstractViewOnClickListenerC67619QgJ abstractViewOnClickListenerC67619QgJ, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = abstractViewOnClickListenerC67619QgJ;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS64S1100000_11(LocationManager locationManager, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = locationManager;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS64S1100000_11(TraceLogWrapApiImpl traceLogWrapApiImpl, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = traceLogWrapApiImpl;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS64S1100000_11(String str, Throwable th, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS64S1100000_11(String str, List list, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS64S1100000_11(String str, Q2U[] q2uArr, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = q2uArr;
    }
}
