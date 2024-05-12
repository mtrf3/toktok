package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* renamed from: X.HhM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44752HhM {
    public static final String LIZ() {
        String json;
        String json2;
        String LIZJ = C31461Li.LIZJ("import_compile_external_settings", "", "getInstance().getStringV…rnalSettings::class.java)");
        String importExternalSettings = InterfaceC44785Hht.LIZJ.importExternalSettings();
        if (C44796Hi4.LIZ() || C44797Hi5.LIZ()) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("key : ", "import_compile_external_settings", " , byteBenchValue : ");
            if (C30581Hy.LJJIFFI(String.class)) {
                json = String.valueOf(importExternalSettings);
            } else {
                json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), importExternalSettings);
            }
            C44847Hit.LIZJ(LIZIZ, json, LIZIZ);
            return importExternalSettings;
        }
        StringBuilder LIZIZ2 = C25620zW.LIZIZ("key : ", "import_compile_external_settings", " , libraValue : ");
        if (C30581Hy.LJJIFFI(String.class)) {
            json2 = LIZJ;
        } else {
            json2 = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), LIZJ);
        }
        C44847Hit.LIZJ(LIZIZ2, json2, LIZIZ2);
        return LIZJ;
    }
}
