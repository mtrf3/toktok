package com.ss.ugc.android.editor.core.publicUtils;

import X.C126434xj;
import X.C126444xk;
import X.C126454xl;
import X.C47261Igj;
import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class VideoProperty extends F9E {
    public final C126454xl alpha;
    public final C126444xk position;
    public final C126454xl rotation;
    public final C126454xl scale;

    /* JADX WARN: Multi-variable type inference failed */
    public VideoProperty() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ VideoProperty copy$default(VideoProperty videoProperty, C126454xl c126454xl, C126444xk c126444xk, C126454xl c126454xl2, C126454xl c126454xl3, int i, Object obj) {
        if ((i & 1) != 0) {
            c126454xl = videoProperty.alpha;
        }
        if ((i & 2) != 0) {
            c126444xk = videoProperty.position;
        }
        if ((i & 4) != 0) {
            c126454xl2 = videoProperty.rotation;
        }
        if ((i & 8) != 0) {
            c126454xl3 = videoProperty.scale;
        }
        return videoProperty.copy(c126454xl, c126444xk, c126454xl2, c126454xl3);
    }

    public final VideoProperty copy(C126454xl alpha, C126444xk position, C126454xl rotation, C126454xl scale) {
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(position, "position");
        o.LJIIIZ(rotation, "rotation");
        o.LJIIIZ(scale, "scale");
        return new VideoProperty(alpha, position, rotation, scale);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.alpha, this.position, this.rotation, this.scale};
    }

    public final C126454xl getAlpha() {
        return this.alpha;
    }

    public final C126444xk getPosition() {
        return this.position;
    }

    public final C126454xl getRotation() {
        return this.rotation;
    }

    public final C126454xl getScale() {
        return this.scale;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VideoProperty(com.bytedance.ies.nle.editor_jni.NLESegmentVideo r7, com.bytedance.ies.nle.editor_jni.NLETrackSlot r8, com.bytedance.ies.nle.editor_jni.NLEMatrix r9) {
        /*
            r6 = this;
            java.lang.String r0 = "segment"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r0 = "slot"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            X.4xl r3 = new X.4xl
            long r0 = r7.LJ
            float r0 = com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI.NLESegmentVideo_getAlpha(r0, r7)
            double r0 = (double) r0
            r3.<init>(r0)
            X.4xk r4 = new X.4xk
            r2 = 2
            java.lang.Float[] r5 = new java.lang.Float[r2]
            if (r9 == 0) goto L60
            long r0 = r9.LIZ
            float r0 = com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI.NLEMatrix_transformX_get(r0, r9)
        L23:
            float r2 = (float) r2
            float r0 = r0 * r2
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            r0 = 0
            r5[r0] = r1
            if (r9 == 0) goto L5b
            long r0 = r9.LIZ
            float r0 = com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI.NLEMatrix_transformY_get(r0, r9)
        L34:
            float r0 = r0 * r2
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            r0 = 1
            r5[r0] = r1
            java.util.List r0 = X.C47261Igj.LJJIJIIJI(r5)
            r4.<init>(r0)
            X.4xl r5 = new X.4xl
            float r0 = r8.getRotation()
            double r0 = (double) r0
            r5.<init>(r0)
            X.4xl r2 = new X.4xl
            float r0 = r8.getScale()
            double r0 = (double) r0
            r2.<init>(r0)
            r6.<init>(r3, r4, r5, r2)
            return
        L5b:
            float r0 = r8.getTransformY()
            goto L34
        L60:
            float r0 = r8.getTransformX()
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.android.editor.core.publicUtils.VideoProperty.<init>(com.bytedance.ies.nle.editor_jni.NLESegmentVideo, com.bytedance.ies.nle.editor_jni.NLETrackSlot, com.bytedance.ies.nle.editor_jni.NLEMatrix):void");
    }

    public VideoProperty(C126454xl alpha, C126444xk position, C126454xl rotation, C126454xl scale) {
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(position, "position");
        o.LJIIIZ(rotation, "rotation");
        o.LJIIIZ(scale, "scale");
        this.alpha = alpha;
        this.position = position;
        this.rotation = rotation;
        this.scale = scale;
    }

    public /* synthetic */ VideoProperty(C126454xl c126454xl, C126444xk c126444xk, C126454xl c126454xl2, C126454xl c126454xl3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C126434xj.LIZ : c126454xl, (i & 2) != 0 ? new C126444xk(C47261Igj.LJJIJIIJI(Float.valueOf(0.0f), Float.valueOf(0.0f))) : c126444xk, (i & 4) != 0 ? C126434xj.LIZ : c126454xl2, (i & 8) != 0 ? C126434xj.LIZ : c126454xl3);
    }
}
