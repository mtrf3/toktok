package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* renamed from: X.HhP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44755HhP {
    public static final String LIZ() {
        String json;
        String json2;
        String LIZJ = C31461Li.LIZJ("avtools_1080p_mv_photo_ve_synthesis_settings", "", "getInstance().getStringV…ettings1080p::class.java)");
        String mvSynthesisSettingsFor1080p = InterfaceC44777Hhl.LJII.mvSynthesisSettingsFor1080p();
        if (C44797Hi5.LIZ()) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("key : ", "avtools_1080p_mv_photo_ve_synthesis_settings", " , byteBenchValue : ");
            if (C30581Hy.LJJIFFI(String.class)) {
                json2 = String.valueOf(mvSynthesisSettingsFor1080p);
            } else {
                json2 = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), mvSynthesisSettingsFor1080p);
            }
            C44847Hit.LIZJ(LIZIZ, json2, LIZIZ);
            return mvSynthesisSettingsFor1080p;
        }
        StringBuilder LIZIZ2 = C25620zW.LIZIZ("key : ", "avtools_1080p_mv_photo_ve_synthesis_settings", " , libraValue : ");
        if (C30581Hy.LJJIFFI(String.class)) {
            json = LIZJ;
        } else {
            json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), LIZJ);
        }
        C44847Hit.LIZJ(LIZIZ2, json, LIZIZ2);
        return LIZJ;
    }
}
