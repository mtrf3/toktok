package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.EcN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36799EcN implements InterfaceC36797EcL {
    @Override // X.InterfaceC36797EcL
    public final int LIZ() {
        Object value = C36802EcQ.LIZ.getValue();
        o.LJIIIIZZ(value, "<get-portaitKeva>(...)");
        return ((Keva) value).getInt("shoot_level", -1);
    }

    @Override // X.InterfaceC36797EcL
    public final String type() {
        return "shoot_level";
    }
}
