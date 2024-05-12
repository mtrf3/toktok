package com.lynx.tasm.utils;

import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import X.X1D;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.renderscript.RSRuntimeException;
import android.view.View;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes15.dex */
public class BlurUtils {
    public static Method sCreateBlurEffect = null;
    public static Class sRenderEffectClass = null;
    public static Method sSetNodeRenderEffect = null;
    public static Method sSetRenderEffect = null;
    public static boolean sSupportRenderEffect = true;

    public static Object com_lynx_tasm_utils_BlurUtils_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "7547738097793042414"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);

    public static boolean isSupportRenderEffect() {
        if (Build.VERSION.SDK_INT >= 31 && sSupportRenderEffect) {
            return true;
        }
        return false;
    }

    public static boolean prepareRenderEffect() {
        if (sRenderEffectClass == null) {
            try {
                sRenderEffectClass = Class.forName("android.graphics.RenderEffect");
            } catch (ClassNotFoundException unused) {
                return false;
            }
        }
        Class cls = sRenderEffectClass;
        if (cls != null && sCreateBlurEffect == null) {
            try {
                Class<?> cls2 = Float.TYPE;
                sCreateBlurEffect = cls.getMethod("createBlurEffect", cls2, cls2, Shader.TileMode.class);
            } catch (NoSuchMethodException unused2) {
                LLog.LIZLLL(4, "BlurUtils", "prepareRenderEffectClass failed");
                return false;
            }
        }
        if (sRenderEffectClass == null || sCreateBlurEffect == null) {
            return false;
        }
        return true;
    }

    public static boolean prepareRenderNodeSetMethod() {
        if (!prepareRenderEffect()) {
            return false;
        }
        if (sSetNodeRenderEffect == null) {
            try {
                sSetNodeRenderEffect = RenderNode.class.getMethod("setRenderEffect", sRenderEffectClass);
            } catch (NoSuchMethodException unused) {
                LLog.LIZLLL(4, "BlurUtils", "prepareRenderNodeRenderEffectMethods failed");
                sSupportRenderEffect = false;
                return false;
            }
        }
        return true;
    }

    public static boolean prepareViewSetMethod() {
        if (!prepareRenderEffect()) {
            return false;
        }
        if (sSetRenderEffect == null) {
            try {
                sSetRenderEffect = View.class.getMethod("setRenderEffect", sRenderEffectClass);
            } catch (NoSuchMethodException unused) {
                LLog.LIZLLL(4, "BlurUtils", "prepareRenderEffectMethods failed");
                return false;
            }
        }
        return true;
    }

    public static boolean removeEffect(View view) {
        if (!isSupportRenderEffect()) {
            return false;
        }
        if (!prepareViewSetMethod()) {
            sSupportRenderEffect = false;
            return false;
        }
        try {
            com_lynx_tasm_utils_BlurUtils_java_lang_reflect_Method_invoke(sSetRenderEffect, view, new Object[]{null});
            return true;
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            sSupportRenderEffect = false;
            return false;
        }
    }

    public static boolean createEffect(RenderNode renderNode, float f) {
        if (!isSupportRenderEffect() || f <= 0.0f) {
            return false;
        }
        if (!prepareRenderNodeSetMethod()) {
            sSupportRenderEffect = false;
            return false;
        }
        try {
            com_lynx_tasm_utils_BlurUtils_java_lang_reflect_Method_invoke(sSetNodeRenderEffect, renderNode, new Object[]{com_lynx_tasm_utils_BlurUtils_java_lang_reflect_Method_invoke(sCreateBlurEffect, null, new Object[]{Float.valueOf(f), Float.valueOf(f), Shader.TileMode.CLAMP})});
            return true;
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("createNodeEffect failed ");
            LIZ.append(e.getMessage());
            LLog.LIZLLL(4, "BlurUtils", X1D.LIZIZ(LIZ));
            sSupportRenderEffect = false;
            return false;
        }
    }

    public static void iterativeBoxBlur(Bitmap bitmap, int i) {
        if (bitmap == null) {
            LLog.LIZLLL(3, "Blur", "bitmap is null");
            return;
        }
        if (i <= 0) {
            LLog.LIZLLL(3, "Blur", "radius <= 0");
            return;
        }
        try {
            TraceEvent.LIZIZ("image.BlurUtils.nativeIterativeBoxBlur");
            nativeIterativeBoxBlur(bitmap, 3, i);
            TraceEvent.LJ("image.BlurUtils.nativeIterativeBoxBlur");
        } catch (RuntimeException e) {
            LLog.LIZLLL(3, "Blur", e.getMessage());
        }
    }

    public static boolean createEffect(View view, float f) {
        if (!isSupportRenderEffect() || f <= 0.0f) {
            return false;
        }
        if (!prepareViewSetMethod()) {
            sSupportRenderEffect = false;
            return false;
        }
        try {
            com_lynx_tasm_utils_BlurUtils_java_lang_reflect_Method_invoke(sSetRenderEffect, view, new Object[]{com_lynx_tasm_utils_BlurUtils_java_lang_reflect_Method_invoke(sCreateBlurEffect, null, new Object[]{Float.valueOf(f), Float.valueOf(f), Shader.TileMode.CLAMP})});
            return true;
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("createViewEffect failed ");
            LIZ.append(e.getMessage());
            LLog.LIZLLL(4, "BlurUtils", X1D.LIZIZ(LIZ));
            sSupportRenderEffect = false;
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0048, code lost:
    
        if (r3 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap rs(android.content.Context r5, android.graphics.Bitmap r6, float r7) {
        /*
            r4 = 0
            android.renderscript.RenderScript r3 = android.renderscript.RenderScript.create(r5)     // Catch: java.lang.Throwable -> L42
            android.renderscript.RenderScript$RSMessageHandler r0 = new android.renderscript.RenderScript$RSMessageHandler     // Catch: java.lang.Throwable -> L44
            r0.<init>()     // Catch: java.lang.Throwable -> L44
            r3.setMessageHandler(r0)     // Catch: java.lang.Throwable -> L44
            android.renderscript.Allocation$MipmapControl r1 = android.renderscript.Allocation.MipmapControl.MIPMAP_NONE     // Catch: java.lang.Throwable -> L44
            r0 = 1
            android.renderscript.Allocation r2 = android.renderscript.Allocation.createFromBitmap(r3, r6, r1, r0)     // Catch: java.lang.Throwable -> L44
            android.renderscript.Type r0 = r2.getType()     // Catch: java.lang.Throwable -> L3f
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createTyped(r3, r0)     // Catch: java.lang.Throwable -> L3f
            android.renderscript.Element r0 = android.renderscript.Element.U8_4(r3)     // Catch: java.lang.Throwable -> L3d
            android.renderscript.ScriptIntrinsicBlur r4 = android.renderscript.ScriptIntrinsicBlur.create(r3, r0)     // Catch: java.lang.Throwable -> L3d
            r4.setInput(r2)     // Catch: java.lang.Throwable -> L3d
            r4.setRadius(r7)     // Catch: java.lang.Throwable -> L3d
            r4.forEach(r1)     // Catch: java.lang.Throwable -> L3d
            r1.copyTo(r6)     // Catch: java.lang.Throwable -> L3d
            r3.destroy()
            r2.destroy()
            r1.destroy()
            r4.destroy()
            return r6
        L3d:
            r0 = move-exception
            goto L4a
        L3f:
            r0 = move-exception
            r1 = r4
            goto L47
        L42:
            r0 = move-exception
            goto L5c
        L44:
            r0 = move-exception
            r2 = r4
            r1 = r4
        L47:
            r4 = r1
            if (r3 == 0) goto L4d
        L4a:
            r3.destroy()
        L4d:
            if (r2 == 0) goto L52
            r2.destroy()
        L52:
            if (r1 == 0) goto L57
            r1.destroy()
        L57:
            if (r4 == 0) goto L5c
            r4.destroy()
        L5c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.utils.BlurUtils.rs(android.content.Context, android.graphics.Bitmap, float):android.graphics.Bitmap");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Bitmap blur(Context context, Bitmap bitmap, int i, int i2, float f, int i3) {
        boolean z;
        Bitmap bitmap2;
        float f2;
        if (i == 0 || i2 == 0) {
            return null;
        }
        if (i3 > 1) {
            z = true;
        } else {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        boolean booleanValue = valueOf.booleanValue();
        if (booleanValue != 0) {
            int i4 = i2 / i3;
            bitmap2 = Bitmap.createScaledBitmap(bitmap, i / i3, i4, true);
            f2 = i4;
        } else {
            bitmap2 = bitmap;
            f2 = booleanValue;
        }
        try {
            f2 = f;
            rs(context, bitmap2, f2 == true ? 1.0f : 0.0f);
        } catch (RSRuntimeException unused) {
            iterativeBoxBlur(bitmap2, (int) f2);
        }
        if (valueOf.booleanValue()) {
            int[] iArr = new int[i * i2];
            Bitmap.createScaledBitmap(bitmap2, i, i2, true).getPixels(iArr, 0, i, 0, 0, i, i2);
            bitmap.setPixels(iArr, 0, i, 0, 0, i, i2);
        }
        return bitmap;
    }
}
