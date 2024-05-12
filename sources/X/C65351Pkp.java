package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Pkp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65351Pkp {
    public static String LIZ(InterfaceC65778Pri interfaceC65778Pri) {
        String obj = interfaceC65778Pri.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }

    public static C65338Pkc LIZIZ(C65776Prg c65776Prg, List arguments, boolean z) {
        o.LJIIIZ(arguments, "arguments");
        return new C65338Pkc(c65776Prg, arguments, null, z ? 1 : 0);
    }
}
