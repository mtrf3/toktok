package X;

import com.ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.ss.android.vesdk.filterparam.VEImageTransformFilterParam;

/* renamed from: X.5K7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5K7 {
    public static VEImageTransformFilterParam LIZ(int i) {
        VEImageTransformFilterParam vEImageTransformFilterParam = new VEImageTransformFilterParam();
        if (i == VEClipAlgorithmParam.BINGO_EFFECT_ZOOMIN) {
            vEImageTransformFilterParam.beginScale = 1.0f;
            vEImageTransformFilterParam.endScale = 1.1f;
            return vEImageTransformFilterParam;
        }
        if (i == VEClipAlgorithmParam.BINGO_EFFECT_ZOOMOUT) {
            vEImageTransformFilterParam.beginScale = 1.1f;
            vEImageTransformFilterParam.endScale = 1.0f;
            return vEImageTransformFilterParam;
        }
        return null;
    }
}
