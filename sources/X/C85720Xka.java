package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Xka, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85720Xka extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C85720Xka LJLIL = new C85720Xka();

    public C85720Xka() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        java.util.Map<String, String> map = C207998Eh.LIZJ;
        Object obj = ((LinkedHashMap) map).get(HG3.LJIILL().getCurUserId());
        String str = obj;
        if (obj == null) {
            str = "";
        }
        String curUserId = HG3.LJIILL().getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        map.put(curUserId, "");
        return str;
    }
}
