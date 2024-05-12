package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Nau, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC59640Nau implements InterfaceC59877Nej {
    public String LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;

    @Override // X.InterfaceC59877Nej
    public void end() {
        this.LIZJ = false;
    }

    public final String LJJIJ() {
        String str = this.LIZ;
        if (str != null) {
            return str;
        }
        o.LJIJI("sessionId");
        throw null;
    }

    @Override // X.InterfaceC59877Nej
    public void LJJ(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = true;
    }
}
