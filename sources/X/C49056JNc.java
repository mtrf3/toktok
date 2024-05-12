package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JNc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49056JNc implements InterfaceC49057JNd {
    public final List<OSZ<Class<? extends C2K0>, C2K0>> LIZIZ;
    public boolean LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C49056JNc(List<? extends OSZ<? extends Class<? extends C2K0>, ? extends C2K0>> abilities) {
        o.LJIIIZ(abilities, "abilities");
        this.LIZIZ = abilities;
    }

    @Override // X.InterfaceC49057JNd
    public final void LIZ(InterfaceC55235Lm3 vScope, InterfaceC49871Jhj interfaceC49871Jhj, InterfaceC49025JLx renderItem) {
        InterfaceC49055JNb interfaceC49055JNb;
        o.LJIIIZ(vScope, "vScope");
        o.LJIIIZ(renderItem, "renderItem");
        for (OSZ<Class<? extends C2K0>, C2K0> osz : this.LIZIZ) {
            if (!this.LIZJ) {
                C55096Ljo.LJIIJJI(vScope, osz.getSecond(), osz.getFirst(), null);
            }
            C2K0 second = osz.getSecond();
            if ((second instanceof InterfaceC49055JNb) && (interfaceC49055JNb = (InterfaceC49055JNb) second) != null) {
                interfaceC49055JNb.LIZ(interfaceC49871Jhj, renderItem);
            }
        }
        this.LIZJ = true;
    }
}
