package X;

import com.bytedance.ies.nle.editor_jni.NLEMVAudioInfo;
import com.bytedance.ies.nle.editor_jni.NLEMVInfoController;
import com.bytedance.ies.nle.editor_jni.NLEMediaPublicJniJNI;
import kotlin.jvm.internal.o;

/* renamed from: X.5N7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5N7 extends C5N3 {
    public final long LJ() {
        NLEMVInfoController nLEMVInfoController;
        C5N2 c5n2 = this.LIZLLL;
        if (c5n2.LJIILIIL == null || c5n2.LIZJ.get() || (nLEMVInfoController = (NLEMVInfoController) c5n2.LJI.getValue()) == null) {
            return 0L;
        }
        return NLEMediaPublicJniJNI.NLEMVInfoController_getMVDuration(nLEMVInfoController.LIZ, nLEMVInfoController);
    }

    public final NLEMVAudioInfo LJFF() {
        NLEMVInfoController nLEMVInfoController;
        C5N2 c5n2 = this.LIZLLL;
        if (c5n2.LJIILIIL == null || c5n2.LIZJ.get() || (nLEMVInfoController = (NLEMVInfoController) c5n2.LJI.getValue()) == null) {
            return new NLEMVAudioInfo();
        }
        return new NLEMVAudioInfo(NLEMediaPublicJniJNI.NLEMVInfoController_getMVOriginalBackgroundAudio(nLEMVInfoController.LIZ, nLEMVInfoController));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5N7(C5N2 session) {
        super(session);
        o.LJIIIZ(session, "session");
    }
}
