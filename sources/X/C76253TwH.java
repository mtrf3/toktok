package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.TwH, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76253TwH<T> implements InterfaceC64592gB {
    public static final C76253TwH<T> LJLIL = new C76253TwH<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Throwable t = (Throwable) obj;
        o.LJIIIZ(t, "t");
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        JSONObject jSONObject = new JSONObject();
        C76271TwZ.LJJ(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        C76271TwZ.LJJII(jSONObject, jSONObject2, t);
        C76271TwZ.LJJZZIII(c76271TwZ, "quit_approve_succeed", jSONObject, jSONObject2, jSONObject3, false, 16);
    }
}
