package X;

import com.bytedance.ies.nle.editor_jni.NLEAudioCompileEncodeSettings;
import com.bytedance.ies.nle.editor_jni.NLECompileResult;
import com.bytedance.ies.nle.editor_jni.NLEExporterController;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEMediaJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEMediaMessageListener;
import com.bytedance.ies.nle.editor_jni.NLEMediaPublicJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEVideoEncodeSettings;
import com.bytedance.ies.nle.editor_jni.VecString;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.5N0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5N0 extends C5N3 {
    public InterfaceC133955Nn LJ;
    public C5JZ LJFF;
    public C133925Nk LJI;
    public final NLEMediaConfig LJII;

    public final NLECompileResult LJIIIZ() {
        NLECompileResult nLECompileResult;
        synchronized (this.LIZLLL) {
            NLEExporterController LJIIJJI = LJIIJJI();
            if (LJIIJJI != null) {
                nLECompileResult = new NLECompileResult(NLEMediaPublicJniJNI.NLEExporterController_getCompileResult(LJIIJJI.LIZ, LJIIJJI));
            } else {
                nLECompileResult = null;
            }
        }
        return nLECompileResult;
    }

    public final NLEExporterController LJIIJJI() {
        C5N2 c5n2 = this.LIZLLL;
        if (c5n2.LJIILIIL == null) {
            return null;
        }
        return (NLEExporterController) c5n2.LJFF.getValue();
    }

    public final void LJIILJJIL() {
        synchronized (this.LIZLLL) {
            NLEExporterController LJIIJJI = LJIIJJI();
            if (LJIIJJI != null) {
                NLEMediaPublicJniJNI.NLEExporterController_pauseCompile(LJIIJJI.LIZ, LJIIJJI);
            }
        }
    }

    public final void LJIILL() {
        synchronized (this.LIZLLL) {
            NLEExporterController LJIIJJI = LJIIJJI();
            if (LJIIJJI != null) {
                NLEMediaPublicJniJNI.NLEExporterController_resumeCompile(LJIIJJI.LIZ, LJIIJJI);
            }
        }
    }

    public final String LJIIIIZZ() {
        String NLEExporterController_getAudioMatrixResult;
        NLEExporterController LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (NLEExporterController_getAudioMatrixResult = NLEMediaPublicJniJNI.NLEExporterController_getAudioMatrixResult(LJIIJJI.LIZ, LJIIJJI)) != null) {
            return NLEExporterController_getAudioMatrixResult;
        }
        return "";
    }

    public final VecString LJIIJ() {
        NLEExporterController LJIIJJI = LJIIJJI();
        if (LJIIJJI != null) {
            return new VecString(NLEMediaPublicJniJNI.NLEExporterController_getDenoiseSnrResults(LJIIJJI.LIZ, LJIIJJI), true);
        }
        return new VecString();
    }

    public final int LJIIL(NLEVideoEncodeSettings nLEVideoEncodeSettings) {
        int i;
        synchronized (this.LIZLLL) {
            NLEExporterController LJIIJJI = LJIIJJI();
            if (LJIIJJI != null) {
                i = NLEMediaPublicJniJNI.NLEExporterController_getRemuxErrorCode(LJIIJJI.LIZ, LJIIJJI, nLEVideoEncodeSettings.LIZ, nLEVideoEncodeSettings);
            } else {
                i = -1;
            }
        }
        return i;
    }

    public final boolean LJIILIIL(NLEVideoEncodeSettings nLEVideoEncodeSettings) {
        boolean z;
        synchronized (this.LIZLLL) {
            NLEExporterController LJIIJJI = LJIIJJI();
            if (LJIIJJI != null) {
                z = NLEMediaPublicJniJNI.NLEExporterController_isEnableRemuxVideo(LJIIJJI.LIZ, LJIIJJI, nLEVideoEncodeSettings.LIZ, nLEVideoEncodeSettings);
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void LJIILLIIL(String str) {
        synchronized (this.LIZLLL) {
            NLEExporterController LJIIJJI = LJIIJJI();
            if (LJIIJJI != null) {
                NLEMediaPublicJniJNI.NLEExporterController_setCompileDumpFilePath(LJIIJJI.LIZ, LJIIJJI, str);
            }
        }
    }

    public final void LJIIZILJ(InterfaceC133955Nn interfaceC133955Nn) {
        this.LJ = interfaceC133955Nn;
        synchronized (this) {
            if (this.LJI == null) {
                if (this.LJFF == null) {
                    NLEMediaConfig nLEMediaConfig = this.LJII;
                    C5JZ c5jz = new C5JZ(NLEMediaJniJNI.NLEMediaConfig_enableCatchExceptionInCallback_get(nLEMediaConfig.LIZ, nLEMediaConfig));
                    NLEPlayer LIZJ = this.LIZLLL.LIZJ();
                    if (LIZJ != null) {
                        NLEMediaPublicJniJNI.NLEPlayer_addMessageListener(LIZJ.LIZ, LIZJ, NLEMediaMessageListener.getCPtr(c5jz), c5jz);
                    }
                    this.LJFF = c5jz;
                }
                C133925Nk c133925Nk = new C133925Nk(this);
                C5JZ c5jz2 = this.LJFF;
                if (c5jz2 != null) {
                    ((ArrayList) c5jz2.LIZ).add(c133925Nk);
                }
                this.LJI = c133925Nk;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5N0(C5N2 session, NLEMediaConfig mediaConfig) {
        super(session);
        o.LJIIIZ(session, "session");
        o.LJIIIZ(mediaConfig, "mediaConfig");
        this.LJII = mediaConfig;
    }

    public final boolean LJ(String str, NLEVideoEncodeSettings nLEVideoEncodeSettings) {
        boolean z;
        synchronized (this.LIZLLL) {
            NLEExporterController LJIIJJI = LJIIJJI();
            if (LJIIJJI != null) {
                z = NLEMediaPublicJniJNI.NLEExporterController_compile__SWIG_0(LJIIJJI.LIZ, LJIIJJI, str, nLEVideoEncodeSettings.LIZ, nLEVideoEncodeSettings);
            } else {
                z = false;
            }
        }
        return z;
    }

    public final boolean LJFF(String str, NLEVideoEncodeSettings nLEVideoEncodeSettings, InterfaceC133955Nn interfaceC133955Nn) {
        LJIIZILJ(interfaceC133955Nn);
        NLEExporterController LJIIJJI = LJIIJJI();
        if (LJIIJJI != null) {
            return NLEMediaPublicJniJNI.NLEExporterController_compile__SWIG_0(LJIIJJI.LIZ, LJIIJJI, str, nLEVideoEncodeSettings.LIZ, nLEVideoEncodeSettings);
        }
        return false;
    }

    public final boolean LJII(String str, NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings, InterfaceC133955Nn interfaceC133955Nn) {
        boolean z;
        LJIIZILJ(interfaceC133955Nn);
        synchronized (this.LIZLLL) {
            NLEExporterController LJIIJJI = LJIIJJI();
            if (LJIIJJI != null) {
                z = NLEMediaPublicJniJNI.NLEExporterController_compileOnlyAudio(LJIIJJI.LIZ, LJIIJJI, str, nLEAudioCompileEncodeSettings.LIZ, nLEAudioCompileEncodeSettings);
            } else {
                z = false;
            }
        }
        return z;
    }

    public final boolean LJI(String str, String str2, NLEVideoEncodeSettings nLEVideoEncodeSettings, C133945Nm c133945Nm) {
        boolean z;
        LJIIZILJ(c133945Nm);
        synchronized (this.LIZLLL) {
            NLEExporterController LJIIJJI = LJIIJJI();
            if (LJIIJJI != null) {
                z = NLEMediaPublicJniJNI.NLEExporterController_compile__SWIG_1(LJIIJJI.LIZ, LJIIJJI, str, str2, nLEVideoEncodeSettings.LIZ, nLEVideoEncodeSettings);
            } else {
                z = false;
            }
        }
        return z;
    }
}
