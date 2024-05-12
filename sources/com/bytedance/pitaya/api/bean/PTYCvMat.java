package com.bytedance.pitaya.api.bean;

import android.graphics.Bitmap;
import com.bytedance.pitaya.media.GraphicByte;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class PTYCvMat extends PTYClass {
    public Bitmap bitmap;
    public GraphicByte graphicByte;

    /* JADX WARN: Multi-variable type inference failed */
    public PTYCvMat() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final GraphicByte getGraphicByte() {
        return this.graphicByte;
    }

    public final void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public final void setGraphicByte(GraphicByte graphicByte) {
        this.graphicByte = graphicByte;
    }

    public PTYCvMat(Bitmap bitmap, GraphicByte graphicByte) {
        super(2);
        this.bitmap = bitmap;
        this.graphicByte = graphicByte;
    }

    public /* synthetic */ PTYCvMat(Bitmap bitmap, GraphicByte graphicByte, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bitmap, (i & 2) != 0 ? null : graphicByte);
    }
}
