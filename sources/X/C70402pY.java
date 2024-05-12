package X;

import android.content.Context;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AqS39S1000000_1;

/* renamed from: X.2pY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70402pY implements A7X {
    public static C70392pX LIZIZ;
    public static final C70402pY LIZ = new C70402pY();
    public static final java.util.Set<String> LIZJ = new LinkedHashSet();

    @Override // X.A7X
    public final void LIZIZ() {
        C70392pX c70392pX = LIZIZ;
        if (c70392pX != null && C70412pZ.LIZ()) {
            C98573tt.LIZ();
            c70392pX.LIZ();
            XKX.LIZLLL((InterfaceC70422pa) c70392pX.LJIIL.getValue(), null, null, new C70102p4(c70392pX, null), 3);
        }
    }

    @Override // X.A7X
    public final void LIZ(Context context, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C70392pX c70392pX = LIZIZ;
        if (c70392pX == null) {
            interfaceC65784Pro.invoke();
        } else {
            XKX.LIZLLL((InterfaceC70422pa) c70392pX.LJIIL.getValue(), null, null, new C70082p2(c70392pX, context, interfaceC65784Pro, null), 3);
        }
    }

    @Override // X.A7X
    public final void LIZJ(String str, String str2, String str3, String str4, String str5, String str6) {
        HH1.LIZ(str, "linkId", str4, "sharerUid", str5, "checksum");
        C70392pX c70392pX = LIZIZ;
        if (c70392pX != null) {
            C79146V4k.LJIJJ(((InterfaceC70422pa) c70392pX.LJIIL.getValue()).getCoroutineContext());
        }
        LIZIZ = null;
        if (str.length() == 0 || str4.length() == 0 || str3 == null || str3.length() == 0 || str5.length() == 0 || str6 == null) {
            return;
        }
        C70392pX c70392pX2 = new C70392pX(str, str4, str2, str3, str5, str6, LIZJ.contains(str), new AqS39S1000000_1(str, 5));
        if (c70392pX2.LJI) {
            c70392pX2.LJIIIZ.setValue(C70022ow.LIZ);
        } else {
            XKX.LIZLLL(C48841JEv.LIZ(c70392pX2.LJIIIIZZ), null, null, new C70382pW(c70392pX2, null), 3);
        }
        LIZIZ = c70392pX2;
    }
}
