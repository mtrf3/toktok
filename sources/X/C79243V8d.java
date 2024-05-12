package X;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;
import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.V8d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79243V8d extends Canvas {
    public boolean LIZ;

    @Override // android.graphics.Canvas
    public final void drawColor(int i) {
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        o.LJIIJ(paint, "paint");
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        o.LJIIJ(picture, "picture");
        if (picture.getWidth() > 0 && picture.getHeight() > 0) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        o.LJIIJ(renderNode, "renderNode");
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j) {
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, BlendMode mode) {
        o.LJIIJ(mode, "mode");
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] pts, Paint paint) {
        o.LJIIJ(pts, "pts");
        o.LJIIJ(paint, "paint");
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF oval, Paint paint) {
        o.LJIIJ(oval, "oval");
        o.LJIIJ(paint, "paint");
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        o.LJIIJ(path, "path");
        o.LJIIJ(paint, "paint");
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect dst) {
        o.LJIIJ(picture, "picture");
        o.LJIIJ(dst, "dst");
        if (picture.getWidth() > 0 && picture.getHeight() > 0) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] pts, Paint paint) {
        o.LJIIJ(pts, "pts");
        o.LJIIJ(paint, "paint");
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect r, Paint paint) {
        o.LJIIJ(r, "r");
        o.LJIIJ(paint, "paint");
        if (!r.isEmpty()) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, PorterDuff.Mode mode) {
        o.LJIIJ(mode, "mode");
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF dst) {
        o.LJIIJ(picture, "picture");
        o.LJIIJ(dst, "dst");
        if (picture.getWidth() > 0 && picture.getHeight() > 0) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rect, Paint paint) {
        o.LJIIJ(rect, "rect");
        o.LJIIJ(paint, "paint");
        if (!rect.isEmpty()) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j, BlendMode mode) {
        o.LJIIJ(mode, "mode");
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        o.LJIIJ(bitmap, "bitmap");
        o.LJIIJ(matrix, "matrix");
        if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f, float f2, Paint paint) {
        o.LJIIJ(paint, "paint");
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String text, float[] pos, Paint paint) {
        o.LJIIJ(text, "text");
        o.LJIIJ(pos, "pos");
        o.LJIIJ(paint, "paint");
        if (TextUtils.isEmpty(text)) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i, int i2, int i3) {
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i, int i2, int i3, int i4) {
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect dst, Paint paint) {
        o.LJIIJ(bitmap, "bitmap");
        o.LJIIJ(dst, "dst");
        if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f, float f2, float f3, Paint paint) {
        o.LJIIJ(paint, "paint");
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] pts, int i, int i2, Paint paint) {
        o.LJIIJ(pts, "pts");
        o.LJIIJ(paint, "paint");
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i, int i2, Paint paint) {
        o.LJIIJ(paint, "paint");
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rect, float f, float f2, Paint paint) {
        o.LJIIJ(rect, "rect");
        o.LJIIJ(paint, "paint");
        if (!rect.isEmpty()) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String text, float f, float f2, Paint paint) {
        o.LJIIJ(text, "text");
        o.LJIIJ(paint, "paint");
        if (!TextUtils.isEmpty(text)) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF dst, Paint paint) {
        o.LJIIJ(bitmap, "bitmap");
        o.LJIIJ(dst, "dst");
        if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f, float f2, Paint paint) {
        o.LJIIJ(bitmap, "bitmap");
        if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF oval, float f, float f2, boolean z, Paint paint) {
        o.LJIIJ(oval, "oval");
        o.LJIIJ(paint, "paint");
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF outer, float[] outerRadii, RectF inner, float[] innerRadii, Paint paint) {
        o.LJIIJ(outer, "outer");
        o.LJIIJ(outerRadii, "outerRadii");
        o.LJIIJ(inner, "inner");
        o.LJIIJ(innerRadii, "innerRadii");
        o.LJIIJ(paint, "paint");
        if (!outer.isEmpty() || !inner.isEmpty()) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f, float f2, float f3, float f4, Paint paint) {
        o.LJIIJ(paint, "paint");
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f, float f2, float f3, float f4, Paint paint) {
        o.LJIIJ(paint, "paint");
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] text, int i, int i2, float[] pos, Paint paint) {
        o.LJIIJ(text, "text");
        o.LJIIJ(pos, "pos");
        o.LJIIJ(paint, "paint");
        if (TextUtils.isEmpty(new String(text))) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        o.LJIIJ(paint, "paint");
        if (!new RectF(f, f2, f3, f4).isEmpty()) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String text, Path path, float f, float f2, Paint paint) {
        o.LJIIJ(text, "text");
        o.LJIIJ(path, "path");
        o.LJIIJ(paint, "paint");
        if (!TextUtils.isEmpty(text)) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] text, int i, int i2, float f, float f2, Paint paint) {
        o.LJIIJ(text, "text");
        o.LJIIJ(paint, "paint");
        if (!TextUtils.isEmpty(new String(text))) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence text, int i, int i2, float f, float f2, Paint paint) {
        o.LJIIJ(text, "text");
        o.LJIIJ(paint, "paint");
        if (!TextUtils.isEmpty(text)) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String text, int i, int i2, float f, float f2, Paint paint) {
        o.LJIIJ(text, "text");
        o.LJIIJ(paint, "paint");
        if (!TextUtils.isEmpty(text)) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF outer, float f, float f2, RectF inner, float f3, float f4, Paint paint) {
        o.LJIIJ(outer, "outer");
        o.LJIIJ(inner, "inner");
        o.LJIIJ(paint, "paint");
        if (!outer.isEmpty() || !inner.isEmpty()) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        o.LJIIJ(paint, "paint");
        if (!new RectF(f, f2, f3, f4).isEmpty()) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] text, int i, int i2, Path path, float f, float f2, Paint paint) {
        o.LJIIJ(text, "text");
        o.LJIIJ(path, "path");
        o.LJIIJ(paint, "paint");
        if (!TextUtils.isEmpty(new String(text))) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        o.LJIIJ(paint, "paint");
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i, int i2, float[] verts, int i3, int[] iArr, int i4, Paint paint) {
        o.LJIIJ(bitmap, "bitmap");
        o.LJIIJ(verts, "verts");
        if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
            this.LIZ = true;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] colors, int i, int i2, float f, float f2, int i3, int i4, boolean z, Paint paint) {
        o.LJIIJ(colors, "colors");
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText text, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        o.LJIIJ(text, "text");
        o.LJIIJ(paint, "paint");
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] colors, int i, int i2, int i3, int i4, int i5, int i6, boolean z, Paint paint) {
        o.LJIIJ(colors, "colors");
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence text, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        o.LJIIJ(text, "text");
        o.LJIIJ(paint, "paint");
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] text, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        o.LJIIJ(text, "text");
        o.LJIIJ(paint, "paint");
        this.LIZ = true;
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode mode, int i, float[] verts, int i2, float[] fArr, int i3, int[] iArr, int i4, short[] sArr, int i5, int i6, Paint paint) {
        o.LJIIJ(mode, "mode");
        o.LJIIJ(verts, "verts");
        o.LJIIJ(paint, "paint");
        this.LIZ = true;
    }
}
