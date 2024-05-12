package X;

import android.graphics.Bitmap;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.lynx.tasm.base.LLog;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes14.dex */
public final class V9E {
    public static final Method LIZ;
    public static final Method LIZIZ;

    public static void LIZ(Object obj, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-2201853764597999184")).LIZ) {
            return;
        }
        method.invoke(obj, objArr);
    }

    static {
        try {
            LIZ = ImageDecodeOptionsBuilder.class.getDeclaredMethod("LIZIZ", Integer.TYPE);
        } catch (Throwable th) {
            LLog.LIZLLL(4, "Fresco", android.util.Log.getStackTraceString(th));
        }
        try {
            LIZIZ = AnimatedDrawable2.class.getDeclaredMethod("setPrivateFrameScheduler", WAR.class);
        } catch (Throwable th2) {
            LLog.LIZLLL(4, "Fresco", android.util.Log.getStackTraceString(th2));
        }
    }

    public static void LIZJ(AnimatedDrawable2 animatedDrawable2) {
        Method method = LIZIZ;
        if (method == null) {
            return;
        }
        try {
            LIZ(animatedDrawable2, method, new Object[]{new V9F(animatedDrawable2.LJLJI)});
        } catch (IllegalAccessException e) {
            LLog.LIZLLL(4, "Fresco", android.util.Log.getStackTraceString(e));
        } catch (InvocationTargetException e2) {
            LLog.LIZLLL(4, "Fresco", android.util.Log.getStackTraceString(e2));
        }
    }

    public static void LIZIZ(W5P w5p, Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(config);
        Method method = LIZ;
        if (method != null) {
            try {
                LIZ(imageDecodeOptionsBuilder, method, new Object[]{0});
            } catch (IllegalAccessException e) {
                LLog.LIZLLL(4, "Fresco", android.util.Log.getStackTraceString(e));
            } catch (InvocationTargetException e2) {
                LLog.LIZLLL(4, "Fresco", android.util.Log.getStackTraceString(e2));
            }
        }
        imageDecodeOptionsBuilder.getClass();
        w5p.LJ = new C81810W8w(imageDecodeOptionsBuilder);
    }
}
