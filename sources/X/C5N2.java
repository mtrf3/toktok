package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEAlgorithmController;
import com.bytedance.ies.nle.editor_jni.NLEBrushRuntimeController;
import com.bytedance.ies.nle.editor_jni.NLEEffectRuntimeController;
import com.bytedance.ies.nle.editor_jni.NLEExporterController;
import com.bytedance.ies.nle.editor_jni.NLEFilterRuntimeController;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nle.editor_jni.NLEMVInfoController;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEMediaJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEMediaPublicJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEMediaRuntimeController;
import com.bytedance.ies.nle.editor_jni.NLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEMediaSettingsController;
import com.bytedance.ies.nle.editor_jni.NLEMetricsRuntimeController;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEStickerController;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS152S0100000_2;

/* renamed from: X.5N2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5N2 {
    public NLEModel LIZIZ;
    public NLEMediaSession LJIILIIL;
    public final Object LIZ = new Object();
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 790));
    public final C62822Ol8 LJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 792));
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(new AqS152S0100000_2(this, 787));
    public final C62822Ol8 LJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 789));
    public final C62822Ol8 LJII = C221108m2.LIZIZ(new AqS152S0100000_2(this, 788));
    public final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 784));
    public final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 785));
    public final C62822Ol8 LJIIJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 793));
    public final C62822Ol8 LJIIJJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 786));
    public final C62822Ol8 LJIIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 791));

    public final void LIZ() {
        NLEMediaSession nLEMediaSession = this.LJIILIIL;
        if (nLEMediaSession != null) {
            long NLEMediaSession_getMediaConfig = NLEMediaPublicJniJNI.NLEMediaSession_getMediaConfig(nLEMediaSession.LIZ, nLEMediaSession);
            if (NLEMediaSession_getMediaConfig != 0) {
                NLEMediaConfig nLEMediaConfig = new NLEMediaConfig(NLEMediaSession_getMediaConfig);
                if (NLEMediaJniJNI.NLEMediaConfig_lockSetDataSourceAndDestroy_get(nLEMediaConfig.LIZ, nLEMediaConfig)) {
                    synchronized (this.LIZ) {
                        LIZLLL();
                    }
                    return;
                }
            }
        }
        LIZLLL();
    }

    public final NLEMetricsRuntimeController LIZIZ() {
        NLEMediaSession nLEMediaSession;
        if (this.LJIILIIL != null && !this.LIZJ.get() && (nLEMediaSession = this.LJIILIIL) != null) {
            long NLEMediaSession_getMetricsApi = NLEMediaPublicJniJNI.NLEMediaSession_getMetricsApi(nLEMediaSession.LIZ, nLEMediaSession);
            if (NLEMediaSession_getMetricsApi != 0) {
                return new NLEMetricsRuntimeController(NLEMediaSession_getMetricsApi);
            }
        }
        return null;
    }

    public final NLEPlayer LIZJ() {
        if (this.LJIILIIL == null || this.LIZJ.get()) {
            return null;
        }
        return (NLEPlayer) this.LJ.getValue();
    }

    public final void LIZLLL() {
        NLELoggerListener logger = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
        if (logger != null) {
            logger.onLog(LogLevel.LEVEL_INFO, "NLEVEPublic2: destroy native media session");
        }
        this.LIZJ.set(true);
        NLEMediaRuntimeController nLEMediaRuntimeController = (NLEMediaRuntimeController) this.LIZLLL.getValue();
        if (nLEMediaRuntimeController != null) {
            synchronized (nLEMediaRuntimeController) {
                long j = nLEMediaRuntimeController.LIZ;
                if (j != 0) {
                    if (nLEMediaRuntimeController.LIZIZ) {
                        nLEMediaRuntimeController.LIZIZ = false;
                        NLEMediaPublicJniJNI.delete_NLEMediaRuntimeController(j);
                    }
                    nLEMediaRuntimeController.LIZ = 0L;
                }
            }
        }
        NLEPlayer nLEPlayer = (NLEPlayer) this.LJ.getValue();
        if (nLEPlayer != null) {
            nLEPlayer.LIZ();
        }
        NLEExporterController nLEExporterController = (NLEExporterController) this.LJFF.getValue();
        if (nLEExporterController != null) {
            nLEExporterController.LIZ();
        }
        NLEMVInfoController nLEMVInfoController = (NLEMVInfoController) this.LJI.getValue();
        if (nLEMVInfoController != null) {
            nLEMVInfoController.LIZ();
        }
        NLEFilterRuntimeController nLEFilterRuntimeController = (NLEFilterRuntimeController) this.LJII.getValue();
        if (nLEFilterRuntimeController != null) {
            nLEFilterRuntimeController.LIZ();
        }
        NLEAlgorithmController nLEAlgorithmController = (NLEAlgorithmController) this.LJIIIIZZ.getValue();
        if (nLEAlgorithmController != null) {
            nLEAlgorithmController.LIZ();
        }
        NLEBrushRuntimeController nLEBrushRuntimeController = (NLEBrushRuntimeController) this.LJIIIZ.getValue();
        if (nLEBrushRuntimeController != null) {
            nLEBrushRuntimeController.LIZ();
        }
        NLEStickerController nLEStickerController = (NLEStickerController) this.LJIIJ.getValue();
        if (nLEStickerController != null) {
            nLEStickerController.LIZ();
        }
        NLEEffectRuntimeController nLEEffectRuntimeController = (NLEEffectRuntimeController) this.LJIIJJI.getValue();
        if (nLEEffectRuntimeController != null) {
            nLEEffectRuntimeController.LIZ();
        }
        NLEMetricsRuntimeController LIZIZ = LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.LIZ();
        }
        NLEMediaSettingsController nLEMediaSettingsController = (NLEMediaSettingsController) this.LJIIL.getValue();
        if (nLEMediaSettingsController != null) {
            nLEMediaSettingsController.LIZ();
        }
        NLEMediaSession nLEMediaSession = this.LJIILIIL;
        if (nLEMediaSession != null) {
            nLEMediaSession.LIZ();
        }
        this.LJIILIIL = null;
    }

    public C5N2(NLEMediaSession nLEMediaSession) {
        this.LJIILIIL = nLEMediaSession;
    }
}
