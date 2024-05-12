package X;

import Y.ACListenerS28S0100000_8;
import android.view.View;
import java.util.HashMap;

/* renamed from: X.JKp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48991JKp {
    public static final HashMap<Integer, EnumC48990JKo> LIZ = new HashMap<>();

    public static final void LIZ(View view, EnumC48990JKo enumC48990JKo, InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns) {
        C16880lQ.LJIIJ(new ACListenerS28S0100000_8(interfaceC88472Yns, 20), view);
        LIZ.put(Integer.valueOf(view.getId()), enumC48990JKo);
    }
}
