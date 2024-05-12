package X;

import Y.AfS64S0200000_15;
import Y.AfS67S0100000_15;
import Y.IDaS224S0100000_15;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment.LanguageDetail;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class XS7 extends XS5 {
    public C73495Sst LJIJ;
    public C73495Sst LJIJI;
    public final C6B8 LJIJJ;
    public volatile boolean LJIJJLI;
    public LanguageDetail LJIL;

    @Override // X.XS5
    public final void LJIIIIZZ() {
        this.LJFF = null;
        this.LJI = null;
    }

    @Override // X.XS5
    public final void LIZ() {
        C73495Sst c73495Sst = this.LJIJI;
        if (c73495Sst != null && !c73495Sst.isDisposed()) {
            C73495Sst c73495Sst2 = this.LJIJI;
            if (c73495Sst2 != null) {
                c73495Sst2.dispose();
            }
            LJ();
            C126984yc.LIZIZ();
        }
    }

    @Override // X.XS5
    public final boolean LJI() {
        return this.LJIJJ.hasChanged(this.LIZ);
    }

    @Override // X.XS5
    public final void LJIIJJI() {
        C73495Sst c73495Sst = this.LJIJ;
        if (c73495Sst != null && !c73495Sst.isDisposed()) {
            C73495Sst c73495Sst2 = this.LJIJ;
            if (c73495Sst2 != null) {
                c73495Sst2.dispose();
            }
            LJ();
            C126984yc.LIZIZ();
        }
        LJIILLIIL();
    }

    public final void LJIILLIIL() {
        CreativeInfo creativeInfo = this.LIZ.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
        H7B.LJ("RecognizeCaptionExecutor delete audio file");
        C39579Fg7.LJIL(new File(C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJIL(creativeInfo, "output.aac")).getPath());
        C39579Fg7.LJIL(new File(C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJIL(creativeInfo, "origin.aac")).getPath());
        C39579Fg7.LJIL(new File(C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJIL(creativeInfo, "outputmix.aac")).getPath());
        this.LJIIL = 0L;
        this.LJIILIIL = "";
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = null;
    }

    @Override // X.XS5
    public final void LJII(NLEModel nLEModel) {
        C73495Sst c73495Sst = this.LJIJ;
        if (c73495Sst != null && !c73495Sst.isDisposed()) {
            return;
        }
        this.LJIIJJI = new XSA();
        C73898SzO LJJIIZ = AbstractC73638SvC.LJJIIZ(AbstractC73638SvC.LJI(new XS9(this)).LJJIIJ(T16.LIZ()), AbstractC73638SvC.LJI(new XS8(this, nLEModel)).LJJIIJ(T16.LIZ()), UW6.LJLIL);
        long j = this.LJIIIIZZ;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AbstractC73946T0k abstractC73946T0k = T16.LIZIZ;
        C73320Sq4.LIZ(timeUnit, "unit is null");
        C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
        this.LJIJ = (C73495Sst) new C73500Ssy(LJJIIZ, j, timeUnit, abstractC73946T0k, null).LJJII(new AfS64S0200000_15(this, nLEModel, 7), new AfS64S0200000_15(this, nLEModel, 8));
    }

    @Override // X.XS5
    public final void LJIIIZ(NLEModel nLEModel) {
        this.LJIIZILJ = "";
        this.LJIJJLI = true;
        this.LJIILLIIL = SystemClock.elapsedRealtime();
        C73495Sst c73495Sst = this.LJIJ;
        if (c73495Sst != null && !c73495Sst.isDisposed()) {
            return;
        }
        LJIIZILJ(this.LJIIIIZZ, true, true, "", nLEModel);
        this.LJIJJLI = false;
    }

    public final void LJIIL(int i) {
        double d;
        this.LJIIJJI.LIZ = SystemClock.elapsedRealtime() - this.LJIILLIIL;
        XSA xsa = this.LJIIJJI;
        if (this.LIZ.getVideoLength() > 0) {
            d = this.LJIIJJI.LIZ / this.LIZ.getVideoLength();
        } else {
            d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        xsa.LJIIJ = d;
        XSA xsa2 = this.LJIIJJI;
        String str = this.LJ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        xsa2.getClass();
        xsa2.LJIILIIL = str;
        XSA xsa3 = this.LJIIJJI;
        String str3 = this.LJFF;
        if (str3 != null) {
            str2 = str3;
        }
        xsa3.getClass();
        xsa3.LJIILJJIL = str2;
        XSA xsa4 = this.LJIIJJI;
        xsa4.LJIJ = this.LJIIL;
        String str4 = this.LJIILIIL;
        o.LJIIIZ(str4, "<set-?>");
        xsa4.LJIJI = str4;
        XSA data = this.LJIIJJI;
        o.LJIIIZ(data, "data");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", Float.valueOf((float) data.LIZ));
        jSONObject.put("get_config_duration", Float.valueOf((float) data.LIZIZ));
        jSONObject.put("extract_duration", Float.valueOf((float) data.LIZJ));
        jSONObject.put("upload_duration", Float.valueOf((float) data.LIZLLL));
        jSONObject.put("submit_duration", Float.valueOf((float) data.LJ));
        jSONObject.put("query_duration", Float.valueOf((float) data.LJFF));
        jSONObject.put("extract_duration_per_second", data.LJI);
        jSONObject.put("upload_duration_per_second", data.LJII);
        jSONObject.put("submit_duration_per_second", data.LJIIIIZZ);
        jSONObject.put("query_duration_per_second", data.LJIIIZ);
        jSONObject.put("recognize_duration_per_second", data.LJIIJ);
        jSONObject.put("perceived_get_config_duration", Float.valueOf((float) data.LJIIJJI));
        jSONObject.put("perceived_extract_duration", Float.valueOf((float) data.LJIIL));
        jSONObject.put("tos_key", data.LJIILIIL);
        jSONObject.put("job_id", data.LJIILJJIL);
        jSONObject.put("failed_step", data.LJIILL);
        jSONObject.put("failed_code", data.LJIILLIIL);
        jSONObject.put("failed_msg", data.LJIIZILJ);
        jSONObject.put("audio_file_size", Float.valueOf((float) data.LJIJ));
        jSONObject.put("audio_upload_domain", data.LJIJI);
        C43882HKc.LIZ.LIZLLL("tt_recognize_caption_monitor", i, jSONObject, null);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("monitor tt_recognize_caption_monitor status: ");
        LIZ.append(i);
        LIZ.append(" data: ");
        LIZ.append(jSONObject);
        H7B.LJ(X1D.LIZIZ(LIZ));
    }

    public final void LJIILIIL(int i) {
        this.LJIILL = SystemClock.elapsedRealtime();
        this.LJIIJJI.LJIILL = i;
    }

    public final void LJIILL(NLEModel nLEModel) {
        if (!this.LJIJJLI) {
            return;
        }
        long j = this.LJIIIIZZ;
        LJIIZILJ(Math.min(j, (j - SystemClock.elapsedRealtime()) + this.LJIILLIIL), false, false, this.LJIIZILJ, nLEModel);
        this.LJIJJLI = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XS7(NLEModel nLEModel, VideoPublishEditModel model) {
        super(nLEModel, model);
        o.LJIIIZ(model, "model");
        this.LJIJJ = new C6B8();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.XS5
    public final void LJIIJ(NLEModel nLEModel, String str) {
        List LJJZZIII;
        this.LJIIZILJ = str;
        LanguageDetail[] LIZIZ = C152535yj.LIZIZ();
        LanguageDetail languageDetail = null;
        if (LIZIZ != null && (LJJZZIII = ORY.LJJZZIII(LIZIZ)) != null) {
            Iterator it = LJJZZIII.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (o.LJ(((LanguageDetail) next).code, str)) {
                    languageDetail = next;
                    break;
                }
            }
            languageDetail = languageDetail;
        }
        this.LJIL = languageDetail;
        this.LJIJJLI = true;
        this.LJIILLIIL = SystemClock.elapsedRealtime();
        C73495Sst c73495Sst = this.LJIJ;
        if (c73495Sst != null && !c73495Sst.isDisposed()) {
            return;
        }
        LJIIZILJ(this.LJIIIIZZ, true, true, str, nLEModel);
        this.LJIJJLI = false;
    }

    public final void LJIILJJIL(int i, int i2, String failedMsg) {
        o.LJIIIZ(failedMsg, "failedMsg");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NewRecognizeCaptionPresenter step ");
        LIZ.append(XS5.LJFF(i));
        LIZ.append(" end failedCode: ");
        LIZ.append(i2);
        LIZ.append(" failedMsg ");
        LIZ.append(failedMsg);
        H78.LJI(X1D.LIZIZ(LIZ));
        int i3 = this.LJIIJJI.LJIILL;
        if (i3 != 10) {
            if (i3 != 20) {
                if (i3 != 30) {
                    if (i3 != 40) {
                        if (i3 != 50) {
                            return;
                        }
                        this.LJIIJJI.LJFF = SystemClock.elapsedRealtime() - this.LJIILL;
                        this.LJIIJJI.LJIIIZ = LIZLLL();
                        return;
                    }
                    this.LJIIJJI.LJ = SystemClock.elapsedRealtime() - this.LJIILL;
                    this.LJIIJJI.LJIIIIZZ = LIZLLL();
                    return;
                }
                this.LJIIJJI.LIZLLL = SystemClock.elapsedRealtime() - this.LJIILL;
                this.LJIIJJI.LJII = LIZLLL();
                return;
            }
            this.LJIIJJI.LIZJ = SystemClock.elapsedRealtime() - this.LJIILL;
            this.LJIIJJI.LJI = LIZLLL();
            return;
        }
        this.LJIIJJI.LIZIZ = SystemClock.elapsedRealtime() - this.LJIILL;
    }

    public final void LJIIZILJ(long j, boolean z, boolean z2, String str, NLEModel nLEModel) {
        if (C133195Kp.LIZ() && LJI()) {
            LJIIJJI();
        }
        C73470SsU LJIJJ = AbstractC73638SvC.LJI(new XS6(this, z, z2, nLEModel, str)).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AbstractC73946T0k abstractC73946T0k = T16.LIZIZ;
        C73320Sq4.LIZ(timeUnit, "unit is null");
        C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
        this.LJIJI = (C73495Sst) new C73500Ssy(LJIJJ, j, timeUnit, abstractC73946T0k, null).LJIIIZ(new IDaS224S0100000_15(this, 9)).LJJII(new AfS67S0100000_15(this, 64), new AfS67S0100000_15(this, 65));
    }
}
