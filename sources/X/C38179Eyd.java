package X;

import org.json.JSONObject;
import ujb.o;

/* renamed from: X.Eyd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38179Eyd implements InterfaceC38051EwZ {
    public static final C38179Eyd LIZ = new C38179Eyd();

    @Override // X.InterfaceC38051EwZ
    public final C77357UXp LIZ(int i, String str, JSONObject result) {
        if (i == 1 && str != null && o.LJJJLIIL(str, "SANDBOX_PREFIX", false)) {
            kotlin.jvm.internal.o.LJIIIIZZ(result, "result");
            C38136Exw.LIZJ(str, result);
            kotlin.jvm.internal.o.LJIIIIZZ(str.substring(14), "this as java.lang.String).substring(startIndex)");
            return new C77357UXp();
        }
        return null;
    }
}
