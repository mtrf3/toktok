package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* renamed from: X.Hg9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44677Hg9 {
    public static final float LIZ() {
        String json;
        String json2;
        SettingsManager.LIZLLL().getClass();
        Float valueOf = Float.valueOf(SettingsManager.LIZJ("synthetic_video_bitrate", 1.0f));
        Float valueOf2 = Float.valueOf(InterfaceC44780Hho.LIZ.syntheticVideoBitrate());
        if (C44797Hi5.LIZ()) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("key : ", "synthetic_video_bitrate", " , byteBenchValue : ");
            if (C30581Hy.LJJIFFI(Float.class)) {
                json2 = String.valueOf(valueOf2);
            } else {
                json2 = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), valueOf2);
            }
            C44847Hit.LIZJ(LIZIZ, json2, LIZIZ);
            valueOf = valueOf2;
        } else {
            StringBuilder LIZIZ2 = C25620zW.LIZIZ("key : ", "synthetic_video_bitrate", " , libraValue : ");
            if (C30581Hy.LJJIFFI(Float.class)) {
                json = String.valueOf(valueOf);
            } else {
                json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), valueOf);
            }
            C44847Hit.LIZJ(LIZIZ2, json, LIZIZ2);
        }
        return valueOf.floatValue();
    }
}
