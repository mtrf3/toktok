package com.ss.android.ugc.aweme.shortvideo.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class FrameItemCropInfo extends F9E implements Serializable {

    @InterfaceC65349Pkn("bottomLeft")
    public CorpPointF leftBottom;

    @InterfaceC65349Pkn("topLeft")
    public CorpPointF leftTop;

    @InterfaceC65349Pkn("bottomRight")
    public CorpPointF rightBottom;

    @InterfaceC65349Pkn("topRight")
    public CorpPointF rightTop;

    /* JADX WARN: Multi-variable type inference failed */
    public FrameItemCropInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FrameItemCropInfo copy$default(FrameItemCropInfo frameItemCropInfo, CorpPointF corpPointF, CorpPointF corpPointF2, CorpPointF corpPointF3, CorpPointF corpPointF4, int i, Object obj) {
        if ((i & 1) != 0) {
            corpPointF = frameItemCropInfo.leftTop;
        }
        if ((i & 2) != 0) {
            corpPointF2 = frameItemCropInfo.leftBottom;
        }
        if ((i & 4) != 0) {
            corpPointF3 = frameItemCropInfo.rightTop;
        }
        if ((i & 8) != 0) {
            corpPointF4 = frameItemCropInfo.rightBottom;
        }
        return frameItemCropInfo.copy(corpPointF, corpPointF2, corpPointF3, corpPointF4);
    }

    public final FrameItemCropInfo copy(CorpPointF leftTop, CorpPointF leftBottom, CorpPointF rightTop, CorpPointF rightBottom) {
        o.LJIIIZ(leftTop, "leftTop");
        o.LJIIIZ(leftBottom, "leftBottom");
        o.LJIIIZ(rightTop, "rightTop");
        o.LJIIIZ(rightBottom, "rightBottom");
        return new FrameItemCropInfo(leftTop, leftBottom, rightTop, rightBottom);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.leftTop, this.leftBottom, this.rightTop, this.rightBottom};
    }

    public final CorpPointF getLeftBottom() {
        return this.leftBottom;
    }

    public final CorpPointF getLeftTop() {
        return this.leftTop;
    }

    public final CorpPointF getRightBottom() {
        return this.rightBottom;
    }

    public final CorpPointF getRightTop() {
        return this.rightTop;
    }

    public final void setLeftBottom(CorpPointF corpPointF) {
        o.LJIIIZ(corpPointF, "<set-?>");
        this.leftBottom = corpPointF;
    }

    public final void setLeftTop(CorpPointF corpPointF) {
        o.LJIIIZ(corpPointF, "<set-?>");
        this.leftTop = corpPointF;
    }

    public final void setRightBottom(CorpPointF corpPointF) {
        o.LJIIIZ(corpPointF, "<set-?>");
        this.rightBottom = corpPointF;
    }

    public final void setRightTop(CorpPointF corpPointF) {
        o.LJIIIZ(corpPointF, "<set-?>");
        this.rightTop = corpPointF;
    }

    public FrameItemCropInfo(CorpPointF leftTop, CorpPointF leftBottom, CorpPointF rightTop, CorpPointF rightBottom) {
        o.LJIIIZ(leftTop, "leftTop");
        o.LJIIIZ(leftBottom, "leftBottom");
        o.LJIIIZ(rightTop, "rightTop");
        o.LJIIIZ(rightBottom, "rightBottom");
        this.leftTop = leftTop;
        this.leftBottom = leftBottom;
        this.rightTop = rightTop;
        this.rightBottom = rightBottom;
    }

    public /* synthetic */ FrameItemCropInfo(CorpPointF corpPointF, CorpPointF corpPointF2, CorpPointF corpPointF3, CorpPointF corpPointF4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CorpPointF(0.0f, 0.0f) : corpPointF, (i & 2) != 0 ? new CorpPointF(0.0f, 1.0f) : corpPointF2, (i & 4) != 0 ? new CorpPointF(1.0f, 0.0f) : corpPointF3, (i & 8) != 0 ? new CorpPointF(1.0f, 1.0f) : corpPointF4);
    }
}
