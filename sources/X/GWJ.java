package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GWJ {
    public static final String LIZ(int i) {
        int maxCreatorDuetOrStitchVideoTime = (int) AVExternalServiceImpl.LIZ().configService().shortVideoConfig().maxCreatorDuetOrStitchVideoTime();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "";
                }
                String string = EF7.LIZIZ().getString(R.string.tlz, Integer.valueOf(maxCreatorDuetOrStitchVideoTime / 60000));
                o.LJIIIIZZ(string, "getAppContext()\n        …ECONDS)\n                )");
                return string;
            }
            String string2 = EF7.LIZIZ().getString(R.string.e7o, Integer.valueOf(maxCreatorDuetOrStitchVideoTime / 60000));
            o.LJIIIIZZ(string2, "getAppContext()\n        …ECONDS)\n                )");
            return string2;
        }
        String string3 = EF7.LIZIZ().getString(R.string.e2p, Integer.valueOf(maxCreatorDuetOrStitchVideoTime / 60000));
        o.LJIIIIZZ(string3, "getAppContext()\n        …ECONDS)\n                )");
        return string3;
    }

    public static final boolean LIZIZ(int i) {
        if (i > ((int) AVExternalServiceImpl.LIZ().configService().shortVideoConfig().maxCreatorDuetOrStitchVideoTime())) {
            return true;
        }
        return false;
    }
}
