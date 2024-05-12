package com.ss.ugc.android.editor.core.publicUtils;

import X.C126444xk;
import X.C126454xl;
import X.F9E;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class TextProperty extends F9E {
    public final C126444xk backgroundColor;
    public C126444xk boundingBoxWithoutRotate;
    public final C126444xk outlineColor;
    public final C126454xl outlineWidth;
    public final C126444xk position;
    public final C126454xl rotation;
    public final C126444xk scale;
    public final C126444xk shadowColor;
    public final C126444xk shadowOffset;
    public final C126454xl shadowSmoothing;
    public final C126444xk textColor;

    public TextProperty() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public static /* synthetic */ TextProperty copy$default(TextProperty textProperty, C126444xk c126444xk, C126444xk c126444xk2, C126454xl c126454xl, C126444xk c126444xk3, C126444xk c126444xk4, C126444xk c126444xk5, C126454xl c126454xl2, C126444xk c126444xk6, C126454xl c126454xl3, C126444xk c126444xk7, C126444xk c126444xk8, int i, Object obj) {
        if ((i & 1) != 0) {
            c126444xk = textProperty.position;
        }
        if ((i & 2) != 0) {
            c126444xk2 = textProperty.scale;
        }
        if ((i & 4) != 0) {
            c126454xl = textProperty.rotation;
        }
        if ((i & 8) != 0) {
            c126444xk3 = textProperty.textColor;
        }
        if ((i & 16) != 0) {
            c126444xk4 = textProperty.backgroundColor;
        }
        if ((i & 32) != 0) {
            c126444xk5 = textProperty.shadowColor;
        }
        if ((i & 64) != 0) {
            c126454xl2 = textProperty.shadowSmoothing;
        }
        if ((i & 128) != 0) {
            c126444xk6 = textProperty.shadowOffset;
        }
        if ((i & 256) != 0) {
            c126454xl3 = textProperty.outlineWidth;
        }
        if ((i & 512) != 0) {
            c126444xk7 = textProperty.outlineColor;
        }
        if ((i & 1024) != 0) {
            c126444xk8 = textProperty.boundingBoxWithoutRotate;
        }
        return textProperty.copy(c126444xk, c126444xk2, c126454xl, c126444xk3, c126444xk4, c126444xk5, c126454xl2, c126444xk6, c126454xl3, c126444xk7, c126444xk8);
    }

    public final TextProperty copy(C126444xk position, C126444xk scale, C126454xl rotation, C126444xk textColor, C126444xk backgroundColor, C126444xk shadowColor, C126454xl shadowSmoothing, C126444xk shadowOffset, C126454xl outlineWidth, C126444xk outlineColor, C126444xk boundingBoxWithoutRotate) {
        o.LJIIIZ(position, "position");
        o.LJIIIZ(scale, "scale");
        o.LJIIIZ(rotation, "rotation");
        o.LJIIIZ(textColor, "textColor");
        o.LJIIIZ(backgroundColor, "backgroundColor");
        o.LJIIIZ(shadowColor, "shadowColor");
        o.LJIIIZ(shadowSmoothing, "shadowSmoothing");
        o.LJIIIZ(shadowOffset, "shadowOffset");
        o.LJIIIZ(outlineWidth, "outlineWidth");
        o.LJIIIZ(outlineColor, "outlineColor");
        o.LJIIIZ(boundingBoxWithoutRotate, "boundingBoxWithoutRotate");
        return new TextProperty(position, scale, rotation, textColor, backgroundColor, shadowColor, shadowSmoothing, shadowOffset, outlineWidth, outlineColor, boundingBoxWithoutRotate);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.position, this.scale, this.rotation, this.textColor, this.backgroundColor, this.shadowColor, this.shadowSmoothing, this.shadowOffset, this.outlineWidth, this.outlineColor, this.boundingBoxWithoutRotate};
    }

    public final C126444xk getBackgroundColor() {
        return this.backgroundColor;
    }

    public final C126444xk getBoundingBoxWithoutRotate() {
        return this.boundingBoxWithoutRotate;
    }

    public final C126444xk getOutlineColor() {
        return this.outlineColor;
    }

    public final C126454xl getOutlineWidth() {
        return this.outlineWidth;
    }

    public final C126444xk getPosition() {
        return this.position;
    }

    public final C126454xl getRotation() {
        return this.rotation;
    }

    public final C126444xk getScale() {
        return this.scale;
    }

    public final C126444xk getShadowColor() {
        return this.shadowColor;
    }

    public final C126444xk getShadowOffset() {
        return this.shadowOffset;
    }

    public final C126454xl getShadowSmoothing() {
        return this.shadowSmoothing;
    }

    public final C126444xk getTextColor() {
        return this.textColor;
    }

    public final void setBoundingBoxWithoutRotate(C126444xk c126444xk) {
        o.LJIIIZ(c126444xk, "<set-?>");
        this.boundingBoxWithoutRotate = c126444xk;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextProperty(com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker r23, com.bytedance.ies.nle.editor_jni.NLETrackSlot r24, com.bytedance.ies.nle.editor_jni.NLEMatrix r25) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.android.editor.core.publicUtils.TextProperty.<init>(com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker, com.bytedance.ies.nle.editor_jni.NLETrackSlot, com.bytedance.ies.nle.editor_jni.NLEMatrix):void");
    }

    public TextProperty(C126444xk position, C126444xk scale, C126454xl rotation, C126444xk textColor, C126444xk backgroundColor, C126444xk shadowColor, C126454xl shadowSmoothing, C126444xk shadowOffset, C126454xl outlineWidth, C126444xk outlineColor, C126444xk boundingBoxWithoutRotate) {
        o.LJIIIZ(position, "position");
        o.LJIIIZ(scale, "scale");
        o.LJIIIZ(rotation, "rotation");
        o.LJIIIZ(textColor, "textColor");
        o.LJIIIZ(backgroundColor, "backgroundColor");
        o.LJIIIZ(shadowColor, "shadowColor");
        o.LJIIIZ(shadowSmoothing, "shadowSmoothing");
        o.LJIIIZ(shadowOffset, "shadowOffset");
        o.LJIIIZ(outlineWidth, "outlineWidth");
        o.LJIIIZ(outlineColor, "outlineColor");
        o.LJIIIZ(boundingBoxWithoutRotate, "boundingBoxWithoutRotate");
        this.position = position;
        this.scale = scale;
        this.rotation = rotation;
        this.textColor = textColor;
        this.backgroundColor = backgroundColor;
        this.shadowColor = shadowColor;
        this.shadowSmoothing = shadowSmoothing;
        this.shadowOffset = shadowOffset;
        this.outlineWidth = outlineWidth;
        this.outlineColor = outlineColor;
        this.boundingBoxWithoutRotate = boundingBoxWithoutRotate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextProperty(X.C126444xk r17, X.C126444xk r18, X.C126454xl r19, X.C126444xk r20, X.C126444xk r21, X.C126444xk r22, X.C126454xl r23, X.C126444xk r24, X.C126454xl r25, X.C126444xk r26, X.C126444xk r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.android.editor.core.publicUtils.TextProperty.<init>(X.4xk, X.4xk, X.4xl, X.4xk, X.4xk, X.4xk, X.4xl, X.4xk, X.4xl, X.4xk, X.4xk, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
