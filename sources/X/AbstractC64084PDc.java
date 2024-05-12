package X;

import X.InterfaceC64090PDi;
import Y.ARunnableS30S0200000_11;
import Y.ARunnableS47S0100000_11;
import com.bytedance.apm.doctor.DoctorManager;
import java.util.LinkedList;
import org.json.JSONObject;

/* renamed from: X.PDc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC64084PDc<T extends InterfaceC64090PDi> implements InterfaceC64103PDv {
    public static int LJLJJLL = 1000;
    public static boolean LJLJL;
    public final LinkedList<T> LJLIL = new LinkedList<>();
    public volatile boolean LJLILLLLZI;
    public volatile boolean LJLJI;
    public boolean LJLJJI;
    public PDX LJLJJL;

    @Override // X.InterfaceC64103PDv
    public final void LIZ() {
        this.LJLILLLLZI = true;
        F9U.LIZ.LIZJ(new ARunnableS47S0100000_11(this, 161));
        if (C09970aH.LJII()) {
            DoctorManager.getInstance().LIZIZ("APM_SETTING_READY", null);
        }
    }

    public boolean LIZIZ(T t) {
        return true;
    }

    @Override // X.InterfaceC64103PDv
    public void LJ(JSONObject jSONObject, boolean z) {
    }

    public abstract void LJFF(T t);

    public void LJII(T t) {
    }

    public final void LIZLLL(T t) {
        PE0 pe0 = F9U.LIZ;
        if (!pe0.LIZIZ()) {
            pe0.LIZJ(new ARunnableS30S0200000_11(this, t, 78));
        } else {
            LJI(t);
        }
    }

    public final void LJI(T t) {
        if (!LIZIZ(t)) {
            return;
        }
        LJII(t);
        if (this.LJLILLLLZI) {
            LJFF(t);
            return;
        }
        if (t == null) {
            return;
        }
        synchronized (this.LJLIL) {
            if (this.LJLIL.size() > LJLJJLL) {
                T poll = this.LJLIL.poll();
                if (LJLJL && !this.LJLJI) {
                    C10070aR c10070aR = C10060aQ.LIZ;
                    if (c10070aR.LIZ != null && !c10070aR.LIZIZ.contains("apm_cache_buffer_full")) {
                        c10070aR.LIZIZ.add("apm_cache_buffer_full");
                        InterfaceC10050aP interfaceC10050aP = c10070aR.LIZ;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("apm_");
                        LIZ.append("apm_cache_buffer_full");
                        String LIZIZ = X1D.LIZIZ(LIZ);
                        ((PDS) interfaceC10050aP).getClass();
                        PEH.LIZIZ(LIZIZ);
                    }
                    this.LJLJI = true;
                }
                if (poll != null) {
                    try {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("apm_cache_buffer_full:");
                        LIZ2.append(poll.LIZ());
                        C80036Vb6.LJIIIIZZ("apm_debug", X1D.LIZIZ(LIZ2));
                    } catch (Exception unused) {
                    }
                }
            }
            this.LJLIL.add(t);
        }
    }

    public final void LIZJ(String str, String str2, JSONObject jSONObject, boolean z, boolean z2) {
        if (new C03880Dg(2).LIZJ(400500, "com/bytedance/apm/data/BaseDataPipeline", "logSend", this, new Object[]{str, str2, jSONObject, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.FALSE}, "void", new C65300Pk0(false, "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ZZZ)V", "-3179592181876767329")).LIZ) {
            return;
        }
        LJIIIZ(str, str2, jSONObject, z, z2, false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Q, X.PMg] */
    public final void LJIIIIZZ(String str, String str2, JSONObject jSONObject, boolean z, boolean z2) {
        if (jSONObject == null) {
            LIZJ(str, str2, jSONObject, z, z2);
            return;
        }
        PPC<C64322PMg, Boolean> ppc = new PPC<>();
        ppc.LIZ = new C64322PMg(str, str2, jSONObject);
        PY7.LIZLLL.LJIIIIZZ(ppc);
        if (ppc.LJFF == PPD.INTERCEPT) {
            return;
        }
        LIZJ(str, str2, jSONObject, z, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        if (r5 != null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(java.lang.String r8, java.lang.String r9, org.json.JSONObject r10, boolean r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC64084PDc.LJIIIZ(java.lang.String, java.lang.String, org.json.JSONObject, boolean, boolean, boolean):void");
    }
}
