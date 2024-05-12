package X;

import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NUS {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, C59866NeY c59866NeY) {
        InterfaceC59585Na1 interfaceC59585Na1;
        if (str != null) {
            C59639Nat LIZ2 = F0L.LIZ();
            if (c59866NeY != null) {
                interfaceC59585Na1 = (InterfaceC59585Na1) c59866NeY.LJJIJIIJI(InterfaceC59585Na1.class);
            } else {
                interfaceC59585Na1 = null;
            }
            android.net.Uri parse = UriProtector.parse(str);
            o.LJIIIIZZ(parse, "parse(it)");
            C59639Nat.LJII(LIZ2, interfaceC59585Na1, "filter_scheme", new C61040NxU(parse, "intent_scheme_", null, 4).getFormatData());
        }
    }
}
