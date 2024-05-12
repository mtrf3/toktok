package X;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS3S0200001_2;
import kotlin.jvm.internal.AqS6S0100001_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6oT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C171656oT {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C171646oS.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C171636oR.LJLIL);

    public static void LIZ(Context context, List list, List list2, float f, float f2, InterfaceC171716oZ interfaceC171716oZ) {
        if (list2.isEmpty()) {
            interfaceC171716oZ.LIZ(list);
            return;
        }
        C56K c56k = new C56K();
        c56k.element = f;
        C171566oK c171566oK = (C171566oK) LIZ.getValue();
        AqS133S0200000_2 aqS133S0200000_2 = new AqS133S0200000_2(interfaceC171716oZ, (InterfaceC171716oZ) list, (List<C171726oa>) 154);
        AqS3S0200001_2 aqS3S0200001_2 = new AqS3S0200001_2(f2, interfaceC171716oZ, c56k, 3);
        AqS6S0100001_2 aqS6S0100001_2 = new AqS6S0100001_2(c56k, f2, 2);
        c171566oK.getClass();
        o.LJIIIZ(context, "context");
        c171566oK.LJLILLLLZI = ORZ.LLJILJILJ(list2);
        XKX.LIZLLL(c171566oK, null, null, new C67162kK(list2, c171566oK, context, aqS133S0200000_2, aqS3S0200001_2, aqS6S0100001_2, null), 3);
    }
}
