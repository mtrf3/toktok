package com.ss.ugc.android.editor.core.publicUtils;

import X.C126434xj;
import X.C126454xl;
import X.F9E;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEMatrix;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class IntensityProperty extends F9E {
    public final C126454xl intensity;

    /* JADX WARN: Multi-variable type inference failed */
    public IntensityProperty() {
        this((C126454xl) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ IntensityProperty copy$default(IntensityProperty intensityProperty, C126454xl c126454xl, int i, Object obj) {
        if ((i & 1) != 0) {
            c126454xl = intensityProperty.intensity;
        }
        return intensityProperty.copy(c126454xl);
    }

    public final IntensityProperty copy(C126454xl intensity) {
        o.LJIIIZ(intensity, "intensity");
        return new IntensityProperty(intensity);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.intensity};
    }

    public final C126454xl getIntensity() {
        return this.intensity;
    }

    public IntensityProperty(C126454xl intensity) {
        o.LJIIIZ(intensity, "intensity");
        this.intensity = intensity;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntensityProperty(NLESegmentFilter segment, NLETrackSlot slot, NLEMatrix nLEMatrix) {
        this(new C126454xl(NLEEditorJniJNI.NLESegmentFilter_getIntensity(segment.LIZJ, segment)));
        o.LJIIIZ(segment, "segment");
        o.LJIIIZ(slot, "slot");
    }

    public /* synthetic */ IntensityProperty(C126454xl c126454xl, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C126434xj.LIZ : c126454xl);
    }
}
