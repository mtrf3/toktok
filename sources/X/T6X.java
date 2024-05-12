package X;

import com.ss.android.ugc.aweme.detail.AbstractDetailFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T6X {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(float f, boolean z, AbstractDetailFragment fragment) {
        OGF helper;
        o.LJIIIZ(fragment, "fragment");
        C80647Vkx c80647Vkx = fragment.mScrollableLayout;
        if ((c80647Vkx != null && (helper = c80647Vkx.getHelper()) != null && helper.LIZIZ()) || (z && f < 0.1f)) {
            fragment.mAnimator.LIZJ();
            return false;
        }
        return z;
    }

    public static boolean LIZIZ(float f, float f2, boolean z, AbstractDetailFragment fragment) {
        boolean z2;
        OGF helper;
        o.LJIIIZ(fragment, "fragment");
        fragment.controlScroll();
        C80647Vkx c80647Vkx = fragment.mScrollableLayout;
        if (c80647Vkx != null && (helper = c80647Vkx.getHelper()) != null) {
            z2 = helper.LIZIZ();
        } else {
            z2 = false;
        }
        if (z2) {
            return true;
        }
        if (Math.abs(f) >= Math.abs(f2)) {
            return z;
        }
        if (f2 > 30.0f) {
            fragment.mAnimator.LIZIZ();
        } else if (f2 < -30.0f) {
            return true;
        }
        return z;
    }
}
