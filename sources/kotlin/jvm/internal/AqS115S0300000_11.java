package kotlin.jvm.internal;

import X.ARH;
import X.AbstractC65781Prl;
import X.AnonymousClass636;
import X.C16880lQ;
import X.C65935PuF;
import X.C66210Pyg;
import X.C66293Q0b;
import X.C66297Q0f;
import X.C68990R5u;
import X.C76800UCe;
import X.C78983UzD;
import X.EnumC39200Fa0;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.OHW;
import X.OJT;
import X.OR7;
import X.ORY;
import X.POL;
import X.POM;
import X.POP;
import X.POS;
import X.POT;
import X.POV;
import X.POW;
import X.POZ;
import X.PQ6;
import X.PTV;
import X.PTW;
import X.Q08;
import X.Q0C;
import X.Q0F;
import X.Q0L;
import X.Q0O;
import X.Q11;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.pumbaa.pdp.api.IPolicyDecision;
import com.bytedance.pumbaa.ruler.adapter.api.RuleEngineConfig;
import com.ss.android.ugc.aweme.account.util.ConfirmConfig;
import com.ss.android.ugc.aweme.trace.TraceLogWrapApiImpl;
import com.vega.nletodraft.model.Video;
import java.io.File;
import java.io.FileOutputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public class AqS115S0300000_11 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS115S0300000_11 aqS115S0300000_11, Object obj) {
        POP pop;
        long longValue = ((Number) obj).longValue();
        ((TraceLogWrapApiImpl) aqS115S0300000_11.l0).LIZIZ.LIZLLL(((POV) aqS115S0300000_11.l1).LIZ, POW.LIZJ((POZ) aqS115S0300000_11.l2));
        POL pol = ((TraceLogWrapApiImpl) aqS115S0300000_11.l0).LIZIZ;
        POV pov = (POV) aqS115S0300000_11.l1;
        String str = pov.LIZ;
        if (pov.LIZLLL) {
            pop = POP.CUSTOM_EVENT;
        } else {
            pop = POP.EVENT;
        }
        pol.LJ(str, new POM(pop, null, false, 0, pov.LIZJ, null, 0, 0L, null, 494));
        ((TraceLogWrapApiImpl) aqS115S0300000_11.l0).LJIIL((POV) aqS115S0300000_11.l1, longValue);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS115S0300000_11 aqS115S0300000_11, Object obj) {
        long longValue = ((Number) obj).longValue();
        ((TraceLogWrapApiImpl) aqS115S0300000_11.l0).LIZIZ.LIZLLL(((POT) aqS115S0300000_11.l1).LIZ, POW.LIZJ((POZ) aqS115S0300000_11.l2));
        POL pol = ((TraceLogWrapApiImpl) aqS115S0300000_11.l0).LIZIZ;
        POT pot = (POT) aqS115S0300000_11.l1;
        String str = pot.LIZ;
        POP pop = POP.NET_API;
        String str2 = pot.LIZJ;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        int i = pot.LIZLLL;
        long j = pot.LJ;
        String str4 = pot.LJFF;
        if (str4 != null) {
            str3 = str4;
        }
        pol.LJ(str, new POM(pop, null, false, 0, null, str2, i, j, str3, 30));
        ((TraceLogWrapApiImpl) aqS115S0300000_11.l0).LJIIL((POT) aqS115S0300000_11.l1, longValue);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS115S0300000_11 aqS115S0300000_11, Object obj) {
        long longValue = ((Number) obj).longValue();
        ((TraceLogWrapApiImpl) aqS115S0300000_11.l0).LIZIZ.LIZLLL(((POS) aqS115S0300000_11.l1).LIZ, POW.LIZJ((POZ) aqS115S0300000_11.l2));
        POL pol = ((TraceLogWrapApiImpl) aqS115S0300000_11.l0).LIZIZ;
        POS pos = (POS) aqS115S0300000_11.l1;
        String str = pos.LIZ;
        POP pop = POP.PAGE;
        String str2 = pos.LIZJ;
        if (str2 == null) {
            str2 = "";
        }
        pol.LJ(str, new POM(pop, str2, o.LJ(pos.LIZLLL, Boolean.TRUE), ((POS) aqS115S0300000_11.l1).LJ, null, null, 0, 0L, null, 496));
        ((TraceLogWrapApiImpl) aqS115S0300000_11.l0).LJIIL((POS) aqS115S0300000_11.l1, longValue);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4 A[Catch: all -> 0x00e1, TryCatch #0 {all -> 0x00e1, blocks: (B:3:0x0007, B:5:0x0014, B:6:0x0016, B:8:0x002a, B:9:0x002c, B:11:0x004b, B:12:0x004d, B:14:0x0061, B:15:0x0063, B:17:0x00ba, B:21:0x00c6, B:24:0x00d6, B:29:0x00d4), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AqS115S0300000_11 r4, java.lang.Object r5) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS115S0300000_11.invoke$3(kotlin.jvm.internal.AqS115S0300000_11, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$4(AqS115S0300000_11 aqS115S0300000_11, Object obj) {
        String str;
        List list;
        Q0F q0f;
        Integer num;
        Map<String, Object> customInfo;
        C66297Q0f event = (C66297Q0f) obj;
        o.LJIIJ(event, "event");
        OHW ohw = (OHW) aqS115S0300000_11.l0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Cert cert = ohw.LIZIZ;
        String str2 = null;
        if (cert != null) {
            str = cert.certToken();
        } else {
            str = null;
        }
        linkedHashMap.put("cert_token", str);
        linkedHashMap.put("entry_token", ohw.LIZJ);
        linkedHashMap.put("api_id", Integer.valueOf(ohw.LJI));
        String[] strArr = ohw.LIZLLL;
        if (strArr != null) {
            list = ORY.LJJZZIII(strArr);
        } else {
            list = null;
        }
        linkedHashMap.put("entry_datatypes", list);
        Integer num2 = ohw.LJ;
        if (num2 != null && num2.equals(Integer.valueOf(EnumC39200Fa0.BPEA_ENTRY.getType()))) {
            linkedHashMap.put("entry_category", "Wrapper");
        } else {
            linkedHashMap.put("entry_category", "SDK");
        }
        linkedHashMap.put("sdk_name", ((LinkedHashMap) ohw.LIZ).get("sdkName"));
        linkedHashMap.put("method_name", ((LinkedHashMap) ohw.LIZ).get("methodName"));
        Cert cert2 = ohw.LIZIZ;
        if (cert2 != null && (customInfo = cert2.customInfo()) != null) {
            for (Map.Entry<String, Object> entry : customInfo.entrySet()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("ruler_bpea_");
                LIZ.append(entry.getKey());
                linkedHashMap.put(X1D.LIZIZ(LIZ), entry.getValue());
            }
        }
        IPolicyDecision iPolicyDecision = (IPolicyDecision) aqS115S0300000_11.l1;
        OHW ohw2 = (OHW) aqS115S0300000_11.l0;
        int i = ohw2.LJI;
        if (C66293Q0b.LIZIZ(ohw2)) {
            q0f = new Q0F(ohw2);
        } else {
            if (Q0O.LIZ) {
                Q0L.LIZ("SandboxManager", "don't need sandbox check , return null pdp callback");
            }
            q0f = null;
        }
        C66210Pyg LIZIZ = iPolicyDecision.LIZIZ(linkedHashMap, "bpea", i, null, q0f, (InterfaceC65784Pro) aqS115S0300000_11.l2);
        if (Q0O.LIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("policyDecision result>>");
            LIZ2.append(LIZIZ);
            String msg = X1D.LIZIZ(LIZ2);
            o.LJIIJ(msg, "msg");
        }
        if (LIZIZ.LJLIL == 0) {
            OHW context = (OHW) aqS115S0300000_11.l0;
            o.LJIIJ(context, "context");
            if (C66293Q0b.LIZIZ(context) && (!o.LJ(((LinkedHashMap) context.LIZ).get("sandboxExecuted"), Boolean.TRUE))) {
                C66293Q0b.LIZJ(-4002, context, "sandbox not executed");
            }
            return LIZIZ.LJLJI;
        }
        Q11 q11 = LIZIZ.LJLJJLL;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("bpea_ruler_input", linkedHashMap);
        if (q11 != null) {
            num = Integer.valueOf(q11.LIZ);
        } else {
            num = null;
        }
        linkedHashMap2.put("bpea_ruler_error_code", num);
        if (q11 != null) {
            str2 = q11.LIZIZ;
        }
        linkedHashMap2.put("bpea_ruler_error_msg", str2);
        linkedHashMap2.put("bpea_ruler_result", q11);
        Map<String, Object> map = event.LJII;
        if (map != null) {
            map.putAll(linkedHashMap2);
        } else {
            event.LJII = linkedHashMap2;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("pdp request fail:");
        LIZ3.append(LIZIZ.LJLIL);
        LIZ3.append(" >> ");
        LIZ3.append(LIZIZ.LJLILLLLZI);
        throw new Q0C(-3001, X1D.LIZIZ(LIZ3));
    }

    public static final Object invoke$5(AqS115S0300000_11 aqS115S0300000_11, Object obj) {
        String str;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            str = ((Video) aqS115S0300000_11.l0).path;
        } else {
            File LIZ = OJT.LIZ.LIZ((Context) aqS115S0300000_11.l2, "cc_creative_cover");
            PQ6 pq6 = PQ6.LIZ;
            String absolutePath = LIZ.getAbsolutePath();
            o.LJIIIIZZ(absolutePath, "videoCover.absolutePath");
            synchronized (pq6) {
                try {
                    File file = new File(absolutePath);
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    File file2 = new File(o.LJIILLIIL(".tmp", absolutePath));
                    if (!file2.exists()) {
                        PTW.LIZ().i("CoverUtils", o.LJIILLIIL(Boolean.valueOf(file2.createNewFile()), "tmpFile create is "));
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                        AnonymousClass636.LJFF(fileOutputStream, null);
                        if (file.exists()) {
                            C16880lQ.LLLZZIL(file);
                        }
                        if (!file2.renameTo(file)) {
                            OR7.LLLIIIL(file2, file, true, 4);
                            C16880lQ.LLLZZIL(file2);
                        }
                        file.setLastModified(SystemClock.uptimeMillis());
                    } finally {
                    }
                } catch (Throwable th) {
                    C78983UzD.LJIJ(th, "CoverUtils saveBitmap error");
                }
            }
            str = "cc_creative_cover";
        }
        ((PTV) aqS115S0300000_11.l1).LIZ((Context) aqS115S0300000_11.l2, str);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS115S0300000_11 aqS115S0300000_11, Object obj) {
        String str;
        String str2;
        ARH buttonGroup = (ARH) obj;
        o.LJIIIZ(buttonGroup, "$this$buttonGroup");
        ConfirmConfig confirmConfig = (ConfirmConfig) aqS115S0300000_11.l0;
        String str3 = "";
        if (confirmConfig == null || (str = confirmConfig.okBtnText) == null) {
            str = "";
        }
        buttonGroup.LJFF(str, new AqS142S0200000_11((Activity) aqS115S0300000_11.l1, (C68990R5u) aqS115S0300000_11.l2, 11));
        ConfirmConfig confirmConfig2 = (ConfirmConfig) aqS115S0300000_11.l0;
        if (confirmConfig2 != null && (str2 = confirmConfig2.cancelBtnText) != null) {
            str3 = str2;
        }
        buttonGroup.LJII(str3, new AqS167S0100000_1((Activity) aqS115S0300000_11.l1, 479));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS115S0300000_11(OHW ohw, IPolicyDecision iPolicyDecision, AqS158S0200000_11 aqS158S0200000_11, int i) {
        super(1);
        this.$t = i;
        this.l0 = ohw;
        this.l1 = iPolicyDecision;
        this.l2 = aqS158S0200000_11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS115S0300000_11(Q08 q08, RuleEngineConfig ruleEngineConfig, C65935PuF c65935PuF, int i) {
        super(1);
        this.$t = i;
        this.l0 = q08;
        this.l1 = ruleEngineConfig;
        this.l2 = c65935PuF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS115S0300000_11(ConfirmConfig confirmConfig, Activity activity, C68990R5u c68990R5u, int i) {
        super(1);
        this.$t = i;
        this.l0 = confirmConfig;
        this.l1 = activity;
        this.l2 = c68990R5u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS115S0300000_11(TraceLogWrapApiImpl traceLogWrapApiImpl, POS pos, POZ poz, int i) {
        super(1);
        this.$t = i;
        this.l0 = traceLogWrapApiImpl;
        this.l1 = pos;
        this.l2 = poz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS115S0300000_11(TraceLogWrapApiImpl traceLogWrapApiImpl, POT pot, POZ poz, int i) {
        super(1);
        this.$t = i;
        this.l0 = traceLogWrapApiImpl;
        this.l1 = pot;
        this.l2 = poz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS115S0300000_11(TraceLogWrapApiImpl traceLogWrapApiImpl, POV pov, POZ poz, int i) {
        super(1);
        this.$t = i;
        this.l0 = traceLogWrapApiImpl;
        this.l1 = pov;
        this.l2 = poz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS115S0300000_11(Video video, PTV ptv, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = video;
        this.l1 = ptv;
        this.l2 = context;
    }
}
