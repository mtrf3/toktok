package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.android.ugc.aweme.setting.CaptionConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class XS5 {
    public final VideoPublishEditModel LIZ;
    public final NLEModel LIZIZ;
    public UploadVideoConfig LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public List<Utterance> LJI;
    public XSB LJII;
    public final long LJIIIIZZ;
    public final CaptionConfig LJIIIZ;
    public final C62822Ol8 LJIIJ;
    public XSA LJIIJJI;
    public long LJIIL;
    public String LJIILIIL;
    public final C62822Ol8 LJIILJJIL;
    public volatile long LJIILL;
    public volatile long LJIILLIIL;
    public volatile String LJIIZILJ;

    public static String LJFF(int i) {
        return i != 10 ? i != 20 ? i != 30 ? i != 40 ? i != 50 ? "started_step" : "query_task" : "submit_task" : "upload_audio" : "extract_audio" : "get_auth_key";
    }

    public abstract void LIZ();

    public abstract boolean LJI();

    public abstract void LJII(NLEModel nLEModel);

    public abstract void LJIIIIZZ();

    public abstract void LJIIIZ(NLEModel nLEModel);

    public abstract void LJIIJ(NLEModel nLEModel, String str);

    public abstract void LJIIJJI();

    /* JADX WARN: Multi-variable type inference failed */
    public final C84674XLa<UploadVideoConfig> LIZJ() {
        int i;
        C84674XLa<UploadVideoConfig> c84674XLa;
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15((XS7) this, 761);
        String str = null;
        int i2 = 0;
        C84674XLa c84674XLa2 = null;
        int i3 = 0;
        while (true) {
            i = 3;
            if (i3 < 3) {
                c84674XLa2 = (C84674XLa) aqS165S0100000_15.invoke();
                if (c84674XLa2.LIZ == 0) {
                    break;
                }
                i3++;
            } else if (c84674XLa2 == null) {
                c84674XLa2 = new C84674XLa(-1, str, str, 6);
            }
        }
        int i4 = 4;
        if (!c84674XLa2.LIZ()) {
            int i5 = 2;
            if (c84674XLa2.LIZJ instanceof UploadAuthKeyConfig) {
                ((C155976Af) this.LJIILJJIL.getValue()).LIZ.storeLong("authkey_store_time", System.currentTimeMillis());
                C155976Af c155976Af = (C155976Af) this.LJIILJJIL.getValue();
                Gson LIZ = C60903NvH.LJIIJJI().LIZ();
                T t = c84674XLa2.LIZJ;
                o.LJII(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig");
                String json = GsonProtectorUtils.toJson(LIZ, t);
                o.LJIIIIZZ(json, "getAPI().getGson().toJso…a as UploadAuthKeyConfig)");
                c155976Af.getClass();
                c155976Af.LIZ.storeString("authkey_value", json);
                T t2 = c84674XLa2.LIZJ;
                o.LJII(t2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig");
                UploadVideoConfig uploadVideoConfig = ((UploadAuthKeyConfig) t2).videoConfig;
                this.LIZJ = uploadVideoConfig;
                if (uploadVideoConfig == null) {
                    c84674XLa2 = new C84674XLa(i5, "parse upload config failed", str, i4);
                } else {
                    String str2 = uploadVideoConfig.videoHostName;
                    if (str2 == null) {
                        str2 = "";
                    }
                    this.LJIILIIL = str2;
                }
            } else {
                c84674XLa2 = new C84674XLa(i5, "upload config is empty", str, i4);
            }
        }
        UploadVideoConfig uploadVideoConfig2 = this.LIZJ;
        if (uploadVideoConfig2 != null) {
            c84674XLa = new C84674XLa<>(i2, str, uploadVideoConfig2, i);
        } else {
            c84674XLa = new C84674XLa<>(c84674XLa2.LIZ, c84674XLa2.LIZIZ, str, i4);
        }
        H78.LJI("BaseRecognizeCaptionPresenter get authKey from server");
        return c84674XLa;
    }

    public final double LIZLLL() {
        if (this.LIZ.getVideoLength() > 0) {
            return (SystemClock.elapsedRealtime() - this.LJIILL) / this.LIZ.getVideoLength();
        }
        return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    }

    public final C126984yc LJ() {
        return (C126984yc) this.LJIIJ.getValue();
    }

    public XS5(NLEModel nLEModel, VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        this.LIZ = model;
        this.LIZIZ = nLEModel;
        this.LJIIIIZZ = J9A.LIZIZ("tool_recognize_caption_limit_time", 60000L);
        CaptionConfig captionConfig = (CaptionConfig) SettingsManager.LIZLLL().LJIIIIZZ("tool_caption_config", CaptionConfig.class, null);
        this.LJIIIZ = captionConfig == null ? new CaptionConfig(80, 1) : captionConfig;
        this.LJIIJ = C221108m2.LIZIZ(C139035cx.LJLIL);
        this.LJIIJJI = new XSA();
        this.LJIILIIL = "";
        this.LJIILJJIL = C221108m2.LIZIZ(C156046Am.LJLIL);
        this.LJIIZILJ = "";
    }

    public final void LIZIZ(int i, String failedMsg) {
        o.LJIIIZ(failedMsg, "failedMsg");
        XSA xsa = this.LJIIJJI;
        xsa.LJIILLIIL = i;
        xsa.getClass();
        xsa.LJIIZILJ = failedMsg;
    }
}
