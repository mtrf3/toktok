package com.byted.cast.sdk.gl.grafika;

import X.V0N;
import X.X1D;
import java.nio.FloatBuffer;

/* loaded from: classes29.dex */
public class Drawable2d {
    public static final FloatBuffer FULL_RECTANGLE_BUF;
    public static final float[] FULL_RECTANGLE_COORDS;
    public static final FloatBuffer FULL_RECTANGLE_TEX_BUF;
    public static final float[] FULL_RECTANGLE_TEX_COORDS;
    public static final FloatBuffer RECTANGLE_BUF;
    public static final float[] RECTANGLE_COORDS;
    public static final FloatBuffer RECTANGLE_TEX_BUF;
    public static final float[] RECTANGLE_TEX_COORDS;
    public static final FloatBuffer TRIANGLE_BUF;
    public static final float[] TRIANGLE_COORDS;
    public static final FloatBuffer TRIANGLE_TEX_BUF;
    public static final float[] TRIANGLE_TEX_COORDS;
    public int mCoordsPerVertex;
    public Prefab mPrefab;
    public FloatBuffer mTexCoordArray;
    public int mTexCoordStride;
    public FloatBuffer mVertexArray;
    public int mVertexCount;
    public int mVertexStride;

    static {
        float[] fArr = {0.0f, 0.57735026f, -0.5f, -0.28867513f, 0.5f, -0.28867513f};
        TRIANGLE_COORDS = fArr;
        float[] fArr2 = {0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        TRIANGLE_TEX_COORDS = fArr2;
        TRIANGLE_BUF = GlUtil.createFloatBuffer(fArr);
        TRIANGLE_TEX_BUF = GlUtil.createFloatBuffer(fArr2);
        float[] fArr3 = {-0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0.5f, 0.5f};
        RECTANGLE_COORDS = fArr3;
        float[] fArr4 = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        RECTANGLE_TEX_COORDS = fArr4;
        RECTANGLE_BUF = GlUtil.createFloatBuffer(fArr3);
        RECTANGLE_TEX_BUF = GlUtil.createFloatBuffer(fArr4);
        float[] fArr5 = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        FULL_RECTANGLE_COORDS = fArr5;
        float[] fArr6 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        FULL_RECTANGLE_TEX_COORDS = fArr6;
        FULL_RECTANGLE_BUF = GlUtil.createFloatBuffer(fArr5);
        FULL_RECTANGLE_TEX_BUF = GlUtil.createFloatBuffer(fArr6);
    }

    /* renamed from: com.byted.cast.sdk.gl.grafika.Drawable2d$1, reason: invalid class name */
    /* loaded from: classes29.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$byted$cast$sdk$gl$grafika$Drawable2d$Prefab;

        static {
            int[] iArr = new int[Prefab.values().length];
            $SwitchMap$com$byted$cast$sdk$gl$grafika$Drawable2d$Prefab = iArr;
            try {
                iArr[Prefab.TRIANGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$byted$cast$sdk$gl$grafika$Drawable2d$Prefab[Prefab.RECTANGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$byted$cast$sdk$gl$grafika$Drawable2d$Prefab[Prefab.FULL_RECTANGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public String toString() {
        if (this.mPrefab != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[Drawable2d: ");
            LIZ.append(this.mPrefab);
            LIZ.append("]");
            return X1D.LIZIZ(LIZ);
        }
        return "[Drawable2d: ...]";
    }

    public int getCoordsPerVertex() {
        return this.mCoordsPerVertex;
    }

    public FloatBuffer getTexCoordArray() {
        return this.mTexCoordArray;
    }

    public int getTexCoordStride() {
        return this.mTexCoordStride;
    }

    public FloatBuffer getVertexArray() {
        return this.mVertexArray;
    }

    public int getVertexCount() {
        return this.mVertexCount;
    }

    public int getVertexStride() {
        return this.mVertexStride;
    }

    /* loaded from: classes29.dex */
    public enum Prefab {
        TRIANGLE,
        RECTANGLE,
        FULL_RECTANGLE;

        public static Prefab valueOf(String str) {
            return (Prefab) V0N.LJJJ(Prefab.class, str);
        }
    }

    public Drawable2d(Prefab prefab) {
        int i = AnonymousClass1.$SwitchMap$com$byted$cast$sdk$gl$grafika$Drawable2d$Prefab[prefab.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.mVertexArray = FULL_RECTANGLE_BUF;
                    this.mTexCoordArray = FULL_RECTANGLE_TEX_BUF;
                    this.mCoordsPerVertex = 2;
                    this.mVertexStride = 8;
                    this.mVertexCount = FULL_RECTANGLE_COORDS.length / 2;
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Unknown shape ");
                    LIZ.append(prefab);
                    throw new RuntimeException(X1D.LIZIZ(LIZ));
                }
            } else {
                this.mVertexArray = RECTANGLE_BUF;
                this.mTexCoordArray = RECTANGLE_TEX_BUF;
                this.mCoordsPerVertex = 2;
                this.mVertexStride = 8;
                this.mVertexCount = RECTANGLE_COORDS.length / 2;
            }
        } else {
            this.mVertexArray = TRIANGLE_BUF;
            this.mTexCoordArray = TRIANGLE_TEX_BUF;
            this.mCoordsPerVertex = 2;
            this.mVertexStride = 8;
            this.mVertexCount = TRIANGLE_COORDS.length / 2;
        }
        this.mTexCoordStride = 8;
        this.mPrefab = prefab;
    }
}
