package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.7KN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7KN extends AbstractC65781Prl implements InterfaceC88472Yns<C184817Nd, CharSequence> {
    public static final C7KN LJLIL = new C7KN();

    public C7KN() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(C184817Nd c184817Nd) {
        java.util.Map<String, String> map;
        ?? r0;
        C184817Nd it = c184817Nd;
        o.LJIIIZ(it, "it");
        C188727au c188727au = it.LJLJI;
        if (c188727au != null && (map = c188727au.LIZ) != null && (r0 = ((HashMap) map).get("words_position")) != 0) {
            return r0;
        }
        return "";
    }
}
