package X;

import java.util.LinkedHashMap;

/* renamed from: X.B8w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28302B8w<T> implements InterfaceC64592gB {
    public static final C28302B8w<T> LJLIL = new C28302B8w<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("identity request fail: ");
        LIZ.append(th);
        C0NB.LJIIIZ("EOYQuiz", X1D.LIZIZ(LIZ));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("event_id", "get_identity_fail");
        linkedHashMap.put("msg", th.toString());
        C0K2.LJII(1, "ttlive_eoy_quiz_exp_monitor", C113554cx.LJJLIIIJLLLLLLLZ(linkedHashMap));
    }
}
