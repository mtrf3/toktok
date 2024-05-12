package X;

import android.content.res.Resources;
import defpackage.e1;

/* renamed from: X.Iy9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48341Iy9 extends AbstractC65781Prl implements InterfaceC65784Pro<Float> {
    public static final C48341Iy9 LJLIL = new C48341Iy9();

    public C48341Iy9() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Float invoke() {
        float f;
        Resources system;
        int identifier;
        if (FCD.LJII() || e1.LIZ(31744, "creative_tools_opti_max_brightness", true, false)) {
            try {
                system = Resources.getSystem();
                identifier = system.getIdentifier("config_screenBrightnessSettingMaximum", "integer", "android");
            } catch (Exception unused) {
                f = -1.0f;
            }
            if (identifier != 0) {
                f = system.getInteger(identifier);
                Float valueOf = Float.valueOf(f);
                float floatValue = valueOf.floatValue();
                if (C48331Ixz.LIZ() || C48331Ixz.LIZJ()) {
                    C145995oB c145995oB = new C145995oB();
                    c145995oB.LIZJ(Float.valueOf(floatValue), "max_brightness");
                    GXR.LIZ("tool_performance_brightness", c145995oB.LIZ);
                }
                return valueOf;
            }
        }
        f = 255.0f;
        Float valueOf2 = Float.valueOf(f);
        float floatValue2 = valueOf2.floatValue();
        if (C48331Ixz.LIZ()) {
        }
        C145995oB c145995oB2 = new C145995oB();
        c145995oB2.LIZJ(Float.valueOf(floatValue2), "max_brightness");
        GXR.LIZ("tool_performance_brightness", c145995oB2.LIZ);
        return valueOf2;
    }
}
