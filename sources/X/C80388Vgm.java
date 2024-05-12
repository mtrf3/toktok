package X;

import android.util.Property;

/* renamed from: X.Vgm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80388Vgm extends Property<InterfaceC80386Vgk, C80391Vgp> {
    public static final C80388Vgm LIZ = new C80388Vgm();

    public C80388Vgm() {
        super(C80391Vgp.class, "circularReveal");
    }

    @Override // android.util.Property
    public final C80391Vgp get(InterfaceC80386Vgk interfaceC80386Vgk) {
        return interfaceC80386Vgk.getRevealInfo();
    }

    @Override // android.util.Property
    public final void set(InterfaceC80386Vgk interfaceC80386Vgk, C80391Vgp c80391Vgp) {
        interfaceC80386Vgk.setRevealInfo(c80391Vgp);
    }
}
