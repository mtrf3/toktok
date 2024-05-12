package X;

import com.bytedance.ies.nle.editor_jni.NLEMediaPublicJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEMediaSettingsController;
import kotlin.jvm.internal.o;

/* renamed from: X.5N1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5N1 extends C5N3 {
    public final NLEMediaSettingsController LJI() {
        C5N2 c5n2 = this.LIZLLL;
        if (c5n2.LJIILIIL == null || c5n2.LIZJ.get()) {
            return null;
        }
        return (NLEMediaSettingsController) c5n2.LJIIL.getValue();
    }

    public final int LJIILLIIL() {
        int i;
        synchronized (this.LIZLLL) {
            NLEMediaSettingsController LJI = LJI();
            if (LJI != null) {
                i = NLEMediaPublicJniJNI.NLEMediaSettingsController_setSrcMaxHWRatio(LJI.LIZ, LJI, 2.4f);
            } else {
                i = -1;
            }
        }
        return i;
    }

    public final void LJIIZILJ() {
        synchronized (this.LIZLLL) {
            NLEMediaSettingsController LJI = LJI();
            if (LJI != null) {
                NLEMediaPublicJniJNI.NLEMediaSettingsController_setSurfaceReDraw(LJI.LIZ, LJI, true);
            }
        }
    }

    public final int LJII() {
        NLEMediaSettingsController LJI = LJI();
        if (LJI != null) {
            return NLEMediaPublicJniJNI.NLEMediaSettingsController_setDestroyVersion(LJI.LIZ, LJI, true);
        }
        return -1;
    }

    public final int LJIILJJIL() {
        NLEMediaSettingsController LJI = LJI();
        if (LJI != null) {
            return NLEMediaPublicJniJNI.NLEMediaSettingsController_setPreviewFps__SWIG_0(LJI.LIZ, LJI, 30, true);
        }
        return -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5N1(C5N2 session) {
        super(session);
        o.LJIIIZ(session, "session");
    }

    public final int LJ(boolean z) {
        NLEMediaSettingsController LJI = LJI();
        if (LJI != null) {
            return NLEMediaPublicJniJNI.NLEMediaSettingsController_enableEffect(LJI.LIZ, LJI, z);
        }
        return -1;
    }

    public final void LJFF(boolean z) {
        synchronized (this.LIZLLL) {
            NLEMediaSettingsController LJI = LJI();
            if (LJI != null) {
                NLEMediaPublicJniJNI.NLEMediaSettingsController_enableSimpleProcessor(LJI.LIZ, LJI, z);
            }
        }
    }

    public final void LJIIIIZZ(boolean z) {
        synchronized (this.LIZLLL) {
            NLEMediaSettingsController LJI = LJI();
            if (LJI != null) {
                NLEMediaPublicJniJNI.NLEMediaSettingsController_setDleEnabled(LJI.LIZ, LJI, z);
            }
        }
    }

    public final void LJIIIZ(boolean z) {
        synchronized (this.LIZLLL) {
            NLEMediaSettingsController LJI = LJI();
            if (LJI != null) {
                NLEMediaPublicJniJNI.NLEMediaSettingsController_setDleEnabledPreview(LJI.LIZ, LJI, z);
            }
        }
    }

    public final void LJIIL(boolean z) {
        NLEMediaSettingsController LJI = LJI();
        if (LJI != null) {
            NLEMediaPublicJniJNI.NLEMediaSettingsController_setLoopPlay(LJI.LIZ, LJI, z);
        }
    }

    public final void LJIILIIL(int i) {
        synchronized (this.LIZLLL) {
            NLEMediaSettingsController LJI = LJI();
            if (LJI != null) {
                NLEMediaPublicJniJNI.NLEMediaSettingsController_setPageMode(LJI.LIZ, LJI, i);
            }
        }
    }

    public final int LJIILL(int i) {
        NLEMediaSettingsController LJI = LJI();
        if (LJI != null) {
            return NLEMediaPublicJniJNI.NLEMediaSettingsController_setPreviewFps__SWIG_1(LJI.LIZ, LJI, i);
        }
        return -1;
    }

    public final int LJIIJ(int i, long j) {
        int i2;
        synchronized (this.LIZLLL) {
            NLEMediaSettingsController LJI = LJI();
            if (LJI != null) {
                i2 = NLEMediaPublicJniJNI.NLEMediaSettingsController_setDropFrameParam(LJI.LIZ, LJI, true, j, i);
            } else {
                i2 = -1;
            }
        }
        return i2;
    }

    public final void LJIIJJI(int i, int i2, EnumC124224uA enumC124224uA, EnumC123994tn enumC123994tn) {
        synchronized (this.LIZLLL) {
            NLEMediaSettingsController LJI = LJI();
            if (LJI != null) {
                NLEMediaPublicJniJNI.NLEMediaSettingsController_setImageResizeInfo(LJI.LIZ, LJI, i, i2, enumC124224uA.swigValue(), enumC123994tn.swigValue());
            }
        }
    }
}
