package X;

import com.ss.android.ugc.aweme.ug.config.DynamicResource;
import com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.FTm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39030FTm {
    public static void LIZIZ() {
        String str;
        String str2 = C82803Wed.LJLLJ;
        if (str2 == null || str2.length() == 0) {
            File LLIIJLIL = C16880lQ.LLIIJLIL(EF7.LIZIZ());
            if (LLIIJLIL == null || !LLIIJLIL.exists() || LLIIJLIL.getFreeSpace() < 51200 || (str = LLIIJLIL.getPath()) == null) {
                str = "";
            }
            C82803Wed.LJLLJ = str;
            if (str.length() == 0) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C82803Wed.LJLLJ);
            LIZ.append('/');
            LIZ.append("ugcommon");
            LIZ.append('/');
            C82803Wed.LJLLJ = X1D.LIZIZ(LIZ);
        }
    }

    public static C82803Wed LIZ(IDynamicResourceConfig config, DynamicResource dynamicResource) {
        o.LJIIIZ(config, "config");
        C82803Wed c82803Wed = new C82803Wed(config.key(), config.type(), dynamicResource.cdnUrl, config.priority(), dynamicResource.hash, dynamicResource.size, config.enable(), config.fallback());
        c82803Wed.LIZJ();
        return c82803Wed;
    }
}
