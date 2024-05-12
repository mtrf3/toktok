package X;

import com.bytedance.bpea.basics.Cert;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Q0d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66295Q0d {
    public static final java.util.Map<String, InterfaceC66313Q0v> LIZ = new LinkedHashMap();

    public static String LIZ(C36011bB c36011bB, String str, int i) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(c36011bB.hashCode());
        LIZ2.append('_');
        LIZ2.append(str);
        LIZ2.append('_');
        LIZ2.append(i);
        return X1D.LIZIZ(LIZ2);
    }

    public static EnumC66308Q0q LIZIZ(int i, OHW context, String checkerName) {
        String str;
        o.LJIIJ(context, "context");
        o.LJIIJ(checkerName, "checkerName");
        java.util.Map<String, InterfaceC66313Q0v> map = LIZ;
        String str2 = context.LJFF;
        Cert cert = context.LIZIZ;
        if (cert != null) {
            str = cert.certType();
        } else {
            str = null;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        InterfaceC66313Q0v interfaceC66313Q0v = (InterfaceC66313Q0v) linkedHashMap.get(LIZ(new C36011bB(str2, str), checkerName, i));
        if (interfaceC66313Q0v != null) {
            return interfaceC66313Q0v.LIZ(context);
        }
        InterfaceC66313Q0v interfaceC66313Q0v2 = (InterfaceC66313Q0v) linkedHashMap.get(LIZ(new C36011bB(context.LJFF, (String) null), checkerName, i));
        if (interfaceC66313Q0v2 == null) {
            return null;
        }
        return interfaceC66313Q0v2.LIZ(context);
    }
}
