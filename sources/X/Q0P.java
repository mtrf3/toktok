package X;

import com.bytedance.bpea.basics.Cert;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q0P {
    public static final java.util.Map<C36011bB, InterfaceC66311Q0t[]> LIZ = new LinkedHashMap();

    public static InterfaceC66311Q0t[] LIZ(OHW context) {
        String str;
        o.LJIIJ(context, "context");
        java.util.Map<C36011bB, InterfaceC66311Q0t[]> map = LIZ;
        String str2 = context.LJFF;
        Cert cert = context.LIZIZ;
        if (cert != null) {
            str = cert.certType();
        } else {
            str = null;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        InterfaceC66311Q0t[] interfaceC66311Q0tArr = (InterfaceC66311Q0t[]) linkedHashMap.get(new C36011bB(str2, str));
        if (interfaceC66311Q0tArr != null) {
            return interfaceC66311Q0tArr;
        }
        return (InterfaceC66311Q0t[]) linkedHashMap.get(new C36011bB(context.LJFF));
    }
}
