package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.0nW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18180nW {
    public static final C5H3 LIZ = C78996UzQ.LJJIJIIJI(AnonymousClass236.LJLIL);
    public static final C5H3 LIZIZ = C78996UzQ.LJJIJIIJI(AnonymousClass235.LJLIL);

    public static void LIZ(String eventName, JSONObject jSONObject) {
        o.LJIIIZ(eventName, "eventName");
        FQE fqe = (FQE) LIZ.getValue();
        if (fqe != null) {
            fqe.LIZJ(eventName, System.currentTimeMillis(), jSONObject);
        }
    }
}
