package Y;

import X.AbstractC37134Ehm;
import X.AbstractC60548NpY;
import X.C141335gf;
import X.C36602EYc;
import X.C36605EYf;
import X.C37100EhE;
import X.C38184Eyi;
import X.C3C5;
import X.C60238NkY;
import X.C60292NlQ;
import X.C60299NlX;
import X.C60547NpX;
import X.EJ6;
import X.F3T;
import X.F5V;
import X.InterfaceC60276NlA;
import X.PVC;
import com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ACallableS35S1200000_6 implements Callable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS35S1200000_6 aCallableS35S1200000_6) {
        InterfaceC60276NlA interfaceC60276NlA;
        C60292NlQ kitInstanceApi = ((LynxBridgeModule) aCallableS35S1200000_6.l1).getKitInstanceApi();
        AbstractC60548NpY abstractC60548NpY = null;
        if (kitInstanceApi == null || (interfaceC60276NlA = (InterfaceC60276NlA) C60299NlX.LIZ(kitInstanceApi, InterfaceC60276NlA.class)) == null) {
            return null;
        }
        C60547NpX c60547NpX = new C60547NpX("bdx_monitor_bridge_duration", null, null, 254);
        F3T f3t = ((LynxBridgeModule) aCallableS35S1200000_6.l1).providerFactory;
        if (f3t != null) {
            abstractC60548NpY = (AbstractC60548NpY) f3t.LIZJ(AbstractC60548NpY.class);
        }
        c60547NpX.LIZJ = abstractC60548NpY;
        c60547NpX.LJII = ((C38184Eyi) aCallableS35S1200000_6.l2).LIZLLL();
        JSONObject jSONObject = new JSONObject();
        try {
            C3C5.m7constructorimpl(jSONObject.put("method_name", aCallableS35S1200000_6.s0));
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        c60547NpX.LJI = jSONObject;
        c60547NpX.LJFF = "lynx";
        c60547NpX.LJIIIIZZ = Boolean.TRUE;
        interfaceC60276NlA.LJ(c60547NpX);
        return interfaceC60276NlA;
    }

    public static final Object call$1(ACallableS35S1200000_6 aCallableS35S1200000_6) {
        C60238NkY c60238NkY = (C60238NkY) aCallableS35S1200000_6.l1;
        c60238NkY.getClass();
        InterfaceC60276NlA interfaceC60276NlA = (InterfaceC60276NlA) C60299NlX.LIZ(c60238NkY, InterfaceC60276NlA.class);
        if (interfaceC60276NlA == null) {
            return null;
        }
        C60547NpX c60547NpX = new C60547NpX("bdx_monitor_bridge_duration", null, null, 254);
        c60547NpX.LIZJ = ((C60238NkY) aCallableS35S1200000_6.l1).LJLLLLLL;
        c60547NpX.LJII = ((C38184Eyi) aCallableS35S1200000_6.l2).LIZLLL();
        JSONObject jSONObject = new JSONObject();
        try {
            C3C5.m7constructorimpl(jSONObject.put("method_name", aCallableS35S1200000_6.s0));
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        c60547NpX.LJI = jSONObject;
        c60547NpX.LJFF = "web";
        c60547NpX.LJIIIIZZ = Boolean.TRUE;
        interfaceC60276NlA.LJ(c60547NpX);
        return interfaceC60276NlA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a7, code lost:
    
        if (r0.needForceAssociateMsisdn() == true) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        if (r0.needForceAssociateMsisdn() == true) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0066, code lost:
    
        if (r4 != null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$2(Y.ACallableS35S1200000_6 r15) {
        /*
            java.lang.Object r0 = r15.l1
            X.F7I r0 = (X.F7I) r0
            java.lang.Object r3 = r15.l2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r1 = r15.s0
            r0.getClass()
            X.F7E r7 = X.F7E.LJI
            r7.getClass()
            X.F7J r0 = X.F7E.LIZJ
            r12 = 0
            if (r0 == 0) goto Lc2
            java.lang.String[] r5 = r0.LIZ()
        L1b:
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIJ(r3, r0)
            X.F7K r0 = X.F7E.LJ
            if (r0 == 0) goto Lbf
            java.lang.String r4 = r0.LIZ()
        L28:
            r2 = 1
            r6 = 0
            if (r4 == 0) goto L32
            int r0 = r4.length()
            if (r0 != 0) goto L7d
        L32:
            java.lang.String r0 = "phone"
            java.lang.Object r3 = X.C16880lQ.LLILL(r3, r0)
            boolean r0 = r3 instanceof android.telephony.TelephonyManager
            if (r0 != 0) goto Lbc
        L3c:
            android.telephony.TelephonyManager r12 = (android.telephony.TelephonyManager) r12
            if (r12 == 0) goto Lb9
            X.0Dg r8 = new X.0Dg
            r0 = 2
            r8.<init>(r0)
            java.lang.Object[] r13 = new java.lang.Object[r6]
            X.Pk0 r15 = new X.Pk0
            java.lang.String r3 = "()Ljava/lang/String;"
            java.lang.String r0 = "4578972334770050766"
            r15.<init>(r6, r3, r0)
            r9 = 100917(0x18a35, float:1.41415E-40)
            java.lang.String r10 = "android/telephony/TelephonyManager"
            java.lang.String r11 = "getSimOperator"
            java.lang.String r14 = "java.lang.String"
            X.Ff9 r3 = r8.LIZJ(r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = r3.LIZ
            if (r0 == 0) goto Lb4
            java.lang.Object r4 = r3.LIZIZ
            java.lang.String r4 = (java.lang.String) r4
        L66:
            if (r4 == 0) goto Lb9
        L68:
            java.lang.StringBuilder r3 = X.X1D.LIZ()
            java.lang.String r0 = "currentMccMnc:"
            r3.append(r0)
            r3.append(r4)
            java.lang.String r3 = X.X1D.LIZIZ(r3)
            java.lang.String r0 = "message"
            kotlin.jvm.internal.o.LJIIJ(r3, r0)
        L7d:
            if (r5 == 0) goto L85
            boolean r0 = X.ORY.LJJIJIIJIL(r4, r5)
            if (r0 == r2) goto L92
        L85:
            r7.getClass()
            X.F7K r0 = X.F7E.LJ
            if (r0 == 0) goto Lb1
            boolean r0 = r0.needForceAssociateMsisdn()
            if (r0 != r2) goto Lb1
        L92:
            X.F7K r0 = X.F7E.LJ
            if (r0 == 0) goto La9
            boolean r0 = r0.LIZIZ()
            if (r0 != r2) goto La9
            r7.getClass()
            X.F7K r0 = X.F7E.LJ
            if (r0 == 0) goto Lb1
            boolean r0 = r0.needForceAssociateMsisdn()
            if (r0 != r2) goto Lb1
        La9:
            X.F7O r0 = new X.F7O
            r0.<init>()
            r0.LIZ(r4, r1)
        Lb1:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        Lb4:
            java.lang.String r4 = r12.getSimOperator()
            goto L66
        Lb9:
            java.lang.String r4 = ""
            goto L68
        Lbc:
            r12 = r3
            goto L3c
        Lbf:
            r4 = r12
            goto L28
        Lc2:
            r5 = r12
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS35S1200000_6.call$2(Y.ACallableS35S1200000_6):java.lang.Object");
    }

    public static final Object call$3(ACallableS35S1200000_6 aCallableS35S1200000_6) {
        F5V f5v = (F5V) aCallableS35S1200000_6.l1;
        AbstractC37134Ehm abstractC37134Ehm = (AbstractC37134Ehm) aCallableS35S1200000_6.l2;
        String str = aCallableS35S1200000_6.s0;
        f5v.getClass();
        f5v.LJ(abstractC37134Ehm.LIZ).LIZJ(new C37100EhE(str, 0, 5));
        return null;
    }

    public static final Object call$4(ACallableS35S1200000_6 aCallableS35S1200000_6) {
        try {
            ArrayList arrayList = new ArrayList();
            if (((Map) aCallableS35S1200000_6.l1) != null && (!r0.isEmpty())) {
                for (Map.Entry entry : ((Map) aCallableS35S1200000_6.l1).entrySet()) {
                    arrayList.add(new EJ6((String) entry.getKey(), (String) entry.getValue()));
                }
            }
            String response = ((C36602EYc) aCallableS35S1200000_6.l2).LJLIL.doGet(aCallableS35S1200000_6.s0, Collections.emptyMap(), arrayList).execute().LIZIZ;
            o.LJIIIIZZ(response, "response");
            byte[] bytes = response.getBytes(PVC.LIZ);
            o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
            return new C36605EYf(true, bytes, null);
        } catch (Throwable th) {
            return new C36605EYf(false, null, th);
        }
    }

    public ACallableS35S1200000_6(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
