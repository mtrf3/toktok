package com.ss.ttlivestreamer.core.opengl;

import X.C16880lQ;
import X.X1D;
import X.YE1;
import android.app.ActivityManager;
import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TTLSBuildConfig;
import com.ss.ttlivestreamer.core.utils.TTLSSladarBugReportUtils;
import defpackage.i0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes12.dex */
public class GlUtil {
    public static int sFilterType = -1;

    public static void clearAllGLError() {
        boolean z = true;
        String str = "";
        int i = 0;
        while (z) {
            int i2 = i + 1;
            if (i >= 10) {
                break;
            }
            try {
                checkAnyGLES2Error("clearAllGLError");
                z = false;
            } catch (Exception e) {
                TTLSSladarBugReportUtils.getInstance().report(e, "GlUtil.clearAllGLError");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str);
                LIZ.append("|");
                LIZ.append(e.getMessage());
                str = X1D.LIZIZ(LIZ);
            }
            i = i2;
        }
        if (!TextUtils.isEmpty(str)) {
            AVLog.logKibana(6, "GlUtil", i0.LJFF("clearAllGLError:", str), new AndroidRuntimeException("clearAllGLError"));
        }
    }

    public static native int nativeAttachThreadToOpenGl(long j, int i, long j2);

    public static native long nativeCheckGLSyncor();

    public static native void nativeDetachThreadToOpenGl();

    public static native boolean nativeIsOpenGlThread();

    public static native void nativeWaitGLSyncor(long j, boolean z);

    public static long checkGLSyncor() {
        return nativeCheckGLSyncor();
    }

    public static boolean nativeAttachThreadToOpenGl() {
        if (nativeAttachThreadToOpenGl(GLThreadManager.getNativeEGLContext(), 0, 0L) == 0) {
            return false;
        }
        return true;
    }

    public static void checkAnyGLES2Error(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            if (EGL14.eglGetCurrentDisplay() != EGL14.EGL_NO_DISPLAY) {
                if (EGL14.eglGetCurrentContext() != EGL14.EGL_NO_CONTEXT) {
                    int glGetError = GLES20.glGetError();
                    if (glGetError == 0) {
                        return;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("GLES error:");
                    LIZ.append(str);
                    LIZ.append(" (code :");
                    LIZ.append(glGetError);
                    LIZ.append(")");
                    throw new AndroidRuntimeException(X1D.LIZIZ(LIZ));
                }
                throw new AndroidRuntimeException(i0.LJFF("Bad EGL context:", str));
            }
            throw new AndroidRuntimeException(i0.LJFF("Bad EGL display:", str));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("EGL error: ");
        LIZ2.append(str);
        LIZ2.append(" (code :");
        LIZ2.append(eglGetError);
        LIZ2.append(")");
        throw new AndroidRuntimeException(X1D.LIZIZ(LIZ2));
    }

    public static void checkNoGLES2Error(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
        } else {
            throw new RuntimeException(YE1.LIZIZ(str, ": GLES20 error: ", glGetError));
        }
    }

    public static FloatBuffer createFloatBuffer(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public static int generateTexture(int i) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i2 = iArr[0];
        GLES20.glBindTexture(i, i2);
        GLES20.glTexParameterf(i, 10241, getFilterType(9729));
        GLES20.glTexParameterf(i, 10240, getFilterType(9729));
        GLES20.glTexParameterf(i, 10242, 33071.0f);
        GLES20.glTexParameterf(i, 10243, 33071.0f);
        GLES20.glPixelStorei(3317, 2);
        checkNoGLES2Error("generateTexture");
        return i2;
    }

    public static int getFilterType(int i) {
        int i2 = sFilterType;
        if (i2 == 9729 || i2 == 9728) {
            return i2;
        }
        return i;
    }

    public static int getFilterTypeFromName(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -2025410270:
                if (str.equals("linear_mipmap_linear")) {
                    return 9987;
                }
                break;
            case -1580272728:
                if (str.equals("nearest_mipmap_nearest")) {
                    return 9984;
                }
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c = 2;
                    break;
                }
                break;
            case -1009299967:
                if (str.equals("linear_mipmap_nearest")) {
                    return 9985;
                }
                break;
            case -796902757:
                if (str.equals("nearest_mipmap_linear")) {
                    return 9986;
                }
                break;
            case 1825779806:
                if (str.equals("nearest")) {
                    return 9728;
                }
                break;
        }
        switch (c) {
            case 0:
                return 9987;
            case 1:
                return 9984;
            case 2:
                return 9729;
            case 3:
                return 9985;
            case 4:
                return 9986;
            case 5:
                return 9728;
            default:
                AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(i0.LJFF("unsupported texture filter ", str));
                TTLSSladarBugReportUtils tTLSSladarBugReportUtils = TTLSSladarBugReportUtils.getInstance();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("GlUtil.getFilterTypeFromName(");
                LIZ.append(str);
                LIZ.append(")");
                tTLSSladarBugReportUtils.report(androidRuntimeException, X1D.LIZIZ(LIZ));
                if (!TTLSBuildConfig.canThrowException()) {
                    return 9729;
                }
                throw androidRuntimeException;
        }
    }

    public static boolean isGLES3Support(Context context) {
        if (((ActivityManager) C16880lQ.LLILL(context, "activity")).getDeviceConfigurationInfo().reqGlEsVersion >= 196608) {
            return true;
        }
        return false;
    }

    public static void setFilterType(int i) {
        if (i == 9729 || i == 9728) {
            sFilterType = i;
        }
    }

    public static void waitGLSyncor(long j, boolean z) {
        nativeWaitGLSyncor(j, z);
    }
}
