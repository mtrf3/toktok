package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.HhO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44754HhO {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ() {
        String json;
        String json2;
        FFL.LJIIIZ().getClass();
        String LJIILJJIL = FFL.LJIILJJIL(31744, "ve_synthesis_settings", "", true);
        o.LJIIIIZZ(LJIILJJIL, "getInstance().getStringV…esisSettings::class.java)");
        String compileExternalSettings = InterfaceC44785Hht.LIZJ.compileExternalSettings();
        if (C44797Hi5.LIZ()) {
            StringBuilder sb = new StringBuilder("key : ve_synthesis_settings , byteBenchValue : ");
            if (C30581Hy.LJJIFFI(String.class)) {
                json2 = String.valueOf(compileExternalSettings);
            } else {
                json2 = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), compileExternalSettings);
            }
            C0DC.LIZLLL(sb, json2);
            return compileExternalSettings;
        }
        StringBuilder sb2 = new StringBuilder("key : ve_synthesis_settings , libraValue : ");
        if (C30581Hy.LJJIFFI(String.class)) {
            json = LJIILJJIL;
        } else {
            json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), LJIILJJIL);
        }
        C0DC.LIZLLL(sb2, json);
        return LJIILJJIL;
    }
}
