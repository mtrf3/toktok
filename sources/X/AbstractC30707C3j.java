package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyParamSetting;

/* renamed from: X.C3j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC30707C3j {
    public static final float[] LJ = {0.0f, 0.3f, 0.43f, 0.57f, 0.7f, 0.8f};
    public float LIZ;
    public float LIZIZ;
    public float LIZJ;
    public int LIZLLL;

    public abstract void LIZIZ(float f);

    public abstract void LIZJ(float f);

    public abstract void LIZLLL(float f);

    public static void LIZ() {
        C48459J0d<Float> c48459J0d = InterfaceC30442Bx8.LJJIFFI;
        if (c48459J0d.LIZJ().floatValue() < 0.0f) {
            c48459J0d.LIZ(Float.valueOf(LiveBeautyParamSetting.INSTANCE.getValue().beauty.def));
        }
        C48459J0d<Float> c48459J0d2 = InterfaceC30442Bx8.LJJII;
        if (c48459J0d2.LIZJ().floatValue() < 0.0f) {
            c48459J0d2.LIZ(Float.valueOf(LiveBeautyParamSetting.INSTANCE.getValue().bigEyes.def));
        }
        C48459J0d<Float> c48459J0d3 = InterfaceC30442Bx8.LJJIII;
        if (c48459J0d3.LIZJ().floatValue() < 0.0f) {
            c48459J0d3.LIZ(Float.valueOf(LiveBeautyParamSetting.INSTANCE.getValue().lift.def));
        }
    }

    public AbstractC30707C3j() {
        LIZ();
        this.LIZ = InterfaceC30442Bx8.LJJIFFI.LIZJ().floatValue();
        this.LIZIZ = InterfaceC30442Bx8.LJJII.LIZJ().floatValue();
        this.LIZJ = InterfaceC30442Bx8.LJJIII.LIZJ().floatValue();
        this.LIZLLL = InterfaceC30442Bx8.LJJIIJ.LIZJ().intValue();
    }

    public final void LJ(int i) {
        if (i >= 6) {
            return;
        }
        C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.LJJIIJ;
        if (c48459J0d.LIZJ().intValue() != i) {
            c48459J0d.LIZ(Integer.valueOf(i));
            this.LIZLLL = i;
        }
        LIZIZ(LJ[i]);
    }

    public final void LJFF(float f) {
        C48459J0d<Float> c48459J0d = InterfaceC30442Bx8.LJJIFFI;
        if (c48459J0d.LIZJ().floatValue() != f) {
            c48459J0d.LIZ(Float.valueOf(f));
            this.LIZ = LiveBeautyParamSetting.INSTANCE.getValue().beauty.scale * f;
        }
        LIZIZ(this.LIZ);
    }

    public final void LJI(float f) {
        C48459J0d<Float> c48459J0d = InterfaceC30442Bx8.LJJII;
        if (c48459J0d.LIZJ().floatValue() != f) {
            c48459J0d.LIZ(Float.valueOf(f));
            this.LIZIZ = LiveBeautyParamSetting.INSTANCE.getValue().bigEyes.scale * f;
        }
        LIZJ(this.LIZIZ);
    }

    public final void LJII(float f) {
        C48459J0d<Float> c48459J0d = InterfaceC30442Bx8.LJJIII;
        if (c48459J0d.LIZJ().floatValue() != f) {
            c48459J0d.LIZ(Float.valueOf(f));
            this.LIZJ = LiveBeautyParamSetting.INSTANCE.getValue().lift.scale * f;
        }
        LIZLLL(this.LIZJ);
    }
}
