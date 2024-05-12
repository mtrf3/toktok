package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Efm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37010Efm implements InterfaceC37007Efj {
    @Override // X.InterfaceC37007Efj
    public final void LJ(JSONObject jSONObject) {
        System.out.println((Object) "request success");
    }

    @Override // X.InterfaceC37007Efj
    public final void onFailed(Throwable throwable) {
        o.LJIIJ(throwable, "throwable");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("request failed message = ");
        LIZ.append(throwable.getMessage());
        System.out.println((Object) X1D.LIZIZ(LIZ));
    }
}
