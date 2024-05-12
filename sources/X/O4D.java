package X;

import java.io.InputStream;

/* loaded from: classes11.dex */
public final class O4D implements InterfaceC61315O4p {
    public final /* synthetic */ O44 LIZ;

    @Override // X.InterfaceC61315O4p
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.InterfaceC61315O4p
    public final InputStream LIZ() {
        Object LIZ;
        try {
            LIZ = this.LIZ.LIZIZ();
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        return (InputStream) LIZ;
    }

    public O4D(O44 o44) {
        this.LIZ = o44;
    }
}
