package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PBP implements InterfaceC64047PBr {
    public static volatile PBP LJFF = new PBP();
    public PB6 LIZ;
    public PB7 LIZIZ;
    public volatile boolean LIZJ;
    public InterfaceC64052PBw LIZLLL;
    public final C64041PBl LJ = new C64041PBl(this);

    @Override // X.InterfaceC64047PBr
    public final void LIZ(InterfaceC64036PBg interfaceC64036PBg) {
        if (!this.LIZJ) {
            synchronized (this) {
                if (!this.LIZJ) {
                    if (C78248UnM.LJIIJ()) {
                        C64028PAy.LIZ("APM-Slardar", "Initializing SlardarHandler...");
                    }
                    PC6.LIZIZ().LIZJ();
                    C64025PAv.LIZ.LIZ(C78248UnM.LJLJJI);
                    InterfaceC64043PBn interfaceC64043PBn = (InterfaceC64043PBn) PGH.LIZ(InterfaceC64043PBn.class);
                    if (interfaceC64043PBn != null) {
                        LIZJ(interfaceC64043PBn.getConfig());
                    }
                    if (this.LIZLLL == null) {
                        this.LIZLLL = (InterfaceC64052PBw) PGH.LIZ(InterfaceC64052PBw.class);
                    }
                    PB6 pb6 = new PB6(PC7.LIZ(), O5Y.LJJII(), O5Y.LJIL());
                    this.LIZ = pb6;
                    PBE pbe = PBB.LIZ;
                    pbe.LIZLLL = pb6;
                    PBZ.LJ.LIZ(pbe);
                    PBZ pbz = PBZ.LJ;
                    PBN pbn = PBK.LIZ;
                    pbz.LIZ(pbn);
                    PBZ pbz2 = PBZ.LJ;
                    pbz2.getClass();
                    if (PC5.LJJIIZ()) {
                        C64071PCp.LIZ(PD6.IO).LIZJ(new C64030PBa(pbz2));
                    }
                    pbe.LIZJ();
                    pbn.getClass();
                    pbn.LIZIZ = new C64031PBb(pbn);
                    C64071PCp.LIZ(PD6.IO).LIZJ(pbn.LIZIZ);
                    this.LIZJ = true;
                }
            }
        }
        JSONObject LIZ = interfaceC64036PBg.LIZ();
        if (PEA.LIZ.contains(interfaceC64036PBg.LIZIZ()) || "tracing".equals(interfaceC64036PBg.LIZIZ())) {
            LIZIZ(LIZ, false);
        } else {
            if (!C64025PAv.LIZ.LIZJ(PC5.LJIIZILJ(), LIZ)) {
                if (C78248UnM.LJIIJ()) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("push failed: event(aid=");
                    LIZ2.append(PC5.LJIIZILJ());
                    LIZ2.append(" is downgraded: ");
                    LIZ2.append(LIZ.toString());
                    C64028PAy.LIZ("APM-Slardar", X1D.LIZIZ(LIZ2));
                    return;
                }
                return;
            }
            LIZIZ(LIZ, true);
        }
        if (C78248UnM.LJIIJ()) {
            PBV.LIZ(LIZ, interfaceC64036PBg.LIZIZ(), true);
        }
        if (interfaceC64036PBg.LIZJ()) {
            if (this.LIZIZ == null) {
                PB7 pb7 = new PB7(PC7.LIZ());
                this.LIZIZ = pb7;
                PBB.LIZ.LJ = pb7;
            }
            this.LIZIZ.LIZJ(LIZ);
            return;
        }
        this.LIZ.LIZLLL(LIZ);
    }

    public final synchronized void LIZJ(PBY pby) {
        if (pby != null) {
            C64038PBi.LIZ.LJIIL = pby;
            PBE pbe = PBB.LIZ;
            pbe.LJFF(pby.LJII);
            long j = pby.LIZ;
            if (j <= 0) {
                pbe.getClass();
            } else {
                pbe.LIZIZ = j;
            }
            PBZ.LJ.LIZIZ(pby.LJIIIIZZ, pby.LJIIIZ);
            PBO.LJIIJ = pby.LJIIJ;
        }
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setSlardarHandlerConfig:");
            LIZ.append(pby);
            C64028PAy.LIZ("APM-Slardar", X1D.LIZIZ(LIZ));
        }
    }

    public final void LIZIZ(JSONObject jSONObject, boolean z) {
        int LIZ;
        try {
            if (!TextUtils.isEmpty(PC5.LJLJJL.LLIZLLLIL())) {
                jSONObject.put("session_id", PC5.LJLJJL.LLIZLLLIL());
            }
            if (jSONObject.isNull("network_type")) {
                EnumC48190Ivi LLJJI = C16880lQ.LLJJI(C78248UnM.LJLJJI);
                jSONObject.put("network_type", LLJJI.getValue());
                if ((LLJJI.is2G() || LLJJI.is3GOrHigher()) && (LIZ = C64051PBv.LIZ(C78248UnM.LJLJJI, this.LJ)) != -10000) {
                    jSONObject.put("network_type_code", LIZ);
                }
            }
            if (jSONObject.isNull("timestamp") || jSONObject.optLong("timestamp") <= 0) {
                jSONObject.put("timestamp", System.currentTimeMillis());
            }
            if (jSONObject.isNull("sid")) {
                jSONObject.put("sid", PC5.LJJII());
            }
            jSONObject.put("process_name", PC5.LJIJJ());
            if (z) {
                jSONObject.put("seq_no", C64027PAx.LIZ.LIZ());
            }
        } catch (Exception unused) {
        }
    }
}
