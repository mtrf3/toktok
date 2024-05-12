package kotlin.jvm.internal;

import X.ARN;
import X.AbstractC65781Prl;
import X.C16880lQ;
import X.C34K;
import X.C35936E8m;
import X.C64421PQb;
import X.C65777Prh;
import X.C66155Pxn;
import X.C66292Q0a;
import X.C66295Q0d;
import X.C66297Q0f;
import X.C66299Q0h;
import X.C66300Q0i;
import X.C66307Q0p;
import X.C66324Q1g;
import X.C68540QvA;
import X.C68990R5u;
import X.C76800UCe;
import X.C78923UyF;
import X.EnumC66303Q0l;
import X.EnumC66308Q0q;
import X.FMX;
import X.HandlerC67596Qfw;
import X.InterfaceC66311Q0t;
import X.InterfaceC88472Yns;
import X.OHW;
import X.PC4;
import X.PIO;
import X.PIR;
import X.PIT;
import X.PIU;
import X.POK;
import X.Q0C;
import X.Q0L;
import X.Q0O;
import X.Q0P;
import X.Q0Z;
import X.Q2D;
import X.Q2E;
import X.X1D;
import android.app.Activity;
import android.app.job.JobParameters;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.login.trusted.LoginHistoryFeatureStateResponse;
import com.ss.android.ugc.aweme.services.LoginMethodService;
import com.ss.android.ugc.aweme.trace.UnsampledTraceLoggerImpl;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class AqS142S0200000_11 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            default:
                return null;
        }
    }

    public final C64421PQb invoke$0(String key) {
        o.LJIIIIZZ(key, "key");
        ((JSONObject) this.l0).opt(key);
        return new C64421PQb(CastIntegerProtector.parseInt(key), ((JSONObject) this.l1).optInt(key));
    }

    public final void invoke$1(LoginHistoryFeatureStateResponse loginHistoryFeatureStateResponse) {
        int i;
        LoginHistoryFeatureStateResponse.Data data;
        if (loginHistoryFeatureStateResponse != null && (data = loginHistoryFeatureStateResponse.data) != null) {
            i = data.status;
        } else {
            i = -1;
        }
        String curSecUserId = ((LoginMethodService) this.l1).getCurSecUserId();
        if (curSecUserId != null && i != -1 && i != 0) {
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            C68540QvA.LIZLLL(curSecUserId, z);
        }
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) this.l0;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Integer.valueOf(i));
        }
    }

    public static final Object invoke$0(AqS142S0200000_11 aqS142S0200000_11, Object obj) {
        long longValue = ((Number) obj).longValue();
        PIU piu = (PIU) aqS142S0200000_11.l0;
        if (piu != null) {
            piu.LIZJ((PIR) aqS142S0200000_11.l1);
        }
        PIR pir = (PIR) aqS142S0200000_11.l1;
        if (pir != null) {
            pir.LIZ(longValue, longValue);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS142S0200000_11 aqS142S0200000_11, Object obj) {
        PIO pio;
        ((Number) obj).longValue();
        PIR pir = (PIR) aqS142S0200000_11.l0;
        if (pir != null) {
            Object obj2 = ((POK) aqS142S0200000_11.l1).LJI;
            String str = null;
            if ((obj2 instanceof PIT) && (pio = (PIO) obj2) != null) {
                str = pio.LIZIZ();
            }
            pir.LJFF(str);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS142S0200000_11 aqS142S0200000_11, Object it) {
        boolean z;
        o.LJIIIZ(it, "it");
        C66155Pxn c66155Pxn = (C66155Pxn) it;
        int i = c66155Pxn.LJLIL;
        C66155Pxn c66155Pxn2 = (C66155Pxn) aqS142S0200000_11.l1;
        if (i == c66155Pxn2.LJLIL && c66155Pxn.LJLILLLLZI == c66155Pxn2.LJLILLLLZI) {
            z = true;
            ((C34K) aqS142S0200000_11.l0).element = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$11(AqS142S0200000_11 aqS142S0200000_11, Object obj) {
        ARN it = (ARN) obj;
        o.LJIIIZ(it, "it");
        SmartRouter.buildRoute((Activity) aqS142S0200000_11.l0, ((C68990R5u) aqS142S0200000_11.l1).LIZJ).open();
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", ((C68990R5u) aqS142S0200000_11.l1).LIZIZ);
        c35936E8m.LIZLLL("platform", ((C68990R5u) aqS142S0200000_11.l1).LIZ);
        FMX.LJIIL("account_recover_notify_confirm", c35936E8m.LIZ);
        if (!((Activity) aqS142S0200000_11.l0).isFinishing()) {
            it.LIZ().LIZIZ(null);
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AqS142S0200000_11 aqS142S0200000_11, Object obj) {
        return aqS142S0200000_11.invoke$0((String) obj);
    }

    public static final Object invoke$3(AqS142S0200000_11 aqS142S0200000_11, Object obj) {
        ((Boolean) obj).booleanValue();
        ((HandlerC67596Qfw) aqS142S0200000_11.l0).LIZIZ.jobFinished((JobParameters) aqS142S0200000_11.l1, false);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AqS142S0200000_11 aqS142S0200000_11, Object obj) {
        aqS142S0200000_11.invoke$1((LoginHistoryFeatureStateResponse) obj);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a8, code lost:
    
        if (r8 != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.AqS142S0200000_11 r15, java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS142S0200000_11.invoke$5(kotlin.jvm.internal.AqS142S0200000_11, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$6(AqS142S0200000_11 aqS142S0200000_11, Object obj) {
        C66324Q1g receiver = (C66324Q1g) obj;
        o.LJIIJ(receiver, "$receiver");
        receiver.LIZIZ = "Execute";
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("function:");
        LIZ.append(((Q2D) aqS142S0200000_11.l0).LIZ.LIZ);
        LIZ.append(" result:");
        LIZ.append(aqS142S0200000_11.l1);
        receiver.LIZ = X1D.LIZIZ(LIZ);
        receiver.LIZJ = receiver.LIZJ;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS142S0200000_11 aqS142S0200000_11, Object obj) {
        C66324Q1g receiver = (C66324Q1g) obj;
        o.LJIIJ(receiver, "$receiver");
        receiver.LIZIZ = "Execute";
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("identifier:");
        LIZ.append(((Q2E) aqS142S0200000_11.l0).LIZ);
        LIZ.append(" result:");
        LIZ.append(aqS142S0200000_11.l1);
        receiver.LIZ = X1D.LIZIZ(LIZ);
        receiver.LIZJ = receiver.LIZJ;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS142S0200000_11 aqS142S0200000_11, Object obj) {
        C66300Q0i c66300Q0i;
        Object LIZ;
        C66297Q0f event = (C66297Q0f) obj;
        o.LJIIJ(event, "event");
        OHW ohw = (OHW) aqS142S0200000_11.l0;
        try {
            long nanoTime = System.nanoTime();
            InterfaceC66311Q0t[] LIZ2 = Q0P.LIZ(ohw);
            if (Q0O.LIZ) {
                long nanoTime2 = System.nanoTime() - nanoTime;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("getCheckListCostTime:");
                LIZ3.append(((float) nanoTime2) / 1000.0f);
                LIZ3.append("us");
                Q0L.LIZ("CertCheckCenter", X1D.LIZIZ(LIZ3));
            }
            int i = 0;
            c66300Q0i = new C66300Q0i(0, null, 7);
            if (LIZ2 != null) {
                if (Q0O.LIZ) {
                    String arrays = Arrays.toString(LIZ2);
                    o.LJIIIIZZ(arrays, "java.util.Arrays.toString(this)");
                    Q0L.LIZ("CertCheckCenter", "checkerList is ".concat(arrays));
                }
                int length = LIZ2.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    InterfaceC66311Q0t interfaceC66311Q0t = LIZ2[i];
                    C66300Q0i c66300Q0i2 = (C66300Q0i) C66292Q0a.LIZIZ(ohw, interfaceC66311Q0t.name(), C66292Q0a.LIZ, new AqS142S0200000_11(interfaceC66311Q0t, ohw, 9));
                    JSONObject LJIIIIZZ = C78923UyF.LJIIIIZZ(c66300Q0i2);
                    if (LJIIIIZZ != null) {
                        C78923UyF.LIZIZ(c66300Q0i, LJIIIIZZ);
                    }
                    if (c66300Q0i2.LIZIZ) {
                        boolean z = Q0O.LIZ;
                        break;
                    }
                    i++;
                }
                if (Q0O.LIZ) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("checkResult=");
                    LIZ4.append(c66300Q0i);
                    Q0L.LIZ("CertCheckCenter", X1D.LIZIZ(LIZ4));
                }
            }
        } catch (Q0C e) {
            if (Q0O.LIZ) {
                C16880lQ.LLLLIIL(e);
            }
            throw e;
        } catch (Throwable th) {
            C66297Q0f.LJIIL.getClass();
            C66297Q0f LIZ5 = C66299Q0h.LIZ(ohw, "InnerError");
            LIZ5.LIZJ(EnumC66303Q0l.WARN);
            LIZ5.LIZJ = -1;
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("inner error:");
            LIZ6.append(th.getLocalizedMessage());
            LIZ5.LIZLLL = X1D.LIZIZ(LIZ6);
            LIZ5.LJI = th;
            Q0Z.LIZ(LIZ5);
            String str = LIZ5.LIZLLL;
            if (str == null && (str = th.getLocalizedMessage()) == null) {
                str = "";
            }
            c66300Q0i = new C66300Q0i(-1, str, 4);
        }
        event.LJ.LIZ();
        OHW ohw2 = (OHW) aqS142S0200000_11.l0;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS142S0200000_11.l1;
        if (interfaceC88472Yns == null) {
            LIZ = C66292Q0a.LIZ(ohw2, null);
        } else {
            LIZ = C66292Q0a.LIZ(ohw2, new AqS158S0200000_11(interfaceC88472Yns, c66300Q0i, 19));
        }
        c66300Q0i.LJFF = LIZ;
        event.LIZJ = c66300Q0i.LIZLLL;
        event.LIZLLL = c66300Q0i.LJ;
        return c66300Q0i;
    }

    public static final Object invoke$9(AqS142S0200000_11 aqS142S0200000_11, Object obj) {
        EnumC66308Q0q enumC66308Q0q;
        C66297Q0f event = (C66297Q0f) obj;
        o.LJIIJ(event, "event");
        C66300Q0i getExtraInfo = ((InterfaceC66311Q0t) aqS142S0200000_11.l0).LIZ((OHW) aqS142S0200000_11.l1);
        o.LJIIJ(getExtraInfo, "$this$getExtraInfo");
        Object obj2 = ((LinkedHashMap) getExtraInfo.LIZJ).get("extraInfo");
        if (!C65777Prh.LJII(obj2)) {
            obj2 = null;
        }
        event.LJII = (Map) obj2;
        if (getExtraInfo.LIZLLL != 0) {
            if (getExtraInfo.LIZ) {
                enumC66308Q0q = C66295Q0d.LIZIZ(getExtraInfo.LIZLLL, (OHW) aqS142S0200000_11.l1, ((InterfaceC66311Q0t) aqS142S0200000_11.l0).name());
                if (Q0O.LIZ) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("checkerName: ");
                    LIZ.append(((InterfaceC66311Q0t) aqS142S0200000_11.l0).name());
                    LIZ.append(" resultCode:");
                    LIZ.append(getExtraInfo.LIZLLL);
                    LIZ.append(" >>>>>> handler action is :");
                    LIZ.append(enumC66308Q0q);
                    Q0L.LIZ("MainCheck", X1D.LIZIZ(LIZ));
                }
                if (enumC66308Q0q == null) {
                    Q0L.LIZ("MainCheck", "handler action is null, warn by default");
                    enumC66308Q0q = EnumC66308Q0q.WARNING;
                }
            } else {
                if (Q0O.LIZ) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("checkerName: ");
                    LIZ2.append(((InterfaceC66311Q0t) aqS142S0200000_11.l0).name());
                    LIZ2.append(" resultCode:");
                    LIZ2.append(getExtraInfo.LIZLLL);
                    LIZ2.append(" >>>>>> needAbnormalHandler is false , warn by default");
                    Q0L.LIZ("MainCheck", X1D.LIZIZ(LIZ2));
                }
                enumC66308Q0q = EnumC66308Q0q.WARNING;
            }
            int i = C66307Q0p.LIZ[enumC66308Q0q.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        throw new Q0C(getExtraInfo.LIZLLL, getExtraInfo.LJ);
                    }
                } else {
                    event.LIZJ(EnumC66303Q0l.WARN);
                    event.LJI = new Throwable();
                }
            } else {
                event.LIZJ(EnumC66303Q0l.INFO);
                getExtraInfo.LIZLLL = 0;
                getExtraInfo.LJ = "";
            }
        }
        event.LIZJ = getExtraInfo.LIZLLL;
        event.LIZLLL = getExtraInfo.LJ;
        return getExtraInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS142S0200000_11(C34K c34k, C66155Pxn c66155Pxn, int i) {
        super(1);
        this.$t = i;
        this.l0 = c34k;
        this.l1 = c66155Pxn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS142S0200000_11(OHW ohw, InterfaceC88472Yns interfaceC88472Yns, int i) {
        super(1);
        this.$t = i;
        this.l0 = ohw;
        this.l1 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS142S0200000_11(PIR pir, POK pok, int i) {
        super(1);
        this.$t = i;
        this.l0 = pir;
        this.l1 = pok;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS142S0200000_11(PIU piu, PIR pir, int i) {
        super(1);
        this.$t = i;
        this.l0 = piu;
        this.l1 = pir;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS142S0200000_11(InterfaceC66311Q0t interfaceC66311Q0t, OHW ohw, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC66311Q0t;
        this.l1 = ohw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS142S0200000_11(Q2D q2d, Object obj, int i) {
        super(1);
        this.$t = i;
        this.l0 = q2d;
        this.l1 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS142S0200000_11(Q2E q2e, Object obj, int i) {
        super(1);
        this.$t = i;
        this.l0 = q2e;
        this.l1 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS142S0200000_11(HandlerC67596Qfw handlerC67596Qfw, JobParameters jobParameters, int i) {
        super(1);
        this.$t = i;
        this.l0 = handlerC67596Qfw;
        this.l1 = jobParameters;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS142S0200000_11(Activity activity, C68990R5u c68990R5u, int i) {
        super(1);
        this.$t = i;
        this.l0 = activity;
        this.l1 = c68990R5u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS142S0200000_11(LoginMethodService loginMethodService, LoginMethodService loginMethodService2, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        super(1);
        this.$t = interfaceC88472Yns;
        this.l1 = loginMethodService;
        this.l0 = loginMethodService2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS142S0200000_11(UnsampledTraceLoggerImpl unsampledTraceLoggerImpl, PC4 pc4, int i) {
        super(1);
        this.$t = i;
        this.l0 = unsampledTraceLoggerImpl;
        this.l1 = pc4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS142S0200000_11(JSONObject jSONObject, JSONObject jSONObject2, int i) {
        super(1);
        this.$t = i;
        this.l0 = jSONObject;
        this.l1 = jSONObject2;
    }
}
