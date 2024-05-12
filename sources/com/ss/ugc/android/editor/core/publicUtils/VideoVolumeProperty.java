package com.ss.ugc.android.editor.core.publicUtils;

import X.F9E;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class VideoVolumeProperty extends F9E {
    public final String curve;
    public final double volume;

    /* JADX WARN: Multi-variable type inference failed */
    public VideoVolumeProperty() {
        this(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ VideoVolumeProperty copy$default(VideoVolumeProperty videoVolumeProperty, double d, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = videoVolumeProperty.volume;
        }
        if ((i & 2) != 0) {
            str = videoVolumeProperty.curve;
        }
        return videoVolumeProperty.copy(d, str);
    }

    public final VideoVolumeProperty copy(double d, String curve) {
        o.LJIIIZ(curve, "curve");
        return new VideoVolumeProperty(d, curve);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Double.valueOf(this.volume), this.curve};
    }

    public final String getCurve() {
        return this.curve;
    }

    public final double getVolume() {
        return this.volume;
    }

    public VideoVolumeProperty(double d, String curve) {
        o.LJIIIZ(curve, "curve");
        this.volume = d;
        this.curve = curve;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VideoVolumeProperty(com.bytedance.ies.nle.editor_jni.NLESegmentAudio r7, com.bytedance.ies.nle.editor_jni.NLETrackSlot r8, com.bytedance.ies.nle.editor_jni.NLEMatrix r9) {
        /*
            r6 = this;
            java.lang.String r0 = "segment"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r0 = "slot"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            boolean r0 = r7 instanceof com.bytedance.ies.nle.editor_jni.NLESegmentVideo
            if (r0 == 0) goto L26
            com.bytedance.ies.nle.editor_jni.NLESegmentVideo r7 = (com.bytedance.ies.nle.editor_jni.NLESegmentVideo) r7
            boolean r0 = r7.LJJII()
            if (r0 == 0) goto L23
            float r0 = r7.LJIILJJIL()
        L1a:
            double r1 = (double) r0
        L1b:
            r3 = 0
            r4 = 2
            r0 = r6
            r5 = r3
            r0.<init>(r1, r3, r4, r5)
            return
        L23:
            r1 = 0
            goto L1b
        L26:
            float r0 = r7.LJIILJJIL()
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.android.editor.core.publicUtils.VideoVolumeProperty.<init>(com.bytedance.ies.nle.editor_jni.NLESegmentAudio, com.bytedance.ies.nle.editor_jni.NLETrackSlot, com.bytedance.ies.nle.editor_jni.NLEMatrix):void");
    }

    public /* synthetic */ VideoVolumeProperty(double d, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0d : d, (i & 2) != 0 ? "" : str);
    }
}
