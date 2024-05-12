package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* renamed from: X.HhN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44753HhN {
    public static String LIZ() {
        String json;
        String json2;
        String LIZJ = C31461Li.LIZJ("high_quality_ve_synthesis_settings", "", "getInstance().getStringV…esisSettings::class.java)");
        String hdCompileExternalSettings = InterfaceC44785Hht.LIZJ.hdCompileExternalSettings();
        if (C44796Hi4.LIZ() || C44797Hi5.LIZ()) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("key : ", "high_quality_ve_synthesis_settings", " , byteBenchValue : ");
            if (C30581Hy.LJJIFFI(String.class)) {
                json = String.valueOf(hdCompileExternalSettings);
            } else {
                json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), hdCompileExternalSettings);
            }
            C44847Hit.LIZJ(LIZIZ, json, LIZIZ);
            return hdCompileExternalSettings;
        }
        StringBuilder LIZIZ2 = C25620zW.LIZIZ("key : ", "high_quality_ve_synthesis_settings", " , libraValue : ");
        if (C30581Hy.LJJIFFI(String.class)) {
            json2 = LIZJ;
        } else {
            json2 = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), LIZJ);
        }
        C44847Hit.LIZJ(LIZIZ2, json2, LIZIZ2);
        return LIZJ;
    }
}
