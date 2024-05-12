package com.ss.ugc.android.editor.core.api.params;

import X.F9E;
import android.graphics.PointF;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ImageCoverInfo extends F9E {
    public final PointF cropLeftBottom;
    public final PointF cropLeftTop;
    public final PointF cropRightBottom;
    public final PointF cropRightTop;
    public final String path;

    public static /* synthetic */ ImageCoverInfo copy$default(ImageCoverInfo imageCoverInfo, String str, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageCoverInfo.path;
        }
        if ((i & 2) != 0) {
            pointF = imageCoverInfo.cropLeftTop;
        }
        if ((i & 4) != 0) {
            pointF2 = imageCoverInfo.cropRightTop;
        }
        if ((i & 8) != 0) {
            pointF3 = imageCoverInfo.cropLeftBottom;
        }
        if ((i & 16) != 0) {
            pointF4 = imageCoverInfo.cropRightBottom;
        }
        return imageCoverInfo.copy(str, pointF, pointF2, pointF3, pointF4);
    }

    public final ImageCoverInfo copy(String path, PointF cropLeftTop, PointF cropRightTop, PointF cropLeftBottom, PointF cropRightBottom) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(cropLeftTop, "cropLeftTop");
        o.LJIIIZ(cropRightTop, "cropRightTop");
        o.LJIIIZ(cropLeftBottom, "cropLeftBottom");
        o.LJIIIZ(cropRightBottom, "cropRightBottom");
        return new ImageCoverInfo(path, cropLeftTop, cropRightTop, cropLeftBottom, cropRightBottom);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.path, this.cropLeftTop, this.cropRightTop, this.cropLeftBottom, this.cropRightBottom};
    }

    public final PointF getCropLeftBottom() {
        return this.cropLeftBottom;
    }

    public final PointF getCropLeftTop() {
        return this.cropLeftTop;
    }

    public final PointF getCropRightBottom() {
        return this.cropRightBottom;
    }

    public final PointF getCropRightTop() {
        return this.cropRightTop;
    }

    public final String getPath() {
        return this.path;
    }

    public ImageCoverInfo(String path, PointF cropLeftTop, PointF cropRightTop, PointF cropLeftBottom, PointF cropRightBottom) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(cropLeftTop, "cropLeftTop");
        o.LJIIIZ(cropRightTop, "cropRightTop");
        o.LJIIIZ(cropLeftBottom, "cropLeftBottom");
        o.LJIIIZ(cropRightBottom, "cropRightBottom");
        this.path = path;
        this.cropLeftTop = cropLeftTop;
        this.cropRightTop = cropRightTop;
        this.cropLeftBottom = cropLeftBottom;
        this.cropRightBottom = cropRightBottom;
    }
}
