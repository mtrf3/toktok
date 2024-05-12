package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class CTH extends CTG {
    public final java.util.Map<String, CTI> LIZIZ = new LinkedHashMap();

    @Override // X.CTG, X.InterfaceC31335CRn
    public final void onUnload() {
        if (!this.LIZIZ.isEmpty()) {
            if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_public_screen_view_metrics")) {
                Iterator it = ((LinkedHashMap) this.LIZIZ).entrySet().iterator();
                while (it.hasNext()) {
                    C0K2.LIZ.LJI("ttlive_public_screen_view_metrics", new JSONObject(), null, ((CTI) ((Map.Entry) it.next()).getValue()).LJIIL);
                }
            }
            ((LinkedHashMap) this.LIZIZ).clear();
        }
    }

    @Override // X.CTG, X.CRP
    public final void LJ(CSR<? extends CRD, ? extends CSF<? extends CRD>> csr) {
        CTI LJJIJIIJIL = LJJIJIIJIL(csr.LJIIIIZZ());
        if (LJJIJIIJIL.LJIIJ > 0) {
            long uptimeMillis = (SystemClock.uptimeMillis() - LJJIJIIJIL.LJIIJ) + LJJIJIIJIL.LJIIJJI;
            LJJIJIIJIL.LJIIJJI = uptimeMillis;
            LJJIJIIJIL.LIZLLL++;
            LJJIJIIJIL.LJIIL.put("draw_total_duration", uptimeMillis);
            LJJIJIIJIL.LJIIL.put("draw_count", LJJIJIIJIL.LIZLLL);
            LJJIJIIJIL.LJIIJ = 0L;
        }
    }

    @Override // X.CTG, X.CRP
    public final void LJFF(CSR<? extends CRD, ? extends CSF<? extends CRD>> csr) {
        CTI LJJIJIIJIL = LJJIJIIJIL(csr.LJIIIIZZ());
        if (LJJIJIIJIL.LJI > 0) {
            long uptimeMillis = (SystemClock.uptimeMillis() - LJJIJIIJIL.LJI) + LJJIJIIJIL.LJII;
            LJJIJIIJIL.LJII = uptimeMillis;
            LJJIJIIJIL.LIZIZ++;
            LJJIJIIJIL.LJIIL.put("measure_total_duration", uptimeMillis);
            LJJIJIIJIL.LJIIL.put("measure_count", LJJIJIIJIL.LIZIZ);
            LJJIJIIJIL.LJI = 0L;
        }
    }

    @Override // X.CTG, X.CRP
    public final void LJIIJJI(CSR<? extends CRD, ? extends CSF<? extends CRD>> viewBinder) {
        o.LJIIIZ(viewBinder, "viewBinder");
        LJJIJIIJIL(viewBinder.LJIIIIZZ()).LJ = SystemClock.uptimeMillis();
    }

    @Override // X.CTG, X.CRP
    public final void LJIIL(CSR<? extends CRD, ? extends CSF<? extends CRD>> csr) {
        LJJIJIIJIL(csr.LJIIIIZZ()).LJIIIIZZ = SystemClock.uptimeMillis();
    }

    @Override // X.CTG, X.CRP
    public final void LJIILL(CSR<? extends CRD, ? extends CSF<? extends CRD>> viewBinder) {
        o.LJIIIZ(viewBinder, "viewBinder");
        CTI LJJIJIIJIL = LJJIJIIJIL(viewBinder.LJIIIIZZ());
        if (LJJIJIIJIL.LJ > 0) {
            long uptimeMillis = (SystemClock.uptimeMillis() - LJJIJIIJIL.LJ) + LJJIJIIJIL.LJFF;
            LJJIJIIJIL.LJFF = uptimeMillis;
            LJJIJIIJIL.LIZ++;
            LJJIJIIJIL.LJIIL.put("create_view_total_duration", uptimeMillis);
            LJJIJIIJIL.LJIIL.put("create_view_count", LJJIJIIJIL.LIZ);
            LJJIJIIJIL.LJ = 0L;
        }
    }

    @Override // X.CTG, X.CRP
    public final void LJIILLIIL(CSR<? extends CRD, ? extends CSF<? extends CRD>> csr) {
        LJJIJIIJIL(csr.LJIIIIZZ()).LJIIJ = SystemClock.uptimeMillis();
    }

    @Override // X.CTG, X.CRP
    public final void LJJI(CSR<? extends CRD, ? extends CSF<? extends CRD>> csr) {
        LJJIJIIJIL(csr.LJIIIIZZ()).LJI = SystemClock.uptimeMillis();
    }

    @Override // X.CTG, X.CRP
    public final void LJJIFFI(CSR<? extends CRD, ? extends CSF<? extends CRD>> csr) {
        CTI LJJIJIIJIL = LJJIJIIJIL(csr.LJIIIIZZ());
        if (LJJIJIIJIL.LJIIIIZZ > 0) {
            long uptimeMillis = (SystemClock.uptimeMillis() - LJJIJIIJIL.LJIIIIZZ) + LJJIJIIJIL.LJIIIZ;
            LJJIJIIJIL.LJIIIZ = uptimeMillis;
            LJJIJIIJIL.LIZJ++;
            LJJIJIIJIL.LJIIL.put("layout_total_duration", uptimeMillis);
            LJJIJIIJIL.LJIIL.put("layout_count", LJJIJIIJIL.LIZJ);
            LJJIJIIJIL.LJIIIIZZ = 0L;
        }
    }

    public final CTI LJJIJIIJIL(String str) {
        String str2;
        CTI cti = (CTI) ((LinkedHashMap) this.LIZIZ).get(str);
        if (cti == null) {
            cti = new CTI(0);
            cti.LJIIL.put("item_name", str);
            JSONObject jSONObject = cti.LJIIL;
            CQQ cqq = this.LIZ;
            if (cqq != null) {
                if (cqq.LJIIZILJ) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                jSONObject.put("is_extended_comment_filed", str2);
                this.LIZIZ.put(str, cti);
            } else {
                o.LJIJI("publicScreenContext");
                throw null;
            }
        }
        return cti;
    }
}
