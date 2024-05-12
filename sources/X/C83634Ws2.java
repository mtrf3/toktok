package X;

import com.bytedance.bpea.basics.Cert;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Ws2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83634Ws2 implements InterfaceC83723WtT {
    public final java.util.Map<String, C46519INn> LIZ = new LinkedHashMap();
    public final java.util.Map<String, C46519INn> LIZIZ = new LinkedHashMap();
    public InterfaceC73364Sqm LIZJ;
    public final C83699Wt5 LIZLLL;
    public final C83626Wru LJ;
    public final InterfaceC121044p2 LJFF;

    public final void LIZIZ(C83644WsC c83644WsC) {
        EnumC46517INl enumC46517INl;
        EnumC46518INm enumC46518INm;
        String str;
        C46519INn c46519INn;
        String c83644WsC2 = c83644WsC.toString();
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SensitiveApiManagement: handle SensitiveApiEvent: ");
        LIZ.append(c83644WsC2);
        LIZLLL.i(X1D.LIZIZ(LIZ));
        if (!((LinkedHashMap) this.LIZIZ).keySet().contains(c83644WsC.LIZ)) {
            return;
        }
        if (o.LJ(c83644WsC.LIZ, "type_scene_cover")) {
            InterfaceC83686Wss interfaceC83686Wss = (InterfaceC83686Wss) c83644WsC.LIZJ.LJLILLLLZI;
            if (interfaceC83686Wss != null) {
                str = interfaceC83686Wss.LIZIZ();
            } else {
                str = null;
            }
            if (o.LJ(str, "action_name_start_preview") && (c46519INn = (C46519INn) ((LinkedHashMap) this.LIZIZ).get("type_activity_lifecycle")) != null && c46519INn.LIZ != EnumC46517INl.ALLOW_OPEN_CAMERA) {
                this.LIZLLL.LIZ.ms0(true);
            }
        }
        String str2 = c83644WsC.LIZ;
        C83677Wsj c83677Wsj = c83644WsC.LIZIZ;
        C46519INn c46519INn2 = (C46519INn) ((LinkedHashMap) this.LIZIZ).get(str2);
        if (c46519INn2 != null) {
            int i = c83677Wsj.LJLIL;
            if (i != 1) {
                if (i != 2) {
                    EnumC46517INl enumC46517INl2 = c46519INn2.LIZ;
                    enumC46517INl = EnumC46517INl.ALLOW_OPEN_CAMERA;
                    if (enumC46517INl2 != enumC46517INl) {
                        enumC46517INl = EnumC46517INl.DISALLOW_OPEN_CAMERA;
                    }
                } else {
                    enumC46517INl = EnumC46517INl.DISALLOW_OPEN_CAMERA;
                }
            } else {
                enumC46517INl = EnumC46517INl.ALLOW_OPEN_CAMERA;
            }
            int i2 = c83677Wsj.LJLILLLLZI;
            if (i2 != 1) {
                if (i2 != 2) {
                    EnumC46518INm enumC46518INm2 = c46519INn2.LIZIZ;
                    enumC46518INm = EnumC46518INm.ALLOW_OPEN_MIC;
                    if (enumC46518INm2 != enumC46518INm) {
                        enumC46518INm = EnumC46518INm.DISALLOW_OPEN_MIC;
                    }
                } else {
                    enumC46518INm = EnumC46518INm.DISALLOW_OPEN_MIC;
                }
            } else {
                enumC46518INm = EnumC46518INm.ALLOW_OPEN_MIC;
            }
            this.LIZIZ.put(str2, new C46519INn(enumC46517INl, enumC46518INm));
        }
        String str3 = c83644WsC.LIZ;
        NDG ndg = c83644WsC.LIZJ;
        InterfaceC83686Wss interfaceC83686Wss2 = (InterfaceC83686Wss) ndg.LJLILLLLZI;
        if (interfaceC83686Wss2 != null) {
            if (this.LJFF.LIZJ(str3, interfaceC83686Wss2.LIZJ(), this.LIZIZ)) {
                this.LIZLLL.getClass();
                C6QQ.LIZ(new AqS164S0100000_14(ndg, 345));
                return;
            }
        }
        String str4 = "+++++++++SensitiveApiAction not allowed+++++++++\n";
        for (Map.Entry entry : ((LinkedHashMap) this.LIZIZ).entrySet()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str4);
            LIZ2.append(((C46519INn) C1FJ.LIZJ(LIZ2, (String) entry.getKey(), ": ", entry)).toString());
            LIZ2.append("\n");
            str4 = X1D.LIZIZ(LIZ2);
        }
        C5NP LIZLLL2 = C82891Wg3.LIZLLL();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("SensitiveApiManagement: reject SensitiveApiEvent: current context is ");
        LIZ3.append(str4);
        LIZLLL2.i(X1D.LIZIZ(LIZ3));
    }

    public final void LIZ(C46519INn c46519INn, AbstractC83637Ws5 eventStream) {
        o.LJIIIZ(eventStream, "eventStream");
        this.LIZ.put(eventStream.getType(), c46519INn);
        this.LIZIZ.put(eventStream.getType(), c46519INn);
        ((ArrayList) eventStream.LIZ).add(new C83633Ws1(this));
    }

    public final void LIZJ(EnumC83718WtO apiType, Cert cert) {
        List<Integer> LJJIJ;
        InterfaceC73364Sqm interfaceC73364Sqm;
        String str;
        o.LJIIIZ(apiType, "apiType");
        int i = C83717WtN.LIZ[apiType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                LJJIJ = C47261Igj.LJJIJ(2);
            } else {
                throw new C162476Zf();
            }
        } else {
            LJJIJ = C47261Igj.LJJIJ(0);
        }
        if (!this.LJFF.LIZJ("type_ui_operation", LJJIJ, this.LIZIZ) && !ORZ.LJLJJI(cert, C47261Igj.LJJIJIIJI(C83661WsT.LIZ, C83661WsT.LIZIZ)) && (interfaceC73364Sqm = this.LIZJ) != null) {
            String str2 = "";
            if (!LJJIJ.contains(0)) {
                str = "";
            } else {
                java.util.Map<String, C46519INn> map = this.LIZIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                    if (((C46519INn) entry.getValue()).LIZ != EnumC46517INl.ALLOW_OPEN_CAMERA) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                java.util.Set keySet = linkedHashMap.keySet();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("camera: ");
                LIZ.append(ORZ.LLD(keySet, ",", null, null, null, 62));
                str = X1D.LIZIZ(LIZ);
            }
            if (LJJIJ.contains(2)) {
                java.util.Map<String, C46519INn> map2 = this.LIZIZ;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : ((LinkedHashMap) map2).entrySet()) {
                    if (((C46519INn) entry2.getValue()).LIZIZ != EnumC46518INm.ALLOW_OPEN_MIC) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                java.util.Set keySet2 = linkedHashMap2.keySet();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("mic: ");
                LIZ2.append(ORZ.LLD(keySet2, ",", null, null, null, 62));
                str2 = X1D.LIZIZ(LIZ2);
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(str);
            LIZ3.append(" | ");
            LIZ3.append(str2);
            interfaceC73364Sqm.LIZ(cert, X1D.LIZIZ(LIZ3));
        }
    }

    public C83634Ws2(C83699Wt5 c83699Wt5, C83626Wru c83626Wru, C79081V1x c79081V1x) {
        this.LIZLLL = c83699Wt5;
        this.LJ = c83626Wru;
        this.LJFF = c79081V1x;
    }
}
