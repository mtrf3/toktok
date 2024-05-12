package com.ss.ugc.android.editor.core.publicUtils;

import X.C126434xj;
import X.C126464xm;
import X.F9E;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEMatrix;
import com.bytedance.ies.nle.editor_jni.NLESegmentMask;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class MaskProperty extends F9E {
    public final C126464xm centerX;
    public final C126464xm centerY;
    public final C126464xm feather;
    public final C126464xm height;
    public final C126464xm rotation;
    public final C126464xm roundCorner;
    public final C126464xm width;

    /* JADX WARN: Multi-variable type inference failed */
    public MaskProperty() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MaskProperty copy$default(MaskProperty maskProperty, C126464xm c126464xm, C126464xm c126464xm2, C126464xm c126464xm3, C126464xm c126464xm4, C126464xm c126464xm5, C126464xm c126464xm6, C126464xm c126464xm7, int i, Object obj) {
        if ((i & 1) != 0) {
            c126464xm = maskProperty.width;
        }
        if ((i & 2) != 0) {
            c126464xm2 = maskProperty.height;
        }
        if ((i & 4) != 0) {
            c126464xm3 = maskProperty.centerX;
        }
        if ((i & 8) != 0) {
            c126464xm4 = maskProperty.centerY;
        }
        if ((i & 16) != 0) {
            c126464xm5 = maskProperty.rotation;
        }
        if ((i & 32) != 0) {
            c126464xm6 = maskProperty.feather;
        }
        if ((i & 64) != 0) {
            c126464xm7 = maskProperty.roundCorner;
        }
        return maskProperty.copy(c126464xm, c126464xm2, c126464xm3, c126464xm4, c126464xm5, c126464xm6, c126464xm7);
    }

    public final MaskProperty copy(C126464xm width, C126464xm height, C126464xm centerX, C126464xm centerY, C126464xm rotation, C126464xm feather, C126464xm roundCorner) {
        o.LJIIIZ(width, "width");
        o.LJIIIZ(height, "height");
        o.LJIIIZ(centerX, "centerX");
        o.LJIIIZ(centerY, "centerY");
        o.LJIIIZ(rotation, "rotation");
        o.LJIIIZ(feather, "feather");
        o.LJIIIZ(roundCorner, "roundCorner");
        return new MaskProperty(width, height, centerX, centerY, rotation, feather, roundCorner);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.width, this.height, this.centerX, this.centerY, this.rotation, this.feather, this.roundCorner};
    }

    public final C126464xm getCenterX() {
        return this.centerX;
    }

    public final C126464xm getCenterY() {
        return this.centerY;
    }

    public final C126464xm getFeather() {
        return this.feather;
    }

    public final C126464xm getHeight() {
        return this.height;
    }

    public final C126464xm getRotation() {
        return this.rotation;
    }

    public final C126464xm getRoundCorner() {
        return this.roundCorner;
    }

    public final C126464xm getWidth() {
        return this.width;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaskProperty(NLESegmentMask segment, NLETrackSlot slot, NLEMatrix nLEMatrix) {
        this(new C126464xm(NLEEditorJniJNI.NLESegmentMask_getWidth(segment.LIZJ, segment)), new C126464xm(NLEEditorJniJNI.NLESegmentMask_getHeight(segment.LIZJ, segment)), new C126464xm(NLEEditorJniJNI.NLESegmentMask_getCenterX(segment.LIZJ, segment)), new C126464xm(NLEEditorJniJNI.NLESegmentMask_getCenterY(segment.LIZJ, segment)), new C126464xm(NLEEditorJniJNI.NLESegmentMask_getRotation(segment.LIZJ, segment)), new C126464xm(NLEEditorJniJNI.NLESegmentMask_getFeather(segment.LIZJ, segment)), new C126464xm(NLEEditorJniJNI.NLESegmentMask_getRoundCorner(segment.LIZJ, segment)));
        o.LJIIIZ(segment, "segment");
        o.LJIIIZ(slot, "slot");
    }

    public MaskProperty(C126464xm width, C126464xm height, C126464xm centerX, C126464xm centerY, C126464xm rotation, C126464xm feather, C126464xm roundCorner) {
        o.LJIIIZ(width, "width");
        o.LJIIIZ(height, "height");
        o.LJIIIZ(centerX, "centerX");
        o.LJIIIZ(centerY, "centerY");
        o.LJIIIZ(rotation, "rotation");
        o.LJIIIZ(feather, "feather");
        o.LJIIIZ(roundCorner, "roundCorner");
        this.width = width;
        this.height = height;
        this.centerX = centerX;
        this.centerY = centerY;
        this.rotation = rotation;
        this.feather = feather;
        this.roundCorner = roundCorner;
    }

    public /* synthetic */ MaskProperty(C126464xm c126464xm, C126464xm c126464xm2, C126464xm c126464xm3, C126464xm c126464xm4, C126464xm c126464xm5, C126464xm c126464xm6, C126464xm c126464xm7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C126434xj.LIZIZ : c126464xm, (i & 2) != 0 ? C126434xj.LIZIZ : c126464xm2, (i & 4) != 0 ? C126434xj.LIZIZ : c126464xm3, (i & 8) != 0 ? C126434xj.LIZIZ : c126464xm4, (i & 16) != 0 ? C126434xj.LIZIZ : c126464xm5, (i & 32) != 0 ? C126434xj.LIZIZ : c126464xm6, (i & 64) != 0 ? C126434xj.LIZIZ : c126464xm7);
    }
}
