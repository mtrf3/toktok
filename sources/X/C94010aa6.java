package X;

import android.view.animation.PathInterpolator;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectPackageData;

/* renamed from: X.aa6, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94010aa6 {
    public static final PathInterpolator LIZ() {
        return new PathInterpolator(0.66f, 0.0f, 0.01f, 1.0f);
    }

    public static final void LIZIZ(EffectPackageData effectPackageData, int i) {
        String str;
        if (i != 1) {
            if (i != 2) {
                str = "";
            } else {
                str = "publish_effect_page";
            }
        } else {
            str = "canvas_exit_pop";
        }
        effectPackageData.LJLLL = str;
    }
}
