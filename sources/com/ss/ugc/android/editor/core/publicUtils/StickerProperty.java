package com.ss.ugc.android.editor.core.publicUtils;

import X.C126434xj;
import X.C126444xk;
import X.C126454xl;
import X.C47261Igj;
import X.C61878OQg;
import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class StickerProperty extends F9E {
    public C126444xk boundingBoxWithoutRotate;
    public final C126444xk position;
    public final C126454xl rotation;
    public final C126444xk scale;

    public StickerProperty() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ StickerProperty copy$default(StickerProperty stickerProperty, C126444xk c126444xk, C126444xk c126444xk2, C126454xl c126454xl, C126444xk c126444xk3, int i, Object obj) {
        if ((i & 1) != 0) {
            c126444xk = stickerProperty.position;
        }
        if ((i & 2) != 0) {
            c126444xk2 = stickerProperty.scale;
        }
        if ((i & 4) != 0) {
            c126454xl = stickerProperty.rotation;
        }
        if ((i & 8) != 0) {
            c126444xk3 = stickerProperty.boundingBoxWithoutRotate;
        }
        return stickerProperty.copy(c126444xk, c126444xk2, c126454xl, c126444xk3);
    }

    public final StickerProperty copy(C126444xk position, C126444xk scale, C126454xl rotation, C126444xk boundingBoxWithoutRotate) {
        o.LJIIIZ(position, "position");
        o.LJIIIZ(scale, "scale");
        o.LJIIIZ(rotation, "rotation");
        o.LJIIIZ(boundingBoxWithoutRotate, "boundingBoxWithoutRotate");
        return new StickerProperty(position, scale, rotation, boundingBoxWithoutRotate);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.position, this.scale, this.rotation, this.boundingBoxWithoutRotate};
    }

    public final C126444xk getBoundingBoxWithoutRotate() {
        return this.boundingBoxWithoutRotate;
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

    public final void setBoundingBoxWithoutRotate(C126444xk c126444xk) {
        o.LJIIIZ(c126444xk, "<set-?>");
        this.boundingBoxWithoutRotate = c126444xk;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public StickerProperty(com.bytedance.ies.nle.editor_jni.NLESegmentSticker r13, com.bytedance.ies.nle.editor_jni.NLETrackSlot r14, com.bytedance.ies.nle.editor_jni.NLEMatrix r15) {
        /*
            r12 = this;
            java.lang.String r0 = "segment"
            kotlin.jvm.internal.o.LJIIIZ(r13, r0)
            java.lang.String r0 = "slot"
            kotlin.jvm.internal.o.LJIIIZ(r14, r0)
            X.4xk r6 = new X.4xk
            r4 = 2
            java.lang.Float[] r5 = new java.lang.Float[r4]
            if (r15 == 0) goto L6c
            long r0 = r15.LIZ
            float r0 = com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI.NLEMatrix_transformX_get(r0, r15)
        L17:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r3 = 0
            r5[r3] = r0
            if (r15 == 0) goto L67
            long r0 = r15.LIZ
            float r0 = com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI.NLEMatrix_transformY_get(r0, r15)
        L26:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2 = 1
            r5[r2] = r0
            java.util.List r0 = X.C47261Igj.LJJIJIIJI(r5)
            r6.<init>(r0)
            X.4xk r7 = new X.4xk
            java.lang.Float[] r1 = new java.lang.Float[r4]
            float r0 = r14.getScale()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1[r3] = r0
            float r0 = r14.getScale()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1[r2] = r0
            java.util.List r0 = X.C47261Igj.LJJIJIIJI(r1)
            r7.<init>(r0)
            X.4xl r8 = new X.4xl
            float r0 = r14.getRotation()
            double r2 = (double) r0
            double r0 = -r2
            r8.<init>(r0)
            r9 = 0
            r10 = 8
            r5 = r12
            r11 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return
        L67:
            float r0 = r14.getTransformY()
            goto L26
        L6c:
            float r0 = r14.getTransformX()
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.android.editor.core.publicUtils.StickerProperty.<init>(com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLETrackSlot, com.bytedance.ies.nle.editor_jni.NLEMatrix):void");
    }

    public StickerProperty(C126444xk position, C126444xk scale, C126454xl rotation, C126444xk boundingBoxWithoutRotate) {
        o.LJIIIZ(position, "position");
        o.LJIIIZ(scale, "scale");
        o.LJIIIZ(rotation, "rotation");
        o.LJIIIZ(boundingBoxWithoutRotate, "boundingBoxWithoutRotate");
        this.position = position;
        this.scale = scale;
        this.rotation = rotation;
        this.boundingBoxWithoutRotate = boundingBoxWithoutRotate;
    }

    public StickerProperty(C126444xk c126444xk, C126444xk c126444xk2, C126454xl c126454xl, C126444xk c126444xk3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C126444xk(C47261Igj.LJJIJIIJI(Float.valueOf(0.0f), Float.valueOf(0.0f))) : c126444xk, (i & 2) != 0 ? new C126444xk(C47261Igj.LJJIJIIJI(Float.valueOf(1.0f), Float.valueOf(1.0f))) : c126444xk2, (i & 4) != 0 ? C126434xj.LIZ : c126454xl, (i & 8) != 0 ? new C126444xk(C61878OQg.INSTANCE) : c126444xk3);
    }
}
