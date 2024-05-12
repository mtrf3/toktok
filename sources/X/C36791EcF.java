package X;

import com.google.gson.m;
import com.google.gson.p;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.settingsrequest.SettingsRequestServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.EcF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36791EcF {
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0042 -> B:16:0x0045). Please report as a decompilation issue!!! */
    public static void LIZ(m json) {
        int i;
        p LJJIJL;
        AVExternalServiceImpl.LIZ().configService().avsettingsConfig().updateABTestModel(json);
        o.LJIIIZ(json, "json");
        m LJJIJIL = json.LJJIJIL("data");
        if (LJJIJIL != null) {
            try {
                LJJIJL = LJJIJIL.LJJIJL("tt_publish_enhancement");
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            if (LJJIJL != null) {
                if (LJJIJL.LJLIL instanceof Boolean) {
                    if (LJJIJL.LJFF()) {
                        i = 1;
                    }
                } else {
                    i = LJJIJL.LJIILJJIL();
                }
                C36792EcG.LIZ = i;
            }
            i = 0;
            C36792EcG.LIZ = i;
        }
        SettingsRequestServiceImpl.LJIILLIIL().LIZIZ(json);
    }
}
