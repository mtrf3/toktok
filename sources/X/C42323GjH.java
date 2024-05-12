package X;

import kotlin.jvm.internal.o;

/* renamed from: X.GjH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42323GjH extends AbstractC65781Prl implements InterfaceC88471Ynr<String, java.util.Map<String, String>, C76800UCe> {
    public static final C42323GjH LJLIL = new C42323GjH();

    public C42323GjH() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(String str, java.util.Map<String, String> map) {
        String eventName = str;
        java.util.Map<String, String> map2 = map;
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(map2, "map");
        C42318GjC.LIZIZ(eventName, map2);
        return C76800UCe.LIZ;
    }
}
