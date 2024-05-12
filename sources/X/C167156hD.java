package X;

import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import defpackage.t1;
import java.util.Iterator;

/* renamed from: X.6hD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C167156hD {
    public static final /* synthetic */ int LIZ = 0;

    public static NLEError LIZ(int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    return NLEError.FAILED;
                }
                return NLEError.SUCCESS;
            }
            return NLEError.FAILED;
        }
        return NLEError.PARAM_INVALID;
    }

    public static NLETrackSlot LIZIZ(NLEModel nLEModel) {
        Iterator LIZJ = t1.LIZJ(nLEModel, "nleModel.tracks");
        while (LIZJ.hasNext()) {
            Iterator<NLETrackSlot> it = ((NLETrack) LIZJ.next()).LJIILL().iterator();
            if (it.hasNext()) {
                return it.next();
            }
        }
        return null;
    }

    public static int LIZJ(int i, int i2, int i3) {
        if (i == 24000 && C167326hU.LIZ()) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("error_type", "detachAudio");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("sampleRate=");
            LIZ2.append(i);
            C1EU.LIZJ(LIZ2, ",bitRate=", i2, ",channels=", i3);
            c188727au.LJIIIZ("extra", X1D.LIZIZ(LIZ2));
            FMX.LJIIL("voice_conversion_extra_error", c188727au.LIZ);
            return 44100;
        }
        return i;
    }
}
