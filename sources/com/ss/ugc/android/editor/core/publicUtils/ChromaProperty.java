package com.ss.ugc.android.editor.core.publicUtils;

import X.C126434xj;
import X.C126454xl;
import X.F9E;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEMatrix;
import com.bytedance.ies.nle.editor_jni.NLESegmentChromaChannel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class ChromaProperty extends F9E {
    public final C126454xl intensity;
    public final C126454xl shadow;

    /* JADX WARN: Multi-variable type inference failed */
    public ChromaProperty() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ChromaProperty copy$default(ChromaProperty chromaProperty, C126454xl c126454xl, C126454xl c126454xl2, int i, Object obj) {
        if ((i & 1) != 0) {
            c126454xl = chromaProperty.intensity;
        }
        if ((i & 2) != 0) {
            c126454xl2 = chromaProperty.shadow;
        }
        return chromaProperty.copy(c126454xl, c126454xl2);
    }

    public final ChromaProperty copy(C126454xl intensity, C126454xl shadow) {
        o.LJIIIZ(intensity, "intensity");
        o.LJIIIZ(shadow, "shadow");
        return new ChromaProperty(intensity, shadow);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.intensity, this.shadow};
    }

    public final C126454xl getIntensity() {
        return this.intensity;
    }

    public final C126454xl getShadow() {
        return this.shadow;
    }

    public ChromaProperty(C126454xl intensity, C126454xl shadow) {
        o.LJIIIZ(intensity, "intensity");
        o.LJIIIZ(shadow, "shadow");
        this.intensity = intensity;
        this.shadow = shadow;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChromaProperty(NLESegmentChromaChannel segment, NLETrackSlot slot, NLEMatrix nLEMatrix) {
        this(new C126454xl(NLEEditorJniJNI.NLESegmentChromaChannel_getIntensity(segment.LIZJ, segment)), new C126454xl(NLEEditorJniJNI.NLESegmentChromaChannel_getShadow(segment.LIZJ, segment)));
        o.LJIIIZ(segment, "segment");
        o.LJIIIZ(slot, "slot");
    }

    public /* synthetic */ ChromaProperty(C126454xl c126454xl, C126454xl c126454xl2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C126434xj.LIZ : c126454xl, (i & 2) != 0 ? C126434xj.LIZ : c126454xl2);
    }
}
