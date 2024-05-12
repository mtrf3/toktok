package X;

import android.content.Context;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.OjT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62719OjT {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, String popupMsg, Integer num, InterfaceC62720OjU interfaceC62720OjU) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(popupMsg, "popupMsg");
        C26227ARb c26227ARb = new C26227ARb(context);
        c26227ARb.LIZIZ(popupMsg);
        c26227ARb.LJII = false;
        if (num == null || num.intValue() != 0) {
            UC0.LIZJ(c26227ARb, new AqS176S0100000_10(interfaceC62720OjU, 165));
        } else {
            UC0.LIZJ(c26227ARb, new AqS176S0100000_10(interfaceC62720OjU, 164));
        }
        c26227ARb.LJI().LIZLLL();
    }
}
