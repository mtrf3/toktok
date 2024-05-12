package X;

import android.util.Property;

/* renamed from: X.Vgi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80384Vgi extends Property<InterfaceC80386Vgk, Integer> {
    public static final C80384Vgi LIZ = new C80384Vgi();

    public C80384Vgi() {
        super(Integer.class, "circularRevealScrimColor");
    }

    @Override // android.util.Property
    public final Integer get(InterfaceC80386Vgk interfaceC80386Vgk) {
        return Integer.valueOf(interfaceC80386Vgk.getCircularRevealScrimColor());
    }

    @Override // android.util.Property
    public final void set(InterfaceC80386Vgk interfaceC80386Vgk, Integer num) {
        interfaceC80386Vgk.setCircularRevealScrimColor(num.intValue());
    }
}
