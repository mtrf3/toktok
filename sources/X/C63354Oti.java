package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Oti, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63354Oti extends AbstractC65781Prl implements InterfaceC88471Ynr<String, java.util.Map<String, ? extends String>, C76800UCe> {
    public static final C63354Oti LJLIL = new C63354Oti();

    public C63354Oti() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(String str, java.util.Map<String, ? extends String> map) {
        String key = str;
        java.util.Map<String, ? extends String> params = map;
        o.LJIIIZ(key, "key");
        o.LJIIIZ(params, "params");
        C63323OtD c63323OtD = new C63323OtD();
        c63323OtD.LIZJ(key);
        c63323OtD.LIZIZ(params);
        c63323OtD.LIZLLL();
        return C76800UCe.LIZ;
    }
}
