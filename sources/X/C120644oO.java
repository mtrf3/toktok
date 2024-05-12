package X;

import android.content.Context;
import com.bytedance.ies.cutsame.util.MediaUtil;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEPoint;
import com.bytedance.ies.nle.editor_jni.NLEStyClip;
import com.bytedance.ies.nle.editor_jni.NLEStyCrop;
import com.ss.android.ugc.cut_ui.ItemCrop;
import kotlin.jvm.internal.o;

/* renamed from: X.4oO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C120644oO {
    public static final /* synthetic */ int LIZ = 0;

    public static float LIZLLL(float f) {
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    public static ItemCrop LIZ(NLEStyClip nLEStyClip) {
        NLEPoint nLEPoint;
        NLEPoint nLEPoint2;
        NLEPoint nLEPoint3;
        long NLEStyClip_getLeftUpper = NLEEditorJniJNI.NLEStyClip_getLeftUpper(nLEStyClip.LIZ, nLEStyClip);
        NLEPoint nLEPoint4 = null;
        if (NLEStyClip_getLeftUpper == 0) {
            nLEPoint = null;
        } else {
            nLEPoint = new NLEPoint(NLEStyClip_getLeftUpper);
        }
        float NLEPoint_getX = (NLEEditorJniJNI.NLEPoint_getX(nLEPoint.LIZ, nLEPoint) * 0.5f) + 0.5f;
        long NLEStyClip_getLeftUpper2 = NLEEditorJniJNI.NLEStyClip_getLeftUpper(nLEStyClip.LIZ, nLEStyClip);
        if (NLEStyClip_getLeftUpper2 == 0) {
            nLEPoint2 = null;
        } else {
            nLEPoint2 = new NLEPoint(NLEStyClip_getLeftUpper2);
        }
        float f = ((-NLEEditorJniJNI.NLEPoint_getY(nLEPoint2.LIZ, nLEPoint2)) * 0.5f) + 0.5f;
        long NLEStyClip_getRightLower = NLEEditorJniJNI.NLEStyClip_getRightLower(nLEStyClip.LIZ, nLEStyClip);
        if (NLEStyClip_getRightLower == 0) {
            nLEPoint3 = null;
        } else {
            nLEPoint3 = new NLEPoint(NLEStyClip_getRightLower);
        }
        float NLEPoint_getX2 = (NLEEditorJniJNI.NLEPoint_getX(nLEPoint3.LIZ, nLEPoint3) * 0.5f) + 0.5f;
        long NLEStyClip_getRightLower2 = NLEEditorJniJNI.NLEStyClip_getRightLower(nLEStyClip.LIZ, nLEStyClip);
        if (NLEStyClip_getRightLower2 != 0) {
            nLEPoint4 = new NLEPoint(NLEStyClip_getRightLower2);
        }
        return new ItemCrop(NLEPoint_getX, f, NLEPoint_getX2, ((-NLEEditorJniJNI.NLEPoint_getY(nLEPoint4.LIZ, nLEPoint4)) * 0.5f) + 0.5f);
    }

    public static ItemCrop LIZJ(NLEStyCrop nLEStyCrop) {
        return new ItemCrop(NLEEditorJniJNI.NLEStyCrop_getXLeftUpper(nLEStyCrop.LIZ, nLEStyCrop), NLEEditorJniJNI.NLEStyCrop_getYLeftUpper(nLEStyCrop.LIZ, nLEStyCrop), NLEEditorJniJNI.NLEStyCrop_getXRightLower(nLEStyCrop.LIZ, nLEStyCrop), NLEEditorJniJNI.NLEStyCrop_getYRightLower(nLEStyCrop.LIZ, nLEStyCrop));
    }

    public static NLEStyClip LJ(ItemCrop itemCrop) {
        NLEStyClip nLEStyClip = new NLEStyClip();
        NLEPoint nLEPoint = new NLEPoint();
        float f = 2;
        nLEPoint.LIZIZ((itemCrop.upperLeftX - 0.5f) * f);
        nLEPoint.LIZJ((0.5f - itemCrop.upperLeftY) * f);
        NLEEditorJniJNI.NLEStyClip_setLeftUpper(nLEStyClip.LIZ, nLEStyClip, NLEPoint.LIZ(nLEPoint), nLEPoint);
        NLEPoint nLEPoint2 = new NLEPoint();
        nLEPoint2.LIZIZ((itemCrop.lowerRightX - 0.5f) * f);
        nLEPoint2.LIZJ((0.5f - itemCrop.upperLeftY) * f);
        NLEEditorJniJNI.NLEStyClip_setRightUpper(nLEStyClip.LIZ, nLEStyClip, NLEPoint.LIZ(nLEPoint2), nLEPoint2);
        NLEPoint nLEPoint3 = new NLEPoint();
        nLEPoint3.LIZIZ((itemCrop.upperLeftX - 0.5f) * f);
        nLEPoint3.LIZJ((0.5f - itemCrop.lowerRightY) * f);
        NLEEditorJniJNI.NLEStyClip_setLeftLower(nLEStyClip.LIZ, nLEStyClip, NLEPoint.LIZ(nLEPoint3), nLEPoint3);
        NLEPoint nLEPoint4 = new NLEPoint();
        nLEPoint4.LIZIZ((itemCrop.lowerRightX - 0.5f) * f);
        nLEPoint4.LIZJ((0.5f - itemCrop.lowerRightY) * f);
        NLEEditorJniJNI.NLEStyClip_setRightLower(nLEStyClip.LIZ, nLEStyClip, NLEPoint.LIZ(nLEPoint4), nLEPoint4);
        return nLEStyClip;
    }

    public static NLEStyCrop LJFF(ItemCrop itemCrop) {
        NLEStyCrop nLEStyCrop = new NLEStyCrop();
        NLEEditorJniJNI.NLEStyCrop_setXLeftUpper(nLEStyCrop.LIZ, nLEStyCrop, itemCrop.upperLeftX);
        NLEEditorJniJNI.NLEStyCrop_setYLeftUpper(nLEStyCrop.LIZ, nLEStyCrop, itemCrop.upperLeftY);
        NLEEditorJniJNI.NLEStyCrop_setXRightUpper(nLEStyCrop.LIZ, nLEStyCrop, itemCrop.lowerRightX);
        NLEEditorJniJNI.NLEStyCrop_setYRightUpper(nLEStyCrop.LIZ, nLEStyCrop, itemCrop.upperLeftY);
        NLEEditorJniJNI.NLEStyCrop_setXLeftLower(nLEStyCrop.LIZ, nLEStyCrop, itemCrop.upperLeftX);
        NLEEditorJniJNI.NLEStyCrop_setYLeftLower(nLEStyCrop.LIZ, nLEStyCrop, itemCrop.lowerRightY);
        NLEEditorJniJNI.NLEStyCrop_setXRightLower(nLEStyCrop.LIZ, nLEStyCrop, itemCrop.lowerRightX);
        NLEEditorJniJNI.NLEStyCrop_setYRightLower(nLEStyCrop.LIZ, nLEStyCrop, itemCrop.lowerRightY);
        return nLEStyCrop;
    }

    public static ItemCrop LIZIZ(Context context, ItemCrop oriCrop, String alignMode, String path, int i, int i2) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(oriCrop, "oriCrop");
        o.LJIIIZ(alignMode, "alignMode");
        o.LJIIIZ(path, "path");
        if (o.LJ("align_video", alignMode) && oriCrop.upperLeftX == 0.0f && oriCrop.upperLeftY == 0.0f) {
            float f = 1.0f;
            if (oriCrop.lowerRightX == 1.0f && oriCrop.lowerRightY == 1.0f) {
                C145725nk LIZ2 = MediaUtil.LIZ.LIZ(context, path);
                int i3 = LIZ2.LJLILLLLZI;
                int i4 = LIZ2.LJLJI;
                int i5 = LIZ2.LJLJJI;
                if (i5 == 90 || i5 == 270) {
                    i4 = i3;
                    i3 = i4;
                }
                if (i3 > 0 && i4 > 0) {
                    f = Math.max(i / i3, i2 / i4);
                }
                float f2 = i3 * f;
                float f3 = i;
                float f4 = i4 * f;
                float f5 = i2;
                return new ItemCrop(LIZLLL((((int) (f2 - f3)) * 0.5f) / f2), LIZLLL((((int) (f4 - f5)) * 0.5f) / f4), LIZLLL((((int) (f3 + f2)) * 0.5f) / f2), LIZLLL((((int) (f5 + f4)) * 0.5f) / f4));
            }
            return oriCrop;
        }
        return oriCrop;
    }
}
