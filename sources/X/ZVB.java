package X;

import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.EglBase10;
import com.bytedance.realx.video.EglBase14;
import com.bytedance.realx.video.EglBaseCheckerHelper;
import javax.microedition.khronos.egl.EGLContext;

/* loaded from: classes33.dex */
public final /* synthetic */ class ZVB {
    public static EglBase LIZ() {
        return LIZJ(null, EglBase.CONFIG_PLAIN);
    }

    public static void LJII() {
        EglBaseCheckerHelper.EglContextDestoryEnd();
    }

    public static void LJIIIIZZ() {
        EglBaseCheckerHelper.EglContextDestoryStart();
    }

    public static EglBase LIZIZ(EglBase.Context context) {
        return LIZJ(context, EglBase.CONFIG_PLAIN);
    }

    public static EglBase LJ(int[] iArr) {
        return new EglBase10(null, iArr);
    }

    public static EglBase LJI(int[] iArr) {
        return new EglBase14(null, iArr);
    }

    public static void LJIIIZ(EglBase.EglContextChecker eglContextChecker) {
        EglBaseCheckerHelper.setEglContextChecker(eglContextChecker);
    }

    public static EglBase LIZJ(EglBase.Context context, int[] iArr) {
        if (EglBase14.isEGL14Supported() && (context == null || (context instanceof EglBase14.Context))) {
            return new EglBase14((EglBase14.Context) context, iArr);
        }
        return new EglBase10((EglBase10.Context) context, iArr);
    }

    public static EglBase LIZLLL(EGLContext eGLContext, int[] iArr) {
        return new EglBase10(new EglBase10.Context(eGLContext), iArr);
    }

    public static EglBase LJFF(android.opengl.EGLContext eGLContext, int[] iArr) {
        return new EglBase14(new EglBase14.Context(eGLContext), iArr);
    }
}
