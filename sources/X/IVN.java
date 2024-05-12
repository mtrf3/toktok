package X;

import android.text.TextUtils;
import com.ss.android.ugc.playerkit.radar.IRadarTransmitter;
import java.util.Collections;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IVN {
    public static final IVN LIZ = new IVN();
    public static final java.util.Map<String, C46894Iao> LIZIZ = Collections.synchronizedMap(new C35751E1j(100));
    public static String LIZJ;

    public static C46894Iao LIZ(String str) {
        IRadarTransmitter LJII = C46982IcE.LJII();
        if (LJII == null || !LJII.analyzerEnabled() || TextUtils.isEmpty(str) || o.LJ("null", str)) {
            return null;
        }
        java.util.Map<String, C46894Iao> map = LIZIZ;
        C46894Iao c46894Iao = map.get(str);
        if (c46894Iao != null) {
            return c46894Iao;
        }
        o.LJI(str);
        C46894Iao c46894Iao2 = new C46894Iao(str);
        map.put(str, c46894Iao2);
        return c46894Iao2;
    }

    public static void LIZIZ(String str) {
        IRadarTransmitter LJII = C46982IcE.LJII();
        if (LJII == null) {
            return;
        }
        LJII.tag(str);
    }
}
