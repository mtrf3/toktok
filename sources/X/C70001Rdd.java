package X;

import java.util.HashMap;
import kotlin.jvm.internal.AqS5S2201000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Rdd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70001Rdd {
    public static void LIZ(HashMap requestParams, HashMap hashMap, String str, String errorCode, int i) {
        o.LJIIIZ(requestParams, "requestParams");
        o.LJIIIZ(errorCode, "errorCode");
        C70911RsJ c70911RsJ = new C70911RsJ();
        c70911RsJ.LJII(new AqS5S2201000_12(requestParams, (HashMap<String, Object>) hashMap, (HashMap<String, Object>) str, errorCode, (String) i, 2));
        c70911RsJ.LIZJ(false);
    }
}
