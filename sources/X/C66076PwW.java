package X;

import Y.ARunnableS3S1101000_11;
import com.bytedance.helios.api.consumer.ApmEvent;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.PwW, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66076PwW {
    public static final java.util.Set<String> LIZ = new LinkedHashSet();

    public static void LIZ(int i, String str, Throwable th) {
        HandlerThreadC64418PPy.LIZ();
        HandlerThreadC64418PPy.LJLJJI.post(new ARunnableS3S1101000_11(i, th, str, 3));
    }

    public static void LIZIZ(int i, int i2, String str, Throwable th) {
        String str2;
        if (i != 0) {
            StringBuilder LIZ2 = C06830Op.LIZ("appOps apiType=", i2, " async -> ", str, " calledTime=");
            LIZ2.append(System.currentTimeMillis());
            C66063PwJ.LIZJ("Helios-Log-AppOps", X1D.LIZIZ(LIZ2), null);
            return;
        }
        String str3 = "unknown-api";
        if (th != null) {
            Package r0 = HeliosEnvImpl.class.getPackage();
            if (r0 == null || (str2 = r0.getName()) == null) {
                str2 = "com.bytedance.helios.sdk";
            }
            StackTraceElement[] stackTrace = th.getStackTrace();
            o.LJIIIIZZ(stackTrace, "throwable.stackTrace");
            Iterator it = ((ArrayList) ORY.LJLIIIL(stackTrace)).iterator();
            while (it.hasNext()) {
                StackTraceElement it2 = (StackTraceElement) it.next();
                o.LJIIIIZZ(it2, "it");
                String className = it2.getClassName();
                o.LJIIIIZZ(className, "it.className");
                if (!ujb.o.LJJJJJL(className)) {
                    String className2 = it2.getClassName();
                    o.LJIIIIZZ(className2, "it.className");
                    if (ujb.o.LJJJLIIL(className2, str2, false)) {
                        continue;
                    } else {
                        String className3 = it2.getClassName();
                        o.LJIIIIZZ(className3, "it.className");
                        if (ujb.o.LJJJLIIL(className3, "java.", false)) {
                            continue;
                        } else {
                            String className4 = it2.getClassName();
                            o.LJIIIIZZ(className4, "it.className");
                            if (ujb.o.LJJJLIIL(className4, "kotlin.", false)) {
                                continue;
                            } else {
                                String className5 = it2.getClassName();
                                o.LJIIIIZZ(className5, "it.className");
                                if (!ujb.o.LJJJLIIL(className5, "android.", false)) {
                                    String className6 = it2.getClassName();
                                    o.LJIIIIZZ(className6, "it.className");
                                    if (!ujb.o.LJJJLIIL(className6, "com.android.", false)) {
                                        break;
                                    }
                                }
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append(it2.getClassName());
                                LIZ3.append(".");
                                LIZ3.append(it2.getMethodName());
                                str3 = X1D.LIZIZ(LIZ3);
                            }
                        }
                    }
                }
            }
        }
        StringBuilder LJ = AnonymousClass028.LJ("appOps api=", str3, " apiType=", i2, " op=");
        LJ.append(str);
        LJ.append(" calledTime=");
        LJ.append(System.currentTimeMillis());
        C66063PwJ.LIZJ("Helios-Log-AppOps", X1D.LIZIZ(LJ), null);
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        if (!heliosEnvImpl.LJIIJ.interestedAppOps.contains(str)) {
            return;
        }
        HeliosEnvImpl heliosEnvImpl2 = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl2, "HeliosEnvImpl.get()");
        if (heliosEnvImpl2.LJIIJ.appOpsIgnoreKnownApi && C65986Pv4.LIZ.containsKey(str3)) {
            return;
        }
        if (LIZ.add(str3)) {
            ApmEvent apmEvent = new ApmEvent("helios_appops_api_count");
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(str3);
            LIZ4.append("-");
            LIZ4.append(str);
            apmEvent.LIZ(X1D.LIZIZ(LIZ4), "appops_api_name");
            C66059PwF.LIZIZ(apmEvent);
        }
        C66120PxE LIZ5 = C66127PxL.LIZ("appops");
        o.LJIIIIZZ(PQ0.LJFF, "LifecycleMonitor.get()");
        boolean LJFF = PQ0.LJFF();
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("AppOpsException_");
        LIZ6.append("OnNoted");
        String LIZIZ = X1D.LIZIZ(LIZ6);
        o.LJIIIZ(LIZIZ, "<set-?>");
        LIZ5.LJLZ = LIZIZ;
        o.LJIIIZ(str, "<set-?>");
        LIZ5.LJLJJL = str;
        LIZ5.LJLJLLL = !LJFF;
        LIZ5.LJLJJLL = th;
        o.LJIIIZ(str3, "<set-?>");
        LIZ5.LJLJJI = str3;
        LIZ5.LJLLJ = System.currentTimeMillis();
        LIZ5.LLD = 7;
        LIZ5.LJLJL = C37115EhT.LIZ(LIZ5.LJLJJI, null, th);
        C66059PwF.LIZIZ(LIZ5);
    }
}
