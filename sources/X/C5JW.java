package X;

import com.bytedance.ies.nle.editor_jni.NLEFilterRuntimeController;
import com.bytedance.ies.nle.editor_jni.NLEMediaPublicJniJNI;
import com.bytedance.ies.nle.editor_jni.VecFloat;
import com.bytedance.ies.nle.editor_jni.VecString;
import kotlin.jvm.internal.o;

/* renamed from: X.5JW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5JW extends C5N3 {
    public final int LJ() {
        int i;
        synchronized (this.LIZLLL) {
            NLEFilterRuntimeController LJI = LJI();
            if (LJI != null) {
                i = NLEMediaPublicJniJNI.NLEFilterRuntimeController_doLensOneKeyDetect(LJI.LIZ, LJI);
            } else {
                i = -1;
            }
        }
        return i;
    }

    public final NLEFilterRuntimeController LJI() {
        C5N2 c5n2 = this.LIZLLL;
        if (c5n2.LJIILIIL == null || c5n2.LIZJ.get()) {
            return null;
        }
        return (NLEFilterRuntimeController) c5n2.LJII.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5JW(C5N2 session) {
        super(session);
        o.LJIIIZ(session, "session");
    }

    public final float LJFF(String str) {
        NLEFilterRuntimeController LJI = LJI();
        if (LJI != null) {
            return NLEMediaPublicJniJNI.NLEFilterRuntimeController_getColorFilterIntensity(LJI.LIZ, LJI, str);
        }
        return 0.0f;
    }

    public final int LJII(VecString vecString, VecString vecString2, VecFloat vecFloat, String str) {
        NLEFilterRuntimeController LJI = LJI();
        if (LJI != null) {
            return NLEMediaPublicJniJNI.NLEFilterRuntimeController_updateMultiComposerNodes(LJI.LIZ, LJI, VecString.LIZJ(vecString), vecString, VecString.LIZJ(vecString2), vecString2, vecFloat.LJLIL, vecFloat, str);
        }
        return 0;
    }
}
