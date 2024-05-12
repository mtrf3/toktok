package X;

import com.google.gson.Gson;
import kotlin.jvm.internal.o;

/* renamed from: X.0Sg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C07780Sg {
    public static InterfaceC07790Sh LIZ(InterfaceC07790Sh interfaceC07790Sh, InterfaceC07790Sh other) {
        o.LJIIIZ(other, "other");
        if (other == InterfaceC07790Sh.LJJJI) {
            return interfaceC07790Sh;
        }
        return new C1M0(interfaceC07790Sh, other);
    }

    public static StringBuilder LIZIZ(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static void LIZJ(Gson gson, Class cls, Class cls2, Class cls3, Class cls4) {
        gson.LJIIJ(cls);
        gson.LJIIJ(cls2);
        gson.LJIIJ(cls3);
        gson.LJIIJ(cls4);
    }
}
