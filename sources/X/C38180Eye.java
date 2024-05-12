package X;

import org.json.JSONObject;
import ujb.o;

/* renamed from: X.Eye, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38180Eye implements InterfaceC38051EwZ {
    public static final C38180Eye LIZ = new C38180Eye();

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
