package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Lsf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55645Lsf extends AbstractC65781Prl implements InterfaceC88471Ynr<String, HashMap<String, String>, C76800UCe> {
    public static final C55645Lsf LJLIL = new C55645Lsf();

    public C55645Lsf() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(String str, HashMap<String, String> hashMap) {
        String event = str;
        HashMap<String, String> map = hashMap;
        o.LJIIIZ(event, "event");
        o.LJIIIZ(map, "map");
        FMX.LJIIL(event, map);
        return C76800UCe.LIZ;
    }
}
