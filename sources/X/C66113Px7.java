package X;

import Y.ARunnableS30S0200000_11;
import android.hardware.Sensor;
import android.util.Pair;
import com.bytedance.helios.api.consumer.ApmEvent;
import com.bytedance.helios.api.consumer.ControlExtra;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.Px7, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66113Px7 {
    public static final ArrayList<Integer> LIZ = C47261Igj.LJII(102701, 102700);

    public static final boolean LIZ(C66120PxE event) {
        o.LJIIIZ(event, "event");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C66037Pvt.LIZIZ.LIZ(2, event);
            if (!LIZJ(event.LJLJI) || !LIZLLL(event)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("triggerInvokeAction: not enabled, return id=");
                LIZ2.append(event.LJLJI);
                LIZ2.append(" calledTime=");
                LIZ2.append(event.LJLLJ);
                C66063PwJ.LIZIZ("Helios-Log-Api-Call", X1D.LIZIZ(LIZ2));
                return false;
            }
            C65929Pu9.LIZ(currentTimeMillis, "handleBeforeInvoke", false);
            return true;
        } finally {
            C65929Pu9.LIZ(currentTimeMillis, "handleBeforeInvoke", false);
        }
    }

    public static final Pair<Boolean, Object> LIZIZ(C66120PxE event) {
        OSJ osj;
        o.LJIIIZ(event, "event");
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        if (!heliosEnvImpl.LJIIJJI() || !LIZLLL(event)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("triggerInterceptAction: not enabled, return id=");
            LIZ2.append(event.LJLJI);
            LIZ2.append(" calledTime=");
            LIZ2.append(event.LJLLJ);
            C66063PwJ.LIZIZ("Helios-Log-Api-Call", X1D.LIZIZ(LIZ2));
            return new Pair<>(Boolean.FALSE, null);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("handleIntercept: eventId=");
        LIZ3.append(event.LJLJI);
        LIZ3.append(" calledTime=");
        LIZ3.append(event.LJLLJ);
        LIZ3.append(" eventSource=");
        LIZ3.append(event.LJLIL);
        LIZ3.append(" callSite=");
        LIZ3.append(event.LLIILZL);
        LIZ3.append(" background=");
        LIZ3.append(event.LJLJLLL);
        C66063PwJ.LIZIZ("Helios-Log-Api-Call", X1D.LIZIZ(LIZ3));
        ApmEvent apmEvent = new ApmEvent("sky_eye_apm_log");
        apmEvent.LIZ("MethodTimeCost_us", "EventName");
        C64397PPd c64397PPd = new C64397PPd(apmEvent, "handleParameter");
        C66195PyR.LIZ.getClass();
        int i = event.LJLJI;
        if (i != 102900) {
            switch (i) {
                case 100700:
                case 100701:
                    try {
                        Object[] parameters = event.LLI.getParameters();
                        if (parameters != null && parameters.length >= 2) {
                            Object obj = parameters[1];
                            if (obj instanceof Sensor) {
                                event.LJLLLL.put("api_sub_type", String.valueOf(((Sensor) obj).getType()));
                            } else if (obj instanceof Integer) {
                                event.LJLLLL.put("api_sub_type", String.valueOf(obj));
                            }
                        }
                        C3C5.m7constructorimpl(C76800UCe.LIZ);
                        break;
                    } catch (Throwable th) {
                        C3C5.m7constructorimpl(C141335gf.LIZ(th));
                        break;
                    }
                    break;
                case 100702:
                case 100703:
                    try {
                        Object[] parameters2 = event.LLI.getParameters();
                        if (parameters2 != null && parameters2.length >= 1) {
                            Object obj2 = parameters2[0];
                            if (obj2 instanceof Integer) {
                                event.LJLLLL.put("api_sub_type", String.valueOf(obj2));
                            }
                        }
                        C3C5.m7constructorimpl(C76800UCe.LIZ);
                        break;
                    } catch (Throwable th2) {
                        C3C5.m7constructorimpl(C141335gf.LIZ(th2));
                        break;
                    }
                    break;
                default:
                    switch (i) {
                        case 102600:
                        case 102601:
                        case 102603:
                            try {
                                Object[] parameters3 = event.LLI.getParameters();
                                if (parameters3 != null && parameters3.length >= 1) {
                                    Object obj3 = parameters3[0];
                                    if (obj3 instanceof Object[]) {
                                        Object[] array = Arrays.copyOf((Object[]) obj3, ((Object[]) obj3).length);
                                        o.LJIIIIZZ(array, "array");
                                        C61898ORa.LJJIIJ(array);
                                        event.LJLLLL.put("api_sub_type", ORY.LJJJJLL(array, ",", null, null, null, 62));
                                    }
                                }
                                C3C5.m7constructorimpl(C76800UCe.LIZ);
                                break;
                            } catch (Throwable th3) {
                                C3C5.m7constructorimpl(C141335gf.LIZ(th3));
                                break;
                            }
                            break;
                        case 102602:
                            try {
                                Object[] parameters4 = event.LLI.getParameters();
                                if (parameters4 != null && parameters4.length >= 2) {
                                    Object obj4 = parameters4[1];
                                    if (obj4 instanceof Object[]) {
                                        Object[] array2 = Arrays.copyOf((Object[]) obj4, ((Object[]) obj4).length);
                                        o.LJIIIIZZ(array2, "array");
                                        C61898ORa.LJJIIJ(array2);
                                        event.LJLLLL.put("api_sub_type", ORY.LJJJJLL(array2, ",", null, null, null, 62));
                                    }
                                }
                                C3C5.m7constructorimpl(C76800UCe.LIZ);
                                break;
                            } catch (Throwable th4) {
                                C3C5.m7constructorimpl(C141335gf.LIZ(th4));
                                break;
                            }
                            break;
                    }
            }
        } else {
            try {
                Object[] parameters5 = event.LLI.getParameters();
                if (parameters5 != null && parameters5.length >= 1) {
                    Object obj5 = parameters5[0];
                    if (obj5 instanceof String) {
                        event.LJLLLL.put("api_sub_type", String.valueOf(obj5));
                    }
                }
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th5) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th5));
            }
        }
        c64397PPd.LIZ();
        C66037Pvt c66037Pvt = C66037Pvt.LIZIZ;
        c66037Pvt.LIZ(6, event);
        HeliosEnvImpl heliosEnvImpl2 = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl2, "HeliosEnvImpl.get()");
        if (heliosEnvImpl2.LJIIJ.interceptIgnoreApiIds.contains(Integer.valueOf(event.LJLJI))) {
            return new Pair<>(Boolean.FALSE, null);
        }
        C64397PPd c64397PPd2 = new C64397PPd(apmEvent, "handleIntercept");
        Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
        o.LJIIIIZZ(LLLLIIIILLL, "Thread.currentThread()");
        String name = LLLLIIIILLL.getName();
        o.LJIIIIZZ(name, "Thread.currentThread().name");
        event.LL = name;
        c66037Pvt.LIZ(0, event);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(event.LLIIL);
        LIZ4.append(".");
        LIZ4.append(event.LLIILII);
        String LIZIZ = X1D.LIZIZ(LIZ4);
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("handleIntercept id=");
        LIZ5.append(event.LJLJI);
        LIZ5.append(" name=");
        LIZ5.append(LIZIZ);
        LIZ5.append(" returnType=");
        LIZ5.append(event.LLI.getReturnType());
        LIZ5.append(" calledTime=");
        LIZ5.append(event.LJLLJ);
        LIZ5.append(" reflection=");
        LIZ5.append(event.LJZI);
        C66063PwJ.LIZIZ("Helios-Intercept-Api", X1D.LIZIZ(LIZ5));
        if (C66089Pwj.LIZIZ.LIZ(event, true)) {
            event.LJLZ = "SensitiveApiInterceptException";
            ControlExtra controlExtra = event.LLI;
            Object obj6 = controlExtra.getInterceptResult().second;
            if (obj6 != null) {
                event.LJLLLL.put("returnResult", obj6.toString());
            }
            String returnType = controlExtra.getReturnType();
            if (returnType != null) {
                event.LJLLLL.put("returnType", returnType);
            }
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("actionIntercept id=");
            LIZ6.append(event.LJLJI);
            LIZ6.append(" calledTime=");
            LIZ6.append(event.LJLLJ);
            LIZ6.append(" returnType=");
            LIZ6.append(event.LLI.getReturnType());
            LIZ6.append(" returnResult=");
            LIZ6.append(event.LLI.getInterceptResult().second);
            C66063PwJ.LIZIZ("Helios-Intercept-Api", X1D.LIZIZ(LIZ6));
            Pair<Boolean, Object> interceptResult = event.LLI.getInterceptResult();
            osj = new OSJ(Boolean.TRUE, interceptResult.first, interceptResult.second);
        } else {
            Boolean bool = Boolean.FALSE;
            osj = new OSJ(bool, bool, null);
        }
        if (((Boolean) osj.getFirst()).booleanValue()) {
            Throwable th6 = new Throwable("SensitiveApiInterceptException");
            HandlerThreadC64418PPy.LIZ();
            HandlerThreadC64418PPy.LJLJJI.post(new ARunnableS30S0200000_11(th6, event, 75));
        }
        Pair<Boolean, Object> pair = new Pair<>(osj.getSecond(), osj.getThird());
        c64397PPd2.LIZ();
        Object obj7 = pair.first;
        o.LJIIIIZZ(obj7, "result.first");
        if (((Boolean) obj7).booleanValue()) {
            C64397PPd c64397PPd3 = new C64397PPd(apmEvent, "statisticsNvWaFact");
            C66083Pwd.LJFF(event);
            c64397PPd3.LIZ();
        }
        if (apmEvent.mMetrics.size() != 0) {
            C66059PwF.LIZIZ(apmEvent);
        }
        return pair;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (r1.LJLILLLLZI == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(int r4) {
        /*
            com.bytedance.helios.sdk.HeliosEnvImpl r1 = com.bytedance.helios.sdk.HeliosEnvImpl.get()
            java.lang.String r0 = "HeliosEnvImpl.get()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            boolean r0 = r1.LJIIJJI()
            r3 = 0
            if (r0 == 0) goto L4d
            X.Puv r2 = X.C65972Puq.LIZIZ
            if (r2 == 0) goto L4d
            java.util.Map<java.lang.Integer, X.Puu> r1 = X.C65972Puq.LIZLLL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r1 = r1.get(r0)
            X.Puu r1 = (X.C65976Puu) r1
            if (r1 != 0) goto L41
            X.PyH r0 = X.C66170Py2.LIZIZ
            r0.getClass()
            X.Py2 r0 = X.C66170Py2.LIZ
            X.Pxk r0 = r0.LIZ(r4)
            if (r0 == 0) goto L4b
            java.lang.String r1 = r0.LIZ
        L33:
            java.util.Map<java.lang.String, X.Puu> r0 = X.C65972Puq.LIZJ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r1 = r0.get(r1)
            X.Puu r1 = (X.C65976Puu) r1
            if (r1 != 0) goto L41
            X.Puu r1 = r2.LJLJL
        L41:
            boolean r0 = r1.LJLIL
            if (r0 != 0) goto L49
            boolean r0 = r1.LJLILLLLZI
            if (r0 == 0) goto L4d
        L49:
            r3 = 1
        L4a:
            return r3
        L4b:
            r1 = 0
            goto L33
        L4d:
            java.util.ArrayList<java.lang.Integer> r1 = X.C66113Px7.LIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L4a
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66113Px7.LIZJ(int):boolean");
    }

    public static boolean LIZLLL(C66120PxE event) {
        o.LJIIIZ(event, "event");
        if (o.LJ(event.LJLIL, "binder")) {
            if (!HeliosEnvImpl.get().LJIIL.contains(Integer.valueOf(event.LJLJI))) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("this event only support bytex: id=");
                LIZ2.append(event.LJLJI);
                C66063PwJ.LIZIZ("Helios-Log-Api-Call", X1D.LIZIZ(LIZ2));
                return false;
            }
            return true;
        }
        return true;
    }
}
