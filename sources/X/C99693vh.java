package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.ReadStateViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.3vh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99693vh {
    public static final java.util.Map<String, C99703vi> LIZ = new LinkedHashMap();

    public static void LIZ(C98593tv p) {
        o.LJIIIZ(p, "p");
        C115494g5.LIZ();
        String sessionId = p.getSessionId();
        boolean z = true;
        if (sessionId == null || sessionId.length() == 0) {
            return;
        }
        java.util.Map<String, C99703vi> map = LIZ;
        if (map.containsKey(sessionId)) {
            return;
        }
        C99623va c99623va = C99783vq.LIZ;
        boolean z2 = ReadStateViewModel.LJLJL;
        if (p.getChatType() != 3) {
            z = false;
        }
        boolean isReportPage = p.isReportPage();
        c99623va.getClass();
        map.put(sessionId, new C99703vi(C99623va.LIZ(sessionId, z2, z, isReportPage)));
    }
}
