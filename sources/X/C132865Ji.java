package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.5Ji, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132865Ji {
    public static final /* synthetic */ int LIZ = 0;

    public static OSZ LIZ(float f, float f2, float f3) {
        float f4 = f2 / f3;
        Float valueOf = Float.valueOf(1280.0f);
        Float valueOf2 = Float.valueOf(720.0f);
        if (f4 > f) {
            float f5 = f * f3;
            if (!Float.isInfinite(f5) && !Float.isNaN(f5) && !Float.isInfinite(f3) && !Float.isNaN(f3)) {
                return new OSZ(Float.valueOf(f5), Float.valueOf(f3));
            }
            return new OSZ(valueOf2, valueOf);
        }
        float f6 = f2 / f;
        if (!Float.isInfinite(f2) && !Float.isNaN(f2) && !Float.isInfinite(f6) && !Float.isNaN(f6)) {
            return new OSZ(Float.valueOf(f2), Float.valueOf(f6));
        }
        return new OSZ(valueOf2, valueOf);
    }

    public static void LIZLLL(NLETrackSlot nLETrackSlot, float f, float f2) {
        EnumC124724uy commitLevel = EnumC124724uy.NONE;
        o.LJIIIZ(commitLevel, "commitLevel");
        nLETrackSlot.setTransformX(nLETrackSlot.getTransformX() + f);
        nLETrackSlot.setTransformY(nLETrackSlot.getTransformY() + f2);
        commitLevel.ordinal();
    }

    public static void LIZJ(NLETrackSlot slot, float f, float f2, float f3) {
        EnumC124724uy commitLevel = EnumC124724uy.NONE;
        o.LJIIIZ(slot, "slot");
        o.LJIIIZ(commitLevel, "commitLevel");
        slot.setTransformX(slot.getTransformX() + f);
        slot.setTransformY(slot.getTransformY() + f2);
        slot.setScale(slot.getScale() * f3);
        commitLevel.ordinal();
    }

    public static C5PT LIZIZ(InterfaceC132925Jo material, NLETrackSlot nLETrackSlot, Float f, OSZ osz, Integer num, Integer num2) {
        float f2;
        float f3;
        float rotation;
        o.LJIIIZ(material, "material");
        if (nLETrackSlot == null || f == null || osz == null || num == null || num2 == null) {
            return null;
        }
        o.LIZJ(f, 0.0f);
        float floatValue = ((Number) osz.getFirst()).floatValue();
        float floatValue2 = ((Number) osz.getSecond()).floatValue();
        if (material.LJIJJ() == C5HP.RIGHT) {
            f2 = nLETrackSlot.getTransformX();
        } else {
            f2 = -nLETrackSlot.getTransformX();
        }
        if (material.LJIIIIZZ() == C5HQ.DOWN) {
            f3 = nLETrackSlot.getTransformY();
        } else {
            f3 = -nLETrackSlot.getTransformY();
        }
        float intValue = (num.intValue() * 0.5f) + ((floatValue * f2) / material.LJIIJJI());
        float intValue2 = (num2.intValue() * 0.5f) + ((floatValue2 * f3) / material.LJIIJJI());
        OSZ<Float, Float> LJI = material.LJI(nLETrackSlot);
        if (material.LJIJJLI() == EnumC132175Gr.ANTICLOCKWISE) {
            rotation = -nLETrackSlot.getRotation();
        } else {
            rotation = nLETrackSlot.getRotation();
        }
        return new C5PT(nLETrackSlot.getScale() * ((int) LJI.getFirst().floatValue()), nLETrackSlot.getScale() * ((int) LJI.getSecond().floatValue()), intValue, intValue2, (int) rotation);
    }
}
