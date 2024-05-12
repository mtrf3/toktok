package com.byted.cast.sdk.gl.utils;

import X.V0N;
import X.X1D;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.Matrix;
import com.byted.cast.sdk.gl.drawer.TextureDrawer;
import com.byted.cast.sdk.log.Logger;
import com.byted.cast.sdk.log.LoggerManager;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* loaded from: classes29.dex */
public class GLUtils {
    public static int GL_VERSION = 2;
    public static final float[] IDENTITY_MATRIX;
    public static final Object GL_RENDER_FENCE = new Object();
    public static float[] VERTEX_POSITION = {-1.0f, -1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f, 1.0f};
    public static float[] TEXTURE_COORDINATE = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
    public static float[] TEXTURE_COORDINATE_VERTICAL_FLIP = {0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};

    public static int createFBO() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        return iArr[0];
    }

    public static int createTexture() {
        return createTextures(1)[0];
    }

    public static int createVAO() {
        int[] iArr = new int[1];
        GLES30.glGenVertexArrays(1, iArr, 0);
        return iArr[0];
    }

    static {
        float[] fArr = new float[16];
        IDENTITY_MATRIX = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public static boolean isGL3() {
        if (GL_VERSION > 2) {
            return true;
        }
        return false;
    }

    /* loaded from: classes29.dex */
    public enum DISPLAY_MODE {
        FIT,
        FULL;

        public static DISPLAY_MODE valueOf(String str) {
            return (DISPLAY_MODE) V0N.LJJJ(DISPLAY_MODE.class, str);
        }
    }

    public static FloatBuffer createFloatBuffer(float[] fArr) {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public static ShortBuffer createShortBuffer(short[] sArr) {
        ShortBuffer asShortBuffer = ByteBuffer.allocateDirect(sArr.length * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
        asShortBuffer.put(sArr);
        asShortBuffer.position(0);
        return asShortBuffer;
    }

    public static int[] createTextures(int i) {
        int[] iArr = new int[i];
        GLES20.glGenTextures(i, iArr, 0);
        return iArr;
    }

    public static boolean isSupportEGL14(String str) {
        Logger logger = LoggerManager.getLogger(str);
        try {
            EGL14.eglGetCurrentContext();
            return true;
        } catch (NoClassDefFoundError unused) {
            logger.i("GLUtils", "EGL14 isn't supported on this platform, change to use EGL10.");
            return false;
        }
    }

    public static boolean checkGlError(String str, String str2) {
        Logger logger = LoggerManager.getLogger(str2);
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(": glError 0x");
            LIZ.append(Integer.toHexString(glGetError));
            logger.e("GLUtils", X1D.LIZIZ(LIZ));
            return false;
        }
        return true;
    }

    public static int loadTextureByBitmap(Bitmap bitmap, String str) {
        Logger logger = LoggerManager.getLogger(str);
        if (bitmap == null) {
            logger.e("GLUtils", "loadTextureByBitmap，load bitmap error, check the file path is correct!");
            return 0;
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        if (i != 0) {
            GLES20.glBindTexture(3553, i);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            android.opengl.GLUtils.texImage2D(3553, 0, bitmap, 0);
        }
        if (iArr[0] == 0) {
            logger.e("GLUtils", "loadTextureByBitmap, the texture id is 0!");
        }
        return iArr[0];
    }

    public static boolean validateProgram(int i, String str) {
        Logger logger = LoggerManager.getLogger(str);
        GLES20.glValidateProgram(i);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(i, 35715, iArr, 0);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Results of validating program: ");
        LIZ.append(iArr[0]);
        LIZ.append("\nLog:");
        LIZ.append(GLES20.glGetProgramInfoLog(i));
        logger.d("GLUtils", X1D.LIZIZ(LIZ));
        if (iArr[0] != 0) {
            return true;
        }
        return false;
    }

    public static int compileShader(int i, String str, String str2) {
        Logger logger = LoggerManager.getLogger(str2);
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteShader(glCreateShader);
            logger.e("GLUtils", "Compilation of shader failed.");
            return 0;
        }
        return glCreateShader;
    }

    public static TextureDrawer createAndSetupTexDrawer(int i, int i2, String str) {
        TextureDrawer textureDrawer = new TextureDrawer(str);
        textureDrawer.setViewportSize(i, i2);
        textureDrawer.setup();
        return textureDrawer;
    }

    public static int createProgram(String str, String str2, String str3) {
        Logger logger = LoggerManager.getLogger(str3);
        int compileShader = compileShader(35633, str, str3);
        int compileShader2 = compileShader(35632, str2, str3);
        if (compileShader == 0 || compileShader2 == 0) {
            return -1;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, compileShader);
        GLES20.glAttachShader(glCreateProgram, compileShader2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteProgram(glCreateProgram);
            logger.d("GLUtils", "Linking of program failed !");
            return -1;
        }
        if (!validateProgram(glCreateProgram, str3)) {
            return -1;
        }
        return glCreateProgram;
    }

    public static Bitmap getResizedBitmap(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(i / width, i2 / height);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        bitmap.recycle();
        return createBitmap;
    }

    public static int createImageTexture(ByteBuffer byteBuffer, int i, int i2, int i3, String str) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i4 = iArr[0];
        checkGlError("glGenTextures", str);
        GLES20.glBindTexture(3553, i4);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        checkGlError("loadImageTexture", str);
        GLES20.glTexImage2D(3553, 0, i3, i, i2, 0, i3, 5121, byteBuffer);
        checkGlError("loadImageTexture", str);
        return i4;
    }

    public static Bitmap loadSuitableBitmap(Context context, Uri uri, int i, int i2, String str) {
        Logger logger = LoggerManager.getLogger(str);
        if (context == null || uri == null) {
            logger.e("GLUtils", "loadSuitableBitmap error : context and uri can'tt be null!");
            return null;
        }
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (i <= 0 || i2 <= 0) {
                Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream);
                try {
                    openInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return decodeStream;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            int i3 = 1;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(openInputStream, null, options);
            try {
                openInputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            options.inJustDecodeBounds = false;
            int i4 = options.outWidth;
            int i5 = options.outHeight;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("loadSuitableBitmap, bitmap size = ");
            LIZ.append(i4);
            LIZ.append("x");
            LIZ.append(i5);
            logger.i("GLUtils", X1D.LIZIZ(LIZ));
            int i6 = i4 / i;
            int i7 = i5 / i2;
            if (i6 >= i7) {
                i6 = i7;
            }
            if (i6 > 0) {
                i3 = i6;
            }
            options.inSampleSize = i3;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("loadSuitableBitmap, inSampleSize = ");
            LIZ2.append(i3);
            logger.i("GLUtils", X1D.LIZIZ(LIZ2));
            try {
                InputStream openInputStream2 = context.getContentResolver().openInputStream(uri);
                Bitmap decodeStream2 = BitmapFactory.decodeStream(openInputStream2, null, options);
                try {
                    openInputStream2.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
                if (decodeStream2.getWidth() != i || decodeStream2.getHeight() != i2) {
                    return getResizedBitmap(decodeStream2, i, i2);
                }
                return decodeStream2;
            } catch (FileNotFoundException e4) {
                e4.printStackTrace();
                return null;
            }
        } catch (FileNotFoundException e5) {
            e5.printStackTrace();
            logger.e("GLUtils", "loadSuitableBitmap error : parsing uri error!");
            return null;
        }
    }
}
