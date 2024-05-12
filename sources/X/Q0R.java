package X;

import com.bytedance.bpea.basics.Cert;
import com.bytedance.pumbaa.common.interfaces.IExceptionMonitor;
import com.bytedance.pumbaa.common.interfaces.ILogger;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Q0R extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C66314Q0w LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ Throwable LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ C66120PxE LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0R(C66314Q0w c66314Q0w, boolean z, Throwable th, String str, C66120PxE c66120PxE) {
        super(0);
        this.LJLIL = c66314Q0w;
        this.LJLILLLLZI = z;
        this.LJLJI = th;
        this.LJLJJI = str;
        this.LJLJJL = c66120PxE;
    }

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ C76800UCe invoke() {
        invoke2();
        return C76800UCe.LIZ;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OHW ohw;
        String str;
        Cert cert;
        String certToken;
        String str2;
        Integer num;
        String str3;
        Cert cert2;
        C66120PxE c66120PxE = this.LJLJJL;
        C66314Q0w c66314Q0w = this.LJLIL;
        OHW ohw2 = null;
        if (c66314Q0w != null) {
            ohw = c66314Q0w.LIZ;
        } else {
            ohw = null;
        }
        boolean z = this.LJLILLLLZI;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("eventType", "COVER_RATE");
            if (ohw == null) {
                str2 = null;
            } else {
                str2 = ohw.LIZJ;
            }
            jSONObject.put("entryToken", str2);
            if (ohw != null) {
                num = ohw.LJ;
            } else {
                num = null;
            }
            jSONObject.put("entryCategory", num);
            jSONObject.put("isBPEA", z);
            jSONObject.put("monitorApi", c66120PxE.LJLJI);
            JSONObject jSONObject2 = new JSONObject();
            if (ohw == null || (cert2 = ohw.LIZIZ) == null) {
                str3 = null;
            } else {
                str3 = cert2.certToken();
            }
            jSONObject2.put("certToken", str3);
            String LIZ = Q0S.LIZ(c66120PxE);
            if (LIZ != null) {
                C66310Q0s.LIZIZ.monitorEvent(LIZ, jSONObject, null, jSONObject2);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("reportCoverRateEvent error:");
            LIZ2.append(e.getMessage());
            String message = X1D.LIZIZ(LIZ2);
            o.LJIIIZ(message, "message");
            ILogger iLogger = Q0N.LIZ;
            if (iLogger != null) {
                iLogger.e("BPEAxMonitor", message, null);
            }
        }
        if (!this.LJLILLLLZI) {
            C66120PxE c66120PxE2 = this.LJLJJL;
            C66314Q0w c66314Q0w2 = this.LJLIL;
            if (c66314Q0w2 != null) {
                ohw2 = c66314Q0w2.LIZ;
            }
            Throwable th = this.LJLJI;
            String str4 = this.LJLJJI;
            if (!Q0S.LIZLLL.contains(str4)) {
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("monitorApi", String.valueOf(c66120PxE2.LJLJI));
            String str5 = "";
            if (ohw2 == null || (str = ohw2.LIZJ) == null) {
                str = "";
            }
            linkedHashMap.put("entryToken", str);
            if (ohw2 != null && (cert = ohw2.LIZIZ) != null && (certToken = cert.certToken()) != null) {
                str5 = certToken;
            }
            linkedHashMap.put("certToken", str5);
            if (th == null) {
                th = new Throwable();
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("bpea_cover_error_");
            LIZ3.append(str4);
            String message2 = X1D.LIZIZ(LIZ3);
            o.LJIIIZ(message2, "message");
            IExceptionMonitor iExceptionMonitor = Q0M.LIZ;
            if (iExceptionMonitor == null) {
                return;
            }
            iExceptionMonitor.monitorThrowable(th, message2, linkedHashMap);
        }
    }
}
