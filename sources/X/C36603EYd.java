package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EYd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36603EYd {
    public static void LIZ(InterfaceC36604EYe interfaceC36604EYe, String url, java.util.Map map, InterfaceC36606EYg callback) {
        o.LJIIJ(url, "url");
        o.LJIIJ(callback, "callback");
        interfaceC36604EYe.LJ(url, map, callback);
    }

    public static void LIZIZ(InterfaceC36604EYe interfaceC36604EYe, String url, java.util.Map map, String str, JSONObject jSONObject, InterfaceC36606EYg callback) {
        o.LJIIJ(url, "url");
        o.LJIIJ(callback, "callback");
        interfaceC36604EYe.LIZIZ(url, map, str, jSONObject, callback);
    }
}
