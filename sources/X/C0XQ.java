package X;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import kotlin.jvm.internal.o;

/* renamed from: X.0XQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0XQ extends Canvas {
    public Canvas LIZ;

    @Override // android.graphics.Canvas
    public final void disableZ() {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.disableZ();
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.enableZ();
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.getDensity();
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.getHeight();
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.getWidth();
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.restore();
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int save() {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.save();
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        o.LJIIIZ(path, "path");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.clipOutPath(path);
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        o.LJIIIZ(rect, "rect");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.clipOutRect(rect);
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        o.LJIIIZ(path, "path");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.clipPath(path);
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        o.LJIIIZ(rect, "rect");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.concat(matrix);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i) {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawColor(i);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawPaint(paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        o.LJIIIZ(picture, "picture");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawPicture(picture);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        o.LJIIIZ(renderNode, "renderNode");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawRenderNode(renderNode);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            boolean clipBounds = canvas.getClipBounds(rect);
            if (clipBounds && rect != null) {
                Integer valueOf = Integer.valueOf(rect.width());
                if (valueOf != null) {
                    rect.set(0, 0, valueOf.intValue(), Integer.MAX_VALUE);
                } else if (rect != null) {
                    rect.set(0, 0, 0, Integer.MAX_VALUE);
                }
            }
            return clipBounds;
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix ctm) {
        o.LJIIIZ(ctm, "ctm");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.getMatrix(ctm);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        o.LJIIIZ(path, "path");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.quickReject(path);
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i) {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.restoreToCount(i);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f) {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.rotate(f);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.setBitmap(bitmap);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i) {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.setDensity(i);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.setDrawFilter(drawFilter);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.setMatrix(matrix);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rect) {
        o.LJIIIZ(rect, "rect");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.clipOutRect(rect);
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rect) {
        o.LJIIIZ(rect, "rect");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j) {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawColor(j);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rect) {
        o.LJIIIZ(rect, "rect");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.quickReject(rect);
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(op, "op");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.clipPath(path, op);
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        o.LJIIIZ(rect, "rect");
        o.LJIIIZ(op, "op");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, BlendMode mode) {
        o.LJIIIZ(mode, "mode");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawColor(i, mode);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] pts, Paint paint) {
        o.LJIIIZ(pts, "pts");
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawLines(pts, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF oval, Paint paint) {
        o.LJIIIZ(oval, "oval");
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawOval(oval, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawPath(path, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect dst) {
        o.LJIIIZ(picture, "picture");
        o.LJIIIZ(dst, "dst");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawPicture(picture, dst);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] pts, Paint paint) {
        o.LJIIIZ(pts, "pts");
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawPoints(pts, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect r, Paint paint) {
        o.LJIIIZ(r, "r");
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawRect(r, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType type) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(type, "type");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.quickReject(path, type);
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint);
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i) {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i);
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void scale(float f, float f2) {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.scale(f, f2);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void skew(float f, float f2) {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.skew(f, f2);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void translate(float f, float f2) {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.translate(f, f2);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rect, Region.Op op) {
        o.LJIIIZ(rect, "rect");
        o.LJIIIZ(op, "op");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, PorterDuff.Mode mode) {
        o.LJIIIZ(mode, "mode");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawColor(i, mode);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF dst) {
        o.LJIIIZ(picture, "picture");
        o.LJIIIZ(dst, "dst");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawPicture(picture, dst);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rect, Paint paint) {
        o.LJIIIZ(rect, "rect");
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawRect(rect, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rect, Canvas.EdgeType type) {
        o.LJIIIZ(rect, "rect");
        o.LJIIIZ(type, "type");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.quickReject(rect, type);
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j, BlendMode mode) {
        o.LJIIIZ(mode, "mode");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawColor(j, mode);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        o.LJIIIZ(bitmap, "bitmap");
        o.LJIIIZ(matrix, "matrix");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, matrix, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch patch, Rect dst, Paint paint) {
        o.LJIIIZ(patch, "patch");
        o.LJIIIZ(dst, "dst");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawPatch(patch, dst, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f, float f2, Paint paint) {
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawPoint(f, f2, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String text, float[] pos, Paint paint) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(pos, "pos");
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawPosText(text, pos, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i, int i2, int i3) {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawRGB(i, i2, i3);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i) {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint, i);
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i, int i2) {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i, i2);
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch patch, RectF dst, Paint paint) {
        o.LJIIIZ(patch, "patch");
        o.LJIIIZ(dst, "dst");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawPatch(patch, dst, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f, float f2, float f3, float f4) {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.clipOutRect(f, f2, f3, f4);
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f, float f2, float f3, float f4) {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.clipRect(f, f2, f3, f4);
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i, int i2, int i3, int i4) {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawARGB(i, i2, i3, i4);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect dst, Paint paint) {
        o.LJIIIZ(bitmap, "bitmap");
        o.LJIIIZ(dst, "dst");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, dst, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f, float f2, float f3, Paint paint) {
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawCircle(f, f2, f3, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] pts, int i, int i2, Paint paint) {
        o.LJIIIZ(pts, "pts");
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawLines(pts, i, i2, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i, int i2, Paint paint) {
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawPoints(fArr, i, i2, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rect, float f, float f2, Paint paint) {
        o.LJIIIZ(rect, "rect");
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawRoundRect(rect, f, f2, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String text, float f, float f2, Paint paint) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawText(text, f, f2, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f, float f2, float f3, float f4) {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.quickReject(f, f2, f3, f4);
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i, int i2, int i3, int i4) {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.clipOutRect(i, i2, i3, i4);
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i, int i2, int i3, int i4) {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.clipRect(i, i2, i3, i4);
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF dst, Paint paint) {
        o.LJIIIZ(bitmap, "bitmap");
        o.LJIIIZ(dst, "dst");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, dst, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f, float f2, Paint paint) {
        o.LJIIIZ(bitmap, "bitmap");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, f, f2, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f, float f2, float f3, float f4, Region.Op op) {
        o.LJIIIZ(op, "op");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.clipRect(f, f2, f3, f4, op);
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF oval, float f, float f2, boolean z, Paint paint) {
        o.LJIIIZ(oval, "oval");
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawArc(oval, f, f2, z, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF outer, float[] outerRadii, RectF inner, float[] innerRadii, Paint paint) {
        o.LJIIIZ(outer, "outer");
        o.LJIIIZ(outerRadii, "outerRadii");
        o.LJIIIZ(inner, "inner");
        o.LJIIIZ(innerRadii, "innerRadii");
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawDoubleRoundRect(outer, outerRadii, inner, innerRadii, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f, float f2, float f3, float f4, Paint paint) {
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawLine(f, f2, f3, f4, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f, float f2, float f3, float f4, Paint paint) {
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawOval(f, f2, f3, f4, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] text, int i, int i2, float[] pos, Paint paint) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(pos, "pos");
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawPosText(text, i, i2, pos, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawRect(f, f2, f3, f4, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String text, Path path, float f, float f2, Paint paint) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawTextOnPath(text, path, f, f2, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f, float f2, float f3, float f4, Canvas.EdgeType type) {
        o.LJIIIZ(type, "type");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.quickReject(f, f2, f3, f4, type);
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f, float f2, float f3, float f4, Paint paint) {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.saveLayer(f, f2, f3, f4, paint);
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i) {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f, f2, f3, f4, i);
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence text, int i, int i2, float f, float f2, Paint paint) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawText(text, i, i2, f, f2, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f, float f2, float f3, float f4, Paint paint, int i) {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.saveLayer(f, f2, f3, f4, paint, i);
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i, int i2) {
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f, f2, f3, f4, i, i2);
        }
        o.LJIJI("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawText(String text, int i, int i2, float f, float f2, Paint paint) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawText(text, i, i2, f, f2, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] text, int i, int i2, float f, float f2, Paint paint) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawText(text, i, i2, f, f2, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF outer, float f, float f2, RectF inner, float f3, float f4, Paint paint) {
        o.LJIIIZ(outer, "outer");
        o.LJIIIZ(inner, "inner");
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawDoubleRoundRect(outer, f, f2, inner, f3, f4, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] glyphIds, int i, float[] positions, int i2, int i3, Font font, Paint paint) {
        o.LJIIIZ(glyphIds, "glyphIds");
        o.LJIIIZ(positions, "positions");
        o.LJIIIZ(font, "font");
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawGlyphs(glyphIds, i, positions, i2, i3, font, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawRoundRect(f, f2, f3, f4, f5, f6, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] text, int i, int i2, Path path, float f, float f2, Paint paint) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawTextOnPath(text, i, i2, path, f, f2, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawArc(f, f2, f3, f4, f5, f6, z, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i, int i2, float[] verts, int i3, int[] iArr, int i4, Paint paint) {
        o.LJIIIZ(bitmap, "bitmap");
        o.LJIIIZ(verts, "verts");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawBitmapMesh(bitmap, i, i2, verts, i3, iArr, i4, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] colors, int i, int i2, float f, float f2, int i3, int i4, boolean z, Paint paint) {
        o.LJIIIZ(colors, "colors");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawBitmap(colors, i, i2, f, f2, i3, i4, z, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText text, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawTextRun(text, i, i2, i3, i4, f, f2, z, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] colors, int i, int i2, int i3, int i4, int i5, int i6, boolean z, Paint paint) {
        o.LJIIIZ(colors, "colors");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawBitmap(colors, i, i2, i3, i4, i5, i6, z, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence text, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawTextRun(text, i, i2, i3, i4, f, f2, z, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] text, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawTextRun(text, i, i2, i3, i4, f, f2, z, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode mode, int i, float[] verts, int i2, float[] fArr, int i3, int[] iArr, int i4, short[] sArr, int i5, int i6, Paint paint) {
        o.LJIIIZ(mode, "mode");
        o.LJIIIZ(verts, "verts");
        o.LJIIIZ(paint, "paint");
        Canvas canvas = this.LIZ;
        if (canvas != null) {
            canvas.drawVertices(mode, i, verts, i2, fArr, i3, iArr, i4, sArr, i5, i6, paint);
        } else {
            o.LJIJI("nativeCanvas");
            throw null;
        }
    }
}
