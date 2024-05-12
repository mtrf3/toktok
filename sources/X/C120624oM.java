package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;

/* renamed from: X.4oM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C120624oM {
    public static boolean LIZ(NLESegmentAudio nLESegmentAudio) {
        if (NLEEditorJniJNI.NLESegmentAudio_getDbRange(nLESegmentAudio.LIZJ, nLESegmentAudio) > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            return true;
        }
        return false;
    }
}
