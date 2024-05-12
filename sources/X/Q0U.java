package X;

import com.bytedance.bpea.basics.Cert;
import com.google.gson.j;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q0U implements InterfaceC66311Q0t {
    @Override // X.InterfaceC66311Q0t
    public final String name() {
        return "RulerChecker";
    }

    @Override // X.InterfaceC66311Q0t
    public final C66300Q0i LIZ(OHW context) {
        String certToken;
        List list;
        String str;
        String str2;
        j jVar;
        j LJJIJ;
        j jVar2;
        j LJJIJ2;
        o.LJIIJ(context, "context");
        Cert cert = context.LIZIZ;
        C66300Q0i c66300Q0i = new C66300Q0i(0, null, 7);
        if (cert == null || (certToken = cert.certToken()) == null || certToken.length() == 0) {
            if (Q0O.LIZ) {
                Q0L.LIZ("RulerChecker", "certToken is empty,skip ");
            }
            return new C66300Q0i(-3004, "empty cert", 4);
        }
        LinkedHashMap LIZ = C0JU.LIZ("source", "bpea");
        LIZ.put("cert_token", cert.certToken());
        LIZ.put("entry_token", context.LIZJ);
        String[] strArr = context.LIZLLL;
        if (strArr != null) {
            list = ORY.LJJZZIII(strArr);
        } else {
            list = null;
        }
        LIZ.put("entry_datatypes", list);
        Integer num = context.LJ;
        if (num != null && num.equals(Integer.valueOf(EnumC39200Fa0.BPEA_ENTRY.getType()))) {
            LIZ.put("entry_category", "Wrapper");
        } else {
            LIZ.put("entry_category", "SDK");
        }
        LIZ.put("sdk_name", ((LinkedHashMap) context.LIZ).get("sdkName"));
        LIZ.put("method_name", ((LinkedHashMap) context.LIZ).get("methodName"));
        java.util.Map<String, Object> customInfo = cert.customInfo();
        if (customInfo != null) {
            for (Map.Entry<String, Object> entry : customInfo.entrySet()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("ruler_bpea_");
                LIZ2.append(entry.getKey());
                LIZ.put(X1D.LIZIZ(LIZ2), entry.getValue());
            }
        }
        if (Q0O.LIZ) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("params:");
            LIZ3.append(LIZ);
            Q0L.LIZ("RulerChecker", X1D.LIZIZ(LIZ3));
        }
        long nanoTime = System.nanoTime();
        Q11 LJ = Q1E.LJ(LIZ, C113554cx.LJJJLIIL());
        long nanoTime2 = System.nanoTime() - nanoTime;
        C78923UyF.LIZLLL(c66300Q0i, "rulerCost", Long.valueOf(nanoTime2));
        if (Q0O.LIZ) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("ruler result:");
            LIZ4.append(LJ);
            LIZ4.append("  cost:");
            LIZ4.append(((float) nanoTime2) / 1000000.0f);
            LIZ4.append("ms");
            Q0L.LIZ("RulerChecker", X1D.LIZIZ(LIZ4));
        }
        if (LJ.LIZ != 0 || LJ.LJI.isEmpty()) {
            return c66300Q0i;
        }
        try {
            C39522FfC c39522FfC = (C39522FfC) ORZ.LJLLLL(LJ.LJI);
            if (c39522FfC != null && (jVar2 = c39522FfC.LJ) != null && (LJJIJ2 = jVar2.LJIIZILJ().LJJIJ("action")) != null) {
                str = LJJIJ2.LJJIFFI();
            } else {
                str = null;
            }
            C39522FfC c39522FfC2 = (C39522FfC) ORZ.LJLLLL(LJ.LJI);
            if (c39522FfC2 != null && (jVar = c39522FfC2.LJ) != null && (LJJIJ = jVar.LJIIZILJ().LJJIJ("reason")) != null) {
                str2 = LJJIJ.LJJIFFI();
            } else {
                str2 = null;
            }
            if (o.LJ(str, "mark") || o.LJ(str, "block")) {
                C78923UyF.LIZLLL(c66300Q0i, "bpea_ruler_input", LIZ);
                C78923UyF.LIZLLL(c66300Q0i, "bpea_ruler_error_code", Integer.valueOf(LJ.LIZ));
                C78923UyF.LIZLLL(c66300Q0i, "bpea_ruler_error_msg", LJ.LIZIZ);
                C78923UyF.LIZLLL(c66300Q0i, "bpea_ruler_result", LJ);
                c66300Q0i.LIZLLL = -3001;
                if (str2 == null) {
                    str2 = "ruler hit";
                }
                c66300Q0i.LJ = str2;
                c66300Q0i.LIZ = o.LJ(str, "block");
                return c66300Q0i;
            }
            return new C66300Q0i(0, null, 7);
        } catch (Throwable th) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("parse ruler result fail:");
            LIZ5.append(th.getLocalizedMessage());
            return new C66300Q0i(-3002, X1D.LIZIZ(LIZ5), 4);
        }
    }
}
